package defpackage;

import com.yandex.xplat.common.c;
import java.time.DateTimeException;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.datetime.LocalDate;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class sfb1 {
    public static final void a(ntb0 ntb0Var, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(727788643);
        int i2 = (btsVar.k(ntb0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ldc ldcVar = ntb0Var.b.b;
            if (ldcVar == null) {
                btsVar.e0(556643369);
                int i3 = z6u0.a[ntb0Var.a.ordinal()];
                if (i3 == 1) {
                    btsVar.e0(-674778517);
                    j = ((el51) btsVar.m(gl51.a)).j();
                    btsVar.t(false);
                } else {
                    if (i3 != 2 && i3 != 3 && i3 != 4) {
                        throw unr0.y(-674780423, btsVar, false);
                    }
                    btsVar.e0(-674774353);
                    j = ((el51) btsVar.m(gl51.a)).g();
                    btsVar.t(false);
                }
                btsVar.t(false);
            } else {
                btsVar.e0(-674781353);
                btsVar.t(false);
                j = ldcVar.a;
            }
            qn91.d(m4m0.b(ymb1.l(ljs0.m(an91.k(c530.a, 3.0f), 28.0f), uvb0.b), j, qke.q), null, 0L, 0.0f, null, ntb0Var.d, wwg.S(-1566953793, true, new y6u0(ntb0Var), btsVar), wwg.S(201100311, true, new w7o0(22, ntb0Var), btsVar), btsVar, 14155776, 30);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new y6u0(ntb0Var, i);
        }
    }

    public static final void b(ra90 ra90Var, long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1091721977);
        int i2 = i | (btsVar.k(ra90Var) ? 4 : 2) | (btsVar.d(j) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qn91.d(m4m0.b(ymb1.l(ljs0.m(an91.k(c530.a, 3.0f), 28.0f), uvb0.b), j, qke.q), null, 0L, 0.0f, null, false, null, wwg.S(-351229523, true, new w7o0(21, ra90Var), btsVar), btsVar, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new eye(ra90Var, j, i, 4);
        }
    }

    public static final void c(int i, int i2, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(343440161);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            qn91.d(m4m0.b(ymb1.l(ljs0.m(an91.k(c530.a, 3.0f), 28.0f), uvb0.b), ((el51) btsVar.m(gl51.a)).g(), qke.q), null, 0L, 0.0f, null, false, null, wwg.S(-183248171, true, new vm1(i, 6), btsVar), btsVar, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jj20(i, i2, 3);
        }
    }

    public static final String d(String str) {
        String d = c.d(0, 6, str);
        return d.concat(c.c(str.length() - d.length(), c.d(-(str.length() < 14 ? 2 : 4), null, str)));
    }

    public static final LocalDate e(LocalDate localDate, int i, vrg vrgVar) {
        long j = i;
        int i2 = r2z.c;
        try {
            long addExact = Math.addExact(localDate.getValue().toEpochDay(), Math.multiplyExact(j, vrgVar.b));
            long j2 = r2z.a;
            if (addExact <= r2z.b && j2 <= addExact) {
                return new LocalDate(java.time.LocalDate.ofEpochDay(addExact));
            }
            throw new DateTimeException("The resulting day " + addExact + " is out of supported LocalDate range.");
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new DateTimeArithmeticException("The result of adding " + j + " of " + vrgVar + " to " + localDate + " is out of LocalDate range.", e);
        }
    }
}
