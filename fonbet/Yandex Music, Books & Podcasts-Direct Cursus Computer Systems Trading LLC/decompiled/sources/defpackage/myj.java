package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class myj extends uif implements Function1 {
    public final /* synthetic */ mfh A;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ksk t;
    public final /* synthetic */ ksk u;
    public final /* synthetic */ ksk v;
    public final /* synthetic */ ksk w;
    public final /* synthetic */ ksk x;
    public final /* synthetic */ ksk y;
    public final /* synthetic */ nyj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj(int i, int i2, ksk kskVar, ksk kskVar2, ksk kskVar3, ksk kskVar4, ksk kskVar5, ksk kskVar6, nyj nyjVar, mfh mfhVar) {
        super(1);
        this.r = i;
        this.s = i2;
        this.t = kskVar;
        this.u = kskVar2;
        this.v = kskVar3;
        this.w = kskVar4;
        this.x = kskVar5;
        this.y = kskVar6;
        this.z = nyjVar;
        this.A = mfhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        nyj nyjVar = this.z;
        float f = nyjVar.c;
        boolean z = nyjVar.b;
        mfh mfhVar = this.A;
        float density = mfhVar.getDensity();
        xof layoutDirection = mfhVar.getLayoutDirection();
        o0k o0kVar = nyjVar.d;
        float f2 = lyj.a;
        int b = eeh.b(o0kVar.d() * density);
        int b2 = eeh.b(a.f(o0kVar, layoutDirection) * density);
        float f3 = cbs.b * density;
        int i = this.r;
        ksk kskVar = this.t;
        if (kskVar != null) {
            jsk.g(jskVar, kskVar, 0, dfi.a(1, 0.0f, (i - kskVar.b) / 2.0f));
        }
        ksk kskVar2 = this.u;
        if (kskVar2 != null) {
            jsk.g(jskVar, kskVar2, this.s - kskVar2.a, dfi.a(1, 0.0f, (i - kskVar2.b) / 2.0f));
        }
        ksk kskVar3 = this.w;
        if (kskVar3 != null) {
            jsk.g(jskVar, kskVar3, eeh.b(kskVar == null ? 0.0f : (1 - f) * (kskVar.a - f3)) + b2, fxf.K(z ? dfi.a(1, 0.0f, (i - kskVar3.b) / 2.0f) : b, f, -(kskVar3.b / 2)));
        }
        jsk.g(jskVar, this.v, kskVar != null ? kskVar.a : 0, Math.max(z ? dfi.a(1, 0.0f, (i - r2.b) / 2.0f) : b, (kskVar3 != null ? kskVar3.b : 0) / 2));
        ksk kskVar4 = this.x;
        if (kskVar4 != null) {
            if (z) {
                b = dfi.a(1, 0.0f, (i - kskVar4.b) / 2.0f);
            }
            jsk.g(jskVar, kskVar4, kskVar != null ? kskVar.a : 0, Math.max(b, (kskVar3 != null ? kskVar3.b : 0) / 2));
        }
        jsk.f(jskVar, this.y, 0L);
        return Unit.a;
    }
}
