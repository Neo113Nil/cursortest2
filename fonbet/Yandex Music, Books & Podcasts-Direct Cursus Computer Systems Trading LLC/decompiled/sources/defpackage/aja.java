package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class aja implements cja {
    public final int a;
    public final ArrayList b;

    public aja(int i) {
        this.a = i;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aja) && this.a == ((aja) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Loading(sectionsCount=", ")");
    }
}
