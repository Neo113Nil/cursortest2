package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vbs extends uif implements Function2 {
    public final /* synthetic */ klx r;
    public final /* synthetic */ vne s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ jdp v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ wn5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbs(klx klxVar, vne vneVar, long j, long j2, jdp jdpVar, boolean z, wn5 wn5Var, int i) {
        super(2);
        this.r = klxVar;
        this.s = vneVar;
        this.t = j;
        this.u = j2;
        this.v = jdpVar;
        this.w = z;
        this.x = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(1769473);
        this.r.S(this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, R);
        return Unit.a;
    }
}
