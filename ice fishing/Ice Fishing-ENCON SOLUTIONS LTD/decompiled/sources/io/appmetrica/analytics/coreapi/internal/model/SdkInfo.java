package io.appmetrica.analytics.coreapi.internal.model;

import C1.a;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f3774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3775b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3776c;

    public SdkInfo(String str, String str2, String str3) {
        this.f3774a = str;
        this.f3775b = str2;
        this.f3776c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkInfo.f3774a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkInfo.f3775b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkInfo.f3776c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f3774a;
    }

    public final String component2() {
        return this.f3775b;
    }

    public final String component3() {
        return this.f3776c;
    }

    public final SdkInfo copy(String str, String str2, String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return i.a(this.f3774a, sdkInfo.f3774a) && i.a(this.f3775b, sdkInfo.f3775b) && i.a(this.f3776c, sdkInfo.f3776c);
    }

    public final String getSdkBuildNumber() {
        return this.f3775b;
    }

    public final String getSdkBuildType() {
        return this.f3776c;
    }

    public final String getSdkVersionName() {
        return this.f3774a;
    }

    public int hashCode() {
        return this.f3776c.hashCode() + a.e(this.f3775b, this.f3774a.hashCode() * 31, 31);
    }

    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f3774a + ", sdkBuildNumber=" + this.f3775b + ", sdkBuildType=" + this.f3776c + ')';
    }
}
