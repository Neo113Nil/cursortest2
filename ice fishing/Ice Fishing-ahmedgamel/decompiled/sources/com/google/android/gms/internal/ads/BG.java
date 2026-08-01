package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class BG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f23869a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f23870b;

    public /* synthetic */ BG(Class cls, Class cls2) {
        this.f23869a = cls;
        this.f23870b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BG)) {
            return false;
        }
        BG bg = (BG) obj;
        return bg.f23869a.equals(this.f23869a) && bg.f23870b.equals(this.f23870b);
    }

    public final int hashCode() {
        return Objects.hash(this.f23869a, this.f23870b);
    }

    public final String toString() {
        String simpleName = this.f23869a.getSimpleName();
        String simpleName2 = this.f23870b.getSimpleName();
        return D.y.s(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
