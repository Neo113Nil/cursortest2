package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class sjv implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ kjv c;

    public /* synthetic */ sjv(float f, kjv kjvVar) {
        this.b = f;
        this.c = kjvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                kjv kjvVar = this.c;
                jpa.O(jpaVar, wjv.k(kjvVar.a), 0L, 0L, null, 126);
                jpa.O(jpaVar, wjv.k(kjvVar.b), 0L, 0L, new amr(this.b, 0.0f, 0, 0, 30), 110);
                break;
            default:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                float f = this.b;
                float f2 = f / 2.0f;
                long i = swf.i(f2, f2);
                long i2 = a4g.i(nmq.d(jpaVar2.e()) - f, nmq.b(jpaVar2.e()) - f);
                kjv kjvVar2 = this.c;
                jpa.O(jpaVar2, wjv.k(kjvVar2.a), i, i2, null, 120);
                jpa.O(jpaVar2, wjv.k(kjvVar2.b), i, i2, new amr(f, 0.0f, 0, 0, 30), 104);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sjv(kjv kjvVar, float f) {
        this.c = kjvVar;
        this.b = f;
    }
}
