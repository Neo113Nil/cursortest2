package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n1k implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pjc c;

    public /* synthetic */ n1k(pjc pjcVar, int i, int i2) {
        this.a = i2;
        this.c = pjcVar;
        this.b = i;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = ((h7a) this.c).collect(new mh2(rjcVar, this.b, 3), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                fkn fknVar = (fkn) this.c;
                Object collect2 = fknVar.a.collect(new mh2(rjcVar, this.b, 4), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
