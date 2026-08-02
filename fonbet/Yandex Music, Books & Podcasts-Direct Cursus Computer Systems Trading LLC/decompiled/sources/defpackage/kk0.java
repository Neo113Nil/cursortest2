package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kk0 implements ok0 {
    public final hk0 a;
    public final hk0 b;

    public kk0(hk0 hk0Var, hk0 hk0Var2) {
        this.a = hk0Var;
        this.b = hk0Var2;
    }

    @Override // defpackage.ok0
    public final cs2 a() {
        return new n8r(this.a.a(), this.b.a());
    }

    @Override // defpackage.ok0
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.ok0
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
