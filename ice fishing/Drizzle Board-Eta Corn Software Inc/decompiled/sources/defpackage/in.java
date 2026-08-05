package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class in extends sn {
    public static final /* synthetic */ long b2ZJblxo = b1.qoPGr6Ce.objectFieldOffset(in.class.getDeclaredField("_invoked$volatile"));
    public final gn P7K7Inc8;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public in(gn gnVar) {
        this.P7K7Inc8 = gnVar;
    }

    @Override // defpackage.sn
    public final boolean OnDfzHZD() {
        return true;
    }

    @Override // defpackage.sn
    public final void ygLcUYwZ(Throwable th) {
        if (b1.qoPGr6Ce.compareAndSwapInt(this, b2ZJblxo, 0, 1)) {
            this.P7K7Inc8.ow5vqvCr(th);
        }
    }
}
