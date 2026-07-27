package kotlin.text;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishViewMVIMVIToast extends LinearLayout {
    public ImageView.ScaleType CatchingFishCloudMessaging;
    public final CatchingFishDataStoreBundle CatchingFishDaggerWebsocket;
    public View.OnLongClickListener CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public PorterDuff.Mode CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final TextInputLayout CatchingFishReduxKtor;
    public ColorStateList CatchingFishViewModelFAB;
    public final CheckableImageButton CatchingFishViewModelScope;
    public CharSequence CatchingFishWorkManager;

    public CatchingFishViewMVIMVIToast(TextInputLayout textInputLayout, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.CatchingFishReduxKtor = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.CatchingFishViewModelScope = checkableImageButton;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(getContext(), null);
        this.CatchingFishDaggerWebsocket = catchingFishDataStoreBundle;
        if (CatchingFishDaggerBiometric.CatchingFishCardViewRealm(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.CatchingFishEspressoTesting;
        checkableImageButton.setOnClickListener(null);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
        this.CatchingFishEspressoTesting = null;
        checkableImageButton.setOnLongClickListener(null);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        if (typedArray.hasValue(70)) {
            this.CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFish(getContext(), catchingFishAsyncTaskDagger, 70);
        }
        if (typedArray.hasValue(71)) {
            this.CatchingFishLayout = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            CatchingFishSnackbar(catchingFishAsyncTaskDagger.CatchingFishMutableLiveData(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.CatchingFishFragmentHandler) {
            this.CatchingFishFragmentHandler = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType CatchingFishAnimationMockk = CatchingFishRobolectricHilt.CatchingFishAnimationMockk(typedArray.getInt(69, -1));
            this.CatchingFishCloudMessaging = CatchingFishAnimationMockk;
            checkableImageButton.setScaleType(CatchingFishAnimationMockk);
        }
        catchingFishDataStoreBundle.setVisibility(8);
        catchingFishDataStoreBundle.setId(R.id.textinput_prefix_text);
        catchingFishDataStoreBundle.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        catchingFishDataStoreBundle.setAccessibilityLiveRegion(1);
        catchingFishDataStoreBundle.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            catchingFishDataStoreBundle.setTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.CatchingFishWorkManager = TextUtils.isEmpty(text2) ? null : text2;
        catchingFishDataStoreBundle.setText(text2);
        CatchingFishDaggerWebsocket();
        addView(checkableImageButton);
        addView(catchingFishDataStoreBundle);
    }

    public final void CatchingFishCoroutine(boolean z) {
        CheckableImageButton checkableImageButton = this.CatchingFishViewModelScope;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            CatchingFishReduxKtor();
            CatchingFishDaggerWebsocket();
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        int i = (this.CatchingFishWorkManager == null || this.CatchingFishOkHttp) ? 8 : 0;
        setVisibility((this.CatchingFishViewModelScope.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.CatchingFishDaggerWebsocket.setVisibility(i);
        this.CatchingFishReduxKtor.CatchingFish();
    }

    public final int CatchingFishParcelableFAB() {
        int i;
        CheckableImageButton checkableImageButton = this.CatchingFishViewModelScope;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.CatchingFishDaggerWebsocket.getPaddingStart() + getPaddingStart() + i;
    }

    public final void CatchingFishReduxKtor() {
        EditText editText = this.CatchingFishReduxKtor.CatchingFishViewModelFAB;
        if (editText == null) {
            return;
        }
        this.CatchingFishDaggerWebsocket.setPaddingRelative(this.CatchingFishViewModelScope.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void CatchingFishSnackbar(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.CatchingFishViewModelScope;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.CatchingFishViewModelFAB;
            PorterDuff.Mode mode = this.CatchingFishLayout;
            TextInputLayout textInputLayout = this.CatchingFishReduxKtor;
            CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, colorStateList, mode);
            CatchingFishCoroutine(true);
            CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout, checkableImageButton, this.CatchingFishViewModelFAB);
            return;
        }
        CatchingFishCoroutine(false);
        View.OnLongClickListener onLongClickListener = this.CatchingFishEspressoTesting;
        checkableImageButton.setOnClickListener(null);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
        this.CatchingFishEspressoTesting = null;
        checkableImageButton.setOnLongClickListener(null);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        CatchingFishReduxKtor();
    }
}
