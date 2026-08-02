package defpackage;

import android.net.Uri;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.deeplink.generated.StoriesAction;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public abstract class ygb1 {
    public static final void a(vd9 vd9Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        boolean z;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-20068779);
        int i2 = i | (btsVar.k(vd9Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            String str = vd9Var.d;
            if (str == null || evu0.J(str)) {
                z = false;
                c530Var = c530Var2;
                tse0.s(btsVar, 1106017280, c530Var, 20.0f, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(1105825111);
                c530Var = c530Var2;
                z = false;
                v0b1.a(mja1.a(vd9Var.d, null, 6), ljs0.m(an91.o(c530Var2, 10.0f, 10.0f, 0.0f, 8.0f, 4), 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                btsVar.t(false);
            }
            jeb1.f(vd9Var.a, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.e, btsVar, 48, 0, 16380);
            btsVar = btsVar;
            if (vd9Var.b != null) {
                btsVar.e0(1106282826);
                jeb1.f(vd9Var.b, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 48, 0, 16380);
                btsVar = btsVar;
                btsVar.t(z);
            } else {
                btsVar.e0(1106455031);
                btsVar.t(z);
            }
            f530 l = an91.l(ljs0.c(c530Var, 1.0f), 8.0f, 4.0f);
            boolean z2 = (i2 & 112) == 32 ? true : z;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                tlsVar2 = tlsVar;
                Q = new zp5(25, tlsVar2);
                btsVar.o0(Q);
            } else {
                tlsVar2 = tlsVar;
            }
            ohb1.b(l, false, null, (sls) Q, wwg.S(16361534, true, new bj0(23, vd9Var), btsVar), btsVar, 24582, 6);
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(vd9Var, tlsVar2, i, 15);
        }
    }

    public static final void b(vd9 vd9Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(513854335);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(vd9Var) : btsVar.e(vd9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(-891849367, true, new wg0(6, tlsVar), btsVar), wwg.S(-299548879, true, new sp5(12, vd9Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(vd9Var, tlsVar, i, 19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long c(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 != 0) {
            int i = ((int) ((j ^ j2) >> 63)) | 1;
            switch (ylz.a[roundingMode.ordinal()]) {
                case 1:
                    if (j4 != 0) {
                        w511.w("mode was UNNECESSARY, but rounding was necessary");
                        return 0L;
                    }
                case 2:
                case 3:
                    break;
                case 4:
                    return j3 + i;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = Math.abs(j4);
                    long abs2 = abs - (Math.abs(j2) - abs);
                    return abs2 != 0 ? j3 : j3;
                default:
                    ny61.w();
                    return 0L;
            }
        }
    }

    public static long d(long j, long j2) {
        djb1.g(j, "a");
        djb1.g(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static StoriesAction e(Uri uri) {
        Boolean j0;
        Boolean j02;
        String queryParameter = uri.getQueryParameter("target");
        if (queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("show_back");
        boolean booleanValue = (queryParameter2 == null || (j02 = evu0.j0(queryParameter2)) == null) ? false : j02.booleanValue();
        String queryParameter3 = uri.getQueryParameter("show_close_button");
        boolean booleanValue2 = (queryParameter3 == null || (j0 = evu0.j0(queryParameter3)) == null) ? true : j0.booleanValue();
        String queryParameter4 = uri.getQueryParameter("agreement_id");
        String queryParameter5 = uri.getQueryParameter("progress");
        String queryParameter6 = uri.getQueryParameter("start_story_id");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!j73.f0(new String[]{"target", "agreement_id", "progress", "show_back", "show_close_button", "start_story_id"}).contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter7 = uri.getQueryParameter((String) next);
            if (queryParameter7 == null) {
                queryParameter7 = "";
            }
            linkedHashMap.put(next, queryParameter7);
        }
        return new StoriesAction(queryParameter, booleanValue, booleanValue2, queryParameter4, queryParameter5, queryParameter6, !linkedHashMap.isEmpty() ? linkedHashMap : null);
    }

    public static long f(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }
}
