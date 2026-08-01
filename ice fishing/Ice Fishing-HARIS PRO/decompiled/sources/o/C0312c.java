package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4117a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4118b;

    /* renamed from: c, reason: collision with root package name */
    public C0312c f4119c;

    /* renamed from: d, reason: collision with root package name */
    public C0312c f4120d;

    public C0312c(Object obj, Object obj2) {
        this.f4117a = obj;
        this.f4118b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0312c)) {
            return false;
        }
        C0312c c0312c = (C0312c) obj;
        return this.f4117a.equals(c0312c.f4117a) && this.f4118b.equals(c0312c.f4118b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4117a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4118b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4117a.hashCode() ^ this.f4118b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4117a + "=" + this.f4118b;
    }
}
