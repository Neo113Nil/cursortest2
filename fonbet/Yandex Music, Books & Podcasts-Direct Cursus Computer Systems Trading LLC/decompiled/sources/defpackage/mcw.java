package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mcw implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm b;
    public final /* synthetic */ String c;

    public /* synthetic */ mcw(qm qmVar, String str, int i) {
        this.a = i;
        this.b = qmVar;
        this.c = str;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new cs(rjcVar, this.c, 7), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new cs(rjcVar, this.c, 8), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new cs(rjcVar, this.c, 9), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect4 = this.b.collect(new cs(rjcVar, this.c, 10), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
