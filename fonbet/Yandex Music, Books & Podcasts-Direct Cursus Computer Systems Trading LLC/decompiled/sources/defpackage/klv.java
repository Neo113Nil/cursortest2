package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class klv {
    public final List a;
    public final ArrayList b;

    public klv(List list, int i) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            Object obj2 = (flv) obj;
            if (i2 == i) {
                obj2 = ykv.a;
            }
            arrayList.add(obj2);
            i2 = i3;
        }
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klv)) {
            return false;
        }
        klv klvVar = (klv) obj;
        return Intrinsics.d(this.a, klvVar.a) && Intrinsics.d(this.b, klvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Config(buttonsList=" + this.a + ", loadingButtonsList=" + this.b + ")";
    }
}
