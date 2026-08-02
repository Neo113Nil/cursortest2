package defpackage;

/* loaded from: classes10.dex */
public final class r070 extends e530 implements ga10 {
    public tls a;
    public final boolean b = true;
    public long c = -9223372034707292160L;

    public r070(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.ga10
    public final void a(long j) {
        if (k6w.a(this.c, j)) {
            return;
        }
        this.a.invoke(new k6w(j));
        this.c = j;
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return this.b;
    }
}
