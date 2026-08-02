package defpackage;

import androidx.compose.ui.platform.n;
import ru.yandex.taxi.logistics.sdk.ui.component.icon.b;

/* loaded from: classes5.dex */
public abstract class ua3 {
    public static final a7u0 a = new a7u0(new p73(3));

    public static final void a(b bVar, fid fidVar, int i) {
        oz40 oz40Var = bVar.F;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1555198953);
        if (!btsVar.V(i & 1, (i & 3) != 2)) {
            btsVar.Y();
        } else if (bVar.J) {
            btsVar.e0(1119873518);
            btsVar.t(false);
            oz40Var.setValue(null);
        } else {
            btsVar.e0(1119924234);
            ta3 k = bVar.k();
            boolean k2 = btsVar.k(k);
            Object Q = btsVar.Q();
            if (k2 || Q == did.a) {
                Q = k.a();
                btsVar.o0(Q);
            }
            oz40Var.setValue((pa90) Q);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn1(bVar, i, 15);
        }
    }

    public static final b b(String str, pa90 pa90Var, sls slsVar, fid fidVar, int i) {
        String str2;
        dci dciVar = (dci) ((bts) fidVar).m(a);
        if ((i & 4) != 0) {
            pa90Var = null;
        }
        pa90 pa90Var2 = pa90Var;
        int i2 = i & 8;
        o430 o430Var = did.a;
        if (i2 != 0) {
            bts btsVar = (bts) fidVar;
            Object Q = btsVar.Q();
            if (Q == o430Var) {
                Q = new p73(4);
                btsVar.o0(Q);
            }
            slsVar = (sls) Q;
        }
        sls slsVar2 = slsVar;
        bts btsVar2 = (bts) fidVar;
        Object Q2 = btsVar2.Q();
        if (Q2 == o430Var) {
            sjh sjhVar = uyj.a;
            Q2 = zpn.j(o400.a.x, btsVar2);
            btsVar2.o0(Q2);
        }
        tse tseVar = (tse) Q2;
        Object Q3 = btsVar2.Q();
        if (Q3 == o430Var) {
            str2 = str;
            b bVar = new b(tseVar, str2, dciVar, pa90Var2, slsVar2);
            btsVar2.o0(bVar);
            Q3 = bVar;
        } else {
            str2 = str;
        }
        b bVar2 = (b) Q3;
        bVar2.G.setValue(str2);
        bVar2.H.setValue(dciVar);
        bVar2.J = ((Boolean) btsVar2.m(n.a)).booleanValue();
        a(bVar2, btsVar2, 6);
        return bVar2;
    }
}
