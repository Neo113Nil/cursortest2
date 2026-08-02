package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class dax extends mcx {
    private static final dax zzb;
    private ucx zzd = gex.e;

    static {
        dax daxVar = new dax();
        zzb = daxVar;
        mcx.k(dax.class, daxVar);
    }

    public static cax n() {
        return (cax) zzb.f();
    }

    public static void o(dax daxVar, Iterable iterable) {
        ucx ucxVar = daxVar.zzd;
        if (!((oax) ucxVar).a) {
            int size = ucxVar.size();
            daxVar.zzd = ucxVar.c(size + size);
        }
        List list = daxVar.zzd;
        Charset charset = xcx.a;
        iterable.getClass();
        if (iterable instanceof ldx) {
            List d = ((ldx) iterable).d();
            if (list != null) {
                l1j.f();
                return;
            }
            list.size();
            Iterator it = d.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof gbx) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                gbx.q(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof eex) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size2);
            }
            if (list instanceof gex) {
                gex gexVar = (gex) list;
                int i = gexVar.c + size2;
                int length = gexVar.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = v3w.c(length, 3, 2, 1, 10);
                        }
                        gexVar.b = Arrays.copyOf(gexVar.b, length);
                    } else {
                        gexVar.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size3 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    ecx.b(list, size3);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size4 = list2.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                ecx.b(list, size3);
                throw null;
            }
            list.add(obj2);
        }
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", aax.class});
        }
        if (i2 == 3) {
            return new dax();
        }
        if (i2 == 4) {
            return new cax(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
