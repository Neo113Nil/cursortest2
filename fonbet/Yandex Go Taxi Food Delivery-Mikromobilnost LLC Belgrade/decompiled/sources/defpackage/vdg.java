package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class vdg {
    public final ArrayList a;

    public vdg(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdg) && this.a.equals(((vdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("SectionGroup(sections="), this.a, ')');
    }
}
