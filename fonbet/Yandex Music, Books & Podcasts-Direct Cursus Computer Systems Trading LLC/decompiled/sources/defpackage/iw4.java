package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iw4 {
    public final List a;
    public final List b;

    public iw4(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw4)) {
            return false;
        }
        iw4 iw4Var = (iw4) obj;
        return Intrinsics.d(this.a, iw4Var.a) && Intrinsics.d(this.b, iw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollectionAudiobookListData(albumList=" + this.a + ", trackList=" + this.b + ")";
    }
}
