package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mdc implements odc {
    public final ArrayList a;
    public final int b;
    public final ArrayList c;
    public final List d;

    public mdc(ArrayList arrayList, int i, ArrayList arrayList2, List list) {
        list.getClass();
        this.a = arrayList;
        this.b = i;
        this.c = arrayList2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdc)) {
            return false;
        }
        mdc mdcVar = (mdc) obj;
        return this.a.equals(mdcVar.a) && this.b == mdcVar.b && this.c.equals(mdcVar.c) && Intrinsics.d(this.d, mdcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dfi.b(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Success(filters=" + this.a + ", selectedIndex=" + this.b + ", tracksUi=" + this.c + ", tracksData=" + this.d + ")";
    }
}
