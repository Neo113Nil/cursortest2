package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class AG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f23661a;

    /* renamed from: b, reason: collision with root package name */
    public final C3240gK f23662b;

    public /* synthetic */ AG(Class cls, C3240gK c3240gK) {
        this.f23661a = cls;
        this.f23662b = c3240gK;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AG)) {
            return false;
        }
        AG ag = (AG) obj;
        return ag.f23661a.equals(this.f23661a) && ag.f23662b.equals(this.f23662b);
    }

    public final int hashCode() {
        return Objects.hash(this.f23661a, this.f23662b);
    }

    public final String toString() {
        String simpleName = this.f23661a.getSimpleName();
        String valueOf = String.valueOf(this.f23662b);
        return D.y.s(new StringBuilder(simpleName.length() + 21 + valueOf.length()), simpleName, ", object identifier: ", valueOf);
    }
}
