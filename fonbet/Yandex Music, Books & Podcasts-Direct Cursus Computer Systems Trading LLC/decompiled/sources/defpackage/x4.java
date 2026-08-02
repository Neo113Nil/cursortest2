package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class x4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComposeView b;
    public final /* synthetic */ y4 c;

    public /* synthetic */ x4(ComposeView composeView, y4 y4Var, int i) {
        this.a = i;
        this.b = composeView;
        this.c = y4Var;
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
                    pd.b(new qzm[0], false, ild.C(-1429075427, new x4(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        Context context = this.b.getContext();
                        context.getClass();
                        K = new t4(context, new z3(3, this.c));
                        oq5Var2.k0(K);
                    }
                    etn.a((t4) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
