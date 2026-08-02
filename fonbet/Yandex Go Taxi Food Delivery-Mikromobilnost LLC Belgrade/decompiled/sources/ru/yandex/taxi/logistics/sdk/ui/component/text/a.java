package ru.yandex.taxi.logistics.sdk.ui.component.text;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.doj;
import defpackage.f530;
import defpackage.fid;
import defpackage.o430;
import defpackage.wls;
import defpackage.ymb1;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(int i, fid fidVar, f530 f530Var, String str) {
        int i2;
        f530 f530Var2 = f530Var;
        String str2 = str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(506992779);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.d(3000L) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (str2.length() > 0) {
            btsVar.e0(-1577968502);
            int i3 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i3 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = Long.valueOf(3000 / str2.length());
                btsVar.o0(Q);
            }
            long longValue = ((Number) Q).longValue();
            boolean d = btsVar.d(longValue) | (i3 == 32);
            Object Q2 = btsVar.Q();
            if (d || Q2 == o430Var) {
                Q2 = new TypingTextKt$TypingText$typingText$2$1(str2, longValue, null);
                btsVar.o0(Q2);
            }
            ymb1.f((String) f.l("", str2, (wls) Q2, btsVar, i3 | 6).getValue(), f530Var2, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar, (i2 << 3) & 112, HProv.ALG_TYPE_SECURECHANNEL, 57340);
            btsVar.t(false);
            f530Var2 = f530Var;
            btsVar = btsVar;
            str2 = str;
        } else {
            btsVar.e0(-1577445997);
            f530Var2 = f530Var;
            str2 = str;
            ymb1.f(str2, f530Var2, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), HProv.ALG_TYPE_SECURECHANNEL, 57340);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new doj(f530Var2, str2, i, 4);
        }
    }
}
