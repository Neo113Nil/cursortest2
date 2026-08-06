package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a81 {
    public final int GWasM1elztuh;
    public static final a81 Yi7zF1RB1 = new a81(0);
    public static final a81 X1lG3V04pd = new a81(1);

    public a81(int i) {
        this.GWasM1elztuh = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a81) {
            return this.GWasM1elztuh == ((a81) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh;
    }

    public final String toString() {
        int i = this.GWasM1elztuh;
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
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + xa0.GWasM1elztuh(arrayList, ", ", null, 62) + ']';
    }
}
