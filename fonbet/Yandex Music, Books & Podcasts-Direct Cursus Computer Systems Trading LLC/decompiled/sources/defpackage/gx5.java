package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class gx5 implements lx5 {
    public final ArrayList a;

    public gx5(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx5) && this.a.equals(((gx5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Content(locations=", ")", this.a);
    }
}
