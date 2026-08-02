package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hl6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qbs s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl6(qbs qbsVar, int i) {
        super(1);
        this.r = i;
        this.s = qbsVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return new hi(7, this.s);
            default:
                long j = ((enj) obj).a;
                this.s.p();
                return Unit.a;
        }
    }
}
