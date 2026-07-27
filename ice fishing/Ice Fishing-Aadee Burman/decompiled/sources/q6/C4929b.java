package q6;

import java.util.Map;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4929b implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f40244n;

    /* renamed from: u, reason: collision with root package name */
    public final Map.Entry f40245u;

    public C4929b(Object obj, Map.Entry entry) {
        this.f40244n = obj;
        this.f40245u = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40244n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40245u.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f40245u.setValue(obj);
    }
}
