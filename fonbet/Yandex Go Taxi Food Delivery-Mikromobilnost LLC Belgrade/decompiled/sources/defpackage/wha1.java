package defpackage;

import android.content.Context;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes14.dex */
public abstract class wha1 {
    public static final void a(f530 f530Var, dhi0 dhi0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(95888459);
        int i2 = 2;
        int i3 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(dhi0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        int i4 = 0;
        if (!btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.Y();
        } else if (dhi0Var instanceof bhi0) {
            btsVar.e0(460072682);
            ydb1.a(f530Var, null, wwg.S(-1967621790, true, new nhi0(dhi0Var, i4), btsVar), null, wwg.S(-304605592, true, new y740(tlsVar, 15, dhi0Var), btsVar), null, null, false, btsVar, (i3 & 14) | 24960, MSException.ERROR_MORE_DATA);
            btsVar.t(false);
        } else {
            if (!(dhi0Var instanceof chi0)) {
                throw unr0.y(1954501955, btsVar, false);
            }
            btsVar.e0(461341636);
            ydb1.a(f530Var, null, wwg.S(-873042855, true, new nhi0(dhi0Var, i2), btsVar), null, null, null, null, false, btsVar, (i3 & 14) | 384, 250);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(f530Var, (Object) dhi0Var, (Object) tlsVar, i, 2);
        }
    }

    public static final void b(shi0 shi0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1708594006);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(shi0Var) : btsVar.e(shi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            cx20.a(null, null, tnb1.e(new up2(ldc.l), null, btsVar, 4), null, null, false, false, wwg.S(233552404, true, new wg0(26, tlsVar), btsVar), wwg.S(402516444, true, new ls40(tlsVar2, shi0Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(shi0Var, tlsVar, tlsVar2, i, 3);
        }
    }

    public static ge71 c(Context context, Context context2) {
        return wfa1.b(context2, new m771(context));
    }

    public static final Route g(List list) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double a = nzs.a((Route) next);
                do {
                    Object next2 = it.next();
                    double a2 = nzs.a((Route) next2);
                    if (Double.compare(a, a2) > 0) {
                        next = next2;
                        a = a2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Route) obj;
    }

    public abstract boolean d(fa faVar, x9 x9Var, x9 x9Var2);

    public abstract boolean e(fa faVar, Object obj, Object obj2);

    public abstract boolean f(fa faVar, da daVar, da daVar2);

    public abstract void h(da daVar, da daVar2);

    public abstract void i(da daVar, Thread thread);
}
