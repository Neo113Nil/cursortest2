package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f4403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4405c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4406d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4407e;

    /* renamed from: f, reason: collision with root package name */
    public final H0 f4408f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, H0 h02) {
        this.f4403a = nativeCrashSource;
        this.f4404b = str;
        this.f4405c = str2;
        this.f4406d = str3;
        this.f4407e = j2;
        this.f4408f = h02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f4403a == g02.f4403a && kotlin.jvm.internal.i.a(this.f4404b, g02.f4404b) && kotlin.jvm.internal.i.a(this.f4405c, g02.f4405c) && kotlin.jvm.internal.i.a(this.f4406d, g02.f4406d) && this.f4407e == g02.f4407e && kotlin.jvm.internal.i.a(this.f4408f, g02.f4408f);
    }

    public final int hashCode() {
        return this.f4408f.hashCode() + ((Long.hashCode(this.f4407e) + C1.a.e(this.f4406d, C1.a.e(this.f4405c, C1.a.e(this.f4404b, this.f4403a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f4403a + ", handlerVersion=" + this.f4404b + ", uuid=" + this.f4405c + ", dumpFile=" + this.f4406d + ", creationTime=" + this.f4407e + ", metadata=" + this.f4408f + ')';
    }
}
