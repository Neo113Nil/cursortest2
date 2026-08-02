package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f36 implements h36 {
    public final ArrayList a;

    public f36(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f36) && this.a.equals(((f36) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Loaded(concertsItems=", ")", this.a);
    }
}
