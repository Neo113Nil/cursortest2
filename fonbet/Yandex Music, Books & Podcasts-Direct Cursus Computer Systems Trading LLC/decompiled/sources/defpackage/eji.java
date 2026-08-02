package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class eji implements gji {
    public final ArrayList a;

    public eji(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eji) && this.a.equals(((eji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("QueryToVibe(seeds=", ")", this.a);
    }
}
