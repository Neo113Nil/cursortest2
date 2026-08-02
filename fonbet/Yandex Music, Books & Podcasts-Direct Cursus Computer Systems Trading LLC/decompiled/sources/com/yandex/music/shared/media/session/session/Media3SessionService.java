package com.yandex.music.shared.media.session.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.core.app.f0;
import androidx.media3.session.MediaSessionService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.b6l;
import defpackage.bfj;
import defpackage.byn;
import defpackage.d6l;
import defpackage.dfi;
import defpackage.dm6;
import defpackage.dsh;
import defpackage.e6l;
import defpackage.f7l;
import defpackage.gld;
import defpackage.hld;
import defpackage.jgh;
import defpackage.jmd;
import defpackage.l1b;
import defpackage.mzb;
import defpackage.p6g;
import defpackage.psh;
import defpackage.pvh;
import defpackage.sqi;
import defpackage.srh;
import defpackage.ssg;
import defpackage.tf6;
import defpackage.tsh;
import defpackage.ush;
import defpackage.uvg;
import defpackage.v3w;
import defpackage.v7g;
import defpackage.vsh;
import defpackage.wrh;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xsh;
import defpackage.z08;
import defpackage.zsh;
import io.appmetrica.analytics.impl.C0574qb;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class Media3SessionService extends MediaSessionService {
    public static psh i;
    public final tf6 h = gld.e(dm6.b());

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/shared/media/session/session/Media3SessionService$MusicBackgroundServiceStartNotAllowedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "shared-media-session-ui-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class MusicBackgroundServiceStartNotAllowedException extends IllegalStateException {
        public MusicBackgroundServiceStartNotAllowedException() {
            super("Start foreground playback not allowed");
        }
    }

    public static vsh k() {
        psh pshVar = i;
        if (pshVar != null) {
            return (vsh) pshVar.m.getValue();
        }
        Intrinsics.j("component");
        throw null;
    }

    public static jgh l() {
        psh pshVar = i;
        if (pshVar != null) {
            return (jgh) pshVar.g.getValue();
        }
        Intrinsics.j("component");
        throw null;
    }

    @Override // androidx.media3.session.MediaSessionService
    public final mzb f(wrh wrhVar) {
        return l().a();
    }

    @Override // androidx.media3.session.MediaSessionService
    public final void g(mzb mzbVar, boolean z) {
        mzbVar.getClass();
        psh pshVar = i;
        if (pshVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        e6l e6lVar = (e6l) ((f7l) pshVar.i.getValue()).c.getValue();
        ssg.a(3, "Media3SessionService", "onUpdateNotification(startInForegroundRequired=" + z + "), playbackState.type=" + p6g.z(e6lVar), null);
        psh pshVar2 = i;
        if (pshVar2 == null) {
            Intrinsics.j("component");
            throw null;
        }
        v3w.n(z, ((srh) pshVar2.n.getValue()).a, null);
        if (e6lVar.equals(b6l.a)) {
            psh pshVar3 = i;
            if (pshVar3 == null) {
                Intrinsics.j("component");
                throw null;
            }
            ((ush) pshVar3.l.getValue()).getClass();
        }
        super.g(mzbVar, z);
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onCreate() {
        ssg.a(3, "Media3SessionService", "onCreate()", null);
        super.onCreate();
        psh pshVar = i;
        if (pshVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        ((tsh) pshVar.o.getValue()).getClass();
        sqi.a = true;
        psh pshVar2 = i;
        if (pshVar2 == null) {
            Intrinsics.j("component");
            throw null;
        }
        xsh xshVar = (xsh) pshVar2.h.getValue();
        uvg uvgVar = new uvg(5, xshVar);
        xshVar.getClass();
        bfj bfjVar = bfj.d;
        byn bynVar = new byn(this, uvgVar, "ru.yandex.music.notifications.player", R.string.notification_channel_player);
        bynVar.g = 2131232117;
        j(bynVar);
        mzb a = l().a();
        psh pshVar3 = i;
        if (pshVar3 == null) {
            Intrinsics.j("component");
            throw null;
        }
        pvh pvhVar = (pvh) pshVar3.j.getValue();
        MediaSession.Token token = (MediaSession.Token) ((dsh) a.a.h.l.b).c.b;
        MediaSessionCompat$Token mediaSessionCompat$Token = token != null ? new MediaSessionCompat$Token(token, null) : null;
        mediaSessionCompat$Token.getClass();
        pvhVar.getClass();
        pvhVar.a.U(mediaSessionCompat$Token);
        b bVar = new b();
        synchronized (this.a) {
            this.f = bVar;
        }
        psh pshVar4 = i;
        if (pshVar4 != null) {
            ((ush) pshVar4.l.getValue()).getClass();
        } else {
            Intrinsics.j("component");
            throw null;
        }
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onDestroy() {
        ssg.a(3, "Media3SessionService", "onDestroy()", null);
        jgh l = l();
        ssg.a(3, "MediaSession3Wrapper", "stop(" + l.f + ")", null);
        ((z08) l.e.getValue()).a.l(null);
        mzb mzbVar = l.f;
        l.f = null;
        if (mzbVar == null) {
            dfi.r("Tries to destroy media session3 when it's not initialized yet", "MediaSession3Wrapper");
        } else {
            try {
                synchronized (mzb.b) {
                    mzb.c.remove(mzbVar.a.i);
                }
                mzbVar.a.t();
            } catch (Exception unused) {
            }
            mzbVar.a().a();
        }
        synchronized (this.a) {
            this.f = null;
        }
        psh pshVar = i;
        if (pshVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        pvh pvhVar = (pvh) pshVar.j.getValue();
        pvhVar.getClass();
        pvhVar.a = hld.j();
        super.onDestroy();
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        psh pshVar = i;
        Continuation continuation = null;
        if (pshVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        ((ush) pshVar.l.getValue()).getClass();
        if (Intrinsics.d(intent != null ? intent.getAction() : null, "android.intent.action.MEDIA_BUTTON")) {
            psh pshVar2 = i;
            if (pshVar2 == null) {
                Intrinsics.j("component");
                throw null;
            }
            if (!(((f7l) pshVar2.i.getValue()).c.getValue() instanceof d6l)) {
                psh pshVar3 = i;
                if (pshVar3 == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                ((zsh) pshVar3.k.getValue()).getClass();
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                bfj bfjVar = bfj.d;
                f0 f0Var = new f0(applicationContext, "ru.yandex.music.notifications.player");
                f0Var.K.icon = 2131232117;
                f0Var.e = f0.c(applicationContext.getString(R.string.background_launcher_notification_title));
                f0Var.f = f0.c(applicationContext.getString(R.string.background_launcher_notification_text));
                Notification o = v7g.o(f0Var);
                o.getClass();
                if (Build.VERSION.SDK_INT >= 31) {
                    try {
                        com.yandex.music.shared.utils.system.a.a(C0574qb.g, l1b.g(this), 16, o);
                        startForeground(16, o);
                    } catch (ForegroundServiceStartNotAllowedException e) {
                        ssg.a(6, "Media3SessionService", "start foreground failed", e);
                        k().a(e);
                    }
                } else {
                    startForeground(16, o);
                }
                x97.y(this.h, null, null, new jmd(this, continuation, 26), 3);
            }
        }
        super.onStartCommand(intent, i2, i3);
        return 1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        try {
            return super.startForegroundService(intent);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !b6e.r(e)) {
                throw e;
            }
            k().a(e);
            psh pshVar = i;
            if (pshVar == null) {
                Intrinsics.j("component");
                throw null;
            }
            xdr xdrVar = ((srh) pshVar.n.getValue()).a;
            Boolean bool = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            return null;
        }
    }
}
