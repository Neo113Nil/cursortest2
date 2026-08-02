package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jj4;
import defpackage.k5r;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class M0 {
    public final List a;
    public final RetryPolicyConfig b;
    public final List c;
    public final p2 d;
    public final C0876h e;

    public M0(ArrayList arrayList, RetryPolicyConfig retryPolicyConfig, ArrayList arrayList2, p2 p2Var, C0876h c0876h) {
        this.a = arrayList;
        this.b = retryPolicyConfig;
        this.c = arrayList2;
        this.d = p2Var;
        this.e = c0876h;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!M0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            M0 m0 = (M0) obj;
            return Intrinsics.d(this.a, m0.a) && Intrinsics.d(this.b, m0.b) && Intrinsics.d(this.c, m0.c) && Intrinsics.d(this.d, m0.d) && Intrinsics.d(this.e, m0.e);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.LocationConfig");
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "LocationConfig(conditionalArgumentsList=" + this.a + ", retryPolicyConfig=" + this.b + ", hosts=" + this.c + ", throttlingConfig=" + this.d + ", cacheControl=" + this.e + ')';
    }
}
