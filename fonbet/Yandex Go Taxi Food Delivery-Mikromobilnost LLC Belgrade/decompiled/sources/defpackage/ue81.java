package defpackage;

/* loaded from: classes11.dex */
public abstract class ue81 implements Runnable {
    public final atx0 a;

    public ue81() {
        this.a = null;
    }

    public void a(Exception exc) {
        atx0 atx0Var = this.a;
        if (atx0Var != null) {
            atx0Var.b(exc);
        }
    }

    public abstract void b();

    public final atx0 c() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public ue81(atx0 atx0Var) {
        this.a = atx0Var;
    }
}
