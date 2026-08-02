package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nbi extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ sdr t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbi(long j, sdr sdrVar, int i) {
        super(1);
        this.r = i;
        this.s = j;
        this.t = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jpa.B((jpa) obj, this.s, 0L, 0L, yhn.c(((Number) this.t.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                break;
            default:
                jpa.B((jpa) obj, this.s, 0L, 0L, yhn.c(((Number) this.t.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                break;
        }
        return Unit.a;
    }
}
