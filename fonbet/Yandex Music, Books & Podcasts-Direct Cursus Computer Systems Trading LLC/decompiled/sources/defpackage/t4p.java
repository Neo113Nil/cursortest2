package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class t4p implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6p b;
    public final /* synthetic */ int c;

    public /* synthetic */ t4p(g6p g6pVar, int i, int i2) {
        this.a = i2;
        this.b = g6pVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n7n n7nVar = (n7n) obj;
                Function0 function0 = (Function0) obj2;
                n7nVar.getClass();
                function0.getClass();
                this.b.S(n7nVar, this.c, function0);
                break;
            default:
                p7p p7pVar = (p7p) obj;
                String str = (String) obj2;
                p7pVar.getClass();
                str.getClass();
                this.b.n0(p7pVar, this.c, str);
                break;
        }
        return Unit.a;
    }
}
