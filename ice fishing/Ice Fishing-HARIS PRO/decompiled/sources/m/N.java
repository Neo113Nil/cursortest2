package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.lumenpath.harispro.hrnavigator.R;
import l.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* loaded from: classes.dex */
public final class N extends E0 implements P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3855C;

    /* renamed from: D, reason: collision with root package name */
    public L f3856D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3857E;

    /* renamed from: F, reason: collision with root package name */
    public int f3858F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Q f3859G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3859G = q2;
        this.f3857E = new Rect();
        this.f3817o = q2;
        this.f3827y = true;
        this.f3828z.setFocusable(true);
        this.f3818p = new V0.u(2, this);
    }

    @Override // m.P
    public final CharSequence b() {
        return this.f3855C;
    }

    @Override // m.P
    public final void h(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0236B c0236b = this.f3828z;
        boolean isShowing = c0236b.isShowing();
        s();
        this.f3828z.setInputMethodMode(2);
        c();
        C0276r0 c0276r0 = this.f3808c;
        c0276r0.setChoiceMode(1);
        c0276r0.setTextDirection(i);
        c0276r0.setTextAlignment(i2);
        Q q2 = this.f3859G;
        int selectedItemPosition = q2.getSelectedItemPosition();
        C0276r0 c0276r02 = this.f3808c;
        if (c0236b.isShowing() && c0276r02 != null) {
            c0276r02.setListSelectionHidden(false);
            c0276r02.setSelection(selectedItemPosition);
            if (c0276r02.getChoiceMode() != 0) {
                c0276r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = q2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0220d viewTreeObserverOnGlobalLayoutListenerC0220d = new ViewTreeObserverOnGlobalLayoutListenerC0220d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0220d);
        this.f3828z.setOnDismissListener(new M(this, viewTreeObserverOnGlobalLayoutListenerC0220d));
    }

    @Override // m.P
    public final void j(CharSequence charSequence) {
        this.f3855C = charSequence;
    }

    @Override // m.E0, m.P
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f3856D = (L) listAdapter;
    }

    @Override // m.P
    public final void p(int i) {
        this.f3858F = i;
    }

    public final void s() {
        int i;
        C0236B c0236b = this.f3828z;
        Drawable background = c0236b.getBackground();
        Q q2 = this.f3859G;
        if (background != null) {
            background.getPadding(q2.f3874h);
            boolean z2 = h1.f3952a;
            int layoutDirection = q2.getLayoutDirection();
            Rect rect = q2.f3874h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = q2.f3874h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = q2.getPaddingLeft();
        int paddingRight = q2.getPaddingRight();
        int width = q2.getWidth();
        int i2 = q2.f3873g;
        if (i2 == -2) {
            int a2 = q2.a(this.f3856D, c0236b.getBackground());
            int i3 = q2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = q2.f3874h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z3 = h1.f3952a;
        this.f3810f = q2.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.f3858F) + i : paddingLeft + this.f3858F + i;
    }
}
