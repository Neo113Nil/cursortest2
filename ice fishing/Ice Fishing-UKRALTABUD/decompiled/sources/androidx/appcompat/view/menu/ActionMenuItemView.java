package androidx.appcompat.view.menu;

import a.AbstractC0069a;
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
import c.AbstractC0097a;
import g.AbstractC0142b;
import g.ViewOnTouchListenerC0141a;
import g.i;
import g.j;
import g.k;
import g.q;
import h.C0176u;
import h.InterfaceC0166j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0176u implements q, View.OnClickListener, InterfaceC0166j {

    /* renamed from: j, reason: collision with root package name */
    public k f1078j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1079k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1080l;

    /* renamed from: m, reason: collision with root package name */
    public i f1081m;

    /* renamed from: n, reason: collision with root package name */
    public ViewOnTouchListenerC0141a f1082n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0142b f1083o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1084p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1085q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public int f1086s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1087t;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1084p = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1631c, 0, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1087t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1086s = -1;
        setSaveEnabled(false);
    }

    @Override // h.InterfaceC0166j
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.f1078j.getIcon() == null;
    }

    @Override // h.InterfaceC0166j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // g.q
    public final void c(k kVar) {
        this.f1078j = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f1985a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1082n == null) {
            this.f1082n = new ViewOnTouchListenerC0141a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1079k);
        if (this.f1080l != null && ((this.f1078j.f2008y & 4) != 4 || (!this.f1084p && !this.f1085q))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1079k : null);
        CharSequence charSequence = this.f1078j.f2001q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1078j.f1989e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1078j.r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0069a.F(this, z4 ? null : this.f1078j.f1989e);
        } else {
            AbstractC0069a.F(this, charSequence2);
        }
    }

    @Override // g.q
    public k getItemData() {
        return this.f1078j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f1081m;
        if (iVar != null) {
            iVar.a(this.f1078j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1084p = e();
        f();
    }

    @Override // h.C0176u, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1086s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.r;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1080l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1080l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0141a viewOnTouchListenerC0141a;
        if (this.f1078j.hasSubMenu() && (viewOnTouchListenerC0141a = this.f1082n) != null && viewOnTouchListenerC0141a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1085q != z2) {
            this.f1085q = z2;
            k kVar = this.f1078j;
            if (kVar != null) {
                j jVar = kVar.f1998n;
                jVar.f1974k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1080l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1087t;
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
        this.f1081m = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1086s = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0142b abstractC0142b) {
        this.f1083o = abstractC0142b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1079k = charSequence;
        f();
    }
}
