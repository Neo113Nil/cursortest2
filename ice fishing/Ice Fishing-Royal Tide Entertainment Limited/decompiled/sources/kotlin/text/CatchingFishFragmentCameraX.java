package kotlin.text;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishFragmentCameraX extends LinearLayout {
    public CharSequence CatchingFish;
    public PorterDuff.Mode CatchingFishAnimationMockk;
    public final CatchingFishToolbarGradle CatchingFishCloudMessaging;
    public boolean CatchingFishCoroutineFlow;
    public EditText CatchingFishDaggerHiltFAB;
    public final FrameLayout CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public final CheckableImageButton CatchingFishFragmentHandler;
    public final CatchingFishRoomCameraX CatchingFishGsonAppCompat;
    public final CatchingFishDataStoreBundle CatchingFishJetpackCompose;
    public View.OnLongClickListener CatchingFishLayout;
    public View.OnLongClickListener CatchingFishNavigation;
    public final LinkedHashSet CatchingFishOkHttp;
    public AccessibilityManager.TouchExplorationStateChangeListener CatchingFishParcelableFlux;
    public final TextInputLayout CatchingFishReduxKtor;
    public ImageView.ScaleType CatchingFishRoomDatabase;
    public final AccessibilityManager CatchingFishSpannableWidget;
    public int CatchingFishStateLiveData;
    public ColorStateList CatchingFishUnitTesting;
    public PorterDuff.Mode CatchingFishViewModelFAB;
    public ColorStateList CatchingFishViewModelScope;
    public final CheckableImageButton CatchingFishWorkManager;

    public CatchingFishFragmentCameraX(TextInputLayout textInputLayout, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.CatchingFishEspressoTesting = 0;
        this.CatchingFishOkHttp = new LinkedHashSet();
        this.CatchingFishGsonAppCompat = new CatchingFishRoomCameraX(this);
        CatchingFishStripeAPIMockk catchingFishStripeAPIMockk = new CatchingFishStripeAPIMockk(this);
        this.CatchingFishSpannableWidget = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.CatchingFishReduxKtor = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.CatchingFishDaggerWebsocket = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton CatchingFishParcelableFAB = CatchingFishParcelableFAB(this, from, R.id.text_input_error_icon);
        this.CatchingFishWorkManager = CatchingFishParcelableFAB;
        CheckableImageButton CatchingFishParcelableFAB2 = CatchingFishParcelableFAB(frameLayout, from, R.id.text_input_end_icon);
        this.CatchingFishFragmentHandler = CatchingFishParcelableFAB2;
        this.CatchingFishCloudMessaging = new CatchingFishToolbarGradle(this, catchingFishAsyncTaskDagger);
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(getContext(), null);
        this.CatchingFishJetpackCompose = catchingFishDataStoreBundle;
        TypedArray typedArray = (TypedArray) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        if (typedArray.hasValue(38)) {
            this.CatchingFishViewModelScope = CatchingFishDaggerBiometric.CatchingFish(getContext(), catchingFishAsyncTaskDagger, 38);
        }
        if (typedArray.hasValue(39)) {
            this.CatchingFishViewModelFAB = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            CatchingFishLayout(catchingFishAsyncTaskDagger.CatchingFishMutableLiveData(37));
        }
        CatchingFishParcelableFAB.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        CatchingFishParcelableFAB.setImportantForAccessibility(2);
        CatchingFishParcelableFAB.setClickable(false);
        CatchingFishParcelableFAB.setPressable(false);
        CatchingFishParcelableFAB.setCheckable(false);
        CatchingFishParcelableFAB.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.CatchingFishUnitTesting = CatchingFishDaggerBiometric.CatchingFish(getContext(), catchingFishAsyncTaskDagger, 32);
            }
            if (typedArray.hasValue(33)) {
                this.CatchingFishAnimationMockk = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            CatchingFishViewModelScope(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && CatchingFishParcelableFAB2.getContentDescription() != (text = typedArray.getText(27))) {
                CatchingFishParcelableFAB2.setContentDescription(text);
            }
            CatchingFishParcelableFAB2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.CatchingFishUnitTesting = CatchingFishDaggerBiometric.CatchingFish(getContext(), catchingFishAsyncTaskDagger, 55);
            }
            if (typedArray.hasValue(56)) {
                this.CatchingFishAnimationMockk = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(typedArray.getInt(56, -1), null);
            }
            CatchingFishViewModelScope(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (CatchingFishParcelableFAB2.getContentDescription() != text2) {
                CatchingFishParcelableFAB2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.CatchingFishStateLiveData) {
            this.CatchingFishStateLiveData = dimensionPixelSize;
            CatchingFishParcelableFAB2.setMinimumWidth(dimensionPixelSize);
            CatchingFishParcelableFAB2.setMinimumHeight(dimensionPixelSize);
            CatchingFishParcelableFAB.setMinimumWidth(dimensionPixelSize);
            CatchingFishParcelableFAB.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType CatchingFishAnimationMockk = CatchingFishRobolectricHilt.CatchingFishAnimationMockk(typedArray.getInt(31, -1));
            this.CatchingFishRoomDatabase = CatchingFishAnimationMockk;
            CatchingFishParcelableFAB2.setScaleType(CatchingFishAnimationMockk);
            CatchingFishParcelableFAB.setScaleType(CatchingFishAnimationMockk);
        }
        catchingFishDataStoreBundle.setVisibility(8);
        catchingFishDataStoreBundle.setId(R.id.textinput_suffix_text);
        catchingFishDataStoreBundle.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        catchingFishDataStoreBundle.setAccessibilityLiveRegion(1);
        catchingFishDataStoreBundle.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            catchingFishDataStoreBundle.setTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.CatchingFish = TextUtils.isEmpty(text3) ? null : text3;
        catchingFishDataStoreBundle.setText(text3);
        CatchingFishUnitTesting();
        frameLayout.addView(CatchingFishParcelableFAB2);
        addView(catchingFishDataStoreBundle);
        addView(frameLayout);
        addView(CatchingFishParcelableFAB);
        textInputLayout.CatchingFishDaggerMVVM.add(catchingFishStripeAPIMockk);
        if (textInputLayout.CatchingFishViewModelFAB != null) {
            catchingFishStripeAPIMockk.CatchingFishParcelableFAB(textInputLayout);
        }
        addOnAttachStateChangeListener(new CatchingFishToastWidget(3, this));
    }

    public final void CatchingFishCloudMessaging() {
        this.CatchingFishDaggerWebsocket.setVisibility((this.CatchingFishFragmentHandler.getVisibility() != 0 || CatchingFishDaggerWebsocket()) ? 8 : 0);
        setVisibility((CatchingFishReduxKtor() || CatchingFishDaggerWebsocket() || !((this.CatchingFish == null || this.CatchingFishCoroutineFlow) ? 8 : false)) ? 0 : 8);
    }

    public final int CatchingFishCoroutine() {
        int marginStart;
        if (CatchingFishReduxKtor() || CatchingFishDaggerWebsocket()) {
            CheckableImageButton checkableImageButton = this.CatchingFishFragmentHandler;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.CatchingFishJetpackCompose.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishWorkManager.getVisibility() == 0;
    }

    public final void CatchingFishEspressoTesting() {
        CheckableImageButton checkableImageButton = this.CatchingFishWorkManager;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.CatchingFishReduxKtor;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.CatchingFishUnitTesting.CatchingFishRoomDatabase && textInputLayout.CatchingFishAnimationMockk()) ? 0 : 8);
        CatchingFishCloudMessaging();
        CatchingFishOkHttp();
        if (this.CatchingFishEspressoTesting != 0) {
            return;
        }
        textInputLayout.CatchingFish();
    }

    public final void CatchingFishFragmentHandler(CatchingFishDaggerFlux catchingFishDaggerFlux) {
        if (this.CatchingFishDaggerHiltFAB == null) {
            return;
        }
        if (catchingFishDaggerFlux.CatchingFishDaggerWebsocket() != null) {
            this.CatchingFishDaggerHiltFAB.setOnFocusChangeListener(catchingFishDaggerFlux.CatchingFishDaggerWebsocket());
        }
        if (catchingFishDaggerFlux.CatchingFishViewModelScope() != null) {
            this.CatchingFishFragmentHandler.setOnFocusChangeListener(catchingFishDaggerFlux.CatchingFishViewModelScope());
        }
    }

    public final void CatchingFishLayout(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.CatchingFishWorkManager;
        checkableImageButton.setImageDrawable(drawable);
        CatchingFishEspressoTesting();
        CatchingFishRobolectricHilt.CatchingFishLayout(this.CatchingFishReduxKtor, checkableImageButton, this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB);
    }

    public final void CatchingFishOkHttp() {
        TextInputLayout textInputLayout = this.CatchingFishReduxKtor;
        if (textInputLayout.CatchingFishViewModelFAB == null) {
            return;
        }
        this.CatchingFishJetpackCompose.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.CatchingFishViewModelFAB.getPaddingTop(), (CatchingFishReduxKtor() || CatchingFishDaggerWebsocket()) ? 0 : textInputLayout.CatchingFishViewModelFAB.getPaddingEnd(), textInputLayout.CatchingFishViewModelFAB.getPaddingBottom());
    }

    public final CheckableImageButton CatchingFishParcelableFAB(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (CatchingFishDaggerBiometric.CatchingFishCardViewRealm(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final boolean CatchingFishReduxKtor() {
        return this.CatchingFishDaggerWebsocket.getVisibility() == 0 && this.CatchingFishFragmentHandler.getVisibility() == 0;
    }

    public final CatchingFishDaggerFlux CatchingFishSnackbar() {
        CatchingFishDaggerFlux catchingFishIntentGson;
        int i = this.CatchingFishEspressoTesting;
        CatchingFishToolbarGradle catchingFishToolbarGradle = this.CatchingFishCloudMessaging;
        SparseArray sparseArray = catchingFishToolbarGradle.CatchingFishParcelableFAB;
        CatchingFishDaggerFlux catchingFishDaggerFlux = (CatchingFishDaggerFlux) sparseArray.get(i);
        if (catchingFishDaggerFlux != null) {
            return catchingFishDaggerFlux;
        }
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = catchingFishToolbarGradle.CatchingFishSnackbar;
        if (i == -1) {
            catchingFishIntentGson = new CatchingFishIntentGson(catchingFishFragmentCameraX, 0);
        } else if (i == 0) {
            catchingFishIntentGson = new CatchingFishIntentGson(catchingFishFragmentCameraX, 1);
        } else if (i == 1) {
            catchingFishIntentGson = new CatchingFishMoshiCoroutine(catchingFishFragmentCameraX, catchingFishToolbarGradle.CatchingFishReduxKtor);
        } else if (i == 2) {
            catchingFishIntentGson = new CatchingFishServiceCardView(catchingFishFragmentCameraX);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Invalid end icon mode: ", i));
            }
            catchingFishIntentGson = new CatchingFishJUnitBundle(catchingFishFragmentCameraX);
        }
        sparseArray.append(i, catchingFishIntentGson);
        return catchingFishIntentGson;
    }

    public final void CatchingFishUnitTesting() {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishJetpackCompose;
        int visibility = catchingFishDataStoreBundle.getVisibility();
        int i = (this.CatchingFish == null || this.CatchingFishCoroutineFlow) ? 8 : 0;
        if (visibility != i) {
            CatchingFishSnackbar().CatchingFishStateLiveData(i == 0);
        }
        CatchingFishCloudMessaging();
        catchingFishDataStoreBundle.setVisibility(i);
        this.CatchingFishReduxKtor.CatchingFish();
    }

    public final void CatchingFishViewModelFAB(boolean z) {
        if (CatchingFishReduxKtor() != z) {
            this.CatchingFishFragmentHandler.setVisibility(z ? 0 : 8);
            CatchingFishCloudMessaging();
            CatchingFishOkHttp();
            this.CatchingFishReduxKtor.CatchingFish();
        }
    }

    public final void CatchingFishViewModelScope(int i) {
        if (this.CatchingFishEspressoTesting == i) {
            return;
        }
        CatchingFishDaggerFlux CatchingFishSnackbar = CatchingFishSnackbar();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.CatchingFishParcelableFlux;
        AccessibilityManager accessibilityManager = this.CatchingFishSpannableWidget;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.CatchingFishParcelableFlux = null;
        CatchingFishSnackbar.CatchingFish();
        this.CatchingFishEspressoTesting = i;
        Iterator it = this.CatchingFishOkHttp.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        CatchingFishViewModelFAB(i != 0);
        CatchingFishDaggerFlux CatchingFishSnackbar2 = CatchingFishSnackbar();
        int i2 = this.CatchingFishCloudMessaging.CatchingFishCoroutine;
        if (i2 == 0) {
            i2 = CatchingFishSnackbar2.CatchingFishReduxKtor();
        }
        Drawable CatchingFishCustomView = i2 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.CatchingFishFragmentHandler;
        checkableImageButton.setImageDrawable(CatchingFishCustomView);
        TextInputLayout textInputLayout = this.CatchingFishReduxKtor;
        if (CatchingFishCustomView != null) {
            CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, this.CatchingFishUnitTesting, this.CatchingFishAnimationMockk);
            CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout, checkableImageButton, this.CatchingFishUnitTesting);
        }
        int CatchingFishCoroutine = CatchingFishSnackbar2.CatchingFishCoroutine();
        CharSequence text = CatchingFishCoroutine != 0 ? getResources().getText(CatchingFishCoroutine) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(CatchingFishSnackbar2.CatchingFishCloudMessaging());
        if (!CatchingFishSnackbar2.CatchingFishLayout(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        CatchingFishSnackbar2.CatchingFishNavigation();
        AccessibilityManager.TouchExplorationStateChangeListener CatchingFishViewModelFAB = CatchingFishSnackbar2.CatchingFishViewModelFAB();
        this.CatchingFishParcelableFlux = CatchingFishViewModelFAB;
        if (CatchingFishViewModelFAB != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.CatchingFishParcelableFlux);
        }
        View.OnClickListener CatchingFishWorkManager = CatchingFishSnackbar2.CatchingFishWorkManager();
        View.OnLongClickListener onLongClickListener = this.CatchingFishNavigation;
        checkableImageButton.setOnClickListener(CatchingFishWorkManager);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
        EditText editText = this.CatchingFishDaggerHiltFAB;
        if (editText != null) {
            CatchingFishSnackbar2.CatchingFishOkHttp(editText);
            CatchingFishFragmentHandler(CatchingFishSnackbar2);
        }
        CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, this.CatchingFishUnitTesting, this.CatchingFishAnimationMockk);
        CatchingFishWorkManager(true);
    }

    public final void CatchingFishWorkManager(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        CatchingFishDaggerFlux CatchingFishSnackbar = CatchingFishSnackbar();
        boolean CatchingFishCloudMessaging = CatchingFishSnackbar.CatchingFishCloudMessaging();
        CheckableImageButton checkableImageButton = this.CatchingFishFragmentHandler;
        boolean z4 = true;
        if (!CatchingFishCloudMessaging || (z3 = checkableImageButton.CatchingFishViewModelScope) == CatchingFishSnackbar.CatchingFishEspressoTesting()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(CatchingFishSnackbar instanceof CatchingFishJUnitBundle) || (isActivated = checkableImageButton.isActivated()) == CatchingFishSnackbar.CatchingFishFragmentHandler()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            CatchingFishRobolectricHilt.CatchingFishGradleManifest(this.CatchingFishReduxKtor, checkableImageButton, this.CatchingFishUnitTesting);
        }
    }
}
