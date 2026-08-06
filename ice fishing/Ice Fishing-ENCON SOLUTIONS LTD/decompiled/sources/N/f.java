package N;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1133b;

    public /* synthetic */ f(Context context, int i2) {
        this.f1132a = i2;
        this.f1133b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1132a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f1133b, 1));
                break;
            default:
                e.s(this.f1133b, new c(), e.f1122a, false);
                break;
        }
    }
}
