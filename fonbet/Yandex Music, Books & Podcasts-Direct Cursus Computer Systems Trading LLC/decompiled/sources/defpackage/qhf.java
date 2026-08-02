package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class qhf implements shf {
    public final ArrayList a;

    public qhf(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhf) && this.a.equals(((qhf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(tracks=", ")", this.a);
    }
}
