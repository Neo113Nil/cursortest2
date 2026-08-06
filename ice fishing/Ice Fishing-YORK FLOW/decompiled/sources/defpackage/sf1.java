package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sf1 extends defpackage.h90 {
    public int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.rf1 oh71FJcDz6S2;

    public sf1(defpackage.rf1 rf1Var) {
        this.oh71FJcDz6S2 = rf1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WDYagTQQm9ns < this.oh71FJcDz6S2.WDYagTQQm9ns();
    }

    @Override // defpackage.h90
    public final int nextInt() {
        int i = this.WDYagTQQm9ns;
        this.WDYagTQQm9ns = i + 1;
        return this.oh71FJcDz6S2.fWTAfUmVKrZq(i);
    }
}
