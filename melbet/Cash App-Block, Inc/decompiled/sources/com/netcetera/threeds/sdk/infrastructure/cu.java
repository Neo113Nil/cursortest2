package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class cu extends cz {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int initialize;
    private final fs get;

    public cu(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.get = fsVar;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        cu cuVar = (cu) objArr[0];
        size sizeVar = (size) objArr[1];
        int i4 = initialize;
        ThreeDS2ServiceInitializationCallback = ((i4 ^ 89) + ((i4 & 89) << 1)) % 128;
        cuVar.ThreeDS2Service(cuVar.get.get(sizeVar));
        int i5 = ThreeDS2ServiceInitializationCallback;
        int i6 = i5 & 95;
        initialize = (((i5 | 95) & (~i6)) + (i6 << 1)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bb bbVar = new bb(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bbVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new db(this));
        propertyNames propertynames = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, ThreeDS2ServiceInitializationCallback(context)}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(bbVar);
        ThreeDS2Service(context, propertynames);
        System.identityHashCode(this);
        System.identityHashCode(this);
    }
}
