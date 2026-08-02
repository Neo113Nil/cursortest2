package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends A8.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A8.b f4753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f4754c;

    public l(A8.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4753b = bVar;
        this.f4754c = threadPoolExecutor;
    }

    @Override // A8.b
    public final void r(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4754c;
        try {
            this.f4753b.r(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // A8.b
    public final void s(S0.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f4754c;
        try {
            this.f4753b.s(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
