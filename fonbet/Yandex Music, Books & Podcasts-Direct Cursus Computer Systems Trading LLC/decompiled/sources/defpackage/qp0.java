package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qp0 extends uif implements Function2 {
    public final /* synthetic */ wn5 r;
    public final /* synthetic */ opv s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ pyc v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(wn5 wn5Var, opv opvVar, yci yciVar, Function2 function2, pyc pycVar, long j, long j2, float f, int i) {
        super(2);
        this.r = wn5Var;
        this.s = opvVar;
        this.t = yciVar;
        this.u = function2;
        this.v = pycVar;
        this.w = j;
        this.x = j2;
        this.y = f;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        sp0.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (hq5) obj, rvf.R(this.z | 1));
        return Unit.a;
    }
}
