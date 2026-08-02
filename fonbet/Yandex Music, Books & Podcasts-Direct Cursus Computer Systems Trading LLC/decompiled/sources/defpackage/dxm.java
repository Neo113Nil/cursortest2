package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class dxm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ exm b;

    public /* synthetic */ dxm(exm exmVar, int i) {
        this.a = i;
        this.b = exmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1959300924, new dxm(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    gdg.l((a) this.b.j.getValue(), d.c(vci.a, 1.0f), oq5Var2, 48);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
