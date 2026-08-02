package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3904sG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f34726a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f34727b;

    public /* synthetic */ C3904sG(Class cls, Class cls2) {
        this.f34726a = cls;
        this.f34727b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3904sG)) {
            return false;
        }
        C3904sG c3904sG = (C3904sG) obj;
        return c3904sG.f34726a.equals(this.f34726a) && c3904sG.f34727b.equals(this.f34727b);
    }

    public final int hashCode() {
        return Objects.hash(this.f34726a, this.f34727b);
    }

    public final String toString() {
        String simpleName = this.f34726a.getSimpleName();
        String simpleName2 = this.f34727b.getSimpleName();
        return D.x.p(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
