package defpackage;

import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.x;
import com.google.android.gms.internal.play_billing.y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class xd91 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ce91.H5;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + xqa1.f(exc.getMessage());
            int i = g.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            g.h("BillingLogger");
            return null;
        }
    }

    public static w b(int i, int i2, ns5 ns5Var) {
        try {
            sla1 u = w.u();
            nna1 v = y.v();
            int i3 = ns5Var.a;
            v.e();
            y.t((y) v.b, i3);
            String str = ns5Var.b;
            v.e();
            y.s((y) v.b, str);
            v.f(i);
            u.f(v);
            u.e();
            w.t((w) u.b, i2);
            return (w) u.d();
        } catch (Exception unused) {
            g.h("BillingLogger");
            return null;
        }
    }

    public static w c(int i, int i2, ns5 ns5Var, String str) {
        try {
            nna1 v = y.v();
            int i3 = ns5Var.a;
            v.e();
            y.t((y) v.b, i3);
            String str2 = ns5Var.b;
            v.e();
            y.s((y) v.b, str2);
            v.f(i);
            if (str != null) {
                v.e();
                y.r((y) v.b, str);
            }
            sla1 u = w.u();
            u.f(v);
            u.e();
            w.t((w) u.b, i2);
            return (w) u.d();
        } catch (Throwable unused) {
            g.h("BillingLogger");
            return null;
        }
    }

    public static x d(int i) {
        try {
            uma1 u = x.u();
            u.g(i);
            return (x) u.d();
        } catch (Exception unused) {
            g.h("BillingLogger");
            return null;
        }
    }
}
