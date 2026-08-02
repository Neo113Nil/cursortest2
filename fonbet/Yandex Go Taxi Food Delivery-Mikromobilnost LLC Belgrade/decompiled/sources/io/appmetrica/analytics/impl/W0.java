package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes4.dex */
public final class W0 {
    public final NativeCrashSource a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final X0 f;

    public W0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, X0 x0) {
        this.a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w0 = (W0) obj;
        return this.a == w0.a && jl40.l(this.b, w0.b) && jl40.l(this.c, w0.c) && jl40.l(this.d, w0.d) && this.e == w0.e && jl40.l(this.f, w0.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qv10.c(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.a + ", handlerVersion=" + this.b + ", uuid=" + this.c + ", dumpFile=" + this.d + ", creationTime=" + this.e + ", metadata=" + this.f + ')';
    }
}
