package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class rl1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ lvf c;

    public /* synthetic */ rl1(Function0 function0, lvf lvfVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = lvfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                this.c.f();
                break;
            case 1:
                this.b.invoke();
                this.c.f();
                break;
            case 2:
                this.b.invoke();
                this.c.g();
                break;
            case 3:
                this.b.invoke();
                this.c.f();
                break;
            default:
                this.b.invoke();
                this.c.g();
                break;
        }
        return Unit.a;
    }
}
