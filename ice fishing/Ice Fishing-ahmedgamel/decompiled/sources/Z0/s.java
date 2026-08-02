package Z0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import h1.C4564b;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4011n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f4012u;

    public /* synthetic */ s(v vVar, int i) {
        this.f4011n = i;
        this.f4012u = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4011n) {
            case 0:
                Drawable drawable = this.f4012u;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f4012u;
                Semaphore semaphore = vVar.f4047n0;
                C4564b c4564b = vVar.f4025H;
                if (c4564b == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4564b.r(vVar.f4053u.h());
                    if (v.f4015t0 && vVar.f4045l0) {
                        if (vVar.f4048o0 == null) {
                            vVar.f4048o0 = new Handler(Looper.getMainLooper());
                            vVar.f4049p0 = new s(vVar, 0);
                        }
                        vVar.f4048o0.post(vVar.f4049p0);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
