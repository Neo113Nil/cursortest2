package kotlin.text;

import android.view.View;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class CatchingFishAdMobCustomView {
    public static final CatchingFishAdMobCustomView CatchingFishParcelableFAB = new CatchingFishAdMobCustomView();

    public final void CatchingFishParcelableFAB(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
