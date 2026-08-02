package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class dsh {
    public final MediaSession a;
    public final csh b;
    public final msh c;
    public final Bundle e;
    public i6l g;
    public List h;
    public ioh i;
    public int j;
    public int k;
    public bsh l;
    public xth m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public dsh(Context context, String str, Bundle bundle) {
        MediaSession a = a(context, str, bundle);
        this.a = a;
        csh cshVar = new csh(this);
        this.b = cshVar;
        this.c = new msh(a.getSessionToken(), cshVar);
        this.e = bundle;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public xth b() {
        xth xthVar;
        synchronized (this.d) {
            xthVar = this.m;
        }
        return xthVar;
    }

    public final void c(bsh bshVar, Handler handler) {
        synchronized (this.d) {
            this.l = bshVar;
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
                            tt1Var = new tt1(bshVar, handler.getLooper(), 12);
                        }
                        bshVar.f = tt1Var;
                    } finally {
                    }
                }
            }
        }
    }

    public void d(xth xthVar) {
        synchronized (this.d) {
            this.m = xthVar;
        }
    }
}
