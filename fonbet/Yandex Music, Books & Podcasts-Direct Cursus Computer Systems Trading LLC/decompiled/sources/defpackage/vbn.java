package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vbn {
    public final int a;
    public final wbn b;
    public final ArrayList c;
    public final boolean d;

    public vbn(int i, wbn wbnVar, ArrayList arrayList, boolean z) {
        this.a = i;
        this.b = wbnVar;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbn)) {
            return false;
        }
        vbn vbnVar = (vbn) obj;
        return this.a == vbnVar.a && this.b.equals(vbnVar.b) && this.c.equals(vbnVar.c) && this.d == vbnVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dfi.b(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        ArrayList<wbn> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (wbn wbnVar : arrayList) {
            arrayList2.add(Intrinsics.d(wbnVar, this.b) ? ouj.n(wbnVar.b.a, "(curr)") : wbnVar.b.a);
        }
        return arrayList2.toString();
    }
}
