package kotlin.text;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class CatchingFishMockkFragment {
    public static final CatchingFishGlideMockkToast CatchingFishParcelableFAB;
    public static final CatchingFishGraphQLMVVMMVP CatchingFishSnackbar;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishParcelableFAB = new CatchingFishLayoutBundle();
        } else {
            CatchingFishParcelableFAB = new CatchingFishGlideMockkToast();
        }
        CatchingFishSnackbar = new CatchingFishGraphQLMVVMMVP(Float.class, "translationAlpha", 5);
        new CatchingFishGraphQLMVVMMVP(Rect.class, "clipBounds", 6);
    }

    public static void CatchingFishParcelableFAB(View view, int i, int i2, int i3, int i4) {
        CatchingFishParcelableFAB.CatchingFishJUnitRealm(view, i, i2, i3, i4);
    }

    public static void CatchingFishSnackbar(View view, int i) {
        CatchingFishParcelableFAB.CatchingFishPayPalLiveData(view, i);
    }
}
