package defpackage;

import com.yandex.messaging.auth.passport.b;

/* loaded from: classes15.dex */
public final class v94 implements e1k {
    public final co3 a;
    public boolean b;
    public final x08 c;

    public v94(vh3 vh3Var, qp90 qp90Var, co3 co3Var) {
        x08 ap90Var;
        this.a = co3Var;
        m6 m6Var = new m6(10, this);
        b bVar = qp90Var.b;
        if (bVar == null) {
            qp90Var.b("getAccounts");
            ap90Var = wfz.z;
        } else {
            ap90Var = new ap90(bVar, null, qp90Var.c, new oy80(3, vh3Var, m6Var));
        }
        this.c = ap90Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.cancel();
        this.b = true;
    }
}
