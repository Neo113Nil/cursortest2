package m;

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
import g.AbstractC0155a;
import k.C0179c;
import k0.C0188b;
import l.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* loaded from: classes.dex */
public final class Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f3868a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3869b;

    /* renamed from: c, reason: collision with root package name */
    public final I f3870c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f3871d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final P f3872f;

    /* renamed from: g, reason: collision with root package name */
    public int f3873g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f3874h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f3874h = new Rect();
        Q0.a(this, getContext());
        int[] iArr = AbstractC0155a.f3051u;
        M0.h i2 = M0.h.i(context, attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.spinnerStyle);
        this.f3868a = new C0188b(this);
        TypedArray typedArray2 = (TypedArray) i2.f617c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3869b = new C0179c(context, resourceId);
        } else {
            this.f3869b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.lumenpath.harispro.hrnavigator.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i3 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i3 == 0) {
            K k2 = new K(this);
            this.f3872f = k2;
            k2.f3842c = typedArray2.getString(2);
        } else if (i3 == 1) {
            N n2 = new N(this, this.f3869b, attributeSet);
            M0.h i4 = M0.h.i(this.f3869b, attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.spinnerStyle);
            this.f3873g = ((TypedArray) i4.f617c).getLayoutDimension(3, -2);
            n2.l(i4.c(1));
            n2.f3855C = typedArray2.getString(2);
            i4.l();
            this.f3872f = n2;
            this.f3870c = new I(this, this, n2);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.lumenpath.harispro.hrnavigator.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.l();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.f3871d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f3871d = null;
        }
        this.f3868a.k(attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.spinnerStyle);
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
        Rect rect = this.f3874h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            c0188b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        P p2 = this.f3872f;
        return p2 != null ? p2.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        P p2 = this.f3872f;
        return p2 != null ? p2.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3872f != null ? this.f3873g : super.getDropDownWidth();
    }

    public final P getInternalPopup() {
        return this.f3872f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        P p2 = this.f3872f;
        return p2 != null ? p2.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3869b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        P p2 = this.f3872f;
        return p2 != null ? p2.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P p2 = this.f3872f;
        if (p2 == null || !p2.a()) {
            return;
        }
        p2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3872f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        O o2 = (O) parcelable;
        super.onRestoreInstanceState(o2.getSuperState());
        if (!o2.f3867a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0220d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        O o2 = new O(super.onSaveInstanceState());
        P p2 = this.f3872f;
        o2.f3867a = p2 != null && p2.a();
        return o2;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        I i2 = this.f3870c;
        if (i2 == null || !i2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        P p2 = this.f3872f;
        if (p2 == null) {
            return super.performClick();
        }
        if (p2.a()) {
            return true;
        }
        this.f3872f.h(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            c0188b.n(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        P p2 = this.f3872f;
        if (p2 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            p2.p(i2);
            p2.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        P p2 = this.f3872f;
        if (p2 != null) {
            p2.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3872f != null) {
            this.f3873g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        P p2 = this.f3872f;
        if (p2 != null) {
            p2.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(h0.f.n(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        P p2 = this.f3872f;
        if (p2 != null) {
            p2.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f3868a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.f3871d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        P p2 = this.f3872f;
        if (p2 != null) {
            Context context = this.f3869b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            L l2 = new L();
            l2.f3844a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l2.f3845b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p2.o(l2);
        }
    }
}
