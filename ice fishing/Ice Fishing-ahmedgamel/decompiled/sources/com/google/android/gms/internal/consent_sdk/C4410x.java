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
public final class C4410x {

    /* renamed from: b, reason: collision with root package name */
    public final Application f36552b;

    /* renamed from: c, reason: collision with root package name */
    public final C4406w f36553c;

    /* renamed from: d, reason: collision with root package name */
    public final B f36554d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36555e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f36556f = new AtomicReference(new ArrayDeque());

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f36557g = new AtomicReference(new ArrayDeque());

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f36558h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f36559j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f36560k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f36561l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f36551a = new AtomicReference(null);

    public C4410x(Application application, B b9, C4406w c4406w, boolean z6) {
        this.f36555e = z6;
        this.f36552b = application;
        this.f36553c = c4406w;
        this.f36554d = b9;
    }

    public final void a(Queue queue, int i, int i4, String str) {
        Bundle bundle;
        Long l9 = (Long) queue.poll();
        if (l9 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l9.longValue();
            if (str != null) {
                i = i4;
            }
            AtomicReference atomicReference = this.f36560k;
            Queue queue2 = (Queue) atomicReference.get();
            C4406w c4406w = this.f36553c;
            c4406w.getClass();
            O0 m9 = P0.m();
            C4399u0 m10 = B0.m();
            C4411x0 m11 = C4415y0.m();
            m11.j();
            C4415y0.p((C4415y0) m11.f36496u, i);
            if (str != null) {
                m11.j();
                C4415y0.n((C4415y0) m11.f36496u, str);
            }
            if (currentTimeMillis > 0) {
                m11.j();
                C4415y0.o((C4415y0) m11.f36496u, currentTimeMillis);
            }
            C4415y0 c4415y0 = (C4415y0) m11.h();
            m10.j();
            B0.r((B0) m10.f36496u, c4415y0);
            String str2 = c4406w.f36547e;
            PackageInfo packageInfo = null;
            Application application = c4406w.f36543a;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    c4406w.f36547e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(c4406w.f36547e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = c4406w.f36547e;
            }
            if (str2 != null) {
                m10.j();
                B0.o((B0) m10.f36496u, str2);
            }
            A0 a02 = c4406w.f36544b;
            if (a02 == null) {
                C4419z0 m12 = A0.m();
                m12.j();
                A0.n((A0) m12.f36496u);
                a02 = (A0) m12.h();
                c4406w.f36544b = a02;
            }
            m10.j();
            B0.s((B0) m10.f36496u, a02);
            C4407w0 c4407w0 = c4406w.f36546d;
            if (c4407w0 == null) {
                C4403v0 m13 = C4407w0.m();
                int i6 = Build.VERSION.SDK_INT;
                m13.j();
                C4407w0.n((C4407w0) m13.f36496u, i6);
                String str3 = Build.MODEL;
                m13.j();
                C4407w0.o((C4407w0) m13.f36496u);
                m13.j();
                C4407w0.q((C4407w0) m13.f36496u);
                String str4 = Build.VERSION.RELEASE;
                m13.j();
                C4407w0.p((C4407w0) m13.f36496u);
                c4407w0 = (C4407w0) m13.h();
                c4406w.f36546d = c4407w0;
            }
            m10.j();
            B0.q((B0) m10.f36496u, c4407w0);
            C4395t0 c4395t0 = c4406w.f36545c;
            if (c4395t0 == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    C4391s0 m14 = C4395t0.m();
                    String l10 = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    m14.j();
                    C4395t0.o((C4395t0) m14.f36496u, l10);
                    m14.j();
                    C4395t0.n((C4395t0) m14.f36496u, packageName);
                    c4406w.f36545c = (C4395t0) m14.h();
                }
                c4395t0 = c4406w.f36545c;
            }
            if (c4395t0 != null) {
                m10.j();
                B0.p((B0) m10.f36496u, c4395t0);
            }
            String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string != null && !string.isEmpty()) {
                F f2 = new F(string);
                while (f2.hasNext()) {
                    String str5 = (String) f2.next();
                    m10.j();
                    B0.n((B0) m10.f36496u, str5);
                }
            }
            B0 b02 = (B0) m10.h();
            m9.j();
            P0.n((P0) m9.f36496u, b02);
            long currentTimeMillis2 = System.currentTimeMillis();
            m9.j();
            P0.o((P0) m9.f36496u, currentTimeMillis2);
            queue2.add((P0) m9.h());
            if (this.f36555e) {
                ((ArrayDeque) this.f36561l.get()).addAll((Collection) atomicReference.get());
            }
            this.f36554d.execute(new RunnableC4347h(1, this));
        }
    }
}
