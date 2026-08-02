package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ejt extends fjt {
    public final ArrayList a;

    public ejt(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejt) && this.a.equals(((ejt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(entities=", ")", this.a);
    }
}
