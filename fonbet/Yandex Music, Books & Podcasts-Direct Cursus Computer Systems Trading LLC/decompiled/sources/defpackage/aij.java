package defpackage;

/* loaded from: classes5.dex */
public abstract class aij implements hjj {
    @Override // defpackage.hjj
    public final void a(wjj wjjVar) {
        up6.L(wjjVar, "observer is null");
        try {
            c(wjjVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(wjj wjjVar);
}
