package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qdo extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rdo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdo(rdo rdoVar, int i) {
        super(1);
        this.r = i;
        this.s = rdoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.s.n.c(yhn.b(doubleValue, r10.e, r10.f)));
            default:
                return Double.valueOf(yhn.b(this.s.k.c(((Number) obj).doubleValue()), r10.e, r10.f));
        }
    }
}
