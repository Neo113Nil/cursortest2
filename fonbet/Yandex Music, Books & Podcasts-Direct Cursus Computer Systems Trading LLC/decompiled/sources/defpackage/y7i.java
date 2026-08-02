package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class y7i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ c8i c;
    public final /* synthetic */ spd d;

    public /* synthetic */ y7i(Function2 function2, c8i c8iVar, spd spdVar, int i) {
        this.a = i;
        this.b = function2;
        this.c = c8iVar;
        this.d = spdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.d);
                break;
            default:
                this.b.invoke(this.c, this.d);
                break;
        }
        return Unit.a;
    }
}
