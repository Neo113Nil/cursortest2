package kotlin.text;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class CatchingFishToastEspresso {
    public static int CatchingFishParcelableFAB(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void CatchingFishSnackbar(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
