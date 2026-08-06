package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254a {

    /* renamed from: a, reason: collision with root package name */
    public final List f3540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3541b;

    public C0254a(List list, boolean z2) {
        this.f3540a = list;
        this.f3541b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0254a)) {
            return false;
        }
        C0254a c0254a = (C0254a) obj;
        return kotlin.jvm.internal.i.a(this.f3540a, c0254a.f3540a) && this.f3541b == c0254a.f3541b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f3540a.hashCode() * 31;
        boolean z2 = this.f3541b;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f3540a + ", firstInappCheckOccurred=" + this.f3541b + ')';
    }
}
