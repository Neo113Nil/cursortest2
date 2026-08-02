package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d83 extends uif implements Function1 {
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ int t;
    public final /* synthetic */ dup u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d83(float f, float f2, int i, dup dupVar, boolean z) {
        super(1);
        this.r = f;
        this.s = f2;
        this.t = i;
        this.u = dupVar;
        this.v = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zco zcoVar = (zco) obj;
        float density = zcoVar.q.getDensity() * this.r;
        float density2 = zcoVar.q.getDensity() * this.s;
        zcoVar.h((density <= 0.0f || density2 <= 0.0f) ? null : new z73(density, density2, this.t));
        dup dupVar = this.u;
        if (dupVar == null) {
            dupVar = vnj.i;
        }
        zcoVar.r(dupVar);
        zcoVar.c(this.v);
        return Unit.a;
    }
}
