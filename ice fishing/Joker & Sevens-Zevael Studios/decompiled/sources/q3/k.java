package q3;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.a f5769c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5770d;

    public k(a.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f5769c = aVar;
        this.f5770d = threadPoolExecutor;
    }

    @Override // a.a
    public final void E(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5770d;
        try {
            this.f5769c.E(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.a
    public final void F(x4.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5770d;
        try {
            this.f5769c.F(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
