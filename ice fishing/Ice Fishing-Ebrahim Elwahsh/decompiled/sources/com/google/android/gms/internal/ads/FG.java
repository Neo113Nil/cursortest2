package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class FG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24939a;

    /* renamed from: b, reason: collision with root package name */
    public final C3791qK f24940b;

    public /* synthetic */ FG(Class cls, C3791qK c3791qK) {
        this.f24939a = cls;
        this.f24940b = c3791qK;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FG)) {
            return false;
        }
        FG fg = (FG) obj;
        return fg.f24939a.equals(this.f24939a) && fg.f24940b.equals(this.f24940b);
    }

    public final int hashCode() {
        return Objects.hash(this.f24939a, this.f24940b);
    }

    public final String toString() {
        String simpleName = this.f24939a.getSimpleName();
        String valueOf = String.valueOf(this.f24940b);
        return D.y.o(new StringBuilder(simpleName.length() + 21 + valueOf.length()), simpleName, ", object identifier: ", valueOf);
    }
}
