package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class lff implements nff {
    public final ArrayList a;

    public lff(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lff) && this.a.equals(((lff) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(playlists=", ")", this.a);
    }
}
