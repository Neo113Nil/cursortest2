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
import g.AbstractC4518a;
import l.AbstractC4646c;
import l.C4645b;
import l.l;
import l.m;
import l.o;
import l.z;
import m.InterfaceC4697l;
import m.Z;

/* loaded from: classes.dex */
public class ActionMenuItemView extends Z implements z, View.OnClickListener, InterfaceC4697l {

    /* renamed from: A, reason: collision with root package name */
    public o f4473A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4474B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f4475C;

    /* renamed from: D, reason: collision with root package name */
    public l f4476D;

    /* renamed from: E, reason: collision with root package name */
    public C4645b f4477E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC4646c f4478F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4479G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4480H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4481I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4482K;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4479G = k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37590c, 0, 0);
        this.f4481I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4482K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC4697l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.z
    public final void b(o oVar) {
        this.f4473A = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f38851n);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f4477E == null) {
            this.f4477E = new C4645b(this);
        }
    }

    @Override // m.InterfaceC4697l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f4473A.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.z
    public o getItemData() {
        return this.f4473A;
    }

    public final boolean k() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i6 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void m() {
        boolean z3 = true;
        boolean z6 = !TextUtils.isEmpty(this.f4474B);
        if (this.f4475C != null && ((this.f4473A.f38846R & 4) != 4 || (!this.f4479G && !this.f4480H))) {
            z3 = false;
        }
        boolean z9 = z6 & z3;
        setText(z9 ? this.f4474B : null);
        CharSequence charSequence = this.f4473A.J;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z9 ? null : this.f4473A.f38855x);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4473A.f38839K;
        if (TextUtils.isEmpty(charSequence2)) {
            b.t(this, z9 ? null : this.f4473A.f38855x);
        } else {
            b.t(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f4476D;
        if (lVar != null) {
            lVar.a(this.f4473A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4479G = k();
        m();
    }

    @Override // m.Z, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i6) {
        int i9;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i9 = this.J) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i6);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f4481I;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i6);
        }
        if (!isEmpty || this.f4475C == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4475C.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4645b c4645b;
        if (this.f4473A.hasSubMenu() && (c4645b = this.f4477E) != null && c4645b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f4480H != z3) {
            this.f4480H = z3;
            o oVar = this.f4473A;
            if (oVar != null) {
                m mVar = oVar.f38836G;
                mVar.f38807D = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4475C = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4482K;
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
        this.f4476D = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i6, int i9, int i10) {
        this.J = i;
        super.setPadding(i, i6, i9, i10);
    }

    public void setPopupCallback(AbstractC4646c abstractC4646c) {
        this.f4478F = abstractC4646c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4474B = charSequence;
        m();
    }
}
