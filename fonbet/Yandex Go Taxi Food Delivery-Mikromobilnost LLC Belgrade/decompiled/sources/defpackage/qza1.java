package defpackage;

import com.google.android.gms.common.Feature;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class qza1 {
    public static mgv a;

    public static final void a(String str, String str2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(9637223);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(str2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ydb1.a(null, null, wwg.S(-1196283080, true, new i0(str, str2, 5), btsVar), null, null, null, null, false, btsVar, 384, 251);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str2, i, 12);
        }
    }

    public static final void b(boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-356763942);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            crb1.c(null, wwg.S(1482028843, true, new rhi0(3, tlsVar), btsVar), null, wwg.S(1326048301, true, new vxd(z, 8), btsVar), null, wwg.S(1170067759, true, new bi0(z, tlsVar, i3), btsVar), null, btsVar, 199728, 85);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pxl0(z, i, i3, tlsVar);
        }
    }

    public static boolean c(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Object[] objArr, Feature feature) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!ooc.m(objArr[i], feature)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final mgv e() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("HashOutlineSmRegular", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 uq90Var = new uq90();
        uq90Var.j(8.802f, 10.964f);
        uq90Var.f(5.877f);
        uq90Var.h(5.058f, 15.0f);
        uq90Var.f(3.498f);
        uq90Var.h(4.317f, 10.964f);
        uq90Var.f(2.172f);
        uq90Var.o(9.599f);
        uq90Var.f(4.609f);
        uq90Var.h(5.331f, 6.05f);
        uq90Var.f(2.698f);
        uq90Var.o(4.685f);
        uq90Var.f(5.604f);
        uq90Var.h(6.364f, 1.019f);
        uq90Var.f(7.924f);
        uq90Var.h(7.164f, 4.685f);
        uq90Var.f(10.089f);
        uq90Var.h(10.849f, 1.019f);
        uq90Var.f(12.409f);
        uq90Var.h(11.649f, 4.685f);
        uq90Var.f(13.833f);
        uq90Var.o(6.05f);
        uq90Var.f(11.376f);
        uq90Var.h(10.654f, 9.599f);
        uq90Var.f(13.306f);
        uq90Var.o(10.964f);
        uq90Var.f(10.362f);
        uq90Var.h(9.543f, 15.0f);
        uq90Var.f(7.983f);
        uq90Var.h(8.802f, 10.964f);
        uq90Var.c();
        uq90Var.j(9.094f, 9.599f);
        uq90Var.h(9.816f, 6.05f);
        uq90Var.f(6.891f);
        uq90Var.h(6.169f, 9.599f);
        uq90Var.f(9.094f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }
}
