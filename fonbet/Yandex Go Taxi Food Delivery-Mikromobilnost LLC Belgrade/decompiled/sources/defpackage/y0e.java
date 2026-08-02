package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y0e {
    public final ArrayList a;

    public y0e(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0e) && this.a.equals(((y0e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("ConfigurationFragment(sectionGroups="), this.a, ')');
    }
}
