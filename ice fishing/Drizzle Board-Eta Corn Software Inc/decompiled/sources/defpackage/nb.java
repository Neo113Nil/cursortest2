package defpackage;

import android.view.View;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ Object VgvYg0wo;
    public final /* synthetic */ Object wxUZMvaN;

    public /* synthetic */ nb(Object obj, Object obj2, Object obj3, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
        this.VgvYg0wo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.NCTxEWno) {
            case 0:
                pb pbVar = (pb) this.MdtA4re8;
                View view = (View) this.wxUZMvaN;
                kb kbVar = (kb) this.VgvYg0wo;
                pbVar.qoPGr6Ce.endViewTransition(view);
                kbVar.VgvYg0wo();
                return;
            default:
                k0 k0Var = (k0) this.MdtA4re8;
                ra raVar = (ra) this.wxUZMvaN;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.VgvYg0wo;
                try {
                    vh ygLcUYwZ = w30.ygLcUYwZ(k0Var.qoPGr6Ce);
                    if (ygLcUYwZ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    uh uhVar = (uh) ((ye) ygLcUYwZ.NCTxEWno);
                    synchronized (uhVar.MdtA4re8) {
                        uhVar.VgvYg0wo = threadPoolExecutor;
                    }
                    ((ye) ygLcUYwZ.NCTxEWno).qoPGr6Ce(new bf(raVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    raVar.WYNAV5pd(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
