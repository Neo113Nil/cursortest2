package defpackage;

import android.app.UiModeManager;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class tga1 {
    public static UiModeManager a;

    public static final void a(r1r r1rVar, oq90 oq90Var) {
        if (r1rVar.n(oq90Var)) {
            return;
        }
        m.a(r1rVar.D(oq90Var, false));
    }

    public static r8i0 b(String str, String str2, boolean z) {
        return new r8i0(120, str, str2, null, null, null, z);
    }

    public static final void c(r1r r1rVar, oq90 oq90Var) {
        try {
            IOException iOException = null;
            for (oq90 oq90Var2 : r1rVar.o(oq90Var)) {
                try {
                    if (r1rVar.v(oq90Var2).b) {
                        c(r1rVar, oq90Var2);
                    }
                    r1rVar.k(oq90Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final boolean d(lqo lqoVar) {
        return !(lqoVar.a(tz10.s) && lqoVar.a(tz10.S)) && lqoVar.a(tz10.v);
    }

    public static final boolean e(lqo lqoVar) {
        return lqoVar.a(tz10.o) && lqoVar.a(tz10.R);
    }
}
