package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class ci extends by {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final ni get;

    public ci(cd cdVar, ni niVar) {
        super(cdVar);
        this.get = niVar;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        ju juVar = (ju) objArr[0];
        setMaxLines setmaxlines = (setMaxLines) objArr[1];
        fx fxVar = (fx) objArr[2];
        ci ciVar = new ci(cd.ThreeDS2ServiceInstance(ce.ThreeDS2ServiceInstance(juVar, setmaxlines, fxVar), (com.netcetera.threeds.sdk.api.ui.ProgressView) objArr[3], juVar, fxVar), ni.initialize());
        int i = getWarnings;
        int i2 = (i | 115) << 1;
        int i3 = -(i ^ 115);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            return ciVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3.get.bU_(ThreeDS2Service().bO_());
        r3 = com.netcetera.threeds.sdk.infrastructure.ci.getWarnings;
        r4 = r3 & 73;
        r3 = (r3 | 73) & (~r4);
        r4 = -(-(r4 << 1));
        com.netcetera.threeds.sdk.infrastructure.ci.ThreeDS2Service = ((r3 & r4) + (r3 | r4)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r4 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r4 == false) goto L9;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initialize(boolean z) {
        int i = ThreeDS2Service;
        int i2 = i & 87;
        int i3 = (((i ^ 87) | i2) << 1) - ((i | 87) & (~i2));
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            super.initialize(z);
            int i4 = 63 / 0;
        } else {
            super.initialize(z);
        }
        int i5 = getWarnings + 105;
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static ci getWarnings(ju juVar, setMaxLines setmaxlines, fx fxVar, com.netcetera.threeds.sdk.api.ui.ProgressView progressView) {
        return (ci) get(new Object[]{juVar, setmaxlines, fxVar, progressView}, 802731800, -802731800, (int) System.currentTimeMillis());
    }
}
