package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class Us extends IllegalStateException {

    /* renamed from: n, reason: collision with root package name */
    public final int f28798n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28799u;

    public Us(int i, int i4) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? AbstractC5128c.d(i4, "Player stuck suppressed for ", " ms", new StringBuilder(String.valueOf(i4).length() + 31)) : AbstractC5128c.d(i4, "Player stuck playing without ending for ", " ms", new StringBuilder(String.valueOf(i4).length() + 43)) : AbstractC5128c.d(i4, "Player stuck playing with no progress for ", " ms", new StringBuilder(String.valueOf(i4).length() + 45)) : AbstractC5128c.d(i4, "Player stuck buffering with no progress for ", " ms", new StringBuilder(String.valueOf(i4).length() + 47)) : AbstractC5128c.d(i4, "Player stuck buffering and not loading for ", " ms", new StringBuilder(String.valueOf(i4).length() + 46)));
        this.f28798n = i;
        this.f28799u = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Us.class != obj.getClass()) {
            return false;
        }
        Us us = (Us) obj;
        return this.f28798n == us.f28798n && this.f28799u == us.f28799u;
    }

    public final int hashCode() {
        return ((this.f28798n + 527) * 31) + this.f28799u;
    }
}
