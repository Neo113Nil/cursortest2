package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p1r extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uqn s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1r(uqn uqnVar, Function1 function1, int i) {
        super(1);
        this.r = i;
        this.s = uqnVar;
        this.t = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                uqn uqnVar = this.s;
                float f = uqnVar.a - floatValue;
                uqnVar.a = f;
                this.t.invoke(Float.valueOf(f));
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                uqn uqnVar2 = this.s;
                float f2 = uqnVar2.a - floatValue2;
                uqnVar2.a = f2;
                this.t.invoke(Float.valueOf(f2));
                break;
        }
        return Unit.a;
    }
}
