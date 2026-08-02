package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wcn implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ x3n c;

    public /* synthetic */ wcn(pjc pjcVar, x3n x3nVar, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = x3nVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new ucn(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new ucn(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
