package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2i b;

    public /* synthetic */ e2i(g2i g2iVar, int i) {
        this.a = i;
        this.b = g2iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                g2i g2iVar = this.b;
                u0i u0iVar = new u0i(g2iVar.k, g2iVar.l, new lhd(28, g2iVar), new e2i(g2iVar, 1));
                g2iVar.o = u0iVar;
                return u0iVar;
            default:
                g2i g2iVar2 = this.b;
                g2iVar2.q.f();
                x97.y(ot0.F(g2iVar2), null, null, new m1i(g2iVar2, null, 1), 3);
                return Unit.a;
        }
    }
}
