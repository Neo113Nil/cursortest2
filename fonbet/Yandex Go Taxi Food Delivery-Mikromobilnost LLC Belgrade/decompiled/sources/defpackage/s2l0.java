package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes14.dex */
public final class s2l0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ r2l0 c;

    public /* synthetic */ s2l0(sls slsVar, r2l0 r2l0Var, int i) {
        this.a = i;
        this.b = slsVar;
        this.c = r2l0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sls slsVar = this.b;
        zy11 zy11Var = zy11.a;
        r2l0 r2l0Var = this.c;
        int i2 = 2;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    btsVar.e0(213955390);
                    sb2.b(m290.a.a(null), wwg.S(480920849, true, new s2l0(slsVar, r2l0Var, i2), btsVar), btsVar, 48);
                    btsVar.t(false);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Number) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    d17.c(ljs0.c(c530.a, 1.0f), false, null, ButtonStyle.Main, null, this.b, wwg.S(-1222179036, true, new bab(7, r2l0Var), btsVar2), btsVar2, 1575942, 22);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Number) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    wg6 a = b.a(false, 0.0f, null, false, null, null, null, null, btsVar3, 48, 0, 8189);
                    androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar3);
                    Object Q = btsVar3.Q();
                    if (Q == did.a) {
                        Q = f.d(new a80(27, a2));
                        btsVar3.o0(Q);
                    }
                    bbd.a.getClass();
                    c.a(null, a, null, false, false, null, null, bbd.c, null, null, wwg.S(-1596792699, true, new z9b(8, slsVar, r2l0Var), btsVar3), wwg.S(1790015921, true, new yc0(9, (m3u0) Q, a2, r2l0Var), btsVar3), btsVar3, 12582912, 54, 893);
                    break;
                }
        }
        return zy11Var;
    }
}
