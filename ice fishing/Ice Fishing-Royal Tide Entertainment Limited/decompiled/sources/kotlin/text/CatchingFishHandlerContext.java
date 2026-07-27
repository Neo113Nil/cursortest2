package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class CatchingFishHandlerContext extends Spinner {
    public static final int[] CatchingFishEspressoTesting = {R.attr.spinnerMode};
    public final Rect CatchingFishCloudMessaging;
    public final Context CatchingFishDaggerWebsocket;
    public int CatchingFishFragmentHandler;
    public final CatchingFishGsonDaggerHilt CatchingFishLayout;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public final boolean CatchingFishViewModelFAB;
    public SpinnerAdapter CatchingFishViewModelScope;
    public final CatchingFishViewViewPager CatchingFishWorkManager;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r7 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishHandlerContext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.CatchingFishCloudMessaging = new Rect();
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        int[] iArr = CatchingFishWidgetGlide.CatchingFishCoroutineFlow;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        this.CatchingFishReduxKtor = new CatchingFishPicassoJUnit(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.CatchingFishDaggerWebsocket = new CatchingFishGraphQLManifest(context, resourceId);
        } else {
            this.CatchingFishDaggerWebsocket = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, CatchingFishEspressoTesting, com.catchingfish.fishcatcherpro.R.attr.spinnerStyle, 0);
        } catch (Exception unused) {
            typedArray = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (typedArray.hasValue(0)) {
                i = typedArray.getInt(0, 0);
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            typedArray3 = typedArray;
            if (typedArray3 != null) {
                typedArray3.recycle();
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            CatchingFishReduxFAB catchingFishReduxFAB = new CatchingFishReduxFAB(this);
            this.CatchingFishLayout = catchingFishReduxFAB;
            catchingFishReduxFAB.CatchingFishWorkManager = typedArray2.getString(2);
        } else if (i == 1) {
            CatchingFishMVIFAB catchingFishMVIFAB = new CatchingFishMVIFAB(this, this.CatchingFishDaggerWebsocket, attributeSet);
            CatchingFishAsyncTaskDagger CatchingFishRecyclerView2 = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(this.CatchingFishDaggerWebsocket, attributeSet, iArr, com.catchingfish.fishcatcherpro.R.attr.spinnerStyle);
            this.CatchingFishFragmentHandler = ((TypedArray) CatchingFishRecyclerView2.CatchingFishDaggerWebsocket).getLayoutDimension(3, -2);
            catchingFishMVIFAB.CatchingFishViewModelFAB(CatchingFishRecyclerView2.CatchingFishMutableLiveData(1));
            catchingFishMVIFAB.CatchingFishMutableLiveData = typedArray2.getString(2);
            CatchingFishRecyclerView2.CatchingFishAnimation();
            this.CatchingFishLayout = catchingFishMVIFAB;
            this.CatchingFishWorkManager = new CatchingFishViewViewPager(this, this, catchingFishMVIFAB);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.catchingfish.fishcatcherpro.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
        this.CatchingFishViewModelFAB = true;
        SpinnerAdapter spinnerAdapter = this.CatchingFishViewModelScope;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.CatchingFishViewModelScope = null;
        }
        this.CatchingFishReduxKtor.CatchingFishReduxKtor(attributeSet, com.catchingfish.fishcatcherpro.R.attr.spinnerStyle);
    }

    public final int CatchingFishParcelableFAB(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.CatchingFishCloudMessaging;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        return catchingFishGsonDaggerHilt != null ? catchingFishGsonDaggerHilt.CatchingFishSnackbar() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        return catchingFishGsonDaggerHilt != null ? catchingFishGsonDaggerHilt.CatchingFishUnitTesting() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.CatchingFishLayout != null ? this.CatchingFishFragmentHandler : super.getDropDownWidth();
    }

    public final CatchingFishGsonDaggerHilt getInternalPopup() {
        return this.CatchingFishLayout;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        return catchingFishGsonDaggerHilt != null ? catchingFishGsonDaggerHilt.CatchingFishDaggerWebsocket() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        return catchingFishGsonDaggerHilt != null ? catchingFishGsonDaggerHilt.CatchingFishAnimationMockk() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt == null || !catchingFishGsonDaggerHilt.CatchingFishParcelableFAB()) {
            return;
        }
        catchingFishGsonDaggerHilt.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.CatchingFishLayout == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), CatchingFishParcelableFAB(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        CatchingFishToolbarMVP catchingFishToolbarMVP = (CatchingFishToolbarMVP) parcelable;
        super.onRestoreInstanceState(catchingFishToolbarMVP.getSuperState());
        if (!catchingFishToolbarMVP.CatchingFishReduxKtor || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new CatchingFishMVPStateFlow(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishToolbarMVP catchingFishToolbarMVP = new CatchingFishToolbarMVP(super.onSaveInstanceState());
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        catchingFishToolbarMVP.CatchingFishReduxKtor = catchingFishGsonDaggerHilt != null && catchingFishGsonDaggerHilt.CatchingFishParcelableFAB();
        return catchingFishToolbarMVP;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CatchingFishViewViewPager catchingFishViewViewPager = this.CatchingFishWorkManager;
        if (catchingFishViewViewPager == null || !catchingFishViewViewPager.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt == null) {
            return super.performClick();
        }
        if (catchingFishGsonDaggerHilt.CatchingFishParcelableFAB()) {
            return true;
        }
        this.CatchingFishLayout.CatchingFishOkHttp(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            catchingFishGsonDaggerHilt.CatchingFishCloudMessaging(i);
            catchingFishGsonDaggerHilt.CatchingFishEspressoTesting(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt != null) {
            catchingFishGsonDaggerHilt.CatchingFishFragmentHandler(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.CatchingFishLayout != null) {
            this.CatchingFishFragmentHandler = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt != null) {
            catchingFishGsonDaggerHilt.CatchingFishViewModelFAB(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt != null) {
            catchingFishGsonDaggerHilt.CatchingFishWorkManager(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.CatchingFishViewModelFAB) {
            this.CatchingFishViewModelScope = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        CatchingFishGsonDaggerHilt catchingFishGsonDaggerHilt = this.CatchingFishLayout;
        if (catchingFishGsonDaggerHilt != null) {
            Context context = this.CatchingFishDaggerWebsocket;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            CatchingFishIntentAndroidX catchingFishIntentAndroidX = new CatchingFishIntentAndroidX();
            catchingFishIntentAndroidX.CatchingFishParcelableFAB = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                catchingFishIntentAndroidX.CatchingFishSnackbar = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                CatchingFishEspressoJUnit.CatchingFishParcelableFAB((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            catchingFishGsonDaggerHilt.CatchingFishStateLiveData(catchingFishIntentAndroidX);
        }
    }
}
