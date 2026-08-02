package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;

/* loaded from: classes3.dex */
public abstract class zs4 {
    public static final float a = 10;

    public static final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.setClipToPadding(false);
        Context context = viewGroup.getContext();
        context.getClass();
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + ((int) d(context)));
    }

    public static final float b(jx7 jx7Var) {
        jx7Var.getClass();
        float f = a;
        float p = jx7Var.p(v7g.z(16)) + jx7Var.p(v7g.z(20)) + 8 + f + 2 + f;
        float f2 = 64;
        return p < f2 ? f2 : p;
    }

    public static final float c(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final float d(Context context) {
        return Math.max(c(context, 64.0f), c(context, 2.0f) + c(context, 8.0f) + c(context, 10.0f) + c(context, 10.0f) + TypedValue.applyDimension(2, 20.0f, context.getResources().getDisplayMetrics()) + TypedValue.applyDimension(2, 16.0f, context.getResources().getDisplayMetrics()));
    }

    public static final float e(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            oq5Var.Z(-966141400);
            oq5Var.p(false);
            return 0.0f;
        }
        oq5Var.Z(-966215304);
        float b = b((jx7) oq5Var.j(es5.h));
        oq5Var.p(false);
        return b;
    }

    public static final float f(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(2018740854);
        float n0 = ((jx7) oq5Var.j(es5.h)).n0(e(oq5Var));
        oq5Var.p(false);
        return n0;
    }

    public static final q0k g(hq5 hq5Var) {
        return a.c(0.0f, 0.0f, 0.0f, e(hq5Var), 7);
    }
}
