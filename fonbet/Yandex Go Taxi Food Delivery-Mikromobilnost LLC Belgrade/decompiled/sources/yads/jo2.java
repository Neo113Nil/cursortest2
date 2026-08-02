package yads;

import defpackage.f371;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class jo2 extends f371 implements Serializable {
    private static final long serialVersionUID = 0;
    public final f371 b;

    public jo2(f371 f371Var) {
        this.b = f371Var;
    }

    @Override // defpackage.f371
    public final f371 a() {
        return this.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jo2) {
            return this.b.equals(((jo2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.b.hashCode();
    }

    public final String toString() {
        return this.b + ".reverse()";
    }
}
