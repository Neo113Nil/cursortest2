package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t9t {
    public static volatile v77 e;
    public final up4 a;
    public final up4 b;
    public final eq7 c;
    public final hgp d;

    public t9t(up4 up4Var, up4 up4Var2, eq7 eq7Var, hgp hgpVar, bjt bjtVar) {
        this.a = up4Var;
        this.b = up4Var2;
        this.c = eq7Var;
        this.d = hgpVar;
        ((Executor) bjtVar.a).execute(new bhp(22, bjtVar));
    }

    public static t9t a() {
        v77 v77Var = e;
        if (v77Var != null) {
            return (t9t) v77Var.f.get();
        }
        xq0.q("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (t9t.class) {
                try {
                    if (e == null) {
                        sg1 sg1Var = new sg1();
                        context.getClass();
                        sg1Var.a = context;
                        e = sg1Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final p9t c(vn3 vn3Var) {
        byte[] bytes;
        Set unmodifiableSet = vn3Var != null ? Collections.unmodifiableSet(vn3.d) : Collections.singleton(new p6b("proto"));
        nsh a = de2.a();
        vn3Var.getClass();
        a.b = "cct";
        String str = vn3Var.a;
        String str2 = vn3Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = hrg.r("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.c = bytes;
        return new p9t(unmodifiableSet, a.c(), this);
    }
}
