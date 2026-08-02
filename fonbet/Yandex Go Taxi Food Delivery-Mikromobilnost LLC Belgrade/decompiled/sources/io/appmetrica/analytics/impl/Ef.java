package io.appmetrica.analytics.impl;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;
import com.yandex.pulse.mvi.utils.WeakHandler;
import defpackage.ddr;
import defpackage.edr;
import defpackage.ev20;
import defpackage.gfp0;
import defpackage.gv20;
import defpackage.hzk;
import defpackage.jl40;
import defpackage.k5g;
import defpackage.kdh;
import defpackage.lwa0;
import defpackage.ms5;
import defpackage.ny61;
import defpackage.pc20;
import defpackage.ph1;
import defpackage.pwj0;
import defpackage.qwj0;
import defpackage.w511;
import defpackage.zu20;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class Ef implements MviEventsReporter {
    public final gv20 a;
    public final Vf b;

    public Ef(gv20 gv20Var, Vf vf) {
        this.a = gv20Var;
        this.b = vf;
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen, Set<String> set) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        ((Uf) this.b).a(new Wf(mviScreen), set);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        String str;
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        Wf wf = new Wf(mviScreen);
        lwa0 lwa0Var = new lwa0(mviTimestamp.getUptimeMillis());
        int i = startupType == null ? -1 : AbstractC0335fg.b[startupType.ordinal()];
        if (i == -1) {
            str = null;
        } else if (i == 1) {
            str = "cold";
        } else if (i == 2) {
            str = "warm";
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            str = "hot";
        }
        ph1 ph1Var = gv20Var.c;
        if (bundle != null) {
            ph1Var.b = "warm";
        } else {
            ph1Var.getClass();
        }
        ev20 a = gv20Var.a(wf);
        a.c = lwa0Var;
        ms5 ms5Var = a.q;
        if (str != null) {
            ms5Var.b = str;
        } else {
            ms5Var.getClass();
        }
        if (z) {
            return;
        }
        confirmReporting(mviScreen, EmptySet.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(MviScreen mviScreen) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        gv20Var.b.remove(new Wf(mviScreen));
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        Vf vf = this.b;
        Wf wf = new Wf(mviScreen);
        Uf uf = (Uf) vf;
        uf.b.remove(wf);
        uf.c.remove(wf);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        Wf wf = new Wf(mviScreen);
        long uptimeMillis = mviTimestamp.getUptimeMillis();
        lwa0 lwa0Var = new lwa0(uptimeMillis);
        k5g k5gVar = gv20Var.a(wf).p;
        if (((hzk) k5gVar.a) == null) {
            k5gVar.a = (hzk) ((zu20) k5gVar.g).get();
        }
        hzk hzkVar = (hzk) k5gVar.a;
        if (((lwa0) hzkVar.a) != null) {
            return;
        }
        hzkVar.a = lwa0Var;
        ev20 ev20Var = ((zu20) hzkVar.b).b;
        ev20Var.a("FirstFrameDrawn", uptimeMillis - ev20Var.b().a, "", ev20Var.j);
        if (!ev20Var.h) {
            ev20Var.g.start();
        }
        TimeToInteractiveTracker d = ev20Var.p.d();
        WeakHandler weakHandler = d.i;
        if (d.g != null) {
            return;
        }
        d.f = lwa0Var;
        d.j = uptimeMillis;
        weakHandler.removeMessages(0);
        weakHandler.sendEmptyMessageDelayed(0, d.d);
        d.b.a(d.h);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        Wf wf = new Wf(mviScreen);
        long uptimeMillis = mviTimestamp.getUptimeMillis();
        lwa0 lwa0Var = new lwa0(uptimeMillis);
        k5g k5gVar = gv20Var.a(wf).p;
        if (((hzk) k5gVar.c) == null) {
            k5gVar.c = (hzk) ((zu20) k5gVar.i).get();
        }
        hzk hzkVar = (hzk) k5gVar.c;
        if (((lwa0) hzkVar.a) != null) {
            return;
        }
        hzkVar.a = lwa0Var;
        ev20 ev20Var = ((zu20) hzkVar.b).b;
        ev20Var.a("FirstContentShown", uptimeMillis - ev20Var.b().a, "", ev20Var.k);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(MviScreen mviScreen, KeyEvent keyEvent) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        k5g k5gVar = this.a.a(new Wf(mviScreen)).p;
        edr b = k5gVar.b();
        if (b.d && !b.c && keyEvent.getAction() == 1) {
            b.a(keyEvent.getEventTime(), "Keyboard");
        }
        final ResponsivenessTracker c = k5gVar.c();
        if (c != null && c.h && keyEvent.getAction() == 1) {
            final lwa0 lwa0Var = new lwa0(keyEvent.getEventTime());
            pwj0.a.postFrameCallbackDelayed(new Choreographer.FrameCallback() { // from class: nwj0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ResponsivenessTracker.this.a(null, lwa0Var, new lwa0(SystemClock.uptimeMillis()));
                }
            }, c.d);
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        Wf wf = new Wf(mviScreen);
        lwa0 lwa0Var = new lwa0(mviTimestamp.getUptimeMillis());
        ev20 a = gv20Var.a(wf);
        k5g k5gVar = a.p;
        if (((hzk) k5gVar.a) == null) {
            k5gVar.a = (hzk) ((zu20) k5gVar.g).get();
        }
        ((hzk) k5gVar.a).a = null;
        k5gVar.d().a();
        if (((hzk) k5gVar.c) == null) {
            k5gVar.c = (hzk) ((zu20) k5gVar.i).get();
        }
        ((hzk) k5gVar.c).a = null;
        edr b = k5gVar.b();
        b.e.clear();
        b.c = false;
        b.d = true;
        ResponsivenessTracker c = k5gVar.c();
        if (c != null) {
            WeakHandler weakHandler = c.j;
            c.i.clear();
            pwj0.a.removeFrameCallback(c.f);
            c.g = false;
            kdh kdhVar = c.e;
            kdhVar.a = 0;
            kdhVar.b.clear();
            c.h = true;
            weakHandler.removeMessages(0);
            weakHandler.sendEmptyMessageDelayed(0, c.b);
        }
        if (((pc20) k5gVar.f) == null) {
            k5gVar.f = (pc20) ((com.yandex.pulse.mvi.a) k5gVar.l).get();
        }
        ((pc20) k5gVar.f).reset();
        a.d = lwa0Var;
        ms5 ms5Var = a.q;
        int i = ms5Var.a + 1;
        ms5Var.a = i;
        if (i > 1) {
            ms5Var.b = "hot";
        }
        if (a.h) {
            a.g.start();
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(MviScreen mviScreen) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        ev20 a = this.a.a(new Wf(mviScreen));
        k5g k5gVar = a.p;
        k5gVar.b().d = false;
        ResponsivenessTracker c = k5gVar.c();
        if (c != null) {
            kdh kdhVar = c.e;
            if (c.h) {
                c.h = false;
                c.i.clear();
                pwj0.a.removeFrameCallback(c.f);
                c.g = false;
                c.j.removeMessages(0);
                Long a2 = kdhVar.a();
                if (a2 != null) {
                    c.a.a(a2.longValue(), kdhVar.a, "Overall");
                }
            }
            kdhVar.a = 0;
            kdhVar.b.clear();
        }
        if (((pc20) k5gVar.f) == null) {
            k5gVar.f = (pc20) ((com.yandex.pulse.mvi.a) k5gVar.l).get();
        }
        ((pc20) k5gVar.f).p();
        if (a.h) {
            a.g.stop();
            k5gVar.d().a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ef, code lost:
    
        if (r8 != 6) goto L74;
     */
    @Override // io.appmetrica.analytics.MviEventsReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTouchEvent(MviScreen mviScreen, MviTouchEvent mviTouchEvent) {
        qwj0 qwj0Var;
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        gv20 gv20Var = this.a;
        Wf wf = new Wf(mviScreen);
        gfp0 touch = mviTouchEvent.getTouch();
        k5g k5gVar = gv20Var.a(wf).p;
        edr b = k5gVar.b();
        boolean z = b.d;
        SparseArray sparseArray = b.e;
        if (z && !b.c) {
            int b2 = touch.b();
            if (b2 == 0) {
                sparseArray.clear();
                b.b(touch);
            } else if (b2 == 1) {
                sparseArray.remove(touch.e(touch.b() == 6 ? touch.a() : 0));
                b.a(touch.c(), "Tap");
            } else if (b2 == 2) {
                int d = touch.d();
                int i = 0;
                while (true) {
                    if (i >= d) {
                        break;
                    }
                    int e = touch.e(i);
                    float g = touch.g(i);
                    float h = touch.h(i);
                    PointF pointF = (PointF) sparseArray.get(e);
                    if (pointF == null) {
                        sparseArray.put(e, new PointF(g, h));
                    } else {
                        float f = g - pointF.x;
                        float f2 = h - pointF.y;
                        if ((f2 * f2) + (f * f) > b.f) {
                            b.a(touch.c(), touch.d() == 1 ? "Swipe" : "Other");
                        }
                    }
                    i++;
                }
            } else if (b2 == 3) {
                sparseArray.clear();
            } else if (b2 == 5) {
                b.b(touch);
            } else if (b2 == 6) {
                sparseArray.remove(touch.e(touch.b() == 6 ? touch.a() : 0));
            }
        }
        ResponsivenessTracker c = k5gVar.c();
        if (c != null) {
            SparseArray sparseArray2 = c.i;
            long j = c.d;
            if (c.h) {
                int b3 = touch.b();
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            lwa0 lwa0Var = new lwa0(touch.c());
                            int d2 = touch.d();
                            while (r3 < d2) {
                                int e2 = touch.e(r3);
                                qwj0 qwj0Var2 = (qwj0) sparseArray2.get(e2);
                                if (qwj0Var2 == null) {
                                    sparseArray2.put(e2, new qwj0(lwa0Var));
                                } else {
                                    qwj0Var2.a = lwa0Var;
                                }
                                r3++;
                            }
                        } else if (b3 == 3) {
                            sparseArray2.clear();
                        } else if (b3 == 5) {
                            c.b(touch);
                        }
                    }
                    int e3 = touch.e(touch.b() == 6 ? touch.a() : 0);
                    if (touch.b() == 1 && (qwj0Var = (qwj0) sparseArray2.get(e3)) != null) {
                        pwj0.a.postFrameCallbackDelayed(new ddr(c, qwj0Var, new lwa0(touch.c())), j);
                    }
                    sparseArray2.remove(e3);
                } else {
                    sparseArray2.clear();
                    c.b(touch);
                }
                if (sparseArray2.size() <= 0 || c.g) {
                    return;
                }
                c.g = true;
                pwj0.a.postFrameCallbackDelayed(c.f, j);
            }
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen) {
        confirmReporting(mviScreen, EmptySet.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        onCreate(mviScreen, bundle, mviTimestamp, startupType, false);
    }
}
