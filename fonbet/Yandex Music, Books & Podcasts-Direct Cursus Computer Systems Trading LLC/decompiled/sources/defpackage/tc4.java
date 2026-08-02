package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public class tc4 extends sc4 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public tc4(Function2 function2, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(coroutineContext, i, oi3Var);
        this.e = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.sc4
    public Object e(ltm ltmVar, Continuation continuation) {
        switch (this.d) {
            case 0:
                Object invoke = ((aur) this.e).invoke(ltmVar, continuation);
                if (invoke != nm6.a) {
                    break;
                }
                break;
            default:
                ngp ngpVar = new ngp(ltmVar);
                Iterator it = ((Iterable) this.e).iterator();
                while (it.hasNext()) {
                    x97.y(ltmVar, null, null, new cs1((pjc) it.next(), ngpVar, null, 22), 3);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.sc4
    public sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        switch (this.d) {
            case 0:
                return new tc4((Function2) this.e, coroutineContext, i, oi3Var);
            default:
                return new tc4((Iterable) this.e, coroutineContext, i, oi3Var);
        }
    }

    @Override // defpackage.sc4
    public qln i(mm6 mm6Var) {
        switch (this.d) {
            case 1:
                Function2 cs1Var = new cs1(this, (Continuation) null, 20);
                oi3 oi3Var = oi3.a;
                pm6 pm6Var = pm6.a;
                ktm ktmVar = new ktm(bm6.b(mm6Var, this.a), men.g(this.b, 4, oi3Var), true, true);
                ktmVar.o0(pm6Var, ktmVar, cs1Var);
                return ktmVar;
            default:
                return super.i(mm6Var);
        }
    }

    @Override // defpackage.sc4
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((aur) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    public tc4(Iterable iterable, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(coroutineContext, i, oi3Var);
        this.e = iterable;
    }
}
