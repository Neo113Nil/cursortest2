package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.text.CatchingFishBundleXMLLayout;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFragmentMVVM;
import kotlin.text.CatchingFishGlideKtor;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishKtorViewModel;
import kotlin.text.CatchingFishLayoutEspresso;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishLifecyclePayPal;
import kotlin.text.CatchingFishMVIToast;
import kotlin.text.CatchingFishOkHttpDagger;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishOkHttpMVI;
import kotlin.text.CatchingFishPicassoHilt;
import kotlin.text.CatchingFishPicassoOkHttp;
import kotlin.text.CatchingFishRealmToolbar;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishStripeAPIRealm;
import kotlin.text.CatchingFishToastMVP;
import kotlin.text.CatchingFishViewDatabinding;
import kotlin.text.CatchingFishViewGraphQL;
import kotlin.text.CatchingFishViewModelJUnit;

/* loaded from: classes.dex */
public class Chip extends CatchingFishViewDatabinding implements CatchingFishBundleXMLLayout, CatchingFishOkHttpDagger, Checkable {
    public int CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public View.OnClickListener CatchingFishCloudMessaging;
    public final CatchingFishGlideKtor CatchingFishCoroutineFlow;
    public boolean CatchingFishDaggerHiltFAB;
    public CompoundButton.OnCheckedChangeListener CatchingFishEspressoTesting;
    public RippleDrawable CatchingFishFragmentHandler;
    public final CatchingFishPicassoHilt CatchingFishGsonAppCompat;
    public CharSequence CatchingFishJetpackCompose;
    public InsetDrawable CatchingFishLayout;
    public int CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public final RectF CatchingFishParcelableFlux;
    public boolean CatchingFishRoomDatabase;
    public final Rect CatchingFishSpannableWidget;
    public boolean CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public CatchingFishLayoutEspresso CatchingFishViewModelFAB;
    public static final Rect CatchingFishCardViewRealm = new Rect();
    public static final int[] CatchingFishPayPal = {R.attr.state_selected};
    public static final int[] CatchingFishCardViewView = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.catchingfish.fishcatcherpro.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.CatchingFishSpannableWidget = new Rect();
        this.CatchingFishParcelableFlux = new RectF();
        this.CatchingFishGsonAppCompat = new CatchingFishPicassoHilt(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = new CatchingFishLayoutEspresso(context2, attributeSet);
        Context context3 = catchingFishLayoutEspresso.CatchingFishFABLayout;
        int[] iArr = CatchingFishSnackbarPicasso.CatchingFishCoroutine;
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context3, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        catchingFishLayoutEspresso.CatchingFishWebsocket = CatchingFishCameraXIntent.hasValue(37);
        Context context4 = catchingFishLayoutEspresso.CatchingFishFABLayout;
        ColorStateList CatchingFishNavigation = CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 24);
        if (catchingFishLayoutEspresso.CatchingFishEspressoMockk != CatchingFishNavigation) {
            catchingFishLayoutEspresso.CatchingFishEspressoMockk = CatchingFishNavigation;
            catchingFishLayoutEspresso.onStateChange(catchingFishLayoutEspresso.getState());
        }
        ColorStateList CatchingFishNavigation2 = CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 11);
        if (catchingFishLayoutEspresso.CatchingFishDagger != CatchingFishNavigation2) {
            catchingFishLayoutEspresso.CatchingFishDagger = CatchingFishNavigation2;
            catchingFishLayoutEspresso.onStateChange(catchingFishLayoutEspresso.getState());
        }
        float dimension = CatchingFishCameraXIntent.getDimension(19, 0.0f);
        if (catchingFishLayoutEspresso.CatchingFishCameraXIntent != dimension) {
            catchingFishLayoutEspresso.CatchingFishCameraXIntent = dimension;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        if (CatchingFishCameraXIntent.hasValue(12)) {
            catchingFishLayoutEspresso.CatchingFishJobScheduler(CatchingFishCameraXIntent.getDimension(12, 0.0f));
        }
        catchingFishLayoutEspresso.CatchingFishCameraXIntent(CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 22));
        catchingFishLayoutEspresso.CatchingFishHandler(CatchingFishCameraXIntent.getDimension(23, 0.0f));
        catchingFishLayoutEspresso.CatchingFishJUnitRealm(CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 36));
        String text = CatchingFishCameraXIntent.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(catchingFishLayoutEspresso.CatchingFishLayoutInflater, text)) {
            catchingFishLayoutEspresso.CatchingFishLayoutInflater = text;
            catchingFishLayoutEspresso.CatchingFishMVPReduxContext.CatchingFishReduxKtor = true;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = (!CatchingFishCameraXIntent.hasValue(0) || (resourceId3 = CatchingFishCameraXIntent.getResourceId(0, 0)) == 0) ? null : new CatchingFishPicassoOkHttp(context4, resourceId3);
        catchingFishPicassoOkHttp.CatchingFishEspressoTesting = CatchingFishCameraXIntent.getDimension(1, catchingFishPicassoOkHttp.CatchingFishEspressoTesting);
        catchingFishLayoutEspresso.CatchingFishAnimation(catchingFishPicassoOkHttp);
        int i = CatchingFishCameraXIntent.getInt(3, 0);
        if (i == 1) {
            catchingFishLayoutEspresso.CatchingFishLifecycleHilt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            catchingFishLayoutEspresso.CatchingFishLifecycleHilt = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            catchingFishLayoutEspresso.CatchingFishLifecycleHilt = TextUtils.TruncateAt.END;
        }
        catchingFishLayoutEspresso.CatchingFishDagger(CatchingFishCameraXIntent.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            catchingFishLayoutEspresso.CatchingFishDagger(CatchingFishCameraXIntent.getBoolean(15, false));
        }
        catchingFishLayoutEspresso.CatchingFishPayPalService(CatchingFishDaggerBiometric.CatchingFishJetpackCompose(context4, CatchingFishCameraXIntent, 14));
        if (CatchingFishCameraXIntent.hasValue(17)) {
            catchingFishLayoutEspresso.CatchingFishEspressoMockk(CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 17));
        }
        catchingFishLayoutEspresso.CatchingFishSensorManager(CatchingFishCameraXIntent.getDimension(16, -1.0f));
        catchingFishLayoutEspresso.CatchingFishAppCompat(CatchingFishCameraXIntent.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            catchingFishLayoutEspresso.CatchingFishAppCompat(CatchingFishCameraXIntent.getBoolean(26, false));
        }
        catchingFishLayoutEspresso.CatchingFishPayPalLiveData(CatchingFishDaggerBiometric.CatchingFishJetpackCompose(context4, CatchingFishCameraXIntent, 25));
        catchingFishLayoutEspresso.CatchingFishRecyclerView(CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 30));
        catchingFishLayoutEspresso.CatchingFishMotionLayout(CatchingFishCameraXIntent.getDimension(28, 0.0f));
        catchingFishLayoutEspresso.CatchingFishMVPRobolectric(CatchingFishCameraXIntent.getBoolean(6, false));
        catchingFishLayoutEspresso.CatchingFishMutableLiveData(CatchingFishCameraXIntent.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            catchingFishLayoutEspresso.CatchingFishMutableLiveData(CatchingFishCameraXIntent.getBoolean(8, false));
        }
        catchingFishLayoutEspresso.CatchingFishCustomView(CatchingFishDaggerBiometric.CatchingFishJetpackCompose(context4, CatchingFishCameraXIntent, 7));
        if (CatchingFishCameraXIntent.hasValue(9)) {
            catchingFishLayoutEspresso.CatchingFishFragmentFactory(CatchingFishDaggerBiometric.CatchingFishNavigation(context4, CatchingFishCameraXIntent, 9));
        }
        catchingFishLayoutEspresso.CatchingFishMockkOkHttp = (!CatchingFishCameraXIntent.hasValue(39) || (resourceId2 = CatchingFishCameraXIntent.getResourceId(39, 0)) == 0) ? null : CatchingFishRealmToolbar.CatchingFishParcelableFAB(context4, resourceId2);
        catchingFishLayoutEspresso.CatchingFishReduxMoshi = (!CatchingFishCameraXIntent.hasValue(33) || (resourceId = CatchingFishCameraXIntent.getResourceId(33, 0)) == 0) ? null : CatchingFishRealmToolbar.CatchingFishParcelableFAB(context4, resourceId);
        float dimension2 = CatchingFishCameraXIntent.getDimension(21, 0.0f);
        if (catchingFishLayoutEspresso.CatchingFishPicasso != dimension2) {
            catchingFishLayoutEspresso.CatchingFishPicasso = dimension2;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        catchingFishLayoutEspresso.CatchingFishStateFlow(CatchingFishCameraXIntent.getDimension(35, 0.0f));
        catchingFishLayoutEspresso.CatchingFishDataStoreIntent(CatchingFishCameraXIntent.getDimension(34, 0.0f));
        float dimension3 = CatchingFishCameraXIntent.getDimension(41, 0.0f);
        if (catchingFishLayoutEspresso.CatchingFishGradleLiveData != dimension3) {
            catchingFishLayoutEspresso.CatchingFishGradleLiveData = dimension3;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        float dimension4 = CatchingFishCameraXIntent.getDimension(40, 0.0f);
        if (catchingFishLayoutEspresso.CatchingFishRetrofit != dimension4) {
            catchingFishLayoutEspresso.CatchingFishRetrofit = dimension4;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        catchingFishLayoutEspresso.CatchingFishLayoutInflater(CatchingFishCameraXIntent.getDimension(29, 0.0f));
        catchingFishLayoutEspresso.CatchingFishGradleManifest(CatchingFishCameraXIntent.getDimension(27, 0.0f));
        float dimension5 = CatchingFishCameraXIntent.getDimension(13, 0.0f);
        if (catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor != dimension5) {
            catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor = dimension5;
            catchingFishLayoutEspresso.invalidateSelf();
            catchingFishLayoutEspresso.CatchingFishPayPal();
        }
        catchingFishLayoutEspresso.CatchingFishHiltBundle = CatchingFishCameraXIntent.getDimensionPixelSize(4, Integer.MAX_VALUE);
        CatchingFishCameraXIntent.recycle();
        CatchingFishLayoutRoomFAB.CatchingFishOkHttp(context2, attributeSet, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action);
        CatchingFishLayoutRoomFAB.CatchingFishAnimationMockk(context2, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action);
        this.CatchingFishRoomDatabase = obtainStyledAttributes.getBoolean(32, false);
        TypedValue CatchingFishGradleManifest = CatchingFishOkHttpFAB.CatchingFishGradleManifest(context2, com.catchingfish.fishcatcherpro.R.attr.minTouchTargetSize);
        this.CatchingFish = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) ((CatchingFishGradleManifest == null || CatchingFishGradleManifest.type != 5) ? context2.getResources().getDimension(com.catchingfish.fishcatcherpro.R.dimen.mtrl_min_touch_target_size) : CatchingFishGradleManifest.getDimension(context2.getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(catchingFishLayoutEspresso);
        catchingFishLayoutEspresso.CatchingFishOkHttp(getElevation());
        CatchingFishLayoutRoomFAB.CatchingFishOkHttp(context2, attributeSet, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action);
        CatchingFishLayoutRoomFAB.CatchingFishAnimationMockk(context2, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.CatchingFishCoroutineFlow = new CatchingFishGlideKtor(this, this);
        CatchingFishReduxKtor();
        if (!hasValue) {
            setOutlineProvider(new CatchingFishViewModelJUnit(this));
        }
        setChecked(this.CatchingFishOkHttp);
        setText(catchingFishLayoutEspresso.CatchingFishLayoutInflater);
        setEllipsize(catchingFishLayoutEspresso.CatchingFishLifecycleHilt);
        CatchingFishViewModelScope();
        if (!this.CatchingFishViewModelFAB.CatchingFishStripeAPIWidget) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        CatchingFishWorkManager();
        if (this.CatchingFishRoomDatabase) {
            setMinHeight(this.CatchingFish);
        }
        this.CatchingFishNavigation = getLayoutDirection();
        super.setOnCheckedChangeListener(new CatchingFishViewGraphQL(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.CatchingFishParcelableFlux;
        rectF.setEmpty();
        if (CatchingFishCoroutine() && this.CatchingFishCloudMessaging != null) {
            CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
            Rect bounds = catchingFishLayoutEspresso.getBounds();
            rectF.setEmpty();
            if (catchingFishLayoutEspresso.CatchingFishMoshiDaggerHilt()) {
                float f = catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor + catchingFishLayoutEspresso.CatchingFishServiceMVIJUnit + catchingFishLayoutEspresso.CatchingFishMoshiDaggerHilt + catchingFishLayoutEspresso.CatchingFishView + catchingFishLayoutEspresso.CatchingFishRetrofit;
                if (catchingFishLayoutEspresso.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.CatchingFishSpannableWidget;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private CatchingFishPicassoOkHttp getTextAppearance() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishMVPReduxContext.CatchingFishWorkManager;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.CatchingFishAnimationMockk != z) {
            this.CatchingFishAnimationMockk = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.CatchingFishUnitTesting != z) {
            this.CatchingFishUnitTesting = z;
            refreshDrawableState();
        }
    }

    public final boolean CatchingFishCoroutine() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null) {
            return false;
        }
        Drawable drawable = catchingFishLayoutEspresso.CatchingFishAnimation;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void CatchingFishDaggerWebsocket() {
        this.CatchingFishFragmentHandler = new RippleDrawable(CatchingFishGsonCardView.CatchingFishPayPalService(this.CatchingFishViewModelFAB.CatchingFishMotionLayout), getBackgroundDrawable(), null);
        this.CatchingFishViewModelFAB.getClass();
        setBackground(this.CatchingFishFragmentHandler);
        CatchingFishWorkManager();
    }

    public final void CatchingFishReduxKtor() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso;
        if (!CatchingFishCoroutine() || (catchingFishLayoutEspresso = this.CatchingFishViewModelFAB) == null || !catchingFishLayoutEspresso.CatchingFishJUnitRealm || this.CatchingFishCloudMessaging == null) {
            CatchingFishFABCameraX.CatchingFishOkHttp(this, null);
            this.CatchingFishDaggerHiltFAB = false;
        } else {
            CatchingFishFABCameraX.CatchingFishOkHttp(this, this.CatchingFishCoroutineFlow);
            this.CatchingFishDaggerHiltFAB = true;
        }
    }

    public final void CatchingFishSnackbar(int i) {
        this.CatchingFish = i;
        if (!this.CatchingFishRoomDatabase) {
            InsetDrawable insetDrawable = this.CatchingFishLayout;
            if (insetDrawable == null) {
                CatchingFishDaggerWebsocket();
                return;
            } else {
                if (insetDrawable != null) {
                    this.CatchingFishLayout = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    CatchingFishDaggerWebsocket();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.CatchingFishViewModelFAB.CatchingFishCameraXIntent));
        int max2 = Math.max(0, i - this.CatchingFishViewModelFAB.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.CatchingFishLayout;
            if (insetDrawable2 == null) {
                CatchingFishDaggerWebsocket();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.CatchingFishLayout = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    CatchingFishDaggerWebsocket();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.CatchingFishLayout != null) {
            Rect rect = new Rect();
            this.CatchingFishLayout.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                CatchingFishDaggerWebsocket();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.CatchingFishLayout = new InsetDrawable((Drawable) this.CatchingFishViewModelFAB, i2, i3, i2, i3);
        CatchingFishDaggerWebsocket();
    }

    public final void CatchingFishViewModelScope() {
        TextPaint paint = getPaint();
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            paint.drawableState = catchingFishLayoutEspresso.getState();
        }
        CatchingFishPicassoOkHttp textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.CatchingFishReduxKtor(getContext(), paint, this.CatchingFishGsonAppCompat);
        }
    }

    public final void CatchingFishWorkManager() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso;
        if (TextUtils.isEmpty(getText()) || (catchingFishLayoutEspresso = this.CatchingFishViewModelFAB) == null) {
            return;
        }
        int CatchingFishSpannableWidget = (int) (catchingFishLayoutEspresso.CatchingFishSpannableWidget() + catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor + catchingFishLayoutEspresso.CatchingFishRetrofit);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso2 = this.CatchingFishViewModelFAB;
        int CatchingFishDaggerHiltFAB = (int) (catchingFishLayoutEspresso2.CatchingFishDaggerHiltFAB() + catchingFishLayoutEspresso2.CatchingFishPicasso + catchingFishLayoutEspresso2.CatchingFishGradleLiveData);
        if (this.CatchingFishLayout != null) {
            Rect rect = new Rect();
            this.CatchingFishLayout.getPadding(rect);
            CatchingFishDaggerHiltFAB += rect.left;
            CatchingFishSpannableWidget += rect.right;
        }
        setPaddingRelative(CatchingFishDaggerHiltFAB, getPaddingTop(), CatchingFishSpannableWidget, getPaddingBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.CatchingFishDaggerHiltFAB) {
            return super.dispatchHoverEvent(motionEvent);
        }
        CatchingFishGlideKtor catchingFishGlideKtor = this.CatchingFishCoroutineFlow;
        AccessibilityManager accessibilityManager = catchingFishGlideKtor.CatchingFishViewModelFAB;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = catchingFishGlideKtor.CatchingFishUnitTesting;
                int i2 = (chip.CatchingFishCoroutine() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = catchingFishGlideKtor.CatchingFishOkHttp;
                if (i3 != i2) {
                    catchingFishGlideKtor.CatchingFishOkHttp = i2;
                    catchingFishGlideKtor.CatchingFishNavigation(i2, 128);
                    catchingFishGlideKtor.CatchingFishNavigation(i3, 256);
                }
            } else if (action == 10 && (i = catchingFishGlideKtor.CatchingFishOkHttp) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    catchingFishGlideKtor.CatchingFishOkHttp = Integer.MIN_VALUE;
                    catchingFishGlideKtor.CatchingFishNavigation(Integer.MIN_VALUE, 128);
                    catchingFishGlideKtor.CatchingFishNavigation(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.CatchingFishDaggerHiltFAB) {
            return super.dispatchKeyEvent(keyEvent);
        }
        CatchingFishGlideKtor catchingFishGlideKtor = this.CatchingFishCoroutineFlow;
        catchingFishGlideKtor.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && catchingFishGlideKtor.CatchingFishOkHttp(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = catchingFishGlideKtor.CatchingFishEspressoTesting;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = catchingFishGlideKtor.CatchingFishUnitTesting;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.CatchingFishCloudMessaging;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.CatchingFishDaggerHiltFAB) {
                                chip.CatchingFishCoroutineFlow.CatchingFishNavigation(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = catchingFishGlideKtor.CatchingFishOkHttp(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = catchingFishGlideKtor.CatchingFishOkHttp(1, null);
            }
        }
        if (!z || catchingFishGlideKtor.CatchingFishEspressoTesting == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // kotlin.text.CatchingFishViewDatabinding, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        boolean z = false;
        int i = 0;
        z = false;
        if (catchingFishLayoutEspresso != null && CatchingFishLayoutEspresso.CatchingFishCardViewRealm(catchingFishLayoutEspresso.CatchingFishAnimation)) {
            CatchingFishLayoutEspresso catchingFishLayoutEspresso2 = this.CatchingFishViewModelFAB;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.CatchingFishStateLiveData) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.CatchingFishAnimationMockk) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.CatchingFishUnitTesting) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.CatchingFishStateLiveData) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.CatchingFishAnimationMockk) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.CatchingFishUnitTesting) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = catchingFishLayoutEspresso2.CatchingFishParcelable(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.CatchingFishJetpackCompose)) {
            return this.CatchingFishJetpackCompose;
        }
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || !catchingFishLayoutEspresso.CatchingFishNavigationGson) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.CatchingFishLayout;
        return insetDrawable == null ? this.CatchingFishViewModelFAB : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishCustomViewJUnit;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishDaggerMVVM;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishDagger;
        }
        return null;
    }

    public float getChipCornerRadius() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return Math.max(0.0f, catchingFishLayoutEspresso.CatchingFishParcelableFlux());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.CatchingFishViewModelFAB;
    }

    public float getChipEndPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || (drawable = catchingFishLayoutEspresso.CatchingFishRecyclerView) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishDataStoreIntent;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishAppCompat;
        }
        return null;
    }

    public float getChipMinHeight() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishCameraXIntent;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishPicasso;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishPayPalLiveData;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishGradleManifest;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || (drawable = catchingFishLayoutEspresso.CatchingFishAnimation) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishAndroidX;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishServiceMVIJUnit;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishMoshiDaggerHilt;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishView;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishStripeAPI;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishLifecycleHilt;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.CatchingFishDaggerHiltFAB) {
            CatchingFishGlideKtor catchingFishGlideKtor = this.CatchingFishCoroutineFlow;
            if (catchingFishGlideKtor.CatchingFishEspressoTesting == 1 || catchingFishGlideKtor.CatchingFishCloudMessaging == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public CatchingFishRealmToolbar getHideMotionSpec() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishReduxMoshi;
        }
        return null;
    }

    public float getIconEndPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishRetrofitMVI;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishFirebase;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishMotionLayout;
        }
        return null;
    }

    public CatchingFishFragmentMVVM getShapeAppearanceModel() {
        return this.CatchingFishViewModelFAB.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB;
    }

    public CatchingFishRealmToolbar getShowMotionSpec() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishMockkOkHttp;
        }
        return null;
    }

    public float getTextEndPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishRetrofit;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            return catchingFishLayoutEspresso.CatchingFishGradleLiveData;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CatchingFishKtorViewModel.CatchingFishCardViewRealm(this, this.CatchingFishViewModelFAB);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishPayPal);
        }
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null && catchingFishLayoutEspresso.CatchingFishNavigationGson) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishCardViewView);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.CatchingFishDaggerHiltFAB) {
            CatchingFishGlideKtor catchingFishGlideKtor = this.CatchingFishCoroutineFlow;
            int i2 = catchingFishGlideKtor.CatchingFishEspressoTesting;
            if (i2 != Integer.MIN_VALUE) {
                catchingFishGlideKtor.CatchingFishFragmentHandler(i2);
            }
            if (z) {
                catchingFishGlideKtor.CatchingFishOkHttp(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        accessibilityNodeInfo.setCheckable(catchingFishLayoutEspresso != null && catchingFishLayoutEspresso.CatchingFishNavigationGson);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.CatchingFishNavigation != i) {
            this.CatchingFishNavigation = i;
            CatchingFishWorkManager();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.CatchingFishUnitTesting) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.CatchingFishUnitTesting) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.CatchingFishCloudMessaging;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.CatchingFishDaggerHiltFAB) {
                    this.CatchingFishCoroutineFlow.CatchingFishNavigation(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.CatchingFishJetpackCompose = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.CatchingFishFragmentHandler) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.CatchingFishFragmentHandler) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMVPRobolectric(z);
        }
    }

    public void setCheckableResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMVPRobolectric(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null) {
            this.CatchingFishOkHttp = z;
        } else if (catchingFishLayoutEspresso.CatchingFishNavigationGson) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishCustomView(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishCustomView(CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishFragmentFactory(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishFragmentFactory(CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMutableLiveData(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishDagger == colorStateList) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishDagger = colorStateList;
        catchingFishLayoutEspresso.onStateChange(catchingFishLayoutEspresso.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList CatchingFishSpannableWidget;
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishDagger == (CatchingFishSpannableWidget = CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i))) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishDagger = CatchingFishSpannableWidget;
        catchingFishLayoutEspresso.onStateChange(catchingFishLayoutEspresso.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishJobScheduler(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishJobScheduler(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(CatchingFishLayoutEspresso catchingFishLayoutEspresso) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso2 = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso2 != catchingFishLayoutEspresso) {
            if (catchingFishLayoutEspresso2 != null) {
                catchingFishLayoutEspresso2.CatchingFishCardView = new WeakReference(null);
            }
            this.CatchingFishViewModelFAB = catchingFishLayoutEspresso;
            catchingFishLayoutEspresso.CatchingFishStripeAPIWidget = false;
            catchingFishLayoutEspresso.CatchingFishCardView = new WeakReference(this);
            CatchingFishSnackbar(this.CatchingFish);
        }
    }

    public void setChipEndPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor == f) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor = f;
        catchingFishLayoutEspresso.invalidateSelf();
        catchingFishLayoutEspresso.CatchingFishPayPal();
    }

    public void setChipEndPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float dimension = catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i);
            if (catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor != dimension) {
                catchingFishLayoutEspresso.CatchingFishGlideWidgetKtor = dimension;
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.CatchingFishPayPal();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishPayPalService(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishPayPalService(CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setChipIconSize(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishSensorManager(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishSensorManager(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishEspressoMockk(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishEspressoMockk(CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setChipIconVisible(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishDagger(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishCameraXIntent == f) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishCameraXIntent = f;
        catchingFishLayoutEspresso.invalidateSelf();
        catchingFishLayoutEspresso.CatchingFishPayPal();
    }

    public void setChipMinHeightResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float dimension = catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i);
            if (catchingFishLayoutEspresso.CatchingFishCameraXIntent != dimension) {
                catchingFishLayoutEspresso.CatchingFishCameraXIntent = dimension;
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.CatchingFishPayPal();
            }
        }
    }

    public void setChipStartPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishPicasso == f) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishPicasso = f;
        catchingFishLayoutEspresso.invalidateSelf();
        catchingFishLayoutEspresso.CatchingFishPayPal();
    }

    public void setChipStartPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float dimension = catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i);
            if (catchingFishLayoutEspresso.CatchingFishPicasso != dimension) {
                catchingFishLayoutEspresso.CatchingFishPicasso = dimension;
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.CatchingFishPayPal();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishCameraXIntent(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishCameraXIntent(CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishHandler(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishHandler(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishPayPalLiveData(drawable);
        }
        CatchingFishReduxKtor();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishAndroidX == charSequence) {
            return;
        }
        String str = CatchingFishMVIToast.CatchingFishSnackbar;
        CatchingFishMVIToast catchingFishMVIToast = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? CatchingFishMVIToast.CatchingFishDaggerWebsocket : CatchingFishMVIToast.CatchingFishReduxKtor;
        catchingFishMVIToast.getClass();
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishParcelableFAB;
        catchingFishLayoutEspresso.CatchingFishAndroidX = catchingFishMVIToast.CatchingFishCoroutine(charSequence);
        catchingFishLayoutEspresso.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishGradleManifest(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishGradleManifest(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishPayPalLiveData(CatchingFishLayoutRoomFAB.CatchingFishCustomView(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
        CatchingFishReduxKtor();
    }

    public void setCloseIconSize(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMotionLayout(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMotionLayout(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishLayoutInflater(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishLayoutInflater(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishRecyclerView(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishRecyclerView(CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishOkHttp(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.CatchingFishViewModelFAB == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishLifecycleHilt = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.CatchingFishRoomDatabase = z;
        CatchingFishSnackbar(this.CatchingFish);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(CatchingFishRealmToolbar catchingFishRealmToolbar) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishReduxMoshi = catchingFishRealmToolbar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishReduxMoshi = CatchingFishRealmToolbar.CatchingFishParcelableFAB(catchingFishLayoutEspresso.CatchingFishFABLayout, i);
        }
    }

    public void setIconEndPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishDataStoreIntent(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishDataStoreIntent(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishStateFlow(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishStateFlow(catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.CatchingFishViewModelFAB == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishHiltBundle = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.CatchingFishEspressoTesting = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.CatchingFishCloudMessaging = onClickListener;
        CatchingFishReduxKtor();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishJUnitRealm(colorStateList);
        }
        this.CatchingFishViewModelFAB.getClass();
        CatchingFishDaggerWebsocket();
    }

    public void setRippleColorResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishJUnitRealm(CatchingFishGsonCardView.CatchingFishSpannableWidget(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
            this.CatchingFishViewModelFAB.getClass();
            CatchingFishDaggerWebsocket();
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpDagger
    public void setShapeAppearanceModel(CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        this.CatchingFishViewModelFAB.setShapeAppearanceModel(catchingFishFragmentMVVM);
    }

    public void setShowMotionSpec(CatchingFishRealmToolbar catchingFishRealmToolbar) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMockkOkHttp = catchingFishRealmToolbar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMockkOkHttp = CatchingFishRealmToolbar.CatchingFishParcelableFAB(catchingFishLayoutEspresso.CatchingFishFABLayout, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(catchingFishLayoutEspresso.CatchingFishStripeAPIWidget ? null : charSequence, bufferType);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso2 = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso2 == null || TextUtils.equals(catchingFishLayoutEspresso2.CatchingFishLayoutInflater, charSequence)) {
            return;
        }
        catchingFishLayoutEspresso2.CatchingFishLayoutInflater = charSequence;
        catchingFishLayoutEspresso2.CatchingFishMVPReduxContext.CatchingFishReduxKtor = true;
        catchingFishLayoutEspresso2.invalidateSelf();
        catchingFishLayoutEspresso2.CatchingFishPayPal();
    }

    public void setTextAppearance(CatchingFishPicassoOkHttp catchingFishPicassoOkHttp) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishAnimation(catchingFishPicassoOkHttp);
        }
        CatchingFishViewModelScope();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishRetrofit == f) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishRetrofit = f;
        catchingFishLayoutEspresso.invalidateSelf();
        catchingFishLayoutEspresso.CatchingFishPayPal();
    }

    public void setTextEndPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float dimension = catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i);
            if (catchingFishLayoutEspresso.CatchingFishRetrofit != dimension) {
                catchingFishLayoutEspresso.CatchingFishRetrofit = dimension;
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.CatchingFishPayPal();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            CatchingFishToastMVP catchingFishToastMVP = catchingFishLayoutEspresso.CatchingFishMVPReduxContext;
            CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = catchingFishToastMVP.CatchingFishWorkManager;
            if (catchingFishPicassoOkHttp != null) {
                catchingFishPicassoOkHttp.CatchingFishEspressoTesting = applyDimension;
                catchingFishToastMVP.CatchingFishParcelableFAB.setTextSize(applyDimension);
                catchingFishLayoutEspresso.CatchingFishPayPal();
                catchingFishLayoutEspresso.invalidateSelf();
            }
        }
        CatchingFishViewModelScope();
    }

    public void setTextStartPadding(float f) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso == null || catchingFishLayoutEspresso.CatchingFishGradleLiveData == f) {
            return;
        }
        catchingFishLayoutEspresso.CatchingFishGradleLiveData = f;
        catchingFishLayoutEspresso.invalidateSelf();
        catchingFishLayoutEspresso.CatchingFishPayPal();
    }

    public void setTextStartPaddingResource(int i) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            float dimension = catchingFishLayoutEspresso.CatchingFishFABLayout.getResources().getDimension(i);
            if (catchingFishLayoutEspresso.CatchingFishGradleLiveData != dimension) {
                catchingFishLayoutEspresso.CatchingFishGradleLiveData = dimension;
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.CatchingFishPayPal();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishAppCompat(z);
        }
        CatchingFishReduxKtor();
    }

    public void setCheckedIconVisible(boolean z) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishMutableLiveData(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishDagger(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishAnimation(new CatchingFishPicassoOkHttp(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
        CatchingFishViewModelScope();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.CatchingFishAnimation(new CatchingFishPicassoOkHttp(catchingFishLayoutEspresso.CatchingFishFABLayout, i));
        }
        CatchingFishViewModelScope();
    }

    public void setInternalOnCheckedChangeListener(CatchingFishOkHttpMVI catchingFishOkHttpMVI) {
    }
}
