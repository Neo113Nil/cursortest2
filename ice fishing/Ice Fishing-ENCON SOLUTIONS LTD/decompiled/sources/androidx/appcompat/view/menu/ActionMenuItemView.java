package androidx.appcompat.view.menu;

import a.AbstractC0083a;
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
import c.AbstractC0131a;
import g.a;
import g.b;
import g.i;
import g.j;
import g.k;
import g.q;
import h.C0223t;
import h.InterfaceC0214j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0223t implements q, View.OnClickListener, InterfaceC0214j {

    /* renamed from: e, reason: collision with root package name */
    public k f2039e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2040f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f2041g;

    /* renamed from: h, reason: collision with root package name */
    public i f2042h;

    /* renamed from: i, reason: collision with root package name */
    public a f2043i;

    /* renamed from: j, reason: collision with root package name */
    public b f2044j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2045k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2046l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2047m;

    /* renamed from: n, reason: collision with root package name */
    public int f2048n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2049o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f2045k = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2620c, 0, 0);
        this.f2047m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f2049o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2048n = -1;
        setSaveEnabled(false);
    }

    @Override // h.InterfaceC0214j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // h.InterfaceC0214j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f2039e.getIcon() == null;
    }

    @Override // g.q
    public final void c(k kVar) {
        this.f2039e = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f3072a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f2043i == null) {
            this.f2043i = new a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f2040f);
        if (this.f2041g != null && ((this.f2039e.f3095y & 4) != 4 || (!this.f2045k && !this.f2046l))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f2040f : null);
        CharSequence charSequence = this.f2039e.f3088q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f2039e.f3076e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2039e.f3089r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0083a.q(this, z4 ? null : this.f2039e.f3076e);
        } else {
            AbstractC0083a.q(this, charSequence2);
        }
    }

    @Override // g.q
    public k getItemData() {
        return this.f2039e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f2042h;
        if (iVar != null) {
            iVar.a(this.f2039e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2045k = e();
        f();
    }

    @Override // h.C0223t, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f2048n) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f2047m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f2041g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2041g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f2039e.hasSubMenu() && (aVar = this.f2043i) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f2046l != z2) {
            this.f2046l = z2;
            k kVar = this.f2039e;
            if (kVar != null) {
                j jVar = kVar.f3085n;
                jVar.f3061k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2041g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f2049o;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(i iVar) {
        this.f2042h = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f2048n = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f2044j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2040f = charSequence;
        f();
    }
}
