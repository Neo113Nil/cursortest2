package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.arf;
import defpackage.bqi;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y4h;
import defpackage.ydr;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.impl.TvDiscoveryTrackerImpl;

/* loaded from: classes5.dex */
public final class Gb {

    @NotNull
    public final InterfaceC1305z0 a;

    @NotNull
    public final Q2 b;

    @NotNull
    public final F4 c;

    @NotNull
    public final InterfaceC1192q7 d;

    @NotNull
    public final TvDiscoveryTrackerImpl e;

    @NotNull
    public final InterfaceC1311z6 f;

    @NotNull
    public final bqi g;

    @NotNull
    public final arf h;

    public Gb(@NotNull InterfaceC1305z0 interfaceC1305z0, @NotNull Q2 q2, @NotNull F4 f4, @NotNull InterfaceC1192q7 interfaceC1192q7, @NotNull TvDiscoveryTrackerImpl tvDiscoveryTrackerImpl, @NotNull InterfaceC1311z6 interfaceC1311z6) {
        interfaceC1305z0.getClass();
        q2.getClass();
        f4.getClass();
        interfaceC1192q7.getClass();
        tvDiscoveryTrackerImpl.getClass();
        interfaceC1311z6.getClass();
        this.a = interfaceC1305z0;
        this.b = q2;
        this.c = f4;
        this.d = interfaceC1192q7;
        this.e = tvDiscoveryTrackerImpl;
        this.f = interfaceC1311z6;
        this.g = ydr.a(c5b.a);
        this.h = btf.b(new Bb(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        C1303yb c1303yb;
        int i;
        Gb gb;
        F4.b bVar;
        Object obj;
        if (cg6Var instanceof C1303yb) {
            c1303yb = (C1303yb) cg6Var;
            int i2 = c1303yb.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1303yb.d = i2 - Integer.MIN_VALUE;
                Object obj2 = c1303yb.b;
                nm6 nm6Var = nm6.a;
                i = c1303yb.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    y4h b = this.b.b();
                    C1316zb c1316zb = new C1316zb(this, str, null);
                    c1303yb.a = this;
                    c1303yb.d = 1;
                    obj2 = x97.V(b, c1316zb, c1303yb);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    gb = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gb = c1303yb.a;
                    qgg.h0(obj2);
                }
                bVar = (F4.b) obj2;
                if (bVar != null) {
                    Iterator<T> it = gb.d.b().iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        List<InetAddress> list = ((C1260v7) obj).b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.d(((InetAddress) it2.next()).getHostAddress(), bVar.b.getHostAddress())) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    C1260v7 c1260v7 = (C1260v7) obj;
                    if (c1260v7 != null) {
                        return c1260v7.a;
                    }
                }
                return null;
            }
        }
        c1303yb = new C1303yb(this, cg6Var);
        Object obj22 = c1303yb.b;
        nm6 nm6Var2 = nm6.a;
        i = c1303yb.d;
        if (i != 0) {
        }
        bVar = (F4.b) obj22;
        if (bVar != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Gb gb, Gb gb2, H3.a aVar, Set set, cg6 cg6Var) {
        Ab ab;
        int i;
        String str;
        gb.getClass();
        if (cg6Var instanceof Ab) {
            ab = (Ab) cg6Var;
            int i2 = ab.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ab.e = i2 - Integer.MIN_VALUE;
                Object obj = ab.c;
                Object obj2 = nm6.a;
                i = ab.e;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = aVar.b;
                    String str3 = aVar.a;
                    if (str3 != null && str2 != null) {
                        set.add(str2);
                        return aVar;
                    }
                    if (str3 == null) {
                        if (str2 != null) {
                            return aVar;
                        }
                        return null;
                    }
                    ab.a = aVar;
                    ab.b = set;
                    ab.e = 1;
                    obj = gb2.a(str3, ab);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = ab.b;
                    aVar = ab.a;
                    qgg.h0(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return aVar;
                }
                set.add(str);
                String str4 = aVar.a;
                String str5 = aVar.c;
                String str6 = aVar.d;
                boolean z = aVar.e;
                str5.getClass();
                str6.getClass();
                return new H3.a(str4, str, str5, str6, z);
            }
        }
        ab = new Ab(gb, cg6Var);
        Object obj3 = ab.c;
        Object obj22 = nm6.a;
        i = ab.e;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }
}
