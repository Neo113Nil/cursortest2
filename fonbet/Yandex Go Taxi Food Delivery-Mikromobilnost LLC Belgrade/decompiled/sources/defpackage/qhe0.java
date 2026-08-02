package defpackage;

import java.util.Collection;

/* loaded from: classes8.dex */
public final class qhe0 implements eie0 {
    public final Collection a;

    public qhe0(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhe0) && this.a.equals(((qhe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AllOf(predicates=" + this.a + ')';
    }
}
