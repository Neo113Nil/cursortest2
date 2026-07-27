package kotlin.text;

import android.view.View;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomContext {
    public static float CatchingFishParcelableFAB(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void CatchingFishSnackbar(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
