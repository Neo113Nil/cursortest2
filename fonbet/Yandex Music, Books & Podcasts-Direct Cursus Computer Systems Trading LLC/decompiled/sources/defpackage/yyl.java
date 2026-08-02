package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class yyl extends uif implements ryc {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ mm6 t;
    public final /* synthetic */ fvf u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyl(ArrayList arrayList, Function1 function1, mm6 mm6Var, fvf fvfVar, int i) {
        super(4);
        this.r = arrayList;
        this.s = function1;
        this.t = mm6Var;
        this.u = fvfVar;
        this.v = i;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        boolean z = true;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            hcc hccVar = (hcc) this.r.get(intValue);
            oq5Var.Z(548607028);
            boolean z2 = hccVar.d;
            int i2 = (i & 112) ^ 48;
            boolean f = ((i2 > 32 && oq5Var.d(intValue)) || (i & 48) == 32) | oq5Var.f(hccVar);
            Object K = oq5Var.K();
            Object obj5 = gq5.a;
            if (f || K == obj5) {
                K = new syl(intValue, hccVar, 1);
                oq5Var.k0(K);
            }
            yci b = nfp.b(vci.a, false, (Function1) K);
            boolean f2 = oq5Var.f(this.s) | oq5Var.f(hccVar) | oq5Var.h(this.t) | oq5Var.f(this.u);
            if ((i2 <= 32 || !oq5Var.d(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean d = f2 | z | oq5Var.d(this.v);
            Object K2 = oq5Var.K();
            if (d || K2 == obj5) {
                K2 = new uyl(this.s, hccVar, this.t, this.u, intValue, this.v, 1);
                oq5Var.k0(K2);
            }
            dcc.a((Function0) K2, z2, false, b, true, 0L, ild.C(878492954, new vyl(hccVar, 1), oq5Var), oq5Var, 1573248, 32);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
