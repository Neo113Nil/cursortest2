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
import com.google.android.gms.internal.ads.C2712Ol;
import com.icefishing.icefishinglive2.C5275R;
import g.AbstractC4518a;
import k.C4617d;
import l.ViewTreeObserverOnGlobalLayoutListenerC4647d;

/* loaded from: classes.dex */
public final class O extends Spinner {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f39044B = {R.attr.spinnerMode};

    /* renamed from: A, reason: collision with root package name */
    public final Rect f39045A;

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39046n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f39047u;

    /* renamed from: v, reason: collision with root package name */
    public final C4673G f39048v;

    /* renamed from: w, reason: collision with root package name */
    public SpinnerAdapter f39049w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39050x;

    /* renamed from: y, reason: collision with root package name */
    public final N f39051y;

    /* renamed from: z, reason: collision with root package name */
    public int f39052z;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f39045A = new Rect();
        N0.a(getContext(), this);
        int[] iArr = AbstractC4518a.f37608v;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, C5275R.attr.spinnerStyle);
        this.f39046n = new C2712Ol(this);
        TypedArray typedArray2 = (TypedArray) s9.f38405v;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f39047u = new C4617d(context, resourceId);
        } else {
            this.f39047u = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f39044B, C5275R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e9) {
                    e = e9;
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
        } catch (Exception e10) {
            e = e10;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            I i6 = new I(this);
            this.f39051y = i6;
            i6.f39010v = typedArray2.getString(2);
        } else if (i == 1) {
            L l9 = new L(this, this.f39047u, attributeSet);
            j4.g s10 = j4.g.s(this.f39047u, attributeSet, iArr, C5275R.attr.spinnerStyle);
            this.f39052z = ((TypedArray) s10.f38405v).getLayoutDimension(3, -2);
            l9.setBackgroundDrawable(s10.i(1));
            l9.f39032V = typedArray2.getString(2);
            s10.t();
            this.f39051y = l9;
            this.f39048v = new C4673G(this, this, l9);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(C5275R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        s9.t();
        this.f39050x = true;
        SpinnerAdapter spinnerAdapter = this.f39049w;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f39049w = null;
        }
        this.f39046n.d(attributeSet, C5275R.attr.spinnerStyle);
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
        int i6 = 0;
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
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i6;
        }
        Rect rect = this.f39045A;
        drawable.getPadding(rect);
        return rect.left + rect.right + i6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        N n9 = this.f39051y;
        return n9 != null ? n9.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        N n9 = this.f39051y;
        return n9 != null ? n9.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f39051y != null ? this.f39052z : super.getDropDownWidth();
    }

    public final N getInternalPopup() {
        return this.f39051y;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        N n9 = this.f39051y;
        return n9 != null ? n9.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f39047u;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        N n9 = this.f39051y;
        return n9 != null ? n9.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N n9 = this.f39051y;
        if (n9 == null || !n9.a()) {
            return;
        }
        n9.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        if (this.f39051y == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        M m4 = (M) parcelable;
        super.onRestoreInstanceState(m4.getSuperState());
        if (!m4.f39036n || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4647d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        M m4 = new M(super.onSaveInstanceState());
        N n9 = this.f39051y;
        m4.f39036n = n9 != null && n9.a();
        return m4;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4673G c4673g = this.f39048v;
        if (c4673g == null || !c4673g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        N n9 = this.f39051y;
        if (n9 == null) {
            return super.performClick();
        }
        if (n9.a()) {
            return true;
        }
        this.f39051y.j(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        N n9 = this.f39051y;
        if (n9 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            n9.i(i);
            n9.d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        N n9 = this.f39051y;
        if (n9 != null) {
            n9.h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f39051y != null) {
            this.f39052z = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        N n9 = this.f39051y;
        if (n9 != null) {
            n9.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(com.bumptech.glide.g.e(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        N n9 = this.f39051y;
        if (n9 != null) {
            n9.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39046n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f39050x) {
            this.f39049w = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        N n9 = this.f39051y;
        if (n9 != null) {
            Context context = this.f39047u;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            J j6 = new J();
            j6.f39020a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                j6.f39021b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC4674H.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n9.m(j6);
        }
    }
}
