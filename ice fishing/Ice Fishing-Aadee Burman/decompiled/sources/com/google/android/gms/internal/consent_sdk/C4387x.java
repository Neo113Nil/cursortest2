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
public final class C4387x {

    /* renamed from: b, reason: collision with root package name */
    public final Application f35783b;

    /* renamed from: c, reason: collision with root package name */
    public final C4383w f35784c;

    /* renamed from: d, reason: collision with root package name */
    public final B f35785d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35786e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f35787f = new AtomicReference(new ArrayDeque());

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f35788g = new AtomicReference(new ArrayDeque());

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f35789h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f35790j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f35791k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f35792l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f35782a = new AtomicReference(null);

    public C4387x(Application application, B b9, C4383w c4383w, boolean z3) {
        this.f35786e = z3;
        this.f35783b = application;
        this.f35784c = c4383w;
        this.f35785d = b9;
    }

    public final void a(Queue queue, int i, int i6, String str) {
        Bundle bundle;
        Long l9 = (Long) queue.poll();
        if (l9 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l9.longValue();
            if (str != null) {
                i = i6;
            }
            AtomicReference atomicReference = this.f35791k;
            Queue queue2 = (Queue) atomicReference.get();
            C4383w c4383w = this.f35784c;
            c4383w.getClass();
            O0 m4 = P0.m();
            C4376u0 m9 = B0.m();
            C4388x0 m10 = C4392y0.m();
            m10.j();
            C4392y0.p((C4392y0) m10.f35727u, i);
            if (str != null) {
                m10.j();
                C4392y0.n((C4392y0) m10.f35727u, str);
            }
            if (currentTimeMillis > 0) {
                m10.j();
                C4392y0.o((C4392y0) m10.f35727u, currentTimeMillis);
            }
            C4392y0 c4392y0 = (C4392y0) m10.h();
            m9.j();
            B0.r((B0) m9.f35727u, c4392y0);
            String str2 = c4383w.f35778e;
            PackageInfo packageInfo = null;
            Application application = c4383w.f35774a;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    c4383w.f35778e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(c4383w.f35778e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = c4383w.f35778e;
            }
            if (str2 != null) {
                m9.j();
                B0.o((B0) m9.f35727u, str2);
            }
            A0 a02 = c4383w.f35775b;
            if (a02 == null) {
                C4396z0 m11 = A0.m();
                m11.j();
                A0.n((A0) m11.f35727u);
                a02 = (A0) m11.h();
                c4383w.f35775b = a02;
            }
            m9.j();
            B0.s((B0) m9.f35727u, a02);
            C4384w0 c4384w0 = c4383w.f35777d;
            if (c4384w0 == null) {
                C4380v0 m12 = C4384w0.m();
                int i9 = Build.VERSION.SDK_INT;
                m12.j();
                C4384w0.n((C4384w0) m12.f35727u, i9);
                String str3 = Build.MODEL;
                m12.j();
                C4384w0.o((C4384w0) m12.f35727u);
                m12.j();
                C4384w0.q((C4384w0) m12.f35727u);
                String str4 = Build.VERSION.RELEASE;
                m12.j();
                C4384w0.p((C4384w0) m12.f35727u);
                c4384w0 = (C4384w0) m12.h();
                c4383w.f35777d = c4384w0;
            }
            m9.j();
            B0.q((B0) m9.f35727u, c4384w0);
            C4372t0 c4372t0 = c4383w.f35776c;
            if (c4372t0 == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    C4368s0 m13 = C4372t0.m();
                    String l10 = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    m13.j();
                    C4372t0.o((C4372t0) m13.f35727u, l10);
                    m13.j();
                    C4372t0.n((C4372t0) m13.f35727u, packageName);
                    c4383w.f35776c = (C4372t0) m13.h();
                }
                c4372t0 = c4383w.f35776c;
            }
            if (c4372t0 != null) {
                m9.j();
                B0.p((B0) m9.f35727u, c4372t0);
            }
            String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string != null && !string.isEmpty()) {
                F f3 = new F(string);
                while (f3.hasNext()) {
                    String str5 = (String) f3.next();
                    m9.j();
                    B0.n((B0) m9.f35727u, str5);
                }
            }
            B0 b02 = (B0) m9.h();
            m4.j();
            P0.n((P0) m4.f35727u, b02);
            long currentTimeMillis2 = System.currentTimeMillis();
            m4.j();
            P0.o((P0) m4.f35727u, currentTimeMillis2);
            queue2.add((P0) m4.h());
            if (this.f35786e) {
                ((ArrayDeque) this.f35792l.get()).addAll((Collection) atomicReference.get());
            }
            this.f35785d.execute(new RunnableC4324h(1, this));
        }
    }
}
