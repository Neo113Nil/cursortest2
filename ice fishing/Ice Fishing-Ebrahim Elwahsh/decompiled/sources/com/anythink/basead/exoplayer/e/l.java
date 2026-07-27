package com.anythink.basead.exoplayer.e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7337a = new l(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f7338b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7339c;

    public l(long j9, long j10) {
        this.f7338b = j9;
        this.f7339c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7338b == lVar.f7338b && this.f7339c == lVar.f7339c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7338b) * 31) + ((int) this.f7339c);
    }

    public final String toString() {
        return "[timeUs=" + this.f7338b + ", position=" + this.f7339c + "]";
    }
}
