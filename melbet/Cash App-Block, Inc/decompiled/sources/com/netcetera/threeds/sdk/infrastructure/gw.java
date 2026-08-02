package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;

/* loaded from: classes5.dex */
final class gw extends gd {
    private static int ThreeDS2Service = 1;
    private static int initialize;

    private gw(fu fuVar, fs fsVar, fr frVar, fo foVar, fh fhVar, fq fqVar, fl flVar, ft ftVar, fy fyVar, fz fzVar, fw fwVar, fp fpVar, fm fmVar, fv fvVar, fj fjVar, ga gaVar, fn fnVar) {
        super(fuVar, fsVar, frVar, foVar, fhVar, fqVar, flVar, ftVar, fyVar, fzVar, fwVar, fpVar, fmVar, fvVar, fjVar, gaVar, fnVar);
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | (~i2));
        int i5 = ~i3;
        int i6 = ((i4 | (~(i5 | i | i2))) * (-828)) + (i2 * 829) + (i * 829);
        int i7 = i | i2;
        int i8 = ((~i7) * 828) + ((i7 | i5) * (-828)) + i6;
        return i8 != 1 ? i8 != 2 ? getWarnings(objArr) : initialize(objArr) : get(objArr);
    }

    public static /* synthetic */ setIncludeFontPadding ThreeDS2ServiceInstance(me meVar) {
        return (setIncludeFontPadding) ThreeDS2Service(new Object[]{meVar}, -1829446285, 1829446286, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = new setCustomSelectionActionModeCallback();
        int i = ThreeDS2Service;
        int i2 = i & 61;
        int i3 = i | 61;
        int i4 = (i2 & i3) + (i3 | i2);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomselectionactionmodecallback;
        }
        throw null;
    }

    public static /* synthetic */ setCacheColorHint.getWarnings getSDKVersion() {
        return (setCacheColorHint.getWarnings) ThreeDS2Service(new Object[0], 2004992867, -2004992865, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        gw gwVar = new gw(gv.initialize, gz.ThreeDS2ServiceInstance, hf.ThreeDS2ServiceInstance, hh.initialize, hj.ThreeDS2Service, hi.initialize, hg.get, ho.ThreeDS2ServiceInstance, hn.ThreeDS2Service, hm.get, gy.ThreeDS2Service, gx.initialize, ha.getWarnings, hc.ThreeDS2Service, he.get, hb.getWarnings, hd.getWarnings);
        int i = initialize;
        int i2 = i & 15;
        int i3 = ((i ^ 15) | i2) << 1;
        int i4 = -((i | 15) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return gwVar;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ThreeDS2Service = (initialize + 49) % 128;
        setCacheColorHint.getWarnings getwarnings = setCacheColorHint.getWarnings.ThreeDS2ServiceInstance;
        int i = ThreeDS2Service + 57;
        initialize = i % 128;
        if (i % 2 == 0) {
            return getwarnings;
        }
        throw null;
    }
}
