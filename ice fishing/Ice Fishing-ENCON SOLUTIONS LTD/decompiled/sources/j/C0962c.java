package j;

import java.util.Map;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8017a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8018b;

    /* renamed from: c, reason: collision with root package name */
    public C0962c f8019c;

    /* renamed from: d, reason: collision with root package name */
    public C0962c f8020d;

    public C0962c(Object obj, Object obj2) {
        this.f8017a = obj;
        this.f8018b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0962c)) {
            return false;
        }
        C0962c c0962c = (C0962c) obj;
        return this.f8017a.equals(c0962c.f8017a) && this.f8018b.equals(c0962c.f8018b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8017a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8018b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8017a.hashCode() ^ this.f8018b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8017a + "=" + this.f8018b;
    }
}
