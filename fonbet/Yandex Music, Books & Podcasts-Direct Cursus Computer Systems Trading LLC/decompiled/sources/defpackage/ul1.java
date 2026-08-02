package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ul1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lvf b;

    public /* synthetic */ ul1(lvf lvfVar, int i) {
        this.a = i;
        this.b = lvfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.f();
                break;
            case 2:
                this.b.g();
                break;
            case 3:
                this.b.f();
                break;
            case 4:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
        return Unit.a;
    }
}
