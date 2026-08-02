package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class z2s implements a3s {
    public final ArrayList a;

    public z2s(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.a3s
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2s) && this.a.equals(((z2s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(tabs=", ")", this.a);
    }
}
