package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zmr extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmr(yci yciVar, Function2 function2, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = function2;
        this.t = i;
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.t | 1);
        int i = this.u;
        u2x.p(this.r, this.s, (hq5) obj, R, i);
        return Unit.a;
    }
}
