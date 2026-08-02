package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class owa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ iwa c;

    public /* synthetic */ owa(Function1 function1, iwa iwaVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = iwaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c.i.b);
                break;
            default:
                this.b.invoke(this.c.h.b);
                break;
        }
        return Unit.a;
    }
}
