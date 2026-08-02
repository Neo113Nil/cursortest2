package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab3 implements cb3 {
    public final mt a;
    public final iab b;
    public final h93 c;
    public final ArrayList d;
    public final o8w e;

    public ab3(mt mtVar, iab iabVar, h93 h93Var, ArrayList arrayList, o8w o8wVar) {
        h93Var.getClass();
        this.a = mtVar;
        this.b = iabVar;
        this.c = h93Var;
        this.d = arrayList;
        this.e = o8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab3)) {
            return false;
        }
        ab3 ab3Var = (ab3) obj;
        return this.a.equals(ab3Var.a) && this.b.equals(ab3Var.b) && Intrinsics.d(this.c, ab3Var.c) && this.d.equals(ab3Var.d) && this.e.equals(ab3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dfi.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Success(albumFull=" + this.a + ", header=" + this.b + ", info=" + this.c + ", trackList=" + this.d + ", yandexBooks=" + this.e + ")";
    }
}
