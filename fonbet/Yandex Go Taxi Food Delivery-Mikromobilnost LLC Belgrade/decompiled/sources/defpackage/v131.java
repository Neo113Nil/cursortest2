package defpackage;

/* loaded from: classes.dex */
public final class v131 extends c231 {
    public final String b;
    public volatile int c;

    public v131(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(int i) {
        synchronized (this) {
            if (this.c == i) {
                return;
            }
            this.c = i;
            e(this);
        }
    }
}
