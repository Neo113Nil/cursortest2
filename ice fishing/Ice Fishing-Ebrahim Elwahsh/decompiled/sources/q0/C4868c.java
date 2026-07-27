package q0;

import t0.AbstractC5051n;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4868c {

    /* renamed from: a, reason: collision with root package name */
    public final long f39881a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39883c;

    public C4868c(int i, long j9, long j10) {
        this.f39881a = j9;
        this.f39882b = j10;
        this.f39883c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4868c)) {
            return false;
        }
        C4868c c4868c = (C4868c) obj;
        return this.f39881a == c4868c.f39881a && this.f39882b == c4868c.f39882b && this.f39883c == c4868c.f39883c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39883c) + ((Long.hashCode(this.f39882b) + (Long.hashCode(this.f39881a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f39881a);
        sb.append(", ModelVersion=");
        sb.append(this.f39882b);
        sb.append(", TopicCode=");
        return AbstractC5051n.f("Topic { ", AbstractC5051n.e(this.f39883c, " }", sb));
    }
}
