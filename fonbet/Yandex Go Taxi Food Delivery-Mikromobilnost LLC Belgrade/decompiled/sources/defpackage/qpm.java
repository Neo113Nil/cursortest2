package defpackage;

import androidx.compose.foundation.pager.d;
import androidx.compose.runtime.f;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class qpm {
    public static final /* synthetic */ int a = 0;

    static {
        new qwd(new jbm(21));
        new qwd(new jbm(21));
        new qwd(new jbm(22));
    }

    public static final void a(ppm ppmVar, List list, sls slsVar, boolean z, fid fidVar, int i) {
        int i2;
        d dVar = ppmVar.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1871610149);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ppmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(c530.a) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new gi0(ppmVar, list, slsVar, z, i);
                return;
            }
            return;
        }
        int k = dVar.k();
        btsVar.e0(5004770);
        boolean c = btsVar.c(k);
        Object Q = btsVar.Q();
        if (c || Q == did.a) {
            Q = f.j(list.get(dVar.k()));
            btsVar.o0(Q);
        }
        btsVar.t(false);
        ((oz40) Q).getValue().getClass();
        ny61.u();
    }

    public static final void b(List list, f530 f530Var, int i, sls slsVar, boolean z, fid fidVar, int i2) {
        List list2;
        sls slsVar2;
        boolean z2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1797667715);
        int i3 = (btsVar.k(list) ? 4 : 2) | i2 | 48 | (btsVar.c(i) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192);
        if ((i3 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            list2 = list;
            f530Var2 = f530Var;
            z2 = z;
            slsVar2 = slsVar;
        } else {
            int size = list.size();
            int i4 = (i3 >> 3) & 112;
            btsVar.e0(812503794);
            btsVar.e0(5004770);
            boolean c = btsVar.c(size);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new gac(size, 2);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            ugh b = a990.b(i, (sls) Q, btsVar, (i4 >> 3) & 14, 2);
            Object[] objArr = {Integer.valueOf(i)};
            tig0 c2 = zeb1.c(new txk(6), new c0m(21));
            btsVar.e0(5004770);
            boolean k = btsVar.k(b);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ny8(b, 1);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            ppm ppmVar = (ppm) cvw.W(objArr, c2, (sls) Q2, btsVar, 0);
            btsVar.t(false);
            a(ppmVar, list, slsVar, z, btsVar, ((i3 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND) | (i3 & 7168) | (i3 & HProv.ALG_CLASS_ALL));
            list2 = list;
            slsVar2 = slsVar;
            z2 = z;
            f530Var2 = c530.a;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(list2, f530Var2, i, slsVar2, z2, i2);
        }
    }
}
