package io.appmetrica.analytics.screenshot.impl;

import defpackage.jl40;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1106k {
    public final boolean a;
    public final C1104i b;
    public final C1107l c;
    public final C1105j d;

    public C1106k(boolean z, C1104i c1104i, C1107l c1107l, C1105j c1105j) {
        this.a = z;
        this.b = c1104i;
        this.c = c1107l;
        this.d = c1105j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1106k)) {
            return false;
        }
        C1106k c1106k = (C1106k) obj;
        return this.a == c1106k.a && jl40.l(this.b, c1106k.b) && jl40.l(this.c, c1106k.c) && jl40.l(this.d, c1106k.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C1104i c1104i = this.b;
        int hashCode2 = (hashCode + (c1104i == null ? 0 : Boolean.hashCode(c1104i.a))) * 31;
        C1107l c1107l = this.c;
        int hashCode3 = (hashCode2 + (c1107l == null ? 0 : c1107l.hashCode())) * 31;
        C1105j c1105j = this.d;
        return hashCode3 + (c1105j != null ? c1105j.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(enabled=" + this.a + ", apiCaptorConfig=" + this.b + ", serviceCaptorConfig=" + this.c + ", contentObserverCaptorConfig=" + this.d + ')';
    }
}
