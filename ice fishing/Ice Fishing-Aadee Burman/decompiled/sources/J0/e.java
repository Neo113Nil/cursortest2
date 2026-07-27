package J0;

import S7.InterfaceC0404w;
import androidx.work.CoroutineWorker;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public m f1382n;

    /* renamed from: u, reason: collision with root package name */
    public int f1383u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f1384v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, CoroutineWorker coroutineWorker, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f1384v = mVar;
        this.f1385w = coroutineWorker;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new e(this.f1384v, this.f1385w, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        A7.a aVar = A7.a.f58n;
        int i = this.f1383u;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            m mVar2 = this.f1384v;
            this.f1382n = mVar2;
            this.f1383u = 1;
            Object foregroundInfo = this.f1385w.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj = foregroundInfo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.f1382n;
            com.bumptech.glide.d.k(obj);
        }
        mVar.f1400n.j(obj);
        return u7.v.f41350a;
    }
}
