package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xqf0 {
    public static uqf0 a(rd6 rd6Var) {
        qqf0 qqf0Var;
        qqf0 mqf0Var;
        th40 th40Var;
        ck60 ck60Var = ck60.b;
        ck60 ck60Var2 = ck60.a;
        rqf0 rqf0Var = null;
        if (jl40.l(rd6Var, pd6.a)) {
            return null;
        }
        if (jl40.l(rd6Var, pd6.b)) {
            return new uqf0(null, tlf0.a, null, null, null);
        }
        if (!(rd6Var instanceof qd6)) {
            w511.b();
            return null;
        }
        qd6 qd6Var = (qd6) rd6Var;
        hk60 hk60Var = qd6Var.f;
        CharSequence charSequence = qd6Var.d;
        String str = qd6Var.c;
        dof0 dof0Var = (str == null || evu0.J(str)) ? null : new dof0(new qnf0(mja1.b(str, null, 6)));
        CharSequence charSequence2 = qd6Var.e;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        if (!evu0.J(charSequence2)) {
            sb.append(Extension.FIX_SPACE + ((Object) charSequence2));
        }
        slf0 slf0Var = new slf0(charSequence, charSequence2, sb.toString());
        boolean z = hk60Var instanceof ak60;
        if (z) {
            ArrayList<ik60> arrayList = ((ak60) hk60Var).a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (ik60 ik60Var : arrayList) {
                ny6 ny6Var = ik60Var.a;
                arrayList2.add(new vlf0(ny6Var.b, ik60Var.b, ik60Var.c, ny6Var.d));
            }
            mqf0Var = new lqf0(arrayList2);
        } else if (hk60Var instanceof dk60) {
            mqf0Var = new nqf0(((dk60) hk60Var).b);
        } else if (hk60Var instanceof ek60) {
            ek60 ek60Var = (ek60) hk60Var;
            mqf0Var = new pqf0(ek60Var.b, ek60Var.c);
        } else if (hk60Var instanceof fk60) {
            fk60 fk60Var = (fk60) hk60Var;
            boolean z2 = fk60Var.a;
            int i = wqf0.a[fk60Var.b.ordinal()];
            if (i == 1 || i == 2) {
                th40Var = fk60Var.c;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                th40Var = null;
            }
            mqf0Var = new oqf0(th40Var, z2);
        } else if (hk60Var instanceof gk60) {
            gk60 gk60Var = (gk60) hk60Var;
            mqf0Var = new pqf0(gk60Var.a, gk60Var.b);
        } else {
            if (!(hk60Var instanceof bk60)) {
                if (!jl40.l(hk60Var, ck60Var2) && !jl40.l(hk60Var, ck60Var)) {
                    w511.b();
                    return null;
                }
                qqf0Var = null;
                if (!jl40.l(hk60Var, ck60Var) || (hk60Var instanceof bk60)) {
                    rqf0Var = new rqf0(AppColor$Palette.Text);
                } else if (hk60Var instanceof ek60) {
                    rqf0Var = new rqf0(((ek60) hk60Var).e);
                } else if (!jl40.l(hk60Var, ck60Var2) && !(hk60Var instanceof dk60) && !(hk60Var instanceof fk60) && !(hk60Var instanceof gk60) && !z) {
                    w511.b();
                    return null;
                }
                return new uqf0(dof0Var, slf0Var, qqf0Var, rqf0Var, qd6Var.j);
            }
            bk60 bk60Var = (bk60) hk60Var;
            mqf0Var = new mqf0(bk60Var.a, bk60Var.b);
        }
        qqf0Var = mqf0Var;
        if (jl40.l(hk60Var, ck60Var)) {
        }
        rqf0Var = new rqf0(AppColor$Palette.Text);
        return new uqf0(dof0Var, slf0Var, qqf0Var, rqf0Var, qd6Var.j);
    }
}
