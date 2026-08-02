package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.concert.ConcertActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g41 b;
    public final /* synthetic */ thj c;
    public final /* synthetic */ r21 d;

    public /* synthetic */ f41(g41 g41Var, thj thjVar, r21 r21Var, int i) {
        this.a = i;
        this.b = g41Var;
        this.c = thjVar;
        this.d = r21Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        r21 r21Var = this.d;
        thj thjVar = this.c;
        g41 g41Var = this.b;
        switch (i) {
            case 0:
                rmb.j(g41Var.d, wjb.ConcertScreen, thjVar, null, 12);
                i41 i41Var = g41Var.b;
                us5 us5Var = r21Var.a;
                i41Var.getClass();
                t tVar = i41Var.a;
                int i2 = ConcertActivity.w0;
                y7g.O(tVar, bkp.j0(tVar, us5Var.a, i41Var.b));
                break;
            default:
                rmb.j(g41Var.d, wjb.ConcertPurchaseScreen, thjVar, null, 12);
                i41 i41Var2 = g41Var.b;
                us5 us5Var2 = r21Var.a;
                i41Var2.getClass();
                String str2 = us5Var2.n;
                if (str2 != null && (str = (String) avf.R(str2)) != null) {
                    a0g.D(i41Var2.a, us5Var2.a, str);
                }
                break;
        }
        return Unit.a;
    }
}
