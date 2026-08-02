package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.impl.C0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.a;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ he0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        y13 y13Var = (y13) this.b;
        synchronized (y13Var) {
            try {
                if (y13Var.h == 4) {
                    y13Var.o(y13Var.i, true);
                }
            } finally {
            }
        }
    }

    private final void b() {
        fy6 fy6Var = (fy6) this.b;
        synchronized (fy6Var.d) {
            while (true) {
                if (!fy6Var.a) {
                    try {
                        fy6Var.d.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                fy6Var.a = false;
                if (!fy6Var.f.isClosed()) {
                    while (fy6Var.c.size() > 0) {
                        ldk ldkVar = (ldk) fy6Var.c.removeFirst();
                        try {
                            fy6Var.e(ldkVar.a, ldkVar.b);
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        long j2;
        AndroidComposeView androidComposeView;
        long j3;
        int[] iArr;
        long[] jArr;
        upe upeVar;
        AndroidComposeView androidComposeView2;
        int[] iArr2;
        long[] jArr2;
        long j4;
        long j5;
        upe upeVar2;
        long[] jArr3;
        int i;
        long[] jArr4;
        long j6;
        char c2;
        int i2;
        int i3;
        long j7;
        long j8;
        long j9;
        y8r y8rVar;
        int i4 = 2;
        long j10 = 0;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                AndroidComposeView androidComposeView3 = (AndroidComposeView) this.b;
                androidComposeView3.d1 = false;
                MotionEvent motionEvent = androidComposeView3.X0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView3.J(motionEvent);
                    return;
                } else {
                    xq0.q("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 1:
                ye0 ye0Var = (ye0) this.b;
                Trace.beginSection("measureAndLayout");
                try {
                    ye0Var.d.u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        ye0Var.n();
                        Trace.endSection();
                        ye0Var.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                tf0 tf0Var = (tf0) this.b;
                boolean f = tf0Var.f();
                soi soiVar = tf0Var.l;
                AndroidComposeView androidComposeView4 = tf0Var.a;
                if (f) {
                    androidComposeView4.u(true);
                    int[] iArr3 = soiVar.b;
                    long[] jArr5 = soiVar.a;
                    int length = jArr5.length - 2;
                    char c3 = 7;
                    int i5 = 8;
                    long j11 = -9187201950435737472L;
                    if (length >= 0) {
                        int i6 = 0;
                        j = 128;
                        while (true) {
                            long j12 = jArr5[i6];
                            j2 = 255;
                            if ((((~j12) << c3) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j12 & 255) < 128) {
                                        c2 = c3;
                                        int i9 = iArr3[(i6 << 3) + i8];
                                        if (!tf0Var.e().a(i9)) {
                                            i2 = i5;
                                            tf0Var.d.add(new ob6(i9, tf0Var.k, pb6.b, null));
                                            tf0Var.h.c(Unit.a);
                                            j12 >>= i2;
                                            i8++;
                                            i5 = i2;
                                            c3 = c2;
                                        }
                                    } else {
                                        c2 = c3;
                                    }
                                    i2 = i5;
                                    j12 >>= i2;
                                    i8++;
                                    i5 = i2;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i7 != i5) {
                                }
                            } else {
                                c = c3;
                            }
                            if (i6 != length) {
                                i6++;
                                c3 = c;
                                i5 = 8;
                            }
                        }
                    } else {
                        c = 7;
                        j = 128;
                        j2 = 255;
                    }
                    tf0Var.i(androidComposeView4.getSemanticsOwner().a(), tf0Var.m);
                    upe e = tf0Var.e();
                    int[] iArr4 = e.b;
                    long[] jArr6 = e.a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j13 = jArr6[i10];
                            if ((((~j13) << c) & j13 & j11) != j11) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j13 & j2) < j) {
                                        int i13 = iArr4[(i10 << 3) + i12];
                                        rfp rfpVar = (rfp) soiVar.b(i13);
                                        sfp sfpVar = (sfp) e.b(i13);
                                        qfp qfpVar = sfpVar != null ? sfpVar.a : null;
                                        if (qfpVar == null) {
                                            throw ouj.f("no value for specified key");
                                        }
                                        j5 = j11;
                                        int i14 = qfpVar.g;
                                        tpi tpiVar = qfpVar.d.a;
                                        if (rfpVar == null) {
                                            Object[] objArr = tpiVar.b;
                                            upeVar2 = e;
                                            long[] jArr7 = tpiVar.a;
                                            androidComposeView2 = androidComposeView4;
                                            int length3 = jArr7.length - 2;
                                            if (length3 >= 0) {
                                                iArr2 = iArr4;
                                                jArr2 = jArr6;
                                                int i15 = 0;
                                                while (true) {
                                                    long j14 = jArr7[i15];
                                                    j4 = j13;
                                                    if ((((~j14) << c) & j14 & j5) != j5) {
                                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j14 & j2) < j) {
                                                                j6 = j14;
                                                                xfp xfpVar = (xfp) objArr[(i15 << 3) + i17];
                                                                xfp xfpVar2 = ufp.z;
                                                                if (Intrinsics.d(xfpVar, xfpVar2)) {
                                                                    Object g = tpiVar.g(xfpVar2);
                                                                    if (g == null) {
                                                                        g = null;
                                                                    }
                                                                    List list = (List) g;
                                                                    tf0Var.j(i14, String.valueOf(list != null ? (mn0) CollectionsKt.firstOrNull(list) : null));
                                                                }
                                                            } else {
                                                                j6 = j14;
                                                            }
                                                            i17++;
                                                            j14 = j6 >> 8;
                                                        }
                                                        if (i16 != 8) {
                                                        }
                                                    }
                                                    if (i15 != length3) {
                                                        i15++;
                                                        j13 = j4;
                                                    }
                                                }
                                            } else {
                                                iArr2 = iArr4;
                                                jArr2 = jArr6;
                                                j4 = j13;
                                            }
                                        } else {
                                            upeVar2 = e;
                                            androidComposeView2 = androidComposeView4;
                                            iArr2 = iArr4;
                                            jArr2 = jArr6;
                                            j4 = j13;
                                            Object[] objArr2 = tpiVar.b;
                                            long[] jArr8 = tpiVar.a;
                                            int length4 = jArr8.length - 2;
                                            if (length4 >= 0) {
                                                int i18 = 0;
                                                while (true) {
                                                    long j15 = jArr8[i18];
                                                    Object[] objArr3 = objArr2;
                                                    if ((((~j15) << c) & j15 & j5) != j5) {
                                                        int i19 = 8 - ((~(i18 - length4)) >>> 31);
                                                        int i20 = 0;
                                                        while (i20 < i19) {
                                                            if ((j15 & j2) < j) {
                                                                i = i20;
                                                                xfp xfpVar3 = (xfp) objArr3[(i18 << 3) + i20];
                                                                jArr4 = jArr8;
                                                                xfp xfpVar4 = ufp.z;
                                                                if (Intrinsics.d(xfpVar3, xfpVar4)) {
                                                                    Object g2 = rfpVar.a.a.g(xfpVar4);
                                                                    if (g2 == null) {
                                                                        g2 = null;
                                                                    }
                                                                    List list2 = (List) g2;
                                                                    mn0 mn0Var = list2 != null ? (mn0) CollectionsKt.firstOrNull(list2) : null;
                                                                    Object g3 = tpiVar.g(xfpVar4);
                                                                    if (g3 == null) {
                                                                        g3 = null;
                                                                    }
                                                                    List list3 = (List) g3;
                                                                    mn0 mn0Var2 = list3 != null ? (mn0) CollectionsKt.firstOrNull(list3) : null;
                                                                    if (!Intrinsics.d(mn0Var, mn0Var2)) {
                                                                        tf0Var.j(i14, String.valueOf(mn0Var2));
                                                                    }
                                                                }
                                                            } else {
                                                                i = i20;
                                                                jArr4 = jArr8;
                                                            }
                                                            j15 >>= 8;
                                                            i20 = i + 1;
                                                            jArr8 = jArr4;
                                                        }
                                                        jArr3 = jArr8;
                                                        if (i19 != 8) {
                                                        }
                                                    } else {
                                                        jArr3 = jArr8;
                                                    }
                                                    if (i18 != length4) {
                                                        i18++;
                                                        objArr2 = objArr3;
                                                        jArr8 = jArr3;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        androidComposeView2 = androidComposeView4;
                                        iArr2 = iArr4;
                                        jArr2 = jArr6;
                                        j4 = j13;
                                        j5 = j11;
                                        upeVar2 = e;
                                    }
                                    j13 = j4 >> 8;
                                    i12++;
                                    e = upeVar2;
                                    androidComposeView4 = androidComposeView2;
                                    j11 = j5;
                                    iArr4 = iArr2;
                                    jArr6 = jArr2;
                                }
                                androidComposeView = androidComposeView4;
                                iArr = iArr4;
                                jArr = jArr6;
                                j3 = j11;
                                upeVar = e;
                                if (i11 != 8) {
                                }
                            } else {
                                androidComposeView = androidComposeView4;
                                iArr = iArr4;
                                jArr = jArr6;
                                j3 = j11;
                                upeVar = e;
                            }
                            if (i10 != length2) {
                                i10++;
                                e = upeVar;
                                androidComposeView4 = androidComposeView;
                                j11 = j3;
                                iArr4 = iArr;
                                jArr6 = jArr;
                            }
                        }
                    } else {
                        androidComposeView = androidComposeView4;
                        j3 = -9187201950435737472L;
                    }
                    soiVar.c();
                    upe e2 = tf0Var.e();
                    int[] iArr5 = e2.b;
                    Object[] objArr4 = e2.c;
                    long[] jArr9 = e2.a;
                    int length5 = jArr9.length - 2;
                    if (length5 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j16 = jArr9[i21];
                            if ((((~j16) << c) & j16 & j3) != j3) {
                                int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if ((j16 & j2) < j) {
                                        int i24 = (i21 << 3) + i23;
                                        soiVar.h(iArr5[i24], new rfp(((sfp) objArr4[i24]).a, tf0Var.e()));
                                    }
                                    j16 >>= 8;
                                }
                                if (i22 != 8) {
                                }
                            }
                            if (i21 != length5) {
                                i21++;
                            }
                        }
                    }
                    tf0Var.m = new rfp(androidComposeView.getSemanticsOwner().a(), tf0Var.e());
                    tf0Var.n = false;
                    return;
                }
                return;
            case 3:
                hm0 hm0Var = (hm0) ((hm0) this.b).c.a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = hm0Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i25 = 0;
                while (i25 < arrayList.size()) {
                    y8r y8rVar2 = (y8r) arrayList.get(i25);
                    if (y8rVar2 != null) {
                        ciq ciqVar = hm0Var.a;
                        Long l = (Long) ciqVar.get(y8rVar2);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                ciqVar.remove(y8rVar2);
                            }
                        }
                        long j17 = y8rVar2.i;
                        if (j17 == j10) {
                            y8rVar2.i = uptimeMillis;
                            y8rVar2.c(y8rVar2.b);
                        } else {
                            long j18 = uptimeMillis - j17;
                            y8rVar2.i = uptimeMillis;
                            float f2 = y8r.b().g;
                            long j19 = f2 == 0.0f ? 2147483647L : (long) (j18 / f2);
                            boolean z3 = y8rVar2.o;
                            float f3 = y8rVar2.n;
                            if (z3) {
                                if (f3 != Float.MAX_VALUE) {
                                    j7 = uptimeMillis2;
                                    y8rVar2.m.i = f3;
                                    y8rVar2.n = Float.MAX_VALUE;
                                } else {
                                    j7 = uptimeMillis2;
                                }
                                y8rVar2.b = (float) y8rVar2.m.i;
                                y8rVar2.a = 0.0f;
                                y8rVar2.o = z2;
                            } else {
                                j7 = uptimeMillis2;
                                z8r z8rVar = y8rVar2.m;
                                float f4 = y8rVar2.b;
                                float f5 = y8rVar2.a;
                                if (f3 != Float.MAX_VALUE) {
                                    long j20 = j19 / 2;
                                    yz0 c4 = z8rVar.c(f4, f5, j20);
                                    z8r z8rVar2 = y8rVar2.m;
                                    z8rVar2.i = y8rVar2.n;
                                    y8rVar2.n = Float.MAX_VALUE;
                                    yz0 c5 = z8rVar2.c(c4.a, c4.b, j20);
                                    y8rVar2.b = c5.a;
                                    y8rVar2.a = c5.b;
                                } else {
                                    yz0 c6 = z8rVar.c(f4, f5, j19);
                                    y8rVar2.b = c6.a;
                                    y8rVar2.a = c6.b;
                                }
                                float max = Math.max(y8rVar2.b, y8rVar2.h);
                                y8rVar2.b = max;
                                y8rVar2.b = Math.min(max, y8rVar2.g);
                                float f6 = y8rVar2.a;
                                z8r z8rVar3 = y8rVar2.m;
                                z8rVar3.getClass();
                                if (Math.abs(f6) >= z8rVar3.e || Math.abs(r8 - ((float) z8rVar3.i)) >= z8rVar3.d) {
                                    z = false;
                                } else {
                                    y8rVar2.b = (float) y8rVar2.m.i;
                                    y8rVar2.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min = Math.min(y8rVar2.b, y8rVar2.g);
                            y8rVar2.b = min;
                            float max2 = Math.max(min, y8rVar2.h);
                            y8rVar2.b = max2;
                            y8rVar2.c(max2);
                            if (z) {
                                ArrayList arrayList2 = y8rVar2.k;
                                y8rVar2.f = false;
                                hm0 b = y8r.b();
                                b.a.remove(y8rVar2);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(y8rVar2);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    b.f = true;
                                }
                                y8rVar2.i = 0L;
                                y8rVar2.c = false;
                                int i26 = 0;
                                while (i26 < arrayList2.size()) {
                                    if (arrayList2.get(i26) != null) {
                                        v7t v7tVar = (v7t) arrayList2.get(i26);
                                        float f7 = y8rVar2.b;
                                        w7t w7tVar = v7tVar.a;
                                        wvs wvsVar = wvs.c;
                                        n8t n8tVar = w7tVar.h;
                                        if (f7 < 1.0f) {
                                            long j21 = n8tVar.A;
                                            b8t X = n8tVar.X(0);
                                            b8t b8tVar = X.u;
                                            j9 = uptimeMillis;
                                            X.u = null;
                                            y8rVar = y8rVar2;
                                            n8tVar.L(-1L, w7tVar.a);
                                            n8tVar.L(j21, -1L);
                                            w7tVar.a = j21;
                                            Runnable runnable = w7tVar.g;
                                            if (runnable != null) {
                                                runnable.run();
                                            }
                                            n8tVar.w.clear();
                                            if (b8tVar != null) {
                                                b8tVar.E(b8tVar, wvsVar, true);
                                            }
                                        } else {
                                            j9 = uptimeMillis;
                                            y8rVar = y8rVar2;
                                            n8tVar.E(n8tVar, wvsVar, false);
                                        }
                                        i26++;
                                        uptimeMillis = j9;
                                        y8rVar2 = y8rVar;
                                    } else {
                                        j9 = uptimeMillis;
                                        y8rVar = y8rVar2;
                                    }
                                    i26++;
                                    uptimeMillis = j9;
                                    y8rVar2 = y8rVar;
                                }
                                j8 = uptimeMillis;
                                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                    if (arrayList2.get(size) == null) {
                                        arrayList2.remove(size);
                                    }
                                }
                            } else {
                                j8 = uptimeMillis;
                            }
                            i25++;
                            uptimeMillis = j8;
                            uptimeMillis2 = j7;
                            j10 = 0;
                            z = true;
                            z2 = false;
                        }
                    }
                    j8 = uptimeMillis;
                    j7 = uptimeMillis2;
                    i25++;
                    uptimeMillis = j8;
                    uptimeMillis2 = j7;
                    j10 = 0;
                    z = true;
                    z2 = false;
                }
                if (hm0Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        hm0Var.h.a();
                    }
                    i3 = 0;
                    hm0Var.f = false;
                } else {
                    i3 = 0;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) hm0Var.e.b).postFrameCallback(new gm0(hm0Var.d, i3));
                    return;
                }
                return;
            case 4:
                wt1 wt1Var = (wt1) this.b;
                synchronized (wt1Var.b) {
                    try {
                        if (wt1Var.n) {
                            return;
                        }
                        long j22 = wt1Var.m - 1;
                        wt1Var.m = j22;
                        if (j22 > 0) {
                            return;
                        }
                        if (j22 >= 0) {
                            wt1Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (wt1Var.b) {
                            wt1Var.o = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 5:
                z0j z0jVar = (z0j) this.b;
                ((Context) z0jVar.c).unregisterReceiver((iv1) z0jVar.d);
                return;
            case 6:
                iv1 iv1Var = (iv1) this.b;
                if (((z0j) iv1Var.d).b) {
                    ((urb) iv1Var.b).a.K1(3, false);
                    return;
                }
                return;
            case 7:
                gs4 gs4Var = ((h02) this.b).b;
                mkn mknVar = (mkn) gs4Var.e;
                if (mknVar != null) {
                    mknVar.cancel();
                }
                gs4Var.e = null;
                return;
            case 8:
                ck2 ck2Var = (ck2) this.b;
                rjp rjpVar = ck2Var.d;
                if (rjpVar != null) {
                    gyr gyrVar = (gyr) rjpVar.a;
                    if (!gyrVar.c && !gyrVar.b) {
                        rjpVar.c();
                    }
                }
                ck2Var.c = null;
                return;
            case 9:
                wt1 wt1Var2 = (wt1) this.b;
                synchronized (wt1Var2.b) {
                    try {
                        if (wt1Var2.n) {
                            return;
                        }
                        long j23 = wt1Var2.m - 1;
                        wt1Var2.m = j23;
                        if (j23 > 0) {
                            return;
                        }
                        if (j23 >= 0) {
                            wt1Var2.a();
                            return;
                        }
                        IllegalStateException illegalStateException2 = new IllegalStateException();
                        synchronized (wt1Var2.b) {
                            wt1Var2.o = illegalStateException2;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                ((ngu) this.b).requestLayout();
                return;
            case 11:
                a();
                return;
            case 12:
                ((C0) this.b).o();
                return;
            case 13:
                ((CameraService) this.b).stopSelf();
                return;
            case 14:
                ((CarouselLayoutManager) this.b).R0();
                return;
            case 15:
                ((dn4) this.b).s(true);
                return;
            case 16:
                ((a) this.b).x();
                return;
            case 17:
                en5 en5Var = (en5) this.b;
                Runnable runnable2 = en5Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                    en5Var.b = null;
                    return;
                }
                return;
            case 18:
                ln5.a((ln5) this.b);
                return;
            case 19:
                eps epsVar = (eps) this.b;
                hag.x((Context) epsVar.a, R.string.concert_load_error, 0);
                ((ty5) epsVar.d).e();
                return;
            case 20:
                Object obj = ((HashMap) ((x46) this.b).e.a).get(w46.a);
                Assertions.assertNonNull(obj, "getItemView() called before fill()");
                ((TextView) ((MenuItem) Preconditions.nonNull((MenuItem) obj)).getActionView()).setText(R.string.feedback_menu_send);
                return;
            case 21:
                ((ts6) this.b).e().f(new l7d(4, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 22:
                ls6 ls6Var = ((ws6) this.b).d;
                if (ls6Var != null) {
                    ls6Var.f(new yq6("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 4));
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
            case 23:
                b();
                return;
            case 24:
                i37 i37Var = ((l37) this.b).g;
                if (i37Var != null) {
                    i37Var.finish();
                    return;
                } else {
                    Intrinsics.j("callbacks");
                    throw null;
                }
            case 25:
                uj7 uj7Var = (uj7) this.b;
                c80 Y = uj7Var.Y();
                uj7Var.d0(Y, 1028, new gj7(Y, i4));
                uj7Var.f.d();
                return;
            case 26:
                gk7 gk7Var = (gk7) this.b;
                if (gk7Var.h0 >= 300000) {
                    gk7Var.r.n();
                    gk7Var.h0 = 0L;
                    return;
                }
                return;
            case 27:
                sl7 sl7Var = (sl7) this.b;
                if (sl7Var.c) {
                    return;
                }
                zqa zqaVar = sl7Var.b;
                if (zqaVar != null) {
                    zqaVar.x(sl7Var.a);
                }
                sl7Var.d.n.remove(sl7Var);
                sl7Var.c = true;
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((ql7) this.b).x(null);
                return;
            default:
                Function0 function0 = (Function0) ((xqn) this.b).a;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
