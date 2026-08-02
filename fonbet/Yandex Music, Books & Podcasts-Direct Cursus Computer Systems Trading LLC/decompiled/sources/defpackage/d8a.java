package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class d8a implements f8a {
    public final ArrayList a;

    public d8a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8a) && this.a.equals(((d8a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Loaded(donations=", ")", this.a);
    }
}
