package kotlin.text;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class CatchingFishFABRealmRealm {
    public final CatchingFishMVIGlide CatchingFishParcelableFAB;

    public CatchingFishFABRealmRealm(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.CatchingFishParcelableFAB = new CatchingFishGradleWidget(nestedScrollView);
        } else {
            this.CatchingFishParcelableFAB = new CatchingFishMVPExoPlayer(27);
        }
    }
}
