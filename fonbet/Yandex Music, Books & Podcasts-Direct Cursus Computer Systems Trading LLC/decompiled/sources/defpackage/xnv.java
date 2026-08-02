package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class xnv {
    public final ArrayList a;

    public xnv(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnv) && this.a.equals(((xnv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("WidgetRecentlyPlayedRow(recentlyPlayed=", ")", this.a);
    }
}
