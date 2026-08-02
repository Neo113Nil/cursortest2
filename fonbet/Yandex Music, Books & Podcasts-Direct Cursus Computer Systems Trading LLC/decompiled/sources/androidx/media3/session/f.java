package androidx.media3.session;

import android.os.Bundle;
import defpackage.kkh;
import defpackage.mzb;
import defpackage.ykh;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MediaNotificationManager b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(MediaNotificationManager mediaNotificationManager, mzb mzbVar, String str, Bundle bundle, kkh kkhVar) {
        this.b = mediaNotificationManager;
        this.c = str;
        this.d = bundle;
        this.e = kkhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = (String) this.c;
                Bundle bundle = (Bundle) this.d;
                kkh kkhVar = (kkh) this.e;
                MediaNotificationManager mediaNotificationManager = this.b;
                mediaNotificationManager.e.execute(new j(mediaNotificationManager, kkhVar, str, bundle));
                break;
            default:
                ykh ykhVar = (ykh) this.c;
                h hVar = (h) this.d;
                mzb mzbVar = (mzb) this.e;
                MediaNotificationManager mediaNotificationManager2 = this.b;
                mediaNotificationManager2.getClass();
                try {
                    kkh kkhVar2 = (kkh) ykhVar.get(0L, TimeUnit.MILLISECONDS);
                    if (mediaNotificationManager2.d(mzbVar)) {
                        hVar.a.h(hVar.b, false);
                    }
                    kkhVar2.j0(hVar);
                    break;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    mediaNotificationManager2.a.i(mzbVar);
                }
        }
    }

    public /* synthetic */ f(MediaNotificationManager mediaNotificationManager, ykh ykhVar, h hVar, mzb mzbVar) {
        this.b = mediaNotificationManager;
        this.c = ykhVar;
        this.d = hVar;
        this.e = mzbVar;
    }
}
