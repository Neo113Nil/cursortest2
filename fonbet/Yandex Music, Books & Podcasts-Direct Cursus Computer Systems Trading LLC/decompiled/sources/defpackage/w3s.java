package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class w3s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3s b;

    public /* synthetic */ w3s(y3s y3sVar, int i) {
        this.a = i;
        this.b = y3sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        switch (this.a) {
            case 0:
                y3s y3sVar = this.b;
                d3s d3sVar = y3sVar.k;
                if (y3sVar.q) {
                    list = null;
                } else {
                    list = y3sVar.l;
                    y3sVar.q = true;
                }
                n3s n3sVar = new n3s(d3sVar, list, y3sVar.n, y3sVar.o, new w3s(y3sVar, 1), new w3s(y3sVar, 2));
                y3sVar.p = n3sVar;
                break;
            case 1:
                this.b.s.g();
                break;
            default:
                y3s y3sVar2 = this.b;
                y3sVar2.s.f();
                x97.y(ot0.F(y3sVar2), null, null, new glp(y3sVar2, null, 21), 3);
                break;
        }
        return Unit.a;
    }
}
