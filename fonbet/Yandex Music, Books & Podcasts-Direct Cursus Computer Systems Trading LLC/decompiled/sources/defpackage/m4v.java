package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class m4v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4v b;

    public /* synthetic */ m4v(r4v r4vVar, int i) {
        this.a = i;
        this.b = r4vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n6v n6vVar = (n6v) obj2;
                ((m6v) obj).getClass();
                n6vVar.getClass();
                r4v r4vVar = this.b;
                r4vVar.a().a(wjb.Link, vq2.s(n6vVar, r4vVar.b()));
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((String) obj2).getClass();
                if (booleanValue) {
                    r4v r4vVar2 = this.b;
                    Object value = ((vdr) r4vVar2.e.getValue()).getValue();
                    Continuation continuation = null;
                    eav eavVar = value instanceof eav ? (eav) value : null;
                    if (eavVar != null) {
                        m6v m6vVar = eavVar.b.a;
                        z6v z6vVar = r4vVar2.a;
                        z6vVar.getClass();
                        x97.y(z6vVar.g, null, null, new npt(z6vVar, m6vVar, continuation, 29), 3);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
