package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.InterfaceC4689d;
import q2.C4927z0;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3650no implements InterfaceC4689d, InterfaceC2944al, InterfaceC4877a, InterfaceC3915sk, InterfaceC2506Ck, InterfaceC2523Dk, InterfaceC2608Ik, InterfaceC4131wk, Pu {

    /* renamed from: n, reason: collision with root package name */
    public final List f33024n;

    /* renamed from: u, reason: collision with root package name */
    public final C3596mo f33025u;

    /* renamed from: v, reason: collision with root package name */
    public long f33026v;

    public C3650no(C3596mo c3596mo, C3214fi c3214fi) {
        this.f33025u = c3596mo;
        this.f33024n = Collections.singletonList(c3214fi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
        z(InterfaceC3915sk.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
        z(InterfaceC3915sk.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
        p2.j.f39798C.f39810k.getClass();
        this.f33026v = SystemClock.elapsedRealtime();
        z(InterfaceC2944al.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void a(Lu lu, String str) {
        z(Nu.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void b(Context context) {
        z(InterfaceC2523Dk.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
        z(InterfaceC3915sk.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void d(String str) {
        z(Nu.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        p2.j.f39798C.f39810k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f33026v;
        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        t2.C.k(sb.toString());
        z(InterfaceC2608Ik.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
        z(InterfaceC3915sk.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
        z(InterfaceC3915sk.class, "onRewarded", binderC2772Se, str, str2);
    }

    @Override // l2.InterfaceC4689d
    public final void l(String str, String str2) {
        z(InterfaceC4689d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void o(Context context) {
        z(InterfaceC2523Dk.class, "onPause", context);
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        z(InterfaceC4877a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void q(Context context) {
        z(InterfaceC2523Dk.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void t(Lu lu, String str) {
        z(Nu.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void u(Lu lu, String str, Throwable th) {
        z(Nu.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        z(InterfaceC4131wk.class, "onAdFailedToLoad", Integer.valueOf(c4927z0.f40122n), c4927z0.f40123u, c4927z0.f40124v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
        z(InterfaceC3915sk.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        z(InterfaceC2506Ck.class, "onAdImpression", new Object[0]);
    }

    public final void z(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f33024n;
        String concat = "Event-".concat(simpleName);
        C3596mo c3596mo = this.f33025u;
        c3596mo.getClass();
        if (((Boolean) AbstractC2666Ma.f26351a.r()).booleanValue()) {
            c3596mo.f32757a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(com.anythink.expressad.foundation.d.d.f18754u).value(currentTimeMillis);
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
            } catch (IOException e6) {
                int i4 = t2.C.f40822b;
                u2.i.d("unable to log", e6);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i9 = t2.C.f40822b;
            u2.i.e("AD-DBG ".concat(valueOf));
        }
    }
}
