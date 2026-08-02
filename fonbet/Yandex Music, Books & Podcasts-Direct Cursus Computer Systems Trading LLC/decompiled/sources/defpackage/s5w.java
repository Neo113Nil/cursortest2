package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class s5w extends won {
    public final int a;
    public final cc9 b;
    public final cb9 c;

    public s5w(int i, cc9 cc9Var, cb9 cb9Var) {
        this.a = i;
        this.b = cc9Var;
        this.c = cb9Var;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        View child;
        float f;
        int b;
        int b2;
        int width = recyclerView.getWidth();
        cc9 cc9Var = this.b;
        float f2 = cc9Var.g;
        float f3 = cc9Var.h;
        view.measure(View.MeasureSpec.makeMeasureSpec(width - eeh.b(cc9Var.c + cc9Var.e), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight() - eeh.b(cc9Var.d + cc9Var.f), 1073741824));
        ec9 ec9Var = view instanceof ec9 ? (ec9) view : null;
        if (ec9Var == null || (child = ec9Var.getChild()) == null) {
            return;
        }
        Integer num = cc9Var.i;
        int intValue = num != null ? num.intValue() : i(child);
        Integer num2 = cc9Var.j;
        cb9 cb9Var = this.c;
        int i = this.a;
        if (num2 != null) {
            b = num2.intValue();
        } else {
            int ordinal = cb9Var.ordinal();
            if (ordinal == 0) {
                f = f2;
            } else if (ordinal == 1) {
                f = (i - child.getMeasuredHeight()) / 2.0f;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                f = (i - f3) - child.getMeasuredHeight();
            }
            b = eeh.b(f);
        }
        Integer num3 = cc9Var.k;
        int intValue2 = num3 != null ? num3.intValue() : i(child);
        Integer num4 = cc9Var.l;
        if (num4 != null) {
            b2 = num4.intValue();
        } else {
            int ordinal2 = cb9Var.ordinal();
            if (ordinal2 == 0) {
                f3 = (i - f2) - child.getMeasuredHeight();
            } else if (ordinal2 == 1) {
                f3 = (i - child.getMeasuredHeight()) / 2.0f;
            } else if (ordinal2 != 2) {
                b6e.s();
                return;
            }
            b2 = eeh.b(f3);
        }
        rect.set(intValue, b, intValue2, b2);
    }

    public final int i(View view) {
        float f;
        int measuredWidth;
        float f2;
        int ordinal = this.c.ordinal();
        cc9 cc9Var = this.b;
        int i = this.a;
        if (ordinal == 0) {
            f = i - cc9Var.g;
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (ordinal == 1) {
                f2 = (i - view.getMeasuredWidth()) / 2.0f;
                return eeh.b(f2);
            }
            if (ordinal != 2) {
                b6e.s();
                return 0;
            }
            f = i - cc9Var.h;
            measuredWidth = view.getMeasuredWidth();
        }
        f2 = f - measuredWidth;
        return eeh.b(f2);
    }
}
