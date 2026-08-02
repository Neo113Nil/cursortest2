package defpackage;

/* loaded from: classes6.dex */
public final class ni implements anq {
    public int[] a;
    public pef b;

    @Override // defpackage.anq
    public final void c(int i, int i2) {
        this.a = new int[]{i, i2};
        pef pefVar = this.b;
        if (pefVar != null) {
            pefVar.invoke();
        }
        this.b = null;
    }
}
