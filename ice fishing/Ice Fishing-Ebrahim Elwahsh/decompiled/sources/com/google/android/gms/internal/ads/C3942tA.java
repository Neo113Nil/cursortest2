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

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3942tA implements InterfaceC3673oA {

    /* renamed from: a, reason: collision with root package name */
    public long f34367a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f34368b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f34369c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f34370d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f34371e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f34372f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f34373g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f34374h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean a(View view) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final synchronized void b(HashMap hashMap) {
        this.f34374h = this.f34373g;
        this.f34373g = SystemClock.uptimeMillis();
        e(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final synchronized void c(HashMap hashMap) {
        this.f34368b = this.f34367a;
        this.f34367a = SystemClock.uptimeMillis();
        e(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (a(r8) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0018, B:8:0x001f, B:13:0x0072, B:14:0x0074, B:19:0x0044, B:21:0x004b, B:24:0x006d, B:26:0x0067, B:28:0x0026, B:31:0x0031, B:33:0x003a, B:35:0x003e), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d(HashMap hashMap, Context context, View view) {
        boolean isUiContext;
        try {
            this.f34370d = this.f34369c;
            this.f34369c = SystemClock.uptimeMillis();
            long j9 = this.f34371e;
            if (j9 != -1) {
                this.f34372f = j9;
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
                            this.f34371e = this.f34369c;
                            e(hashMap);
                        }
                    }
                    this.f34371e = -1L;
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
            this.f34371e = -1L;
            e(hashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.f34367a));
        hashMap.put("tpq", Long.valueOf(this.f34368b));
        hashMap.put("tcc", Long.valueOf(this.f34373g));
        hashMap.put("tpc", Long.valueOf(this.f34374h));
        hashMap.put("tpv", Long.valueOf(this.f34370d));
        hashMap.put("tcv", Long.valueOf(this.f34369c));
        hashMap.put("tchv", Long.valueOf(this.f34371e));
        hashMap.put("tphv", Long.valueOf(this.f34372f));
        hashMap.put("tst", Long.valueOf(this.i));
    }
}
