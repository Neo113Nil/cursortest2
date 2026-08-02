package defpackage;

/* loaded from: classes3.dex */
public final class axt extends kxt {
    public final String b;
    public volatile boolean c;

    public axt(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.kxt
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
