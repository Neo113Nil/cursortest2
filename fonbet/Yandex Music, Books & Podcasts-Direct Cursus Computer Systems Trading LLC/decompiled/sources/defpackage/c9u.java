package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c9u implements d9u {
    public final ArrayList a;

    public c9u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9u) && this.a.equals(((c9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(listItems=", ")", this.a);
    }
}
