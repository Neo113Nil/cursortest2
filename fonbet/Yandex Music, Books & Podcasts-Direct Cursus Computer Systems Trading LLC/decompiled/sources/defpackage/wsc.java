package defpackage;

/* loaded from: classes.dex */
public abstract class wsc implements fap {
    public final fap a;

    public wsc(fap fapVar) {
        this.a = fapVar;
    }

    @Override // defpackage.fap
    public eap e(long j) {
        return this.a.e(j);
    }

    @Override // defpackage.fap
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.fap
    public long k() {
        return this.a.k();
    }
}
