package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class y0i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1i b;

    public /* synthetic */ y0i(b1i b1iVar, int i) {
        this.a = i;
        this.b = b1iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b1i b1iVar = this.b;
                u0i u0iVar = new u0i(b1iVar.k, b1iVar.l, new lhd(25, b1iVar), new y0i(b1iVar, 1));
                b1iVar.o = u0iVar;
                return u0iVar;
            default:
                b1i b1iVar2 = this.b;
                b1iVar2.q.f();
                x97.y(ot0.F(b1iVar2), null, null, new jmd(b1iVar2, null, 29), 3);
                return Unit.a;
        }
    }
}
