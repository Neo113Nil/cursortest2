package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pt8 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ c2a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt8(c2a c2aVar) {
        super(1);
        this.s = c2aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Long valueOf = Long.valueOf(((Number) obj).longValue());
                c2a c2aVar = this.s;
                c2aVar.setItemSpacing(bg3.w(valueOf, c2aVar.getResources().getDisplayMetrics()));
                break;
            default:
                this.s.setWrapDirection(kt8.a[((gt8) obj).ordinal()] == 1 ? 0 : 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt8(c2a c2aVar, rt8 rt8Var) {
        super(1);
        this.s = c2aVar;
    }
}
