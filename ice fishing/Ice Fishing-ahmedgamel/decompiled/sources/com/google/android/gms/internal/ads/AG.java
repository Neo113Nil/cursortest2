package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class AG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24441a;

    /* renamed from: b, reason: collision with root package name */
    public final C3263gK f24442b;

    public /* synthetic */ AG(Class cls, C3263gK c3263gK) {
        this.f24441a = cls;
        this.f24442b = c3263gK;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AG)) {
            return false;
        }
        AG ag = (AG) obj;
        return ag.f24441a.equals(this.f24441a) && ag.f24442b.equals(this.f24442b);
    }

    public final int hashCode() {
        return Objects.hash(this.f24441a, this.f24442b);
    }

    public final String toString() {
        String simpleName = this.f24441a.getSimpleName();
        String valueOf = String.valueOf(this.f24442b);
        return D.x.p(new StringBuilder(simpleName.length() + 21 + valueOf.length()), simpleName, ", object identifier: ", valueOf);
    }
}
