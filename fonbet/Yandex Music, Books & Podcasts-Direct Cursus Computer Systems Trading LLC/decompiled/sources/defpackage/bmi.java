package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bmi implements cmi {
    public final ArrayList a;
    public final List b;
    public final pjc c;

    public bmi(ArrayList arrayList, List list, x0q x0qVar) {
        list.getClass();
        x0qVar.getClass();
        this.a = arrayList;
        this.b = list;
        this.c = x0qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmi)) {
            return false;
        }
        bmi bmiVar = (bmi) obj;
        return this.a.equals(bmiVar.a) && Intrinsics.d(this.b, bmiVar.b) && Intrinsics.d(this.c, bmiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Success(itemsWithLoadingTracks=" + this.a + ", tabs=" + this.b + ", pagingFlow=" + this.c + ")";
    }
}
