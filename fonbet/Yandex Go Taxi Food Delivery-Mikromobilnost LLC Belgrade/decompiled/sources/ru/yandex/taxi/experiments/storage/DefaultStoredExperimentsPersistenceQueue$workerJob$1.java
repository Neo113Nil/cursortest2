package ru.yandex.taxi.experiments.storage;

import defpackage.hst;
import defpackage.jq6;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgg;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.xkh;
import defpackage.ykh;
import defpackage.zkh;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.storage.DefaultStoredExperimentsPersistenceQueue$workerJob$1", f = "StoredExperimentsPersistenceQueue.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DefaultStoredExperimentsPersistenceQueue$workerJob$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStoredExperimentsPersistenceQueue$workerJob$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultStoredExperimentsPersistenceQueue$workerJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultStoredExperimentsPersistenceQueue$workerJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:7:0x003c, B:9:0x0044, B:21:0x004e, B:14:0x0031, B:11:0x0073, B:13:0x0077, B:18:0x008a, B:19:0x008f, B:26:0x005b, B:28:0x0061, B:29:0x006c, B:24:0x0072, B:36:0x0025), top: B:2:0x000a, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:7:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 jq6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    AtomicReference atomicReference = this.this$0.b;
                    while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
                    }
                    hst hstVar = jst.e;
                    Throwable th2 = (Throwable) this.this$0.b.get();
                    if (th2 != null) {
                        th = th2;
                    }
                    xby.t(hstVar, "CachedExperimentsContract", th, null, 10);
                }
                if (i == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.channels.a aVar = this.this$0.a;
                    aVar.getClass();
                    jq6Var = new jq6(aVar);
                    this.L$0 = jq6Var;
                    this.label = 1;
                    obj = jq6Var.a(this);
                    if (obj == coroutineSingletons) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                    this.this$0.a.a(null);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jq6Var = (jq6) this.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    zkh zkhVar = (zkh) jq6Var.b();
                    if (zkhVar instanceof ykh) {
                        try {
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception e2) {
                            a aVar2 = this.this$0;
                            if (aVar2.e == null) {
                                aVar2.e = new qgg(((ykh) zkhVar).a, e2, 1);
                            }
                            xby.t(jst.e, "CachedExperimentsContract", e2, null, 10);
                        }
                        ((ykh) zkhVar).b.invoke();
                    } else {
                        if (!(zkhVar instanceof xkh)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((xkh) zkhVar).b.invoke(a.a(this.this$0, ((xkh) zkhVar).a));
                    }
                    this.L$0 = jq6Var;
                    this.label = 1;
                    obj = jq6Var.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                this.this$0.a.a(null);
                return zy11.a;
            } catch (CancellationException e3) {
                AtomicReference atomicReference2 = this.this$0.b;
                while (!atomicReference2.compareAndSet(null, e3) && atomicReference2.get() == null) {
                }
                throw e3;
            }
        } catch (Throwable th3) {
            this.this$0.a.a(null);
            throw th3;
        }
    }
}
