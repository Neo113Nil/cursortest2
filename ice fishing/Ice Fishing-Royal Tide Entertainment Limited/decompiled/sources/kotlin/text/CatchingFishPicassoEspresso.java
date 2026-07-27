package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishPicassoEspresso {
    public CharSequence CatchingFish;
    public int CatchingFishAnimationMockk;
    public int CatchingFishCardViewRealm;
    public Typeface CatchingFishCardViewView;
    public FrameLayout CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public int CatchingFishCoroutineFlow;
    public ColorStateList CatchingFishDaggerHiltFAB;
    public final TimeInterpolator CatchingFishDaggerWebsocket;
    public AnimatorSet CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public CatchingFishDataStoreBundle CatchingFishGsonAppCompat;
    public int CatchingFishJetpackCompose;
    public LinearLayout CatchingFishLayout;
    public CatchingFishDataStoreBundle CatchingFishNavigation;
    public final float CatchingFishOkHttp;
    public final int CatchingFishParcelableFAB;
    public boolean CatchingFishParcelableFlux;
    public ColorStateList CatchingFishPayPal;
    public final TimeInterpolator CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public final int CatchingFishSnackbar;
    public CharSequence CatchingFishSpannableWidget;
    public CharSequence CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public final TextInputLayout CatchingFishViewModelFAB;
    public final Context CatchingFishViewModelScope;
    public final TimeInterpolator CatchingFishWorkManager;

    public CatchingFishPicassoEspresso(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.CatchingFishViewModelScope = context;
        this.CatchingFishViewModelFAB = textInputLayout;
        this.CatchingFishOkHttp = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.CatchingFishParcelableFAB = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort4, 217);
        this.CatchingFishSnackbar = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationMedium4, 167);
        this.CatchingFishCoroutine = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort4, 167);
        this.CatchingFishReduxKtor = CatchingFishHiltMVPToast.CatchingFishCustomView(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, CatchingFishRobolectricRoom.CatchingFishReduxKtor);
        LinearInterpolator linearInterpolator = CatchingFishRobolectricRoom.CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMVPToast.CatchingFishCustomView(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.CatchingFishWorkManager = CatchingFishHiltMVPToast.CatchingFishCustomView(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void CatchingFishCoroutine() {
        AnimatorSet animatorSet = this.CatchingFishEspressoTesting;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final TextView CatchingFishDaggerWebsocket(int i) {
        if (i == 1) {
            return this.CatchingFishNavigation;
        }
        if (i != 2) {
            return null;
        }
        return this.CatchingFishGsonAppCompat;
    }

    public final void CatchingFishLayout(int i, int i2, boolean z) {
        TextView CatchingFishDaggerWebsocket;
        TextView CatchingFishDaggerWebsocket2;
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            catchingFishPicassoEspresso.CatchingFishEspressoTesting = animatorSet;
            ArrayList arrayList = new ArrayList();
            catchingFishPicassoEspresso.CatchingFishReduxKtor(arrayList, catchingFishPicassoEspresso.CatchingFishParcelableFlux, catchingFishPicassoEspresso.CatchingFishGsonAppCompat, 2, i, i2);
            catchingFishPicassoEspresso.CatchingFishReduxKtor(arrayList, catchingFishPicassoEspresso.CatchingFishRoomDatabase, catchingFishPicassoEspresso.CatchingFishNavigation, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            CatchingFishGlideMockkFAB catchingFishGlideMockkFAB = new CatchingFishGlideMockkFAB(this, i2, CatchingFishDaggerWebsocket(i), i, catchingFishPicassoEspresso.CatchingFishDaggerWebsocket(i2));
            catchingFishPicassoEspresso = this;
            animatorSet.addListener(catchingFishGlideMockkFAB);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (CatchingFishDaggerWebsocket2 = catchingFishPicassoEspresso.CatchingFishDaggerWebsocket(i2)) != null) {
                CatchingFishDaggerWebsocket2.setVisibility(0);
                CatchingFishDaggerWebsocket2.setAlpha(1.0f);
            }
            if (i != 0 && (CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i)) != null) {
                CatchingFishDaggerWebsocket.setVisibility(4);
                if (i == 1) {
                    CatchingFishDaggerWebsocket.setText((CharSequence) null);
                }
            }
            catchingFishPicassoEspresso.CatchingFishUnitTesting = i2;
        }
        TextInputLayout textInputLayout = catchingFishPicassoEspresso.CatchingFishViewModelFAB;
        textInputLayout.CatchingFishJetpackCompose();
        textInputLayout.CatchingFishSpannableWidget(z, false);
        textInputLayout.CatchingFishCardViewRealm();
    }

    public final void CatchingFishParcelableFAB(CatchingFishDataStoreBundle catchingFishDataStoreBundle, int i) {
        if (this.CatchingFishLayout == null && this.CatchingFishCloudMessaging == null) {
            Context context = this.CatchingFishViewModelScope;
            LinearLayout linearLayout = new LinearLayout(context);
            this.CatchingFishLayout = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.CatchingFishLayout;
            TextInputLayout textInputLayout = this.CatchingFishViewModelFAB;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.CatchingFishCloudMessaging = new FrameLayout(context);
            this.CatchingFishLayout.addView(this.CatchingFishCloudMessaging, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                CatchingFishSnackbar();
            }
        }
        if (i == 0 || i == 1) {
            this.CatchingFishCloudMessaging.setVisibility(0);
            this.CatchingFishCloudMessaging.addView(catchingFishDataStoreBundle);
        } else {
            this.CatchingFishLayout.addView(catchingFishDataStoreBundle, new LinearLayout.LayoutParams(-2, -2));
        }
        this.CatchingFishLayout.setVisibility(0);
        this.CatchingFishFragmentHandler++;
    }

    public final void CatchingFishReduxKtor(ArrayList arrayList, boolean z, CatchingFishDataStoreBundle catchingFishDataStoreBundle, int i, int i2, int i3) {
        if (catchingFishDataStoreBundle == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(catchingFishDataStoreBundle, (Property<CatchingFishDataStoreBundle, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.CatchingFishCoroutine;
            ofFloat.setDuration(z2 ? this.CatchingFishSnackbar : i4);
            ofFloat.setInterpolator(z2 ? this.CatchingFishDaggerWebsocket : this.CatchingFishWorkManager);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(catchingFishDataStoreBundle, (Property<CatchingFishDataStoreBundle, Float>) View.TRANSLATION_Y, -this.CatchingFishOkHttp, 0.0f);
            ofFloat2.setDuration(this.CatchingFishParcelableFAB);
            ofFloat2.setInterpolator(this.CatchingFishReduxKtor);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishLayout != null) {
            TextInputLayout textInputLayout = this.CatchingFishViewModelFAB;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.CatchingFishViewModelScope;
                boolean CatchingFishCardViewRealm = CatchingFishDaggerBiometric.CatchingFishCardViewRealm(context);
                LinearLayout linearLayout = this.CatchingFishLayout;
                int paddingStart = editText.getPaddingStart();
                if (CatchingFishCardViewRealm) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (CatchingFishCardViewRealm) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (CatchingFishCardViewRealm) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final boolean CatchingFishViewModelFAB(CatchingFishDataStoreBundle catchingFishDataStoreBundle, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.CatchingFishViewModelFAB;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.CatchingFishAnimationMockk == this.CatchingFishUnitTesting && catchingFishDataStoreBundle != null && TextUtils.equals(catchingFishDataStoreBundle.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void CatchingFishViewModelScope(CatchingFishDataStoreBundle catchingFishDataStoreBundle, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.CatchingFishLayout;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.CatchingFishCloudMessaging) != null) {
            frameLayout.removeView(catchingFishDataStoreBundle);
        } else {
            linearLayout.removeView(catchingFishDataStoreBundle);
        }
        int i2 = this.CatchingFishFragmentHandler - 1;
        this.CatchingFishFragmentHandler = i2;
        LinearLayout linearLayout2 = this.CatchingFishLayout;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void CatchingFishWorkManager() {
        this.CatchingFishStateLiveData = null;
        CatchingFishCoroutine();
        if (this.CatchingFishUnitTesting == 1) {
            if (!this.CatchingFishParcelableFlux || TextUtils.isEmpty(this.CatchingFishSpannableWidget)) {
                this.CatchingFishAnimationMockk = 0;
            } else {
                this.CatchingFishAnimationMockk = 2;
            }
        }
        CatchingFishLayout(this.CatchingFishUnitTesting, this.CatchingFishAnimationMockk, CatchingFishViewModelFAB(this.CatchingFishNavigation, ""));
    }
}
