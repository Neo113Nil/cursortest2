package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class v6x extends m6x implements Serializable {
    public final m6x a;

    public v6x(m6x m6xVar) {
        this.a = m6xVar;
    }

    @Override // defpackage.m6x
    public final m6x a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v6x) {
            return this.a.equals(((v6x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
