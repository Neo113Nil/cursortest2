package com.gamericefishpro.space.o4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.q4.o0;
import com.gamericefishpro.space.q4.p0;
import com.gamericefishpro.space.q4.q;
import com.gamericefishpro.space.q4.r;
import com.gamericefishpro.space.q4.r0;
import com.gamericefishpro.space.q4.s;
import com.gamericefishpro.space.q4.s0;
import com.gamericefishpro.space.q4.t;
import com.gamericefishpro.space.q4.u;
import com.gamericefishpro.space.q4.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends s {
    private static final g DEFAULT_INSTANCE;
    private static volatile o0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private t strings_ = r0.v;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        s.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        t tVar = gVar.strings_;
        if (!((com.gamericefishpro.space.q4.b) tVar).d) {
            r0 r0Var = (r0) tVar;
            int i = r0Var.i;
            gVar.strings_ = r0Var.d(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = u.a;
        if (iterable instanceof y) {
            List listK = ((y) iterable).k();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((r0) randomAccess).getClass();
            Iterator it = listK.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof com.gamericefishpro.space.q4.f) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                com.gamericefishpro.space.q4.f.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof p0) {
            ((com.gamericefishpro.space.q4.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((r0) randomAccess).i);
        }
        r0 r0Var2 = (r0) randomAccess;
        int i2 = r0Var2.i;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (r0Var2.i - i2) + " is null.";
                for (int i3 = r0Var2.i - 1; i3 >= i2; i3--) {
                    r0Var2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            r0Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((q) DEFAULT_INSTANCE.c(5));
    }

    @Override // com.gamericefishpro.space.q4.s
    public final Object c(int i) {
        o0 rVar;
        switch (com.gamericefishpro.space.i3.e.b(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new s0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case i.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                o0 o0Var = PARSER;
                if (o0Var != null) {
                    return o0Var;
                }
                synchronized (g.class) {
                    try {
                        rVar = PARSER;
                        if (rVar == null) {
                            rVar = new r();
                            PARSER = rVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final t n() {
        return this.strings_;
    }
}
