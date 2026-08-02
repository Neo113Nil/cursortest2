package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class em extends cz {
    private static int cleanup = 1;
    private static int get;
    private final fs initialize;

    public em(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.initialize = fsVar;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i4 | i5);
        int i7 = ~i;
        if ((((~(i | i3)) | (~(i4 | i3)) | (~(i7 | i5))) * 959) + ((~(i2 | i)) * (-959)) + ((i6 | (~(i7 | i3)) | (~(i5 | i))) * 959) + (i2 * (-958)) + (i * (-958)) != 1) {
            return initialize(objArr);
        }
        em emVar = (em) objArr[0];
        emVar.ThreeDS2Service(new dt(entrySet.getWarnings));
        int i8 = get;
        int i9 = i8 & 15;
        cleanup = (i9 + ((i8 ^ 15) | i9)) % 128;
        return null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        em emVar = (em) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = get + 113;
        cleanup = i % 128;
        if (i % 2 == 0) {
            emVar.ThreeDS2Service(emVar.initialize.get(sizeVar));
            throw null;
        }
        emVar.ThreeDS2Service(emVar.initialize.get(sizeVar));
        int i2 = get;
        cleanup = (((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        an anVar = (an) an.ThreeDS2Service(new Object[]{context, initialize().ThreeDS2Service(), initialize().ThreeDS2ServiceInstance()}, -1112037314, 1112037314, (int) System.currentTimeMillis());
        contains containsVar = contains.get(context, anVar, initialize());
        containsVar.getWarnings(new ei(this));
        contains ThreeDS2Service = contains.ThreeDS2Service(context, initialize());
        ThreeDS2Service.getWarnings(new ek(this));
        propertyNames propertynames = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, ThreeDS2Service, ThreeDS2ServiceInitializationCallback(context)}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(anVar);
        ThreeDS2Service(context, propertynames);
        int i = cleanup;
        int i2 = i ^ 81;
        int i3 = (((i & 81) | i2) << 1) - i2;
        get = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public boolean getWarnings() {
        int i = cleanup;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 63) << 1, ~(-(((~i) & 63) | (i & (-64)))), 1, 128);
        return false;
    }
}
