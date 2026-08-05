package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0CKDypm implements Runnable {
    public final /* synthetic */ Context MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ z0CKDypm(Context context, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dq dqVar;
        Object obj;
        Context context;
        int i = this.NCTxEWno;
        Context context2 = this.MdtA4re8;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 < 33) {
                            dqVar = DQL61DDk.wxUZMvaN;
                            break;
                        } else {
                            z0 z0Var = DQL61DDk.Qr9iLBAD;
                            z0Var.getClass();
                            t0 t0Var = new t0(z0Var);
                            while (true) {
                                if (t0Var.hasNext()) {
                                    DQL61DDk dQL61DDk = (DQL61DDk) ((WeakReference) t0Var.next()).get();
                                    if (dQL61DDk != null && (context = ((SJ7tYVsF) dQL61DDk).ow5vqvCr) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                dqVar = new dq(new eq(Su7p563N.qoPGr6Ce(obj)));
                                if (dqVar.qoPGr6Ce.qoPGr6Ce.isEmpty()) {
                                    String fVMzMhyS = w30.fVMzMhyS(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        Su7p563N.NCTxEWno(systemService, waJRZaZX.qoPGr6Ce(fVMzMhyS));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            dqVar = dq.NCTxEWno;
                            if (dqVar.qoPGr6Ce.qoPGr6Ce.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                DQL61DDk.b2ZJblxo = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new z0CKDypm(context2, 2));
                break;
            default:
                le0.HdOGZAzC(context2, new m0(1), le0.Qr9iLBAD, false);
                break;
        }
    }
}
