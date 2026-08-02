package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class kfa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xpd b;

    public /* synthetic */ kfa(xpd xpdVar, int i) {
        this.a = i;
        this.b = xpdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                xpd xpdVar = this.b;
                xpdVar.b.J(xpdVar.a);
                break;
            case 1:
                xpd xpdVar2 = this.b;
                xpdVar2.b.J(xpdVar2.a);
                break;
            case 2:
                xpd xpdVar3 = this.b;
                xpdVar3.b.J(xpdVar3.a);
                break;
            default:
                xpd xpdVar4 = this.b;
                xpdVar4.b.D(xpdVar4.a);
                break;
        }
        return Unit.a;
    }
}
