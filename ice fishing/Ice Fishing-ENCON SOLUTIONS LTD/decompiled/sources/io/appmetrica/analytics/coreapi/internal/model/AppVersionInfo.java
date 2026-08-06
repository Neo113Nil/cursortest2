package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f3762a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3763b;

    public AppVersionInfo(String str, String str2) {
        this.f3762a = str;
        this.f3763b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appVersionInfo.f3762a;
        }
        if ((i2 & 2) != 0) {
            str2 = appVersionInfo.f3763b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f3762a;
    }

    public final String component2() {
        return this.f3763b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return i.a(this.f3762a, appVersionInfo.f3762a) && i.a(this.f3763b, appVersionInfo.f3763b);
    }

    public final String getAppBuildNumber() {
        return this.f3763b;
    }

    public final String getAppVersionName() {
        return this.f3762a;
    }

    public int hashCode() {
        return this.f3763b.hashCode() + (this.f3762a.hashCode() * 31);
    }

    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f3762a + ", appBuildNumber=" + this.f3763b + ')';
    }
}
