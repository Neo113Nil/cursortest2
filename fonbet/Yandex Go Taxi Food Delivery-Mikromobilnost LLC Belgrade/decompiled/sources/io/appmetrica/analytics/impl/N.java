package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class N {
    public final O a;
    public final O b;
    public final O c;

    public N(O o, O o2, O o3) {
        this.a = o;
        this.b = o2;
        this.c = o3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!N.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        N n = (N) obj;
        return this.a == n.a && this.b == n.b && this.c == n.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + this.a + ", canTrackHoaid=" + this.b + ", canTrackYandexAdvId=" + this.c + ')';
    }
}
