package q0;

import w.AbstractC5128c;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4863c {

    /* renamed from: a, reason: collision with root package name */
    public final long f40021a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40023c;

    public C4863c(int i, long j6, long j9) {
        this.f40021a = j6;
        this.f40022b = j9;
        this.f40023c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4863c)) {
            return false;
        }
        C4863c c4863c = (C4863c) obj;
        return this.f40021a == c4863c.f40021a && this.f40022b == c4863c.f40022b && this.f40023c == c4863c.f40023c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40023c) + ((Long.hashCode(this.f40022b) + (Long.hashCode(this.f40021a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f40021a);
        sb.append(", ModelVersion=");
        sb.append(this.f40022b);
        sb.append(", TopicCode=");
        return AbstractC5128c.f("Topic { ", AbstractC5128c.e(this.f40023c, " }", sb));
    }
}
