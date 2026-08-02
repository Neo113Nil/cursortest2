package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class sud implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6k b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ sud(q6k q6kVar, Function0 function0, Function1 function1, int i) {
        this.a = i;
        this.b = q6kVar;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                avd avdVar = (avd) this.b;
                o43 o43Var = avdVar.m;
                if (o43Var != null) {
                    this.d.invoke(o43Var.a);
                }
                if (avdVar.n) {
                    this.c.invoke();
                }
                break;
            default:
                yud yudVar = (yud) this.b;
                o43 o43Var2 = yudVar.m;
                if (o43Var2 != null) {
                    this.d.invoke(o43Var2.a);
                }
                if (yudVar.n) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
