package defpackage;

import com.yandex.passport.internal.ui.sloth.plusdevices.f0;
import com.yandex.passport.internal.ui.sloth.webauthn.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bxe extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxe(Function0 function0, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                bxe bxeVar = new bxe(this.l, continuation, 0);
                bxeVar.k = obj;
                return bxeVar;
            case 1:
                bxe bxeVar2 = new bxe(this.l, continuation, 1);
                bxeVar2.k = obj;
                return bxeVar2;
            default:
                bxe bxeVar3 = new bxe(this.l, continuation, 2);
                bxeVar3.k = obj;
                return bxeVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((bxe) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((bxe) create((f0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((bxe) create((q) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.j;
        Function0 function0 = this.l;
        switch (i2) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                CoroutineContext coroutineContext = ((mm6) this.k).getCoroutineContext();
                try {
                    ags agsVar = new ags();
                    agsVar.f = saf.W(saf.Q(coroutineContext), true, agsVar);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ags.g;
                    try {
                        do {
                            i = atomicIntegerFieldUpdater.get(agsVar);
                            if (i != 0) {
                                if (i != 2 && i != 3) {
                                    ags.n(i);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(agsVar, i, 0));
                        return function0.invoke();
                    } finally {
                        agsVar.m();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 1:
                f0 f0Var = (f0) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (f0Var != null) {
                    function0.invoke();
                    return Unit.a;
                }
                b6e.s();
                return null;
            default:
                q qVar = (q) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(qVar, q.a)) {
                    function0.invoke();
                    return Unit.a;
                }
                b6e.s();
                return null;
        }
    }
}
