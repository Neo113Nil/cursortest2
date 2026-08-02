package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ez1 {
    public final ArrayList a;
    public final ArrayList b;

    public ez1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return this.a.equals(ez1Var.a) && this.b.equals(ez1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudiobookListScreenUiData(postponedAudiobookList=" + this.a + ", chapterList=" + this.b + ")";
    }
}
