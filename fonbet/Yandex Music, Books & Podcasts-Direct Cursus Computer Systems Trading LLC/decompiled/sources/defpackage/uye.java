package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class uye extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Boolean s;
    public final /* synthetic */ yci t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uye(Boolean bool, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = bool;
        this.t = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                x97.k(this.s, this.t, hq5Var, rvf.R(1));
                break;
            default:
                hyf.d(this.s, this.t, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
