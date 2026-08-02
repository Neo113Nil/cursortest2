package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;

/* loaded from: classes5.dex */
public class gc {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.gc$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] get;
        private static int getWarnings;

        static {
            int[] iArr = new int[setCacheColorHint.getWarnings.values().length];
            get = iArr;
            try {
                iArr[setCacheColorHint.getWarnings.get.ordinal()] = 1;
                int i = ThreeDS2Service;
                getWarnings = ((i & 87) + (i | 87)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[setCacheColorHint.getWarnings.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i2 = ThreeDS2Service;
                getWarnings = ((i2 & 63) + (i2 | 63)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                get[setCacheColorHint.getWarnings.getWarnings.ordinal()] = 3;
                ThreeDS2Service = (getWarnings + 67) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i3 = getWarnings;
            int i4 = (i3 & (-2)) | ((~i3) & 1);
            int i5 = -(-((i3 & 1) << 1));
            ThreeDS2Service = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r5 = (com.netcetera.threeds.sdk.infrastructure.fx) com.netcetera.threeds.sdk.infrastructure.ge.initialize(new java.lang.Object[0], 1969132004, -1969132004, (int) java.lang.System.currentTimeMillis());
        com.netcetera.threeds.sdk.infrastructure.gc.ThreeDS2Service = (com.netcetera.threeds.sdk.infrastructure.gc.getWarnings + 91) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r6 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r6 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        r6 = (com.netcetera.threeds.sdk.infrastructure.fx) com.netcetera.threeds.sdk.infrastructure.gw.ThreeDS2Service(new java.lang.Object[0], -714452470, 714452470, (int) java.lang.System.currentTimeMillis());
        r2 = com.netcetera.threeds.sdk.infrastructure.gc.ThreeDS2Service;
        r3 = r2 & 57;
        r2 = (r2 | 57) & (~r3);
        r3 = -(-(r3 << 1));
        r4 = (r2 ^ r3) + ((r2 & r3) << 1);
        com.netcetera.threeds.sdk.infrastructure.gc.getWarnings = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
    
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        r5 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fx getWarnings(setCacheColorHint.getWarnings getwarnings) {
        int i;
        int i2 = getWarnings;
        int i3 = i2 & 65;
        int i4 = (i2 | 65) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = AnonymousClass5.get[getwarnings.ordinal()];
            int i8 = 5 / 0;
            if (i7 != 1) {
            }
            fx fxVar = (fx) hk.get(new Object[0], -1202688454, 1202688454, (int) System.currentTimeMillis());
            int i9 = ThreeDS2Service;
            i = (((i9 ^ 99) | (i9 & 99)) << 1) - (((~i9) & 99) | (i9 & (-100)));
            getWarnings = i % 128;
            if (i % 2 != 0) {
                return fxVar;
            }
            throw null;
        }
        int i10 = AnonymousClass5.get[getwarnings.ordinal()];
        if (i10 != 1) {
        }
        fx fxVar2 = (fx) hk.get(new Object[0], -1202688454, 1202688454, (int) System.currentTimeMillis());
        int i92 = ThreeDS2Service;
        i = (((i92 ^ 99) | (i92 & 99)) << 1) - (((~i92) & 99) | (i92 & (-100)));
        getWarnings = i % 128;
        if (i % 2 != 0) {
        }
    }
}
