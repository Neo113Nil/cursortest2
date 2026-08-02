package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ycw implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7v b;
    public final /* synthetic */ ldw c;
    public final /* synthetic */ ldw d;

    public /* synthetic */ ycw(e7v e7vVar, ldw ldwVar, ldw ldwVar2, int i) {
        this.a = i;
        this.b = e7vVar;
        this.c = ldwVar;
        this.d = ldwVar2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new oov(rjcVar, this.c, this.d, 18), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new oov(rjcVar, this.c, this.d, 19), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new oov(rjcVar, this.c, this.d, 20), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect4 = this.b.collect(new oov(rjcVar, this.c, this.d, 21), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
