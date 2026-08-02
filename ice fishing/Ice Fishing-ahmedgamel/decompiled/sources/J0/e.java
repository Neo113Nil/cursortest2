package J0;

import S7.InterfaceC0408w;
import androidx.work.CoroutineWorker;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public l f1411n;

    /* renamed from: u, reason: collision with root package name */
    public int f1412u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f1413v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1414w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, CoroutineWorker coroutineWorker, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f1413v = lVar;
        this.f1414w = coroutineWorker;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new e(this.f1413v, this.f1414w, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        A7.a aVar = A7.a.f215n;
        int i = this.f1412u;
        if (i == 0) {
            Q3.b.s(obj);
            l lVar2 = this.f1413v;
            this.f1411n = lVar2;
            this.f1412u = 1;
            Object foregroundInfo = this.f1414w.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = foregroundInfo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.f1411n;
            Q3.b.s(obj);
        }
        lVar.f1428n.j(obj);
        return u7.v.f41073a;
    }
}
