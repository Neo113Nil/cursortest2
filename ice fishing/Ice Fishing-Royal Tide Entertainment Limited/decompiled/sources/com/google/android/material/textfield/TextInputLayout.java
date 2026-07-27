package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishAsyncTaskWidget;
import kotlin.text.CatchingFishBiometricFlux;
import kotlin.text.CatchingFishCameraXCardView;
import kotlin.text.CatchingFishCameraXGradle;
import kotlin.text.CatchingFishCardViewDagger;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishCoroutineMoshi;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDataStoreBundle;
import kotlin.text.CatchingFishEspressoTesting;
import kotlin.text.CatchingFishExoPlayerFlux;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFragmentCameraX;
import kotlin.text.CatchingFishFragmentMVVM;
import kotlin.text.CatchingFishGradleMVVM;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishGsonRealm;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitAndroidX;
import kotlin.text.CatchingFishJUnitBundle;
import kotlin.text.CatchingFishJUnitMockk;
import kotlin.text.CatchingFishKtorMVI;
import kotlin.text.CatchingFishKtorRobolectric;
import kotlin.text.CatchingFishKtorViewModel;
import kotlin.text.CatchingFishLayoutCoroutine;
import kotlin.text.CatchingFishLayoutKtor;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishLifecyclePayPal;
import kotlin.text.CatchingFishLiveDataAdMob;
import kotlin.text.CatchingFishLiveDataHilt;
import kotlin.text.CatchingFishMVIMVPOkHttp;
import kotlin.text.CatchingFishMVIToast;
import kotlin.text.CatchingFishMVPEspressoRoom;
import kotlin.text.CatchingFishMVPLayout;
import kotlin.text.CatchingFishMVVMService;
import kotlin.text.CatchingFishMoshiKtorJUnit;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishParcelableMVVM;
import kotlin.text.CatchingFishPicassoEspresso;
import kotlin.text.CatchingFishPicassoMVPJUnit;
import kotlin.text.CatchingFishPicassoOkHttp;
import kotlin.text.CatchingFishRealmPicasso;
import kotlin.text.CatchingFishRobolectricHilt;
import kotlin.text.CatchingFishRobolectricMVVM;
import kotlin.text.CatchingFishRobolectricRoom;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishSharedFlowToast;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishStripeAPIMockk;
import kotlin.text.CatchingFishStripeAPIRealm;
import kotlin.text.CatchingFishToastNavigation;
import kotlin.text.CatchingFishViewMVIMVIToast;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] CatchingFishKtor = {new int[]{R.attr.state_pressed}, new int[0]};
    public CatchingFishDataStoreBundle CatchingFish;
    public final RectF CatchingFishAndroidX;
    public int CatchingFishAnimation;
    public boolean CatchingFishAnimationMockk;
    public int CatchingFishAppCompat;
    public boolean CatchingFishCameraX;
    public StateListDrawable CatchingFishCameraXIntent;
    public int CatchingFishCardViewRealm;
    public CatchingFishLiveDataHilt CatchingFishCardViewView;
    public int CatchingFishCloudMessaging;
    public int CatchingFishCoroutineFlow;
    public ColorStateList CatchingFishCustomView;
    public int CatchingFishCustomViewJUnit;
    public CatchingFishContextGraphQL CatchingFishDagger;
    public CharSequence CatchingFishDaggerHiltFAB;
    public final LinkedHashSet CatchingFishDaggerMVVM;
    public final CatchingFishViewMVIMVIToast CatchingFishDaggerWebsocket;
    public int CatchingFishDataStoreIntent;
    public boolean CatchingFishDynamicFeature;
    public CatchingFishContextGraphQL CatchingFishEspressoMockk;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFABLayout;
    public ColorStateList CatchingFishFirebase;
    public ColorStateList CatchingFishFragmentFactory;
    public int CatchingFishFragmentHandler;
    public int CatchingFishGlideWidgetKtor;
    public int CatchingFishGradleLiveData;
    public CatchingFishContextGraphQL CatchingFishGradleManifest;
    public int CatchingFishGraphQLGlide;
    public ColorStateList CatchingFishGsonAppCompat;
    public boolean CatchingFishHandler;
    public int CatchingFishJUnitRealm;
    public int CatchingFishJetpackCompose;
    public boolean CatchingFishJobScheduler;
    public int CatchingFishKtorService;
    public CharSequence CatchingFishLayout;
    public boolean CatchingFishLayoutInflater;
    public boolean CatchingFishLifecycle;
    public final CatchingFishRobolectricMVVM CatchingFishMVPReduxContext;
    public ColorStateList CatchingFishMVPRobolectric;
    public int CatchingFishMVVMAppCompat;
    public ColorDrawable CatchingFishMockkOkHttp;
    public final Rect CatchingFishMoshiDaggerHilt;
    public CatchingFishFragmentMVVM CatchingFishMotionLayout;
    public ColorStateList CatchingFishMutableLiveData;
    public CatchingFishCardViewDagger CatchingFishNavigation;
    public Typeface CatchingFishNavigationGson;
    public int CatchingFishOkHttp;
    public final int CatchingFishParcelable;
    public CatchingFishDataStoreBundle CatchingFishParcelableFlux;
    public CatchingFishLiveDataHilt CatchingFishPayPal;
    public ValueAnimator CatchingFishPayPalHandler;
    public CatchingFishContextGraphQL CatchingFishPayPalLiveData;
    public CharSequence CatchingFishPayPalService;
    public Drawable CatchingFishPicasso;
    public boolean CatchingFishRealmKtorRealm;
    public int CatchingFishRecyclerView;
    public ColorDrawable CatchingFishRedux;
    public final FrameLayout CatchingFishReduxKtor;
    public int CatchingFishReduxMoshi;
    public int CatchingFishRetrofit;
    public ColorStateList CatchingFishRetrofitMVI;
    public boolean CatchingFishRoomDatabase;
    public boolean CatchingFishSensorManager;
    public ColorStateList CatchingFishServiceMVIJUnit;
    public boolean CatchingFishSharedFlow;
    public boolean CatchingFishSpannableWidget;
    public int CatchingFishStateFlow;
    public int CatchingFishStateFlowIntent;
    public int CatchingFishStateLiveData;
    public final Rect CatchingFishStripeAPI;
    public final CatchingFishPicassoEspresso CatchingFishUnitTesting;
    public int CatchingFishView;
    public EditText CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public boolean CatchingFishWebSocketMockk;
    public int CatchingFishWidget;
    public final CatchingFishFragmentCameraX CatchingFishWorkManager;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.textInputStyle, com.catchingfish.fishcatcherpro.R.style.Widget_Design_TextInputLayout), attributeSet, com.catchingfish.fishcatcherpro.R.attr.textInputStyle);
        this.CatchingFishFragmentHandler = -1;
        this.CatchingFishCloudMessaging = -1;
        this.CatchingFishEspressoTesting = -1;
        this.CatchingFishOkHttp = -1;
        this.CatchingFishUnitTesting = new CatchingFishPicassoEspresso(this);
        this.CatchingFishNavigation = new CatchingFishAsyncTaskWidget(3);
        this.CatchingFishStripeAPI = new Rect();
        this.CatchingFishMoshiDaggerHilt = new Rect();
        this.CatchingFishAndroidX = new RectF();
        this.CatchingFishDaggerMVVM = new LinkedHashSet();
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = new CatchingFishRobolectricMVVM(this);
        this.CatchingFishMVPReduxContext = catchingFishRobolectricMVVM;
        this.CatchingFishLifecycle = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.CatchingFishReduxKtor = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = CatchingFishRobolectricRoom.CatchingFishParcelableFAB;
        catchingFishRobolectricMVVM.CatchingFishParcelable = linearInterpolator;
        catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        catchingFishRobolectricMVVM.CatchingFishLayoutInflater = linearInterpolator;
        catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        if (catchingFishRobolectricMVVM.CatchingFishViewModelScope != 8388659) {
            catchingFishRobolectricMVVM.CatchingFishViewModelScope = 8388659;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        CatchingFishLayoutRoomFAB.CatchingFishOkHttp(context2, attributeSet, com.catchingfish.fishcatcherpro.R.attr.textInputStyle, com.catchingfish.fishcatcherpro.R.style.Widget_Design_TextInputLayout);
        int[] iArr = CatchingFishSnackbarPicasso.CatchingFishCustomView;
        CatchingFishLayoutRoomFAB.CatchingFishAnimationMockk(context2, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.textInputStyle, com.catchingfish.fishcatcherpro.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.textInputStyle, com.catchingfish.fishcatcherpro.R.style.Widget_Design_TextInputLayout);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(context2, obtainStyledAttributes);
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = new CatchingFishViewMVIMVIToast(this, catchingFishAsyncTaskDagger);
        this.CatchingFishDaggerWebsocket = catchingFishViewMVIMVIToast;
        this.CatchingFishJobScheduler = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.CatchingFishDynamicFeature = obtainStyledAttributes.getBoolean(47, true);
        this.CatchingFishRealmKtorRealm = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.CatchingFishMotionLayout = CatchingFishFragmentMVVM.CatchingFishSnackbar(context2, attributeSet, com.catchingfish.fishcatcherpro.R.attr.textInputStyle, com.catchingfish.fishcatcherpro.R.style.Widget_Design_TextInputLayout).CatchingFishParcelableFAB();
        this.CatchingFishParcelable = context2.getResources().getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.CatchingFishAppCompat = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.CatchingFishViewModelScope = getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.CatchingFishStateFlow = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.CatchingFishJUnitRealm = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.CatchingFishDataStoreIntent = this.CatchingFishStateFlow;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        CatchingFishKtorMVI CatchingFishWorkManager = this.CatchingFishMotionLayout.CatchingFishWorkManager();
        if (dimension >= 0.0f) {
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(dimension);
        }
        if (dimension2 >= 0.0f) {
            CatchingFishWorkManager.CatchingFishWorkManager = new CatchingFishEspressoTesting(dimension2);
        }
        if (dimension3 >= 0.0f) {
            CatchingFishWorkManager.CatchingFishViewModelScope = new CatchingFishEspressoTesting(dimension3);
        }
        if (dimension4 >= 0.0f) {
            CatchingFishWorkManager.CatchingFishViewModelFAB = new CatchingFishEspressoTesting(dimension4);
        }
        this.CatchingFishMotionLayout = CatchingFishWorkManager.CatchingFishParcelableFAB();
        ColorStateList CatchingFish = CatchingFishDaggerBiometric.CatchingFish(context2, catchingFishAsyncTaskDagger, 7);
        if (CatchingFish != null) {
            int defaultColor = CatchingFish.getDefaultColor();
            this.CatchingFishGlideWidgetKtor = defaultColor;
            this.CatchingFishMVVMAppCompat = defaultColor;
            if (CatchingFish.isStateful()) {
                this.CatchingFishFABLayout = CatchingFish.getColorForState(new int[]{-16842910}, -1);
                this.CatchingFishGraphQLGlide = CatchingFish.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.CatchingFishStateFlowIntent = CatchingFish.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.CatchingFishGraphQLGlide = this.CatchingFishGlideWidgetKtor;
                ColorStateList CatchingFishSpannableWidget = CatchingFishGsonCardView.CatchingFishSpannableWidget(context2, com.catchingfish.fishcatcherpro.R.color.mtrl_filled_background_color);
                this.CatchingFishFABLayout = CatchingFishSpannableWidget.getColorForState(new int[]{-16842910}, -1);
                this.CatchingFishStateFlowIntent = CatchingFishSpannableWidget.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.CatchingFishMVVMAppCompat = 0;
            this.CatchingFishGlideWidgetKtor = 0;
            this.CatchingFishFABLayout = 0;
            this.CatchingFishGraphQLGlide = 0;
            this.CatchingFishStateFlowIntent = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList CatchingFishFragmentFactory = catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(1);
            this.CatchingFishRetrofitMVI = CatchingFishFragmentFactory;
            this.CatchingFishFirebase = CatchingFishFragmentFactory;
        }
        ColorStateList CatchingFish2 = CatchingFishDaggerBiometric.CatchingFish(context2, catchingFishAsyncTaskDagger, 14);
        this.CatchingFishView = obtainStyledAttributes.getColor(14, 0);
        this.CatchingFishGradleLiveData = context2.getColor(com.catchingfish.fishcatcherpro.R.color.mtrl_textinput_default_box_stroke_color);
        this.CatchingFishWidget = context2.getColor(com.catchingfish.fishcatcherpro.R.color.mtrl_textinput_disabled_color);
        this.CatchingFishRetrofit = context2.getColor(com.catchingfish.fishcatcherpro.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (CatchingFish2 != null) {
            setBoxStrokeColorStateList(CatchingFish2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(CatchingFishDaggerBiometric.CatchingFish(context2, catchingFishAsyncTaskDagger, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.CatchingFishFragmentFactory = catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(24);
        this.CatchingFishMutableLiveData = catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.CatchingFishCoroutineFlow = obtainStyledAttributes.getResourceId(22, 0);
        this.CatchingFishJetpackCompose = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.CatchingFishJetpackCompose);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.CatchingFishCoroutineFlow);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(catchingFishAsyncTaskDagger.CatchingFishFragmentFactory(59));
        }
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = new CatchingFishFragmentCameraX(this, catchingFishAsyncTaskDagger);
        this.CatchingFishWorkManager = catchingFishFragmentCameraX;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        catchingFishAsyncTaskDagger.CatchingFishAnimation();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(catchingFishViewMVIMVIToast);
        frameLayout.addView(catchingFishFragmentCameraX);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public static void CatchingFishOkHttp(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                CatchingFishOkHttp((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.CatchingFishViewModelFAB;
        if (!(editText instanceof AutoCompleteTextView) || CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(editText)) {
            return this.CatchingFishEspressoMockk;
        }
        int CatchingFishViewModelFAB = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this.CatchingFishViewModelFAB, com.catchingfish.fishcatcherpro.R.attr.colorControlHighlight);
        int i = this.CatchingFishRecyclerView;
        int[][] iArr = CatchingFishKtor;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishEspressoMockk;
            int i2 = this.CatchingFishMVVMAppCompat;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.1f, CatchingFishViewModelFAB, i2), i2}), catchingFishContextGraphQL, catchingFishContextGraphQL);
        }
        Context context = getContext();
        CatchingFishContextGraphQL catchingFishContextGraphQL2 = this.CatchingFishEspressoMockk;
        TypedValue CatchingFishLayoutInflater = CatchingFishOkHttpFAB.CatchingFishLayoutInflater(com.catchingfish.fishcatcherpro.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = CatchingFishLayoutInflater.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : CatchingFishLayoutInflater.data;
        CatchingFishContextGraphQL catchingFishContextGraphQL3 = new CatchingFishContextGraphQL(catchingFishContextGraphQL2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB);
        int CatchingFishRoomDatabase = CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.1f, CatchingFishViewModelFAB, color);
        catchingFishContextGraphQL3.CatchingFishUnitTesting(new ColorStateList(iArr, new int[]{CatchingFishRoomDatabase, 0}));
        catchingFishContextGraphQL3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{CatchingFishRoomDatabase, color});
        CatchingFishContextGraphQL catchingFishContextGraphQL4 = new CatchingFishContextGraphQL(catchingFishContextGraphQL2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB);
        catchingFishContextGraphQL4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, catchingFishContextGraphQL3, catchingFishContextGraphQL4), catchingFishContextGraphQL2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.CatchingFishCameraXIntent == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.CatchingFishCameraXIntent = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.CatchingFishCameraXIntent.addState(new int[0], CatchingFishViewModelFAB(false));
        }
        return this.CatchingFishCameraXIntent;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.CatchingFishDagger == null) {
            this.CatchingFishDagger = CatchingFishViewModelFAB(true);
        }
        return this.CatchingFishDagger;
    }

    private void setEditText(EditText editText) {
        if (this.CatchingFishViewModelFAB != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.CatchingFishViewModelFAB = editText;
        int i = this.CatchingFishFragmentHandler;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.CatchingFishEspressoTesting);
        }
        int i2 = this.CatchingFishCloudMessaging;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.CatchingFishOkHttp);
        }
        this.CatchingFishHandler = false;
        CatchingFishCloudMessaging();
        setTextInputAccessibilityDelegate(new CatchingFishParcelableMVVM(this));
        Typeface typeface = this.CatchingFishViewModelFAB.getTypeface();
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        catchingFishRobolectricMVVM.CatchingFishUnitTesting(typeface);
        float textSize = this.CatchingFishViewModelFAB.getTextSize();
        if (catchingFishRobolectricMVVM.CatchingFishViewModelFAB != textSize) {
            catchingFishRobolectricMVVM.CatchingFishViewModelFAB = textSize;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        float letterSpacing = this.CatchingFishViewModelFAB.getLetterSpacing();
        if (catchingFishRobolectricMVVM.CatchingFishAnimation != letterSpacing) {
            catchingFishRobolectricMVVM.CatchingFishAnimation = letterSpacing;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        int gravity = this.CatchingFishViewModelFAB.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (catchingFishRobolectricMVVM.CatchingFishViewModelScope != i3) {
            catchingFishRobolectricMVVM.CatchingFishViewModelScope = i3;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        if (catchingFishRobolectricMVVM.CatchingFishWorkManager != gravity) {
            catchingFishRobolectricMVVM.CatchingFishWorkManager = gravity;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        this.CatchingFishKtorService = editText.getMinimumHeight();
        this.CatchingFishViewModelFAB.addTextChangedListener(new CatchingFishCoroutineMoshi(this, editText));
        if (this.CatchingFishFirebase == null) {
            this.CatchingFishFirebase = this.CatchingFishViewModelFAB.getHintTextColors();
        }
        if (this.CatchingFishJobScheduler) {
            if (TextUtils.isEmpty(this.CatchingFishPayPalService)) {
                CharSequence hint = this.CatchingFishViewModelFAB.getHint();
                this.CatchingFishLayout = hint;
                setHint(hint);
                this.CatchingFishViewModelFAB.setHint((CharSequence) null);
            }
            this.CatchingFishSensorManager = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishNavigation();
        }
        if (this.CatchingFish != null) {
            CatchingFishStateLiveData(this.CatchingFishViewModelFAB.getText());
        }
        CatchingFishJetpackCompose();
        this.CatchingFishUnitTesting.CatchingFishSnackbar();
        this.CatchingFishDaggerWebsocket.bringToFront();
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.bringToFront();
        Iterator it = this.CatchingFishDaggerMVVM.iterator();
        while (it.hasNext()) {
            ((CatchingFishStripeAPIMockk) it.next()).CatchingFishParcelableFAB(this);
        }
        catchingFishFragmentCameraX.CatchingFishOkHttp();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        CatchingFishSpannableWidget(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.CatchingFishPayPalService)) {
            return;
        }
        this.CatchingFishPayPalService = charSequence;
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (charSequence == null || !TextUtils.equals(catchingFishRobolectricMVVM.CatchingFishCardViewView, charSequence)) {
            catchingFishRobolectricMVVM.CatchingFishCardViewView = charSequence;
            catchingFishRobolectricMVVM.CatchingFishMVPRobolectric = null;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        if (this.CatchingFishWebSocketMockk) {
            return;
        }
        CatchingFishEspressoTesting();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.CatchingFishSpannableWidget == z) {
            return;
        }
        if (z) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishParcelableFlux;
            if (catchingFishDataStoreBundle != null) {
                this.CatchingFishReduxKtor.addView(catchingFishDataStoreBundle);
                this.CatchingFishParcelableFlux.setVisibility(0);
            }
        } else {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = this.CatchingFishParcelableFlux;
            if (catchingFishDataStoreBundle2 != null) {
                catchingFishDataStoreBundle2.setVisibility(8);
            }
            this.CatchingFishParcelableFlux = null;
        }
        this.CatchingFishSpannableWidget = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFish() {
        boolean z;
        CatchingFishFragmentCameraX catchingFishFragmentCameraX;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.CatchingFishViewModelFAB == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
            if (catchingFishViewMVIMVIToast.getMeasuredWidth() > 0) {
                int measuredWidth = catchingFishViewMVIMVIToast.getMeasuredWidth() - this.CatchingFishViewModelFAB.getPaddingLeft();
                if (this.CatchingFishRedux == null || this.CatchingFishCustomViewJUnit != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.CatchingFishRedux = colorDrawable3;
                    this.CatchingFishCustomViewJUnit = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.CatchingFishRedux;
                if (drawable2 != colorDrawable4) {
                    this.CatchingFishViewModelFAB.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    catchingFishFragmentCameraX = this.CatchingFishWorkManager;
                    if ((!catchingFishFragmentCameraX.CatchingFishDaggerWebsocket() || ((catchingFishFragmentCameraX.CatchingFishEspressoTesting != 0 && catchingFishFragmentCameraX.CatchingFishReduxKtor()) || catchingFishFragmentCameraX.CatchingFish != null)) && catchingFishFragmentCameraX.getMeasuredWidth() > 0) {
                        int measuredWidth2 = catchingFishFragmentCameraX.CatchingFishJetpackCompose.getMeasuredWidth() - this.CatchingFishViewModelFAB.getPaddingRight();
                        if (!catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
                            checkableImageButton = catchingFishFragmentCameraX.CatchingFishWorkManager;
                        } else if (catchingFishFragmentCameraX.CatchingFishEspressoTesting != 0 && catchingFishFragmentCameraX.CatchingFishReduxKtor()) {
                            checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
                        colorDrawable = this.CatchingFishMockkOkHttp;
                        if (colorDrawable == null && this.CatchingFishReduxMoshi != measuredWidth2) {
                            this.CatchingFishReduxMoshi = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.CatchingFishViewModelFAB.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.CatchingFishMockkOkHttp, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.CatchingFishMockkOkHttp = colorDrawable5;
                            this.CatchingFishReduxMoshi = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.CatchingFishMockkOkHttp;
                        if (drawable != colorDrawable2) {
                            this.CatchingFishPicasso = drawable;
                            this.CatchingFishViewModelFAB.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.CatchingFishMockkOkHttp != null) {
                        Drawable[] compoundDrawablesRelative3 = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.CatchingFishMockkOkHttp) {
                            this.CatchingFishViewModelFAB.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.CatchingFishPicasso, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.CatchingFishMockkOkHttp = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                catchingFishFragmentCameraX = this.CatchingFishWorkManager;
                if (catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
                }
                int measuredWidth22 = catchingFishFragmentCameraX.CatchingFishJetpackCompose.getMeasuredWidth() - this.CatchingFishViewModelFAB.getPaddingRight();
                if (!catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
                colorDrawable = this.CatchingFishMockkOkHttp;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.CatchingFishMockkOkHttp;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.CatchingFishRedux != null) {
            Drawable[] compoundDrawablesRelative4 = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
            this.CatchingFishViewModelFAB.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.CatchingFishRedux = null;
            z = true;
            catchingFishFragmentCameraX = this.CatchingFishWorkManager;
            if (catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
            }
            int measuredWidth222 = catchingFishFragmentCameraX.CatchingFishJetpackCompose.getMeasuredWidth() - this.CatchingFishViewModelFAB.getPaddingRight();
            if (!catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
            colorDrawable = this.CatchingFishMockkOkHttp;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.CatchingFishMockkOkHttp;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
        }
        int measuredWidth2222 = catchingFishFragmentCameraX.CatchingFishJetpackCompose.getMeasuredWidth() - this.CatchingFishViewModelFAB.getPaddingRight();
        if (!catchingFishFragmentCameraX.CatchingFishDaggerWebsocket()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.CatchingFishViewModelFAB.getCompoundDrawablesRelative();
        colorDrawable = this.CatchingFishMockkOkHttp;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.CatchingFishMockkOkHttp;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public final boolean CatchingFishAnimationMockk() {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        return (catchingFishPicassoEspresso.CatchingFishAnimationMockk != 1 || catchingFishPicassoEspresso.CatchingFishNavigation == null || TextUtils.isEmpty(catchingFishPicassoEspresso.CatchingFishStateLiveData)) ? false : true;
    }

    public final void CatchingFishCardViewRealm() {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle;
        EditText editText;
        EditText editText2;
        if (this.CatchingFishEspressoMockk == null || this.CatchingFishRecyclerView == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.CatchingFishViewModelFAB) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.CatchingFishViewModelFAB) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.CatchingFishAnimation = this.CatchingFishWidget;
        } else if (CatchingFishAnimationMockk()) {
            if (this.CatchingFishServiceMVIJUnit != null) {
                CatchingFishGsonAppCompat(z2, z);
            } else {
                this.CatchingFishAnimation = getErrorCurrentTextColors();
            }
        } else if (!this.CatchingFishRoomDatabase || (catchingFishDataStoreBundle = this.CatchingFish) == null) {
            if (z2) {
                this.CatchingFishAnimation = this.CatchingFishView;
            } else if (z) {
                this.CatchingFishAnimation = this.CatchingFishRetrofit;
            } else {
                this.CatchingFishAnimation = this.CatchingFishGradleLiveData;
            }
        } else if (this.CatchingFishServiceMVIJUnit != null) {
            CatchingFishGsonAppCompat(z2, z);
        } else {
            this.CatchingFishAnimation = catchingFishDataStoreBundle.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishNavigation();
        }
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        TextInputLayout textInputLayout = catchingFishFragmentCameraX.CatchingFishReduxKtor;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        TextInputLayout textInputLayout2 = catchingFishFragmentCameraX.CatchingFishReduxKtor;
        catchingFishFragmentCameraX.CatchingFishEspressoTesting();
        CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout2, catchingFishFragmentCameraX.CatchingFishWorkManager, catchingFishFragmentCameraX.CatchingFishViewModelScope);
        CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout2, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting);
        if (catchingFishFragmentCameraX.CatchingFishSnackbar() instanceof CatchingFishJUnitBundle) {
            if (!textInputLayout.CatchingFishAnimationMockk() || checkableImageButton.getDrawable() == null) {
                CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting, catchingFishFragmentCameraX.CatchingFishAnimationMockk);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        CatchingFishRobolectricHilt.CatchingFishGradleManifest(catchingFishViewMVIMVIToast.CatchingFishReduxKtor, catchingFishViewMVIMVIToast.CatchingFishViewModelScope, catchingFishViewMVIMVIToast.CatchingFishViewModelFAB);
        if (this.CatchingFishRecyclerView == 2) {
            int i = this.CatchingFishDataStoreIntent;
            if (z2 && isEnabled()) {
                this.CatchingFishDataStoreIntent = this.CatchingFishJUnitRealm;
            } else {
                this.CatchingFishDataStoreIntent = this.CatchingFishStateFlow;
            }
            if (this.CatchingFishDataStoreIntent != i && CatchingFishViewModelScope() && !this.CatchingFishWebSocketMockk) {
                if (CatchingFishViewModelScope()) {
                    ((CatchingFishMVVMService) this.CatchingFishEspressoMockk).CatchingFishJetpackCompose(0.0f, 0.0f, 0.0f, 0.0f);
                }
                CatchingFishEspressoTesting();
            }
        }
        if (this.CatchingFishRecyclerView == 1) {
            if (!isEnabled()) {
                this.CatchingFishMVVMAppCompat = this.CatchingFishFABLayout;
            } else if (z && !z2) {
                this.CatchingFishMVVMAppCompat = this.CatchingFishStateFlowIntent;
            } else if (z2) {
                this.CatchingFishMVVMAppCompat = this.CatchingFishGraphQLGlide;
            } else {
                this.CatchingFishMVVMAppCompat = this.CatchingFishGlideWidgetKtor;
            }
        }
        CatchingFishCoroutine();
    }

    public final void CatchingFishCloudMessaging() {
        int i = this.CatchingFishRecyclerView;
        if (i == 0) {
            this.CatchingFishEspressoMockk = null;
            this.CatchingFishPayPalLiveData = null;
            this.CatchingFishGradleManifest = null;
        } else if (i == 1) {
            this.CatchingFishEspressoMockk = new CatchingFishContextGraphQL(this.CatchingFishMotionLayout);
            this.CatchingFishPayPalLiveData = new CatchingFishContextGraphQL();
            this.CatchingFishGradleManifest = new CatchingFishContextGraphQL();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.CatchingFishRecyclerView + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.CatchingFishJobScheduler || (this.CatchingFishEspressoMockk instanceof CatchingFishMVVMService)) {
                this.CatchingFishEspressoMockk = new CatchingFishContextGraphQL(this.CatchingFishMotionLayout);
            } else {
                CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishMotionLayout;
                int i2 = CatchingFishMVVMService.CatchingFishDagger;
                if (catchingFishFragmentMVVM == null) {
                    catchingFishFragmentMVVM = new CatchingFishFragmentMVVM();
                }
                CatchingFishJUnitAndroidX catchingFishJUnitAndroidX = new CatchingFishJUnitAndroidX(catchingFishFragmentMVVM, new RectF());
                CatchingFishMVVMService catchingFishMVVMService = new CatchingFishMVVMService(catchingFishJUnitAndroidX);
                catchingFishMVVMService.CatchingFishEspressoMockk = catchingFishJUnitAndroidX;
                this.CatchingFishEspressoMockk = catchingFishMVVMService;
            }
            this.CatchingFishPayPalLiveData = null;
            this.CatchingFishGradleManifest = null;
        }
        CatchingFishCoroutineFlow();
        CatchingFishCardViewRealm();
        if (this.CatchingFishRecyclerView == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.CatchingFishAppCompat = getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (CatchingFishDaggerBiometric.CatchingFishCardViewRealm(getContext())) {
                this.CatchingFishAppCompat = getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        CatchingFishParcelableFAB();
        if (this.CatchingFishRecyclerView != 0) {
            CatchingFishDaggerHiltFAB();
        }
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.CatchingFishRecyclerView;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void CatchingFishCoroutine() {
        int i;
        int i2;
        CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishEspressoMockk;
        if (catchingFishContextGraphQL == null) {
            return;
        }
        CatchingFishFragmentMVVM catchingFishFragmentMVVM = catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB;
        CatchingFishFragmentMVVM catchingFishFragmentMVVM2 = this.CatchingFishMotionLayout;
        if (catchingFishFragmentMVVM != catchingFishFragmentMVVM2) {
            catchingFishContextGraphQL.setShapeAppearanceModel(catchingFishFragmentMVVM2);
        }
        if (this.CatchingFishRecyclerView == 2 && (i = this.CatchingFishDataStoreIntent) > -1 && (i2 = this.CatchingFishAnimation) != 0) {
            CatchingFishContextGraphQL catchingFishContextGraphQL2 = this.CatchingFishEspressoMockk;
            catchingFishContextGraphQL2.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging = i;
            catchingFishContextGraphQL2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = catchingFishContextGraphQL2.CatchingFishDaggerWebsocket;
            if (catchingFishMVPEspressoRoom.CatchingFishDaggerWebsocket != valueOf) {
                catchingFishMVPEspressoRoom.CatchingFishDaggerWebsocket = valueOf;
                catchingFishContextGraphQL2.onStateChange(catchingFishContextGraphQL2.getState());
            }
        }
        int i3 = this.CatchingFishMVVMAppCompat;
        if (this.CatchingFishRecyclerView == 1) {
            i3 = CatchingFishLiveDataAdMob.CatchingFishSnackbar(this.CatchingFishMVVMAppCompat, CatchingFishViewMVIMVVM.CatchingFishViewModelScope(getContext(), com.catchingfish.fishcatcherpro.R.attr.colorSurface, 0));
        }
        this.CatchingFishMVVMAppCompat = i3;
        this.CatchingFishEspressoMockk.CatchingFishUnitTesting(ColorStateList.valueOf(i3));
        CatchingFishContextGraphQL catchingFishContextGraphQL3 = this.CatchingFishPayPalLiveData;
        if (catchingFishContextGraphQL3 != null && this.CatchingFishGradleManifest != null) {
            if (this.CatchingFishDataStoreIntent > -1 && this.CatchingFishAnimation != 0) {
                catchingFishContextGraphQL3.CatchingFishUnitTesting(this.CatchingFishViewModelFAB.isFocused() ? ColorStateList.valueOf(this.CatchingFishGradleLiveData) : ColorStateList.valueOf(this.CatchingFishAnimation));
                this.CatchingFishGradleManifest.CatchingFishUnitTesting(ColorStateList.valueOf(this.CatchingFishAnimation));
            }
            invalidate();
        }
        CatchingFishCoroutineFlow();
    }

    public final void CatchingFishCoroutineFlow() {
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || this.CatchingFishEspressoMockk == null) {
            return;
        }
        if ((this.CatchingFishHandler || editText.getBackground() == null) && this.CatchingFishRecyclerView != 0) {
            this.CatchingFishViewModelFAB.setBackground(getEditTextBoxBackground());
            this.CatchingFishHandler = true;
        }
    }

    public final void CatchingFishDaggerHiltFAB() {
        if (this.CatchingFishRecyclerView != 1) {
            FrameLayout frameLayout = this.CatchingFishReduxKtor;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket();
            if (CatchingFishDaggerWebsocket != layoutParams.topMargin) {
                layoutParams.topMargin = CatchingFishDaggerWebsocket;
                frameLayout.requestLayout();
            }
        }
    }

    public final int CatchingFishDaggerWebsocket() {
        if (this.CatchingFishJobScheduler) {
            int i = this.CatchingFishRecyclerView;
            CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
            if (i == 0) {
                return (int) catchingFishRobolectricMVVM.CatchingFishWorkManager();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (catchingFishRobolectricMVVM.CatchingFishWorkManager() / 2.0f);
                }
                float CatchingFishWorkManager = catchingFishRobolectricMVVM.CatchingFishWorkManager();
                TextPaint textPaint = catchingFishRobolectricMVVM.CatchingFishMotionLayout;
                textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishLayout);
                textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFish);
                textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishJUnitRealm);
                return Math.max(0, (int) (CatchingFishWorkManager - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishEspressoTesting() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (CatchingFishViewModelScope()) {
            int width = this.CatchingFishViewModelFAB.getWidth();
            int gravity = this.CatchingFishViewModelFAB.getGravity();
            CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
            boolean CatchingFishCoroutine = catchingFishRobolectricMVVM.CatchingFishCoroutine(catchingFishRobolectricMVVM.CatchingFishCardViewView);
            catchingFishRobolectricMVVM.CatchingFishCustomView = CatchingFishCoroutine;
            Rect rect = catchingFishRobolectricMVVM.CatchingFishReduxKtor;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (CatchingFishCoroutine) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt;
                    }
                } else if (CatchingFishCoroutine) {
                    f = rect.right;
                    f2 = catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.CatchingFishAndroidX;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (catchingFishRobolectricMVVM.CatchingFishCustomView) {
                        f5 = catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (catchingFishRobolectricMVVM.CatchingFishCustomView) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = catchingFishRobolectricMVVM.CatchingFishWorkManager() + rect.top;
                if (catchingFishRobolectricMVVM.CatchingFishStripeAPI != null && !catchingFishRobolectricMVVM.CatchingFishAnimationMockk()) {
                    StaticLayout staticLayout = catchingFishRobolectricMVVM.CatchingFishStripeAPI;
                    float lineWidth = (catchingFishRobolectricMVVM.CatchingFishLayout / catchingFishRobolectricMVVM.CatchingFishViewModelFAB) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (catchingFishRobolectricMVVM.CatchingFishCustomView) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.CatchingFishParcelable;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.CatchingFishDataStoreIntent);
                rectF.top = 0.0f;
                CatchingFishMVVMService catchingFishMVVMService = (CatchingFishMVVMService) this.CatchingFishEspressoMockk;
                catchingFishMVVMService.getClass();
                catchingFishMVVMService.CatchingFishJetpackCompose(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.CatchingFishAndroidX;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (catchingFishRobolectricMVVM.CatchingFishMoshiDaggerHilt / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = catchingFishRobolectricMVVM.CatchingFishWorkManager() + rect.top;
            if (catchingFishRobolectricMVVM.CatchingFishStripeAPI != null) {
                StaticLayout staticLayout2 = catchingFishRobolectricMVVM.CatchingFishStripeAPI;
                float lineWidth2 = (catchingFishRobolectricMVVM.CatchingFishLayout / catchingFishRobolectricMVVM.CatchingFishViewModelFAB) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (catchingFishRobolectricMVVM.CatchingFishCustomView) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final int CatchingFishFragmentHandler(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.CatchingFishViewModelFAB.getCompoundPaddingRight() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB() : this.CatchingFishWorkManager.CatchingFishCoroutine());
    }

    public final void CatchingFishGsonAppCompat(boolean z, boolean z2) {
        int defaultColor = this.CatchingFishServiceMVIJUnit.getDefaultColor();
        int colorForState = this.CatchingFishServiceMVIJUnit.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.CatchingFishServiceMVIJUnit.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.CatchingFishAnimation = colorForState2;
        } else if (z2) {
            this.CatchingFishAnimation = colorForState;
        } else {
            this.CatchingFishAnimation = defaultColor;
        }
    }

    public final void CatchingFishJetpackCompose() {
        Drawable background;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle;
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || this.CatchingFishRecyclerView != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = CatchingFishRealmPicasso.CatchingFishParcelableFAB;
        Drawable mutate = background.mutate();
        if (CatchingFishAnimationMockk()) {
            mutate.setColorFilter(CatchingFishPicassoMVPJUnit.CatchingFishCoroutine(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.CatchingFishRoomDatabase && (catchingFishDataStoreBundle = this.CatchingFish) != null) {
            mutate.setColorFilter(CatchingFishPicassoMVPJUnit.CatchingFishCoroutine(catchingFishDataStoreBundle.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.CatchingFishViewModelFAB.refreshDrawableState();
        }
    }

    public final int CatchingFishLayout(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.CatchingFishViewModelFAB.getCompoundPaddingLeft() : this.CatchingFishWorkManager.CatchingFishCoroutine() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB()) + i;
    }

    public final void CatchingFishNavigation() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.CatchingFishFragmentFactory;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue CatchingFishGradleManifest = CatchingFishOkHttpFAB.CatchingFishGradleManifest(context, com.catchingfish.fishcatcherpro.R.attr.colorControlActivated);
            if (CatchingFishGradleManifest != null) {
                int i = CatchingFishGradleManifest.resourceId;
                if (i != 0) {
                    colorStateList2 = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, i);
                } else {
                    int i2 = CatchingFishGradleManifest.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.CatchingFishViewModelFAB.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((CatchingFishAnimationMockk() || (this.CatchingFish != null && this.CatchingFishRoomDatabase)) && (colorStateList = this.CatchingFishMutableLiveData) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishViewModelFAB == null || this.CatchingFishRecyclerView != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.CatchingFishViewModelFAB;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.CatchingFishMVPReduxContext.CatchingFishWorkManager() + this.CatchingFishViewModelScope), this.CatchingFishViewModelFAB.getPaddingEnd(), getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.CatchingFishViewModelFAB;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_filled_edittext_font_2_0_padding_top), this.CatchingFishViewModelFAB.getPaddingEnd(), getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (CatchingFishDaggerBiometric.CatchingFishCardViewRealm(getContext())) {
            EditText editText3 = this.CatchingFishViewModelFAB;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_filled_edittext_font_1_3_padding_top), this.CatchingFishViewModelFAB.getPaddingEnd(), getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final void CatchingFishParcelableFlux(Editable editable) {
        ((CatchingFishAsyncTaskWidget) this.CatchingFishNavigation).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.CatchingFishReduxKtor;
        if (length != 0 || this.CatchingFishWebSocketMockk) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishParcelableFlux;
            if (catchingFishDataStoreBundle == null || !this.CatchingFishSpannableWidget) {
                return;
            }
            catchingFishDataStoreBundle.setText((CharSequence) null);
            CatchingFishMoshiKtorJUnit.CatchingFishParcelableFAB(frameLayout, this.CatchingFishCardViewView);
            this.CatchingFishParcelableFlux.setVisibility(4);
            return;
        }
        if (this.CatchingFishParcelableFlux == null || !this.CatchingFishSpannableWidget || TextUtils.isEmpty(this.CatchingFishDaggerHiltFAB)) {
            return;
        }
        this.CatchingFishParcelableFlux.setText(this.CatchingFishDaggerHiltFAB);
        CatchingFishMoshiKtorJUnit.CatchingFishParcelableFAB(frameLayout, this.CatchingFishPayPal);
        this.CatchingFishParcelableFlux.setVisibility(0);
        this.CatchingFishParcelableFlux.bringToFront();
    }

    public final Rect CatchingFishReduxKtor(Rect rect) {
        if (this.CatchingFishViewModelFAB == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.CatchingFishMoshiDaggerHilt;
        rect2.bottom = i;
        int i2 = this.CatchingFishRecyclerView;
        if (i2 == 1) {
            rect2.left = CatchingFishLayout(rect.left, z);
            rect2.top = rect.top + this.CatchingFishAppCompat;
            rect2.right = CatchingFishFragmentHandler(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = CatchingFishLayout(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = CatchingFishFragmentHandler(rect.right, z);
            return rect2;
        }
        rect2.left = this.CatchingFishViewModelFAB.getPaddingLeft() + rect.left;
        rect2.top = rect.top - CatchingFishDaggerWebsocket();
        rect2.right = rect.right - this.CatchingFishViewModelFAB.getPaddingRight();
        return rect2;
    }

    public final void CatchingFishRoomDatabase() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFish;
        if (catchingFishDataStoreBundle != null) {
            CatchingFishUnitTesting(catchingFishDataStoreBundle, this.CatchingFishRoomDatabase ? this.CatchingFishJetpackCompose : this.CatchingFishCoroutineFlow);
            if (!this.CatchingFishRoomDatabase && (colorStateList2 = this.CatchingFishMVPRobolectric) != null) {
                this.CatchingFish.setTextColor(colorStateList2);
            }
            if (!this.CatchingFishRoomDatabase || (colorStateList = this.CatchingFishCustomView) == null) {
                return;
            }
            this.CatchingFish.setTextColor(colorStateList);
        }
    }

    public final void CatchingFishSnackbar(float f) {
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (catchingFishRobolectricMVVM.CatchingFishSnackbar == f) {
            return;
        }
        int i = 2;
        if (this.CatchingFishPayPalHandler == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.CatchingFishPayPalHandler = valueAnimator;
            valueAnimator.setInterpolator(CatchingFishHiltMVPToast.CatchingFishCustomView(getContext(), com.catchingfish.fishcatcherpro.R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishSnackbar));
            this.CatchingFishPayPalHandler.setDuration(CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(getContext(), com.catchingfish.fishcatcherpro.R.attr.motionDurationMedium4, 167));
            this.CatchingFishPayPalHandler.addUpdateListener(new CatchingFishSharedFlowToast(i, this));
        }
        this.CatchingFishPayPalHandler.setFloatValues(catchingFishRobolectricMVVM.CatchingFishSnackbar, f);
        this.CatchingFishPayPalHandler.start();
    }

    public final void CatchingFishSpannableWidget(boolean z, boolean z2) {
        ColorStateList colorStateList;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle;
        boolean isEnabled = isEnabled();
        EditText editText = this.CatchingFishViewModelFAB;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.CatchingFishViewModelFAB;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.CatchingFishFirebase;
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (colorStateList2 != null) {
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.CatchingFishFirebase;
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.CatchingFishWidget) : this.CatchingFishWidget));
        } else if (CatchingFishAnimationMockk()) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = this.CatchingFishUnitTesting.CatchingFishNavigation;
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging(catchingFishDataStoreBundle2 != null ? catchingFishDataStoreBundle2.getTextColors() : null);
        } else if (this.CatchingFishRoomDatabase && (catchingFishDataStoreBundle = this.CatchingFish) != null) {
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging(catchingFishDataStoreBundle.getTextColors());
        } else if (z4 && (colorStateList = this.CatchingFishRetrofitMVI) != null && catchingFishRobolectricMVVM.CatchingFishCloudMessaging != colorStateList) {
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging = colorStateList;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        if (z3 || !this.CatchingFishRealmKtorRealm || (isEnabled() && z4)) {
            if (z2 || this.CatchingFishWebSocketMockk) {
                ValueAnimator valueAnimator = this.CatchingFishPayPalHandler;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.CatchingFishPayPalHandler.cancel();
                }
                if (z && this.CatchingFishDynamicFeature) {
                    CatchingFishSnackbar(1.0f);
                } else {
                    catchingFishRobolectricMVVM.CatchingFishOkHttp(1.0f);
                }
                this.CatchingFishWebSocketMockk = false;
                if (CatchingFishViewModelScope()) {
                    CatchingFishEspressoTesting();
                }
                EditText editText3 = this.CatchingFishViewModelFAB;
                CatchingFishParcelableFlux(editText3 != null ? editText3.getText() : null);
                catchingFishViewMVIMVIToast.CatchingFishOkHttp = false;
                catchingFishViewMVIMVIToast.CatchingFishDaggerWebsocket();
                catchingFishFragmentCameraX.CatchingFishCoroutineFlow = false;
                catchingFishFragmentCameraX.CatchingFishUnitTesting();
                return;
            }
            return;
        }
        if (z2 || !this.CatchingFishWebSocketMockk) {
            ValueAnimator valueAnimator2 = this.CatchingFishPayPalHandler;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.CatchingFishPayPalHandler.cancel();
            }
            if (z && this.CatchingFishDynamicFeature) {
                CatchingFishSnackbar(0.0f);
            } else {
                catchingFishRobolectricMVVM.CatchingFishOkHttp(0.0f);
            }
            if (CatchingFishViewModelScope() && !((CatchingFishMVVMService) this.CatchingFishEspressoMockk).CatchingFishEspressoMockk.CatchingFishNavigation.isEmpty() && CatchingFishViewModelScope()) {
                ((CatchingFishMVVMService) this.CatchingFishEspressoMockk).CatchingFishJetpackCompose(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.CatchingFishWebSocketMockk = true;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = this.CatchingFishParcelableFlux;
            if (catchingFishDataStoreBundle3 != null && this.CatchingFishSpannableWidget) {
                catchingFishDataStoreBundle3.setText((CharSequence) null);
                CatchingFishMoshiKtorJUnit.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, this.CatchingFishCardViewView);
                this.CatchingFishParcelableFlux.setVisibility(4);
            }
            catchingFishViewMVIMVIToast.CatchingFishOkHttp = true;
            catchingFishViewMVIMVIToast.CatchingFishDaggerWebsocket();
            catchingFishFragmentCameraX.CatchingFishCoroutineFlow = true;
            catchingFishFragmentCameraX.CatchingFishUnitTesting();
        }
    }

    public final void CatchingFishStateLiveData(Editable editable) {
        ((CatchingFishAsyncTaskWidget) this.CatchingFishNavigation).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.CatchingFishRoomDatabase;
        int i = this.CatchingFishStateLiveData;
        if (i == -1) {
            this.CatchingFish.setText(String.valueOf(length));
            this.CatchingFish.setContentDescription(null);
            this.CatchingFishRoomDatabase = false;
        } else {
            this.CatchingFishRoomDatabase = length > i;
            Context context = getContext();
            this.CatchingFish.setContentDescription(context.getString(this.CatchingFishRoomDatabase ? com.catchingfish.fishcatcherpro.R.string.character_counter_overflowed_content_description : com.catchingfish.fishcatcherpro.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.CatchingFishStateLiveData)));
            if (z != this.CatchingFishRoomDatabase) {
                CatchingFishRoomDatabase();
            }
            String str = CatchingFishMVIToast.CatchingFishSnackbar;
            CatchingFishMVIToast catchingFishMVIToast = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? CatchingFishMVIToast.CatchingFishDaggerWebsocket : CatchingFishMVIToast.CatchingFishReduxKtor;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFish;
            String string = getContext().getString(com.catchingfish.fishcatcherpro.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.CatchingFishStateLiveData));
            catchingFishMVIToast.getClass();
            CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishParcelableFAB;
            catchingFishDataStoreBundle.setText(string != null ? catchingFishMVIToast.CatchingFishCoroutine(string).toString() : null);
        }
        if (this.CatchingFishViewModelFAB == null || z == this.CatchingFishRoomDatabase) {
            return;
        }
        CatchingFishSpannableWidget(false, false);
        CatchingFishCardViewRealm();
        CatchingFishJetpackCompose();
    }

    public final void CatchingFishUnitTesting(CatchingFishDataStoreBundle catchingFishDataStoreBundle, int i) {
        try {
            catchingFishDataStoreBundle.setTextAppearance(i);
            if (catchingFishDataStoreBundle.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        catchingFishDataStoreBundle.setTextAppearance(com.catchingfish.fishcatcherpro.R.style.TextAppearance_AppCompat_Caption);
        catchingFishDataStoreBundle.setTextColor(getContext().getColor(com.catchingfish.fishcatcherpro.R.color.design_error));
    }

    public final CatchingFishContextGraphQL CatchingFishViewModelFAB(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.CatchingFishViewModelFAB;
        float popupElevation = editText instanceof CatchingFishMVIMVPOkHttp ? ((CatchingFishMVIMVPOkHttp) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        CatchingFishLayoutKtor catchingFishLayoutKtor = new CatchingFishLayoutKtor();
        CatchingFishLayoutKtor catchingFishLayoutKtor2 = new CatchingFishLayoutKtor();
        CatchingFishLayoutKtor catchingFishLayoutKtor3 = new CatchingFishLayoutKtor();
        CatchingFishLayoutKtor catchingFishLayoutKtor4 = new CatchingFishLayoutKtor();
        int i = 0;
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(i);
        CatchingFishGradleMVVM catchingFishGradleMVVM2 = new CatchingFishGradleMVVM(i);
        CatchingFishGradleMVVM catchingFishGradleMVVM3 = new CatchingFishGradleMVVM(i);
        CatchingFishGradleMVVM catchingFishGradleMVVM4 = new CatchingFishGradleMVVM(i);
        CatchingFishEspressoTesting catchingFishEspressoTesting = new CatchingFishEspressoTesting(f);
        CatchingFishEspressoTesting catchingFishEspressoTesting2 = new CatchingFishEspressoTesting(f);
        CatchingFishEspressoTesting catchingFishEspressoTesting3 = new CatchingFishEspressoTesting(dimensionPixelOffset);
        CatchingFishEspressoTesting catchingFishEspressoTesting4 = new CatchingFishEspressoTesting(dimensionPixelOffset);
        CatchingFishFragmentMVVM catchingFishFragmentMVVM = new CatchingFishFragmentMVVM();
        catchingFishFragmentMVVM.CatchingFishParcelableFAB = catchingFishLayoutKtor;
        catchingFishFragmentMVVM.CatchingFishSnackbar = catchingFishLayoutKtor2;
        catchingFishFragmentMVVM.CatchingFishCoroutine = catchingFishLayoutKtor3;
        catchingFishFragmentMVVM.CatchingFishReduxKtor = catchingFishLayoutKtor4;
        catchingFishFragmentMVVM.CatchingFishDaggerWebsocket = catchingFishEspressoTesting;
        catchingFishFragmentMVVM.CatchingFishWorkManager = catchingFishEspressoTesting2;
        catchingFishFragmentMVVM.CatchingFishViewModelScope = catchingFishEspressoTesting4;
        catchingFishFragmentMVVM.CatchingFishViewModelFAB = catchingFishEspressoTesting3;
        catchingFishFragmentMVVM.CatchingFishLayout = catchingFishGradleMVVM;
        catchingFishFragmentMVVM.CatchingFishFragmentHandler = catchingFishGradleMVVM2;
        catchingFishFragmentMVVM.CatchingFishCloudMessaging = catchingFishGradleMVVM3;
        catchingFishFragmentMVVM.CatchingFishEspressoTesting = catchingFishGradleMVVM4;
        EditText editText2 = this.CatchingFishViewModelFAB;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof CatchingFishMVIMVPOkHttp ? ((CatchingFishMVIMVPOkHttp) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = CatchingFishContextGraphQL.CatchingFishPayPalService;
            TypedValue CatchingFishLayoutInflater = CatchingFishOkHttpFAB.CatchingFishLayoutInflater(com.catchingfish.fishcatcherpro.R.attr.colorSurface, context, CatchingFishContextGraphQL.class.getSimpleName());
            int i2 = CatchingFishLayoutInflater.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : CatchingFishLayoutInflater.data);
        }
        CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL();
        catchingFishContextGraphQL.CatchingFishCloudMessaging(context);
        catchingFishContextGraphQL.CatchingFishUnitTesting(dropDownBackgroundTintList);
        catchingFishContextGraphQL.CatchingFishOkHttp(popupElevation);
        catchingFishContextGraphQL.setShapeAppearanceModel(catchingFishFragmentMVVM);
        CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = catchingFishContextGraphQL.CatchingFishDaggerWebsocket;
        if (catchingFishMVPEspressoRoom.CatchingFishViewModelFAB == null) {
            catchingFishMVPEspressoRoom.CatchingFishViewModelFAB = new Rect();
        }
        catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        catchingFishContextGraphQL.invalidateSelf();
        return catchingFishContextGraphQL;
    }

    public final boolean CatchingFishViewModelScope() {
        return this.CatchingFishJobScheduler && !TextUtils.isEmpty(this.CatchingFishPayPalService) && (this.CatchingFishEspressoMockk instanceof CatchingFishMVVMService);
    }

    public final CatchingFishLiveDataHilt CatchingFishWorkManager() {
        CatchingFishLiveDataHilt catchingFishLiveDataHilt = new CatchingFishLiveDataHilt();
        catchingFishLiveDataHilt.CatchingFishWorkManager = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(getContext(), com.catchingfish.fishcatcherpro.R.attr.motionDurationShort2, 87);
        catchingFishLiveDataHilt.CatchingFishViewModelScope = CatchingFishHiltMVPToast.CatchingFishCustomView(getContext(), com.catchingfish.fishcatcherpro.R.attr.motionEasingLinearInterpolator, CatchingFishRobolectricRoom.CatchingFishParcelableFAB);
        return catchingFishLiveDataHilt;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.CatchingFishReduxKtor;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        CatchingFishDaggerHiltFAB();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.CatchingFishLayout != null) {
            boolean z = this.CatchingFishSensorManager;
            this.CatchingFishSensorManager = false;
            CharSequence hint = editText.getHint();
            this.CatchingFishViewModelFAB.setHint(this.CatchingFishLayout);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.CatchingFishViewModelFAB.setHint(hint);
                this.CatchingFishSensorManager = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.CatchingFishReduxKtor;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.CatchingFishViewModelFAB) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.CatchingFishCameraX = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.CatchingFishCameraX = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        CatchingFishContextGraphQL catchingFishContextGraphQL;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.CatchingFishJobScheduler;
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (z) {
            TextPaint textPaint = catchingFishRobolectricMVVM.CatchingFishGradleManifest;
            RectF rectF = catchingFishRobolectricMVVM.CatchingFishDaggerWebsocket;
            int save = canvas2.save();
            if (catchingFishRobolectricMVVM.CatchingFishMVPRobolectric != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishJobScheduler);
                float f = catchingFishRobolectricMVVM.CatchingFishRoomDatabase;
                float f2 = catchingFishRobolectricMVVM.CatchingFishNavigation;
                float f3 = catchingFishRobolectricMVVM.CatchingFishMutableLiveData;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((catchingFishRobolectricMVVM.CatchingFishCustomViewJUnit > 1 || catchingFishRobolectricMVVM.CatchingFishDaggerMVVM > 1) && !catchingFishRobolectricMVVM.CatchingFishCustomView && catchingFishRobolectricMVVM.CatchingFishAnimationMockk()) {
                    float lineStart = catchingFishRobolectricMVVM.CatchingFishRoomDatabase - catchingFishRobolectricMVVM.CatchingFishStripeAPI.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (catchingFishRobolectricMVVM.CatchingFishNavigationGson * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = catchingFishRobolectricMVVM.CatchingFishPayPalService;
                        float f6 = catchingFishRobolectricMVVM.CatchingFishSensorManager;
                        float f7 = catchingFishRobolectricMVVM.CatchingFishEspressoMockk;
                        int i2 = catchingFishRobolectricMVVM.CatchingFishDagger;
                        textPaint.setShadowLayer(f5, f6, f7, CatchingFishLiveDataAdMob.CatchingFishReduxKtor(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    catchingFishRobolectricMVVM.CatchingFishStripeAPI.draw(canvas2);
                    textPaint.setAlpha((int) (catchingFishRobolectricMVVM.CatchingFishAndroidX * f4));
                    if (i >= 31) {
                        float f8 = catchingFishRobolectricMVVM.CatchingFishPayPalService;
                        float f9 = catchingFishRobolectricMVVM.CatchingFishSensorManager;
                        float f10 = catchingFishRobolectricMVVM.CatchingFishEspressoMockk;
                        int i3 = catchingFishRobolectricMVVM.CatchingFishDagger;
                        textPaint.setShadowLayer(f8, f9, f10, CatchingFishLiveDataAdMob.CatchingFishReduxKtor(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = catchingFishRobolectricMVVM.CatchingFishStripeAPI.getLineBaseline(0);
                    CharSequence charSequence = catchingFishRobolectricMVVM.CatchingFishRedux;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(catchingFishRobolectricMVVM.CatchingFishPayPalService, catchingFishRobolectricMVVM.CatchingFishSensorManager, catchingFishRobolectricMVVM.CatchingFishEspressoMockk, catchingFishRobolectricMVVM.CatchingFishDagger);
                    }
                    String trim = catchingFishRobolectricMVVM.CatchingFishRedux.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(catchingFishRobolectricMVVM.CatchingFishStripeAPI.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    catchingFishRobolectricMVVM.CatchingFishStripeAPI.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.CatchingFishGradleManifest == null || (catchingFishContextGraphQL = this.CatchingFishPayPalLiveData) == null) {
            return;
        }
        catchingFishContextGraphQL.draw(canvas2);
        if (this.CatchingFishViewModelFAB.isFocused()) {
            Rect bounds = this.CatchingFishGradleManifest.getBounds();
            Rect bounds2 = this.CatchingFishPayPalLiveData.getBounds();
            float f12 = catchingFishRobolectricMVVM.CatchingFishSnackbar;
            int centerX = bounds2.centerX();
            bounds.left = CatchingFishRobolectricRoom.CatchingFishCoroutine(f12, centerX, bounds2.left);
            bounds.right = CatchingFishRobolectricRoom.CatchingFishCoroutine(f12, centerX, bounds2.right);
            this.CatchingFishGradleManifest.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.CatchingFishSharedFlow) {
            return;
        }
        this.CatchingFishSharedFlow = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (catchingFishRobolectricMVVM != null) {
            catchingFishRobolectricMVVM.CatchingFishHandler = drawableState;
            ColorStateList colorStateList2 = catchingFishRobolectricMVVM.CatchingFishCloudMessaging;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = catchingFishRobolectricMVVM.CatchingFishFragmentHandler) != null && colorStateList.isStateful())) {
                catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                z = true;
                if (this.CatchingFishViewModelFAB != null) {
                    CatchingFishSpannableWidget(isLaidOut() && isEnabled(), false);
                }
                CatchingFishJetpackCompose();
                CatchingFishCardViewRealm();
                if (z) {
                    invalidate();
                }
                this.CatchingFishSharedFlow = false;
            }
        }
        z = false;
        if (this.CatchingFishViewModelFAB != null) {
        }
        CatchingFishJetpackCompose();
        CatchingFishCardViewRealm();
        if (z) {
        }
        this.CatchingFishSharedFlow = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null) {
            return super.getBaseline();
        }
        return CatchingFishDaggerWebsocket() + getPaddingTop() + editText.getBaseline();
    }

    public CatchingFishContextGraphQL getBoxBackground() {
        int i = this.CatchingFishRecyclerView;
        if (i == 1 || i == 2) {
            return this.CatchingFishEspressoMockk;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.CatchingFishMVVMAppCompat;
    }

    public int getBoxBackgroundMode() {
        return this.CatchingFishRecyclerView;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.CatchingFishAppCompat;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.CatchingFishAndroidX;
        return layoutDirection == 1 ? this.CatchingFishMotionLayout.CatchingFishViewModelFAB.CatchingFishParcelableFAB(rectF) : this.CatchingFishMotionLayout.CatchingFishViewModelScope.CatchingFishParcelableFAB(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.CatchingFishAndroidX;
        return layoutDirection == 1 ? this.CatchingFishMotionLayout.CatchingFishViewModelScope.CatchingFishParcelableFAB(rectF) : this.CatchingFishMotionLayout.CatchingFishViewModelFAB.CatchingFishParcelableFAB(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.CatchingFishAndroidX;
        return layoutDirection == 1 ? this.CatchingFishMotionLayout.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(rectF) : this.CatchingFishMotionLayout.CatchingFishWorkManager.CatchingFishParcelableFAB(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.CatchingFishAndroidX;
        return layoutDirection == 1 ? this.CatchingFishMotionLayout.CatchingFishWorkManager.CatchingFishParcelableFAB(rectF) : this.CatchingFishMotionLayout.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(rectF);
    }

    public int getBoxStrokeColor() {
        return this.CatchingFishView;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.CatchingFishServiceMVIJUnit;
    }

    public int getBoxStrokeWidth() {
        return this.CatchingFishStateFlow;
    }

    public int getBoxStrokeWidthFocused() {
        return this.CatchingFishJUnitRealm;
    }

    public int getCounterMaxLength() {
        return this.CatchingFishStateLiveData;
    }

    public CharSequence getCounterOverflowDescription() {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle;
        if (this.CatchingFishAnimationMockk && this.CatchingFishRoomDatabase && (catchingFishDataStoreBundle = this.CatchingFish) != null) {
            return catchingFishDataStoreBundle.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.CatchingFishCustomView;
    }

    public ColorStateList getCounterTextColor() {
        return this.CatchingFishMVPRobolectric;
    }

    public ColorStateList getCursorColor() {
        return this.CatchingFishFragmentFactory;
    }

    public ColorStateList getCursorErrorColor() {
        return this.CatchingFishMutableLiveData;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.CatchingFishFirebase;
    }

    public EditText getEditText() {
        return this.CatchingFishViewModelFAB;
    }

    public CharSequence getEndIconContentDescription() {
        return this.CatchingFishWorkManager.CatchingFishFragmentHandler.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.CatchingFishWorkManager.CatchingFishFragmentHandler.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.CatchingFishWorkManager.CatchingFishStateLiveData;
    }

    public int getEndIconMode() {
        return this.CatchingFishWorkManager.CatchingFishEspressoTesting;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.CatchingFishWorkManager.CatchingFishRoomDatabase;
    }

    public CheckableImageButton getEndIconView() {
        return this.CatchingFishWorkManager.CatchingFishFragmentHandler;
    }

    public CharSequence getError() {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        if (catchingFishPicassoEspresso.CatchingFishRoomDatabase) {
            return catchingFishPicassoEspresso.CatchingFishStateLiveData;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.CatchingFishUnitTesting.CatchingFishJetpackCompose;
    }

    public CharSequence getErrorContentDescription() {
        return this.CatchingFishUnitTesting.CatchingFish;
    }

    public int getErrorCurrentTextColors() {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishUnitTesting.CatchingFishNavigation;
        if (catchingFishDataStoreBundle != null) {
            return catchingFishDataStoreBundle.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.CatchingFishWorkManager.CatchingFishWorkManager.getDrawable();
    }

    public CharSequence getHelperText() {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        if (catchingFishPicassoEspresso.CatchingFishParcelableFlux) {
            return catchingFishPicassoEspresso.CatchingFishSpannableWidget;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishUnitTesting.CatchingFishGsonAppCompat;
        if (catchingFishDataStoreBundle != null) {
            return catchingFishDataStoreBundle.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.CatchingFishJobScheduler) {
            return this.CatchingFishPayPalService;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.CatchingFishMVPReduxContext.CatchingFishWorkManager();
    }

    public final int getHintCurrentCollapsedTextColor() {
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        return catchingFishRobolectricMVVM.CatchingFishViewModelScope(catchingFishRobolectricMVVM.CatchingFishCloudMessaging);
    }

    public int getHintMaxLines() {
        return this.CatchingFishMVPReduxContext.CatchingFishCustomViewJUnit;
    }

    public ColorStateList getHintTextColor() {
        return this.CatchingFishRetrofitMVI;
    }

    public CatchingFishCardViewDagger getLengthCounter() {
        return this.CatchingFishNavigation;
    }

    public int getMaxEms() {
        return this.CatchingFishCloudMessaging;
    }

    public int getMaxWidth() {
        return this.CatchingFishOkHttp;
    }

    public int getMinEms() {
        return this.CatchingFishFragmentHandler;
    }

    public int getMinWidth() {
        return this.CatchingFishEspressoTesting;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.CatchingFishWorkManager.CatchingFishFragmentHandler.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.CatchingFishWorkManager.CatchingFishFragmentHandler.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.CatchingFishSpannableWidget) {
            return this.CatchingFishDaggerHiltFAB;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.CatchingFishCardViewRealm;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.CatchingFishGsonAppCompat;
    }

    public CharSequence getPrefixText() {
        return this.CatchingFishDaggerWebsocket.CatchingFishWorkManager;
    }

    public ColorStateList getPrefixTextColor() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
    }

    public CatchingFishFragmentMVVM getShapeAppearanceModel() {
        return this.CatchingFishMotionLayout;
    }

    public CharSequence getStartIconContentDescription() {
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging;
    }

    public CharSequence getSuffixText() {
        return this.CatchingFishWorkManager.CatchingFish;
    }

    public ColorStateList getSuffixTextColor() {
        return this.CatchingFishWorkManager.CatchingFishJetpackCompose.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.CatchingFishWorkManager.CatchingFishJetpackCompose;
    }

    public Typeface getTypeface() {
        return this.CatchingFishNavigationGson;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.CatchingFishMVPReduxContext.CatchingFishLayout(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.CatchingFishLifecycle = false;
        if (this.CatchingFishViewModelFAB != null && this.CatchingFishViewModelFAB.getMeasuredHeight() < (max = Math.max(catchingFishFragmentCameraX.getMeasuredHeight(), this.CatchingFishDaggerWebsocket.getMeasuredHeight()))) {
            this.CatchingFishViewModelFAB.setMinimumHeight(max);
            z = true;
        }
        boolean CatchingFish = CatchingFish();
        if (z || CatchingFish) {
            this.CatchingFishViewModelFAB.post(new CatchingFishMVPLayout(21, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText != null) {
            Rect rect = this.CatchingFishStripeAPI;
            CatchingFishExoPlayerFlux.CatchingFishParcelableFAB(this, editText, rect);
            CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishPayPalLiveData;
            if (catchingFishContextGraphQL != null) {
                int i6 = rect.bottom;
                catchingFishContextGraphQL.setBounds(rect.left, i6 - this.CatchingFishStateFlow, rect.right, i6);
            }
            CatchingFishContextGraphQL catchingFishContextGraphQL2 = this.CatchingFishGradleManifest;
            if (catchingFishContextGraphQL2 != null) {
                int i7 = rect.bottom;
                catchingFishContextGraphQL2.setBounds(rect.left, i7 - this.CatchingFishJUnitRealm, rect.right, i7);
            }
            if (this.CatchingFishJobScheduler) {
                float textSize = this.CatchingFishViewModelFAB.getTextSize();
                CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
                float f = catchingFishRobolectricMVVM.CatchingFishViewModelFAB;
                TextPaint textPaint = catchingFishRobolectricMVVM.CatchingFishMotionLayout;
                if (f != textSize) {
                    catchingFishRobolectricMVVM.CatchingFishViewModelFAB = textSize;
                    catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                }
                int gravity = this.CatchingFishViewModelFAB.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (catchingFishRobolectricMVVM.CatchingFishViewModelScope != i8) {
                    catchingFishRobolectricMVVM.CatchingFishViewModelScope = i8;
                    catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                }
                if (catchingFishRobolectricMVVM.CatchingFishWorkManager != gravity) {
                    catchingFishRobolectricMVVM.CatchingFishWorkManager = gravity;
                    catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                }
                Rect CatchingFishReduxKtor = CatchingFishReduxKtor(rect);
                int i9 = CatchingFishReduxKtor.left;
                int i10 = CatchingFishReduxKtor.top;
                int i11 = CatchingFishReduxKtor.right;
                int i12 = CatchingFishReduxKtor.bottom;
                Rect rect2 = catchingFishRobolectricMVVM.CatchingFishReduxKtor;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    catchingFishRobolectricMVVM.CatchingFishPayPalLiveData = true;
                }
                if (this.CatchingFishViewModelFAB == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishViewModelFAB);
                    textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFishDaggerHiltFAB);
                    textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishAnimation);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishViewModelFAB);
                    textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFishDaggerHiltFAB);
                    textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishAnimation);
                    descent = catchingFishRobolectricMVVM.CatchingFishEspressoTesting * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.CatchingFishViewModelFAB.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.CatchingFishMoshiDaggerHilt;
                rect3.left = compoundPaddingLeft;
                if (this.CatchingFishRecyclerView != 1 || this.CatchingFishViewModelFAB.getMinLines() > 1) {
                    if (this.CatchingFishRecyclerView != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishViewModelFAB);
                        textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFishDaggerHiltFAB);
                        textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishAnimation);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.CatchingFishViewModelFAB.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.CatchingFishViewModelFAB.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.CatchingFishRecyclerView != 1 || this.CatchingFishViewModelFAB.getMinLines() > 1) ? rect.bottom - this.CatchingFishViewModelFAB.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = catchingFishRobolectricMVVM.CatchingFishCoroutine;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != catchingFishRobolectricMVVM.CatchingFishRetrofitMVI) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    catchingFishRobolectricMVVM.CatchingFishPayPalLiveData = true;
                    catchingFishRobolectricMVVM.CatchingFishRetrofitMVI = true;
                }
                catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                if (!CatchingFishViewModelScope() || this.CatchingFishWebSocketMockk) {
                    return;
                }
                CatchingFishEspressoTesting();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.CatchingFishLifecycle;
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (!z) {
            catchingFishFragmentCameraX.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.CatchingFishLifecycle = true;
        }
        if (this.CatchingFishParcelableFlux != null && (editText = this.CatchingFishViewModelFAB) != null) {
            this.CatchingFishParcelableFlux.setGravity(editText.getGravity());
            this.CatchingFishParcelableFlux.setPadding(this.CatchingFishViewModelFAB.getCompoundPaddingLeft(), this.CatchingFishViewModelFAB.getCompoundPaddingTop(), this.CatchingFishViewModelFAB.getCompoundPaddingRight(), this.CatchingFishViewModelFAB.getCompoundPaddingBottom());
        }
        catchingFishFragmentCameraX.CatchingFishOkHttp();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.CatchingFishViewModelFAB.getMeasuredWidth() - this.CatchingFishViewModelFAB.getCompoundPaddingLeft()) - this.CatchingFishViewModelFAB.getCompoundPaddingRight();
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        TextPaint textPaint = catchingFishRobolectricMVVM.CatchingFishMotionLayout;
        textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishLayout);
        textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFish);
        textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishJUnitRealm);
        float f2 = measuredWidth;
        catchingFishRobolectricMVVM.CatchingFishPicasso = catchingFishRobolectricMVVM.CatchingFishDaggerWebsocket(catchingFishRobolectricMVVM.CatchingFishDaggerMVVM, textPaint, catchingFishRobolectricMVVM.CatchingFishCardViewView, (catchingFishRobolectricMVVM.CatchingFishLayout / catchingFishRobolectricMVVM.CatchingFishViewModelFAB) * f2, catchingFishRobolectricMVVM.CatchingFishCustomView).getHeight();
        textPaint.setTextSize(catchingFishRobolectricMVVM.CatchingFishViewModelFAB);
        textPaint.setTypeface(catchingFishRobolectricMVVM.CatchingFishDaggerHiltFAB);
        textPaint.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishAnimation);
        catchingFishRobolectricMVVM.CatchingFishFirebase = catchingFishRobolectricMVVM.CatchingFishDaggerWebsocket(catchingFishRobolectricMVVM.CatchingFishCustomViewJUnit, textPaint, catchingFishRobolectricMVVM.CatchingFishCardViewView, f2, catchingFishRobolectricMVVM.CatchingFishCustomView).getHeight();
        EditText editText2 = this.CatchingFishViewModelFAB;
        Rect rect = this.CatchingFishStripeAPI;
        CatchingFishExoPlayerFlux.CatchingFishParcelableFAB(this, editText2, rect);
        Rect CatchingFishReduxKtor = CatchingFishReduxKtor(rect);
        int i3 = CatchingFishReduxKtor.left;
        int i4 = CatchingFishReduxKtor.top;
        int i5 = CatchingFishReduxKtor.right;
        int i6 = CatchingFishReduxKtor.bottom;
        Rect rect2 = catchingFishRobolectricMVVM.CatchingFishReduxKtor;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            catchingFishRobolectricMVVM.CatchingFishPayPalLiveData = true;
        }
        CatchingFishDaggerHiltFAB();
        CatchingFishParcelableFAB();
        if (this.CatchingFishViewModelFAB == null) {
            return;
        }
        int i7 = catchingFishRobolectricMVVM.CatchingFishFirebase;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = catchingFishRobolectricMVVM.CatchingFishMotionLayout;
            textPaint2.setTextSize(catchingFishRobolectricMVVM.CatchingFishViewModelFAB);
            textPaint2.setTypeface(catchingFishRobolectricMVVM.CatchingFishDaggerHiltFAB);
            textPaint2.setLetterSpacing(catchingFishRobolectricMVVM.CatchingFishAnimation);
            f = -textPaint2.ascent();
        }
        if (this.CatchingFishDaggerHiltFAB != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.CatchingFishParcelableFlux.getPaint());
            textPaint3.setTextSize(this.CatchingFishParcelableFlux.getTextSize());
            textPaint3.setTypeface(this.CatchingFishParcelableFlux.getTypeface());
            textPaint3.setLetterSpacing(this.CatchingFishParcelableFlux.getLetterSpacing());
            CatchingFishKtorRobolectric catchingFishKtorRobolectric = new CatchingFishKtorRobolectric(this.CatchingFishDaggerHiltFAB, textPaint3, measuredWidth);
            catchingFishKtorRobolectric.CatchingFishCloudMessaging = getLayoutDirection() == 1;
            catchingFishKtorRobolectric.CatchingFishFragmentHandler = true;
            float lineSpacingExtra = this.CatchingFishParcelableFlux.getLineSpacingExtra();
            float lineSpacingMultiplier = this.CatchingFishParcelableFlux.getLineSpacingMultiplier();
            catchingFishKtorRobolectric.CatchingFishViewModelScope = lineSpacingExtra;
            catchingFishKtorRobolectric.CatchingFishViewModelFAB = lineSpacingMultiplier;
            catchingFishKtorRobolectric.CatchingFishOkHttp = new CatchingFishLayoutCoroutine(6, this);
            r3 = (this.CatchingFishRecyclerView == 1 ? catchingFishRobolectricMVVM.CatchingFishWorkManager() + this.CatchingFishAppCompat + this.CatchingFishViewModelScope : 0.0f) + catchingFishKtorRobolectric.CatchingFishParcelableFAB().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.CatchingFishViewModelFAB.getMeasuredHeight() < max) {
            this.CatchingFishViewModelFAB.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishToastNavigation)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishToastNavigation catchingFishToastNavigation = (CatchingFishToastNavigation) parcelable;
        super.onRestoreInstanceState(catchingFishToastNavigation.CatchingFishReduxKtor);
        setError(catchingFishToastNavigation.CatchingFishWorkManager);
        if (catchingFishToastNavigation.CatchingFishViewModelScope) {
            post(new CatchingFishGsonRealm(15, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.CatchingFishLayoutInflater) {
            CatchingFishCameraXGradle catchingFishCameraXGradle = this.CatchingFishMotionLayout.CatchingFishDaggerWebsocket;
            RectF rectF = this.CatchingFishAndroidX;
            float CatchingFishParcelableFAB = catchingFishCameraXGradle.CatchingFishParcelableFAB(rectF);
            float CatchingFishParcelableFAB2 = this.CatchingFishMotionLayout.CatchingFishWorkManager.CatchingFishParcelableFAB(rectF);
            float CatchingFishParcelableFAB3 = this.CatchingFishMotionLayout.CatchingFishViewModelFAB.CatchingFishParcelableFAB(rectF);
            float CatchingFishParcelableFAB4 = this.CatchingFishMotionLayout.CatchingFishViewModelScope.CatchingFishParcelableFAB(rectF);
            CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishMotionLayout;
            CatchingFishLayoutRoomFAB catchingFishLayoutRoomFAB = catchingFishFragmentMVVM.CatchingFishParcelableFAB;
            CatchingFishLayoutRoomFAB catchingFishLayoutRoomFAB2 = catchingFishFragmentMVVM.CatchingFishSnackbar;
            CatchingFishLayoutRoomFAB catchingFishLayoutRoomFAB3 = catchingFishFragmentMVVM.CatchingFishReduxKtor;
            CatchingFishLayoutRoomFAB catchingFishLayoutRoomFAB4 = catchingFishFragmentMVVM.CatchingFishCoroutine;
            CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(0);
            CatchingFishGradleMVVM catchingFishGradleMVVM2 = new CatchingFishGradleMVVM(0);
            CatchingFishGradleMVVM catchingFishGradleMVVM3 = new CatchingFishGradleMVVM(0);
            CatchingFishGradleMVVM catchingFishGradleMVVM4 = new CatchingFishGradleMVVM(0);
            CatchingFishKtorMVI.CatchingFishSnackbar(catchingFishLayoutRoomFAB2);
            CatchingFishKtorMVI.CatchingFishSnackbar(catchingFishLayoutRoomFAB);
            CatchingFishKtorMVI.CatchingFishSnackbar(catchingFishLayoutRoomFAB4);
            CatchingFishKtorMVI.CatchingFishSnackbar(catchingFishLayoutRoomFAB3);
            CatchingFishEspressoTesting catchingFishEspressoTesting = new CatchingFishEspressoTesting(CatchingFishParcelableFAB2);
            CatchingFishEspressoTesting catchingFishEspressoTesting2 = new CatchingFishEspressoTesting(CatchingFishParcelableFAB);
            CatchingFishEspressoTesting catchingFishEspressoTesting3 = new CatchingFishEspressoTesting(CatchingFishParcelableFAB4);
            CatchingFishEspressoTesting catchingFishEspressoTesting4 = new CatchingFishEspressoTesting(CatchingFishParcelableFAB3);
            CatchingFishFragmentMVVM catchingFishFragmentMVVM2 = new CatchingFishFragmentMVVM();
            catchingFishFragmentMVVM2.CatchingFishParcelableFAB = catchingFishLayoutRoomFAB2;
            catchingFishFragmentMVVM2.CatchingFishSnackbar = catchingFishLayoutRoomFAB;
            catchingFishFragmentMVVM2.CatchingFishCoroutine = catchingFishLayoutRoomFAB3;
            catchingFishFragmentMVVM2.CatchingFishReduxKtor = catchingFishLayoutRoomFAB4;
            catchingFishFragmentMVVM2.CatchingFishDaggerWebsocket = catchingFishEspressoTesting;
            catchingFishFragmentMVVM2.CatchingFishWorkManager = catchingFishEspressoTesting2;
            catchingFishFragmentMVVM2.CatchingFishViewModelScope = catchingFishEspressoTesting4;
            catchingFishFragmentMVVM2.CatchingFishViewModelFAB = catchingFishEspressoTesting3;
            catchingFishFragmentMVVM2.CatchingFishLayout = catchingFishGradleMVVM;
            catchingFishFragmentMVVM2.CatchingFishFragmentHandler = catchingFishGradleMVVM2;
            catchingFishFragmentMVVM2.CatchingFishCloudMessaging = catchingFishGradleMVVM3;
            catchingFishFragmentMVVM2.CatchingFishEspressoTesting = catchingFishGradleMVVM4;
            this.CatchingFishLayoutInflater = z;
            setShapeAppearanceModel(catchingFishFragmentMVVM2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishToastNavigation catchingFishToastNavigation = new CatchingFishToastNavigation(super.onSaveInstanceState());
        if (CatchingFishAnimationMockk()) {
            catchingFishToastNavigation.CatchingFishWorkManager = getError();
        }
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishToastNavigation.CatchingFishViewModelScope = catchingFishFragmentCameraX.CatchingFishEspressoTesting != 0 && catchingFishFragmentCameraX.CatchingFishFragmentHandler.CatchingFishViewModelScope;
        return catchingFishToastNavigation;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.CatchingFishMVVMAppCompat != i) {
            this.CatchingFishMVVMAppCompat = i;
            this.CatchingFishGlideWidgetKtor = i;
            this.CatchingFishGraphQLGlide = i;
            this.CatchingFishStateFlowIntent = i;
            CatchingFishCoroutine();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.CatchingFishGlideWidgetKtor = defaultColor;
        this.CatchingFishMVVMAppCompat = defaultColor;
        this.CatchingFishFABLayout = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.CatchingFishGraphQLGlide = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.CatchingFishStateFlowIntent = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        CatchingFishCoroutine();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.CatchingFishRecyclerView) {
            return;
        }
        this.CatchingFishRecyclerView = i;
        if (this.CatchingFishViewModelFAB != null) {
            CatchingFishCloudMessaging();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.CatchingFishAppCompat = i;
    }

    public void setBoxCornerFamily(int i) {
        CatchingFishKtorMVI CatchingFishWorkManager = this.CatchingFishMotionLayout.CatchingFishWorkManager();
        CatchingFishCameraXGradle catchingFishCameraXGradle = this.CatchingFishMotionLayout.CatchingFishDaggerWebsocket;
        CatchingFishLayoutRoomFAB CatchingFishViewModelFAB = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i);
        CatchingFishWorkManager.CatchingFishParcelableFAB = CatchingFishViewModelFAB;
        CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB);
        CatchingFishWorkManager.CatchingFishDaggerWebsocket = catchingFishCameraXGradle;
        CatchingFishCameraXGradle catchingFishCameraXGradle2 = this.CatchingFishMotionLayout.CatchingFishWorkManager;
        CatchingFishLayoutRoomFAB CatchingFishViewModelFAB2 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i);
        CatchingFishWorkManager.CatchingFishSnackbar = CatchingFishViewModelFAB2;
        CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB2);
        CatchingFishWorkManager.CatchingFishWorkManager = catchingFishCameraXGradle2;
        CatchingFishCameraXGradle catchingFishCameraXGradle3 = this.CatchingFishMotionLayout.CatchingFishViewModelFAB;
        CatchingFishLayoutRoomFAB CatchingFishViewModelFAB3 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i);
        CatchingFishWorkManager.CatchingFishReduxKtor = CatchingFishViewModelFAB3;
        CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB3);
        CatchingFishWorkManager.CatchingFishViewModelFAB = catchingFishCameraXGradle3;
        CatchingFishCameraXGradle catchingFishCameraXGradle4 = this.CatchingFishMotionLayout.CatchingFishViewModelScope;
        CatchingFishLayoutRoomFAB CatchingFishViewModelFAB4 = CatchingFishKtorViewModel.CatchingFishViewModelFAB(i);
        CatchingFishWorkManager.CatchingFishCoroutine = CatchingFishViewModelFAB4;
        CatchingFishKtorMVI.CatchingFishSnackbar(CatchingFishViewModelFAB4);
        CatchingFishWorkManager.CatchingFishViewModelScope = catchingFishCameraXGradle4;
        this.CatchingFishMotionLayout = CatchingFishWorkManager.CatchingFishParcelableFAB();
        CatchingFishCoroutine();
    }

    public void setBoxStrokeColor(int i) {
        if (this.CatchingFishView != i) {
            this.CatchingFishView = i;
            CatchingFishCardViewRealm();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.CatchingFishGradleLiveData = colorStateList.getDefaultColor();
            this.CatchingFishWidget = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.CatchingFishRetrofit = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.CatchingFishView = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.CatchingFishView != colorStateList.getDefaultColor()) {
            this.CatchingFishView = colorStateList.getDefaultColor();
        }
        CatchingFishCardViewRealm();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.CatchingFishServiceMVIJUnit != colorStateList) {
            this.CatchingFishServiceMVIJUnit = colorStateList;
            CatchingFishCardViewRealm();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.CatchingFishStateFlow = i;
        CatchingFishCardViewRealm();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.CatchingFishJUnitRealm = i;
        CatchingFishCardViewRealm();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.CatchingFishAnimationMockk != z) {
            CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
            if (z) {
                CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(getContext(), null);
                this.CatchingFish = catchingFishDataStoreBundle;
                catchingFishDataStoreBundle.setId(com.catchingfish.fishcatcherpro.R.id.textinput_counter);
                Typeface typeface = this.CatchingFishNavigationGson;
                if (typeface != null) {
                    this.CatchingFish.setTypeface(typeface);
                }
                this.CatchingFish.setMaxLines(1);
                catchingFishPicassoEspresso.CatchingFishParcelableFAB(this.CatchingFish, 2);
                ((ViewGroup.MarginLayoutParams) this.CatchingFish.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_textinput_counter_margin_start));
                CatchingFishRoomDatabase();
                if (this.CatchingFish != null) {
                    EditText editText = this.CatchingFishViewModelFAB;
                    CatchingFishStateLiveData(editText != null ? editText.getText() : null);
                }
            } else {
                catchingFishPicassoEspresso.CatchingFishViewModelScope(this.CatchingFish, 2);
                this.CatchingFish = null;
            }
            this.CatchingFishAnimationMockk = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.CatchingFishStateLiveData != i) {
            if (i > 0) {
                this.CatchingFishStateLiveData = i;
            } else {
                this.CatchingFishStateLiveData = -1;
            }
            if (!this.CatchingFishAnimationMockk || this.CatchingFish == null) {
                return;
            }
            EditText editText = this.CatchingFishViewModelFAB;
            CatchingFishStateLiveData(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.CatchingFishJetpackCompose != i) {
            this.CatchingFishJetpackCompose = i;
            CatchingFishRoomDatabase();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.CatchingFishCustomView != colorStateList) {
            this.CatchingFishCustomView = colorStateList;
            CatchingFishRoomDatabase();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.CatchingFishCoroutineFlow != i) {
            this.CatchingFishCoroutineFlow = i;
            CatchingFishRoomDatabase();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.CatchingFishMVPRobolectric != colorStateList) {
            this.CatchingFishMVPRobolectric = colorStateList;
            CatchingFishRoomDatabase();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.CatchingFishFragmentFactory != colorStateList) {
            this.CatchingFishFragmentFactory = colorStateList;
            CatchingFishNavigation();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.CatchingFishMutableLiveData != colorStateList) {
            this.CatchingFishMutableLiveData = colorStateList;
            if (CatchingFishAnimationMockk() || (this.CatchingFish != null && this.CatchingFishRoomDatabase)) {
                CatchingFishNavigation();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.CatchingFishFirebase = colorStateList;
        this.CatchingFishRetrofitMVI = colorStateList;
        if (this.CatchingFishViewModelFAB != null) {
            CatchingFishSpannableWidget(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        CatchingFishOkHttp(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.CatchingFishWorkManager.CatchingFishFragmentHandler.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.CatchingFishWorkManager.CatchingFishFragmentHandler.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        CharSequence text = i != 0 ? catchingFishFragmentCameraX.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        Drawable CatchingFishCustomView = i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), i) : null;
        TextInputLayout textInputLayout = catchingFishFragmentCameraX.CatchingFishReduxKtor;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        checkableImageButton.setImageDrawable(CatchingFishCustomView);
        if (CatchingFishCustomView != null) {
            CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting, catchingFishFragmentCameraX.CatchingFishAnimationMockk);
            CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting);
        }
    }

    public void setEndIconMinSize(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (i < 0) {
            catchingFishFragmentCameraX.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != catchingFishFragmentCameraX.CatchingFishStateLiveData) {
            catchingFishFragmentCameraX.CatchingFishStateLiveData = i;
            CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = catchingFishFragmentCameraX.CatchingFishWorkManager;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.CatchingFishWorkManager.CatchingFishViewModelScope(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        View.OnLongClickListener onLongClickListener = catchingFishFragmentCameraX.CatchingFishNavigation;
        checkableImageButton.setOnClickListener(onClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishNavigation = onLongClickListener;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishRoomDatabase = scaleType;
        catchingFishFragmentCameraX.CatchingFishFragmentHandler.setScaleType(scaleType);
        catchingFishFragmentCameraX.CatchingFishWorkManager.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (catchingFishFragmentCameraX.CatchingFishUnitTesting != colorStateList) {
            catchingFishFragmentCameraX.CatchingFishUnitTesting = colorStateList;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishFragmentHandler, colorStateList, catchingFishFragmentCameraX.CatchingFishAnimationMockk);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (catchingFishFragmentCameraX.CatchingFishAnimationMockk != mode) {
            catchingFishFragmentCameraX.CatchingFishAnimationMockk = mode;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishFragmentHandler, catchingFishFragmentCameraX.CatchingFishUnitTesting, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.CatchingFishWorkManager.CatchingFishViewModelFAB(z);
    }

    public void setError(CharSequence charSequence) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        if (!catchingFishPicassoEspresso.CatchingFishRoomDatabase) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            catchingFishPicassoEspresso.CatchingFishWorkManager();
            return;
        }
        catchingFishPicassoEspresso.CatchingFishCoroutine();
        catchingFishPicassoEspresso.CatchingFishStateLiveData = charSequence;
        catchingFishPicassoEspresso.CatchingFishNavigation.setText(charSequence);
        int i = catchingFishPicassoEspresso.CatchingFishUnitTesting;
        if (i != 1) {
            catchingFishPicassoEspresso.CatchingFishAnimationMockk = 1;
        }
        catchingFishPicassoEspresso.CatchingFishLayout(i, catchingFishPicassoEspresso.CatchingFishAnimationMockk, catchingFishPicassoEspresso.CatchingFishViewModelFAB(catchingFishPicassoEspresso.CatchingFishNavigation, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFishJetpackCompose = i;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFish = charSequence;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        TextInputLayout textInputLayout = catchingFishPicassoEspresso.CatchingFishViewModelFAB;
        if (catchingFishPicassoEspresso.CatchingFishRoomDatabase == z) {
            return;
        }
        catchingFishPicassoEspresso.CatchingFishCoroutine();
        if (z) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(catchingFishPicassoEspresso.CatchingFishViewModelScope, null);
            catchingFishPicassoEspresso.CatchingFishNavigation = catchingFishDataStoreBundle;
            catchingFishDataStoreBundle.setId(com.catchingfish.fishcatcherpro.R.id.textinput_error);
            catchingFishPicassoEspresso.CatchingFishNavigation.setTextAlignment(5);
            Typeface typeface = catchingFishPicassoEspresso.CatchingFishCardViewView;
            if (typeface != null) {
                catchingFishPicassoEspresso.CatchingFishNavigation.setTypeface(typeface);
            }
            int i = catchingFishPicassoEspresso.CatchingFishCoroutineFlow;
            catchingFishPicassoEspresso.CatchingFishCoroutineFlow = i;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = catchingFishPicassoEspresso.CatchingFishNavigation;
            if (catchingFishDataStoreBundle2 != null) {
                catchingFishPicassoEspresso.CatchingFishViewModelFAB.CatchingFishUnitTesting(catchingFishDataStoreBundle2, i);
            }
            ColorStateList colorStateList = catchingFishPicassoEspresso.CatchingFishDaggerHiltFAB;
            catchingFishPicassoEspresso.CatchingFishDaggerHiltFAB = colorStateList;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = catchingFishPicassoEspresso.CatchingFishNavigation;
            if (catchingFishDataStoreBundle3 != null && colorStateList != null) {
                catchingFishDataStoreBundle3.setTextColor(colorStateList);
            }
            CharSequence charSequence = catchingFishPicassoEspresso.CatchingFish;
            catchingFishPicassoEspresso.CatchingFish = charSequence;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle4 = catchingFishPicassoEspresso.CatchingFishNavigation;
            if (catchingFishDataStoreBundle4 != null) {
                catchingFishDataStoreBundle4.setContentDescription(charSequence);
            }
            int i2 = catchingFishPicassoEspresso.CatchingFishJetpackCompose;
            catchingFishPicassoEspresso.CatchingFishJetpackCompose = i2;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle5 = catchingFishPicassoEspresso.CatchingFishNavigation;
            if (catchingFishDataStoreBundle5 != null) {
                catchingFishDataStoreBundle5.setAccessibilityLiveRegion(i2);
            }
            catchingFishPicassoEspresso.CatchingFishNavigation.setVisibility(4);
            catchingFishPicassoEspresso.CatchingFishParcelableFAB(catchingFishPicassoEspresso.CatchingFishNavigation, 0);
        } else {
            catchingFishPicassoEspresso.CatchingFishWorkManager();
            catchingFishPicassoEspresso.CatchingFishViewModelScope(catchingFishPicassoEspresso.CatchingFishNavigation, 0);
            catchingFishPicassoEspresso.CatchingFishNavigation = null;
            textInputLayout.CatchingFishJetpackCompose();
            textInputLayout.CatchingFishCardViewRealm();
        }
        catchingFishPicassoEspresso.CatchingFishRoomDatabase = z;
    }

    public void setErrorIconDrawable(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishLayout(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), i) : null);
        CatchingFishRobolectricHilt.CatchingFishGradleManifest(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishWorkManager, catchingFishFragmentCameraX.CatchingFishViewModelScope);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishWorkManager;
        View.OnLongClickListener onLongClickListener = catchingFishFragmentCameraX.CatchingFishLayout;
        checkableImageButton.setOnClickListener(onClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishLayout = onLongClickListener;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishWorkManager;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (catchingFishFragmentCameraX.CatchingFishViewModelScope != colorStateList) {
            catchingFishFragmentCameraX.CatchingFishViewModelScope = colorStateList;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishWorkManager, colorStateList, catchingFishFragmentCameraX.CatchingFishViewModelFAB);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (catchingFishFragmentCameraX.CatchingFishViewModelFAB != mode) {
            catchingFishFragmentCameraX.CatchingFishViewModelFAB = mode;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishWorkManager, catchingFishFragmentCameraX.CatchingFishViewModelScope, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFishCoroutineFlow = i;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation;
        if (catchingFishDataStoreBundle != null) {
            catchingFishPicassoEspresso.CatchingFishViewModelFAB.CatchingFishUnitTesting(catchingFishDataStoreBundle, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFishDaggerHiltFAB = colorStateList;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation;
        if (catchingFishDataStoreBundle == null || colorStateList == null) {
            return;
        }
        catchingFishDataStoreBundle.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.CatchingFishRealmKtorRealm != z) {
            this.CatchingFishRealmKtorRealm = z;
            CatchingFishSpannableWidget(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        if (isEmpty) {
            if (catchingFishPicassoEspresso.CatchingFishParcelableFlux) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!catchingFishPicassoEspresso.CatchingFishParcelableFlux) {
            setHelperTextEnabled(true);
        }
        catchingFishPicassoEspresso.CatchingFishCoroutine();
        catchingFishPicassoEspresso.CatchingFishSpannableWidget = charSequence;
        catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setText(charSequence);
        int i = catchingFishPicassoEspresso.CatchingFishUnitTesting;
        if (i != 2) {
            catchingFishPicassoEspresso.CatchingFishAnimationMockk = 2;
        }
        catchingFishPicassoEspresso.CatchingFishLayout(i, catchingFishPicassoEspresso.CatchingFishAnimationMockk, catchingFishPicassoEspresso.CatchingFishViewModelFAB(catchingFishPicassoEspresso.CatchingFishGsonAppCompat, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFishPayPal = colorStateList;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishGsonAppCompat;
        if (catchingFishDataStoreBundle == null || colorStateList == null) {
            return;
        }
        catchingFishDataStoreBundle.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        TextInputLayout textInputLayout = catchingFishPicassoEspresso.CatchingFishViewModelFAB;
        if (catchingFishPicassoEspresso.CatchingFishParcelableFlux == z) {
            return;
        }
        catchingFishPicassoEspresso.CatchingFishCoroutine();
        if (z) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(catchingFishPicassoEspresso.CatchingFishViewModelScope, null);
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat = catchingFishDataStoreBundle;
            catchingFishDataStoreBundle.setId(com.catchingfish.fishcatcherpro.R.id.textinput_helper_text);
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setTextAlignment(5);
            Typeface typeface = catchingFishPicassoEspresso.CatchingFishCardViewView;
            if (typeface != null) {
                catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setTypeface(typeface);
            }
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setVisibility(4);
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setAccessibilityLiveRegion(1);
            int i = catchingFishPicassoEspresso.CatchingFishCardViewRealm;
            catchingFishPicassoEspresso.CatchingFishCardViewRealm = i;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = catchingFishPicassoEspresso.CatchingFishGsonAppCompat;
            if (catchingFishDataStoreBundle2 != null) {
                catchingFishDataStoreBundle2.setTextAppearance(i);
            }
            ColorStateList colorStateList = catchingFishPicassoEspresso.CatchingFishPayPal;
            catchingFishPicassoEspresso.CatchingFishPayPal = colorStateList;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = catchingFishPicassoEspresso.CatchingFishGsonAppCompat;
            if (catchingFishDataStoreBundle3 != null && colorStateList != null) {
                catchingFishDataStoreBundle3.setTextColor(colorStateList);
            }
            catchingFishPicassoEspresso.CatchingFishParcelableFAB(catchingFishPicassoEspresso.CatchingFishGsonAppCompat, 1);
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat.setAccessibilityDelegate(new CatchingFishJUnitMockk(catchingFishPicassoEspresso));
        } else {
            catchingFishPicassoEspresso.CatchingFishCoroutine();
            int i2 = catchingFishPicassoEspresso.CatchingFishUnitTesting;
            if (i2 == 2) {
                catchingFishPicassoEspresso.CatchingFishAnimationMockk = 0;
            }
            catchingFishPicassoEspresso.CatchingFishLayout(i2, catchingFishPicassoEspresso.CatchingFishAnimationMockk, catchingFishPicassoEspresso.CatchingFishViewModelFAB(catchingFishPicassoEspresso.CatchingFishGsonAppCompat, ""));
            catchingFishPicassoEspresso.CatchingFishViewModelScope(catchingFishPicassoEspresso.CatchingFishGsonAppCompat, 1);
            catchingFishPicassoEspresso.CatchingFishGsonAppCompat = null;
            textInputLayout.CatchingFishJetpackCompose();
            textInputLayout.CatchingFishCardViewRealm();
        }
        catchingFishPicassoEspresso.CatchingFishParcelableFlux = z;
    }

    public void setHelperTextTextAppearance(int i) {
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
        catchingFishPicassoEspresso.CatchingFishCardViewRealm = i;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishGsonAppCompat;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.CatchingFishJobScheduler) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.CatchingFishDynamicFeature = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.CatchingFishJobScheduler) {
            this.CatchingFishJobScheduler = z;
            if (z) {
                CharSequence hint = this.CatchingFishViewModelFAB.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.CatchingFishPayPalService)) {
                        setHint(hint);
                    }
                    this.CatchingFishViewModelFAB.setHint((CharSequence) null);
                }
                this.CatchingFishSensorManager = true;
            } else {
                this.CatchingFishSensorManager = false;
                if (!TextUtils.isEmpty(this.CatchingFishPayPalService) && TextUtils.isEmpty(this.CatchingFishViewModelFAB.getHint())) {
                    this.CatchingFishViewModelFAB.setHint(this.CatchingFishPayPalService);
                }
                setHintInternal(null);
            }
            if (this.CatchingFishViewModelFAB != null) {
                CatchingFishDaggerHiltFAB();
            }
        }
    }

    public void setHintMaxLines(int i) {
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        if (i != catchingFishRobolectricMVVM.CatchingFishDaggerMVVM) {
            catchingFishRobolectricMVVM.CatchingFishDaggerMVVM = i;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        if (i != catchingFishRobolectricMVVM.CatchingFishCustomViewJUnit) {
            catchingFishRobolectricMVVM.CatchingFishCustomViewJUnit = i;
            catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
        TextInputLayout textInputLayout = catchingFishRobolectricMVVM.CatchingFishParcelableFAB;
        CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = new CatchingFishPicassoOkHttp(textInputLayout.getContext(), i);
        ColorStateList colorStateList = catchingFishPicassoOkHttp.CatchingFishCloudMessaging;
        if (colorStateList != null) {
            catchingFishRobolectricMVVM.CatchingFishCloudMessaging = colorStateList;
        }
        float f = catchingFishPicassoOkHttp.CatchingFishEspressoTesting;
        if (f != 0.0f) {
            catchingFishRobolectricMVVM.CatchingFishLayout = f;
        }
        ColorStateList colorStateList2 = catchingFishPicassoOkHttp.CatchingFishParcelableFAB;
        if (colorStateList2 != null) {
            catchingFishRobolectricMVVM.CatchingFishStateFlow = colorStateList2;
        }
        catchingFishRobolectricMVVM.CatchingFishAppCompat = catchingFishPicassoOkHttp.CatchingFishWorkManager;
        catchingFishRobolectricMVVM.CatchingFishDataStoreIntent = catchingFishPicassoOkHttp.CatchingFishViewModelScope;
        catchingFishRobolectricMVVM.CatchingFishRecyclerView = catchingFishPicassoOkHttp.CatchingFishViewModelFAB;
        catchingFishRobolectricMVVM.CatchingFishJUnitRealm = catchingFishPicassoOkHttp.CatchingFishFragmentHandler;
        CatchingFishCameraXCardView catchingFishCameraXCardView = catchingFishRobolectricMVVM.CatchingFishCardViewRealm;
        if (catchingFishCameraXCardView != null) {
            catchingFishCameraXCardView.CatchingFishViewModelFAB = true;
        }
        CatchingFishServiceHilt catchingFishServiceHilt = new CatchingFishServiceHilt(23, catchingFishRobolectricMVVM);
        catchingFishPicassoOkHttp.CatchingFishParcelableFAB();
        catchingFishRobolectricMVVM.CatchingFishCardViewRealm = new CatchingFishCameraXCardView(catchingFishServiceHilt, catchingFishPicassoOkHttp.CatchingFishStateLiveData);
        catchingFishPicassoOkHttp.CatchingFishSnackbar(textInputLayout.getContext(), catchingFishRobolectricMVVM.CatchingFishCardViewRealm);
        catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
        this.CatchingFishRetrofitMVI = catchingFishRobolectricMVVM.CatchingFishCloudMessaging;
        if (this.CatchingFishViewModelFAB != null) {
            CatchingFishSpannableWidget(false, false);
            CatchingFishDaggerHiltFAB();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.CatchingFishRetrofitMVI != colorStateList) {
            if (this.CatchingFishFirebase == null) {
                CatchingFishRobolectricMVVM catchingFishRobolectricMVVM = this.CatchingFishMVPReduxContext;
                if (catchingFishRobolectricMVVM.CatchingFishCloudMessaging != colorStateList) {
                    catchingFishRobolectricMVVM.CatchingFishCloudMessaging = colorStateList;
                    catchingFishRobolectricMVVM.CatchingFishFragmentHandler(false);
                }
            }
            this.CatchingFishRetrofitMVI = colorStateList;
            if (this.CatchingFishViewModelFAB != null) {
                CatchingFishSpannableWidget(false, false);
            }
        }
    }

    public void setLengthCounter(CatchingFishCardViewDagger catchingFishCardViewDagger) {
        this.CatchingFishNavigation = catchingFishCardViewDagger;
    }

    public void setMaxEms(int i) {
        this.CatchingFishCloudMessaging = i;
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.CatchingFishOkHttp = i;
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.CatchingFishFragmentHandler = i;
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.CatchingFishEspressoTesting = i;
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishFragmentHandler.setContentDescription(i != 0 ? catchingFishFragmentCameraX.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishFragmentHandler.setImageDrawable(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        if (z && catchingFishFragmentCameraX.CatchingFishEspressoTesting != 1) {
            catchingFishFragmentCameraX.CatchingFishViewModelScope(1);
        } else if (z) {
            catchingFishFragmentCameraX.getClass();
        } else {
            catchingFishFragmentCameraX.CatchingFishViewModelScope(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishUnitTesting = colorStateList;
        CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishFragmentHandler, colorStateList, catchingFishFragmentCameraX.CatchingFishAnimationMockk);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.CatchingFishAnimationMockk = mode;
        CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishFragmentCameraX.CatchingFishReduxKtor, catchingFishFragmentCameraX.CatchingFishFragmentHandler, catchingFishFragmentCameraX.CatchingFishUnitTesting, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.CatchingFishParcelableFlux == null) {
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = new CatchingFishDataStoreBundle(getContext(), null);
            this.CatchingFishParcelableFlux = catchingFishDataStoreBundle;
            catchingFishDataStoreBundle.setId(com.catchingfish.fishcatcherpro.R.id.textinput_placeholder);
            this.CatchingFishParcelableFlux.setImportantForAccessibility(1);
            this.CatchingFishParcelableFlux.setAccessibilityLiveRegion(1);
            CatchingFishLiveDataHilt CatchingFishWorkManager = CatchingFishWorkManager();
            this.CatchingFishPayPal = CatchingFishWorkManager;
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = 67L;
            this.CatchingFishCardViewView = CatchingFishWorkManager();
            setPlaceholderTextAppearance(this.CatchingFishCardViewRealm);
            setPlaceholderTextColor(this.CatchingFishGsonAppCompat);
            CatchingFishFABCameraX.CatchingFishOkHttp(this.CatchingFishParcelableFlux, new CatchingFishBiometricFlux(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.CatchingFishSpannableWidget) {
                setPlaceholderTextEnabled(true);
            }
            this.CatchingFishDaggerHiltFAB = charSequence;
        }
        EditText editText = this.CatchingFishViewModelFAB;
        CatchingFishParcelableFlux(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.CatchingFishCardViewRealm = i;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishParcelableFlux;
        if (catchingFishDataStoreBundle != null) {
            catchingFishDataStoreBundle.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.CatchingFishGsonAppCompat != colorStateList) {
            this.CatchingFishGsonAppCompat = colorStateList;
            CatchingFishDataStoreBundle catchingFishDataStoreBundle = this.CatchingFishParcelableFlux;
            if (catchingFishDataStoreBundle == null || colorStateList == null) {
                return;
            }
            catchingFishDataStoreBundle.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        catchingFishViewMVIMVIToast.getClass();
        catchingFishViewMVIMVIToast.CatchingFishWorkManager = TextUtils.isEmpty(charSequence) ? null : charSequence;
        catchingFishViewMVIMVIToast.CatchingFishDaggerWebsocket.setText(charSequence);
        catchingFishViewMVIMVIToast.CatchingFishDaggerWebsocket();
    }

    public void setPrefixTextAppearance(int i) {
        this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishEspressoMockk;
        if (catchingFishContextGraphQL == null || catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB == catchingFishFragmentMVVM) {
            return;
        }
        this.CatchingFishMotionLayout = catchingFishFragmentMVVM;
        CatchingFishCoroutine();
    }

    public void setStartIconCheckable(boolean z) {
        this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        if (i < 0) {
            catchingFishViewMVIMVIToast.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != catchingFishViewMVIMVIToast.CatchingFishFragmentHandler) {
            catchingFishViewMVIMVIToast.CatchingFishFragmentHandler = i;
            CheckableImageButton checkableImageButton = catchingFishViewMVIMVIToast.CatchingFishViewModelScope;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        CheckableImageButton checkableImageButton = catchingFishViewMVIMVIToast.CatchingFishViewModelScope;
        View.OnLongClickListener onLongClickListener = catchingFishViewMVIMVIToast.CatchingFishEspressoTesting;
        checkableImageButton.setOnClickListener(onClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        catchingFishViewMVIMVIToast.CatchingFishEspressoTesting = onLongClickListener;
        CheckableImageButton checkableImageButton = catchingFishViewMVIMVIToast.CatchingFishViewModelScope;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        catchingFishViewMVIMVIToast.CatchingFishCloudMessaging = scaleType;
        catchingFishViewMVIMVIToast.CatchingFishViewModelScope.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        if (catchingFishViewMVIMVIToast.CatchingFishViewModelFAB != colorStateList) {
            catchingFishViewMVIMVIToast.CatchingFishViewModelFAB = colorStateList;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishViewMVIMVIToast.CatchingFishReduxKtor, catchingFishViewMVIMVIToast.CatchingFishViewModelScope, colorStateList, catchingFishViewMVIMVIToast.CatchingFishLayout);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = this.CatchingFishDaggerWebsocket;
        if (catchingFishViewMVIMVIToast.CatchingFishLayout != mode) {
            catchingFishViewMVIMVIToast.CatchingFishLayout = mode;
            CatchingFishRobolectricHilt.CatchingFishLayout(catchingFishViewMVIMVIToast.CatchingFishReduxKtor, catchingFishViewMVIMVIToast.CatchingFishViewModelScope, catchingFishViewMVIMVIToast.CatchingFishViewModelFAB, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        catchingFishFragmentCameraX.getClass();
        catchingFishFragmentCameraX.CatchingFish = TextUtils.isEmpty(charSequence) ? null : charSequence;
        catchingFishFragmentCameraX.CatchingFishJetpackCompose.setText(charSequence);
        catchingFishFragmentCameraX.CatchingFishUnitTesting();
    }

    public void setSuffixTextAppearance(int i) {
        this.CatchingFishWorkManager.CatchingFishJetpackCompose.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.CatchingFishWorkManager.CatchingFishJetpackCompose.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(CatchingFishParcelableMVVM catchingFishParcelableMVVM) {
        EditText editText = this.CatchingFishViewModelFAB;
        if (editText != null) {
            CatchingFishFABCameraX.CatchingFishOkHttp(editText, catchingFishParcelableMVVM);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.CatchingFishNavigationGson) {
            this.CatchingFishNavigationGson = typeface;
            this.CatchingFishMVPReduxContext.CatchingFishUnitTesting(typeface);
            CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishUnitTesting;
            if (typeface != catchingFishPicassoEspresso.CatchingFishCardViewView) {
                catchingFishPicassoEspresso.CatchingFishCardViewView = typeface;
                CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation;
                if (catchingFishDataStoreBundle != null) {
                    catchingFishDataStoreBundle.setTypeface(typeface);
                }
                CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = catchingFishPicassoEspresso.CatchingFishGsonAppCompat;
                if (catchingFishDataStoreBundle2 != null) {
                    catchingFishDataStoreBundle2.setTypeface(typeface);
                }
            }
            CatchingFishDataStoreBundle catchingFishDataStoreBundle3 = this.CatchingFish;
            if (catchingFishDataStoreBundle3 != null) {
                catchingFishDataStoreBundle3.setTypeface(typeface);
            }
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.CatchingFishDaggerWebsocket.CatchingFishSnackbar(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.CatchingFishWorkManager.CatchingFishFragmentHandler.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.CatchingFishWorkManager.CatchingFishFragmentHandler.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.CatchingFishWorkManager.CatchingFishLayout(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.CatchingFishWorkManager.CatchingFishFragmentHandler;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishWorkManager;
        TextInputLayout textInputLayout = catchingFishFragmentCameraX.CatchingFishReduxKtor;
        CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            CatchingFishRobolectricHilt.CatchingFishLayout(textInputLayout, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting, catchingFishFragmentCameraX.CatchingFishAnimationMockk);
            CatchingFishRobolectricHilt.CatchingFishGradleManifest(textInputLayout, checkableImageButton, catchingFishFragmentCameraX.CatchingFishUnitTesting);
        }
    }
}
