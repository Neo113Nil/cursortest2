package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class h15 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc4 b;
    public final /* synthetic */ u12 c;

    public /* synthetic */ h15(tc4 tc4Var, u12 u12Var, int i) {
        this.a = i;
        this.b = tc4Var;
        this.c = u12Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g15(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new g15(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new g15(rjcVar, this.c, 2), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect4 = this.b.collect(new g15(rjcVar, this.c, 3), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
