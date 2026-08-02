package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ContextThemeWrapper;

/* loaded from: classes6.dex */
public final class v7t0 implements dbx0 {
    public final zuj0 a;
    public final Rect b;
    public final float c;

    public v7t0(zuj0 zuj0Var) {
        this.a = zuj0Var;
        Rect rect = new Rect();
        this.b = rect;
        rect.top = ((avj0) zuj0Var).c(qsg0.tariff_card_top_inset_compact);
        rect.bottom = ((avj0) zuj0Var).c(qsg0.tariff_card_bottom_inset_compact);
        int c = ((avj0) zuj0Var).c(qsg0.tariff_card_side_inset_compact);
        rect.left = c;
        rect.right = c;
        this.c = ((avj0) zuj0Var).b(qsg0.tariff_card_corner_radius);
    }

    public static Drawable f(float f, int i) {
        w0d w0dVar = new w0d();
        w0dVar.a = i;
        w0dVar.h = f;
        return w0dVar.a();
    }

    @Override // defpackage.dbx0
    public final Drawable a() {
        Drawable f = f(0.0f, 0);
        Rect rect = this.b;
        InsetDrawable insetDrawable = new InsetDrawable(f, rect.left, rect.top, rect.right, rect.bottom);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.c);
        avj0 avj0Var = (avj0) this.a;
        gradientDrawable.setStroke(tje.u(1, avj0Var.a), qje.t(xng0.line, avj0Var.a));
        return new LayerDrawable(new Drawable[]{insetDrawable, gradientDrawable});
    }

    @Override // defpackage.dbx0
    public final StateListDrawable b() {
        Drawable f = f(0.0f, 0);
        Rect rect = this.b;
        InsetDrawable insetDrawable = new InsetDrawable(f, rect.left, rect.top, rect.right, rect.bottom);
        int i = wqg0.pressed_overlay;
        avj0 avj0Var = (avj0) this.a;
        int a = avj0Var.a(i);
        float f2 = this.c;
        Drawable f3 = f(f2, a);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{insetDrawable, f(f2, 0)});
        InsetDrawable insetDrawable2 = new InsetDrawable(f3, rect.left, rect.top, rect.right, rect.bottom);
        int i2 = xng0.controlMinor;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{f(f2, qje.t(xng0.bgMain, contextThemeWrapper)), f(f2, qje.t(i2, contextThemeWrapper))});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_selected}, new LayerDrawable(new Drawable[]{insetDrawable, layerDrawable2, f3}));
        LayerDrawable layerDrawable3 = new LayerDrawable(new Drawable[]{insetDrawable, layerDrawable2});
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_pressed}, insetDrawable2);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        stateListDrawable3.addState(new int[]{R.attr.state_pressed, R.attr.state_selected}, stateListDrawable);
        stateListDrawable3.addState(new int[]{R.attr.state_selected}, layerDrawable3);
        stateListDrawable3.addState(new int[]{R.attr.state_pressed}, stateListDrawable2);
        stateListDrawable3.addState(new int[0], layerDrawable);
        return stateListDrawable3;
    }

    @Override // defpackage.dbx0
    public final Drawable c() {
        Drawable t = vng.t(a1h0.ic_original_price_line, ((avj0) this.a).a);
        if (t != null) {
            return t;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.dbx0
    public final Rect e() {
        return this.b;
    }
}
