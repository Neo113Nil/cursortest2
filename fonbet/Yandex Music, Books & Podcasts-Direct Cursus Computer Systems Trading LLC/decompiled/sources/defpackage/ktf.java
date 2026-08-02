package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ktf extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xod s;
    public final /* synthetic */ ltf t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ktf(xod xodVar, ltf ltfVar, int i) {
        super(1);
        this.r = i;
        this.s = xodVar;
        this.t = ltfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.h(((Number) ((fk0) obj).e()).floatValue());
                this.t.c.invoke();
                break;
            default:
                this.s.h(((Number) ((fk0) obj).e()).floatValue());
                this.t.c.invoke();
                break;
        }
        return Unit.a;
    }
}
