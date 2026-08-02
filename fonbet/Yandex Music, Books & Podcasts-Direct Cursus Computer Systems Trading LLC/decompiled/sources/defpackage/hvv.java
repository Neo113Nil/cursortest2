package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class hvv implements kvv {
    public final ArrayList a;

    public hvv(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvv) && this.a.equals(((hvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Error(covers=", ")", this.a);
    }
}
