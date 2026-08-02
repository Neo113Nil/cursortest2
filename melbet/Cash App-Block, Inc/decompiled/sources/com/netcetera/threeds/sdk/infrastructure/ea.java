package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class ea extends dd {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final fs get;

    public ea(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.get = fsVar;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ea eaVar = (ea) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = getSDKInfo + 125;
        initialize = i % 128;
        if (i % 2 == 0) {
            eaVar.ThreeDS2Service(eaVar.get.get(sizeVar));
            return null;
        }
        eaVar.ThreeDS2Service(eaVar.get.get(sizeVar));
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bh bhVar = new bh(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bhVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new dy(this));
        propertyNames propertynames = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(bhVar);
        getWarnings(propertynames);
        int i = initialize;
        int i2 = (((i ^ 109) | (i & 109)) << 1) - (((~i) & 109) | (i & (-110)));
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
