package J;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f443g;

    public /* synthetic */ h(Context context, int i2) {
        this.f442f = i2;
        this.f443g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f442f) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f443g, 1));
                break;
            default:
                f.s(this.f443g, new d(), f.f429a, false);
                break;
        }
    }
}
