package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ryi0 extends yjs0 {
    public final yjs0 d;
    public final ofa0 e;

    public ryi0(String str, bjs0 bjs0Var, Integer num, yjs0 yjs0Var) {
        this.d = yjs0Var;
        this.e = new ofa0(str, bjs0Var, Boolean.valueOf(num != null ? uja1.b(num.intValue()) : true));
    }

    @Override // defpackage.yjs0
    public final void b(Context context, int i, int i2, int i3, n86 n86Var) {
        ofa0 ofa0Var = this.e;
        ofa0Var.w = n86Var;
        this.d.b(context, i, i2, i3, ofa0Var);
    }

    @Override // defpackage.yjs0
    public final void c(Context context, qa10 qa10Var) {
        yjs0 yjs0Var = this.d;
        yjs0Var.a(context, qa10Var);
        d(yjs0Var.b, yjs0Var.c);
    }
}
