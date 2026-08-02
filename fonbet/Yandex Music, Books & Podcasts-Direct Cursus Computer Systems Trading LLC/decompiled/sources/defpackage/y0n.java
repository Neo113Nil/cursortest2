package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y0n extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ d1n s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0n(boolean z, d1n d1nVar, yci yciVar, long j, long j2, int i) {
        super(2);
        this.r = z;
        this.s = d1nVar;
        this.t = yciVar;
        this.u = j;
        this.v = j2;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        z0n.a(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
        return Unit.a;
    }
}
