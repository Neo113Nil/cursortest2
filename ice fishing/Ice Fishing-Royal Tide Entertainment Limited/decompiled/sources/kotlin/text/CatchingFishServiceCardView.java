package kotlin.text;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class CatchingFishServiceCardView extends CatchingFishDaggerFlux {
    public final CatchingFishWidgetRealm CatchingFishCloudMessaging;
    public final int CatchingFishDaggerWebsocket;
    public AnimatorSet CatchingFishEspressoTesting;
    public final CatchingFishWebSocketRedux CatchingFishFragmentHandler;
    public EditText CatchingFishLayout;
    public ValueAnimator CatchingFishOkHttp;
    public final TimeInterpolator CatchingFishViewModelFAB;
    public final TimeInterpolator CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishServiceCardView(CatchingFishFragmentCameraX catchingFishFragmentCameraX) {
        super(catchingFishFragmentCameraX);
        this.CatchingFishFragmentHandler = new CatchingFishWebSocketRedux(0, this);
        this.CatchingFishCloudMessaging = new CatchingFishWidgetRealm(this, 0);
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(catchingFishFragmentCameraX.getContext(), R.attr.motionDurationShort3, 100);
        this.CatchingFishWorkManager = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(catchingFishFragmentCameraX.getContext(), R.attr.motionDurationShort3, 150);
        this.CatchingFishViewModelScope = CatchingFishHiltMVPToast.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), R.attr.motionEasingLinearInterpolator, CatchingFishRobolectricRoom.CatchingFishParcelableFAB);
        this.CatchingFishViewModelFAB = CatchingFishHiltMVPToast.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFish() {
        EditText editText = this.CatchingFishLayout;
        if (editText != null) {
            editText.post(new CatchingFishMVPLayout(7, this));
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishCoroutine() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final boolean CatchingFishCoroutineFlow() {
        EditText editText = this.CatchingFishLayout;
        if (editText != null) {
            return (editText.hasFocus() || this.CatchingFishReduxKtor.hasFocus()) && this.CatchingFishLayout.getText().length() > 0;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnFocusChangeListener CatchingFishDaggerWebsocket() {
        return this.CatchingFishCloudMessaging;
    }

    public final void CatchingFishJetpackCompose(boolean z) {
        boolean z2 = this.CatchingFishSnackbar.CatchingFishReduxKtor() == z;
        if (z && !this.CatchingFishEspressoTesting.isRunning()) {
            this.CatchingFishOkHttp.cancel();
            this.CatchingFishEspressoTesting.start();
            if (z2) {
                this.CatchingFishEspressoTesting.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.CatchingFishEspressoTesting.cancel();
        this.CatchingFishOkHttp.start();
        if (z2) {
            this.CatchingFishOkHttp.end();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishNavigation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.CatchingFishViewModelFAB);
        ofFloat.setDuration(this.CatchingFishWorkManager);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kotlin.text.CatchingFishBundleLifecycle
            public final /* synthetic */ CatchingFishServiceCardView CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishServiceCardView catchingFishServiceCardView = this.CatchingFishSnackbar;
                        catchingFishServiceCardView.getClass();
                        catchingFishServiceCardView.CatchingFishReduxKtor.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        CatchingFishServiceCardView catchingFishServiceCardView2 = this.CatchingFishSnackbar;
                        catchingFishServiceCardView2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = catchingFishServiceCardView2.CatchingFishReduxKtor;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.CatchingFishViewModelScope;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.CatchingFishDaggerWebsocket;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kotlin.text.CatchingFishBundleLifecycle
            public final /* synthetic */ CatchingFishServiceCardView CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishServiceCardView catchingFishServiceCardView = this.CatchingFishSnackbar;
                        catchingFishServiceCardView.getClass();
                        catchingFishServiceCardView.CatchingFishReduxKtor.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        CatchingFishServiceCardView catchingFishServiceCardView2 = this.CatchingFishSnackbar;
                        catchingFishServiceCardView2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = catchingFishServiceCardView2.CatchingFishReduxKtor;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.CatchingFishEspressoTesting = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.CatchingFishEspressoTesting.addListener(new CatchingFishLiveDataGraphQL(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kotlin.text.CatchingFishBundleLifecycle
            public final /* synthetic */ CatchingFishServiceCardView CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishServiceCardView catchingFishServiceCardView = this.CatchingFishSnackbar;
                        catchingFishServiceCardView.getClass();
                        catchingFishServiceCardView.CatchingFishReduxKtor.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        CatchingFishServiceCardView catchingFishServiceCardView2 = this.CatchingFishSnackbar;
                        catchingFishServiceCardView2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = catchingFishServiceCardView2.CatchingFishReduxKtor;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.CatchingFishOkHttp = ofFloat3;
        ofFloat3.addListener(new CatchingFishLiveDataGraphQL(this, i));
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishOkHttp(EditText editText) {
        this.CatchingFishLayout = editText;
        this.CatchingFishParcelableFAB.setEndIconVisible(CatchingFishCoroutineFlow());
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishSnackbar.CatchingFish != null) {
            return;
        }
        CatchingFishJetpackCompose(CatchingFishCoroutineFlow());
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishReduxKtor() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishStateLiveData(boolean z) {
        if (this.CatchingFishSnackbar.CatchingFish == null) {
            return;
        }
        CatchingFishJetpackCompose(z);
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnFocusChangeListener CatchingFishViewModelScope() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnClickListener CatchingFishWorkManager() {
        return this.CatchingFishFragmentHandler;
    }
}
