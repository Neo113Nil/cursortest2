package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class xn0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ b6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn0(b6 b6Var, int i) {
        super(0);
        this.r = i;
        this.s = b6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                Object u = this.s.u();
                u.getClass();
                return u;
            default:
                Object v = this.s.v();
                v.getClass();
                return v;
        }
    }
}
