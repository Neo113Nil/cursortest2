package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class qul implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qul(bg5 bg5Var, long j) {
        zyj zyjVar = zyj.a;
        this.c = bg5Var;
        this.b = j;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                bg5 bg5Var = (bg5) obj4;
                zyj zyjVar = zyj.d;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(dh3Var) ? 4 : 2;
                }
                int i2 = intValue;
                if ((i2 & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(bg5Var);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    msj msjVar = new msj(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 25);
                    oq5Var2.k0(msjVar);
                    K = msjVar;
                }
                qgg.h(dh3Var, zyjVar, (Function0) ((h9f) K), this.b, oq5Var2, (i2 & 14) | 48);
                break;
            default:
                c cVar = (c) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).g(booleanValue) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                if (!booleanValue) {
                    break;
                } else {
                    yci q = a.q(d.d(vci.a, 1.0f), 0.0f, ((fma.b(this.b) + cVar.c()) / 2) + 12, 0.0f, 0.0f, 13);
                    neg.s(hq5Var2);
                    xcs.b(rvf.M(R.string.wizard_one_to_one_hint_text, hq5Var2), q, 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(hq5Var2).h.b, hq5Var2, 0, 0, 65020);
                }
        }
        return Unit.a;
    }

    public /* synthetic */ qul(c cVar, long j) {
        this.c = cVar;
        this.b = j;
    }
}
