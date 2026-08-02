package defpackage;

/* loaded from: classes.dex */
public final class y131 extends c231 {
    public final String b;
    public volatile long c;

    public y131(String str, long j) {
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(long j) {
        synchronized (this) {
            if (this.c == j) {
                return;
            }
            this.c = j;
            e(this);
        }
    }
}
