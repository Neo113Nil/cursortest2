package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends t8.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8.g f4785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f4786c;

    public l(t8.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        super(6);
        this.f4785b = gVar;
        this.f4786c = threadPoolExecutor;
    }

    @Override // t8.g
    public final void s(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4786c;
        try {
            this.f4785b.s(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // t8.g
    public final void t(S0.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f4786c;
        try {
            this.f4785b.t(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
