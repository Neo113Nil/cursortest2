package com.anythink.core.common.v;

import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bz;

/* loaded from: classes.dex */
public final class l {
    public static int a(bv bvVar, bv bvVar2) {
        if (bvVar2 == null) {
            return -1;
        }
        if (bvVar == null) {
            return 1;
        }
        return a(bvVar.R(), p.a(bvVar), bvVar2.R(), p.a(bvVar2));
    }

    public static int b(bv bvVar, bv bvVar2) {
        if (bvVar2 == null) {
            return -1;
        }
        if (bvVar == null) {
            return 1;
        }
        return a(bvVar.R(), p.c(bvVar), bvVar2.R(), p.c(bvVar2));
    }

    public static int a(com.anythink.core.common.h.ad adVar, com.anythink.core.common.h.ad adVar2) {
        if (adVar2 == null) {
            return -1;
        }
        return a(adVar, adVar.getSortPrice(), adVar2, adVar2.getSortPrice());
    }

    public static int a(bz.a aVar, bz.a aVar2) {
        if (aVar2 == null) {
            return -1;
        }
        if (aVar == null) {
            return 1;
        }
        return a(aVar.f13864j, aVar.f13859d, aVar2.f13864j, aVar2.f13859d);
    }

    private static int a(com.anythink.core.common.h.ad adVar, double d2, com.anythink.core.common.h.ad adVar2, double d9) {
        int i;
        int i6;
        int i9;
        int i10;
        if (adVar == null || !adVar.s()) {
            i = 0;
            i6 = 0;
        } else {
            i6 = adVar.t();
            i = adVar.w();
        }
        if (adVar2 == null || !adVar2.s()) {
            i9 = 0;
            i10 = 0;
        } else {
            i10 = adVar2.t();
            i9 = adVar2.w();
        }
        if (i6 == 0 || i10 == 0) {
            if (i6 > 0) {
                return -1;
            }
            if (i10 > 0) {
                return 1;
            }
            if (d2 > d9) {
                return -1;
            }
            return d2 == d9 ? 0 : 1;
        }
        if (i6 != i10) {
            return -(i6 - i10);
        }
        if (i6 == 3) {
            return i - i9;
        }
        if (d2 > d9) {
            return -1;
        }
        return d2 == d9 ? 0 : 1;
    }
}
