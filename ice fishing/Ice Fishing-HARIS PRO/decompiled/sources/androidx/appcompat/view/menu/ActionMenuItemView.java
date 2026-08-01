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
import g.AbstractC0155a;
import l.AbstractC0219c;
import l.C0218b;
import l.InterfaceC0228l;
import l.MenuC0229m;
import l.o;
import l.z;
import m.C0245b0;
import m.InterfaceC0266m;
import m.d1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0245b0 implements z, View.OnClickListener, InterfaceC0266m {

    /* renamed from: h, reason: collision with root package name */
    public o f1745h;
    public CharSequence i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0228l f1746k;

    /* renamed from: l, reason: collision with root package name */
    public C0218b f1747l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0219c f1748m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1749n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1750o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1751p;

    /* renamed from: q, reason: collision with root package name */
    public int f1752q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1753r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1749n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3036c, 0, 0);
        this.f1751p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1753r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1752q = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0266m
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.f1745h.getIcon() == null;
    }

    @Override // m.InterfaceC0266m
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.z
    public final void c(o oVar) {
        this.f1745h = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f3736a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f1747l == null) {
            this.f1747l = new C0218b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.z
    public o getItemData() {
        return this.f1745h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.j != null && ((this.f1745h.f3757y & 4) != 4 || (!this.f1749n && !this.f1750o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.f1745h.f3749q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1745h.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1745h.f3750r;
        if (TextUtils.isEmpty(charSequence2)) {
            d1.a(this, z4 ? null : this.f1745h.e);
        } else {
            d1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0228l interfaceC0228l = this.f1746k;
        if (interfaceC0228l != null) {
            interfaceC0228l.b(this.f1745h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1749n = h();
        i();
    }

    @Override // m.C0245b0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1752q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1751p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0218b c0218b;
        if (this.f1745h.hasSubMenu() && (c0218b = this.f1747l) != null && c0218b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1750o != z2) {
            this.f1750o = z2;
            o oVar = this.f1745h;
            if (oVar != null) {
                MenuC0229m menuC0229m = oVar.f3746n;
                menuC0229m.f3716k = true;
                menuC0229m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1753r;
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
        i();
    }

    public void setItemInvoker(InterfaceC0228l interfaceC0228l) {
        this.f1746k = interfaceC0228l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1752q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0219c abstractC0219c) {
        this.f1748m = abstractC0219c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
