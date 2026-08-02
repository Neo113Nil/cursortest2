package com.google.android.gms.internal.ads;

import O.C0349t;
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
import r2.C4906k;

/* loaded from: classes2.dex */
public final class D8 extends Thread {

    /* renamed from: A, reason: collision with root package name */
    public final int f25089A;

    /* renamed from: B, reason: collision with root package name */
    public final int f25090B;

    /* renamed from: C, reason: collision with root package name */
    public final int f25091C;

    /* renamed from: D, reason: collision with root package name */
    public final int f25092D;

    /* renamed from: E, reason: collision with root package name */
    public final int f25093E;

    /* renamed from: F, reason: collision with root package name */
    public final String f25094F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f25095G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f25096H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25097n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25098u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25099v;

    /* renamed from: w, reason: collision with root package name */
    public final C3516l5 f25100w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25101x;

    /* renamed from: y, reason: collision with root package name */
    public final int f25102y;

    /* renamed from: z, reason: collision with root package name */
    public final int f25103z;

    public D8() {
        C3516l5 c3516l5 = new C3516l5(4, false);
        this.f25097n = false;
        this.f25098u = false;
        this.f25100w = c3516l5;
        this.f25099v = new Object();
        this.f25102y = ((Long) AbstractC2602Ha.f26083d.r()).intValue();
        this.f25103z = ((Long) AbstractC2602Ha.f26080a.r()).intValue();
        this.f25089A = ((Long) AbstractC2602Ha.f26084e.r()).intValue();
        this.f25090B = ((Long) AbstractC2602Ha.f26082c.r()).intValue();
        C3324ha c3324ha = AbstractC3592ma.C0;
        s2.r rVar = s2.r.f40506e;
        this.f25091C = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        C3324ha c3324ha2 = AbstractC3592ma.f32777D0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        this.f25092D = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).intValue();
        this.f25093E = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32786E0)).intValue();
        this.f25101x = ((Long) AbstractC2602Ha.f26085f.r()).intValue();
        this.f25094F = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32804G0);
        this.f25095G = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32810H0)).booleanValue();
        this.f25096H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32819I0)).booleanValue();
        ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32827J0)).getClass();
        setName("ContentFetchTask");
    }

    public final C0349t a(View view, C4220y8 c4220y8) {
        if (view == null) {
            return new C0349t(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0349t(this, 0, 0);
            }
            c4220y8.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C0349t(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC4084vh)) {
            WebView webView = (WebView) view;
            synchronized (c4220y8.f35901g) {
                c4220y8.f35906m++;
            }
            webView.post(new RunnableC3888s0(this, c4220y8, webView, globalVisibleRect));
            return new C0349t(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C0349t(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i4 = 0;
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            C0349t a9 = a(viewGroup.getChildAt(i6), c4220y8);
            i += a9.f2221a;
            i4 += a9.f2222b;
        }
        return new C0349t(this, i, i4);
    }

    public final void b() {
        synchronized (this.f25099v) {
            this.f25098u = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String sb2 = sb.toString();
            int i = w2.z.f41712b;
            x2.i.a(sb2);
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
    
        r0 = r2.C4906k.f40186C.f40195g.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.a("ContentFetchThread: no activity. Sleeping.");
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
    
        r2.C4906k.f40186C.f40196h.d("ContentFetchTask.extractContent", r0);
        r1 = w2.z.f41712b;
        x2.i.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f0, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00df, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.d("Error in ContentFetchTask", r0);
        r2.C4906k.f40186C.f40196h.d("ContentFetchTask.run", r0);
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
                com.bumptech.glide.manager.o oVar = C4906k.f40186C.f40195g;
                synchronized (oVar.f24255v) {
                    C4274z8 c4274z8 = (C4274z8) oVar.f24256w;
                    view = null;
                    application = c4274z8 != null ? c4274z8.f36082u : null;
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
                C4906k.f40186C.f40196h.d("ContentFetchTask.isInForeground", th);
            }
            int i = w2.z.f41712b;
            x2.i.a("ContentFetchTask: sleeping");
            b();
            Thread.sleep(this.f25101x * 1000);
            obj = this.f25099v;
            synchronized (obj) {
                while (this.f25098u) {
                    try {
                        int i4 = w2.z.f41712b;
                        x2.i.a("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new RunnableC3996u0(this, view, 4, false));
        }
        Thread.sleep(this.f25101x * 1000);
        obj = this.f25099v;
        synchronized (obj) {
        }
    }
}
