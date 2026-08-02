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
        return a(aVar.f14650j, aVar.f14645d, aVar2.f14650j, aVar2.f14645d);
    }

    private static int a(com.anythink.core.common.h.ad adVar, double d9, com.anythink.core.common.h.ad adVar2, double d10) {
        int i;
        int i4;
        int i6;
        int i9;
        if (adVar == null || !adVar.s()) {
            i = 0;
            i4 = 0;
        } else {
            i4 = adVar.t();
            i = adVar.w();
        }
        if (adVar2 == null || !adVar2.s()) {
            i6 = 0;
            i9 = 0;
        } else {
            i9 = adVar2.t();
            i6 = adVar2.w();
        }
        if (i4 == 0 || i9 == 0) {
            if (i4 > 0) {
                return -1;
            }
            if (i9 > 0) {
                return 1;
            }
            if (d9 > d10) {
                return -1;
            }
            return d9 == d10 ? 0 : 1;
        }
        if (i4 != i9) {
            return -(i4 - i9);
        }
        if (i4 == 3) {
            return i - i6;
        }
        if (d9 > d10) {
            return -1;
        }
        return d9 == d10 ? 0 : 1;
    }
}
