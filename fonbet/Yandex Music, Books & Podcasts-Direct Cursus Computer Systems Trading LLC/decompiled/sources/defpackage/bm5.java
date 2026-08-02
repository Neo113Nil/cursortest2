package defpackage;

/* loaded from: classes5.dex */
public abstract class bm5 implements mm5 {
    public final void a(jm5 jm5Var) {
        try {
            b(jm5Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(jm5 jm5Var);
}
