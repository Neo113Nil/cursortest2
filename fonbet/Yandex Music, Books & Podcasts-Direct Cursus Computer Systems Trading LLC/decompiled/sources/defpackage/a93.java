package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a93 implements b93 {
    public final ArrayList a;

    public a93(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a93) && this.a.equals(((a93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(chapters=", ")", this.a);
    }
}
