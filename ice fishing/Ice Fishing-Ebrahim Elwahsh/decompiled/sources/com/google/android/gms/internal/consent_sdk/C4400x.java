package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4400x {

    /* renamed from: b, reason: collision with root package name */
    public final Application f35946b;

    /* renamed from: c, reason: collision with root package name */
    public final C4396w f35947c;

    /* renamed from: d, reason: collision with root package name */
    public final B f35948d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35949e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f35950f = new AtomicReference(new ArrayDeque());

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f35951g = new AtomicReference(new ArrayDeque());

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f35952h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f35953j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f35954k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f35955l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f35945a = new AtomicReference(null);

    public C4400x(Application application, B b9, C4396w c4396w, boolean z8) {
        this.f35949e = z8;
        this.f35946b = application;
        this.f35947c = c4396w;
        this.f35948d = b9;
    }

    public final void a(Queue queue, int i, int i4, String str) {
        Bundle bundle;
        Long l9 = (Long) queue.poll();
        if (l9 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l9.longValue();
            if (str != null) {
                i = i4;
            }
            AtomicReference atomicReference = this.f35954k;
            Queue queue2 = (Queue) atomicReference.get();
            C4396w c4396w = this.f35947c;
            c4396w.getClass();
            O0 m8 = P0.m();
            C4389u0 m9 = B0.m();
            C4401x0 m10 = C4405y0.m();
            m10.j();
            C4405y0.p((C4405y0) m10.f35890u, i);
            if (str != null) {
                m10.j();
                C4405y0.n((C4405y0) m10.f35890u, str);
            }
            if (currentTimeMillis > 0) {
                m10.j();
                C4405y0.o((C4405y0) m10.f35890u, currentTimeMillis);
            }
            C4405y0 c4405y0 = (C4405y0) m10.h();
            m9.j();
            B0.r((B0) m9.f35890u, c4405y0);
            String str2 = c4396w.f35941e;
            PackageInfo packageInfo = null;
            Application application = c4396w.f35937a;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    c4396w.f35941e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(c4396w.f35941e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = c4396w.f35941e;
            }
            if (str2 != null) {
                m9.j();
                B0.o((B0) m9.f35890u, str2);
            }
            A0 a02 = c4396w.f35938b;
            if (a02 == null) {
                C4409z0 m11 = A0.m();
                m11.j();
                A0.n((A0) m11.f35890u);
                a02 = (A0) m11.h();
                c4396w.f35938b = a02;
            }
            m9.j();
            B0.s((B0) m9.f35890u, a02);
            C4397w0 c4397w0 = c4396w.f35940d;
            if (c4397w0 == null) {
                C4393v0 m12 = C4397w0.m();
                int i9 = Build.VERSION.SDK_INT;
                m12.j();
                C4397w0.n((C4397w0) m12.f35890u, i9);
                String str3 = Build.MODEL;
                m12.j();
                C4397w0.o((C4397w0) m12.f35890u);
                m12.j();
                C4397w0.q((C4397w0) m12.f35890u);
                String str4 = Build.VERSION.RELEASE;
                m12.j();
                C4397w0.p((C4397w0) m12.f35890u);
                c4397w0 = (C4397w0) m12.h();
                c4396w.f35940d = c4397w0;
            }
            m9.j();
            B0.q((B0) m9.f35890u, c4397w0);
            C4385t0 c4385t0 = c4396w.f35939c;
            if (c4385t0 == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    C4381s0 m13 = C4385t0.m();
                    String l10 = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    m13.j();
                    C4385t0.o((C4385t0) m13.f35890u, l10);
                    m13.j();
                    C4385t0.n((C4385t0) m13.f35890u, packageName);
                    c4396w.f35939c = (C4385t0) m13.h();
                }
                c4385t0 = c4396w.f35939c;
            }
            if (c4385t0 != null) {
                m9.j();
                B0.p((B0) m9.f35890u, c4385t0);
            }
            String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string != null && !string.isEmpty()) {
                F f6 = new F(string);
                while (f6.hasNext()) {
                    String str5 = (String) f6.next();
                    m9.j();
                    B0.n((B0) m9.f35890u, str5);
                }
            }
            B0 b02 = (B0) m9.h();
            m8.j();
            P0.n((P0) m8.f35890u, b02);
            long currentTimeMillis2 = System.currentTimeMillis();
            m8.j();
            P0.o((P0) m8.f35890u, currentTimeMillis2);
            queue2.add((P0) m8.h());
            if (this.f35949e) {
                ((ArrayDeque) this.f35955l.get()).addAll((Collection) atomicReference.get());
            }
            this.f35948d.execute(new RunnableC4337h(1, this));
        }
    }
}
