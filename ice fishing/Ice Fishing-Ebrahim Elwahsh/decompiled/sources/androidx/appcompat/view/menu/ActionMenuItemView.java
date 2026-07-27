package androidx.appcompat.view.menu;

import K3.b;
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
import g.AbstractC4518a;
import l.AbstractC4675c;
import l.C4674b;
import l.k;
import l.l;
import l.n;
import l.y;
import m.InterfaceC4745l;
import m.Z;

/* loaded from: classes.dex */
public class ActionMenuItemView extends Z implements y, View.OnClickListener, InterfaceC4745l {

    /* renamed from: A, reason: collision with root package name */
    public n f4588A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4589B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f4590C;

    /* renamed from: D, reason: collision with root package name */
    public k f4591D;

    /* renamed from: E, reason: collision with root package name */
    public C4674b f4592E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC4675c f4593F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4594G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4595H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4596I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4597K;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4594G = k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37820c, 0, 0);
        this.f4596I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4597K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC4745l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.y
    public final void b(n nVar) {
        this.f4588A = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f38993n);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f4592E == null) {
            this.f4592E = new C4674b(this);
        }
    }

    @Override // m.InterfaceC4745l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f4588A.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.y
    public n getItemData() {
        return this.f4588A;
    }

    public final boolean k() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void n() {
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f4589B);
        if (this.f4590C != null && ((this.f4588A.f38988R & 4) != 4 || (!this.f4594G && !this.f4595H))) {
            z8 = false;
        }
        boolean z10 = z9 & z8;
        setText(z10 ? this.f4589B : null);
        CharSequence charSequence = this.f4588A.J;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z10 ? null : this.f4588A.f38997x);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4588A.f38981K;
        if (TextUtils.isEmpty(charSequence2)) {
            b.B(this, z10 ? null : this.f4588A.f38997x);
        } else {
            b.B(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f4591D;
        if (kVar != null) {
            kVar.a(this.f4588A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4594G = k();
        n();
    }

    @Override // m.Z, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i9;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i9 = this.J) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f4596I;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f4590C == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4590C.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4674b c4674b;
        if (this.f4588A.hasSubMenu() && (c4674b = this.f4592E) != null && c4674b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f4595H != z8) {
            this.f4595H = z8;
            n nVar = this.f4588A;
            if (nVar != null) {
                l lVar = nVar.f38978G;
                lVar.f38949D = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4590C = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4597K;
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
        n();
    }

    public void setItemInvoker(k kVar) {
        this.f4591D = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i9, int i10) {
        this.J = i;
        super.setPadding(i, i4, i9, i10);
    }

    public void setPopupCallback(AbstractC4675c abstractC4675c) {
        this.f4593F = abstractC4675c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4589B = charSequence;
        n();
    }
}
