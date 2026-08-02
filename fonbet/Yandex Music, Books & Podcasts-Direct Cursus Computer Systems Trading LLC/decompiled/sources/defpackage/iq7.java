package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class iq7 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq7 b;

    public /* synthetic */ iq7(nq7 nq7Var, int i) {
        this.a = i;
        this.b = nq7Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                y4d y4dVar = (y4d) obj;
                nq7 nq7Var = this.b;
                xdr xdrVar = nq7Var.t;
                q7q q7qVar = new q7q(y4dVar);
                xdrVar.getClass();
                Continuation continuation2 = null;
                xdrVar.m(null, q7qVar);
                k4d k4dVar = y4dVar.b;
                rar rarVar = nq7Var.q;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                nq7Var.q = x97.y(nq7Var.p, null, null, new bv6(nq7Var, k4dVar, continuation2, 24), 3);
                break;
            case 1:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                String str = (String) pair.b;
                ssg.a(3, "DefaultSharedGenerativePlaybackQueue", "watchPlaybackState: isPlaying=" + booleanValue + " streamId=" + str, null);
                nq7.b(this.b, booleanValue ? e4d.PLAY : e4d.PAUSE, false, str, a3l.a);
                break;
            default:
                d6l d6lVar = (d6l) obj;
                mwk b = d6lVar.a.b();
                b.getClass();
                nq7.b(this.b, d6lVar.b == w0l.b ? e4d.PLAY : e4d.PAUSE, false, ((k4d) b).a.a, a3l.a);
                break;
        }
        return Unit.a;
    }
}
