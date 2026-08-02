package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v5x {
    static {
        int i = x5x.u0;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + StringUtils.PROCESS_POSTFIX_DELIMITER + message;
            int i = l8x.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static bfx b(int i, int i2, uz2 uz2Var) {
        try {
            afx q = bfx.q();
            lfx r = mfx.r();
            int i3 = uz2Var.a;
            r.d();
            mfx.p((mfx) r.b, i3);
            String str = uz2Var.b;
            r.d();
            mfx.o((mfx) r.b, str);
            r.e(i);
            q.e(r);
            q.d();
            bfx.p((bfx) q.b, i2);
            return (bfx) q.c();
        } catch (Exception e) {
            l8x.h("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static bfx c(int i, int i2, uz2 uz2Var, String str) {
        try {
            lfx r = mfx.r();
            int i3 = uz2Var.a;
            r.d();
            mfx.p((mfx) r.b, i3);
            String str2 = uz2Var.b;
            r.d();
            mfx.o((mfx) r.b, str2);
            r.e(i);
            if (str != null) {
                r.d();
                mfx.n((mfx) r.b, str);
            }
            afx q = bfx.q();
            q.e(r);
            q.d();
            bfx.p((bfx) q.b, i2);
            return (bfx) q.c();
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static kfx d(int i) {
        try {
            jfx p = kfx.p();
            p.d();
            kfx.o((kfx) p.b, i);
            return (kfx) p.c();
        } catch (Exception e) {
            l8x.h("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
