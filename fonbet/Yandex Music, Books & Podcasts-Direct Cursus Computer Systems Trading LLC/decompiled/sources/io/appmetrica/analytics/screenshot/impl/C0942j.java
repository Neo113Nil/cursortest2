package io.appmetrica.analytics.screenshot.impl;

import defpackage.dfi;
import defpackage.jj4;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0942j {
    public final boolean a;

    public C0942j(C0957z c0957z) {
        this(c0957z.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0942j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.a == ((C0942j) obj).a;
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("ClientSideApiCaptorConfig(enabled="), this.a, ')');
    }

    public C0942j(boolean z) {
        this.a = z;
    }
}
