package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kp implements fp {
    public final Context GWasM1elztuh;

    public kp(Context context, int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = context;
                break;
            default:
                this.GWasM1elztuh = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.fp
    public void GWasM1elztuh(final vc0 vc0Var) {
        nf nfVar = new nf("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), nfVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: ip
            @Override // java.lang.Runnable
            public final void run() {
                kp kpVar = kp.this;
                vc0 vc0Var2 = vc0Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    iu mE4lRynR = n30.mE4lRynR(kpVar.GWasM1elztuh);
                    if (mE4lRynR == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    hu huVar = (hu) mE4lRynR.GWasM1elztuh;
                    synchronized (huVar.xqGvceK5x) {
                        huVar.EljAMC1QTz = threadPoolExecutor2;
                    }
                    mE4lRynR.GWasM1elztuh.GWasM1elztuh(new jp(vc0Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    vc0Var2.M3K9sHhK(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }
}
