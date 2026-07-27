package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Us extends IllegalStateException {

    /* renamed from: n, reason: collision with root package name */
    public final int f28001n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28002u;

    public Us(int i, int i6) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? u1.h.d(i6, "Player stuck suppressed for ", " ms", new StringBuilder(String.valueOf(i6).length() + 31)) : u1.h.d(i6, "Player stuck playing without ending for ", " ms", new StringBuilder(String.valueOf(i6).length() + 43)) : u1.h.d(i6, "Player stuck playing with no progress for ", " ms", new StringBuilder(String.valueOf(i6).length() + 45)) : u1.h.d(i6, "Player stuck buffering with no progress for ", " ms", new StringBuilder(String.valueOf(i6).length() + 47)) : u1.h.d(i6, "Player stuck buffering and not loading for ", " ms", new StringBuilder(String.valueOf(i6).length() + 46)));
        this.f28001n = i;
        this.f28002u = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Us.class != obj.getClass()) {
            return false;
        }
        Us us = (Us) obj;
        return this.f28001n == us.f28001n && this.f28002u == us.f28002u;
    }

    public final int hashCode() {
        return ((this.f28001n + 527) * 31) + this.f28002u;
    }
}
