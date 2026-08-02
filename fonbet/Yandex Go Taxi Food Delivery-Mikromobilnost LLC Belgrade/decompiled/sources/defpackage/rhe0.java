package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class rhe0 implements eie0 {
    public final ArrayList a;

    public rhe0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Collection a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhe0) && this.a.equals(((rhe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("AnyOf(predicates="), this.a, ')');
    }
}
