package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class q73 extends uif implements Function2 {
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(Integer num, Object obj, yci yciVar, boolean z, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.r = num;
        this.s = obj;
        this.t = yciVar;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = i;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4a.i(this.r, this.s, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1), this.y);
        return Unit.a;
    }
}
