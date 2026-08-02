package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes5.dex */
public final class n2f implements Map.Entry, Serializable, Cloneable {
    private static final long serialVersionUID = 9188503522395855322L;
    public final String a;
    public final String b;

    public n2f(String str) {
        str = str == null ? "" : str;
        this.b = str;
        this.a = str.toLowerCase();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }

    public final Object clone() {
        return this;
    }
}
