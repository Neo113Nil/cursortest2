package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.response.Instruction;
import ru.yandex.taxi.checkin.CheckInOnboardingModalView;

/* loaded from: classes5.dex */
public final class ufb {
    public final w030 a;
    public final v920 b;

    public ufb(w030 w030Var, v920 v920Var) {
        this.a = w030Var;
        this.b = v920Var;
    }

    public final void a(j37 j37Var, Instruction instruction) {
        v920 v920Var = this.b;
        v920Var.getClass();
        this.a.s(new CheckInOnboardingModalView((Context) v920Var.a, (k7x0) v920Var.b, (pav) v920Var.c, (rfb) v920Var.w, (yvf0) v920Var.x, (oep0) v920Var.y, instruction, j37Var), true);
    }
}
