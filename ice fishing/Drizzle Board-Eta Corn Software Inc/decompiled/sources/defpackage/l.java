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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l extends Spinner {
    public static final int[] eVhOlqcC = {R.attr.spinnerMode};
    public final Context MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public final boolean P7K7Inc8;
    public int Qr9iLBAD;
    public SpinnerAdapter VgvYg0wo;
    public final k b2ZJblxo;
    public final Rect jb9XjC4I;
    public final b wxUZMvaN;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.jb9XjC4I = new Rect();
        ic0.qoPGr6Ce(this, getContext());
        int[] iArr = z00.I5GHvsYW;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) Mq3SeTnW.MdtA4re8;
        this.NCTxEWno = new VM67d7Sv(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.MdtA4re8 = new f9(context, resourceId);
        } else {
            this.MdtA4re8 = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, eVhOlqcC, com.kolosta.rejin.jilosa.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
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
        if (i == 0) {
            e eVar = new e(this);
            this.b2ZJblxo = eVar;
            eVar.wxUZMvaN = typedArray2.getString(2);
        } else if (i == 1) {
            i iVar = new i(this, this.MdtA4re8, attributeSet);
            f0 Mq3SeTnW2 = f0.Mq3SeTnW(this.MdtA4re8, attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.spinnerStyle);
            this.Qr9iLBAD = ((TypedArray) Mq3SeTnW2.MdtA4re8).getLayoutDimension(3, -2);
            iVar.b2ZJblxo(Mq3SeTnW2.OxcuoDLp(1));
            iVar.Mq3SeTnW = typedArray2.getString(2);
            Mq3SeTnW2.SgZGMMPL();
            this.b2ZJblxo = iVar;
            this.wxUZMvaN = new b(this, this, iVar);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.kolosta.rejin.jilosa.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        Mq3SeTnW.SgZGMMPL();
        this.P7K7Inc8 = true;
        SpinnerAdapter spinnerAdapter = this.VgvYg0wo;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.VgvYg0wo = null;
        }
        this.NCTxEWno.eVhOlqcC(attributeSet, com.kolosta.rejin.jilosa.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        k kVar = this.b2ZJblxo;
        return kVar != null ? kVar.MdtA4re8() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        k kVar = this.b2ZJblxo;
        return kVar != null ? kVar.lDXGDhIF() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.b2ZJblxo != null ? this.Qr9iLBAD : super.getDropDownWidth();
    }

    public final k getInternalPopup() {
        return this.b2ZJblxo;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        k kVar = this.b2ZJblxo;
        return kVar != null ? kVar.VgvYg0wo() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.MdtA4re8;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        k kVar = this.b2ZJblxo;
        return kVar != null ? kVar.sjUBp5pO() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.Qr9iLBAD();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.jb9XjC4I();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.b2ZJblxo;
        if (kVar == null || !kVar.NCTxEWno()) {
            return;
        }
        kVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b2ZJblxo == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), qoPGr6Ce(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        if (!jVar.NCTxEWno || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new c(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        k kVar = this.b2ZJblxo;
        jVar.NCTxEWno = kVar != null && kVar.NCTxEWno();
        return jVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.wxUZMvaN;
        if (bVar == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        k kVar = this.b2ZJblxo;
        if (kVar == null) {
            return super.performClick();
        }
        if (kVar.NCTxEWno()) {
            return true;
        }
        kVar.ygLcUYwZ(getTextDirection(), getTextAlignment());
        return true;
    }

    public final int qoPGr6Ce(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.jb9XjC4I;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.P7K7Inc8) {
            this.VgvYg0wo = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        k kVar = this.b2ZJblxo;
        if (kVar != null) {
            Context context = this.MdtA4re8;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            f fVar = new f();
            fVar.qoPGr6Ce = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                fVar.NCTxEWno = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                d.qoPGr6Ce((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            kVar.OxcuoDLp(fVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.ow5vqvCr();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.OnDfzHZD(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        k kVar = this.b2ZJblxo;
        if (kVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            kVar.ow5vqvCr(i);
            kVar.OnDfzHZD(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        k kVar = this.b2ZJblxo;
        if (kVar != null) {
            kVar.k3x7lurq(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.b2ZJblxo != null) {
            this.Qr9iLBAD = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        k kVar = this.b2ZJblxo;
        if (kVar != null) {
            kVar.b2ZJblxo(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ra.Ey6iv0m0(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        k kVar = this.b2ZJblxo;
        if (kVar != null) {
            kVar.P7K7Inc8(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.amk52bBQ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.KlHjfFWx(mode);
        }
    }
}
