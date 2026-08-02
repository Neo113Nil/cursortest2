package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class q9v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ q9v(Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.e = function04;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        switch (i) {
            case 0:
                zcoVar.a(((Number) this.b.invoke()).floatValue());
                Function0 function0 = this.c;
                zcoVar.k(((Number) function0.invoke()).floatValue());
                zcoVar.n(((Number) function0.invoke()).floatValue());
                zcoVar.x(zcoVar.q.getDensity() * ((cma) this.d.invoke()).a);
                zcoVar.y(zcoVar.q.getDensity() * ((cma) this.e.invoke()).a);
                break;
            default:
                zcoVar.a(((Number) this.b.invoke()).floatValue());
                Function0 function02 = this.c;
                zcoVar.k(((Number) function02.invoke()).floatValue());
                zcoVar.n(((Number) function02.invoke()).floatValue());
                zcoVar.x(zcoVar.q.getDensity() * ((cma) this.d.invoke()).a);
                zcoVar.y(zcoVar.q.getDensity() * ((cma) this.e.invoke()).a);
                break;
        }
        return Unit.a;
    }
}
