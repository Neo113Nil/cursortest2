package defpackage;

/* loaded from: classes.dex */
public final class z131 extends c231 {
    public final String b;
    public volatile String c;

    public z131(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(String str) {
        synchronized (this) {
            if (jl40.l(this.c, str)) {
                return;
            }
            this.c = str;
            e(this);
        }
    }
}
