package kotlin.text;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishMVIMVPOkHttp extends CatchingFishRoomFlux {
    public ColorStateList CatchingFishAnimationMockk;
    public final int CatchingFishCloudMessaging;
    public final float CatchingFishEspressoTesting;
    public final Rect CatchingFishFragmentHandler;
    public final AccessibilityManager CatchingFishLayout;
    public ColorStateList CatchingFishOkHttp;
    public int CatchingFishUnitTesting;
    public final CatchingFishAndroidXService CatchingFishViewModelFAB;

    public CatchingFishMVIMVPOkHttp(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.CatchingFishFragmentHandler = new Rect();
        Context context2 = getContext();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishLayout, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (CatchingFishCameraXIntent.hasValue(0) && CatchingFishCameraXIntent.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.CatchingFishCloudMessaging = CatchingFishCameraXIntent.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.CatchingFishEspressoTesting = CatchingFishCameraXIntent.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (CatchingFishCameraXIntent.hasValue(2)) {
            this.CatchingFishOkHttp = ColorStateList.valueOf(CatchingFishCameraXIntent.getColor(2, 0));
        }
        this.CatchingFishUnitTesting = CatchingFishCameraXIntent.getColor(4, 0);
        this.CatchingFishAnimationMockk = CatchingFishDaggerBiometric.CatchingFishNavigation(context2, CatchingFishCameraXIntent, 5);
        this.CatchingFishLayout = (AccessibilityManager) context2.getSystemService("accessibility");
        CatchingFishAndroidXService catchingFishAndroidXService = new CatchingFishAndroidXService(context2, null, R.attr.listPopupWindowStyle, 0);
        this.CatchingFishViewModelFAB = catchingFishAndroidXService;
        catchingFishAndroidXService.CatchingFishCardViewView = true;
        catchingFishAndroidXService.CatchingFishMVPRobolectric.setFocusable(true);
        catchingFishAndroidXService.CatchingFishNavigation = this;
        catchingFishAndroidXService.CatchingFishMVPRobolectric.setInputMethodMode(2);
        catchingFishAndroidXService.CatchingFishStateLiveData(getAdapter());
        catchingFishAndroidXService.CatchingFish = new CatchingFishFirebaseRedux(1, this);
        if (CatchingFishCameraXIntent.hasValue(6)) {
            setSimpleItems(CatchingFishCameraXIntent.getResourceId(6, 0));
        }
        CatchingFishCameraXIntent.recycle();
    }

    public final boolean CatchingFishCoroutine() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.CatchingFishLayout;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    public final TextInputLayout CatchingFishSnackbar() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (CatchingFishCoroutine()) {
            this.CatchingFishViewModelFAB.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.CatchingFishOkHttp;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout CatchingFishSnackbar = CatchingFishSnackbar();
        return (CatchingFishSnackbar == null || !CatchingFishSnackbar.CatchingFishSensorManager) ? super.getHint() : CatchingFishSnackbar.getHint();
    }

    public float getPopupElevation() {
        return this.CatchingFishEspressoTesting;
    }

    public int getSimpleItemSelectedColor() {
        return this.CatchingFishUnitTesting;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.CatchingFishAnimationMockk;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout CatchingFishSnackbar = CatchingFishSnackbar();
        if (CatchingFishSnackbar != null && CatchingFishSnackbar.CatchingFishSensorManager && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.CatchingFishViewModelFAB.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout CatchingFishSnackbar = CatchingFishSnackbar();
            int i3 = 0;
            if (adapter != null && CatchingFishSnackbar != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                CatchingFishAndroidXService catchingFishAndroidXService = this.CatchingFishViewModelFAB;
                int min = Math.min(adapter.getCount(), Math.max(0, !catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing() ? -1 : catchingFishAndroidXService.CatchingFishWorkManager.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, CatchingFishSnackbar);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = catchingFishAndroidXService.CatchingFishMVPRobolectric.getBackground();
                if (background != null) {
                    Rect rect = this.CatchingFishFragmentHandler;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = CatchingFishSnackbar.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (CatchingFishCoroutine()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.CatchingFishViewModelFAB.CatchingFishStateLiveData(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        CatchingFishAndroidXService catchingFishAndroidXService = this.CatchingFishViewModelFAB;
        if (catchingFishAndroidXService != null) {
            catchingFishAndroidXService.CatchingFishViewModelFAB(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.CatchingFishOkHttp = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof CatchingFishContextGraphQL) {
            ((CatchingFishContextGraphQL) dropDownBackground).CatchingFishUnitTesting(this.CatchingFishOkHttp);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.CatchingFishViewModelFAB.CatchingFishJetpackCompose = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout CatchingFishSnackbar = CatchingFishSnackbar();
        if (CatchingFishSnackbar != null) {
            CatchingFishSnackbar.CatchingFishCoroutineFlow();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.CatchingFishUnitTesting = i;
        if (getAdapter() instanceof CatchingFishViewBiometric) {
            ((CatchingFishViewBiometric) getAdapter()).CatchingFishParcelableFAB();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.CatchingFishAnimationMockk = colorStateList;
        if (getAdapter() instanceof CatchingFishViewBiometric) {
            ((CatchingFishViewBiometric) getAdapter()).CatchingFishParcelableFAB();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (CatchingFishCoroutine()) {
            this.CatchingFishViewModelFAB.CatchingFishReduxKtor();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new CatchingFishViewBiometric(this, getContext(), this.CatchingFishCloudMessaging, strArr));
    }
}
