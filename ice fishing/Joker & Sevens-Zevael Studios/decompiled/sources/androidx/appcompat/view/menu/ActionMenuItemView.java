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
import l.a;
import l.b;
import l.g;
import l.h;
import l.i;
import l.o;
import m.j;
import m.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends v implements o, View.OnClickListener, j {

    /* renamed from: l, reason: collision with root package name */
    public i f352l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f353m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f354n;

    /* renamed from: o, reason: collision with root package name */
    public g f355o;

    /* renamed from: p, reason: collision with root package name */
    public a f356p;

    /* renamed from: q, reason: collision with root package name */
    public b f357q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f358r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f359s;

    /* renamed from: t, reason: collision with root package name */
    public final int f360t;

    /* renamed from: u, reason: collision with root package name */
    public int f361u;

    /* renamed from: v, reason: collision with root package name */
    public final int f362v;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f358r = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f2912c, 0, 0);
        this.f360t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f362v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f361u = -1;
        setSaveEnabled(false);
    }

    @Override // m.j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.o
    public final void b(i iVar) {
        this.f352l = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.f3710a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f356p == null) {
            this.f356p = new a(this);
        }
    }

    @Override // m.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f352l.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f353m);
        if (this.f354n != null && ((this.f352l.f3734y & 4) != 4 || (!this.f358r && !this.f359s))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f353m : null);
        CharSequence charSequence = this.f352l.f3726q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f352l.f3714e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f352l.f3727r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z12 ? null : this.f352l.f3714e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // l.o
    public i getItemData() {
        return this.f352l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.f355o;
        if (gVar != null) {
            gVar.a(this.f352l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f358r = d();
        e();
    }

    @Override // m.v, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i12 = this.f361u) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f360t;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!isEmpty || this.f354n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f354n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f352l.hasSubMenu() && (aVar = this.f356p) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f359s != z10) {
            this.f359s = z10;
            i iVar = this.f352l;
            if (iVar != null) {
                h hVar = iVar.f3723n;
                hVar.f3700k = true;
                hVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f354n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f362v;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(g gVar) {
        this.f355o = gVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f361u = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f357q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f353m = charSequence;
        e();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
