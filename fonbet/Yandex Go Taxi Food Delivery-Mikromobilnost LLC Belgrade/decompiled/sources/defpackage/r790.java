package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes13.dex */
public final class r790 extends x3 {
    public final boolean c;

    public r790(w040 w040Var, boolean z) {
        super(12, w040Var);
        this.c = z;
    }

    @Override // defpackage.x3
    public final x3 Mg(n790 n790Var) {
        Window window;
        w040 w040Var = (w040) this.b;
        boolean z = n790Var instanceof j790;
        long j = this.c ? 1000L : 0L;
        h7o h7oVar = (h7o) w040Var.g;
        uhm uhmVar = h7oVar.j;
        Handler handler = h7oVar.e;
        h7oVar.a().setDialogTitle(z ? h7oVar.f : h7oVar.g);
        h7oVar.a().setActionButtonVisible(true);
        handler.removeCallbacksAndMessages(null);
        if (j > 0) {
            handler.postDelayed(uhmVar, j);
        } else {
            uhmVar.run();
        }
        Activity c = sqb1.c((Context) w040Var.a);
        View decorView = (c == null || (window = c.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.setForeground(null);
        }
        return new o790(w040Var, n790Var);
    }

    @Override // defpackage.x3
    public final x3 Ng(String str) {
        Window window;
        w040 w040Var = (w040) this.b;
        String str2 = ((ss2) w040Var.f).c;
        if (str != null && mt71.l(str).equals(str2)) {
            return this;
        }
        ujf0 ujf0Var = (ujf0) w040Var.c;
        if (ujf0Var instanceof rjf0) {
            rjf0 rjf0Var = (rjf0) ujf0Var;
            oj91.b(rjf0Var.a);
            oj91.b(rjf0Var.b).withStartAction(new op70(14, this));
        } else if (ujf0Var instanceof tjf0) {
            oj91.b(((tjf0) ujf0Var).a).withStartAction(new op70(14, this));
        }
        Activity c = sqb1.c((Context) w040Var.a);
        View decorView = (c == null || (window = c.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.setForeground(null);
        }
        return new p790(12, w040Var);
    }
}
