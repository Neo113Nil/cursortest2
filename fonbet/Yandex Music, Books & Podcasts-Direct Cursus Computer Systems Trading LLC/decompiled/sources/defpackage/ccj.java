package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ccj implements ecj {
    public final ArrayList a;

    public ccj(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccj) && this.a.equals(((ccj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Available(contentBlocks=", ")", this.a);
    }
}
