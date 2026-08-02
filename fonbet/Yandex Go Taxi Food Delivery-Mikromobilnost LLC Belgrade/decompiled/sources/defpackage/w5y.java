package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class w5y implements m3u0 {
    public final int a;
    public final int b;
    public final oz40 c;
    public int w;

    public w5y(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = f.i(y6i0.n(Math.max(i4 - i3, 0), i4 + i2 + i3), ngd0.F);
        this.w = i;
    }

    public final void a(int i) {
        if (i != this.w) {
            this.w = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            this.c.setValue(y6i0.n(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return (d6w) this.c.getValue();
    }
}
