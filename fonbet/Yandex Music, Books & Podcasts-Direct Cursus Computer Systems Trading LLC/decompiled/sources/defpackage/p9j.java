package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p9j implements q9j {
    public final ArrayList a;

    public p9j(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9j) && this.a.equals(((p9j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Show(list=", ")", this.a);
    }
}
