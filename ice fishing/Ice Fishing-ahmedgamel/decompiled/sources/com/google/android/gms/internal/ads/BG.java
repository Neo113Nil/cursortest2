package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class BG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24640a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f24641b;

    public /* synthetic */ BG(Class cls, Class cls2) {
        this.f24640a = cls;
        this.f24641b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BG)) {
            return false;
        }
        BG bg = (BG) obj;
        return bg.f24640a.equals(this.f24640a) && bg.f24641b.equals(this.f24641b);
    }

    public final int hashCode() {
        return Objects.hash(this.f24640a, this.f24641b);
    }

    public final String toString() {
        String simpleName = this.f24640a.getSimpleName();
        String simpleName2 = this.f24641b.getSimpleName();
        return D.x.p(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
