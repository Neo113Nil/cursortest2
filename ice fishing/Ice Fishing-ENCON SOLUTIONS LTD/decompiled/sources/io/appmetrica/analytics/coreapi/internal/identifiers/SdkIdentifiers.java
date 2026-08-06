package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f3758a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3759b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3760c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f3758a = str;
        this.f3759b = str2;
        this.f3760c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkIdentifiers.f3758a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkIdentifiers.f3759b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkIdentifiers.f3760c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f3758a;
    }

    public final String component2() {
        return this.f3759b;
    }

    public final String component3() {
        return this.f3760c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return i.a(this.f3758a, sdkIdentifiers.f3758a) && i.a(this.f3759b, sdkIdentifiers.f3759b) && i.a(this.f3760c, sdkIdentifiers.f3760c);
    }

    public final String getDeviceId() {
        return this.f3759b;
    }

    public final String getDeviceIdHash() {
        return this.f3760c;
    }

    public final String getUuid() {
        return this.f3758a;
    }

    public int hashCode() {
        String str = this.f3758a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3759b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3760c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f3758a + ", deviceId=" + this.f3759b + ", deviceIdHash=" + this.f3760c + ')';
    }
}
