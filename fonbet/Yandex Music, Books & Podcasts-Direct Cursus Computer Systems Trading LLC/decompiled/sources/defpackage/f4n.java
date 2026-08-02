package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class f4n implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e4n b;

    public /* synthetic */ f4n(e4n e4nVar) {
        this.b = e4nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e4n e4nVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    String M = rvf.M(R.string.buy_ticket_window_title, oq5Var);
                    fvf a = hvf.a(0, 0, oq5Var, 0, 3);
                    q0k a2 = a.a(0.0f, 0.0f, 3);
                    boolean h = oq5Var.h(e4nVar);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new ril(28, e4nVar);
                        oq5Var.k0(K);
                    }
                    xp3.d(M, a, null, a2, (Function0) K, null, false, false, null, null, null, ild.C(-1152876484, new tik(9, e4nVar), oq5Var), oq5Var, 3072, 48, 2020);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g0g.i(e4nVar, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f4n(e4n e4nVar, int i) {
        this.b = e4nVar;
    }
}
