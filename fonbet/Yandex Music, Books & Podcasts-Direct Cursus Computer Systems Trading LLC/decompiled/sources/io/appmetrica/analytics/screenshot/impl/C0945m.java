package io.appmetrica.analytics.screenshot.impl;

import defpackage.jj4;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0945m {
    public final C0942j a;
    public final C0946n b;
    public final C0943k c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0945m(F f) {
        this(r2, r3, r5 != null ? new C0943k(r5) : null);
        C0957z a = f.a();
        C0942j c0942j = a != null ? new C0942j(a) : null;
        H c = f.c();
        C0946n c0946n = c != null ? new C0946n(c) : null;
        B b = f.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0945m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0945m c0945m = (C0945m) obj;
            return Intrinsics.d(this.a, c0945m.a) && Intrinsics.d(this.b, c0945m.b) && Intrinsics.d(this.c, c0945m.c);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        return false;
    }

    public final int hashCode() {
        C0942j c0942j = this.a;
        int hashCode = (c0942j != null ? c0942j.hashCode() : 0) * 31;
        C0946n c0946n = this.b;
        int hashCode2 = (hashCode + (c0946n != null ? c0946n.hashCode() : 0)) * 31;
        C0943k c0943k = this.c;
        return hashCode2 + (c0943k != null ? c0943k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    public C0945m(C0942j c0942j, C0946n c0946n, C0943k c0943k) {
        this.a = c0942j;
        this.b = c0946n;
        this.c = c0943k;
    }
}
