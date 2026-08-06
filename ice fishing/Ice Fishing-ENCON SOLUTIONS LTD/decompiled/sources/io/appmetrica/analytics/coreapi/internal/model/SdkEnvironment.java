package io.appmetrica.analytics.coreapi.internal.model;

import C1.a;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f3768a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3769b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f3770c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f3771d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3772e;

    /* renamed from: f, reason: collision with root package name */
    private final List f3773f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f3768a = appVersionInfo;
        this.f3769b = str;
        this.f3770c = screenInfo;
        this.f3771d = sdkInfo;
        this.f3772e = str2;
        this.f3773f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f3768a;
        }
        if ((i2 & 2) != 0) {
            str = sdkEnvironment.f3769b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            screenInfo = sdkEnvironment.f3770c;
        }
        ScreenInfo screenInfo2 = screenInfo;
        if ((i2 & 8) != 0) {
            sdkInfo = sdkEnvironment.f3771d;
        }
        SdkInfo sdkInfo2 = sdkInfo;
        if ((i2 & 16) != 0) {
            str2 = sdkEnvironment.f3772e;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            list = sdkEnvironment.f3773f;
        }
        return sdkEnvironment.copy(appVersionInfo, str3, screenInfo2, sdkInfo2, str4, list);
    }

    public final AppVersionInfo component1() {
        return this.f3768a;
    }

    public final String component2() {
        return this.f3769b;
    }

    public final ScreenInfo component3() {
        return this.f3770c;
    }

    public final SdkInfo component4() {
        return this.f3771d;
    }

    public final String component5() {
        return this.f3772e;
    }

    public final List<String> component6() {
        return this.f3773f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return i.a(this.f3768a, sdkEnvironment.f3768a) && i.a(this.f3769b, sdkEnvironment.f3769b) && i.a(this.f3770c, sdkEnvironment.f3770c) && i.a(this.f3771d, sdkEnvironment.f3771d) && i.a(this.f3772e, sdkEnvironment.f3772e) && i.a(this.f3773f, sdkEnvironment.f3773f);
    }

    public final String getAppFramework() {
        return this.f3769b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f3768a;
    }

    public final String getDeviceType() {
        return this.f3772e;
    }

    public final List<String> getLocales() {
        return this.f3773f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f3770c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f3771d;
    }

    public int hashCode() {
        return this.f3773f.hashCode() + a.e(this.f3772e, (this.f3771d.hashCode() + ((this.f3770c.hashCode() + a.e(this.f3769b, this.f3768a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f3768a + ", appFramework=" + this.f3769b + ", screenInfo=" + this.f3770c + ", sdkInfo=" + this.f3771d + ", deviceType=" + this.f3772e + ", locales=" + this.f3773f + ')';
    }
}
