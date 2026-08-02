package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qm implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qm(pjc pjcVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = ((em) this.b).collect(new pm(rjcVar, (rm) this.c, (mqs) this.d, (mwk) this.e, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((tc4) this.b).collect(new pm(rjcVar, (e15) this.c, (String) this.d, (Integer) this.e, 3), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((alc) this.b).collect(new pm(rjcVar, (nuj) this.c, (fx6) this.d, (xqn) this.e, 8), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new pm(rjcVar, (tqn) this.c, (hxc) this.d, (toh) this.e, 11), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((u21) this.b).collect(new pm(rjcVar, (j7i) this.c, (bf5) this.d, (a0p) this.e, 12), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new pm(rjcVar, (n7q) this.c, (v84) this.d, (g08) this.e, 14), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new pm(rjcVar, (n7q) this.c, (uz7) this.d, (ybl) this.e, 15), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((bca) this.b).collect(new pm(rjcVar, this.c, (String) this.d, (String) this.e, 19), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect9 = this.b.collect(new hyl(rjcVar, (AtomicBoolean) this.c, (ykw) this.d, (sqw) this.e), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
