package defpackage;

/* loaded from: classes3.dex */
public abstract class lex implements Runnable {
    public final i8s a;

    public lex() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            i8s i8sVar = this.a;
            if (i8sVar != null) {
                i8sVar.c(e);
            }
        }
    }

    public lex(i8s i8sVar) {
        this.a = i8sVar;
    }
}
