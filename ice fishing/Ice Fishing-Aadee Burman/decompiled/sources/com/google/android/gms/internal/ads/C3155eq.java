package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3155eq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29980a;

    /* renamed from: b, reason: collision with root package name */
    public final C5110a f29981b;

    /* renamed from: c, reason: collision with root package name */
    public final St f29982c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4061vh f29983d;

    /* renamed from: e, reason: collision with root package name */
    public final C3153eo f29984e;

    /* renamed from: f, reason: collision with root package name */
    public Yv f29985f;

    public C3155eq(Context context, C5110a c5110a, St st, InterfaceC4061vh interfaceC4061vh, C3153eo c3153eo) {
        this.f29980a = context;
        this.f29981b = c5110a;
        this.f29982c = st;
        this.f29983d = interfaceC4061vh;
        this.f29984e = c3153eo;
    }

    public final synchronized boolean a() {
        InterfaceC4061vh interfaceC4061vh;
        St st = this.f29982c;
        if (st.f27600T) {
            C3301ha c3301ha = AbstractC3569ma.f32266h6;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32293k6)).booleanValue() && (interfaceC4061vh = this.f29983d) != null) {
                    if (this.f29985f != null) {
                        int i = u2.z.f41319b;
                        v2.i.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f29980a;
                    C4835j c4835j = C4835j.f39730C;
                    c4835j.f39755x.getClass();
                    if (!C3472kl.e(context)) {
                        int i6 = u2.z.f41319b;
                        v2.i.f("Unable to initialize omid.");
                        return false;
                    }
                    C3105du c3105du = st.f27602V;
                    c3105du.getClass();
                    if (((JSONObject) c3105du.f29859u).optBoolean((String) rVar.f40207c.a(AbstractC3569ma.f32311m6), true)) {
                        C5110a c5110a = this.f29981b;
                        C3472kl c3472kl = c4835j.f39755x;
                        WebView q8 = interfaceC4061vh.q();
                        c3472kl.getClass();
                        Yv yv = (Yv) C3472kl.o(new S0.s(17, c5110a, q8));
                        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32303l6)).booleanValue()) {
                            C3153eo c3153eo = this.f29984e;
                            String str = yv != null ? "1" : "0";
                            S0.e a9 = c3153eo.a();
                            a9.v("omid_js_session_success", str);
                            a9.y();
                        }
                        if (yv == null) {
                            int i9 = u2.z.f41319b;
                            v2.i.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = u2.z.f41319b;
                        v2.i.e("Created omid javascript session service.");
                        this.f29985f = yv;
                        interfaceC4061vh.L0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        InterfaceC4061vh interfaceC4061vh;
        try {
            Yv yv = this.f29985f;
            if (yv == null || (interfaceC4061vh = this.f29983d) == null) {
                return;
            }
            Iterator it = interfaceC4061vh.P().iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C4835j.f39730C.f39755x.getClass();
                C3472kl.p(new RunnableC3048cq(1, yv, view));
            }
            interfaceC4061vh.d("onSdkLoaded", C3770qC.f33209z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        InterfaceC4061vh interfaceC4061vh;
        if (this.f29985f == null || (interfaceC4061vh = this.f29983d) == null) {
            return;
        }
        interfaceC4061vh.d("onSdkImpression", C3770qC.f33209z);
    }
}
