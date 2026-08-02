package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class acc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ msd c;

    public /* synthetic */ acc(Function0 function0, msd msdVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = msdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                this.c.a(0);
                break;
            default:
                this.b.invoke();
                this.c.a(0);
                break;
        }
        return Unit.a;
    }
}
