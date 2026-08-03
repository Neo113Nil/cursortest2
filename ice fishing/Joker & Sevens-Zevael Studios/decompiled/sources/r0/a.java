package r0;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class a implements Map.Entry, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5896g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5897h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5898i;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f5896g = i10;
        this.f5897h = obj;
        this.f5898i = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f5896g) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && pc.j.a(entry.getKey(), this.f5897h) && pc.j.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f5896g) {
        }
        return this.f5897h;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f5896g) {
        }
        return this.f5898i;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f5896g) {
            case 0:
                Object obj = this.f5897h;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f5896g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f5896g) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5897h);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
