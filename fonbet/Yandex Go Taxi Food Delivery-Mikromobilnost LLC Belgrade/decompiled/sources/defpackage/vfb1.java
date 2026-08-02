package defpackage;

/* loaded from: classes11.dex */
public final class vfb1 extends nya1 {
    public final /* synthetic */ int b;

    private final void e(Throwable th, Throwable th2) {
    }

    @Override // defpackage.nya1
    public final void d(Throwable th, Throwable th2) {
        switch (this.b) {
            case 0:
                break;
            default:
                th.addSuppressed(th2);
                break;
        }
    }
}
