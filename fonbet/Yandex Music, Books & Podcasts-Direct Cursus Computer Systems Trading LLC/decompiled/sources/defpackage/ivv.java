package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ivv implements kvv {
    public final ArrayList a;

    public ivv(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivv) && this.a.equals(((ivv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Loading(covers=", ")", this.a);
    }
}
