package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o90 extends defpackage.h90 {
    public int P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public o90(int i, int i2, int i3) {
        this.WDYagTQQm9ns = i3;
        this.oh71FJcDz6S2 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.QiMR8OkAhezm = z;
        this.P05cfTpS5W5L = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.QiMR8OkAhezm;
    }

    @Override // defpackage.h90
    public final int nextInt() {
        int i = this.P05cfTpS5W5L;
        if (i != this.oh71FJcDz6S2) {
            this.P05cfTpS5W5L = this.WDYagTQQm9ns + i;
            return i;
        }
        if (this.QiMR8OkAhezm) {
            this.QiMR8OkAhezm = false;
            return i;
        }
        defpackage.h7.BHfvd2J71qpO();
        return 0;
    }
}
