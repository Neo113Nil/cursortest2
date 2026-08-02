package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a2b implements b2b {
    public final ArrayList a;

    public a2b(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2b) && this.a.equals(((a2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(items=", ")", this.a);
    }
}
