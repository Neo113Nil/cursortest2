package yads;

import defpackage.f371;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes7.dex */
public final class px extends f371 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator b;

    public px(Comparator comparator) {
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof px) {
            return this.b.equals(((px) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
