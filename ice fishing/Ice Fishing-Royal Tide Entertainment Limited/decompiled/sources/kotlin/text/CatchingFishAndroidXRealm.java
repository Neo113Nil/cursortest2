package kotlin.text;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class CatchingFishAndroidXRealm {
    public static void CatchingFishParcelableFAB(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
