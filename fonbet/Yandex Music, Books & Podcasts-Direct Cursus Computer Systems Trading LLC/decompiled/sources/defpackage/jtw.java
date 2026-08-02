package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class jtw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltw b;

    public /* synthetic */ jtw(ltw ltwVar, int i) {
        this.a = i;
        this.b = ltwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (!this.b.d) {
                    break;
                } else {
                    Object V = x97.V(dm6.b, new pjt(this.b, null, 14), continuation);
                    if (V != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                wqw wqwVar = (wqw) obj;
                if (!this.b.d) {
                    break;
                } else {
                    Object V2 = x97.V(dm6.b(), new j9w(this.b, wqwVar, null, 9), continuation);
                    if (V2 != nm6.a) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
