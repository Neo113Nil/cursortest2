package o;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: g, reason: collision with root package name */
    public final Object f5116g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5117h;

    /* renamed from: i, reason: collision with root package name */
    public c f5118i;

    /* renamed from: j, reason: collision with root package name */
    public c f5119j;

    public c(Object obj, Object obj2) {
        this.f5116g = obj;
        this.f5117h = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5116g.equals(cVar.f5116g) && this.f5117h.equals(cVar.f5117h);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5116g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5117h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5116g.hashCode() ^ this.f5117h.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5116g + "=" + this.f5117h;
    }
}
