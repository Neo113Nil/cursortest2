package defpackage;

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
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class es0 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final jq0 a;
    public final Context b;
    public final ur0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final ds0 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r14 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, es0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public es0(@NonNull Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.h = new Rect();
        gfs.a(getContext(), this);
        int[] iArr = ken.w;
        lum W = lum.W(context, attributeSet, iArr, i2);
        TypedArray typedArray2 = (TypedArray) W.b;
        this.a = new jq0(this);
        if (theme != null) {
            this.b = new uf6(context, theme);
        } else {
            int resourceId = typedArray2.getResourceId(4, 0);
            if (resourceId != 0) {
                this.b = new uf6(context, resourceId);
            } else {
                this.b = context;
            }
        }
        ?? r14 = -1;
        TypedArray typedArray3 = null;
        try {
            if (i3 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, i, i2, 0);
                    try {
                        boolean hasValue = typedArray.hasValue(0);
                        r14 = typedArray;
                        if (hasValue) {
                            i3 = typedArray.getInt(0, 0);
                            r14 = typedArray;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r14 = typedArray;
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArray = null;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray3 != null) {
                        typedArray3.recycle();
                    }
                    throw th;
                }
                r14.recycle();
            }
            if (i3 == 0) {
                xr0 xr0Var = new xr0(this);
                this.f = xr0Var;
                xr0Var.c = typedArray2.getString(2);
            } else if (i3 == 1) {
                bs0 bs0Var = new bs0(this, this.b, attributeSet, i2);
                lum W2 = lum.W(this.b, attributeSet, iArr, i2);
                this.g = ((TypedArray) W2.b).getLayoutDimension(3, -2);
                bs0Var.q(W2.M(1));
                bs0Var.C = typedArray2.getString(2);
                W2.f0();
                this.f = bs0Var;
                this.c = new ur0(this, this, bs0Var);
            }
            CharSequence[] textArray = typedArray2.getTextArray(0);
            if (textArray != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter.setDropDownViewResource(ru.yandex.music.R.layout.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter);
            }
            W.f0();
            this.e = true;
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.d = null;
            }
            this.a.d(attributeSet, i2);
        } catch (Throwable th2) {
            th = th2;
            typedArray3 = r14;
        }
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ds0 ds0Var = this.f;
        return ds0Var != null ? ds0Var.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ds0 ds0Var = this.f;
        return ds0Var != null ? ds0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final ds0 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ds0 ds0Var = this.f;
        return ds0Var != null ? ds0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ds0 ds0Var = this.f;
        return ds0Var != null ? ds0Var.h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ds0 ds0Var = this.f;
        if (ds0Var == null || !ds0Var.a()) {
            return;
        }
        ds0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        cs0 cs0Var = (cs0) parcelable;
        super.onRestoreInstanceState(cs0Var.getSuperState());
        if (!cs0Var.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new vr0(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        cs0 cs0Var = new cs0(super.onSaveInstanceState());
        ds0 ds0Var = this.f;
        cs0Var.a = ds0Var != null && ds0Var.a();
        return cs0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ur0 ur0Var = this.c;
        if (ur0Var == null || !ur0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ds0 ds0Var = this.f;
        if (ds0Var == null) {
            return super.performClick();
        }
        if (ds0Var.a()) {
            return true;
        }
        ds0Var.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ds0 ds0Var = this.f;
        if (ds0Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            yr0 yr0Var = new yr0();
            yr0Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                yr0Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                wr0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            ds0Var.o(yr0Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        ds0 ds0Var = this.f;
        if (ds0Var == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            ds0Var.k(i2);
            ds0Var.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        ds0 ds0Var = this.f;
        if (ds0Var != null) {
            ds0Var.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ds0 ds0Var = this.f;
        if (ds0Var != null) {
            ds0Var.q(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(y2x.w(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ds0 ds0Var = this.f;
        if (ds0Var != null) {
            ds0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public es0(@NonNull Context context, int i2) {
        this(context, null, ru.yandex.music.R.attr.spinnerStyle, i2);
    }

    public es0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.spinnerStyle);
    }

    public es0(@NonNull Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public es0(@NonNull Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    public es0(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }
}
