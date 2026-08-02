package com.anythink.basead.exoplayer.e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7966a = new l(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f7967b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7968c;

    public l(long j6, long j9) {
        this.f7967b = j6;
        this.f7968c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7967b == lVar.f7967b && this.f7968c == lVar.f7968c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7967b) * 31) + ((int) this.f7968c);
    }

    public final String toString() {
        return "[timeUs=" + this.f7967b + ", position=" + this.f7968c + "]";
    }
}
