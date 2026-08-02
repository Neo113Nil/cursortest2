package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e7i implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7i b;
    public final /* synthetic */ pjc c;
    public final /* synthetic */ a0p d;
    public final /* synthetic */ xqn e;

    public /* synthetic */ e7i(j7i j7iVar, pjc pjcVar, a0p a0pVar, xqn xqnVar, int i) {
        this.a = i;
        this.b = j7iVar;
        this.c = pjcVar;
        this.d = a0pVar;
        this.e = xqnVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object B = xg.B(this.b, this.c, this.d, this.e, continuation);
                if (B != nm6.a) {
                    break;
                }
                break;
            default:
                ((Boolean) obj).getClass();
                Object B2 = xg.B(this.b, this.c, this.d, this.e, continuation);
                if (B2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
