package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class sua1 {
    public static final void a(tgl0 tgl0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        long g;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1223059970);
        int i2 = (btsVar2.k(tgl0Var) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 f = ocb1.f(ljs0.e(ljs0.c(an91.k(c530.a, 16.0f), 1.0f), 56.0f), tgl0Var.e, btsVar2, 0);
            byk0 b = ((YandexShapes) btsVar2.m(qm51.a)).b();
            if (tgl0Var.d) {
                btsVar2.e0(1972307466);
                g = ((el51) btsVar2.m(gl51.a)).f();
                btsVar2.t(false);
            } else {
                btsVar2.e0(1972367017);
                g = ((el51) btsVar2.m(gl51.a)).g();
                btsVar2.t(false);
            }
            boolean z = tgl0Var.d;
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new n7l0(3, slsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            a.b((sls) Q, f, b, g, 0L, null, null, null, z, null, null, null, wwg.S(-266801053, true, new pdf0(19, tgl0Var), btsVar2), btsVar, 0, 384, 3824);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(tgl0Var, slsVar, i, 2);
        }
    }

    public static final int b(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final lum c(dx3 dx3Var) {
        return new lum(new txk(27), bgs.a, new s1r(14, dx3Var), cgs.a);
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String r = unr0.r(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(r), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + r.length() + 8 + 1);
                    sb2.append("<");
                    sb2.append(r);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    sb = sb2.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i3, indexOf);
            sb3.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(Extension.FIX_SPACE);
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
