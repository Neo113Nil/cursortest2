package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e1s extends uif implements Function2 {
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ wn5 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1s(long j, long j2, boolean z, wn5 wn5Var, int i) {
        super(2);
        this.r = j;
        this.s = j2;
        this.t = z;
        this.u = wn5Var;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f1s.d(this.r, this.s, this.t, this.u, (hq5) obj, rvf.R(this.v | 1));
        return Unit.a;
    }
}
