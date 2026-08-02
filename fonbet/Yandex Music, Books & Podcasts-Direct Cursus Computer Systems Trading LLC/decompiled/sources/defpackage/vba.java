package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vba extends wba {
    public final ArrayList a;
    public final List b;

    public vba(ArrayList arrayList, List list) {
        list.getClass();
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vba)) {
            return false;
        }
        vba vbaVar = (vba) obj;
        return this.a.equals(vbaVar.a) && Intrinsics.d(this.b, vbaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(remainingTracks=" + this.a + ", downloadingTracks=" + this.b + ")";
    }
}
