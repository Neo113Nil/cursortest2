package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class dea implements eea {
    public final ArrayList a;

    public dea(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dea) && this.a.equals(((dea) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(artists=", ")", this.a);
    }
}
