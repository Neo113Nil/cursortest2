package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b80 extends cn {
    public final /* synthetic */ a80 MdtA4re8;
    public int NCTxEWno;

    public b80(a80 a80Var) {
        this.MdtA4re8 = a80Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.NCTxEWno < this.MdtA4re8.MdtA4re8();
    }

    @Override // defpackage.cn
    public final int nextInt() {
        int i = this.NCTxEWno;
        this.NCTxEWno = i + 1;
        return this.MdtA4re8.qoPGr6Ce(i);
    }
}
