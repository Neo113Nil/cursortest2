package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3vfVszL implements Runnable {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ d3vfVszL(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i;
        long j;
        float f;
        boolean z;
        int i2 = this.NCTxEWno;
        int i3 = 2;
        boolean z2 = false;
        Object obj2 = this.MdtA4re8;
        switch (i2) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = nJuO6ggC.b2ZJblxo;
                Method method = nJuO6ggC.P7K7Inc8;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r5 = 27;
                if (((i4 != 26 && i4 != 27) || method != null) && (nJuO6ggC.VgvYg0wo != null || nJuO6ggC.wxUZMvaN != null)) {
                    try {
                        Object obj3 = nJuO6ggC.MdtA4re8.get(activity);
                        if (obj3 != null && (obj = nJuO6ggC.NCTxEWno.get(activity)) != null) {
                            Application application = activity.getApplication();
                            YksF3V7p yksF3V7p = new YksF3V7p(activity);
                            application.registerActivityLifecycleCallbacks(yksF3V7p);
                            handler.post(new XrPeKzBk(yksF3V7p, obj3, 1, false));
                            Application application2 = (i4 == 26 || i4 == 27) ? 1 : null;
                            try {
                                if (application2 != null) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application2 = application;
                                        r5 = yksF3V7p;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application2 = application;
                                        YksF3V7p yksF3V7p2 = yksF3V7p;
                                        handler.post(new XrPeKzBk(application2, yksF3V7p2, i3, false));
                                        throw th;
                                    }
                                } else {
                                    application2 = application;
                                    r5 = yksF3V7p;
                                    activity.recreate();
                                }
                                handler.post(new XrPeKzBk(application2, r5, i3, false));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                NqvILgmY nqvILgmY = (NqvILgmY) ((NqvILgmY) obj2).MdtA4re8.MdtA4re8;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = nqvILgmY.NCTxEWno;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    f80 f80Var = (f80) arrayList.get(i5);
                    if (f80Var != null) {
                        p70 p70Var = nqvILgmY.qoPGr6Ce;
                        Long l = (Long) p70Var.get(f80Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                p70Var.remove(f80Var);
                            }
                        }
                        long j2 = f80Var.b2ZJblxo;
                        if (j2 == 0) {
                            f80Var.b2ZJblxo = uptimeMillis;
                            f80Var.NCTxEWno(f80Var.NCTxEWno);
                        } else {
                            long j3 = uptimeMillis - j2;
                            f80Var.b2ZJblxo = uptimeMillis;
                            float f2 = NqvILgmY.qoPGr6Ce().b2ZJblxo;
                            long j4 = f2 == 0.0f ? 2147483647L : (long) (j3 / f2);
                            boolean z3 = f80Var.OnDfzHZD;
                            float f3 = f80Var.ow5vqvCr;
                            if (z3) {
                                if (f3 != Float.MAX_VALUE) {
                                    i = i5;
                                    f80Var.k3x7lurq.jb9XjC4I = f3;
                                    f80Var.ow5vqvCr = Float.MAX_VALUE;
                                } else {
                                    i = i5;
                                }
                                f80Var.NCTxEWno = (float) f80Var.k3x7lurq.jb9XjC4I;
                                f80Var.qoPGr6Ce = 0.0f;
                                f80Var.OnDfzHZD = z2;
                                j = uptimeMillis;
                            } else {
                                i = i5;
                                g80 g80Var = f80Var.k3x7lurq;
                                float f4 = f80Var.NCTxEWno;
                                float f5 = f80Var.qoPGr6Ce;
                                if (f3 != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    ke MdtA4re8 = g80Var.MdtA4re8(f4, f5, j5);
                                    g80 g80Var2 = f80Var.k3x7lurq;
                                    g80Var2.jb9XjC4I = f80Var.ow5vqvCr;
                                    f80Var.ow5vqvCr = Float.MAX_VALUE;
                                    j = uptimeMillis;
                                    ke MdtA4re82 = g80Var2.MdtA4re8(MdtA4re8.qoPGr6Ce, MdtA4re8.NCTxEWno, j5);
                                    f = MdtA4re82.qoPGr6Ce;
                                    f80Var.NCTxEWno = f;
                                    f80Var.qoPGr6Ce = MdtA4re82.NCTxEWno;
                                } else {
                                    j = uptimeMillis;
                                    ke MdtA4re83 = g80Var.MdtA4re8(f4, f5, j4);
                                    f = MdtA4re83.qoPGr6Ce;
                                    f80Var.NCTxEWno = f;
                                    f80Var.qoPGr6Ce = MdtA4re83.NCTxEWno;
                                }
                                float max = Math.max(f, -3.4028235E38f);
                                f80Var.NCTxEWno = max;
                                f80Var.NCTxEWno = Math.min(max, Float.MAX_VALUE);
                                float f6 = f80Var.qoPGr6Ce;
                                g80 g80Var3 = f80Var.k3x7lurq;
                                g80Var3.getClass();
                                if (Math.abs(f6) >= g80Var3.VgvYg0wo || Math.abs(r2 - ((float) g80Var3.jb9XjC4I)) >= g80Var3.wxUZMvaN) {
                                    z = false;
                                    float min = Math.min(f80Var.NCTxEWno, Float.MAX_VALUE);
                                    f80Var.NCTxEWno = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    f80Var.NCTxEWno = max2;
                                    f80Var.NCTxEWno(max2);
                                    if (!z) {
                                        ArrayList arrayList2 = f80Var.jb9XjC4I;
                                        f80Var.P7K7Inc8 = false;
                                        NqvILgmY qoPGr6Ce = NqvILgmY.qoPGr6Ce();
                                        qoPGr6Ce.qoPGr6Ce.remove(f80Var);
                                        ArrayList arrayList3 = qoPGr6Ce.NCTxEWno;
                                        int indexOf = arrayList3.indexOf(f80Var);
                                        if (indexOf >= 0) {
                                            arrayList3.set(indexOf, null);
                                            qoPGr6Ce.P7K7Inc8 = true;
                                        }
                                        f80Var.b2ZJblxo = 0L;
                                        f80Var.MdtA4re8 = false;
                                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                            if (arrayList2.get(i6) != null) {
                                                c2 c2Var = ((z1) arrayList2.get(i6)).qoPGr6Ce;
                                                if (c2Var.getProgressDrawable() != null && c2Var.getProgressDrawable().getLevel() == 10000) {
                                                    a2 a2Var = c2Var.OnDfzHZD;
                                                    if (c2Var.getVisibility() != 0) {
                                                        c2Var.removeCallbacks(c2Var.ow5vqvCr);
                                                    } else {
                                                        c2Var.removeCallbacks(a2Var);
                                                        long uptimeMillis3 = SystemClock.uptimeMillis() - c2Var.P7K7Inc8;
                                                        long j6 = c2Var.VgvYg0wo;
                                                        if (uptimeMillis3 >= j6) {
                                                            a2Var.run();
                                                        } else {
                                                            c2Var.postDelayed(a2Var, j6 - uptimeMillis3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    }
                                    i5 = i + 1;
                                    uptimeMillis = j;
                                    z2 = false;
                                } else {
                                    f80Var.NCTxEWno = (float) f80Var.k3x7lurq.jb9XjC4I;
                                    f80Var.qoPGr6Ce = 0.0f;
                                }
                            }
                            z = true;
                            float min2 = Math.min(f80Var.NCTxEWno, Float.MAX_VALUE);
                            f80Var.NCTxEWno = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            f80Var.NCTxEWno = max22;
                            f80Var.NCTxEWno(max22);
                            if (!z) {
                            }
                            i5 = i + 1;
                            uptimeMillis = j;
                            z2 = false;
                        }
                    }
                    i = i5;
                    j = uptimeMillis;
                    i5 = i + 1;
                    uptimeMillis = j;
                    z2 = false;
                }
                if (nqvILgmY.P7K7Inc8) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        mcXgUFR8 mcxgufr8 = nqvILgmY.Qr9iLBAD;
                        ValueAnimator.unregisterDurationScaleChangeListener((h1iH8bHm) mcxgufr8.MdtA4re8);
                        mcxgufr8.MdtA4re8 = null;
                    }
                    nqvILgmY.P7K7Inc8 = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) nqvILgmY.VgvYg0wo.MdtA4re8).postFrameCallback(new brU71aZT(nqvILgmY.wxUZMvaN));
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).f7oeun2L();
                return;
            case 3:
                ((f4UNdked) obj2).invalidateOptionsMenu();
                return;
            case 4:
                l7 l7Var = (l7) obj2;
                Runnable runnable = l7Var.MdtA4re8;
                if (runnable != null) {
                    runnable.run();
                    l7Var.MdtA4re8 = null;
                    return;
                }
                return;
            case 5:
                o7.MdtA4re8((o7) obj2);
                return;
            case 6:
                uh uhVar = (uh) obj2;
                synchronized (uhVar.MdtA4re8) {
                    try {
                        if (uhVar.b2ZJblxo == null) {
                            return;
                        }
                        try {
                            ei MdtA4re84 = uhVar.MdtA4re8();
                            int i7 = MdtA4re84.P7K7Inc8;
                            if (i7 == 2) {
                                synchronized (uhVar.MdtA4re8) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = jd0.qoPGr6Ce;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = uhVar.qoPGr6Ce;
                                ei[] eiVarArr = {MdtA4re84};
                                e50 e50Var = me0.qoPGr6Ce;
                                f50.wxUZMvaN("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface P7K7Inc8 = me0.qoPGr6Ce.P7K7Inc8(context, eiVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer ow5vqvCr = f50.ow5vqvCr(uhVar.qoPGr6Ce, MdtA4re84.qoPGr6Ce);
                                    if (ow5vqvCr == null || P7K7Inc8 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        VZZbw3BB vZZbw3BB = new VZZbw3BB(P7K7Inc8, ra.Mq3SeTnW(ow5vqvCr));
                                        Trace.endSection();
                                        synchronized (uhVar.MdtA4re8) {
                                            try {
                                                ra raVar = uhVar.b2ZJblxo;
                                                if (raVar != null) {
                                                    raVar.DK9slbsy(vZZbw3BB);
                                                }
                                            } finally {
                                            }
                                        }
                                        uhVar.NCTxEWno();
                                        return;
                                    } finally {
                                        int i9 = jd0.qoPGr6Ce;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (uhVar.MdtA4re8) {
                                try {
                                    ra raVar2 = uhVar.b2ZJblxo;
                                    if (raVar2 != null) {
                                        raVar2.WYNAV5pd(th3);
                                    }
                                    uhVar.NCTxEWno();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 7:
                li liVar = (li) obj2;
                liVar.nSmgoSB5.b2ZJblxo.jb9XjC4I(liVar.VgvYg0wo);
                liVar.VgvYg0wo = null;
                return;
            case 8:
                ((hr) obj2).sjUBp5pO();
                return;
            case 9:
                g00 g00Var = (g00) obj2;
                xo xoVar = g00Var.b2ZJblxo;
                if (g00Var.MdtA4re8 == 0) {
                    g00Var.wxUZMvaN = true;
                    xoVar.wxUZMvaN(oo.ON_PAUSE);
                }
                if (g00Var.NCTxEWno == 0 && g00Var.wxUZMvaN) {
                    xoVar.wxUZMvaN(oo.ON_STOP);
                    g00Var.VgvYg0wo = true;
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((tg0) obj2).MdtA4re8;
                int i10 = sideSheetBehavior.OxcuoDLp;
                if (i10 != 2 || i10 == 0) {
                    return;
                }
                sideSheetBehavior.OxcuoDLp = 0;
                return;
        }
    }
}
