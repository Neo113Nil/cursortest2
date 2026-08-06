package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7660a;

    /* renamed from: b, reason: collision with root package name */
    public final C0947m f7661b;

    public C0946l(boolean z2, C0947m c0947m) {
        this.f7660a = z2;
        this.f7661b = c0947m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0946l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C0946l c0946l = (C0946l) obj;
        return this.f7660a == c0946l.f7660a && kotlin.jvm.internal.i.a(this.f7661b, c0946l.f7661b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f7660a) * 31;
        C0947m c0947m = this.f7661b;
        return hashCode + (c0947m != null ? c0947m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f7660a + ", config=" + this.f7661b + ')';
    }
}
