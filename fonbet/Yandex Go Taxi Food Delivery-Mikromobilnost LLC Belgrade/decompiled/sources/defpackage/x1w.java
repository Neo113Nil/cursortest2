package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: classes10.dex */
public final class x1w implements bx60 {
    public final ViewGroup a;
    public Rect b;
    public boolean c;
    public boolean w;

    public x1w(ViewGroup viewGroup, AttributeSet attributeSet) {
        this.a = viewGroup;
        this.b = xw31.h(viewGroup);
        boolean z = true;
        this.c = true;
        this.w = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.fitsSystemWindows, g4i0.InsetsAwareLayout_consumeTop, g4i0.InsetsAwareLayout_consumeBottom});
            try {
                boolean z2 = obtainStyledAttributes.getBoolean(0, true);
                this.c = obtainStyledAttributes.getBoolean(g4i0.InsetsAwareLayout_consumeTop, true);
                this.w = obtainStyledAttributes.getBoolean(g4i0.InsetsAwareLayout_consumeBottom, true);
                obtainStyledAttributes.recycle();
                z = z2;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        viewGroup.setFitsSystemWindows(z);
    }

    public final WindowInsets a(WindowInsets windowInsets, WindowInsets windowInsets2) {
        if (this.a.getFitsSystemWindows()) {
            return windowInsets;
        }
        return windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), this.c ? windowInsets2.getSystemWindowInsetTop() : windowInsets.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), this.w ? windowInsets2.getSystemWindowInsetBottom() : windowInsets.getSystemWindowInsetBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        ViewGroup viewGroup = this.a;
        if (!viewGroup.getFitsSystemWindows()) {
            Rect rect = this.b;
            ((w1w) viewGroup).setSuperPadding(rect.left, rect.top, rect.right, rect.bottom);
            return n751Var;
        }
        k751 k751Var = n751Var.a;
        u1w g = k751Var.g(519);
        u1w g2 = k751Var.g(8);
        w1w w1wVar = (w1w) viewGroup;
        int i = g.a;
        Rect rect2 = this.b;
        w1wVar.setSuperPadding(rect2.left + i, (this.c ? g.b : 0) + rect2.top, i + rect2.right, (this.w ? Math.max(g.d, g2.d) : 0) + this.b.bottom);
        n751 c = k751Var.c();
        return n751Var.f(c.b(), this.c ? c.d() : n751Var.d(), c.c(), this.w ? c.a() : n751Var.a());
    }
}
