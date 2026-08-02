package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class w1r {
    public static void a(r1r r1rVar, oq90 oq90Var) {
        if (r1rVar.n(oq90Var)) {
            return;
        }
        try {
            r1rVar.D(oq90Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void b(r1r r1rVar, oq90 oq90Var) {
        try {
            IOException iOException = null;
            for (oq90 oq90Var2 : r1rVar.o(oq90Var)) {
                try {
                    if (r1rVar.v(oq90Var2).b) {
                        b(r1rVar, oq90Var2);
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
}
