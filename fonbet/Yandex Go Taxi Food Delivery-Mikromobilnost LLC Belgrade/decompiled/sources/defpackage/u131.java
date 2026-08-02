package defpackage;

/* loaded from: classes.dex */
public final class u131 extends c231 {
    public final String b;
    public volatile boolean c;

    public u131(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(boolean z) {
        synchronized (this) {
            if (this.c == z) {
                return;
            }
            this.c = z;
            e(this);
        }
    }
}
