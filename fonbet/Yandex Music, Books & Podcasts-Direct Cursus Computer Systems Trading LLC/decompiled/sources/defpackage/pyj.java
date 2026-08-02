package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pyj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wn5 e;

    public /* synthetic */ pyj(yci yciVar, Function0 function0, long j, wn5 wn5Var) {
        this.a = 1;
        this.b = yciVar;
        this.c = function0;
        this.d = j;
        this.e = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                agr agrVar = eq0.a;
                oq5 oq5Var2 = (oq5) hq5Var;
                hdg.d(this.c, ((dq0) oq5Var2.j(agrVar)).c.a, ((dq0) oq5Var2.j(agrVar)).b.a, this.d, this.b, null, false, ild.C(595491584, new j26(this.e, 8), hq5Var), hq5Var, 100663344, 192);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                agr agrVar2 = eq0.a;
                oq5 oq5Var4 = (oq5) hq5Var2;
                long j = ((dq0) oq5Var4.j(agrVar2)).b.a;
                yci d = a.d(this.b, 1.0f);
                long j2 = ((dq0) oq5Var4.j(agrVar2)).c.a;
                tgo tgoVar = ugo.a;
                yci u = xp3.u(androidx.compose.foundation.a.b(d, j2, tgoVar), tgoVar);
                pd.o(1572912, 32, j, this.d, ild.C(1370590252, new j26(this.e, 10), hq5Var2), hq5Var2, u, this.c, true, false);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                agr agrVar3 = eq0.a;
                oq5 oq5Var6 = (oq5) hq5Var3;
                hdg.c(this.c, ((dq0) oq5Var6.j(agrVar3)).c.a, ((dq0) oq5Var6.j(agrVar3)).b.a, this.d, this.b, false, ild.C(1360728007, new j26(this.e, 9), hq5Var3), hq5Var3, 12582960, 64);
        }
        return Unit.a;
    }

    public /* synthetic */ pyj(Function0 function0, long j, yci yciVar, wn5 wn5Var, int i) {
        this.a = i;
        this.c = function0;
        this.d = j;
        this.b = yciVar;
        this.e = wn5Var;
    }
}
