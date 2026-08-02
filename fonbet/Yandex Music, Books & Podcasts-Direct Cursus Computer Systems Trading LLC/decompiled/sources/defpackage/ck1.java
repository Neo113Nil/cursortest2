package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ck1 {
    public final pas a;
    public final List b;
    public final dtq c;

    public ck1(pas pasVar, List list, dtq dtqVar) {
        list.getClass();
        dtqVar.getClass();
        this.a = pasVar;
        this.b = list;
        this.c = dtqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck1)) {
            return false;
        }
        ck1 ck1Var = (ck1) obj;
        return this.a.equals(ck1Var.a) && Intrinsics.d(this.b, ck1Var.b) && Intrinsics.d(this.c, ck1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ArtistSlideContentUiData(textFactContentUiData=" + this.a + ", coversUrl=" + this.b + ", align=" + this.c + ")";
    }
}
