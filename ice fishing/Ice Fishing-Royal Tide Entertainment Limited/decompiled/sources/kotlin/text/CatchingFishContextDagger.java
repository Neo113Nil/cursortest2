package kotlin.text;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class CatchingFishContextDagger extends CatchingFishKtorContext {
    public boolean CatchingFishCloudMessaging;
    public boolean CatchingFishEspressoTesting;

    @Override // kotlin.text.CatchingFishKtorContext
    public final void CatchingFishDaggerWebsocket(ConstraintLayout constraintLayout) {
        CatchingFishReduxKtor(constraintLayout);
    }

    public abstract void CatchingFishFragmentHandler(CatchingFishBiometricOkHttp catchingFishBiometricOkHttp, int i, int i2);

    @Override // kotlin.text.CatchingFishKtorContext
    public void CatchingFishViewModelScope(AttributeSet attributeSet) {
        super.CatchingFishViewModelScope(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishSnackbar);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.CatchingFishCloudMessaging = true;
                } else if (index == 22) {
                    this.CatchingFishEspressoTesting = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // kotlin.text.CatchingFishKtorContext, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.CatchingFishCloudMessaging || this.CatchingFishEspressoTesting) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.CatchingFishDaggerWebsocket; i++) {
                    View view = (View) constraintLayout.CatchingFishReduxKtor.get(this.CatchingFishReduxKtor[i]);
                    if (view != null) {
                        if (this.CatchingFishCloudMessaging) {
                            view.setVisibility(visibility);
                        }
                        if (this.CatchingFishEspressoTesting && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        CatchingFishReduxKtor((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        CatchingFishReduxKtor((ConstraintLayout) parent);
    }
}
