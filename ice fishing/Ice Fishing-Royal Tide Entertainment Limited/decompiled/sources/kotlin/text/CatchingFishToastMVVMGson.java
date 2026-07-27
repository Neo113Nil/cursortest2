package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishToastMVVMGson {
    public final int CatchingFishParcelableFAB;

    public CatchingFishToastMVVMGson(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishToastMVVMGson) {
            return this.CatchingFishParcelableFAB == ((CatchingFishToastMVVMGson) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB;
    }

    public final String toString() {
        int i = this.CatchingFishParcelableFAB;
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
        return "TextDecoration[" + CatchingFishReduxFirebase.CatchingFishParcelableFAB(", ", arrayList) + ']';
    }
}
