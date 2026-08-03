package a4;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f248h;

    public /* synthetic */ i(Context context, int i10) {
        this.f247g = i10;
        this.f248h = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f247g) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f248h, 1));
                break;
            default:
                g.t(this.f248h, new e(0), g.f236a, false);
                break;
        }
    }
}
