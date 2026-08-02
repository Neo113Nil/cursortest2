package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class g3k extends i7g {
    public final /* synthetic */ h3k q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3k(h3k h3kVar, Context context) {
        super(context);
        this.q = h3kVar;
    }

    @Override // defpackage.i7g
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.i7g
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.i7g
    public final void j(View view, us2 us2Var) {
        h3k h3kVar = this.q;
        int[] b = h3kVar.b(h3kVar.a.getLayoutManager(), view);
        int i = b[0];
        int i2 = b[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            us2Var.b = i;
            us2Var.c = i2;
            us2Var.d = ceil;
            us2Var.h = this.j;
            us2Var.f = true;
        }
    }
}
