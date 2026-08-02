package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class td1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fud b;

    public /* synthetic */ td1(fud fudVar, int i) {
        this.a = i;
        this.b = fudVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, this.b.a(), 0L, 0L, 0.0f, null, 0, 126);
                break;
            default:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                jpa.B(jpaVar2, this.b.a(), 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return Unit.a;
    }
}
