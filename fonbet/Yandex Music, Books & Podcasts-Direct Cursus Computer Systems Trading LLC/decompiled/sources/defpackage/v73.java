package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class v73 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v73(String str, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = str;
        this.t = yciVar;
        this.u = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                quj.i(rvf.R(this.u | 1), hq5Var, this.t, this.s);
                break;
            case 1:
                quj.s(rvf.R(this.u | 1), hq5Var, this.t, this.s);
                break;
            default:
                lf7.i(rvf.R(this.u | 1), hq5Var, this.t, this.s);
                break;
        }
        return Unit.a;
    }
}
