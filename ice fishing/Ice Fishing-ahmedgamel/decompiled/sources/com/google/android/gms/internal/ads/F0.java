package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public long f25457a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f25458b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f25459c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f25460d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f25461e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f25462f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f25463g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f25464h = -1;

    public static long a(long j6, long j9, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || 1 + j9 >= j10) {
            return j11;
        }
        long j14 = (long) (((j12 - j11) / (j10 - j9)) * (j6 - j9));
        String str = AbstractC3182eu.f30782a;
        return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (r6.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, View view) {
        this.f25460d = this.f25459c;
        this.f25459c = SystemClock.uptimeMillis();
        long j6 = this.f25461e;
        if (j6 != -1) {
            this.f25462f = j6;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (view != null) {
            int min = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
            if (min + min < i) {
                if (min == 0) {
                    try {
                        if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                            view = ((ViewGroup) view).getChildAt(0);
                        }
                        Object invoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
                        Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
                        num.intValue();
                        String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
                        if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                        }
                    } catch (ReflectiveOperationException | SecurityException unused2) {
                    }
                }
            }
            this.f25461e = this.f25459c;
            return;
        }
        this.f25461e = -1L;
    }
}
