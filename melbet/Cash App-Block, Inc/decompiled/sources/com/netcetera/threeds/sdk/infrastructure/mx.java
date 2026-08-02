package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class mx {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    public static boolean get(String str) {
        return ((Boolean) ThreeDS2Service(new Object[]{str}, -327252871, 327252871, (int) System.currentTimeMillis())).booleanValue();
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        boolean z = false;
        String str = (String) objArr[0];
        int i = getWarnings;
        int i2 = i & 29;
        int i3 = i | 29;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                Class.forName(str);
            } else {
                Class.forName(str);
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (ClassNotFoundException | LinkageError unused) {
            return Boolean.FALSE;
        }
    }
}
