package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ho1 extends defpackage.r81 implements java.lang.Runnable {
    public final long Ns0WNyEWdPsk;

    public ho1(long j, defpackage.ll llVar) {
        super(llVar, llVar.oh71FJcDz6S2());
        this.Ns0WNyEWdPsk = j;
    }

    @Override // defpackage.jb0
    public final java.lang.String NkfcFfdaVTox() {
        return super.NkfcFfdaVTox() + "(timeMillis=" + this.Ns0WNyEWdPsk + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.nn.w7APNrr0aGRc(this.e6mdH7fiFuta);
        dG7RjM6DqYVL(new defpackage.go1("Timed out waiting for " + this.Ns0WNyEWdPsk + " ms", this));
    }
}
