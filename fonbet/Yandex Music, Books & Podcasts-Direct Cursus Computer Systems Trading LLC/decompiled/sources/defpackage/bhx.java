package defpackage;

/* loaded from: classes3.dex */
public abstract class bhx implements Runnable {
    public final i8s a;

    public bhx() {
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

    public bhx(i8s i8sVar) {
        this.a = i8sVar;
    }
}
