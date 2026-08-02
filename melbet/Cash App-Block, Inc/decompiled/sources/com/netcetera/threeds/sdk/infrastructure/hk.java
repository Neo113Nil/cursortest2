package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;

/* loaded from: classes5.dex */
final class hk extends gd {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;

    private hk(fu fuVar, fs fsVar, fr frVar, fo foVar, fh fhVar, fq fqVar, fl flVar, ft ftVar, fy fyVar, fz fzVar, fw fwVar, fp fpVar, fm fmVar, fv fvVar, fj fjVar, ga gaVar, fn fnVar) {
        super(fuVar, fsVar, frVar, foVar, fhVar, fqVar, flVar, ftVar, fyVar, fzVar, fwVar, fpVar, fmVar, fvVar, fjVar, gaVar, fnVar);
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 47) + (i | 47);
        get = i2 % 128;
        int i3 = i2 % 2;
        setCacheColorHint.getWarnings getwarnings = setCacheColorHint.getWarnings.get;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 & 55;
        int i7 = -(-((i5 ^ 55) | i6));
        get = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        return getwarnings;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ((i | i4) * (-757)) + (i2 * (-756)) + (i * 758);
        int i6 = ~i2;
        if ((((~(i | i2 | i3)) | (~(i4 | i6)) | (~((~i) | i6))) * 757) + ((~(i6 | i | i3)) * 1514) + i5 == 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        hk hkVar = new hk(hl.ThreeDS2ServiceInstance, hq.initialize, hx.getWarnings, hy.ThreeDS2Service, id.getWarnings, ib.initialize, ia.ThreeDS2Service, ic.initialize, hz.getWarnings, ie.initialize, ht.ThreeDS2Service, hp.ThreeDS2ServiceInstance, hs.ThreeDS2ServiceInstance, hr.initialize, hv.get, hu.initialize, hw.initialize);
        int i7 = ThreeDS2ServiceInstance;
        int i8 = i7 ^ 113;
        int i9 = (i7 & 113) << 1;
        get = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        return hkVar;
    }

    public static /* synthetic */ setCacheColorHint.getWarnings getSDKVersion() {
        return (setCacheColorHint.getWarnings) get(new Object[0], -228785739, 228785740, (int) System.currentTimeMillis());
    }
}
