package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;

/* loaded from: classes6.dex */
public final class tqz0 implements x880 {
    public final /* synthetic */ x880 a;
    public final /* synthetic */ uqz0 b;
    public final /* synthetic */ SourcePointMode c;

    public tqz0(x880 x880Var, uqz0 uqz0Var, SourcePointMode sourcePointMode) {
        this.a = x880Var;
        this.b = uqz0Var;
        this.c = sourcePointMode;
    }

    @Override // defpackage.x880
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.x880
    public final void o() {
        uqz0 uqz0Var = this.b;
        uqz0Var.c.h(this.c, true, false);
        yit0 yit0Var = uqz0Var.d;
        bov0 a = uqz0Var.g.a();
        if (a == null) {
            a = bov0.e;
        }
        yit0Var.c(a);
        this.a.o();
    }
}
