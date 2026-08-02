package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class abs extends uif implements Function2 {
    public final /* synthetic */ long r;
    public final /* synthetic */ ges s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abs(long j, ges gesVar, Function2 function2, int i, int i2) {
        super(2);
        this.r = j;
        this.s = gesVar;
        this.t = function2;
        this.u = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cbs.b(this.r, this.s, this.t, (hq5) obj, rvf.R(this.u | 1), this.v);
        return Unit.a;
    }
}
