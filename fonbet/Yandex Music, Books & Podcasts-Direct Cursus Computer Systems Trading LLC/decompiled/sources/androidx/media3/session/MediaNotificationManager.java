package androidx.media3.session;

import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.u0;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import defpackage.dsh;
import defpackage.dvt;
import defpackage.etn;
import defpackage.j4x;
import defpackage.kkh;
import defpackage.koh;
import defpackage.leu;
import defpackage.loh;
import defpackage.mzb;
import defpackage.psh;
import defpackage.vq1;
import defpackage.wvs;
import defpackage.ykh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class MediaNotificationManager implements Handler.Callback {
    public final MediaSessionService a;
    public final j4x b;
    public final u0 c;
    public final Handler d;
    public final b e;
    public final Intent f;
    public final HashMap g;
    public koh h;
    public int i;
    public j4x j;
    public boolean k;
    public boolean l;
    public final long m;
    private boolean startedInForeground;

    public MediaNotificationManager(MediaSessionService mediaSessionService, koh kohVar, j4x j4xVar) {
        this.a = mediaSessionService;
        this.h = kohVar;
        this.b = j4xVar;
        this.c = new u0(mediaSessionService);
        Looper mainLooper = Looper.getMainLooper();
        int i = dvt.a;
        this.d = new Handler(mainLooper, this);
        this.e = new b(this);
        this.f = new Intent(mediaSessionService, mediaSessionService.getClass());
        this.g = new HashMap();
        this.startedInForeground = false;
        this.l = true;
        this.m = 600000L;
    }

    public final kkh a(mzb mzbVar) {
        loh lohVar = (loh) this.g.get(mzbVar);
        if (lohVar == null) {
            return null;
        }
        ykh ykhVar = lohVar.a;
        if (!ykhVar.isDone()) {
            return null;
        }
        try {
            return (kkh) leu.O(ykhVar);
        } catch (ExecutionException e) {
            wvs.m(e);
            return null;
        }
    }

    public final boolean b() {
        return this.startedInForeground;
    }

    public final boolean c(boolean z) {
        boolean z2;
        ArrayList d = this.a.d();
        for (int i = 0; i < d.size(); i++) {
            kkh a = a((mzb) d.get(i));
            if (a != null && ((a.g0() || z) && (a.c() == 3 || a.c() == 2))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.l;
        long j = this.m;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.k;
        Handler handler = this.d;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.k = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean d(mzb mzbVar) {
        kkh a = a(mzbVar);
        if (a == null || a.V().p()) {
            return false;
        }
        loh lohVar = (loh) this.g.get(mzbVar);
        lohVar.getClass();
        if (a.c() != 1) {
            lohVar.b = false;
        }
        return !lohVar.b;
    }

    public final void e(boolean z) {
        int i = dvt.a;
        MediaSessionService mediaSessionService = this.a;
        if (i >= 24) {
            mediaSessionService.stopForeground(z ? 1 : 2);
        } else {
            mediaSessionService.stopForeground(z);
        }
        this.startedInForeground = false;
    }

    public final void f(mzb mzbVar, j4x j4xVar, boolean z) {
        MediaSession.Token token = (MediaSession.Token) ((dsh) mzbVar.a.h.l.b).c.b;
        Notification notification = (Notification) j4xVar.c;
        int i = j4xVar.b;
        notification.extras.putParcelable("android.mediaSession", token);
        this.j = j4xVar;
        if (!z) {
            this.c.d(null, i, notification);
            e(false);
            return;
        }
        Intent intent = this.f;
        MediaSessionService mediaSessionService = this.a;
        etn.h0(mediaSessionService, intent);
        if (dvt.a >= 29) {
            try {
                psh pshVar = Media3SessionService.i;
                com.yandex.music.shared.media.session.session.a.a(mediaSessionService, i, notification);
            } catch (RuntimeException e) {
                vq1.K("Util", "The service must be declared with a foregroundServiceType that includes mediaPlayback");
                throw e;
            }
        } else {
            mediaSessionService.startForeground(i, notification);
        }
        this.startedInForeground = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        MediaSessionService mediaSessionService = this.a;
        ArrayList d = mediaSessionService.d();
        for (int i = 0; i < d.size(); i++) {
            mediaSessionService.h((mzb) d.get(i), false);
        }
        return true;
    }
}
