package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e2a extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ long s;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2a(yci yciVar, long j, float f, float f2, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = j;
        this.t = f;
        this.u = f2;
        this.v = i;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        xv7.k(this.r, this.s, this.t, this.u, (hq5) obj, rvf.R(this.v | 1), this.w);
        return Unit.a;
    }
}
