package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class xu7 implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fv7 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ xu7(fv7 fv7Var, tls tlsVar) {
        this.b = fv7Var;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        tls tlsVar = this.c;
        fv7 fv7Var = this.b;
        switch (i) {
            case 0:
                tic ticVar = (tic) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 19) != 18)) {
                    boolean k = btsVar.k(tlsVar) | btsVar.k(fv7Var);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new lu5(26, tlsVar, fv7Var);
                        btsVar.o0(Q);
                    }
                    vpa1.a(an91.o(ticVar.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, yu7.a, btsVar), btsVar, 24960, 2);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    String str = fv7Var.a;
                    if (str == null) {
                        btsVar2.e0(-1252003824);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1252003823);
                        jeb1.f(str, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 16.0f, 5), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).e.d, btsVar2, 48, 0, 16380);
                        btsVar2.t(false);
                    }
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = f.j(fv7Var.b);
                        btsVar2.o0(Q2);
                    }
                    oz40 oz40Var = (oz40) Q2;
                    f530 b = i6b1.b(ljs0.c(c530Var, 1.0f));
                    String str2 = (String) oz40Var.getValue();
                    Object Q3 = btsVar2.Q();
                    if (Q3 == o430Var) {
                        Q3 = new w5(19, oz40Var);
                        btsVar2.o0(Q3);
                    }
                    heb1.b(str2, (tls) Q3, b, false, null, null, null, null, null, null, null, null, null, null, null, false, null, 0.0f, null, null, null, null, false, 4, 0, null, null, null, null, null, null, btsVar2, 432, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 2130706424, 1);
                    f530 c = ljs0.c(i9a1.d(an91.k(c530Var, 8.0f)), 1.0f);
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q4 = btsVar2.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new c0(tlsVar, oz40Var, 2);
                        btsVar2.o0(Q4);
                    }
                    ohb1.b(c, false, null, (sls) Q4, wwg.S(1830840287, true, new bj0(20, fv7Var), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ xu7(tls tlsVar, fv7 fv7Var) {
        this.c = tlsVar;
        this.b = fv7Var;
    }
}
