package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class ec extends cz {
    private static int createTransaction = 1;
    private static int get;
    private final fs initialize;

    public ec(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.initialize = fsVar;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ec ecVar = (ec) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = createTransaction;
        int i2 = ((i ^ 41) | (i & 41)) << 1;
        int i3 = -(((~i) & 41) | (i & (-42)));
        int i4 = (i2 & i3) + (i2 | i3);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            ecVar.ThreeDS2Service(ecVar.initialize.get(sizeVar));
            return null;
        }
        ecVar.ThreeDS2Service(ecVar.initialize.get(sizeVar));
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bh bhVar = new bh(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bhVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new eg(this));
        propertyNames propertynames = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, ThreeDS2ServiceInitializationCallback(context)}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(bhVar);
        ThreeDS2Service(context, propertynames);
        int i = get;
        int i2 = ((i & (-26)) | ((~i) & 25)) + ((i & 25) << 1);
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }
}
