package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4110wG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f34967a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f34968b;

    public /* synthetic */ C4110wG(Class cls, Class cls2) {
        this.f34967a = cls;
        this.f34968b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4110wG)) {
            return false;
        }
        C4110wG c4110wG = (C4110wG) obj;
        return c4110wG.f34967a.equals(this.f34967a) && c4110wG.f34968b.equals(this.f34968b);
    }

    public final int hashCode() {
        return Objects.hash(this.f34967a, this.f34968b);
    }

    public final String toString() {
        String simpleName = this.f34967a.getSimpleName();
        String simpleName2 = this.f34968b.getSimpleName();
        return D.y.o(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
