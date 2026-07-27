package kotlin.text;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishGlideIntent implements TransformationMethod {
    public final TransformationMethod CatchingFishReduxKtor;

    public CatchingFishGlideIntent(TransformationMethod transformationMethod) {
        this.CatchingFishReduxKtor = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.CatchingFishReduxKtor;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishSnackbar() != 1) {
            return charSequence;
        }
        CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
        CatchingFishParcelableFAB.getClass();
        return CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.CatchingFishReduxKtor;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
