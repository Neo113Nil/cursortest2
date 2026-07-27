package J0;

import S7.InterfaceC0404w;
import androidx.work.CoroutineWorker;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class f extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f1386n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1387u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f1387u = coroutineWorker;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new f(this.f1387u, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f1386n;
        CoroutineWorker coroutineWorker = this.f1387u;
        try {
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                this.f1386n = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().j((q) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().k(th);
        }
        return u7.v.f41350a;
    }
}
