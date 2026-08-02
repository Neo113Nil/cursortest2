package defpackage;

/* loaded from: classes3.dex */
public final class dxt extends kxt {
    public final String b;
    public volatile double c;

    public dxt(String str, double d) {
        this.b = str;
        this.c = d;
    }

    @Override // defpackage.kxt
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
