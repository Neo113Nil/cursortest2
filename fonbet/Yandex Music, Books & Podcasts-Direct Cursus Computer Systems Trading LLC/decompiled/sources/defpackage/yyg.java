package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class yyg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ czg b;

    public /* synthetic */ yyg(czg czgVar, int i) {
        this.a = i;
        this.b = czgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Drawable drawable = this.b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                czg czgVar = this.b;
                Semaphore semaphore = czgVar.Y;
                xr5 xr5Var = czgVar.o;
                if (xr5Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    xr5Var.q(czgVar.b.e());
                    if (czg.z0 && czgVar.K) {
                        if (czgVar.Z == null) {
                            czgVar.Z = new Handler(Looper.getMainLooper());
                            czgVar.v0 = new yyg(czgVar, 0);
                        }
                        czgVar.Z.post(czgVar.v0);
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
