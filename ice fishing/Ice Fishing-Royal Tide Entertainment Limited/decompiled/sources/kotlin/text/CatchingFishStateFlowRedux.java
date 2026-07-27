package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowRedux extends CatchingFishViewDatabinding {
    public ColorStateList CatchingFish;
    public Drawable CatchingFishAnimationMockk;
    public final CatchingFishAdMobSharedFlow CatchingFishCardViewRealm;
    public boolean CatchingFishCloudMessaging;
    public int CatchingFishCoroutineFlow;
    public int[] CatchingFishDaggerHiltFAB;
    public boolean CatchingFishEspressoTesting;
    public ColorStateList CatchingFishFragmentHandler;
    public CompoundButton.OnCheckedChangeListener CatchingFishGsonAppCompat;
    public PorterDuff.Mode CatchingFishJetpackCompose;
    public final LinkedHashSet CatchingFishLayout;
    public ColorStateList CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public CharSequence CatchingFishParcelableFlux;
    public final CatchingFishMockkAdMob CatchingFishPayPal;
    public boolean CatchingFishRoomDatabase;
    public boolean CatchingFishSpannableWidget;
    public Drawable CatchingFishStateLiveData;
    public CharSequence CatchingFishUnitTesting;
    public final LinkedHashSet CatchingFishViewModelFAB;
    public static final int[] CatchingFishCardViewView = {R.attr.state_indeterminate};
    public static final int[] CatchingFishMVPRobolectric = {R.attr.state_error};
    public static final int[][] CatchingFishCustomView = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int CatchingFishFragmentFactory = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public CatchingFishStateFlowRedux(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.CatchingFishViewModelFAB = new LinkedHashSet();
        this.CatchingFishLayout = new LinkedHashSet();
        Context context2 = getContext();
        CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = new CatchingFishAdMobSharedFlow(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        catchingFishAdMobSharedFlow.CatchingFishReduxKtor = drawable;
        drawable.setCallback(catchingFishAdMobSharedFlow.CatchingFishLayout);
        new CatchingFishServiceMVP(catchingFishAdMobSharedFlow.CatchingFishReduxKtor.getConstantState());
        this.CatchingFishCardViewRealm = catchingFishAdMobSharedFlow;
        this.CatchingFishPayPal = new CatchingFishMockkAdMob(this);
        Context context3 = getContext();
        this.CatchingFishAnimationMockk = getButtonDrawable();
        this.CatchingFishNavigation = getSuperButtonTintList();
        setSupportButtonTintList(null);
        CatchingFishLayoutRoomFAB.CatchingFishOkHttp(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = CatchingFishSnackbarPicasso.CatchingFishAnimationMockk;
        CatchingFishLayoutRoomFAB.CatchingFishAnimationMockk(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(context3, obtainStyledAttributes);
        this.CatchingFishStateLiveData = catchingFishAsyncTaskDagger.CatchingFishMutableLiveData(2);
        if (this.CatchingFishAnimationMockk != null && CatchingFishOkHttpFAB.CatchingFishMotionLayout(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == CatchingFishFragmentFactory && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.CatchingFishAnimationMockk = CatchingFishLayoutRoomFAB.CatchingFishCustomView(context3, R.drawable.mtrl_checkbox_button);
                this.CatchingFishRoomDatabase = true;
                if (this.CatchingFishStateLiveData == null) {
                    this.CatchingFishStateLiveData = CatchingFishLayoutRoomFAB.CatchingFishCustomView(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.CatchingFish = CatchingFishDaggerBiometric.CatchingFish(context3, catchingFishAsyncTaskDagger, 3);
        this.CatchingFishJetpackCompose = CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.CatchingFishCloudMessaging = obtainStyledAttributes.getBoolean(10, false);
        this.CatchingFishEspressoTesting = obtainStyledAttributes.getBoolean(6, true);
        this.CatchingFishOkHttp = obtainStyledAttributes.getBoolean(9, false);
        this.CatchingFishUnitTesting = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        catchingFishAsyncTaskDagger.CatchingFishAnimation();
        CatchingFishParcelableFAB();
    }

    private String getButtonStateDescription() {
        int i = this.CatchingFishCoroutineFlow;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.CatchingFishFragmentHandler == null) {
            int CatchingFishViewModelFAB = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorControlActivated);
            int CatchingFishViewModelFAB2 = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorError);
            int CatchingFishViewModelFAB3 = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorSurface);
            int CatchingFishViewModelFAB4 = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorOnSurface);
            this.CatchingFishFragmentHandler = new ColorStateList(CatchingFishCustomView, new int[]{CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(1.0f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB2), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(1.0f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.54f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB4), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.38f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB4), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.38f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB4)});
        }
        return this.CatchingFishFragmentHandler;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.CatchingFishNavigation;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void CatchingFishParcelableFAB() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        CatchingFishStateLiveData catchingFishStateLiveData;
        Drawable drawable = this.CatchingFishAnimationMockk;
        ColorStateList colorStateList3 = this.CatchingFishNavigation;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.CatchingFishAnimationMockk = drawable;
        Drawable drawable2 = this.CatchingFishStateLiveData;
        ColorStateList colorStateList4 = this.CatchingFish;
        PorterDuff.Mode mode = this.CatchingFishJetpackCompose;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.CatchingFishStateLiveData = drawable2;
        if (this.CatchingFishRoomDatabase) {
            CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = this.CatchingFishCardViewRealm;
            if (catchingFishAdMobSharedFlow != null) {
                CatchingFishBundleFlux catchingFishBundleFlux = catchingFishAdMobSharedFlow.CatchingFishDaggerWebsocket;
                Drawable drawable3 = catchingFishAdMobSharedFlow.CatchingFishReduxKtor;
                CatchingFishMockkAdMob catchingFishMockkAdMob = this.CatchingFishPayPal;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (catchingFishMockkAdMob.CatchingFishParcelableFAB == null) {
                        catchingFishMockkAdMob.CatchingFishParcelableFAB = new CatchingFishMoshiViewPager(catchingFishMockkAdMob);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(catchingFishMockkAdMob.CatchingFishParcelableFAB);
                }
                ArrayList arrayList = catchingFishAdMobSharedFlow.CatchingFishViewModelFAB;
                if (arrayList != null && catchingFishMockkAdMob != null) {
                    arrayList.remove(catchingFishMockkAdMob);
                    if (catchingFishAdMobSharedFlow.CatchingFishViewModelFAB.size() == 0 && (catchingFishStateLiveData = catchingFishAdMobSharedFlow.CatchingFishViewModelScope) != null) {
                        catchingFishBundleFlux.CatchingFishSnackbar.removeListener(catchingFishStateLiveData);
                        catchingFishAdMobSharedFlow.CatchingFishViewModelScope = null;
                    }
                }
                Drawable drawable4 = catchingFishAdMobSharedFlow.CatchingFishReduxKtor;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (catchingFishMockkAdMob.CatchingFishParcelableFAB == null) {
                        catchingFishMockkAdMob.CatchingFishParcelableFAB = new CatchingFishMoshiViewPager(catchingFishMockkAdMob);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(catchingFishMockkAdMob.CatchingFishParcelableFAB);
                } else if (catchingFishMockkAdMob != null) {
                    if (catchingFishAdMobSharedFlow.CatchingFishViewModelFAB == null) {
                        catchingFishAdMobSharedFlow.CatchingFishViewModelFAB = new ArrayList();
                    }
                    if (!catchingFishAdMobSharedFlow.CatchingFishViewModelFAB.contains(catchingFishMockkAdMob)) {
                        catchingFishAdMobSharedFlow.CatchingFishViewModelFAB.add(catchingFishMockkAdMob);
                        if (catchingFishAdMobSharedFlow.CatchingFishViewModelScope == null) {
                            catchingFishAdMobSharedFlow.CatchingFishViewModelScope = new CatchingFishStateLiveData(1, catchingFishAdMobSharedFlow);
                        }
                        catchingFishBundleFlux.CatchingFishSnackbar.addListener(catchingFishAdMobSharedFlow.CatchingFishViewModelScope);
                    }
                }
            }
            Drawable drawable5 = this.CatchingFishAnimationMockk;
            if ((drawable5 instanceof AnimatedStateListDrawable) && catchingFishAdMobSharedFlow != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, catchingFishAdMobSharedFlow, false);
                ((AnimatedStateListDrawable) this.CatchingFishAnimationMockk).addTransition(R.id.indeterminate, R.id.unchecked, catchingFishAdMobSharedFlow, false);
            }
        }
        Drawable drawable6 = this.CatchingFishAnimationMockk;
        if (drawable6 != null && (colorStateList2 = this.CatchingFishNavigation) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.CatchingFishStateLiveData;
        if (drawable7 != null && (colorStateList = this.CatchingFish) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.CatchingFishAnimationMockk;
        Drawable drawable9 = this.CatchingFishStateLiveData;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.CatchingFishAnimationMockk;
    }

    public Drawable getButtonIconDrawable() {
        return this.CatchingFishStateLiveData;
    }

    public ColorStateList getButtonIconTintList() {
        return this.CatchingFish;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.CatchingFishJetpackCompose;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.CatchingFishNavigation;
    }

    public int getCheckedState() {
        return this.CatchingFishCoroutineFlow;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.CatchingFishUnitTesting;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.CatchingFishCoroutineFlow == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.CatchingFishCloudMessaging && this.CatchingFishNavigation == null && this.CatchingFish == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishCardViewView);
        }
        if (this.CatchingFishOkHttp) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishMVPRobolectric);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.CatchingFishDaggerHiltFAB = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.CatchingFishEspressoTesting || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.CatchingFishOkHttp) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.CatchingFishUnitTesting));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishStateFlowRoom)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishStateFlowRoom catchingFishStateFlowRoom = (CatchingFishStateFlowRoom) parcelable;
        super.onRestoreInstanceState(catchingFishStateFlowRoom.getSuperState());
        setCheckedState(catchingFishStateFlowRoom.CatchingFishReduxKtor);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishStateFlowRoom catchingFishStateFlowRoom = new CatchingFishStateFlowRoom(super.onSaveInstanceState());
        catchingFishStateFlowRoom.CatchingFishReduxKtor = getCheckedState();
        return catchingFishStateFlowRoom;
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.CatchingFishStateLiveData = drawable;
        CatchingFishParcelableFAB();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.CatchingFish == colorStateList) {
            return;
        }
        this.CatchingFish = colorStateList;
        CatchingFishParcelableFAB();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.CatchingFishJetpackCompose == mode) {
            return;
        }
        this.CatchingFishJetpackCompose = mode;
        CatchingFishParcelableFAB();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.CatchingFishNavigation == colorStateList) {
            return;
        }
        this.CatchingFishNavigation = colorStateList;
        CatchingFishParcelableFAB();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        CatchingFishParcelableFAB();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.CatchingFishEspressoTesting = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.CatchingFishCoroutineFlow != i) {
            this.CatchingFishCoroutineFlow = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.CatchingFishParcelableFlux == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.CatchingFishSpannableWidget) {
                return;
            }
            this.CatchingFishSpannableWidget = true;
            LinkedHashSet linkedHashSet = this.CatchingFishLayout;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.CatchingFishCoroutineFlow != 2 && (onCheckedChangeListener = this.CatchingFishGsonAppCompat) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.CatchingFishSpannableWidget = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.CatchingFishUnitTesting = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.CatchingFishOkHttp == z) {
            return;
        }
        this.CatchingFishOkHttp = z;
        refreshDrawableState();
        Iterator it = this.CatchingFishViewModelFAB.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.CatchingFishGsonAppCompat = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.CatchingFishParcelableFlux = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.CatchingFishCloudMessaging = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // kotlin.text.CatchingFishViewDatabinding, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.CatchingFishAnimationMockk = drawable;
        this.CatchingFishRoomDatabase = false;
        CatchingFishParcelableFAB();
    }
}
