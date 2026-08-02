package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sum extends uif implements Function2 {
    public final /* synthetic */ float r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sum(float f, yci yciVar, long j, float f2, long j2, int i, int i2) {
        super(2);
        this.r = f;
        this.s = yciVar;
        this.t = j;
        this.u = f2;
        this.v = j2;
        this.w = i;
        this.x = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vum.a(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
        return Unit.a;
    }
}
