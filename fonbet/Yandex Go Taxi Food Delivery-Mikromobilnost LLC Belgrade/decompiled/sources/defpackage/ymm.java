package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ymm implements qrq0, cnm {
    public final qrq0 a;
    public final int b;

    public ymm(qrq0 qrq0Var, int i) {
        this.a = qrq0Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        w511.f(oyr.e('.', i, "count must be non-negative, but was "));
        throw null;
    }

    @Override // defpackage.cnm
    public final qrq0 a(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new c8x0(this, i) : new pyu0(this.a, i2, i3);
    }

    @Override // defpackage.cnm
    public final qrq0 drop(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new ymm(this, i) : new ymm(this.a, i2);
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new xmm(this);
    }
}
