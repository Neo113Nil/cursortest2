package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3881sG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f33958a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f33959b;

    public /* synthetic */ C3881sG(Class cls, Class cls2) {
        this.f33958a = cls;
        this.f33959b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3881sG)) {
            return false;
        }
        C3881sG c3881sG = (C3881sG) obj;
        return c3881sG.f33958a.equals(this.f33958a) && c3881sG.f33959b.equals(this.f33959b);
    }

    public final int hashCode() {
        return Objects.hash(this.f33958a, this.f33959b);
    }

    public final String toString() {
        String simpleName = this.f33958a.getSimpleName();
        String simpleName2 = this.f33959b.getSimpleName();
        return D.y.s(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
