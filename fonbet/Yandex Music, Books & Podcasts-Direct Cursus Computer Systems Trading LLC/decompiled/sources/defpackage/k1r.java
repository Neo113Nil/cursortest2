package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k1r extends uif implements Function2 {
    public final /* synthetic */ g1r r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ dup t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ float x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1r(g1r g1rVar, yci yciVar, dup dupVar, long j, long j2, long j3, float f, int i) {
        super(2);
        this.r = g1rVar;
        this.s = yciVar;
        this.t = dupVar;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = f;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l1r.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1));
        return Unit.a;
    }
}
