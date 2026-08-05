package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.B1cjorwa;
import defpackage.cs;
import defpackage.dHozS53r;
import defpackage.e50;
import defpackage.orhfF2Ya;
import defpackage.qs;
import defpackage.w;
import defpackage.xr;
import defpackage.yr;
import defpackage.z00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends w implements qs, View.OnClickListener, B1cjorwa {
    public final int KlHjfFWx;
    public orhfF2Ya OnDfzHZD;
    public final int OxcuoDLp;
    public int amk52bBQ;
    public CharSequence eVhOlqcC;
    public cs jb9XjC4I;
    public Drawable k3x7lurq;
    public boolean lDXGDhIF;
    public xr ow5vqvCr;
    public boolean sjUBp5pO;
    public dHozS53r ygLcUYwZ;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.lDXGDhIF = b2ZJblxo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.MdtA4re8, 0, 0);
        this.OxcuoDLp = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.KlHjfFWx = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.amk52bBQ = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.B1cjorwa
    public final boolean MdtA4re8() {
        return !TextUtils.isEmpty(getText()) && this.jb9XjC4I.getIcon() == null;
    }

    @Override // defpackage.B1cjorwa
    public final boolean NCTxEWno() {
        return !TextUtils.isEmpty(getText());
    }

    public final void Qr9iLBAD() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.eVhOlqcC);
        if (this.k3x7lurq != null && ((this.jb9XjC4I.WYNAV5pd & 4) != 4 || (!this.lDXGDhIF && !this.sjUBp5pO))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.eVhOlqcC : null);
        CharSequence charSequence = this.jb9XjC4I.OxcuoDLp;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.jb9XjC4I.VgvYg0wo);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.jb9XjC4I.amk52bBQ;
        if (TextUtils.isEmpty(charSequence2)) {
            e50.ygLcUYwZ(this, z3 ? null : this.jb9XjC4I.VgvYg0wo);
        } else {
            e50.ygLcUYwZ(this, charSequence2);
        }
    }

    public final boolean b2ZJblxo() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.qs
    public cs getItemData() {
        return this.jb9XjC4I;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xr xrVar = this.ow5vqvCr;
        if (xrVar != null) {
            xrVar.qoPGr6Ce(this.jb9XjC4I);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.lDXGDhIF = b2ZJblxo();
        Qr9iLBAD();
    }

    @Override // defpackage.w, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.amk52bBQ) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.OxcuoDLp;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.k3x7lurq == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.k3x7lurq.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        orhfF2Ya orhff2ya;
        if (this.jb9XjC4I.hasSubMenu() && (orhff2ya = this.OnDfzHZD) != null && orhff2ya.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.qs
    public final void qoPGr6Ce(cs csVar) {
        this.jb9XjC4I = csVar;
        setIcon(csVar.getIcon());
        setTitle(csVar.getTitleCondensed());
        setId(csVar.qoPGr6Ce);
        setVisibility(csVar.isVisible() ? 0 : 8);
        setEnabled(csVar.isEnabled());
        if (csVar.hasSubMenu() && this.OnDfzHZD == null) {
            this.OnDfzHZD = new orhfF2Ya(this);
        }
    }

    public void setExpandedFormat(boolean z) {
        if (this.sjUBp5pO != z) {
            this.sjUBp5pO = z;
            cs csVar = this.jb9XjC4I;
            if (csVar != null) {
                yr yrVar = csVar.ygLcUYwZ;
                yrVar.k3x7lurq = true;
                yrVar.sjUBp5pO(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.k3x7lurq = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.KlHjfFWx;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        Qr9iLBAD();
    }

    public void setItemInvoker(xr xrVar) {
        this.ow5vqvCr = xrVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.amk52bBQ = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(dHozS53r dhozs53r) {
        this.ygLcUYwZ = dhozs53r;
    }

    public void setTitle(CharSequence charSequence) {
        this.eVhOlqcC = charSequence;
        Qr9iLBAD();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
