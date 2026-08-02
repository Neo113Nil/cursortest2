package defpackage;

/* loaded from: classes11.dex */
public abstract class zfa1 implements Runnable {
    public final atx0 a;

    public zfa1() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            atx0 atx0Var = this.a;
            if (atx0Var != null) {
                atx0Var.b(e);
            }
        }
    }

    public zfa1(atx0 atx0Var) {
        this.a = atx0Var;
    }
}
