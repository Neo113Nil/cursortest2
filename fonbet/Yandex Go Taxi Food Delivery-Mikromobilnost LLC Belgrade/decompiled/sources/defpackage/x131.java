package defpackage;

/* loaded from: classes.dex */
public final class x131 extends c231 {
    public final String b;
    public volatile double c;

    public x131(String str, double d) {
        this.b = str;
        this.c = d;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(double d) {
        synchronized (this) {
            if (this.c == d) {
                return;
            }
            this.c = d;
            e(this);
        }
    }
}
