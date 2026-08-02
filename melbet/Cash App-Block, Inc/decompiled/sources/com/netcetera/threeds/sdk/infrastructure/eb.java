package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class eb extends dd {
    private static int get = 0;
    private static int getSDKVersion = 1;
    private final fs initialize;

    public eb(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.initialize = fsVar;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        eb ebVar = (eb) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = get;
        int i2 = (i & (-56)) | ((~i) & 55);
        int i3 = -(-((i & 55) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSDKVersion = i4 % 128;
        if (i4 % 2 == 0) {
            ebVar.ThreeDS2Service(ebVar.initialize.get(sizeVar));
            int i5 = 79 / 0;
        } else {
            ebVar.ThreeDS2Service(ebVar.initialize.get(sizeVar));
        }
        int i6 = getSDKVersion;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i6 & (-124)) | ((~i6) & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), ~((i6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1), 1, 128);
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        br brVar = new br(context, initialize().ThreeDS2Service());
        writeReplace bhVar = new bh(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bhVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new dz(this));
        writeReplace writereplace = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings((computeIfPresent) brVar);
        getWarnings(bhVar);
        getWarnings(writereplace);
        getWarnings((writeReplace) brVar);
        int i = getSDKVersion;
        int i2 = i & 23;
        get = (i2 + ((i ^ 23) | i2)) % 128;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
