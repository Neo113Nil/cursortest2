package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wk4 {
    public static final mm4 a = new mm4(AppColor$Palette.BgFloating, AppColor$Palette.Text, bm4.a);

    static {
        int i = bq2.c;
        tje.c(0.3f, bq2.a);
    }

    public static final void a(BadgeSize badgeSize, mm4 mm4Var, l690 l690Var, f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(389610838);
        if ((i & 6) == 0) {
            i2 = (btsVar.c(badgeSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(mm4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(l690Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        int i3 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
            i3 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            k2z.a(mm4Var.a, mm4Var.b, wwg.S(2046903494, true, new t0(f530Var2, badgeSize, mm4Var, l690Var, aVar, f.n(badgeSize, btsVar), 4), btsVar), btsVar, 384);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((Object) badgeSize, (Object) mm4Var, (Object) l690Var, f530Var, aVar, i, 6);
        }
    }
}
