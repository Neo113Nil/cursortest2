package q0;

import u1.h;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4863c {

    /* renamed from: a, reason: collision with root package name */
    public final long f39971a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39973c;

    public C4863c(int i, long j6, long j9) {
        this.f39971a = j6;
        this.f39972b = j9;
        this.f39973c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4863c)) {
            return false;
        }
        C4863c c4863c = (C4863c) obj;
        return this.f39971a == c4863c.f39971a && this.f39972b == c4863c.f39972b && this.f39973c == c4863c.f39973c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39973c) + ((Long.hashCode(this.f39972b) + (Long.hashCode(this.f39971a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f39971a);
        sb.append(", ModelVersion=");
        sb.append(this.f39972b);
        sb.append(", TopicCode=");
        return h.f("Topic { ", h.e(this.f39973c, " }", sb));
    }
}
