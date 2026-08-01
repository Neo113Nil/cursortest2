package q0;

import u1.h;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4863c {

    /* renamed from: a, reason: collision with root package name */
    public final long f39974a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39976c;

    public C4863c(int i, long j6, long j9) {
        this.f39974a = j6;
        this.f39975b = j9;
        this.f39976c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4863c)) {
            return false;
        }
        C4863c c4863c = (C4863c) obj;
        return this.f39974a == c4863c.f39974a && this.f39975b == c4863c.f39975b && this.f39976c == c4863c.f39976c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39976c) + ((Long.hashCode(this.f39975b) + (Long.hashCode(this.f39974a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f39974a);
        sb.append(", ModelVersion=");
        sb.append(this.f39975b);
        sb.append(", TopicCode=");
        return h.f("Topic { ", h.e(this.f39976c, " }", sb));
    }
}
