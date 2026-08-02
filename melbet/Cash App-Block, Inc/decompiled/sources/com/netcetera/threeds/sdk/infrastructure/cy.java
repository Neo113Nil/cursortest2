package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class cy extends dd {
    private static int cleanup = 1;
    private static int initialize;
    private final fs get;

    public cy(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.get = fsVar;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        cy cyVar = (cy) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = initialize;
        int i2 = ((i & 29) - (~(i | 29))) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            cyVar.ThreeDS2Service(cyVar.get.get(sizeVar));
            throw null;
        }
        cyVar.ThreeDS2Service(cyVar.get.get(sizeVar));
        int i3 = initialize;
        int i4 = (i3 & (-40)) | ((~i3) & 39);
        int i5 = (i3 & 39) << 1;
        cleanup = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bb bbVar = new bb(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bbVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new cv(this));
        propertyNames propertynames = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(bbVar);
        getWarnings(propertynames);
        int i = initialize;
        int i2 = ((i ^ 25) | (i & 25)) << 1;
        int i3 = -(((~i) & 25) | (i & (-26)));
        cleanup = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }
}
