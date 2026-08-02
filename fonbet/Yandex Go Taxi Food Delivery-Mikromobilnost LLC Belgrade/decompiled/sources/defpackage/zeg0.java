package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class zeg0 implements yt11 {
    public final r0 a;
    public final gci0 b;

    public zeg0(int i) {
        r0 c = bvf0.c(new yeg0(0));
        this.a = c;
        this.b = e.d(c);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, yeg0.a((yeg0) value, weg0.a, null, false, 6)));
    }

    public zeg0() {
        this(0);
    }
}
