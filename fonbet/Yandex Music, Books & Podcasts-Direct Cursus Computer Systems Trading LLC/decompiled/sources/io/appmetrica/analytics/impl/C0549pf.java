package io.appmetrica.analytics.impl;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;
import defpackage.b6e;
import defpackage.bai;
import defpackage.c11;
import defpackage.e4i;
import defpackage.eai;
import defpackage.efc;
import defpackage.f3a;
import defpackage.ffc;
import defpackage.gai;
import defpackage.hvo;
import defpackage.iz7;
import defpackage.jya;
import defpackage.l30;
import defpackage.nkk;
import defpackage.nnk;
import defpackage.q5b;
import defpackage.qne;
import defpackage.tzb;
import defpackage.xq0;
import defpackage.y3o;
import defpackage.z3o;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0549pf implements MviEventsReporter {
    public final gai a;
    public final Gf b;

    public C0549pf(@NotNull gai gaiVar, @NotNull Gf gf) {
        this.a = gaiVar;
        this.b = gf;
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen, @NotNull Set<String> set) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        ((Ff) this.b).a(new Hf(mviScreen), set);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        String str;
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        Hf hf = new Hf(mviScreen);
        nkk nkkVar = new nkk(mviTimestamp.getUptimeMillis());
        int i = startupType == null ? -1 : Qf.b[startupType.ordinal()];
        if (i == -1) {
            str = null;
        } else if (i == 1) {
            str = "cold";
        } else if (i == 2) {
            str = "warm";
        } else {
            if (i != 3) {
                b6e.s();
                return;
            }
            str = "hot";
        }
        jya jyaVar = gaiVar.c;
        if (bundle != null) {
            jyaVar.b = "warm";
        } else {
            jyaVar.getClass();
        }
        eai a = gaiVar.a(hf);
        a.c = nkkVar;
        tzb tzbVar = a.q;
        if (str != null) {
            tzbVar.a = str;
        } else {
            tzbVar.getClass();
        }
        if (z) {
            return;
        }
        confirmReporting(mviScreen, q5b.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(@NotNull MviScreen mviScreen) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        gaiVar.b.remove(new Hf(mviScreen));
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        Gf gf = this.b;
        Hf hf = new Hf(mviScreen);
        Ff ff = (Ff) gf;
        ff.b.remove(hf);
        ff.c.remove(hf);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        Hf hf = new Hf(mviScreen);
        long uptimeMillis = mviTimestamp.getUptimeMillis();
        nkk nkkVar = new nkk(uptimeMillis);
        iz7 iz7Var = gaiVar.a(hf).p;
        if (((nnk) iz7Var.a) == null) {
            iz7Var.a = (nnk) ((bai) iz7Var.g).get();
        }
        nnk nnkVar = (nnk) iz7Var.a;
        if (((nkk) nnkVar.a) != null) {
            return;
        }
        nnkVar.a = nkkVar;
        eai eaiVar = ((bai) nnkVar.b).b;
        eaiVar.a("FirstFrameDrawn", uptimeMillis - eaiVar.b().a, "", eaiVar.j);
        if (!eaiVar.h) {
            eaiVar.g.start();
        }
        TimeToInteractiveTracker k = eaiVar.p.k();
        l30 l30Var = k.i;
        if (k.g != null) {
            return;
        }
        k.f = nkkVar;
        k.j = uptimeMillis;
        l30Var.removeMessages(0);
        l30Var.sendEmptyMessageDelayed(0, k.d);
        k.b.a(k.h);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        Hf hf = new Hf(mviScreen);
        long uptimeMillis = mviTimestamp.getUptimeMillis();
        nkk nkkVar = new nkk(uptimeMillis);
        iz7 iz7Var = gaiVar.a(hf).p;
        if (((qne) iz7Var.c) == null) {
            iz7Var.c = (qne) ((bai) iz7Var.i).get();
        }
        qne qneVar = (qne) iz7Var.c;
        if (((nkk) qneVar.a) != null) {
            return;
        }
        qneVar.a = nkkVar;
        eai eaiVar = ((bai) qneVar.b).b;
        eaiVar.a("FirstContentShown", uptimeMillis - eaiVar.b().a, "", eaiVar.k);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(@NotNull MviScreen mviScreen, @NotNull KeyEvent keyEvent) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        iz7 iz7Var = this.a.a(new Hf(mviScreen)).p;
        ffc i = iz7Var.i();
        if (i.d && !i.c && keyEvent.getAction() == 1) {
            i.a(keyEvent.getEventTime(), "Keyboard");
        }
        ResponsivenessTracker j = iz7Var.j();
        if (j != null && j.h && keyEvent.getAction() == 1) {
            y3o.a.postFrameCallbackDelayed(new f3a(2, j, new nkk(keyEvent.getEventTime())), j.d);
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        Hf hf = new Hf(mviScreen);
        nkk nkkVar = new nkk(mviTimestamp.getUptimeMillis());
        eai a = gaiVar.a(hf);
        iz7 iz7Var = a.p;
        if (((nnk) iz7Var.a) == null) {
            iz7Var.a = (nnk) ((bai) iz7Var.g).get();
        }
        ((nnk) iz7Var.a).a = null;
        iz7Var.k().a();
        if (((qne) iz7Var.c) == null) {
            iz7Var.c = (qne) ((bai) iz7Var.i).get();
        }
        ((qne) iz7Var.c).a = null;
        ffc i = iz7Var.i();
        i.e.clear();
        i.c = false;
        i.d = true;
        ResponsivenessTracker j = iz7Var.j();
        if (j != null) {
            l30 l30Var = j.j;
            j.i.clear();
            y3o.a.removeFrameCallback(j.f);
            j.g = false;
            c11 c11Var = j.e;
            c11Var.b = 0;
            c11Var.a.clear();
            j.h = true;
            l30Var.removeMessages(0);
            l30Var.sendEmptyMessageDelayed(0, j.b);
        }
        if (((e4i) iz7Var.f) == null) {
            iz7Var.f = (e4i) ((com.yandex.pulse.mvi.a) iz7Var.l).get();
        }
        ((e4i) iz7Var.f).reset();
        a.d = nkkVar;
        tzb tzbVar = a.q;
        int i2 = tzbVar.b + 1;
        tzbVar.b = i2;
        if (i2 > 1) {
            tzbVar.a = "hot";
        }
        if (a.h) {
            a.g.start();
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(@NotNull MviScreen mviScreen) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        eai a = this.a.a(new Hf(mviScreen));
        iz7 iz7Var = a.p;
        iz7Var.i().d = false;
        ResponsivenessTracker j = iz7Var.j();
        if (j != null) {
            c11 c11Var = j.e;
            if (j.h) {
                j.h = false;
                j.i.clear();
                y3o.a.removeFrameCallback(j.f);
                j.g = false;
                j.j.removeMessages(0);
                Long a2 = c11Var.a();
                if (a2 != null) {
                    bai baiVar = j.a;
                    long longValue = a2.longValue();
                    int i = c11Var.b;
                    eai eaiVar = baiVar.b;
                    eaiVar.a("InteractionToNextPaint", longValue, "Overall", eaiVar.o);
                    eaiVar.a.reportAdditionalMetric(eaiVar.r, "InteractionCount", i, "Overall", eaiVar.q.a);
                }
            }
            c11Var.b = 0;
            c11Var.a.clear();
        }
        if (((e4i) iz7Var.f) == null) {
            iz7Var.f = (e4i) ((com.yandex.pulse.mvi.a) iz7Var.l).get();
        }
        ((e4i) iz7Var.f).i();
        if (a.h) {
            a.g.stop();
            iz7Var.k().a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r6 != 6) goto L80;
     */
    @Override // io.appmetrica.analytics.MviEventsReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTouchEvent(@NotNull MviScreen mviScreen, @NotNull MviTouchEvent mviTouchEvent) {
        int i;
        z3o z3oVar;
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        gai gaiVar = this.a;
        Hf hf = new Hf(mviScreen);
        hvo touch = mviTouchEvent.getTouch();
        iz7 iz7Var = gaiVar.a(hf).p;
        ffc i2 = iz7Var.i();
        boolean z = i2.d;
        SparseArray sparseArray = i2.e;
        if (!z || i2.c) {
            i = 65280;
        } else {
            int a = touch.a();
            int i3 = touch.b;
            int[] iArr = touch.c;
            i = 65280;
            long j = touch.a;
            if (a == 0) {
                sparseArray.clear();
                i2.b(touch);
            } else if (a == 1) {
                sparseArray.remove(iArr[touch.a() == 6 ? (i3 & 65280) >> 8 : 0]);
                i2.a(j, "Tap");
            } else if (a == 2) {
                int length = iArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = iArr[i4];
                    PointF pointF = touch.d[i4];
                    float f = pointF.x;
                    float f2 = pointF.y;
                    PointF pointF2 = (PointF) sparseArray.get(i5);
                    if (pointF2 == null) {
                        sparseArray.put(i5, new PointF(f, f2));
                    } else {
                        float f3 = f - pointF2.x;
                        float f4 = f2 - pointF2.y;
                        if ((f4 * f4) + (f3 * f3) > i2.f) {
                            i2.a(j, iArr.length == 1 ? "Swipe" : "Other");
                        }
                    }
                    i4++;
                }
            } else if (a == 3) {
                sparseArray.clear();
            } else if (a == 5) {
                i2.b(touch);
            } else if (a == 6) {
                sparseArray.remove(iArr[touch.a() == 6 ? (i3 & 65280) >> 8 : 0]);
            }
        }
        ResponsivenessTracker j2 = iz7Var.j();
        if (j2 != null) {
            SparseArray sparseArray2 = j2.i;
            long j3 = j2.d;
            if (j2.h) {
                int a2 = touch.a();
                int[] iArr2 = touch.c;
                long j4 = touch.a;
                if (a2 != 0) {
                    if (a2 != 1) {
                        if (a2 == 2) {
                            nkk nkkVar = new nkk(j4);
                            for (int i6 : iArr2) {
                                z3o z3oVar2 = (z3o) sparseArray2.get(i6);
                                if (z3oVar2 == null) {
                                    sparseArray2.put(i6, new z3o(nkkVar));
                                } else {
                                    z3oVar2.a = nkkVar;
                                }
                            }
                        } else if (a2 == 3) {
                            sparseArray2.clear();
                        } else if (a2 == 5) {
                            j2.b(touch);
                        }
                    }
                    int i7 = iArr2[touch.a() == 6 ? (touch.b & i) >> 8 : 0];
                    if (touch.a() == 1 && (z3oVar = (z3o) sparseArray2.get(i7)) != null) {
                        y3o.a.postFrameCallbackDelayed(new efc(j2, z3oVar, new nkk(j4)), j3);
                    }
                    sparseArray2.remove(i7);
                } else {
                    sparseArray2.clear();
                    j2.b(touch);
                }
                if (sparseArray2.size() <= 0 || j2.g) {
                    return;
                }
                j2.g = true;
                y3o.a.postFrameCallbackDelayed(j2.f, j3);
            }
        }
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen) {
        confirmReporting(mviScreen, q5b.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        onCreate(mviScreen, bundle, mviTimestamp, startupType, false);
    }
}
