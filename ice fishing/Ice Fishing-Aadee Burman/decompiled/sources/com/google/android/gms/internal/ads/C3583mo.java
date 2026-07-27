package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.InterfaceC4660d;
import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3583mo implements InterfaceC4660d, InterfaceC2990bl, InterfaceC4870a, InterfaceC4010uk, InterfaceC2524Dk, InterfaceC2541Ek, InterfaceC2643Kk, InterfaceC4172xk, Mu {

    /* renamed from: n, reason: collision with root package name */
    public final List f32580n;

    /* renamed from: u, reason: collision with root package name */
    public final C3475ko f32581u;

    /* renamed from: v, reason: collision with root package name */
    public long f32582v;

    public C3583mo(C3475ko c3475ko, C3309hi c3309hi) {
        this.f32581u = c3475ko;
        this.f32580n = Collections.singletonList(c3309hi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        y(InterfaceC4010uk.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
        y(InterfaceC4010uk.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void a(Context context) {
        y(InterfaceC2541Ek.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
        y(Ku.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        y(Ku.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
        y(InterfaceC4010uk.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
        y(InterfaceC4010uk.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // l2.InterfaceC4660d
    public final void f(String str, String str2) {
        y(InterfaceC4660d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        C4835j.f39730C.f39742k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f32582v;
        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        u2.z.k(sb.toString());
        y(InterfaceC2643Kk.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
        C4835j.f39730C.f39742k.getClass();
        this.f32582v = SystemClock.elapsedRealtime();
        y(InterfaceC2990bl.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void n(Context context) {
        y(InterfaceC2541Ek.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void o(Ju ju, String str) {
        y(Ku.class, "onTaskStarted", str);
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        y(InterfaceC4870a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void s(Context context) {
        y(InterfaceC2541Ek.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
        y(InterfaceC4010uk.class, "onRewarded", binderC2821Ve, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        y(InterfaceC4172xk.class, "onAdFailedToLoad", Integer.valueOf(c4920z0.f40210n), c4920z0.f40211u, c4920z0.f40212v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        y(InterfaceC2524Dk.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void x(Ju ju, String str) {
        y(Ku.class, "onTaskSucceeded", str);
    }

    public final void y(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f32580n;
        String concat = "Event-".concat(simpleName);
        C3475ko c3475ko = this.f32581u;
        c3475ko.getClass();
        if (((Boolean) AbstractC2752Ra.f27286a.r()).booleanValue()) {
            c3475ko.f31632a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(com.anythink.expressad.foundation.d.d.f18596u).value(currentTimeMillis);
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
                int i6 = u2.z.f41319b;
                v2.i.d("unable to log", e9);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i9 = u2.z.f41319b;
            v2.i.e("AD-DBG ".concat(valueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
        y(InterfaceC4010uk.class, "onAdLeftApplication", new Object[0]);
    }
}
