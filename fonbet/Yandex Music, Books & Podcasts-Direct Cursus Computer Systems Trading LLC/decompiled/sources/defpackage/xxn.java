package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class xxn extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ayn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxn(ayn aynVar, int i) {
        super(1);
        this.r = i;
        this.s = aynVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.y(enj.f(this.s.e()));
                break;
            case 1:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.x(enj.e(this.s.e()));
                break;
            case 2:
                zco zcoVar3 = (zco) obj;
                zcoVar3.getClass();
                zcoVar3.y(enj.f(((enj) this.s.t.e()).a));
                break;
            default:
                zco zcoVar4 = (zco) obj;
                zcoVar4.getClass();
                zcoVar4.x(enj.e(((enj) this.s.t.e()).a));
                break;
        }
        return Unit.a;
    }
}
