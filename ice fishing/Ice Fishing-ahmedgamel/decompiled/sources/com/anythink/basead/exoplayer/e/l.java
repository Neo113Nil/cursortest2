package com.anythink.basead.exoplayer.e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7180a = new l(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f7181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7182c;

    public l(long j6, long j9) {
        this.f7181b = j6;
        this.f7182c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7181b == lVar.f7181b && this.f7182c == lVar.f7182c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7181b) * 31) + ((int) this.f7182c);
    }

    public final String toString() {
        return "[timeUs=" + this.f7181b + ", position=" + this.f7182c + "]";
    }
}
