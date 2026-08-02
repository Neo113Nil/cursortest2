package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public final class bs0 extends y9g implements ds0 {
    public CharSequence C;
    public yr0 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ es0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(es0 es0Var, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.G = es0Var;
        this.E = new Rect();
        this.o = es0Var;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new zr0(0, this);
    }

    @Override // defpackage.ds0
    public final CharSequence h() {
        return this.C;
    }

    @Override // defpackage.ds0
    public final void i(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // defpackage.ds0
    public final void k(int i) {
        this.F = i;
    }

    @Override // defpackage.ds0
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        or0 or0Var = this.z;
        boolean isShowing = or0Var.isShowing();
        s();
        or0Var.setInputMethodMode(2);
        f();
        nra nraVar = this.c;
        nraVar.setChoiceMode(1);
        nraVar.setTextDirection(i);
        nraVar.setTextAlignment(i2);
        es0 es0Var = this.G;
        int selectedItemPosition = es0Var.getSelectedItemPosition();
        nra nraVar2 = this.c;
        if (or0Var.isShowing() && nraVar2 != null) {
            nraVar2.setListSelectionHidden(false);
            nraVar2.setSelection(selectedItemPosition);
            if (nraVar2.getChoiceMode() != 0) {
                nraVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = es0Var.getViewTreeObserver()) == null) {
            return;
        }
        vr0 vr0Var = new vr0(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(vr0Var);
        or0Var.setOnDismissListener(new as0(this, vr0Var));
    }

    @Override // defpackage.y9g, defpackage.ds0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.D = (yr0) listAdapter;
    }

    public final void s() {
        int i;
        or0 or0Var = this.z;
        Drawable background = or0Var.getBackground();
        es0 es0Var = this.G;
        Rect rect = es0Var.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = zhu.a;
            i = es0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = es0Var.getPaddingLeft();
        int paddingRight = es0Var.getPaddingRight();
        int width = es0Var.getWidth();
        int i2 = es0Var.g;
        if (i2 == -2) {
            int a = es0Var.a(this.D, or0Var.getBackground());
            int i3 = (es0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = zhu.a;
        this.f = es0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
