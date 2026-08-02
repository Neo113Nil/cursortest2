package androidx.appcompat.view.menu;

import A8.b;
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
import g.AbstractC4528a;
import l.AbstractC4657c;
import l.C4656b;
import l.l;
import l.m;
import l.o;
import l.z;
import m.InterfaceC4710l;
import m.Z;

/* loaded from: classes.dex */
public class ActionMenuItemView extends Z implements z, View.OnClickListener, InterfaceC4710l {

    /* renamed from: A, reason: collision with root package name */
    public o f4441A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4442B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f4443C;

    /* renamed from: D, reason: collision with root package name */
    public l f4444D;

    /* renamed from: E, reason: collision with root package name */
    public C4656b f4445E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC4657c f4446F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4447G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4448H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4449I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4450K;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4447G = k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37552c, 0, 0);
        this.f4449I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4450K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC4710l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.z
    public final void b(o oVar) {
        this.f4441A = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f38778n);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f4445E == null) {
            this.f4445E = new C4656b(this);
        }
    }

    @Override // m.InterfaceC4710l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f4441A.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.z
    public o getItemData() {
        return this.f4441A;
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

    public final void m() {
        boolean z6 = true;
        boolean z9 = !TextUtils.isEmpty(this.f4442B);
        if (this.f4443C != null && ((this.f4441A.f38773R & 4) != 4 || (!this.f4447G && !this.f4448H))) {
            z6 = false;
        }
        boolean z10 = z9 & z6;
        setText(z10 ? this.f4442B : null);
        CharSequence charSequence = this.f4441A.J;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z10 ? null : this.f4441A.f38782x);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4441A.f38766K;
        if (TextUtils.isEmpty(charSequence2)) {
            b.v(this, z10 ? null : this.f4441A.f38782x);
        } else {
            b.v(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f4444D;
        if (lVar != null) {
            lVar.a(this.f4441A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4447G = k();
        m();
    }

    @Override // m.Z, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.J) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f4449I;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f4443C == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4443C.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4656b c4656b;
        if (this.f4441A.hasSubMenu() && (c4656b = this.f4445E) != null && c4656b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f4448H != z6) {
            this.f4448H = z6;
            o oVar = this.f4441A;
            if (oVar != null) {
                m mVar = oVar.f38763G;
                mVar.f38734D = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4443C = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4450K;
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
        m();
    }

    public void setItemInvoker(l lVar) {
        this.f4444D = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i6, int i9) {
        this.J = i;
        super.setPadding(i, i4, i6, i9);
    }

    public void setPopupCallback(AbstractC4657c abstractC4657c) {
        this.f4446F = abstractC4657c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4442B = charSequence;
        m();
    }
}
