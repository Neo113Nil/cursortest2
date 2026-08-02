package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class x2m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3m b;
    public final /* synthetic */ int c;

    public /* synthetic */ x2m(a3m a3mVar, int i, int i2) {
        this.a = i2;
        this.b = a3mVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m3m m3mVar = this.b.b;
                m3mVar.getClass();
                m3mVar.H(new ro6(this.c, 0, m3mVar, 1));
                break;
            case 1:
                m3m m3mVar2 = this.b.b;
                if (((k3m) m3mVar2.n.getValue()) instanceof j3m) {
                    m3mVar2.H(new ro6(this.c, ((j3m) r1).b.size() - 1, m3mVar2, 1));
                }
                break;
            case 2:
                m3m m3mVar3 = this.b.b;
                int i = this.c;
                m3mVar3.getClass();
                m3mVar3.H(new ro6(i, i - 1, m3mVar3, 1));
                break;
            case 3:
                m3m m3mVar4 = this.b.b;
                int i2 = this.c;
                m3mVar4.getClass();
                m3mVar4.H(new ro6(i2, i2 + 1, m3mVar4, 1));
                break;
            case 4:
                m3m m3mVar5 = this.b.b;
                m3mVar5.getClass();
                m3mVar5.H(new qo1(this.c, m3mVar5, 5));
                break;
            default:
                m3m m3mVar6 = this.b.b;
                m3mVar6.getClass();
                m3mVar6.H(new qo1(this.c, m3mVar6, 5));
                break;
        }
        return Unit.a;
    }
}
