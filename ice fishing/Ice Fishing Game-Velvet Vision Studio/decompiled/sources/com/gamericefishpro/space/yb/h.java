package com.gamericefishpro.space.yb;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static String sdkType;
    private static String sdkVersion;

    private h() {
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
