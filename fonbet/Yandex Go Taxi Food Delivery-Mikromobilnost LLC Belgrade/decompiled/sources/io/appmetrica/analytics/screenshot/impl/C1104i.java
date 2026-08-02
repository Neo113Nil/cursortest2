package io.appmetrica.analytics.screenshot.impl;

import defpackage.unr0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1104i {
    public final boolean a;

    public C1104i(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1104i) && this.a == ((C1104i) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("ClientSideApiCaptorConfig(enabled="), this.a, ')');
    }
}
