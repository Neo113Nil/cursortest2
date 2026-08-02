package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class nam {
    public final ArrayList a;
    public final ArrayList b;

    public nam(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nam)) {
            return false;
        }
        nam namVar = (nam) obj;
        return this.a.equals(namVar.a) && this.b.equals(namVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PodcastListScreenUiData(postponedPodcastList=" + this.a + ", episodeList=" + this.b + ")";
    }
}
