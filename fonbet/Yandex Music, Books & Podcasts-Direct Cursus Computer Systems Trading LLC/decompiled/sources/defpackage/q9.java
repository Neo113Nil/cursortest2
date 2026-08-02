package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.h;
import androidx.fragment.app.i;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import kotlin.Unit;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public q9(h23 h23Var, gc8 gc8Var) {
        this.a = 21;
        this.b = h23Var;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Type inference failed for: r0v75, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        switch (this.a) {
            case 0:
                koj kojVar = (koj) this.b;
                try {
                    jkk.c();
                    try {
                        jee jeeVar = jkk.a;
                        jeeVar.getClass();
                        jzh jzhVar = kojVar.a;
                        if (!jzhVar.isClosed()) {
                            jzhVar.m++;
                            jzhVar.a();
                        }
                        jeeVar.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            jkk.a.getClass();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    kojVar.f(th3);
                    return;
                }
            case 1:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    ((gs4) this.b).Q();
                    return;
                } catch (Throwable th4) {
                    bp6.a(this, th4);
                    return;
                }
            case 2:
                kkp kkpVar = (kkp) this.b;
                while (true) {
                    try {
                        kkpVar.q((jh) ((ReferenceQueue) kkpVar.d).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 3:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    String str = oh.a;
                    if (oh.f == null) {
                        oh.f = new sj(Long.valueOf(((mh) this.b).b), null);
                    }
                    if (oh.e.get() <= 0) {
                        imp.S((String) ((mh) this.b).c, oh.f, oh.h);
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(j3c.b()).edit();
                        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                        edit.apply();
                        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(j3c.b()).edit();
                        edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                        edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                        edit2.apply();
                        oh.f = null;
                    }
                    synchronized (oh.d) {
                        oh.c = null;
                    }
                    return;
                } catch (Throwable th5) {
                    bp6.a(this, th5);
                    return;
                }
            case 4:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.b;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.X0;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    androidComposeView.K(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, androidComposeView.Y0, false);
                    return;
                }
                return;
            case 5:
                ((ms1) this.b).m();
                return;
            case 6:
                d6w d6wVar = ((ss1) this.b).k;
                if (d6wVar != null) {
                    d6wVar.o();
                    return;
                }
                return;
            case 7:
                try {
                    ((fmq) this.b).B();
                    return;
                } catch (Exception unused2) {
                    Log.i("NIO", "Selector Exception? L Preview?");
                    return;
                }
            case 8:
                ct1 ct1Var = (ct1) this.b;
                noj nojVar = ct1Var.d;
                try {
                    kt1 kt1Var = ct1Var.i;
                    if (kt1Var != null) {
                        hi3 hi3Var = ct1Var.b;
                        long j = hi3Var.b;
                        if (j > 0) {
                            kt1Var.t0(hi3Var, j);
                        }
                    }
                } catch (IOException e) {
                    nojVar.o(e);
                }
                try {
                    kt1 kt1Var2 = ct1Var.i;
                    if (kt1Var2 != null) {
                        kt1Var2.close();
                    }
                } catch (IOException e2) {
                    nojVar.o(e2);
                }
                try {
                    Socket socket = ct1Var.j;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    nojVar.o(e3);
                    return;
                }
            case 9:
                nag nagVar = (nag) this.b;
                nra nraVar = nagVar.c;
                fa2 fa2Var = nagVar.a;
                if (nagVar.o) {
                    if (nagVar.m) {
                        nagVar.m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        fa2Var.e = currentAnimationTimeMillis;
                        fa2Var.g = -1L;
                        fa2Var.f = currentAnimationTimeMillis;
                        fa2Var.h = 0.5f;
                    }
                    if ((fa2Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > fa2Var.g + fa2Var.i) || !nagVar.e()) {
                        nagVar.o = false;
                        return;
                    }
                    if (nagVar.n) {
                        nagVar.n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        nraVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (fa2Var.f == 0) {
                        wvs.p("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = fa2Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - fa2Var.f;
                    fa2Var.f = currentAnimationTimeMillis2;
                    nagVar.q.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * fa2Var.d));
                    WeakHashMap weakHashMap = wdu.a;
                    nraVar.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                ((dj3) this.b).end();
                return;
            case 11:
                gw0 gw0Var = (gw0) ((z0j) this.b).e;
                if (new Date().getTime() > gw0.p + 15000) {
                    Log.w("Channel", "Ping not received in 15000 ms");
                    gw0Var.j.close();
                    return;
                } else {
                    gw0Var.n("pong", gw0Var.d.A().a, "channel.ping");
                    new Date().getTime();
                    return;
                }
            case 12:
                zt3 zt3Var = (zt3) this.b;
                Unit unit = Unit.a;
                if (zt3Var.w()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(unit);
                    return;
                }
                return;
            case 13:
                Set set = bp6.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    gs4 gs4Var = (gs4) this.b;
                    if (set.contains(gs4.class)) {
                        return;
                    }
                    try {
                        gs4Var.O();
                        return;
                    } catch (Throwable th6) {
                        bp6.a(gs4.class, th6);
                        return;
                    }
                } catch (Throwable th7) {
                    bp6.a(this, th7);
                    return;
                }
            case 14:
                try {
                    ((qe6) this.b).Q(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th8) {
                    we6.d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th8);
                    return;
                }
            case 15:
                ?? r0 = ((z07) this.b).x;
                if (r0 != 0) {
                    r0.invoke();
                    return;
                }
                return;
            case 16:
                ((jv7) this.b).t.T();
                return;
            case 17:
                ((oo4) ((qv7) this.b).b).onReady();
                return;
            case 18:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    ((b08) this.b).E();
                    return;
                } catch (Throwable th9) {
                    bp6.a(this, th9);
                    return;
                }
            case 19:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    ((j18) this.b).i.dismiss();
                    return;
                } catch (Throwable th10) {
                    bp6.a(this, th10);
                    return;
                }
            case 20:
                i iVar = (i) this.b;
                onDismissListener = iVar.mOnDismissListener;
                dialog = iVar.mDialog;
                onDismissListener.onDismiss(dialog);
                return;
            case 21:
                g23 g23Var = ((h23) this.b).b;
                f23 a2 = g23Var.a();
                g23Var.getClass();
                g23.b(a2);
                return;
            case 22:
                ger gerVar = (ger) this.b;
                gerVar.b(true);
                gerVar.invalidateSelf();
                return;
            case 23:
                nra nraVar2 = (nra) this.b;
                nraVar2.l = null;
                nraVar2.drawableStateChanged();
                return;
            case 24:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    super/*lbv*/.cancel();
                    return;
                } catch (Throwable th11) {
                    bp6.a(this, th11);
                    return;
                }
            case 25:
                m5c m5cVar = (m5c) this.b;
                ValueAnimator valueAnimator = m5cVar.z;
                int i = m5cVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                m5cVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 26:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    w6c w6cVar = (w6c) this.b;
                    w6cVar.a.L(x6c.b(w6cVar.b));
                    return;
                } catch (Throwable th12) {
                    bp6.a(this, th12);
                    return;
                }
            case 27:
                CopyOnWriteArrayList copyOnWriteArrayList = ((qrc) this.b).h;
                Timber.d("Running %d scheduled tasks.", Integer.valueOf(copyOnWriteArrayList.size()));
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                h hVar = (h) this.b;
                if (hVar.b.isEmpty()) {
                    return;
                }
                hVar.e();
                return;
            default:
                ((y) this.b).z(true);
                return;
        }
    }

    public /* synthetic */ q9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
