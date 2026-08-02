package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import yads.et1;
import yads.q91;

/* loaded from: classes7.dex */
public final class rk71 {
    public static eh71 a(Context context) {
        String str;
        m881 a;
        m881 a2;
        new vm81();
        xk61 xk61Var = new xk61();
        new tb81();
        r191 a3 = bv81.a(context);
        q91 q91Var = null;
        try {
            vm81.a(et1.w);
            e = null;
        } catch (q91 e) {
            e = e;
        }
        try {
            xk61Var.a(context);
            e = null;
        } catch (q91 e2) {
            e = e2;
        }
        try {
            d581.a(context);
            e = null;
        } catch (q91 e3) {
            e = e3;
        }
        try {
            str = a3.b.q();
        } catch (Throwable unused) {
            str = null;
        }
        try {
        } catch (q91 e4) {
            q91Var = e4;
        }
        if (str == null) {
            throw new q91("Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 8.0.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). Please, check your AppMetrica integration.");
        }
        m881 a4 = tb81.a("8.0.0");
        if (a4 != null && (a = tb81.a("9.0.0")) != null && ((a2 = tb81.a(str)) == null || a2.compareTo(a4) < 0 || a2.compareTo(a) >= 0)) {
            throw new q91("Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 8.0.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). And the current version of AppMetrica SDK is ".concat(str));
        }
        List A = j73.A(new q91[]{e, e, e, q91Var});
        return !((ArrayList) A).isEmpty() ? new ie71(A) : ib71.a;
    }
}
