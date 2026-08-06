package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class kg1 implements defpackage.jg1 {
    public final defpackage.h8 WDYagTQQm9ns = new defpackage.h8(0);

    public final void QiMR8OkAhezm(int i) {
        defpackage.h8 h8Var;
        int i2;
        do {
            h8Var = this.WDYagTQQm9ns;
            i2 = h8Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!h8Var.compareAndSet(i2, i2 | i));
    }

    public final boolean oh71FJcDz6S2(int i) {
        return (this.WDYagTQQm9ns.get() & i) != 0;
    }
}
