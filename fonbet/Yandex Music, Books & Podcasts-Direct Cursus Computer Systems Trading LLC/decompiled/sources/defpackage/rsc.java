package defpackage;

/* loaded from: classes5.dex */
public abstract class rsc implements u56 {
    @Override // defpackage.pue
    public final sue a() {
        return e().a();
    }

    @Override // defpackage.s8h
    public void b(sgr sgrVar) {
        e().b(sgrVar);
    }

    @Override // defpackage.s8h
    public void c(sgr sgrVar) {
        e().c(sgrVar);
    }

    @Override // defpackage.s8h
    public final Runnable d(r8h r8hVar) {
        return e().d(r8hVar);
    }

    public abstract u56 e();

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(e(), "delegate");
        return Y.toString();
    }
}
