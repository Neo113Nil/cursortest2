package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class i9m implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ i9m(yci yciVar, Function0 function0, Function0 function02) {
        this.d = yciVar;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.c;
        yci yciVar = this.d;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci s = wyf.s(yciVar, function02);
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new k7m(28);
                        oq5Var.k0(K);
                    }
                    yci b = nfp.b(s, false, (Function1) K);
                    ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                    int i2 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    String M = rvf.M(R.string.bookmate_audiobook_play_button, oq5Var);
                    vci vciVar = vci.a;
                    y7g.c(M, this.c, androidx.compose.ui.platform.a.a(vciVar, "bookmate_buy_button"), null, null, 0.0f, oq5Var, 384, 56);
                    xcs.b(vz1.o(vciVar, 12, oq5Var, R.string.bookmate_audiobook_play_button_description, oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65018);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                asq.m(rvf.R(1), (hq5) obj, yciVar, function02, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                u1g.q(rvf.R(433), (hq5) obj, yciVar, function02, function0);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i9m(Function0 function0, yci yciVar, Function0 function02, int i) {
        this.b = function0;
        this.d = yciVar;
        this.c = function02;
    }

    public /* synthetic */ i9m(Function0 function0, Function0 function02, yci yciVar, int i) {
        this.b = function0;
        this.c = function02;
        this.d = yciVar;
    }
}
