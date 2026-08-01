package V;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R.j f1227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1228b;

    public m(R.j jVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1227a = jVar;
        this.f1228b = threadPoolExecutor;
    }

    @Override // R.j
    public final void W(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1228b;
        try {
            this.f1227a.W(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // R.j
    public final void Z(B.k kVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1228b;
        try {
            this.f1227a.Z(kVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
