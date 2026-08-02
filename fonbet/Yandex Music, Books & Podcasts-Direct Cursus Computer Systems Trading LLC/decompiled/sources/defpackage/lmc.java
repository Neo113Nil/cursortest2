package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class lmc implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc[] b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lmc(pjc[] pjcVarArr, syc sycVar, int i) {
        this.a = i;
        this.b = pjcVarArr;
        this.c = sycVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uyc] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, vyc] */
    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object y = tt0.y(rjcVar, new l1(null, this.c), continuation, wg.s, this.b);
                if (y != nm6.a) {
                    break;
                }
                break;
            default:
                pjc[] pjcVarArr = this.b;
                Object y2 = tt0.y(rjcVar, new gv6((Continuation) null, (vyc) this.c), continuation, new auu(pjcVarArr, 2), pjcVarArr);
                if (y2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
