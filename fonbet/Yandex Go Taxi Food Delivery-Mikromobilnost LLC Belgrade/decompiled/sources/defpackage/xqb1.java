package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xqb1 {
    public static final void a(sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1376992892);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            qy20.a(null, null, null, false, wwg.S(1682378522, true, new wu40(i3, slsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new us4(slsVar, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if ((r16 & 2) != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2075786098);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && btsVar.e(slsVar)) ? 32 : 16);
        if (btsVar.V(i5 & 1, (i5 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if (i4 != 0) {
                    f530Var = c530.a;
                }
                if ((i2 & 2) != 0) {
                    slsVar = (sls) btsVar.m(c3z.a);
                    i5 &= -113;
                }
                f530 f530Var3 = f530Var;
                sls slsVar3 = slsVar;
                btsVar.u();
                int i6 = i5;
                brb1.a(vza1.c(), slsVar3, ohb1.e(btsVar, xxh0.common_back), f530Var3, false, btsVar, (i6 & 112) | ((i6 << 9) & 7168), 16);
                slsVar2 = slsVar3;
                f530Var2 = f530Var3;
            } else {
                btsVar.Y();
            }
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            slsVar2 = slsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ve6(i, i2, 7, slsVar2, f530Var2);
        }
    }

    public static final int c(Context context, int i) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }
}
