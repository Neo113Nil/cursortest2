package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3950b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f3951c;

    public a(String str, String str2, Boolean bool) {
        this.f3949a = str;
        this.f3950b = str2;
        this.f3951c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f3949a, aVar.f3949a) && kotlin.jvm.internal.i.a(this.f3950b, aVar.f3950b) && kotlin.jvm.internal.i.a(this.f3951c, aVar.f3951c);
    }

    public final int hashCode() {
        int hashCode = this.f3949a.hashCode() * 31;
        String str = this.f3950b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f3951c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f3949a + ", advId=" + this.f3950b + ", limitedAdTracking=" + this.f3951c + ')';
    }
}
