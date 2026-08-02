package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x0e {
    public final ArrayList a;

    public x0e(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0e) && this.a.equals(((x0e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("SectionGroup(sections="), this.a, ')');
    }
}
