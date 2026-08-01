package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3768qA implements InterfaceC3552mA {

    /* renamed from: a, reason: collision with root package name */
    public long f33199a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f33200b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f33201c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f33202d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f33203e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f33204f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f33205g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f33206h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean c(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final synchronized void a(HashMap hashMap) {
        this.f33206h = this.f33205g;
        this.f33205g = SystemClock.uptimeMillis();
        e(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final synchronized void b(HashMap hashMap) {
        this.f33200b = this.f33199a;
        this.f33199a = SystemClock.uptimeMillis();
        e(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (c(r8) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0018, B:8:0x001f, B:13:0x0072, B:14:0x0074, B:19:0x0044, B:21:0x004b, B:24:0x006d, B:26:0x0067, B:28:0x0026, B:31:0x0031, B:33:0x003a, B:35:0x003e), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d(HashMap hashMap, Context context, View view) {
        boolean isUiContext;
        try {
            this.f33202d = this.f33201c;
            this.f33201c = SystemClock.uptimeMillis();
            long j6 = this.f33203e;
            if (j6 != -1) {
                this.f33204f = j6;
            }
            DisplayMetrics displayMetrics = null;
            if (Build.VERSION.SDK_INT >= 33) {
                isUiContext = context.isUiContext();
                if (!isUiContext) {
                    if (displayMetrics == null) {
                        int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                        if (view != null) {
                            int min = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                            if (min + min < i) {
                                if (min == 0) {
                                }
                            }
                            this.f33203e = this.f33201c;
                            e(hashMap);
                        }
                    }
                    this.f33203e = -1L;
                    e(hashMap);
                }
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics == null) {
            }
            this.f33203e = -1L;
            e(hashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.f33199a));
        hashMap.put("tpq", Long.valueOf(this.f33200b));
        hashMap.put("tcc", Long.valueOf(this.f33205g));
        hashMap.put("tpc", Long.valueOf(this.f33206h));
        hashMap.put("tpv", Long.valueOf(this.f33202d));
        hashMap.put("tcv", Long.valueOf(this.f33201c));
        hashMap.put("tchv", Long.valueOf(this.f33203e));
        hashMap.put("tphv", Long.valueOf(this.f33204f));
        hashMap.put("tst", Long.valueOf(this.i));
    }
}
