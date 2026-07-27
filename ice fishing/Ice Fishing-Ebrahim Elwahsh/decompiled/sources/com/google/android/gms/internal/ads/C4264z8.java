package com.google.android.gms.internal.ads;

import O.C0357t;
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

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4264z8 extends Thread {

    /* renamed from: A, reason: collision with root package name */
    public final int f35481A;

    /* renamed from: B, reason: collision with root package name */
    public final int f35482B;

    /* renamed from: C, reason: collision with root package name */
    public final int f35483C;

    /* renamed from: D, reason: collision with root package name */
    public final int f35484D;

    /* renamed from: E, reason: collision with root package name */
    public final int f35485E;

    /* renamed from: F, reason: collision with root package name */
    public final String f35486F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f35487G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f35488H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35489n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35490u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f35491v;

    /* renamed from: w, reason: collision with root package name */
    public final C3398j5 f35492w;

    /* renamed from: x, reason: collision with root package name */
    public final int f35493x;

    /* renamed from: y, reason: collision with root package name */
    public final int f35494y;

    /* renamed from: z, reason: collision with root package name */
    public final int f35495z;

    public C4264z8() {
        C3398j5 c3398j5 = new C3398j5(4, false);
        this.f35489n = false;
        this.f35490u = false;
        this.f35492w = c3398j5;
        this.f35491v = new Object();
        this.f35494y = ((Long) AbstractC2513Da.f24446d.r()).intValue();
        this.f35495z = ((Long) AbstractC2513Da.f24443a.r()).intValue();
        this.f35481A = ((Long) AbstractC2513Da.f24447e.r()).intValue();
        this.f35482B = ((Long) AbstractC2513Da.f24445c.r()).intValue();
        C3151ea c3151ea = AbstractC3368ia.C0;
        q2.r rVar = q2.r.f40116e;
        this.f35483C = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        C3151ea c3151ea2 = AbstractC3368ia.f31417D0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        this.f35484D = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue();
        this.f35485E = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31426E0)).intValue();
        this.f35493x = ((Long) AbstractC2513Da.f24448f.r()).intValue();
        this.f35486F = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31443G0);
        this.f35487G = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31451H0)).booleanValue();
        this.f35488H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31458I0)).booleanValue();
        ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31465J0)).getClass();
        setName("ContentFetchTask");
    }

    public final C0357t a(View view, C4048v8 c4048v8) {
        if (view == null) {
            return new C0357t(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0357t(this, 0, 0);
            }
            c4048v8.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C0357t(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC3858rh)) {
            WebView webView = (WebView) view;
            synchronized (c4048v8.f34723g) {
                c4048v8.f34728m++;
            }
            webView.post(new RunnableC3771q0(this, c4048v8, webView, globalVisibleRect));
            return new C0357t(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C0357t(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i4 = 0;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            C0357t a9 = a(viewGroup.getChildAt(i9), c4048v8);
            i += a9.f2319a;
            i4 += a9.f2320b;
        }
        return new C0357t(this, i, i4);
    }

    public final void b() {
        synchronized (this.f35491v) {
            this.f35490u = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String sb2 = sb.toString();
            int i = t2.C.f40822b;
            u2.i.a(sb2);
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
    
        r0 = p2.j.f39798C.f39807g.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.a("ContentFetchThread: no activity. Sleeping.");
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
    
        p2.j.f39798C.f39808h.d("ContentFetchTask.extractContent", r0);
        r1 = t2.C.f40822b;
        u2.i.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f0, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00df, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.d("Error in ContentFetchTask", r0);
        p2.j.f39798C.f39808h.d("ContentFetchTask.run", r0);
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
                com.bumptech.glide.manager.o oVar = p2.j.f39798C.f39807g;
                synchronized (oVar.f23624v) {
                    C4102w8 c4102w8 = (C4102w8) oVar.f23625w;
                    view = null;
                    application = c4102w8 != null ? c4102w8.f34947u : null;
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
                p2.j.f39798C.f39808h.d("ContentFetchTask.isInForeground", th);
            }
            int i = t2.C.f40822b;
            u2.i.a("ContentFetchTask: sleeping");
            b();
            Thread.sleep(this.f35493x * 1000);
            obj = this.f35491v;
            synchronized (obj) {
                while (this.f35490u) {
                    try {
                        int i4 = t2.C.f40822b;
                        u2.i.a("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new MD(this, view, 5, false));
        }
        Thread.sleep(this.f35493x * 1000);
        obj = this.f35491v;
        synchronized (obj) {
        }
    }
}
