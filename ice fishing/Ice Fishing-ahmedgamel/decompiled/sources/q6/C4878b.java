package q6;

import java.util.Map;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4878b implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f40058n;

    /* renamed from: u, reason: collision with root package name */
    public final Map.Entry f40059u;

    public C4878b(Object obj, Map.Entry entry) {
        this.f40058n = obj;
        this.f40059u = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40058n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40059u.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f40059u.setValue(obj);
    }
}
