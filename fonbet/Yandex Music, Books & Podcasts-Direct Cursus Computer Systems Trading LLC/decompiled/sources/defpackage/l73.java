package defpackage;

/* loaded from: classes4.dex */
public final class l73 implements f8l {
    public final Object a = new Object();
    public boolean b = true;

    @Override // defpackage.f8l
    public final void F(boolean z) {
        boolean z2 = !z;
        synchronized (this.a) {
            this.b = z2;
            if (!z) {
                this.a.notifyAll();
            }
        }
    }
}
