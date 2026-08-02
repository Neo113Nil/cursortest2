package defpackage;

/* loaded from: classes.dex */
public final class kt0 implements Runnable {
    public final /* synthetic */ int a;

    public kt0(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            lt0.e(this.a);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
