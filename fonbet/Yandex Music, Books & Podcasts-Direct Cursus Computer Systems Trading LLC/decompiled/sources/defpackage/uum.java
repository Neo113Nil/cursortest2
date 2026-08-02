package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uum extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ long s;
    public final /* synthetic */ float t;
    public final /* synthetic */ long u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uum(yci yciVar, long j, float f, long j2, int i, int i2, int i3) {
        super(2);
        this.r = yciVar;
        this.s = j;
        this.t = f;
        this.u = j2;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vum.b(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
        return Unit.a;
    }
}
