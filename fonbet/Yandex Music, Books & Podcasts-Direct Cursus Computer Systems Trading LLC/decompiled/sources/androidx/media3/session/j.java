package androidx.media3.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.alp;
import defpackage.blp;
import defpackage.bnp;
import defpackage.dvt;
import defpackage.e48;
import defpackage.fd;
import defpackage.gb7;
import defpackage.hkh;
import defpackage.jkh;
import defpackage.kkh;
import defpackage.lcg;
import defpackage.loh;
import defpackage.mzb;
import defpackage.pv7;
import defpackage.qne;
import defpackage.qzc;
import defpackage.xkt;
import defpackage.ykh;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(mzb mzbVar, MediaNotificationManager mediaNotificationManager, MediaSessionService mediaSessionService) {
        this.b = mediaSessionService;
        this.c = mediaNotificationManager;
        this.d = mzbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                MediaSessionService mediaSessionService = (MediaSessionService) obj3;
                MediaNotificationManager mediaNotificationManager = (MediaNotificationManager) obj2;
                mzb mzbVar = (mzb) obj;
                i iVar = mzbVar.a;
                int i2 = MediaSessionService.g;
                MediaSessionService mediaSessionService2 = mediaNotificationManager.a;
                HashMap hashMap = mediaNotificationManager.g;
                if (!hashMap.containsKey(mzbVar)) {
                    h hVar = new h(mzbVar, mediaNotificationManager, mediaSessionService2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    bnp bnpVar = iVar.j;
                    bnpVar.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    dvt.C();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    ykh ykhVar = new ykh(mainLooper);
                    dvt.c0(new Handler(mainLooper), new hkh(ykhVar, new kkh(mediaSessionService2, bnpVar, bundle3, hVar, mainLooper, ykhVar, bnpVar.a.y() ? new qne(new gb7(mediaSessionService2)) : null), 0));
                    hashMap.put(mzbVar, new loh(ykhVar));
                    ykhVar.a(new f(mediaNotificationManager, ykhVar, hVar, mzbVar), mediaNotificationManager.e);
                }
                iVar.w = new qzc(14, mediaSessionService);
                break;
            default:
                kkh kkhVar = (kkh) obj3;
                String str = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                kkhVar.l1();
                jkh jkhVar = kkhVar.c;
                xkt it = (!jkhVar.isConnected() ? blp.b : jkhVar.M0()).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        alp alpVar = (alp) it.next();
                        if (alpVar.a == 0 && alpVar.b.equals(str)) {
                            r2 = alpVar;
                        }
                    }
                }
                if (r2 != null) {
                    kkhVar.l1();
                    if ((!jkhVar.isConnected() ? blp.b : jkhVar.M0()).a.contains(r2)) {
                        alp alpVar2 = new alp(bundle4, str);
                        Bundle bundle5 = Bundle.EMPTY;
                        lcg k1 = kkhVar.k1(alpVar2);
                        k1.a(new pv7(k1, new fd(str), z, 9), e48.a);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ j(MediaNotificationManager mediaNotificationManager, kkh kkhVar, String str, Bundle bundle) {
        this.b = kkhVar;
        this.c = str;
        this.d = bundle;
    }
}
