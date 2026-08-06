package defpackage;

/* loaded from: classes.dex */
public final class zg1 extends defpackage.e51 implements java.lang.Runnable {
    public final long ez2rX8ReCYw;

    public zg1(long j, defpackage.fj fjVar) {
        super(fjVar, fjVar.xiZrDbcSW0());
        this.ez2rX8ReCYw = j;
    }

    @Override // defpackage.c90
    public final java.lang.String RmCzwkUxICV() {
        return super.RmCzwkUxICV() + "(timeMillis=" + this.ez2rX8ReCYw + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.fm.C0U8sNJm(this.riuEU0zW4);
        nBH8hAHy(new defpackage.yg1("Timed out waiting for " + this.ez2rX8ReCYw + " ms", this));
    }
}
