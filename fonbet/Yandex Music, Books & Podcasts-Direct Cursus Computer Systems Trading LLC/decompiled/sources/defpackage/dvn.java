package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class dvn extends a4g {
    public final ArrayList a;

    public dvn(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvn) && this.a.equals(((dvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Tracks(trackIds=", ")", this.a);
    }
}
