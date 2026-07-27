package X0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import f1.C4499b;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3659n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f3660u;

    public /* synthetic */ s(v vVar, int i) {
        this.f3659n = i;
        this.f3660u = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3659n) {
            case 0:
                Drawable drawable = this.f3660u;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f3660u;
                Semaphore semaphore = vVar.f3696s0;
                C4499b c4499b = vVar.f3673H;
                if (c4499b == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4499b.r(vVar.f3698u.h());
                    if (v.f3664y0 && vVar.f3694q0) {
                        if (vVar.f3697t0 == null) {
                            vVar.f3697t0 = new Handler(Looper.getMainLooper());
                            vVar.f3699u0 = new s(vVar, 0);
                        }
                        vVar.f3697t0.post(vVar.f3699u0);
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
