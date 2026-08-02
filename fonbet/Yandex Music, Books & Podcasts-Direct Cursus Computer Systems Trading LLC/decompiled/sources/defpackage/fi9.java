package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class fi9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ oi9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi9(oi9 oi9Var, int i) {
        super(1);
        this.r = i;
        this.s = oi9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.setHintTextColor(((Number) obj).intValue());
                break;
            default:
                this.s.setHint((String) obj);
                break;
        }
        return Unit.a;
    }
}
