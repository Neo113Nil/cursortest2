package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class u73 extends uif implements Function2 {
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(Integer num, Object obj, yci yciVar, boolean z, long j, int i) {
        super(2);
        this.r = num;
        this.s = obj;
        this.t = yciVar;
        this.u = z;
        this.v = j;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4a.j(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
        return Unit.a;
    }
}
