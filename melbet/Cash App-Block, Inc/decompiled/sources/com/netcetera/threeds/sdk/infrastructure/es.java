package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class es {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    public static final int ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    public static final int get;
    public static final int getSDKInfo;
    public static final int getSDKVersion;
    public static final int initialize = ((Integer) nj.ThreeDS2Service(new Object[]{4}, 256526108, -256526107, 4)).intValue();
    public static final int ThreeDS2Service = ((Integer) nj.ThreeDS2Service(new Object[]{8}, 256526108, -256526107, 8)).intValue();
    public static final int getWarnings = ((Integer) nj.ThreeDS2Service(new Object[]{16}, 256526108, -256526107, 16)).intValue();

    static {
        int intValue = ((Integer) nj.ThreeDS2Service(new Object[]{24}, 256526108, -256526107, 24)).intValue();
        get = intValue;
        ThreeDS2ServiceInstance = ((Integer) nj.ThreeDS2Service(new Object[]{32}, 256526108, -256526107, 32)).intValue();
        getSDKInfo = ((Integer) nj.ThreeDS2Service(new Object[]{48}, 256526108, -256526107, 48)).intValue();
        getSDKVersion = intValue;
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (((i | 37) << 1) - (~(-(i ^ 37)))) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
