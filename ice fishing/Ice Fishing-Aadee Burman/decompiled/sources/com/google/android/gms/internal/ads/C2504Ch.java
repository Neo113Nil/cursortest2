package com.google.android.gms.internal.ads;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4328i;
import com.google.android.gms.internal.consent_sdk.C4332j;
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4341l0;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4386w2;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.RunnableC4356p;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2504Ch implements AD, com.google.android.gms.internal.consent_sdk.D, com.google.android.gms.internal.consent_sdk.a3 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f24200A;

    /* renamed from: n, reason: collision with root package name */
    public final Object f24201n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24202u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24203v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f24204w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f24205x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24206y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f24207z;

    public /* synthetic */ C2504Ch(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f24201n = obj;
        this.f24202u = obj2;
        this.f24203v = obj3;
        this.f24204w = obj4;
        this.f24205x = obj5;
        this.f24206y = obj6;
        this.f24207z = obj7;
        this.f24200A = obj8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.D
    public boolean a(String str, JSONObject jSONObject) {
        char c9;
        char c10 = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        C4336k c4336k = (C4336k) this.f24207z;
        if (c9 == 0) {
            C4332j c4332j = (C4332j) c4336k.f35703j.getAndSet(null);
            if (c4332j != null) {
                if (!c4336k.f35706m && !c4336k.f35707n) {
                    C4387x c4387x = c4336k.f35700f;
                    c4387x.a((Queue) c4387x.f35788g.get(), 4, 5, null);
                }
                c4332j.a(c4336k);
                return true;
            }
        } else if (c9 == 1) {
            String optString = jSONObject.optString("status");
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1725474845:
                    if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            if (c10 != 0 && c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4) {
                if (c10 != 5) {
                    C4341l0 c4341l0 = new C4341l0(1, "We are getting something wrong with the webview.");
                    Dialog dialog = c4336k.f35701g;
                    if (dialog != null) {
                        dialog.dismiss();
                        c4336k.f35701g = null;
                    }
                    c4336k.f35696b.f35742a = null;
                    C4328i c4328i = (C4328i) c4336k.f35705l.getAndSet(null);
                    if (c4328i != null) {
                        c4328i.f35685u.f35695a.unregisterActivityLifecycleCallbacks(c4328i);
                    }
                    M3.b bVar = (M3.b) c4336k.f35704k.getAndSet(null);
                    if (bVar != null) {
                        c4336k.d(c4341l0);
                        bVar.onConsentFormDismissed(c4341l0.a());
                        return true;
                    }
                } else {
                    i = 1;
                }
            }
            Dialog dialog2 = c4336k.f35701g;
            if (dialog2 != null) {
                dialog2.dismiss();
                c4336k.f35701g = null;
            }
            c4336k.f35696b.f35742a = null;
            C4328i c4328i2 = (C4328i) c4336k.f35705l.getAndSet(null);
            if (c4328i2 != null) {
                c4328i2.f35685u.f35695a.unregisterActivityLifecycleCallbacks(c4328i2);
            }
            M3.b bVar2 = (M3.b) c4336k.f35704k.getAndSet(null);
            if (bVar2 != null) {
                c4336k.f35697c.f35677b.edit().putInt("consent_status", i).commit();
                bVar2.onConsentFormDismissed(null);
                return true;
            }
        } else {
            if (c9 != 2) {
                if (c9 != 3) {
                    return false;
                }
                ((com.google.android.gms.internal.consent_sdk.B) this.f24204w).execute(new RunnableC4356p(this, 1));
                return true;
            }
            String optString2 = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString2)) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
            }
            Uri parse = Uri.parse(optString2);
            if (parse.getScheme() == null) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString2)));
            }
            try {
                ((com.google.android.gms.internal.consent_sdk.r) this.f24202u).startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } catch (ActivityNotFoundException e9) {
                Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString2)), e9);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4300b f() {
        Application application = (Application) ((C4386w2) this.f24201n).f35781u;
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f35492a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f35493b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        C4320g c4320g = (C4320g) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24203v).f();
        C4348n c4348n = (C4348n) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24204w).f();
        C4344m a9 = ((com.google.android.gms.internal.consent_sdk.E1) this.f24205x).a();
        S0.n l9 = ((S0.i) this.f24206y).l();
        com.google.android.gms.internal.consent_sdk.O o6 = (com.google.android.gms.internal.consent_sdk.O) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24207z).f();
        C4387x c4387x = (C4387x) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24200A).f();
        C4300b c4300b = new C4300b();
        c4300b.f35648a = application;
        c4300b.f35649b = handler;
        c4300b.f35650c = b9;
        c4300b.f35651d = c4320g;
        c4300b.f35652e = c4348n;
        c4300b.f35653f = a9;
        c4300b.f35654g = l9;
        c4300b.f35655h = o6;
        c4300b.i = c4387x;
        return c4300b;
    }

    @Override // com.google.android.gms.internal.ads.AD
    public N3.a c() {
        C2866Yb c2866Yb = C4835j.f39730C.f39736d;
        X2.b bVar = new X2.b(0, 0, 0);
        C3068d9 c3068d9 = new C3068d9();
        Context context = (Context) this.f24201n;
        C5110a c5110a = (C5110a) this.f24203v;
        k8.b bVar2 = (k8.b) this.f24204w;
        C3213fu c3213fu = (C3213fu) this.f24206y;
        InterfaceC4061vh g4 = C2866Yb.g(bVar, context, (C3441k7) this.f24202u, c3068d9, null, (C3153eo) this.f24207z, (BinderC2880Yp) this.f24205x, null, null, null, c3213fu, "", bVar2, c5110a, false, false);
        Z8 z82 = new Z8(g4);
        g4.g0().f26159z = new C2470Ah(z82, 0);
        g4.loadUrl((String) this.f24200A);
        return z82;
    }

    public void d(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(NativeAdvancedJsUtils.f17906p);
        String queryParameter2 = parse.getQueryParameter("args");
        com.google.android.gms.internal.consent_sdk.D[] dArr = {this, (S0.n) this.f24206y};
        com.google.android.gms.internal.consent_sdk.O o6 = (com.google.android.gms.internal.consent_sdk.O) this.f24205x;
        o6.getClass();
        o6.f35583a.execute(new C2.y(11, queryParameter, queryParameter2, dArr));
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: c, reason: collision with other method in class */
    public Executor mo6c() {
        final Handler handler = (Handler) this.f24203v;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
