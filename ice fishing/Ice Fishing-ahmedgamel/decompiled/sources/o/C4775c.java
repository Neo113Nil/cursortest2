package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4775c implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39532n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f39533u;

    /* renamed from: v, reason: collision with root package name */
    public C4775c f39534v;

    /* renamed from: w, reason: collision with root package name */
    public C4775c f39535w;

    public C4775c(Object obj, Object obj2) {
        this.f39532n = obj;
        this.f39533u = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4775c)) {
            return false;
        }
        C4775c c4775c = (C4775c) obj;
        return this.f39532n.equals(c4775c.f39532n) && this.f39533u.equals(c4775c.f39533u);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39532n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39533u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f39532n.hashCode() ^ this.f39533u.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f39532n + "=" + this.f39533u;
    }
}
