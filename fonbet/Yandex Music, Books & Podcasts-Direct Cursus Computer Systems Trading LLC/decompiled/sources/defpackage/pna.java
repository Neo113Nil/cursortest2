package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pna extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uqn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pna(uqn uqnVar, int i) {
        super(2);
        this.r = i;
        this.s = uqnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                ((lfm) obj).a();
                this.s.a = floatValue;
                break;
            default:
                float floatValue2 = ((Number) obj2).floatValue();
                ((lfm) obj).a();
                this.s.a = floatValue2;
                break;
        }
        return Unit.a;
    }
}
