package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class rhf implements thf {
    public final ArrayList a;

    public rhf(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhf) && this.a.equals(((rhf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(tracks=", ")", this.a);
    }
}
