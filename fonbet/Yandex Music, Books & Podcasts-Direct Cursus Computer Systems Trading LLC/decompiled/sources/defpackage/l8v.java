package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l8v implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8v(pjc pjcVar, Object obj, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = obj;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new bnu(rjcVar, (m8v) this.c, 21), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                ((xdr) this.b).collect(new azu(2, rjcVar, (wfv) this.c), continuation);
                break;
            case 2:
                Object collect2 = this.b.collect(new bnu(rjcVar, (hov) this.c, 28), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect3 = this.b.collect(new azu(4, rjcVar, (cyv) this.c), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect4 = ((eno) this.b).collect(new azu(5, rjcVar, (uyv) this.c), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect5 = this.b.collect(new azu(6, rjcVar, (t1w) this.c), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect6 = ((e7v) this.b).collect(new oov(rjcVar, (ldw) this.c), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect7 = this.b.collect(new azu(8, rjcVar, (h4q) this.c), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect8 = ((za8) this.b).collect(new azu(9, rjcVar, (udw) this.c), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 9:
                Object collect9 = ((em) this.b).collect(new cs(rjcVar, (String) this.c, 11), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 10:
                Object collect10 = ((z78) this.b).collect(new azu(11, rjcVar, (qqw) this.c), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            case 11:
                Object collect11 = ((l8v) this.b).collect(new pm(this.c, (Object) new xqn(), (Object) new xqn(), rjcVar, 20), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
            case 12:
                Object collect12 = this.b.collect(new azu(12, rjcVar, (Pair) this.c), continuation);
                if (collect12 != nm6.a) {
                    break;
                }
                break;
            case 13:
                Object collect13 = ((v81) this.b).collect(new uhw(rjcVar, (xhw) this.c, 0), continuation);
                if (collect13 != nm6.a) {
                    break;
                }
                break;
            case 14:
                Object collect14 = this.b.collect(new uhw(rjcVar, (xhw) this.c, 1), continuation);
                if (collect14 != nm6.a) {
                    break;
                }
                break;
            case 15:
                Object collect15 = ((bca) this.b).collect(new uhw(rjcVar, (xhw) this.c, 2), continuation);
                if (collect15 != nm6.a) {
                    break;
                }
                break;
            case 16:
                Object collect16 = ((yc4) this.b).collect(new tmw(rjcVar, (anw) this.c, 0), continuation);
                if (collect16 != nm6.a) {
                    break;
                }
                break;
            case 17:
                Object collect17 = this.b.collect(new tmw(rjcVar, (anw) this.c, 1), continuation);
                if (collect17 != nm6.a) {
                    break;
                }
                break;
            case 18:
                Object collect18 = ((tc4) this.b).collect(new azu(16, rjcVar, (hnw) this.c), continuation);
                if (collect18 != nm6.a) {
                    break;
                }
                break;
            case 19:
                Object collect19 = ((l8v) this.b).collect(new azu(17, rjcVar, (epw) this.c), continuation);
                if (collect19 != nm6.a) {
                    break;
                }
                break;
            case 20:
                Object collect20 = this.b.collect(new azu(18, rjcVar, (wpw) this.c), continuation);
                if (collect20 != nm6.a) {
                    break;
                }
                break;
            case 21:
                Object collect21 = this.b.collect(new sdw(rjcVar, (oqw) this.c), continuation);
                if (collect21 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect22 = this.b.collect(new azu(19, rjcVar, (ltw) this.c), continuation);
                if (collect22 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
