package bo.app;

/* loaded from: classes3.dex */
public final class x5 implements k9 {
    public final long a;
    public final String b;
    public final j9 c = j9.DISCONNECT_AND_RETRY;

    public x5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // bo.app.k9
    public final j9 a() {
        return this.c;
    }
}
