package com.google.android.gms.internal.ads;

import O.C0344t;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class D8 extends Thread {

    /* renamed from: A, reason: collision with root package name */
    public final int f24344A;

    /* renamed from: B, reason: collision with root package name */
    public final int f24345B;

    /* renamed from: C, reason: collision with root package name */
    public final int f24346C;

    /* renamed from: D, reason: collision with root package name */
    public final int f24347D;

    /* renamed from: E, reason: collision with root package name */
    public final int f24348E;

    /* renamed from: F, reason: collision with root package name */
    public final String f24349F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f24350G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f24351H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24352n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24353u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24354v;

    /* renamed from: w, reason: collision with root package name */
    public final C3493l5 f24355w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24356x;

    /* renamed from: y, reason: collision with root package name */
    public final int f24357y;

    /* renamed from: z, reason: collision with root package name */
    public final int f24358z;

    public D8() {
        C3493l5 c3493l5 = new C3493l5(4, false);
        this.f24352n = false;
        this.f24353u = false;
        this.f24355w = c3493l5;
        this.f24354v = new Object();
        this.f24357y = ((Long) AbstractC2582Ha.f25330d.r()).intValue();
        this.f24358z = ((Long) AbstractC2582Ha.f25327a.r()).intValue();
        this.f24344A = ((Long) AbstractC2582Ha.f25331e.r()).intValue();
        this.f24345B = ((Long) AbstractC2582Ha.f25329c.r()).intValue();
        C3301ha c3301ha = AbstractC3569ma.C0;
        q2.r rVar = q2.r.f40204e;
        this.f24346C = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
        C3301ha c3301ha2 = AbstractC3569ma.f31997D0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        this.f24347D = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue();
        this.f24348E = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32006E0)).intValue();
        this.f24356x = ((Long) AbstractC2582Ha.f25332f.r()).intValue();
        this.f24349F = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32023G0);
        this.f24350G = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32031H0)).booleanValue();
        this.f24351H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32039I0)).booleanValue();
        ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32047J0)).getClass();
        setName("ContentFetchTask");
    }

    public final C0344t a(View view, C4197y8 c4197y8) {
        if (view == null) {
            return new C0344t(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0344t(this, 0, 0);
            }
            c4197y8.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C0344t(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC4061vh)) {
            WebView webView = (WebView) view;
            synchronized (c4197y8.f35115g) {
                c4197y8.f35120m++;
            }
            webView.post(new RunnableC3865s0(this, c4197y8, webView, globalVisibleRect));
            return new C0344t(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C0344t(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i6 = 0;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            C0344t a9 = a(viewGroup.getChildAt(i9), c4197y8);
            i += a9.f2133a;
            i6 += a9.f2134b;
        }
        return new C0344t(this, i, i6);
    }

    public final void b() {
        synchronized (this.f24354v) {
            this.f24353u = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String sb2 = sb.toString();
            int i = u2.z.f41319b;
            v2.i.a(sb2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.importance != 100) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r3.inKeyguardRestrictedInputMode() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r0.isScreenOn() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r0 = p2.C4835j.f39730C.f39739g.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r1 = u2.z.f41319b;
        v2.i.a("ContentFetchThread: no activity. Sleeping.");
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        if (r0.getWindow() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0090, code lost:
    
        r2 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a1, code lost:
    
        p2.C4835j.f39730C.f39740h.d("ContentFetchTask.extractContent", r0);
        r1 = u2.z.f41319b;
        v2.i.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f0, code lost:
    
        r1 = u2.z.f41319b;
        v2.i.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00df, code lost:
    
        r1 = u2.z.f41319b;
        v2.i.d("Error in ContentFetchTask", r0);
        p2.C4835j.f39730C.f39740h.d("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa A[EXC_TOP_SPLITTER, LOOP:2: B:37:0x00fa->B:44:0x00fa, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        View view;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        while (true) {
            try {
                com.bumptech.glide.manager.p pVar = C4835j.f39730C.f39739g;
                synchronized (pVar.f23470v) {
                    C4251z8 c4251z8 = (C4251z8) pVar.f23471w;
                    view = null;
                    application = c4251z8 != null ? c4251z8.f35298u : null;
                }
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C4835j.f39730C.f39740h.d("ContentFetchTask.isInForeground", th);
            }
            int i = u2.z.f41319b;
            v2.i.a("ContentFetchTask: sleeping");
            b();
            Thread.sleep(this.f24356x * 1000);
            obj = this.f24354v;
            synchronized (obj) {
                while (this.f24353u) {
                    try {
                        int i6 = u2.z.f41319b;
                        v2.i.a("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new RunnableC3973u0(this, view, 4, false));
        }
        Thread.sleep(this.f24356x * 1000);
        obj = this.f24354v;
        synchronized (obj) {
        }
    }
}
