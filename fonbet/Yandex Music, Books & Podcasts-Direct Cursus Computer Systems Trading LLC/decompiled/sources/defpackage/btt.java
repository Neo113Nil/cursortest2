package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class btt extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ dtt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ btt(dtt dttVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = dttVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new btt(this.k, continuation, 0);
            default:
                return new btt(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((btt) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        int i = this.j;
        dtt dttVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Map a = dtt.b(dttVar).a();
                Map a2 = dtt.d(dttVar).a();
                Map a3 = dtt.c(dttVar).a();
                n3m n3mVar = dttVar.e;
                reentrantLock = (ReentrantLock) n3mVar.b;
                reentrantLock.lock();
                try {
                    HashMap hashMap = (HashMap) n3mVar.d;
                    if (a == null) {
                        a = e5b.a;
                        a.getClass();
                    }
                    hashMap.putAll(a);
                    HashMap hashMap2 = (HashMap) n3mVar.e;
                    if (a2 == null) {
                        a2 = e5b.a;
                        a2.getClass();
                    }
                    hashMap2.putAll(a2);
                    HashMap hashMap3 = (HashMap) n3mVar.f;
                    if (a3 == null) {
                        a3 = e5b.a;
                        a3.getClass();
                    }
                    hashMap3.putAll(a3);
                    reentrantLock.unlock();
                    ((ymf) ((pv9) n3mVar.c).b).releaseShared(1);
                    return Unit.a;
                } finally {
                }
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                n3m n3mVar2 = dttVar.e;
                ((pv9) n3mVar2.c).q();
                reentrantLock = (ReentrantLock) n3mVar2.b;
                reentrantLock.lock();
                try {
                    HashMap hashMap4 = new HashMap((HashMap) n3mVar2.d);
                    HashMap hashMap5 = new HashMap((HashMap) n3mVar2.e);
                    HashMap hashMap6 = new HashMap((HashMap) n3mVar2.f);
                    reentrantLock.unlock();
                    dtt.b(dttVar).c(hashMap4);
                    dtt.d(dttVar).c(hashMap5);
                    dtt.c(dttVar).c(hashMap6);
                    return Unit.a;
                } finally {
                }
        }
    }
}
