package defpackage;

/* loaded from: classes5.dex */
public class l1f extends rtk {
    @Override // defpackage.rtk
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = k1f.b;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
