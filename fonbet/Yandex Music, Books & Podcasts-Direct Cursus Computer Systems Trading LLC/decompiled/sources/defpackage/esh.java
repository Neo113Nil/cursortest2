package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class esh {
    public final MediaSession a;
    public final d b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public MediaMetadataCompat g;
    public bsh h;
    public yth i;

    public esh(Context context) {
        MediaSession a = a(context);
        this.a = a;
        d dVar = new d(this);
        this.b = dVar;
        this.c = new MediaSessionCompat$Token(a.getSessionToken(), dVar);
        a.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    public yth b() {
        yth ythVar;
        synchronized (this.d) {
            ythVar = this.i;
        }
        return ythVar;
    }

    public final void c(bsh bshVar, Handler handler) {
        synchronized (this.d) {
            this.h = bshVar;
            tt1 tt1Var = null;
            this.a.setCallback(bshVar == null ? null : (ash) bshVar.e, handler);
            if (bshVar != null) {
                synchronized (bshVar.b) {
                    try {
                        bshVar.d = new WeakReference(this);
                        tt1 tt1Var2 = (tt1) bshVar.f;
                        if (tt1Var2 != null) {
                            tt1Var2.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            tt1Var = new tt1(bshVar, handler.getLooper(), 13);
                        }
                        bshVar.f = tt1Var;
                    } finally {
                    }
                }
            }
        }
    }

    public void d(yth ythVar) {
        synchronized (this.d) {
            this.i = ythVar;
        }
    }
}
