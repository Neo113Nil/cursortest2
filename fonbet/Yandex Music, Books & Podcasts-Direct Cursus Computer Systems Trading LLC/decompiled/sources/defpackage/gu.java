package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class gu implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ bca b;
    public final /* synthetic */ String c;

    public /* synthetic */ gu(bca bcaVar, String str, int i) {
        this.a = i;
        this.b = bcaVar;
        this.c = str;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new cs(rjcVar, this.c, 1), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new cs(rjcVar, this.c, 2), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new cs(rjcVar, this.c, 6), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
