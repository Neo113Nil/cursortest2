package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class fvr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fvr(float f, int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uqn uqnVar = (uqn) this.c;
                Function1 function1 = (Function1) this.d;
                float f = uqnVar.a;
                float f2 = this.b;
                if (f < (-f2)) {
                    function1.invoke(xur.a);
                } else if (f > f2) {
                    function1.invoke(xur.b);
                }
                uqnVar.a = 0.0f;
                return Unit.a;
            default:
                return Integer.valueOf(((two) this.c).d.h() != 0 ? yhn.d(eeh.b(r0.a.h() / this.b), 0, ((List) this.d).size() - 1) : 0);
        }
    }
}
