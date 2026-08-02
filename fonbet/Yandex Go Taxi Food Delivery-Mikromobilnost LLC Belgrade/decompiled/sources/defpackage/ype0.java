package defpackage;

/* loaded from: classes6.dex */
public final class ype0 implements tls {
    public volatile boolean a = true;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zpe0 zpe0Var = (zpe0) obj;
        if (!this.a) {
            return Boolean.TRUE;
        }
        this.a = false;
        zpe0Var.b.getClass();
        return Boolean.valueOf(!(r1 instanceof mtj0));
    }
}
