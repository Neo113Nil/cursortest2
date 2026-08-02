package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ry implements uy {
    public final List a;

    public ry(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry) && this.a.equals(((ry) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("SimilarEntities(entities=", ")", this.a);
    }
}
