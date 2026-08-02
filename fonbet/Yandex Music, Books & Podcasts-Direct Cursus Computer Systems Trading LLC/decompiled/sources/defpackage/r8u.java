package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class r8u implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r8u(int i, Function0 function0, boolean z) {
        this.a = i;
        this.b = function0;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        switch (i) {
            case 0:
                float floatValue = ((Number) this.b.invoke()).floatValue();
                yk5 yk5Var = w8u.d;
                boolean z = this.c;
                float g = w8u.g(z, yk5Var, floatValue);
                zcoVar.c(true);
                zcoVar.r(ugo.a(g));
                fq4 fq4Var = w8u.f;
                zcoVar.a(((Float.valueOf(fq4Var.b).floatValue() - Float.valueOf(fq4Var.a).floatValue()) * floatValue) + (z ? Float.valueOf(fq4Var.b) : Float.valueOf(fq4Var.a)).floatValue());
                break;
            default:
                float c = yhn.c(((Number) this.b.invoke()).floatValue(), 0.0f, 1.0f);
                float f = 1.0f - (0.3f * c);
                zcoVar.k(f);
                zcoVar.n(f);
                zcoVar.a(1.0f - c);
                if (this.c) {
                    zcoVar.y(zcoVar.q.getDensity() * w0v.a * c);
                }
                break;
        }
        return Unit.a;
    }
}
