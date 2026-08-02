package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class r5x {
    public final ArrayList a;

    public r5x(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5x) && this.a.equals(((r5x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("JasonPath(fragments="), this.a, ')');
    }
}
