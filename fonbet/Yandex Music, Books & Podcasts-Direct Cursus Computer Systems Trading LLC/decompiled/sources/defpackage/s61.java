package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s61 implements t61 {
    public final ArrayList a;

    public s61(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s61) && this.a.equals(((s61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(donations=", ")", this.a);
    }
}
