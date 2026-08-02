package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class hjf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ fvf d;
    public final /* synthetic */ k2s e;

    public /* synthetic */ hjf(Function1 function1, mm6 mm6Var, fvf fvfVar, k2s k2sVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = mm6Var;
        this.d = fvfVar;
        this.e = k2sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i) {
            case 0:
                this.b.invoke(num);
                x97.y(this.c, null, null, new ijf(this.d, this.e, null, 0), 3);
                break;
            default:
                this.b.invoke(num);
                x97.y(this.c, null, null, new ijf(this.d, this.e, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
