package defpackage;

/* loaded from: classes9.dex */
public final class xv60 extends rvj0 {
    public final wg10 a;
    public final long b;

    public xv60(long j, wg10 wg10Var) {
        this.a = wg10Var;
        this.b = j;
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        return this.a;
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
