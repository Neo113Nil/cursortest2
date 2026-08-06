package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947m {

    /* renamed from: a, reason: collision with root package name */
    public final C0944j f7664a;

    /* renamed from: b, reason: collision with root package name */
    public final C0948n f7665b;

    /* renamed from: c, reason: collision with root package name */
    public final C0945k f7666c;

    public C0947m(C0944j c0944j, C0948n c0948n, C0945k c0945k) {
        this.f7664a = c0944j;
        this.f7665b = c0948n;
        this.f7666c = c0945k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0947m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C0947m c0947m = (C0947m) obj;
        return kotlin.jvm.internal.i.a(this.f7664a, c0947m.f7664a) && kotlin.jvm.internal.i.a(this.f7665b, c0947m.f7665b) && kotlin.jvm.internal.i.a(this.f7666c, c0947m.f7666c);
    }

    public final int hashCode() {
        C0944j c0944j = this.f7664a;
        int hashCode = (c0944j != null ? c0944j.hashCode() : 0) * 31;
        C0948n c0948n = this.f7665b;
        int hashCode2 = (hashCode + (c0948n != null ? c0948n.hashCode() : 0)) * 31;
        C0945k c0945k = this.f7666c;
        return hashCode2 + (c0945k != null ? c0945k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f7664a + ", serviceCaptorConfig=" + this.f7665b + ", contentObserverCaptorConfig=" + this.f7666c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0947m(F f2) {
        this(r2, r3, r5 != null ? new C0945k(r5) : null);
        C0959z a2 = f2.a();
        C0944j c0944j = a2 != null ? new C0944j(a2) : null;
        H c2 = f2.c();
        C0948n c0948n = c2 != null ? new C0948n(c2) : null;
        B b2 = f2.b();
    }
}
