package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o00 implements r00 {
    public final iab a;
    public final mt b;
    public final ArrayList c;
    public final List d;

    public o00(iab iabVar, mt mtVar, ArrayList arrayList, List list) {
        list.getClass();
        this.a = iabVar;
        this.b = mtVar;
        this.c = arrayList;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return this.a.equals(o00Var.a) && this.b.equals(o00Var.b) && this.c.equals(o00Var.c) && Intrinsics.d(this.d, o00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dfi.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", albumFull=" + this.b + ", listItems=" + this.c + ", duplicates=" + this.d + ")";
    }
}
