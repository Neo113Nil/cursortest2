package kotlin.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpXMLLayout {
    public final SparseArray CatchingFishParcelableFAB;
    public CatchingFishFirebaseFABGson CatchingFishSnackbar;

    public CatchingFishOkHttpXMLLayout(int i) {
        this.CatchingFishParcelableFAB = new SparseArray(i);
    }

    public final void CatchingFishParcelableFAB(CatchingFishFirebaseFABGson catchingFishFirebaseFABGson, int i, int i2) {
        int CatchingFishParcelableFAB = catchingFishFirebaseFABGson.CatchingFishParcelableFAB(i);
        SparseArray sparseArray = this.CatchingFishParcelableFAB;
        CatchingFishOkHttpXMLLayout catchingFishOkHttpXMLLayout = sparseArray == null ? null : (CatchingFishOkHttpXMLLayout) sparseArray.get(CatchingFishParcelableFAB);
        if (catchingFishOkHttpXMLLayout == null) {
            catchingFishOkHttpXMLLayout = new CatchingFishOkHttpXMLLayout(1);
            sparseArray.put(catchingFishFirebaseFABGson.CatchingFishParcelableFAB(i), catchingFishOkHttpXMLLayout);
        }
        if (i2 > i) {
            catchingFishOkHttpXMLLayout.CatchingFishParcelableFAB(catchingFishFirebaseFABGson, i + 1, i2);
        } else {
            catchingFishOkHttpXMLLayout.CatchingFishSnackbar = catchingFishFirebaseFABGson;
        }
    }
}
