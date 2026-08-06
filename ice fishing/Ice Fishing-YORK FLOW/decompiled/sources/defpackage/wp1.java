package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class wp1 implements java.util.Iterator, defpackage.nb0 {
    public int QiMR8OkAhezm;
    public java.lang.Object[] WDYagTQQm9ns = defpackage.vp1.WDYagTQQm9ns.JhCgjQRTAOCT;
    public int oh71FJcDz6S2;

    public final void ZpBGe2uQfcn8(java.lang.Object[] objArr, int i, int i2) {
        this.WDYagTQQm9ns = objArr;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.QiMR8OkAhezm < this.oh71FJcDz6S2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
