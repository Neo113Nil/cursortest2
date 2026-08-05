package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pc0 extends v50 implements Runnable {
    public final long P7K7Inc8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pc0(long j, pz pzVar) {
        super(pzVar, r0);
        l9 l9Var = pzVar.MdtA4re8;
        l9Var.getClass();
        this.P7K7Inc8 = j;
    }

    @Override // defpackage.vn
    public final String fVMzMhyS() {
        return super.fVMzMhyS() + "(timeMillis=" + this.P7K7Inc8 + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        ej0.Ey6iv0m0(this.wxUZMvaN);
        amk52bBQ(new oc0("Timed out waiting for " + this.P7K7Inc8 + " ms", this));
    }
}
