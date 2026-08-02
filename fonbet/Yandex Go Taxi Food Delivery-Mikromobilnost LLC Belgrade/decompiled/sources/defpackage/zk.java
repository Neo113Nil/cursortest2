package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zk extends az4 implements rl {
    public final x8o y;

    public zk(x8o x8oVar, xa20 xa20Var) {
        super("AccountEventConsumerRegistry", new yk(0), new mis0(), xa20Var);
        this.y = x8oVar;
    }

    @Override // defpackage.rl
    public final void e() {
        this.y.c("AccountEventConsumerRegistry", "Account dropped");
        w(wk.a);
    }

    @Override // defpackage.rl
    public final void h(jl jlVar) {
        this.y.c("AccountEventConsumerRegistry", "Account changed (newUid = " + jlVar.a() + Extension.C_BRAKE);
        w(new vk(jlVar));
    }
}
