package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class sy implements uy {
    public final ArrayList a;

    public sy(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy) && this.a.equals(((sy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Tracks(trackList=", ")", this.a);
    }
}
