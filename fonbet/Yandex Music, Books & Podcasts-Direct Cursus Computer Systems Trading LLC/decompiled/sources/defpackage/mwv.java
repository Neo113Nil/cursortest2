package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class mwv implements owv {
    public final ArrayList a;

    public mwv(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwv) && this.a.equals(((mwv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Loaded(genres=", ")", this.a);
    }
}
