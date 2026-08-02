package defpackage;

import com.yandex.go.analytics.b;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.verticalsummary.router.c;

/* loaded from: classes14.dex */
public final class vep0 {
    public final b a;
    public final c1x0 b;
    public final qh31 c;
    public final ghd d;
    public final pev0 e;
    public final hi31 f;
    public final lh31 g;
    public final uio0 h;

    public vep0(b bVar, c1x0 c1x0Var, qh31 qh31Var, ghd ghdVar, pev0 pev0Var, hi31 hi31Var, lh31 lh31Var, uio0 uio0Var) {
        this.a = bVar;
        this.b = c1x0Var;
        this.c = qh31Var;
        this.d = ghdVar;
        this.e = pev0Var;
        this.f = hi31Var;
        this.g = lh31Var;
        this.h = uio0Var;
    }

    public static final void a(vep0 vep0Var, ph31 ph31Var, SummaryExpandReason summaryExpandReason) {
        if (summaryExpandReason != null) {
            vep0Var.d.a.d(summaryExpandReason);
        }
        hi31 hi31Var = vep0Var.f;
        hi31Var.a.g(ei31.a);
        c cVar = (c) ph31Var;
        cVar.B(new zix0(null), new uyo0(5, vep0Var));
    }
}
