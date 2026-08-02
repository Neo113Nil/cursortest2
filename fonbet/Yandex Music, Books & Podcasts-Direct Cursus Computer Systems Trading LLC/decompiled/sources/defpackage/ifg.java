package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ifg implements jfg {
    public final ArrayList a;

    public ifg(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifg) && this.a.equals(((ifg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(locations=", ")", this.a);
    }
}
