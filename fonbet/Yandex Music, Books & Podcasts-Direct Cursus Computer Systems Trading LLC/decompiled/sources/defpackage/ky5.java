package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ky5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ ky5(String str, Function0 function0, int i) {
        this.c = str;
        this.b = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int R = rvf.R(1 | this.d);
                pd.i(this.c, function0, (hq5) obj, R);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges i2 = nu0.i();
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(function0);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (f || K == kjnVar) {
                    K = new g1j(12, function0);
                    oq5Var2.k0(K);
                }
                yci t = d.t(wyf.s(vci.a, (Function0) K), 0.0f, ggo.a, 1);
                String str = this.c;
                yci c = b.c(t, "state", str);
                Object K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = new i6o(20);
                    oq5Var2.k0(K2);
                }
                xv7.j(str, nfp.a(c, (Function1) K2), 0L, 0L, 0L, 3, 0L, 2, false, this.d, 0, null, i2, oq5Var2, 0, 48, 55036);
        }
        return Unit.a;
    }

    public /* synthetic */ ky5(Function0 function0, String str, int i) {
        this.b = function0;
        this.c = str;
        this.d = i;
    }
}
