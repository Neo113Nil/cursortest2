package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m1w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1w b;

    public /* synthetic */ m1w(t1w t1wVar, int i) {
        this.a = i;
        this.b = t1wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((x2w) this.b.r.getValue()).a();
                break;
            default:
                ((x2w) this.b.r.getValue()).a();
                break;
        }
        return Unit.a;
    }
}
