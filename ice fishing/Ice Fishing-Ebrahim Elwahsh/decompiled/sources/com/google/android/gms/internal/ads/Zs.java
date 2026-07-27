package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class Zs extends IllegalStateException {

    /* renamed from: n, reason: collision with root package name */
    public final int f29086n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29087u;

    public Zs(int i, int i4) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? AbstractC5051n.d(i4, "Player stuck suppressed for ", " ms", new StringBuilder(String.valueOf(i4).length() + 31)) : AbstractC5051n.d(i4, "Player stuck playing without ending for ", " ms", new StringBuilder(String.valueOf(i4).length() + 43)) : AbstractC5051n.d(i4, "Player stuck playing with no progress for ", " ms", new StringBuilder(String.valueOf(i4).length() + 45)) : AbstractC5051n.d(i4, "Player stuck buffering with no progress for ", " ms", new StringBuilder(String.valueOf(i4).length() + 47)) : AbstractC5051n.d(i4, "Player stuck buffering and not loading for ", " ms", new StringBuilder(String.valueOf(i4).length() + 46)));
        this.f29086n = i;
        this.f29087u = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Zs.class != obj.getClass()) {
            return false;
        }
        Zs zs = (Zs) obj;
        return this.f29086n == zs.f29086n && this.f29087u == zs.f29087u;
    }

    public final int hashCode() {
        return ((this.f29086n + 527) * 31) + this.f29087u;
    }
}
