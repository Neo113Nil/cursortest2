package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class v44 implements x44 {
    public final int a;
    public final ArrayList b;

    public v44(int i) {
        this.a = i;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(s34.a);
        }
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v44) && this.a == ((v44) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Loading(sectionsCount=", ")");
    }
}
