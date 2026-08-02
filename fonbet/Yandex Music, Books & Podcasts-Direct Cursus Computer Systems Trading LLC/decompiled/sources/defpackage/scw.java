package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class scw implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ za8 b;
    public final /* synthetic */ ldw c;

    public /* synthetic */ scw(za8 za8Var, ldw ldwVar, int i) {
        this.a = i;
        this.b = za8Var;
        this.c = ldwVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new rcw(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new rcw(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new rcw(rjcVar, this.c, 2), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new rcw(rjcVar, this.c, 3), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect5 = this.b.collect(new rcw(rjcVar, this.c, 4), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
