package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i1p implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1p b;

    public /* synthetic */ i1p(m1p m1pVar, int i) {
        this.a = i;
        this.b = m1pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) this.b.a.b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                m1p m1pVar = this.b;
                x6k x6kVar = m1pVar.b;
                x6kVar.setValue(ybs.b((ybs) x6kVar.getValue(), "", 0L, 6));
                Function1 function1 = (Function1) m1pVar.a.c;
                if (function1 != null) {
                    function1.invoke("");
                }
                break;
        }
        return Unit.a;
    }
}
