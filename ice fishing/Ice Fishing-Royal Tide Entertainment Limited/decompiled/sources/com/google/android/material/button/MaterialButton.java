package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishContextLiveData;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishEspressoTesting;
import kotlin.text.CatchingFishFragmentMVVM;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishHandlerMVI;
import kotlin.text.CatchingFishHiltHandler;
import kotlin.text.CatchingFishKtorMVI;
import kotlin.text.CatchingFishKtorToast;
import kotlin.text.CatchingFishKtorViewModel;
import kotlin.text.CatchingFishLayoutCoroutine;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVIIntentGradle;
import kotlin.text.CatchingFishMVPLayout;
import kotlin.text.CatchingFishMVVMViewMoshi;
import kotlin.text.CatchingFishOkHttpDagger;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishRealmAdMob;
import kotlin.text.CatchingFishRealmHiltHilt;
import kotlin.text.CatchingFishRealmSharedFlow;
import kotlin.text.CatchingFishRobolectricKtor;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewModelFAB;
import kotlin.text.CatchingFishViewPagerMockk;

/* loaded from: classes.dex */
public class MaterialButton extends CatchingFishHiltHandler implements Checkable, CatchingFishOkHttpDagger {
    public boolean CatchingFish;
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishCardViewRealm;
    public boolean CatchingFishCardViewView;
    public ColorStateList CatchingFishCloudMessaging;
    public int CatchingFishCoroutineFlow;
    public CatchingFishRealmAdMob CatchingFishCustomView;
    public float CatchingFishDaggerHiltFAB;
    public Drawable CatchingFishEspressoTesting;
    public int CatchingFishFragmentFactory;
    public PorterDuff.Mode CatchingFishFragmentHandler;
    public LinearLayout.LayoutParams CatchingFishGsonAppCompat;
    public int CatchingFishJetpackCompose;
    public float CatchingFishJobScheduler;
    public CatchingFishMVIIntentGradle CatchingFishLayout;
    public int CatchingFishMVPRobolectric;
    public float CatchingFishMutableLiveData;
    public boolean CatchingFishNavigation;
    public String CatchingFishOkHttp;
    public int CatchingFishParcelableFlux;
    public int CatchingFishPayPal;
    public CatchingFishRealmHiltHilt CatchingFishPayPalService;
    public int CatchingFishRoomDatabase;
    public int CatchingFishSpannableWidget;
    public int CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public final LinkedHashSet CatchingFishViewModelFAB;
    public final CatchingFishRobolectricKtor CatchingFishViewModelScope;
    public static final int[] CatchingFishSensorManager = {R.attr.state_checkable};
    public static final int[] CatchingFishEspressoMockk = {R.attr.state_checked};
    public static final CatchingFishViewModelFAB CatchingFishDagger = new CatchingFishViewModelFAB();

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishPayPalLiveData(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.materialButtonStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Button, new int[]{com.catchingfish.fishcatcherpro.R.attr.materialSizeOverlay}), attributeSet, com.catchingfish.fishcatcherpro.R.attr.materialButtonStyle);
        this.CatchingFishViewModelFAB = new LinkedHashSet();
        this.CatchingFishNavigation = false;
        this.CatchingFish = false;
        this.CatchingFishCoroutineFlow = -1;
        this.CatchingFishDaggerHiltFAB = -1.0f;
        this.CatchingFishSpannableWidget = -1;
        this.CatchingFishParcelableFlux = -1;
        this.CatchingFishMVPRobolectric = -1;
        Context context2 = getContext();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishFragmentHandler, com.catchingfish.fishcatcherpro.R.attr.materialButtonStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.CatchingFishRoomDatabase = CatchingFishCameraXIntent.getDimensionPixelSize(13, 0);
        int i = CatchingFishCameraXIntent.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.CatchingFishFragmentHandler = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(i, mode);
        this.CatchingFishCloudMessaging = CatchingFishDaggerBiometric.CatchingFishNavigation(getContext(), CatchingFishCameraXIntent, 15);
        this.CatchingFishEspressoTesting = CatchingFishDaggerBiometric.CatchingFishJetpackCompose(getContext(), CatchingFishCameraXIntent, 11);
        this.CatchingFishJetpackCompose = CatchingFishCameraXIntent.getInteger(12, 1);
        this.CatchingFishUnitTesting = CatchingFishCameraXIntent.getDimensionPixelSize(14, 0);
        CatchingFishMVVMViewMoshi CatchingFishSnackbar = CatchingFishMVVMViewMoshi.CatchingFishSnackbar(context2, CatchingFishCameraXIntent, 19);
        CatchingFishFragmentMVVM CatchingFishCoroutine = CatchingFishSnackbar != null ? CatchingFishSnackbar.CatchingFishCoroutine() : CatchingFishFragmentMVVM.CatchingFishSnackbar(context2, attributeSet, com.catchingfish.fishcatcherpro.R.attr.materialButtonStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Button).CatchingFishParcelableFAB();
        boolean z = CatchingFishCameraXIntent.getBoolean(17, false);
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = new CatchingFishRobolectricKtor(this, CatchingFishCoroutine);
        this.CatchingFishViewModelScope = catchingFishRobolectricKtor;
        catchingFishRobolectricKtor.CatchingFishWorkManager = CatchingFishCameraXIntent.getDimensionPixelOffset(2, 0);
        catchingFishRobolectricKtor.CatchingFishViewModelScope = CatchingFishCameraXIntent.getDimensionPixelOffset(3, 0);
        catchingFishRobolectricKtor.CatchingFishViewModelFAB = CatchingFishCameraXIntent.getDimensionPixelOffset(4, 0);
        catchingFishRobolectricKtor.CatchingFishLayout = CatchingFishCameraXIntent.getDimensionPixelOffset(5, 0);
        if (CatchingFishCameraXIntent.hasValue(9)) {
            int dimensionPixelSize = CatchingFishCameraXIntent.getDimensionPixelSize(9, -1);
            catchingFishRobolectricKtor.CatchingFishFragmentHandler = dimensionPixelSize;
            float f = dimensionPixelSize;
            CatchingFishKtorMVI CatchingFishWorkManager = catchingFishRobolectricKtor.CatchingFishSnackbar.CatchingFishWorkManager();
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishWorkManager = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelScope = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelFAB = new CatchingFishEspressoTesting(f);
            catchingFishRobolectricKtor.CatchingFishSnackbar = CatchingFishWorkManager.CatchingFishParcelableFAB();
            catchingFishRobolectricKtor.CatchingFishCoroutine = null;
            catchingFishRobolectricKtor.CatchingFishReduxKtor();
            catchingFishRobolectricKtor.CatchingFish = true;
        }
        catchingFishRobolectricKtor.CatchingFishCloudMessaging = CatchingFishCameraXIntent.getDimensionPixelSize(22, 0);
        catchingFishRobolectricKtor.CatchingFishEspressoTesting = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(CatchingFishCameraXIntent.getInt(8, -1), mode);
        catchingFishRobolectricKtor.CatchingFishOkHttp = CatchingFishDaggerBiometric.CatchingFishNavigation(getContext(), CatchingFishCameraXIntent, 7);
        catchingFishRobolectricKtor.CatchingFishUnitTesting = CatchingFishDaggerBiometric.CatchingFishNavigation(getContext(), CatchingFishCameraXIntent, 21);
        catchingFishRobolectricKtor.CatchingFishAnimationMockk = CatchingFishDaggerBiometric.CatchingFishNavigation(getContext(), CatchingFishCameraXIntent, 18);
        catchingFishRobolectricKtor.CatchingFishJetpackCompose = CatchingFishCameraXIntent.getBoolean(6, false);
        catchingFishRobolectricKtor.CatchingFishSpannableWidget = CatchingFishCameraXIntent.getDimensionPixelSize(10, 0);
        catchingFishRobolectricKtor.CatchingFishCoroutineFlow = CatchingFishCameraXIntent.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (CatchingFishCameraXIntent.hasValue(0)) {
            catchingFishRobolectricKtor.CatchingFishNavigation = true;
            setSupportBackgroundTintList(catchingFishRobolectricKtor.CatchingFishOkHttp);
            setSupportBackgroundTintMode(catchingFishRobolectricKtor.CatchingFishEspressoTesting);
        } else {
            catchingFishRobolectricKtor.CatchingFishCoroutine();
        }
        setPaddingRelative(paddingStart + catchingFishRobolectricKtor.CatchingFishWorkManager, paddingTop + catchingFishRobolectricKtor.CatchingFishViewModelFAB, paddingEnd + catchingFishRobolectricKtor.CatchingFishViewModelScope, paddingBottom + catchingFishRobolectricKtor.CatchingFishLayout);
        setCheckedInternal(CatchingFishCameraXIntent.getBoolean(1, false));
        if (CatchingFishSnackbar != null) {
            catchingFishRobolectricKtor.CatchingFishReduxKtor = CatchingFishReduxKtor();
            if (catchingFishRobolectricKtor.CatchingFishCoroutine != null) {
                catchingFishRobolectricKtor.CatchingFishReduxKtor();
            }
            catchingFishRobolectricKtor.CatchingFishCoroutine = CatchingFishSnackbar;
            catchingFishRobolectricKtor.CatchingFishReduxKtor();
        }
        setOpticalCenterEnabled(z);
        CatchingFishCameraXIntent.recycle();
        setCompoundDrawablePadding(this.CatchingFishRoomDatabase);
        CatchingFishViewModelFAB(this.CatchingFishEspressoTesting != null);
    }

    public static /* synthetic */ void CatchingFishParcelableFAB(MaterialButton materialButton) {
        materialButton.CatchingFishPayPal = materialButton.getOpticalCenterShift();
        materialButton.CatchingFishFragmentHandler();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.CatchingFishMutableLiveData;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        CatchingFishContextGraphQL CatchingFishParcelableFAB;
        if (this.CatchingFishCardViewRealm && this.CatchingFishCardViewView && (CatchingFishParcelableFAB = this.CatchingFishViewModelScope.CatchingFishParcelableFAB(false)) != null) {
            return (int) (CatchingFishParcelableFAB.CatchingFishViewModelFAB() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor == null || !catchingFishRobolectricKtor.CatchingFishJetpackCompose || this.CatchingFishNavigation == z) {
            return;
        }
        this.CatchingFishNavigation = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.CatchingFishNavigation;
            if (!materialButtonToggleGroup.CatchingFishAnimationMockk) {
                materialButtonToggleGroup.CatchingFishWorkManager(getId(), z2);
            }
        }
        if (this.CatchingFish) {
            return;
        }
        this.CatchingFish = true;
        Iterator it = this.CatchingFishViewModelFAB.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.CatchingFish = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.CatchingFishMutableLiveData != f) {
            this.CatchingFishMutableLiveData = f;
            CatchingFishFragmentHandler();
            invalidate();
            if (getParent() instanceof CatchingFishRealmSharedFlow) {
                CatchingFishRealmSharedFlow catchingFishRealmSharedFlow = (CatchingFishRealmSharedFlow) getParent();
                int i = (int) this.CatchingFishMutableLiveData;
                int indexOfChild = catchingFishRealmSharedFlow.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                int i2 = indexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (catchingFishRealmSharedFlow.CatchingFishCoroutine(i2)) {
                            materialButton2 = (MaterialButton) catchingFishRealmSharedFlow.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = catchingFishRealmSharedFlow.getChildCount();
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= childCount) {
                        break;
                    } else if (catchingFishRealmSharedFlow.CatchingFishCoroutine(indexOfChild)) {
                        materialButton = (MaterialButton) catchingFishRealmSharedFlow.getChildAt(indexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean CatchingFishDaggerWebsocket() {
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        return (catchingFishRobolectricKtor == null || catchingFishRobolectricKtor.CatchingFishNavigation) ? false : true;
    }

    public final void CatchingFishFragmentHandler() {
        int i = (int) (this.CatchingFishMutableLiveData - this.CatchingFishJobScheduler);
        int i2 = (i / 2) + this.CatchingFishPayPal;
        getLayoutParams().width = (int) (this.CatchingFishDaggerHiltFAB + i);
        setPaddingRelative(this.CatchingFishSpannableWidget + i2, getPaddingTop(), (this.CatchingFishParcelableFlux + i) - i2, getPaddingBottom());
    }

    public final void CatchingFishLayout(int i, int i2) {
        if (this.CatchingFishEspressoTesting == null || getLayout() == null) {
            return;
        }
        int i3 = this.CatchingFishJetpackCompose;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.CatchingFishAnimationMockk = 0;
                if (i3 == 16) {
                    this.CatchingFishStateLiveData = 0;
                    CatchingFishViewModelFAB(false);
                    return;
                }
                int i4 = this.CatchingFishUnitTesting;
                if (i4 == 0) {
                    i4 = this.CatchingFishEspressoTesting.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.CatchingFishRoomDatabase) - getPaddingBottom()) / 2);
                if (this.CatchingFishStateLiveData != max) {
                    this.CatchingFishStateLiveData = max;
                    CatchingFishViewModelFAB(false);
                    return;
                }
                return;
            }
            return;
        }
        this.CatchingFishStateLiveData = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.CatchingFishJetpackCompose;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.CatchingFishAnimationMockk = 0;
            CatchingFishViewModelFAB(false);
            return;
        }
        int i6 = this.CatchingFishUnitTesting;
        if (i6 == 0) {
            i6 = this.CatchingFishEspressoTesting.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.CatchingFishRoomDatabase) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.CatchingFishJetpackCompose == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.CatchingFishAnimationMockk != textLayoutWidth) {
            this.CatchingFishAnimationMockk = textLayoutWidth;
            CatchingFishViewModelFAB(false);
        }
    }

    public final CatchingFishHandlerMVI CatchingFishReduxKtor() {
        Context context = getContext();
        TypedValue CatchingFishGradleManifest = CatchingFishOkHttpFAB.CatchingFishGradleManifest(context, com.catchingfish.fishcatcherpro.R.attr.motionSpringFastSpatial);
        int[] iArr = CatchingFishSnackbarPicasso.CatchingFish;
        TypedArray obtainStyledAttributes = CatchingFishGradleManifest == null ? context.obtainStyledAttributes(null, iArr, 0, com.catchingfish.fishcatcherpro.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(CatchingFishGradleManifest.resourceId, iArr);
        CatchingFishHandlerMVI catchingFishHandlerMVI = new CatchingFishHandlerMVI();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            catchingFishHandlerMVI.CatchingFishParcelableFAB = Math.sqrt(f);
            catchingFishHandlerMVI.CatchingFishCoroutine = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            catchingFishHandlerMVI.CatchingFishSnackbar = f2;
            catchingFishHandlerMVI.CatchingFishCoroutine = false;
            obtainStyledAttributes.recycle();
            return catchingFishHandlerMVI;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void CatchingFishViewModelFAB(boolean z) {
        Drawable drawable = this.CatchingFishEspressoTesting;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.CatchingFishEspressoTesting = mutate;
            mutate.setTintList(this.CatchingFishCloudMessaging);
            PorterDuff.Mode mode = this.CatchingFishFragmentHandler;
            if (mode != null) {
                this.CatchingFishEspressoTesting.setTintMode(mode);
            }
            int i = this.CatchingFishUnitTesting;
            if (i == 0) {
                i = this.CatchingFishEspressoTesting.getIntrinsicWidth();
            }
            int i2 = this.CatchingFishUnitTesting;
            if (i2 == 0) {
                i2 = this.CatchingFishEspressoTesting.getIntrinsicHeight();
            }
            Drawable drawable2 = this.CatchingFishEspressoTesting;
            int i3 = this.CatchingFishAnimationMockk;
            int i4 = this.CatchingFishStateLiveData;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.CatchingFishEspressoTesting.setVisible(true, z);
        }
        if (z) {
            CatchingFishViewModelScope();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.CatchingFishJetpackCompose;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.CatchingFishEspressoTesting) || (((i5 == 3 || i5 == 4) && drawable5 != this.CatchingFishEspressoTesting) || ((i5 == 16 || i5 == 32) && drawable4 != this.CatchingFishEspressoTesting))) {
            CatchingFishViewModelScope();
        }
    }

    public final void CatchingFishViewModelScope() {
        int i = this.CatchingFishJetpackCompose;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.CatchingFishEspressoTesting, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.CatchingFishEspressoTesting, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.CatchingFishEspressoTesting, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishWorkManager(boolean z) {
        int i;
        if (this.CatchingFishCustomView == null) {
            return;
        }
        if (this.CatchingFishPayPalService == null) {
            CatchingFishRealmHiltHilt catchingFishRealmHiltHilt = new CatchingFishRealmHiltHilt(this, CatchingFishDagger);
            this.CatchingFishPayPalService = catchingFishRealmHiltHilt;
            catchingFishRealmHiltHilt.CatchingFishFragmentHandler = CatchingFishReduxKtor();
        }
        if (this.CatchingFishCardViewView) {
            int i2 = this.CatchingFishFragmentFactory;
            CatchingFishRealmAdMob catchingFishRealmAdMob = this.CatchingFishCustomView;
            int[] drawableState = getDrawableState();
            int[][] iArr = catchingFishRealmAdMob.CatchingFishCoroutine;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= catchingFishRealmAdMob.CatchingFishParcelableFAB) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = catchingFishRealmAdMob.CatchingFishCoroutine;
                int i5 = 0;
                while (true) {
                    if (i5 >= catchingFishRealmAdMob.CatchingFishParcelableFAB) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            CatchingFishContextLiveData catchingFishContextLiveData = (CatchingFishContextLiveData) (i4 < 0 ? catchingFishRealmAdMob.CatchingFishSnackbar : catchingFishRealmAdMob.CatchingFishReduxKtor[i4]).CatchingFishDaggerWebsocket;
            int width = getWidth();
            float f = catchingFishContextLiveData.CatchingFishSnackbar;
            int i6 = catchingFishContextLiveData.CatchingFishParcelableFAB;
            if (i6 == 1) {
                f *= width;
            }
            i3 = (int) f;
            this.CatchingFishPayPalService.CatchingFishParcelableFAB(Math.min(i2, i3));
            if (z) {
                this.CatchingFishPayPalService.CatchingFishReduxKtor();
            }
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.CatchingFishOkHttp)) {
            return this.CatchingFishOkHttp;
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        return ((catchingFishRobolectricKtor == null || !catchingFishRobolectricKtor.CatchingFishJetpackCompose) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.CatchingFishMVPRobolectric;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishFragmentHandler;
        }
        return 0;
    }

    public CatchingFishHandlerMVI getCornerSpringForce() {
        return this.CatchingFishViewModelScope.CatchingFishReduxKtor;
    }

    public Drawable getIcon() {
        return this.CatchingFishEspressoTesting;
    }

    public int getIconGravity() {
        return this.CatchingFishJetpackCompose;
    }

    public int getIconPadding() {
        return this.CatchingFishRoomDatabase;
    }

    public int getIconSize() {
        return this.CatchingFishUnitTesting;
    }

    public ColorStateList getIconTint() {
        return this.CatchingFishCloudMessaging;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.CatchingFishFragmentHandler;
    }

    public int getInsetBottom() {
        return this.CatchingFishViewModelScope.CatchingFishLayout;
    }

    public int getInsetTop() {
        return this.CatchingFishViewModelScope.CatchingFishViewModelFAB;
    }

    public ColorStateList getRippleColor() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishAnimationMockk;
        }
        return null;
    }

    public CatchingFishFragmentMVVM getShapeAppearanceModel() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishSnackbar;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public CatchingFishMVVMViewMoshi getStateListShapeAppearanceModel() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishCoroutine;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishUnitTesting;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (CatchingFishDaggerWebsocket()) {
            return this.CatchingFishViewModelScope.CatchingFishCloudMessaging;
        }
        return 0;
    }

    @Override // kotlin.text.CatchingFishHiltHandler
    public ColorStateList getSupportBackgroundTintList() {
        return CatchingFishDaggerWebsocket() ? this.CatchingFishViewModelScope.CatchingFishOkHttp : super.getSupportBackgroundTintList();
    }

    @Override // kotlin.text.CatchingFishHiltHandler
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return CatchingFishDaggerWebsocket() ? this.CatchingFishViewModelScope.CatchingFishEspressoTesting : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.CatchingFishNavigation;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishKtorViewModel.CatchingFishCardViewRealm(this, this.CatchingFishViewModelScope.CatchingFishParcelableFAB(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor != null && catchingFishRobolectricKtor.CatchingFishJetpackCompose) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishSensorManager);
        }
        if (this.CatchingFishNavigation) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishEspressoMockk);
        }
        return onCreateDrawableState;
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.CatchingFishNavigation);
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        accessibilityNodeInfo.setCheckable(catchingFishRobolectricKtor != null && catchingFishRobolectricKtor.CatchingFishJetpackCompose);
        accessibilityNodeInfo.setChecked(this.CatchingFishNavigation);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        CatchingFishLayout(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.CatchingFishCoroutineFlow != i6) {
            this.CatchingFishCoroutineFlow = i6;
            this.CatchingFishDaggerHiltFAB = -1.0f;
        }
        if (this.CatchingFishDaggerHiltFAB == -1.0f) {
            this.CatchingFishDaggerHiltFAB = getMeasuredWidth();
            if (this.CatchingFishGsonAppCompat == null && (getParent() instanceof CatchingFishRealmSharedFlow) && ((CatchingFishRealmSharedFlow) getParent()).getButtonSizeChange() != null) {
                this.CatchingFishGsonAppCompat = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.CatchingFishGsonAppCompat);
                layoutParams.width = (int) this.CatchingFishDaggerHiltFAB;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.CatchingFishMVPRobolectric == -1) {
            if (this.CatchingFishEspressoTesting == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.CatchingFishUnitTesting;
                if (i7 == 0) {
                    i7 = this.CatchingFishEspressoTesting.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.CatchingFishMVPRobolectric = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.CatchingFishSpannableWidget == -1) {
            this.CatchingFishSpannableWidget = getPaddingStart();
        }
        if (this.CatchingFishParcelableFlux == -1) {
            this.CatchingFishParcelableFlux = getPaddingEnd();
        }
        if ((getParent() instanceof CatchingFishRealmSharedFlow) && ((CatchingFishRealmSharedFlow) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.CatchingFishCardViewView = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishKtorToast)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishKtorToast catchingFishKtorToast = (CatchingFishKtorToast) parcelable;
        super.onRestoreInstanceState(catchingFishKtorToast.CatchingFishReduxKtor);
        setChecked(catchingFishKtorToast.CatchingFishWorkManager);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishKtorToast catchingFishKtorToast = new CatchingFishKtorToast(super.onSaveInstanceState());
        catchingFishKtorToast.CatchingFishWorkManager = this.CatchingFishNavigation;
        return catchingFishKtorToast;
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        CatchingFishLayout(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.CatchingFishViewModelScope.CatchingFishCoroutineFlow) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.CatchingFishEspressoTesting != null) {
            if (this.CatchingFishEspressoTesting.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.CatchingFishOkHttp = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!CatchingFishDaggerWebsocket()) {
            super.setBackgroundColor(i);
            return;
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor.CatchingFishParcelableFAB(false) != null) {
            catchingFishRobolectricKtor.CatchingFishParcelableFAB(false).setTint(i);
        }
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!CatchingFishDaggerWebsocket()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        catchingFishRobolectricKtor.CatchingFishNavigation = true;
        MaterialButton materialButton = catchingFishRobolectricKtor.CatchingFishParcelableFAB;
        materialButton.setSupportBackgroundTintList(catchingFishRobolectricKtor.CatchingFishOkHttp);
        materialButton.setSupportBackgroundTintMode(catchingFishRobolectricKtor.CatchingFishEspressoTesting);
        super.setBackgroundDrawable(drawable);
    }

    @Override // kotlin.text.CatchingFishHiltHandler, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (CatchingFishDaggerWebsocket()) {
            this.CatchingFishViewModelScope.CatchingFishJetpackCompose = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            if (catchingFishRobolectricKtor.CatchingFish && catchingFishRobolectricKtor.CatchingFishFragmentHandler == i) {
                return;
            }
            catchingFishRobolectricKtor.CatchingFishFragmentHandler = i;
            catchingFishRobolectricKtor.CatchingFish = true;
            float f = i;
            CatchingFishKtorMVI CatchingFishWorkManager = catchingFishRobolectricKtor.CatchingFishSnackbar.CatchingFishWorkManager();
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishWorkManager = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelScope = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelFAB = new CatchingFishEspressoTesting(f);
            catchingFishRobolectricKtor.CatchingFishSnackbar = CatchingFishWorkManager.CatchingFishParcelableFAB();
            catchingFishRobolectricKtor.CatchingFishCoroutine = null;
            catchingFishRobolectricKtor.CatchingFishReduxKtor();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (CatchingFishDaggerWebsocket()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(CatchingFishHandlerMVI catchingFishHandlerMVI) {
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        catchingFishRobolectricKtor.CatchingFishReduxKtor = catchingFishHandlerMVI;
        if (catchingFishRobolectricKtor.CatchingFishCoroutine != null) {
            catchingFishRobolectricKtor.CatchingFishReduxKtor();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.CatchingFishJobScheduler = Math.min(i, this.CatchingFishMVPRobolectric);
        CatchingFishFragmentHandler();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (CatchingFishDaggerWebsocket()) {
            this.CatchingFishViewModelScope.CatchingFishParcelableFAB(false).CatchingFishOkHttp(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.CatchingFishEspressoTesting != drawable) {
            this.CatchingFishEspressoTesting = drawable;
            CatchingFishViewModelFAB(true);
            CatchingFishLayout(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.CatchingFishJetpackCompose != i) {
            this.CatchingFishJetpackCompose = i;
            CatchingFishLayout(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.CatchingFishRoomDatabase != i) {
            this.CatchingFishRoomDatabase = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.CatchingFishUnitTesting != i) {
            this.CatchingFishUnitTesting = i;
            CatchingFishViewModelFAB(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.CatchingFishCloudMessaging != colorStateList) {
            this.CatchingFishCloudMessaging = colorStateList;
            CatchingFishViewModelFAB(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.CatchingFishFragmentHandler != mode) {
            this.CatchingFishFragmentHandler = mode;
            CatchingFishViewModelFAB(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(CatchingFishGsonCardView.CatchingFishSpannableWidget(getContext(), i));
    }

    public void setInsetBottom(int i) {
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        catchingFishRobolectricKtor.CatchingFishSnackbar(catchingFishRobolectricKtor.CatchingFishViewModelFAB, i);
    }

    public void setInsetTop(int i) {
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        catchingFishRobolectricKtor.CatchingFishSnackbar(i, catchingFishRobolectricKtor.CatchingFishLayout);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(CatchingFishMVIIntentGradle catchingFishMVIIntentGradle) {
        this.CatchingFishLayout = catchingFishMVIIntentGradle;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.CatchingFishCardViewRealm != z) {
            this.CatchingFishCardViewRealm = z;
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            if (z) {
                CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = new CatchingFishLayoutCoroutine(3, this);
                catchingFishRobolectricKtor.CatchingFishDaggerWebsocket = catchingFishLayoutCoroutine;
                CatchingFishContextGraphQL CatchingFishParcelableFAB = catchingFishRobolectricKtor.CatchingFishParcelableFAB(false);
                if (CatchingFishParcelableFAB != null) {
                    CatchingFishParcelableFAB.CatchingFishJobScheduler = catchingFishLayoutCoroutine;
                }
            } else {
                catchingFishRobolectricKtor.CatchingFishDaggerWebsocket = null;
                CatchingFishContextGraphQL CatchingFishParcelableFAB2 = catchingFishRobolectricKtor.CatchingFishParcelableFAB(false);
                if (CatchingFishParcelableFAB2 != null) {
                    CatchingFishParcelableFAB2.CatchingFishJobScheduler = null;
                }
            }
            post(new CatchingFishMVPLayout(13, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        CatchingFishMVIIntentGradle catchingFishMVIIntentGradle = this.CatchingFishLayout;
        if (catchingFishMVIIntentGradle != null) {
            ((MaterialButtonToggleGroup) ((CatchingFishViewPagerMockk) catchingFishMVIIntentGradle).CatchingFishDaggerWebsocket).invalidate();
        }
        super.setPressed(z);
        CatchingFishWorkManager(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            MaterialButton materialButton = catchingFishRobolectricKtor.CatchingFishParcelableFAB;
            if (catchingFishRobolectricKtor.CatchingFishAnimationMockk != colorStateList) {
                catchingFishRobolectricKtor.CatchingFishAnimationMockk = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(CatchingFishGsonCardView.CatchingFishPayPalService(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (CatchingFishDaggerWebsocket()) {
            setRippleColor(CatchingFishGsonCardView.CatchingFishSpannableWidget(getContext(), i));
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpDagger
    public void setShapeAppearanceModel(CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        if (!CatchingFishDaggerWebsocket()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        catchingFishRobolectricKtor.CatchingFishSnackbar = catchingFishFragmentMVVM;
        catchingFishRobolectricKtor.CatchingFishCoroutine = null;
        catchingFishRobolectricKtor.CatchingFishReduxKtor();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            catchingFishRobolectricKtor.CatchingFishRoomDatabase = z;
            catchingFishRobolectricKtor.CatchingFishDaggerWebsocket();
        }
    }

    public void setSizeChange(CatchingFishRealmAdMob catchingFishRealmAdMob) {
        if (this.CatchingFishCustomView != catchingFishRealmAdMob) {
            this.CatchingFishCustomView = catchingFishRealmAdMob;
            CatchingFishWorkManager(true);
        }
    }

    public void setStateListShapeAppearanceModel(CatchingFishMVVMViewMoshi catchingFishMVVMViewMoshi) {
        if (!CatchingFishDaggerWebsocket()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor.CatchingFishReduxKtor == null && catchingFishMVVMViewMoshi.CatchingFishReduxKtor()) {
            catchingFishRobolectricKtor.CatchingFishReduxKtor = CatchingFishReduxKtor();
            if (catchingFishRobolectricKtor.CatchingFishCoroutine != null) {
                catchingFishRobolectricKtor.CatchingFishReduxKtor();
            }
        }
        catchingFishRobolectricKtor.CatchingFishCoroutine = catchingFishMVVMViewMoshi;
        catchingFishRobolectricKtor.CatchingFishReduxKtor();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            if (catchingFishRobolectricKtor.CatchingFishUnitTesting != colorStateList) {
                catchingFishRobolectricKtor.CatchingFishUnitTesting = colorStateList;
                catchingFishRobolectricKtor.CatchingFishDaggerWebsocket();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (CatchingFishDaggerWebsocket()) {
            setStrokeColor(CatchingFishGsonCardView.CatchingFishSpannableWidget(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (CatchingFishDaggerWebsocket()) {
            CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
            if (catchingFishRobolectricKtor.CatchingFishCloudMessaging != i) {
                catchingFishRobolectricKtor.CatchingFishCloudMessaging = i;
                catchingFishRobolectricKtor.CatchingFishDaggerWebsocket();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (CatchingFishDaggerWebsocket()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // kotlin.text.CatchingFishHiltHandler
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!CatchingFishDaggerWebsocket()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor.CatchingFishOkHttp != colorStateList) {
            catchingFishRobolectricKtor.CatchingFishOkHttp = colorStateList;
            if (catchingFishRobolectricKtor.CatchingFishParcelableFAB(false) != null) {
                catchingFishRobolectricKtor.CatchingFishParcelableFAB(false).setTintList(catchingFishRobolectricKtor.CatchingFishOkHttp);
            }
        }
    }

    @Override // kotlin.text.CatchingFishHiltHandler
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!CatchingFishDaggerWebsocket()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        CatchingFishRobolectricKtor catchingFishRobolectricKtor = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricKtor.CatchingFishEspressoTesting != mode) {
            catchingFishRobolectricKtor.CatchingFishEspressoTesting = mode;
            if (catchingFishRobolectricKtor.CatchingFishParcelableFAB(false) == null || catchingFishRobolectricKtor.CatchingFishEspressoTesting == null) {
                return;
            }
            catchingFishRobolectricKtor.CatchingFishParcelableFAB(false).setTintMode(catchingFishRobolectricKtor.CatchingFishEspressoTesting);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        CatchingFishLayout(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.CatchingFishViewModelScope.CatchingFishCoroutineFlow = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.CatchingFishDaggerHiltFAB = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.CatchingFishFragmentFactory != i) {
            this.CatchingFishFragmentFactory = i;
            CatchingFishWorkManager(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.CatchingFishNavigation);
    }
}
