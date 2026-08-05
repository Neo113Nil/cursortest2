package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pb0 extends ob0 {
    public final Runnable wxUZMvaN;

    public pb0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.wxUZMvaN = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.wxUZMvaN.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.wxUZMvaN;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ra.I5GHvsYW(runnable));
        sb.append(", ");
        sb.append(this.NCTxEWno);
        sb.append(", ");
        sb.append(this.MdtA4re8 ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
