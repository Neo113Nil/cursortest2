package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4791c implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39699n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f39700u;

    /* renamed from: v, reason: collision with root package name */
    public C4791c f39701v;

    /* renamed from: w, reason: collision with root package name */
    public C4791c f39702w;

    public C4791c(Object obj, Object obj2) {
        this.f39699n = obj;
        this.f39700u = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4791c)) {
            return false;
        }
        C4791c c4791c = (C4791c) obj;
        return this.f39699n.equals(c4791c.f39699n) && this.f39700u.equals(c4791c.f39700u);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39699n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39700u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f39699n.hashCode() ^ this.f39700u.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f39699n + "=" + this.f39700u;
    }
}
