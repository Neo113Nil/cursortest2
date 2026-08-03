package com.onesignal.common;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {
    public static final j INSTANCE = new j();
    private static String sdkType;
    private static String sdkVersion;

    private j() {
    }

    public static final String getSdkType() {
        return sdkType;
    }

    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static final void setSdkType(String str) {
        sdkType = str;
    }

    public static final void setSdkVersion(String str) {
        sdkVersion = str;
    }

    public static /* synthetic */ void getSdkType$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }
}
