package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zl1 implements am1 {
    public final ArrayList a;

    public zl1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl1) && this.a.equals(((zl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(tracks=", ")", this.a);
    }
}
