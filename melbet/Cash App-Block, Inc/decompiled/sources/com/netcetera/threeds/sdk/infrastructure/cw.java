package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class cw extends dd {
    private static int createTransaction = 1;
    private static int get;
    private final fs initialize;

    public cw(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.initialize = fsVar;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        cw cwVar = (cw) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = get;
        int i2 = (i | 53) << 1;
        int i3 = -(((~i) & 53) | (i & (-54)));
        int i4 = (i2 & i3) + (i3 | i2);
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            cwVar.ThreeDS2Service(cwVar.initialize.get(sizeVar));
            int i5 = 1 / 0;
        } else {
            cwVar.ThreeDS2Service(cwVar.initialize.get(sizeVar));
        }
        int i6 = get;
        int i7 = ((i6 ^ 111) | (i6 & 111)) << 1;
        int i8 = -(((~i6) & 111) | (i6 & (-112)));
        createTransaction = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        writeReplace bbVar = new bb(context, initialize().ThreeDS2Service());
        br brVar = new br(context, initialize().ThreeDS2Service());
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, bbVar, initialize()}, -1565204224, 1565204224, (int) System.currentTimeMillis());
        containsVar.getWarnings(new cx(this));
        writeReplace writereplace = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings((computeIfPresent) brVar);
        getWarnings(bbVar);
        getWarnings(writereplace);
        getWarnings((writeReplace) brVar);
        int i = createTransaction;
        int i2 = i ^ 13;
        int i3 = (i & 13) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
