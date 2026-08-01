package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class XO {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f28523a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XO) {
            return this.f28523a.equals(((XO) obj).f28523a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28523a.hashCode();
    }
}
