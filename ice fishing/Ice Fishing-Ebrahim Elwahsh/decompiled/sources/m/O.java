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
import com.google.android.gms.internal.ads.C2728Pl;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import k.C4616d;
import l.ViewTreeObserverOnGlobalLayoutListenerC4676d;

/* loaded from: classes.dex */
public final class O extends Spinner {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f39311B = {R.attr.spinnerMode};

    /* renamed from: A, reason: collision with root package name */
    public final Rect f39312A;

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39313n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f39314u;

    /* renamed from: v, reason: collision with root package name */
    public final C4720G f39315v;

    /* renamed from: w, reason: collision with root package name */
    public SpinnerAdapter f39316w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39317x;

    /* renamed from: y, reason: collision with root package name */
    public final N f39318y;

    /* renamed from: z, reason: collision with root package name */
    public int f39319z;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f39312A = new Rect();
        N0.a(getContext(), this);
        int[] iArr = AbstractC4518a.f37838v;
        Q0 p6 = Q0.p(context, attributeSet, iArr, C5284R.attr.spinnerStyle);
        this.f39313n = new C2728Pl(this);
        TypedArray typedArray2 = (TypedArray) p6.f39326c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f39314u = new C4616d(context, resourceId);
        } else {
            this.f39314u = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f39311B, C5284R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e6) {
                    e = e6;
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
        } catch (Exception e9) {
            e = e9;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            DialogInterfaceOnClickListenerC4722I dialogInterfaceOnClickListenerC4722I = new DialogInterfaceOnClickListenerC4722I(this);
            this.f39318y = dialogInterfaceOnClickListenerC4722I;
            dialogInterfaceOnClickListenerC4722I.f39277v = typedArray2.getString(2);
        } else if (i == 1) {
            L l9 = new L(this, this.f39314u, attributeSet);
            Q0 p9 = Q0.p(this.f39314u, attributeSet, iArr, C5284R.attr.spinnerStyle);
            this.f39319z = ((TypedArray) p9.f39326c).getLayoutDimension(3, -2);
            l9.setBackgroundDrawable(p9.g(1));
            l9.f39299V = typedArray2.getString(2);
            p9.q();
            this.f39318y = l9;
            this.f39315v = new C4720G(this, this, l9);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(C5284R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        p6.q();
        this.f39317x = true;
        SpinnerAdapter spinnerAdapter = this.f39316w;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f39316w = null;
        }
        this.f39313n.d(attributeSet, C5284R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i4 = 0;
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
            i4 = Math.max(i4, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i4;
        }
        Rect rect = this.f39312A;
        drawable.getPadding(rect);
        return rect.left + rect.right + i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        N n9 = this.f39318y;
        return n9 != null ? n9.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        N n9 = this.f39318y;
        return n9 != null ? n9.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f39318y != null ? this.f39319z : super.getDropDownWidth();
    }

    public final N getInternalPopup() {
        return this.f39318y;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        N n9 = this.f39318y;
        return n9 != null ? n9.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f39314u;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        N n9 = this.f39318y;
        return n9 != null ? n9.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N n9 = this.f39318y;
        if (n9 == null || !n9.a()) {
            return;
        }
        n9.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f39318y == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        M m8 = (M) parcelable;
        super.onRestoreInstanceState(m8.getSuperState());
        if (!m8.f39303n || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4676d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        M m8 = new M(super.onSaveInstanceState());
        N n9 = this.f39318y;
        m8.f39303n = n9 != null && n9.a();
        return m8;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4720G c4720g = this.f39315v;
        if (c4720g == null || !c4720g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        N n9 = this.f39318y;
        if (n9 == null) {
            return super.performClick();
        }
        if (n9.a()) {
            return true;
        }
        this.f39318y.j(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        N n9 = this.f39318y;
        if (n9 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            n9.i(i);
            n9.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        N n9 = this.f39318y;
        if (n9 != null) {
            n9.g(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f39318y != null) {
            this.f39319z = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        N n9 = this.f39318y;
        if (n9 != null) {
            n9.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(com.bumptech.glide.f.h(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        N n9 = this.f39318y;
        if (n9 != null) {
            n9.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39313n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f39317x) {
            this.f39316w = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        N n9 = this.f39318y;
        if (n9 != null) {
            Context context = this.f39314u;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            J j9 = new J();
            j9.f39287a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                j9.f39288b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC4721H.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n9.l(j9);
        }
    }
}
