package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
final class ge extends gd {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;

    private ge(fu fuVar, fs fsVar, fr frVar, fo foVar, fh fhVar, fq fqVar, fl flVar, ft ftVar, fy fyVar, fz fzVar, fw fwVar, fp fpVar, fm fmVar, fv fvVar, fj fjVar, ga gaVar, fn fnVar) {
        super(fuVar, fsVar, frVar, foVar, fhVar, fqVar, flVar, ftVar, fyVar, fzVar, fwVar, fpVar, fmVar, fvVar, fjVar, gaVar, fnVar);
    }

    public static /* synthetic */ setIncludeFontPadding ThreeDS2Service(me meVar) {
        return (setIncludeFontPadding) initialize(new Object[]{meVar}, -1103020991, 1103020993, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ setCacheColorHint.getWarnings getSDKInfo() {
        return (setCacheColorHint.getWarnings) initialize(new Object[0], -1479793777, 1479793778, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i8))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~(i6 | i3)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((i7 | (~(i5 | i8))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (i2 * (-167)) + (i * (-167));
        if (i9 == 1) {
            return initialize(objArr);
        }
        if (i9 != 2) {
            ge geVar = new ge(gf.ThreeDS2Service, gb.ThreeDS2ServiceInstance, gl.ThreeDS2Service, gp.initialize, go.get, gq.ThreeDS2Service, gr.initialize, gs.getWarnings, gt.initialize, gu.get, gi.ThreeDS2Service, gg.get, gj.getWarnings, gh.getWarnings, gk.getWarnings, gn.ThreeDS2ServiceInstance, gm.initialize);
            int i10 = ThreeDS2ServiceInstance;
            get = ((i10 & 45) + (i10 | 45)) % 128;
            return geVar;
        }
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = new setCustomSelectionActionModeCallback();
        int i11 = ThreeDS2ServiceInstance;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i11 ^ 89, ~((i11 & 89) << 1), 1, 128);
        return setcustomselectionactionmodecallback;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ThreeDS2ServiceInstance = (get + 125) % 128;
        setCacheColorHint.getWarnings getwarnings = setCacheColorHint.getWarnings.getWarnings;
        int i = get;
        int i2 = i & 45;
        int i3 = ((((i ^ 45) | i2) << 1) - (~(-((i | 45) & (~i2))))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return getwarnings;
    }
}
