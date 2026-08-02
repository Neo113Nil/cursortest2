package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n2.InterfaceC4769d;
import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3660no implements InterfaceC4769d, InterfaceC3013bl, InterfaceC4919a, InterfaceC4033uk, InterfaceC2544Dk, InterfaceC2561Ek, InterfaceC2663Kk, InterfaceC4195xk, Mu {

    /* renamed from: n, reason: collision with root package name */
    public final List f33554n;

    /* renamed from: u, reason: collision with root package name */
    public final C3552lo f33555u;

    /* renamed from: v, reason: collision with root package name */
    public long f33556v;

    public C3660no(C3552lo c3552lo, C3332hi c3332hi) {
        this.f33555u = c3552lo;
        this.f33554n = Collections.singletonList(c3332hi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
        x(InterfaceC4033uk.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        x(InterfaceC4195xk.class, "onAdFailedToLoad", Integer.valueOf(c4969z0.f40512n), c4969z0.f40513u, c4969z0.f40514v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void a(Context context) {
        x(InterfaceC2561Ek.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
        x(Ku.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        x(Ku.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
        x(InterfaceC4033uk.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
        x(InterfaceC4033uk.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // n2.InterfaceC4769d
    public final void f(String str, String str2) {
        x(InterfaceC4769d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        C4906k.f40186C.f40198k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f33556v;
        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        w2.z.k(sb.toString());
        x(InterfaceC2663Kk.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
        C4906k.f40186C.f40198k.getClass();
        this.f33556v = SystemClock.elapsedRealtime();
        x(InterfaceC3013bl.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void n(Context context) {
        x(InterfaceC2561Ek.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void o(Ju ju, String str) {
        x(Ku.class, "onTaskStarted", str);
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        x(InterfaceC4919a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void s(Context context) {
        x(InterfaceC2561Ek.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
        x(InterfaceC4033uk.class, "onRewarded", binderC2844Ve, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        x(InterfaceC2544Dk.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void w(Ju ju, String str) {
        x(Ku.class, "onTaskSucceeded", str);
    }

    public final void x(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f33554n;
        String concat = "Event-".concat(simpleName);
        C3552lo c3552lo = this.f33555u;
        c3552lo.getClass();
        if (((Boolean) AbstractC2772Ra.f27970a.r()).booleanValue()) {
            c3552lo.f32630a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(com.anythink.expressad.foundation.d.d.f19383u).value(currentTimeMillis);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e9) {
                int i4 = w2.z.f41712b;
                x2.i.d("unable to log", e9);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i6 = w2.z.f41712b;
            x2.i.e("AD-DBG ".concat(valueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
        x(InterfaceC4033uk.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
        x(InterfaceC4033uk.class, "onAdClosed", new Object[0]);
    }
}
