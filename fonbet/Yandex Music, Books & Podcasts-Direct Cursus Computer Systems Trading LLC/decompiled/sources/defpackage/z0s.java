package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z0s extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ wn5 t;
    public final /* synthetic */ wn5 u;
    public final /* synthetic */ yci v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0s(boolean z, Function0 function0, wn5 wn5Var, wn5 wn5Var2, yci yciVar, boolean z2, long j, long j2, int i) {
        super(2);
        this.r = z;
        this.s = function0;
        this.t = wn5Var;
        this.u = wn5Var2;
        this.v = yciVar;
        this.w = z2;
        this.x = j;
        this.y = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(3457);
        f1s.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (hq5) obj, R);
        return Unit.a;
    }
}
