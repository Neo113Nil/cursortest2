package J0;

import S7.InterfaceC0408w;
import androidx.work.CoroutineWorker;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class f extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f1415n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1416u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f1416u = coroutineWorker;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new f(this.f1416u, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f1415n;
        CoroutineWorker coroutineWorker = this.f1416u;
        try {
            if (i == 0) {
                Q3.b.s(obj);
                this.f1415n = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().j((p) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().k(th);
        }
        return u7.v.f41073a;
    }
}
