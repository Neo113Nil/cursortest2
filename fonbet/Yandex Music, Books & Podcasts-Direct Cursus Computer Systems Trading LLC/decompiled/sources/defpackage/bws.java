package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class bws {
    public final ArrayList a;

    public bws(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bws) && this.a.equals(((bws) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("TrackInfo(trackInfo=", ")", this.a);
    }
}
