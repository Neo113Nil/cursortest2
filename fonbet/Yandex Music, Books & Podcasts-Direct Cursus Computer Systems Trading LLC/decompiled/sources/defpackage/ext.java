package defpackage;

/* loaded from: classes3.dex */
public final class ext extends kxt {
    public final String b;
    public volatile long c;

    public ext(String str, long j) {
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.kxt
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
