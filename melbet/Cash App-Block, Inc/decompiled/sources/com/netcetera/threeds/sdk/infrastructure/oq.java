package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class oq {
    private on initialize = new on(-1, null, true);

    public static String get(byte[] bArr) {
        return getWarnings().ThreeDS2ServiceInstance(bArr);
    }

    public String ThreeDS2ServiceInstance(String str) {
        return getWarnings(str, "UTF-8");
    }

    public String getWarnings(String str, String str2) {
        return rr.ThreeDS2Service(getWarnings(str), str2);
    }

    public String initialize(String str, String str2) {
        return ThreeDS2ServiceInstance(rr.getWarnings(str, str2));
    }

    public String ThreeDS2ServiceInstance(byte[] bArr) {
        return this.initialize.ThreeDS2Service(bArr);
    }

    public String get(String str) {
        return initialize(str, "UTF-8");
    }

    public byte[] getWarnings(String str) {
        return this.initialize.ThreeDS2ServiceInstance(str);
    }

    private static oq getWarnings() {
        return new oq();
    }
}
