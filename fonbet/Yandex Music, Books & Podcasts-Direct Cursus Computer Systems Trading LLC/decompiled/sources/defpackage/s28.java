package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s28 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t28 s;
    public final /* synthetic */ vi4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s28(t28 t28Var, vi4 vi4Var, int i) {
        super(0);
        this.r = i;
        this.s = t28Var;
        this.t = vi4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.a.C(this.t, e27.I, p1j.b);
            default:
                return this.s.a.C(this.t, e27.J, p1j.b);
        }
    }
}
