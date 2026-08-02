package defpackage;

/* loaded from: classes3.dex */
public final class bxt extends kxt {
    public final String b;
    public volatile int c;

    public bxt(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.kxt
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
