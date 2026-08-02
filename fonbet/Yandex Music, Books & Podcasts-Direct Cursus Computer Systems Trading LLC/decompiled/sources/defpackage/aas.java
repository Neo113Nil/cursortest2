package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aas {
    public static final aas b = new aas(0);
    public static final aas c = new aas(1);
    public static final aas d = new aas(2);
    public final int a;

    public aas(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aas) {
            return this.a == ((aas) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return dfi.i(new StringBuilder("TextDecoration["), lag.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
