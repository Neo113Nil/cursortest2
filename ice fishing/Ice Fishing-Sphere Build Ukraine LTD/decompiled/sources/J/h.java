package J;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f449f;

    public /* synthetic */ h(Context context, int i2) {
        this.f448e = i2;
        this.f449f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f448e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f449f, 1));
                break;
            default:
                f.s(this.f449f, new d(), f.f435a, false);
                break;
        }
    }
}
