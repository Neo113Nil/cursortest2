package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u62 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tnc b;
    public final /* synthetic */ w62 c;

    public /* synthetic */ u62(tnc tncVar, w62 w62Var, int i) {
        this.a = i;
        this.b = tncVar;
        this.c = w62Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g62(rjcVar, this.c, 4), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new g62(rjcVar, this.c, 5), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
