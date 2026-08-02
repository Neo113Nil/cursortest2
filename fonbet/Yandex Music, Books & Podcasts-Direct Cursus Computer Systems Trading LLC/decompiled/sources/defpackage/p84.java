package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p84 extends nkp {
    public static final msg m = new msg("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final m1x e;
    public final k74 f;
    public final l3x g;
    public final mmx h;
    public h4x i;
    public xun j;
    public CastDevice k;
    public knn l;

    public p84(Context context, String str, String str2, k74 k74Var, l3x l3xVar, mmx mmxVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = k74Var;
        this.g = l3xVar;
        this.h = mmxVar;
        l9e c = c();
        p3x p3xVar = new p3x(this);
        msg msgVar = w0x.a;
        m1x m1xVar = null;
        if (c != null) {
            try {
                m1xVar = w0x.b(context).S0(k74Var, c, p3xVar);
            } catch (RemoteException | odi e) {
                w0x.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", d1x.class.getSimpleName());
            }
        }
        this.e = m1xVar;
    }

    public static void e(p84 p84Var, int i) {
        mmx mmxVar = p84Var.h;
        if (mmxVar.q) {
            mmxVar.q = false;
            xun xunVar = mmxVar.n;
            if (xunVar != null) {
                gix gixVar = mmxVar.m;
                y1g.B("Must be called from the main thread.");
                if (gixVar != null) {
                    xunVar.i.remove(gixVar);
                }
            }
            mmxVar.c.S0(null);
            n3m n3mVar = mmxVar.h;
            if (n3mVar != null) {
                n3mVar.S0();
                n3mVar.f = null;
            }
            n3m n3mVar2 = mmxVar.i;
            if (n3mVar2 != null) {
                n3mVar2.S0();
                n3mVar2.f = null;
            }
            osh oshVar = mmxVar.p;
            if (oshVar != null) {
                oshVar.U(null, null);
                mmxVar.p.W(new MediaMetadataCompat(new Bundle()));
                mmxVar.j(0, null);
            }
            osh oshVar2 = mmxVar.p;
            if (oshVar2 != null) {
                ((esh) oshVar2.a).a.setActive(false);
                Iterator it = ((ArrayList) oshVar2.c).iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                esh eshVar = (esh) mmxVar.p.a;
                MediaSession mediaSession = eshVar.a;
                eshVar.e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback(null);
                eshVar.b.a.set(null);
                mediaSession.release();
                mmxVar.p = null;
            }
            mmxVar.n = null;
            mmxVar.o = null;
            mmxVar.h();
            if (i == 0) {
                mmxVar.i();
            }
        }
        h4x h4xVar = p84Var.i;
        if (h4xVar != null) {
            h4xVar.i();
            p84Var.i = null;
        }
        p84Var.k = null;
        xun xunVar2 = p84Var.j;
        if (xunVar2 != null) {
            xunVar2.v(null);
            p84Var.j = null;
        }
    }

    public static void f(p84 p84Var, String str, Task task) {
        msg msgVar = m;
        m1x m1xVar = p84Var.e;
        if (m1xVar == null) {
            return;
        }
        try {
            if (!task.l()) {
                Exception g = task.g();
                if (!(g instanceof qo0)) {
                    h1x h1xVar = (h1x) m1xVar;
                    Parcel M0 = h1xVar.M0();
                    M0.writeInt(2476);
                    h1xVar.O0(M0, 5);
                    return;
                }
                int i = ((qo0) g).a.a;
                h1x h1xVar2 = (h1x) m1xVar;
                Parcel M02 = h1xVar2.M0();
                M02.writeInt(i);
                h1xVar2.O0(M02, 5);
                return;
            }
            kkx kkxVar = (kkx) task.h();
            Status status = kkxVar.a;
            if (!status.d()) {
                msgVar.b("%s() -> failure result", str);
                int i2 = status.a;
                h1x h1xVar3 = (h1x) m1xVar;
                Parcel M03 = h1xVar3.M0();
                M03.writeInt(i2);
                h1xVar3.O0(M03, 5);
                return;
            }
            msgVar.b("%s() -> success result", str);
            xun xunVar = new xun(new w1x());
            p84Var.j = xunVar;
            xunVar.v(p84Var.i);
            p84Var.j.p(new gix(2, p84Var));
            p84Var.j.u();
            p84Var.h.a(p84Var.j, p84Var.d());
            jw0 jw0Var = kkxVar.b;
            y1g.G(jw0Var);
            String str2 = kkxVar.c;
            String str3 = kkxVar.d;
            y1g.G(str3);
            boolean z = kkxVar.e;
            h1x h1xVar4 = (h1x) m1xVar;
            Parcel M04 = h1xVar4.M0();
            y4x.c(M04, jw0Var);
            M04.writeString(str2);
            M04.writeString(str3);
            M04.writeInt(z ? 1 : 0);
            h1xVar4.O0(M04, 4);
        } catch (RemoteException e) {
            msgVar.a(e, "Unable to call %s on %s.", "methods", m1x.class.getSimpleName());
        }
    }

    public final CastDevice d() {
        y1g.B("Must be called from the main thread.");
        return this.k;
    }

    public final void g(Bundle bundle) {
        CastDevice e = CastDevice.e(bundle);
        this.k = e;
        boolean z = false;
        if (e == null) {
            y1g.B("Must be called from the main thread.");
            n2x n2xVar = this.a;
            if (n2xVar != null) {
                try {
                    f2x f2xVar = (f2x) n2xVar;
                    Parcel N0 = f2xVar.N0(f2xVar.M0(), 9);
                    int i = y4x.a;
                    if (N0.readInt() == 0) {
                        r0 = false;
                    }
                    N0.recycle();
                    z = r0;
                } catch (RemoteException e2) {
                    nkp.b.a(e2, "Unable to call %s on %s.", "isResuming", n2x.class.getSimpleName());
                }
            }
            n2x n2xVar2 = this.a;
            if (z) {
                if (n2xVar2 == null) {
                    return;
                }
                try {
                    f2x f2xVar2 = (f2x) n2xVar2;
                    Parcel M0 = f2xVar2.M0();
                    M0.writeInt(2153);
                    f2xVar2.O0(M0, 15);
                    return;
                } catch (RemoteException e3) {
                    nkp.b.a(e3, "Unable to call %s on %s.", "notifyFailedToResumeSession", n2x.class.getSimpleName());
                    return;
                }
            }
            if (n2xVar2 == null) {
                return;
            }
            try {
                f2x f2xVar3 = (f2x) n2xVar2;
                Parcel M02 = f2xVar3.M0();
                M02.writeInt(2151);
                f2xVar3.O0(M02, 12);
                return;
            } catch (RemoteException e4) {
                nkp.b.a(e4, "Unable to call %s on %s.", "notifyFailedToStartSession", n2x.class.getSimpleName());
                return;
            }
        }
        h4x h4xVar = this.i;
        if (h4xVar != null) {
            h4xVar.i();
            this.i = null;
        }
        m.b("Acquiring a connection to Google Play Services for %s", this.k);
        CastDevice castDevice = this.k;
        y1g.G(castDevice);
        Bundle bundle2 = new Bundle();
        k74 k74Var = this.f;
        g74 g74Var = k74Var == null ? null : k74Var.f;
        mfj mfjVar = g74Var != null ? g74Var.d : null;
        boolean z2 = g74Var != null && g74Var.e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", mfjVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.l);
        kox koxVar = new kox(this);
        osh oshVar = new osh();
        y1g.H(castDevice, "CastDevice parameter cannot be null");
        oshVar.a = castDevice;
        oshVar.b = koxVar;
        oshVar.c = bundle2;
        s54 s54Var = new s54(oshVar);
        Context context = this.c;
        int i2 = t54.a;
        h4x h4xVar2 = new h4x(context, s54Var);
        h4xVar2.E.add(new nox(this));
        this.i = h4xVar2;
        wcg b = h4xVar2.b(h4xVar2.k);
        c1t c1tVar = new c1t(8);
        uiq uiqVar = new uiq(17, h4xVar2);
        hil hilVar = new hil();
        h4xVar2.F = 2;
        c1tVar.e = b;
        c1tVar.c = uiqVar;
        c1tVar.d = hilVar;
        c1tVar.f = new i6c[]{vwb.k};
        c1tVar.b = 8428;
        vcg vcgVar = ((wcg) c1tVar.e).a;
        y1g.H(vcgVar, "Key must not be null");
        wcg wcgVar = (wcg) c1tVar.e;
        i6c[] i6cVarArr = (i6c[]) c1tVar.f;
        int i3 = c1tVar.b;
        yks yksVar = new yks(c1tVar, wcgVar, i6cVarArr, i3);
        kpm kpmVar = new kpm(c1tVar, vcgVar);
        y1g.H(wcgVar.a, "Listener has already been released.");
        umd umdVar = h4xVar2.j;
        umdVar.getClass();
        i8s i8sVar = new i8s();
        umdVar.f(i8sVar, i3, h4xVar2);
        pxw pxwVar = new pxw(new cyw(new qxw(yksVar, kpmVar), i8sVar), umdVar.i.get(), h4xVar2);
        fsn fsnVar = umdVar.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(8, pxwVar));
    }
}
