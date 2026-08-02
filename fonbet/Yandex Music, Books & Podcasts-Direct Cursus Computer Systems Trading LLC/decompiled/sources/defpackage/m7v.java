package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class m7v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7v b;

    public /* synthetic */ m7v(n7v n7vVar, int i) {
        this.a = 0;
        this.b = n7vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                v7g.k(this.b, (hq5) obj, R);
                break;
            case 1:
                m6v m6vVar = (m6v) obj;
                n6v n6vVar = (n6v) obj2;
                m6vVar.getClass();
                n6vVar.getClass();
                rmb.k(this.b.b, n6vVar.f, sj2.o(m6vVar), null, 4);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((String) obj2).getClass();
                if (booleanValue) {
                    p7v p7vVar = this.b.d;
                    m6v m6vVar2 = p7vVar.k;
                    if (p7vVar.n) {
                        boolean z = m6vVar2.j;
                        List list = m6vVar2.g;
                        if (z && !list.isEmpty()) {
                            z6v z6vVar = p7vVar.m;
                            c9v c9vVar = new c9v(m6vVar2.a, (String) CollectionsKt.Q(list));
                            z6vVar.getClass();
                            x97.y(z6vVar.g, null, null, new npt(z6vVar, c9vVar, (Continuation) null, 28), 3);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ m7v(n7v n7vVar, int i, byte b) {
        this.a = i;
        this.b = n7vVar;
    }
}
