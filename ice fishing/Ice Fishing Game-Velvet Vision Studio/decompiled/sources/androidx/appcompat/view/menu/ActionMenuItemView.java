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
import com.gamericefishpro.space.m.a;
import com.gamericefishpro.space.m.b;
import com.gamericefishpro.space.m.h;
import com.gamericefishpro.space.m.i;
import com.gamericefishpro.space.m.p;
import com.gamericefishpro.space.n.h2;
import com.gamericefishpro.space.n.i0;
import com.gamericefishpro.space.n.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends i0 implements p, View.OnClickListener, j {
    public com.gamericefishpro.space.m.j A;
    public CharSequence B;
    public Drawable C;
    public h D;
    public a E;
    public b F;
    public boolean G;
    public boolean H;
    public final int I;
    public int J;
    public final int K;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.G = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.j.a.c, 0, 0);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J = -1;
        setSaveEnabled(false);
    }

    @Override // com.gamericefishpro.space.m.p
    public final void a(com.gamericefishpro.space.m.j jVar) {
        this.A = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.E == null) {
            this.E = new a(this);
        }
    }

    @Override // com.gamericefishpro.space.n.j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // com.gamericefishpro.space.n.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.A.getIcon() == null;
    }

    public final boolean g() {
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

    @Override // com.gamericefishpro.space.m.p
    public com.gamericefishpro.space.m.j getItemData() {
        return this.A;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.B);
        if (this.C != null && ((this.A.y & 4) != 4 || (!this.G && !this.H))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.B : null);
        CharSequence charSequence = this.A.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.A.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A.r;
        if (TextUtils.isEmpty(charSequence2)) {
            h2.a(this, z3 ? null : this.A.e);
        } else {
            h2.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.D;
        if (hVar != null) {
            hVar.b(this.A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G = g();
        h();
    }

    @Override // com.gamericefishpro.space.n.i0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.J) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.I;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.C == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.C.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.A.hasSubMenu() && (aVar = this.E) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.H != z) {
            this.H = z;
            com.gamericefishpro.space.m.j jVar = this.A;
            if (jVar != null) {
                i iVar = jVar.n;
                iVar.k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.K;
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
        h();
    }

    public void setItemInvoker(h hVar) {
        this.D = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.J = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.F = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.B = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
