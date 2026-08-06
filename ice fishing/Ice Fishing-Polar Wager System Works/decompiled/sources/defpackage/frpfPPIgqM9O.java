package defpackage;

/* loaded from: classes.dex */
public abstract class frpfPPIgqM9O extends defpackage.ry0 {
    public abstract java.util.Random F7NU4MC0GW();

    @Override // defpackage.ry0
    public final int IHQe1A4L2xu(int i) {
        return (F7NU4MC0GW().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.ry0
    public final int oh6vYeIP() {
        return F7NU4MC0GW().nextInt();
    }
}
