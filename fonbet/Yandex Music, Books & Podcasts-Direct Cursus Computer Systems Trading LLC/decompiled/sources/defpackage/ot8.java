package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ot8 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ p89 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot8(p89 p89Var) {
        super(1);
        this.s = p89Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Long valueOf = Long.valueOf(((Number) obj).longValue());
                p89 p89Var = this.s;
                p89Var.setItemSpacing(bg3.w(valueOf, p89Var.getResources().getDisplayMetrics()));
                break;
            default:
                this.s.setOrientation(kt8.a[((gt8) obj).ordinal()] == 1 ? 0 : 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot8(p89 p89Var, rt8 rt8Var) {
        super(1);
        this.s = p89Var;
    }
}
