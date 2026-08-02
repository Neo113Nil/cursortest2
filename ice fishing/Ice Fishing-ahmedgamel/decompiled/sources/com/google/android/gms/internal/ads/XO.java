package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class XO {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f29303a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XO) {
            return this.f29303a.equals(((XO) obj).f29303a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29303a.hashCode();
    }
}
