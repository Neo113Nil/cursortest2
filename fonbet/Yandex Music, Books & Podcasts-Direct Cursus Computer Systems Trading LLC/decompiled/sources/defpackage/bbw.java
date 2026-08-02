package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class bbw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ cbw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbw(cbw cbwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = cbwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new bbw(this.k, continuation, 0);
            default:
                return new bbw(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((bbw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        HashSet u0;
        Object t7oVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                yjj yjjVar = this.k.v;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((ove) next).E();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                this.k.L();
                return Unit.a;
        }
    }
}
