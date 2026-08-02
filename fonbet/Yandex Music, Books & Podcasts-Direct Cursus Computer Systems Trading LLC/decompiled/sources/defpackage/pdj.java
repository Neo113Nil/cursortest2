package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class pdj implements qdj {
    public final ArrayList a;

    public pdj(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdj) && this.a.equals(((pdj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Show(list=", ")", this.a);
    }
}
