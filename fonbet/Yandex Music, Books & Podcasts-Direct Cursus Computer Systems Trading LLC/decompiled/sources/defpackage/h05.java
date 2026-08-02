package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h05 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc4 b;
    public final /* synthetic */ e15 c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ h05(tc4 tc4Var, e15 e15Var, Integer num, int i) {
        this.a = i;
        this.b = tc4Var;
        this.c = e15Var;
        this.d = num;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g05(rjcVar, this.c, this.d, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new g05(rjcVar, this.c, this.d, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new g05(rjcVar, this.c, this.d, 2), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
