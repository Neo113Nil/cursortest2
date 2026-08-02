package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ti2 extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti2(int i, int i2, Function0 function0, boolean z) {
        super(2);
        this.r = z;
        this.s = function0;
        this.t = i;
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pd.c(rvf.R(this.t | 1), this.u, (hq5) obj, this.s, this.r);
        return Unit.a;
    }
}
