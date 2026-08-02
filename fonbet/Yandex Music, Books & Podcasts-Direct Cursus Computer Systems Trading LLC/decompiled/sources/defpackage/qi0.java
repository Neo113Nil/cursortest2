package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qi0 extends uif implements Function2 {
    public final /* synthetic */ onj r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ i2o t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ float w;
    public final /* synthetic */ yci x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(onj onjVar, boolean z, i2o i2oVar, boolean z2, long j, float f, yci yciVar, int i) {
        super(2);
        this.r = onjVar;
        this.s = z;
        this.t = i2oVar;
        this.u = z2;
        this.v = j;
        this.w = f;
        this.x = yciVar;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        qld.s(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1));
        return Unit.a;
    }
}
