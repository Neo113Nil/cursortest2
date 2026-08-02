package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vq51 {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public vq51(boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = z;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq51)) {
            return false;
        }
        vq51 vq51Var = (vq51) obj;
        return this.a == vq51Var.a && this.b.equals(vq51Var.b) && this.c.equals(vq51Var.c) && this.d.equals(vq51Var.d);
    }

    public final int hashCode() {
        return ly3.b(ly3.b(ly3.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "YbCardsWithPromosEntity(cardsPartial=" + this.a + ", cards=" + this.b + ", promos=" + this.c + ", carousel=" + this.d + ", cardIcons=null)";
    }
}
