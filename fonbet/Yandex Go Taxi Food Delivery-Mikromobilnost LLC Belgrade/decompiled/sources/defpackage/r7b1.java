package defpackage;

import androidx.compose.ui.platform.n;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class r7b1 {
    public static a16 a(l8v l8vVar, int i) {
        a16 a16Var = new a16(l8vVar, (((u92) l8vVar).a.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((u92) l8vVar).a.getWidth() << 32));
        a16Var.A = i;
        return a16Var;
    }

    public static final void b(wtd wtdVar, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1504045604);
        int i2 = (btsVar.k(wtdVar) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.q = true;
            btsVar.C = true;
            btsVar.c.h();
            btsVar.H.h();
            ows0 ows0Var = btsVar.I;
            sus0 sus0Var = ows0Var.a;
            ows0Var.e = sus0Var.C;
            ows0Var.f = sus0Var.D;
            Set set = ((xtd) wtdVar).a;
            set.add(btsVar.A());
            sb2.c(new vvf0[]{n.a.a(Boolean.TRUE), u2w.a.a(set)}, wlsVar, btsVar, (i2 & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(wtdVar, wlsVar, i, 3);
        }
    }

    public static final ek11 c(dk11 dk11Var) {
        z630 z630Var = dk11Var.a;
        Integer num = z630Var != null ? z630Var.a : null;
        MoneyEntity moneyEntity = z630Var != null ? z630Var.b : null;
        if (num == null || moneyEntity == null) {
            return null;
        }
        z630 z630Var2 = dk11Var.b;
        Integer num2 = z630Var2 != null ? z630Var2.a : null;
        MoneyEntity moneyEntity2 = z630Var2 != null ? z630Var2.b : null;
        if (num2 == null || moneyEntity2 == null) {
            return null;
        }
        return new ek11(new a730(num.intValue(), moneyEntity), new a730(num2.intValue(), moneyEntity2));
    }
}
