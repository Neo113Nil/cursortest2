package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class ee extends dd {
    private static int createTransaction = 1;
    private static int initialize;
    private final fs get;

    public ee(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.get = fsVar;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        ee eeVar = (ee) objArr[0];
        eeVar.ThreeDS2Service(new dt(entrySet.getWarnings));
        int i = createTransaction;
        int i2 = i & 89;
        int i3 = -(-((i ^ 89) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ee eeVar = (ee) objArr[0];
        size sizeVar = (size) objArr[1];
        int identityHashCode = System.identityHashCode(eeVar);
        int i = ~identityHashCode;
        int i2 = ~identityHashCode;
        int i3 = i & (i2 | identityHashCode);
        int i4 = 819971699 & i3;
        int i5 = (i3 | 819971699) & (~i4);
        int i6 = ~((i5 & i4) | (i5 ^ i4));
        int i7 = (i6 & 274613283) | ((-274613284) & i6) | ((~i6) & 274613283);
        int i8 = ~(((-819971700) ^ identityHashCode) | ((-819971700) & identityHashCode));
        int i9 = i7 ^ i8;
        int i10 = i7 & i8;
        int i11 = ((i10 & i9) | (i9 ^ i10)) * (-338);
        int i12 = 2058617841 & i11;
        int i13 = -(-(i11 | 2058617841));
        int i14 = (((i12 | i13) << 1) - (i13 ^ i12)) - 834623232;
        int i15 = ~(((~i2) & 819971699) | ((-819971700) & i2) | (i2 & 819971699));
        int i16 = (-545358417) ^ identityHashCode;
        int i17 = identityHashCode & (-545358417);
        int i18 = (i17 & i16) | (i16 ^ i17);
        int i19 = (i18 | (~i18)) & (~i18);
        int i20 = i15 ^ i19;
        int i21 = i19 & i15;
        int i22 = -(~(((i21 & i20) | (i20 ^ i21)) * 338));
        int i23 = ((i14 ^ i22) + ((i22 & i14) << 1)) - 1;
        int identityHashCode2 = System.identityHashCode(eeVar);
        int i24 = ~identityHashCode2;
        int i25 = ~identityHashCode2;
        int i26 = i24 & (i25 | identityHashCode2);
        int i27 = (-1690001630) ^ i26;
        int i28 = i26 & (-1690001630);
        int i29 = ((i28 & i27) | (i27 ^ i28)) * (-757);
        int i30 = 1366141748 & i29;
        int i31 = i30 + ((i29 ^ 1366141748) | i30);
        int i32 = ((-3874837) & i25) | (3874836 & identityHashCode2);
        int i33 = (-3874837) & identityHashCode2;
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = ((i34 | (~i34)) & (~i34)) * 1514;
        int i36 = i31 & i35;
        int i37 = (i35 ^ i31) | i36;
        int i38 = (i36 & i37) + (i37 | i36);
        int i39 = ~(((~i25) & (-8072503)) | (8072502 & i25) | (i25 & (-8072503)));
        int i40 = (i39 & 4197666) | (4197666 ^ i39);
        int i41 = ~((identityHashCode2 & (-1686126794)) | ((-1686126794) ^ identityHashCode2));
        int i42 = i40 ^ i41;
        int i43 = i41 & i40;
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * 757));
        if (i23 > (((~i44) & i38) | ((~i38) & i44)) + ((i44 & i38) << 1)) {
            eeVar.ThreeDS2Service(eeVar.get.get(sizeVar));
            return null;
        }
        eeVar.ThreeDS2Service(eeVar.get.get(sizeVar));
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        bo boVar = bo.get(context, initialize().ThreeDS2ServiceInstance());
        contains containsVar = contains.get(context, boVar, initialize());
        containsVar.getWarnings(new ef(this));
        contains ThreeDS2Service = contains.ThreeDS2Service(context, initialize());
        ThreeDS2Service.getWarnings(new ed(this));
        writeReplace writereplace = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, ThreeDS2Service}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings(boVar);
        getWarnings(writereplace);
        int i = createTransaction;
        initialize = ((((i ^ 53) | (i & 53)) << 1) - (((~i) & 53) | (i & (-54)))) % 128;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ((i2 | i3) * 521) + (((~(i4 | i2)) | i) * (-1042)) + (i2 * (-520)) + (i * 522);
        int i6 = ~i;
        return (((~((i | i4) | i2)) | ((~(i3 | i6)) | (~((~i2) | i6)))) * 521) + i5 != 1 ? initialize(objArr) : getWarnings(objArr);
    }
}
