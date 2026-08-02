package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class vol0 implements Map.Entry {
    public final Object a;
    public final Object b;
    public vol0 c;
    public vol0 w;

    public vol0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vol0)) {
            return false;
        }
        vol0 vol0Var = (vol0) obj;
        return this.a.equals(vol0Var.a) && this.b.equals(vol0Var.b);
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
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
