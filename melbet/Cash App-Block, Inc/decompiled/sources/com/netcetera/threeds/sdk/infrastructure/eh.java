package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class eh extends dd {
    private static int cleanup = 1;
    private static int initialize;
    private final fs get;

    public eh(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.get = fsVar;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        eh ehVar = (eh) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = (-2) - ((cleanup + 120) ^ (-1));
        initialize = i % 128;
        if (i % 2 == 0) {
            ehVar.ThreeDS2Service(ehVar.get.get(sizeVar));
            return null;
        }
        ehVar.ThreeDS2Service(ehVar.get.get(sizeVar));
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((~i2) * (-783)) + (i2 * (-782)) + (i * 784);
        int i5 = ~i;
        int i6 = ~i3;
        if (((i5 | (~(i2 | i6))) * 783) + ((~(i5 | i6 | i2)) * (-783)) + i4 == 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        eh ehVar = (eh) objArr[0];
        ehVar.ThreeDS2Service(new dt(entrySet.getWarnings));
        initialize = (cleanup + 15) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bo boVar = bo.get(context, initialize().ThreeDS2ServiceInstance());
        br brVar = new br(context, initialize().ThreeDS2Service());
        contains containsVar = contains.get(context, boVar, initialize());
        containsVar.getWarnings(new ej(this));
        contains ThreeDS2Service = contains.ThreeDS2Service(context, initialize());
        ThreeDS2Service.getWarnings(new el(this));
        writeReplace writereplace = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, ThreeDS2Service}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings((computeIfPresent) brVar);
        getWarnings(boVar);
        getWarnings(writereplace);
        getWarnings((writeReplace) brVar);
        int i = initialize;
        int i2 = ((i | 11) << 1) - (i ^ 11);
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
