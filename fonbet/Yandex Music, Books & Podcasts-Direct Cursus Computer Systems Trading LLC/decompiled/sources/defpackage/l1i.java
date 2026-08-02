package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1i b;

    public /* synthetic */ l1i(o1i o1iVar, int i) {
        this.a = i;
        this.b = o1iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                o1i o1iVar = this.b;
                break;
            case 1:
                this.b.m.g();
                break;
            default:
                o1i o1iVar2 = this.b;
                o1iVar2.m.f();
                x97.y(ot0.F(o1iVar2), null, null, new m1i(o1iVar2, null, 0), 3);
                break;
        }
        return Unit.a;
    }
}
