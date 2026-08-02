package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pmq extends uif implements Function1 {
    public final /* synthetic */ long r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ mfh u;
    public final /* synthetic */ ksk v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmq(qmq qmqVar, long j, int i, int i2, mfh mfhVar, ksk kskVar) {
        super(1);
        this.r = j;
        this.s = i;
        this.t = i2;
        this.u = mfhVar;
        this.v = kskVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        long j = (this.s << 32) | (this.t & 4294967295L);
        xof layoutDirection = this.u.getLayoutDirection();
        long j2 = this.r;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == xof.a ? -1.0f : (-1) * (-1.0f);
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 - 1.0f) * f2;
        jsk.f(jskVar, this.v, (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32));
        return Unit.a;
    }
}
