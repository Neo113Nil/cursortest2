package io.appmetrica.analytics.screenshot.impl;

import defpackage.jj4;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0944l {
    public final boolean a;
    public final C0945m b;

    public C0944l(boolean z, C0945m c0945m) {
        this.a = z;
        this.b = c0945m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0944l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0944l c0944l = (C0944l) obj;
            return this.a == c0944l.a && Intrinsics.d(this.b, c0944l.b);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        return false;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C0945m c0945m = this.b;
        return hashCode + (c0945m != null ? c0945m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.a + ", config=" + this.b + ')';
    }
}
