package defpackage;

import androidx.compose.foundation.layout.c;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class jz5 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv5 b;

    public /* synthetic */ jz5(wv5 wv5Var, int i) {
        this.a = i;
        this.b = wv5Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.a) {
            case 0:
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                wv5 wv5Var = this.b;
                boolean h = oq5Var2.h(wv5Var);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    K = new gz5(wv5Var, 3);
                    oq5Var2.k0(K);
                }
                xv7.i(new mn0(6, j66.d0(wv5Var.f.n.d(), oq5Var2), (ArrayList) null), null, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 1, 0, null, null, nu0.j(), vut.s(cVar, (Function1) K), null, oq5Var2, 0, 134220800, 647162);
                break;
            case 1:
                c cVar2 = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                wv5 wv5Var2 = this.b;
                boolean h2 = oq5Var4.h(wv5Var2);
                Object K2 = oq5Var4.K();
                if (h2 || K2 == gq5.a) {
                    K2 = new gz5(wv5Var2, 2);
                    oq5Var4.k0(K2);
                }
                pn0 s = vut.s(cVar2, (Function1) K2);
                String str2 = wv5Var2.f.i;
                if (str2 == null) {
                    str2 = "";
                }
                xv7.i(new mn0(6, str2, (ArrayList) null), null, ((dq0) oq5Var4.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 1, 0, null, null, nu0.j(), s, null, oq5Var4, 0, 134220800, 647162);
                break;
            default:
                c cVar3 = (c) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(cVar3) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var3;
                wv5 wv5Var3 = this.b;
                boolean h3 = oq5Var6.h(wv5Var3);
                Object K3 = oq5Var6.K();
                if (h3 || K3 == gq5.a) {
                    K3 = new gz5(wv5Var3, 4);
                    oq5Var6.k0(K3);
                }
                pn0 s2 = vut.s(cVar3, (Function1) K3);
                String str3 = wv5Var3.f.i;
                if (str3 == null || (str = StringsKt.t0(str3).toString()) == null) {
                    str = "";
                }
                xv7.i(new mn0(6, str, (ArrayList) null), null, ((dq0) oq5Var6.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 1, 0, null, null, nu0.j(), s2, null, oq5Var6, 0, 134220800, 647162);
                break;
        }
        return Unit.a;
    }
}
