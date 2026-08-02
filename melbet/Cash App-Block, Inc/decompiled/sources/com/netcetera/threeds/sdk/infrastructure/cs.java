package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class cs extends cz {
    private static int get = 1;
    private static int initialize;

    public cs(Context context, ju juVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        cs csVar = (cs) objArr[0];
        csVar.ThreeDS2Service(new ct());
        int i4 = initialize + 4;
        get = ((i4 ^ (-1)) + (i4 << 1)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        contains initialize2 = contains.initialize(context, initialize());
        initialize2.getWarnings(new cq(this));
        ThreeDS2Service(context, (propertyNames) propertyNames.get(new Object[]{context, new contains[]{initialize2, ThreeDS2ServiceInitializationCallback(context)}}, -435122388, 435122389, (int) System.currentTimeMillis()));
        int i = get;
        int i2 = i ^ 75;
        int i3 = -(-((i & 75) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
