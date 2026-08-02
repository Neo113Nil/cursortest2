package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class np3 implements jx7 {
    public nj3 a = p4b.a;
    public ix6 b;

    public final ix6 a(Function1 function1) {
        return b(new mp3(0, function1));
    }

    public final ix6 b(Function1 function1) {
        ix6 ix6Var = new ix6(28);
        ix6Var.b = function1;
        this.b = ix6Var;
        return ix6Var;
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.a.getDensity().i0();
    }
}
