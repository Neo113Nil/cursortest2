package androidx.media3.session;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import defpackage.byn;
import defpackage.dsh;
import defpackage.dvt;
import defpackage.dyg;
import defpackage.j4x;
import defpackage.jkh;
import defpackage.juc;
import defpackage.kkh;
import defpackage.ko7;
import defpackage.koh;
import defpackage.leu;
import defpackage.loh;
import defpackage.msh;
import defpackage.muh;
import defpackage.mzb;
import defpackage.nuh;
import defpackage.qsn;
import defpackage.rf0;
import defpackage.rj7;
import defpackage.u8e;
import defpackage.ude;
import defpackage.vq1;
import defpackage.wrh;
import defpackage.xth;
import defpackage.xy0;
import defpackage.yde;
import defpackage.ykh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class MediaSessionService extends Service {
    public static final /* synthetic */ int g = 0;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final xy0 c = new xy0(0);
    public muh d;
    public j4x e;
    public com.yandex.music.shared.media.session.session.b f;
    private MediaNotificationManager mediaNotificationManager;

    public final void a(mzb mzbVar) {
        mzb mzbVar2;
        boolean z = true;
        vq1.u("session is already released", !mzbVar.a.k());
        synchronized (this.a) {
            mzbVar2 = (mzb) this.c.get(mzbVar.a.i);
            if (mzbVar2 != null && mzbVar2 != mzbVar) {
                z = false;
            }
            vq1.u("Session ID should be unique", z);
            this.c.put(mzbVar.a.i, mzbVar);
        }
        if (mzbVar2 == null) {
            dvt.c0(this.b, new j(mzbVar, c(null), this));
        }
    }

    public final j4x b() {
        j4x j4xVar;
        synchronized (this.a) {
            try {
                if (this.e == null) {
                    this.e = new j4x(this);
                }
                j4xVar = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ko7] */
    public final MediaNotificationManager c(byn bynVar) {
        MediaNotificationManager mediaNotificationManager;
        synchronized (this.a) {
            try {
                if (this.mediaNotificationManager == null) {
                    if (bynVar == null) {
                        vq1.C(getBaseContext(), "Accessing service context before onCreate()");
                        Context applicationContext = getApplicationContext();
                        rj7 rj7Var = new rj7(4);
                        vq1.A(!false);
                        bynVar = new ko7(applicationContext, rj7Var, "default_channel_id", R.string.default_notification_channel_name);
                    }
                    this.mediaNotificationManager = new MediaNotificationManager(this, bynVar, b());
                }
                mediaNotificationManager = this.mediaNotificationManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaNotificationManager;
    }

    public final ArrayList d() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.c.values());
        }
        return arrayList;
    }

    public final boolean e(mzb mzbVar) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.c.containsKey(mzbVar.a.i);
        }
        return containsKey;
    }

    public abstract mzb f(wrh wrhVar);

    public void g(final mzb mzbVar, final boolean z) {
        yde ydeVar;
        final MediaNotificationManager c = c(null);
        if (!c.a.e(mzbVar) || !c.d(mzbVar)) {
            c.e(true);
            j4x j4xVar = c.j;
            if (j4xVar != null) {
                c.c.b.cancel(null, j4xVar.b);
                c.i++;
                c.j = null;
                return;
            }
            return;
        }
        int i = c.i + 1;
        c.i = i;
        kkh a = c.a(mzbVar);
        a.getClass();
        a.l1();
        jkh jkhVar = a.c;
        if (jkhVar.isConnected()) {
            ydeVar = jkhVar.N0();
        } else {
            ude udeVar = yde.b;
            ydeVar = qsn.e;
        }
        final yde ydeVar2 = ydeVar;
        final c cVar = new c(c, i, mzbVar);
        dvt.c0(new Handler(mzbVar.a().X()), new Runnable() { // from class: androidx.media3.session.d
            @Override // java.lang.Runnable
            public final void run() {
                final MediaNotificationManager mediaNotificationManager = MediaNotificationManager.this;
                koh kohVar = mediaNotificationManager.h;
                j4x j4xVar2 = mediaNotificationManager.b;
                final mzb mzbVar2 = mzbVar;
                final j4x a2 = ((ko7) kohVar).a(mzbVar2, ydeVar2, j4xVar2, cVar);
                b bVar = mediaNotificationManager.e;
                final boolean z2 = z;
                bVar.execute(new Runnable() { // from class: androidx.media3.session.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaNotificationManager.this.f(mzbVar2, a2, z2);
                    }
                });
            }
        });
    }

    public final boolean h(mzb mzbVar, boolean z) {
        try {
            g(mzbVar, c(null).c(z));
            return true;
        } catch (IllegalStateException e) {
            if (dvt.a < 31 || !rf0.q(e)) {
                throw e;
            }
            vq1.L("MSessionService", "Failed to start foreground", e);
            this.b.post(new dyg(9, this));
            return false;
        }
    }

    public final void i(final mzb mzbVar) {
        synchronized (this.a) {
            vq1.u("session not found", this.c.containsKey(mzbVar.a.i));
            this.c.remove(mzbVar.a.i);
        }
        final MediaNotificationManager c = c(null);
        dvt.c0(this.b, new Runnable() { // from class: androidx.media3.session.k
            @Override // java.lang.Runnable
            public final void run() {
                int i = MediaSessionService.g;
                HashMap hashMap = MediaNotificationManager.this.g;
                mzb mzbVar2 = mzbVar;
                loh lohVar = (loh) hashMap.remove(mzbVar2);
                if (lohVar != null) {
                    ykh ykhVar = lohVar.a;
                    if (!ykhVar.cancel(false)) {
                        try {
                            ((kkh) leu.O(ykhVar)).a();
                        } catch (CancellationException | ExecutionException e) {
                            vq1.o0("MediaController", "MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                mzbVar2.a.w = null;
            }
        });
    }

    public final void j(byn bynVar) {
        synchronized (this.a) {
            c(bynVar).h = bynVar;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        muh muhVar;
        nuh nuhVar;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.a) {
                muhVar = this.d;
                vq1.B(muhVar);
            }
            return muhVar;
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        mzb f = f(new wrh(new xth("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
        a(f);
        i iVar = f.a;
        synchronized (iVar.a) {
            try {
                if (iVar.x == null) {
                    msh mshVar = ((dsh) iVar.k.a.h.l.b).c;
                    nuh nuhVar2 = new nuh(iVar);
                    nuhVar2.a(mshVar);
                    iVar.x = nuhVar2;
                }
                nuhVar = iVar.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nuhVar.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        synchronized (this.a) {
            this.d = new muh(this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        synchronized (this.a) {
            try {
                muh muhVar = this.d;
                if (muhVar != null) {
                    muhVar.a.clear();
                    muhVar.h.removeCallbacksAndMessages(null);
                    Iterator it = muhVar.j.iterator();
                    while (it.hasNext()) {
                        try {
                            ((u8e) it.next()).d();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        mzb mzbVar;
        mzb mzbVar2;
        if (intent != null) {
            j4x b = b();
            Uri data = intent.getData();
            if (data != null) {
                synchronized (mzb.b) {
                    try {
                        Iterator it = mzb.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                mzbVar2 = null;
                                break;
                            }
                            mzbVar2 = (mzb) it.next();
                            if (Objects.equals(mzbVar2.a.b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                mzbVar = mzbVar2;
            } else {
                mzbVar = null;
            }
            b.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (mzbVar == null) {
                    mzbVar = f(new wrh(new xth("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    a(mzbVar);
                }
                i iVar = mzbVar.a;
                iVar.l.post(new juc(27, iVar, intent));
                return 1;
            }
            if (mzbVar != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    MediaNotificationManager c = c(null);
                    kkh a = c.a(mzbVar);
                    if (a != null) {
                        dvt.c0(new Handler(mzbVar.a().X()), new f(c, mzbVar, str, bundle, a));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (c(null).b()) {
            ArrayList d = d();
            for (int i = 0; i < d.size(); i++) {
                if (((mzb) d.get(i)).a().e()) {
                    return;
                }
            }
        }
        MediaNotificationManager c = c(null);
        MediaSessionService mediaSessionService = c.a;
        c.l = false;
        Handler handler = c.d;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            ArrayList d2 = mediaSessionService.d();
            for (int i2 = 0; i2 < d2.size(); i2++) {
                mediaSessionService.h((mzb) d2.get(i2), false);
            }
        }
        ArrayList d3 = d();
        for (int i3 = 0; i3 < d3.size(); i3++) {
            ((mzb) d3.get(i3)).a().L(false);
        }
        stopSelf();
    }
}
