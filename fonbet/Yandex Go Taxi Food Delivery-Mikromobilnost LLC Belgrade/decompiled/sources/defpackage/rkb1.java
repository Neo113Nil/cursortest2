package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes11.dex */
public abstract class rkb1 {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1483805288);
        if ((i & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (btsVar.m(q1z.a) != null) {
                ny61.u();
                return;
            }
            btsVar.e0(351021998);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                throw null;
            }
            if (Q != null) {
                ny61.u();
                return;
            }
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 23);
        }
    }

    public static final void b(View view, String str, boolean z) {
        if (z && str != null && str.length() != 0) {
            str = c.G(kyh0.tariff_card_surge_note, view) + Extension.FIX_SPACE + ((Object) str);
        } else if (z) {
            str = c.G(kyh0.tariff_card_surge_note, view);
        } else if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return;
        }
        view.setContentDescription(str);
    }
}
