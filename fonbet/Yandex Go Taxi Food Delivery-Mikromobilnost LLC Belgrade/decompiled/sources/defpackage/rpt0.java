package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.summary.domain.f;
import java.util.LinkedList;
import ru.yandex.taxi.preorder.source.domain.p;

/* loaded from: classes6.dex */
public final class rpt0 implements qpt0 {
    public final mhf a;
    public final yvf0 b;
    public final cgt0 c;
    public final w030 d;
    public final oft0 e;
    public final p f;
    public final bwx0 g;
    public final git0 h;
    public final oep0 i;
    public f j;

    public rpt0(mhf mhfVar, yvf0 yvf0Var, cgt0 cgt0Var, w030 w030Var, oft0 oft0Var, p pVar, bwx0 bwx0Var, git0 git0Var, oep0 oep0Var) {
        this.a = mhfVar;
        this.b = yvf0Var;
        this.c = cgt0Var;
        this.d = w030Var;
        this.e = oft0Var;
        this.f = pVar;
        this.g = bwx0Var;
        this.h = git0Var;
        this.i = oep0Var;
    }

    public final void b(lv90 lv90Var, String str) {
        f fVar = this.j;
        if (fVar != null) {
            fVar.i();
            this.j = null;
        }
        git0 git0Var = this.h;
        if (git0Var.a.w.a(Lifecycle.State.STARTED)) {
            Screen b = this.a.b();
            g18 g = this.d.g(new ka00(3, this));
            f fVar2 = (f) this.b.get();
            this.j = fVar2;
            ((pep0) this.i).f(new uva(11, fVar2, new xlp0(13, this, b, g)), new tjv0(new zlx0(str), lv90Var), hxx.a);
            LinkedList linkedList = this.e.a;
            nft0.a.getClass();
            linkedList.push(nft0.b);
            cey.b(git0Var.a, Lifecycle.Event.ON_STOP, new m8t0(15, this));
        }
    }
}
