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
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4351i;
import com.google.android.gms.internal.consent_sdk.C4355j;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4364l0;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4409w2;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.RunnableC4379p;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import o1.C4797a;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2524Ch implements AD, com.google.android.gms.internal.consent_sdk.D, com.google.android.gms.internal.consent_sdk.a3 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f24935A;

    /* renamed from: n, reason: collision with root package name */
    public final Object f24936n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24937u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24938v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f24939w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f24940x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24941y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f24942z;

    public /* synthetic */ C2524Ch(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f24936n = obj;
        this.f24937u = obj2;
        this.f24938v = obj3;
        this.f24939w = obj4;
        this.f24940x = obj5;
        this.f24941y = obj6;
        this.f24942z = obj7;
        this.f24935A = obj8;
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
        C4359k c4359k = (C4359k) this.f24942z;
        if (c9 == 0) {
            C4355j c4355j = (C4355j) c4359k.f36472j.getAndSet(null);
            if (c4355j != null) {
                if (!c4359k.f36475m && !c4359k.f36476n) {
                    C4410x c4410x = c4359k.f36469f;
                    c4410x.a((Queue) c4410x.f36557g.get(), 4, 5, null);
                }
                c4355j.a(c4359k);
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
                    C4364l0 c4364l0 = new C4364l0(1, "We are getting something wrong with the webview.");
                    Dialog dialog = c4359k.f36470g;
                    if (dialog != null) {
                        dialog.dismiss();
                        c4359k.f36470g = null;
                    }
                    c4359k.f36465b.f36511a = null;
                    C4351i c4351i = (C4351i) c4359k.f36474l.getAndSet(null);
                    if (c4351i != null) {
                        c4351i.f36454u.f36464a.unregisterActivityLifecycleCallbacks(c4351i);
                    }
                    O3.b bVar = (O3.b) c4359k.f36473k.getAndSet(null);
                    if (bVar != null) {
                        c4359k.d(c4364l0);
                        bVar.onConsentFormDismissed(c4364l0.a());
                        return true;
                    }
                } else {
                    i = 1;
                }
            }
            Dialog dialog2 = c4359k.f36470g;
            if (dialog2 != null) {
                dialog2.dismiss();
                c4359k.f36470g = null;
            }
            c4359k.f36465b.f36511a = null;
            C4351i c4351i2 = (C4351i) c4359k.f36474l.getAndSet(null);
            if (c4351i2 != null) {
                c4351i2.f36454u.f36464a.unregisterActivityLifecycleCallbacks(c4351i2);
            }
            O3.b bVar2 = (O3.b) c4359k.f36473k.getAndSet(null);
            if (bVar2 != null) {
                c4359k.f36466c.f36446b.edit().putInt("consent_status", i).commit();
                bVar2.onConsentFormDismissed(null);
                return true;
            }
        } else {
            if (c9 != 2) {
                if (c9 != 3) {
                    return false;
                }
                ((com.google.android.gms.internal.consent_sdk.B) this.f24939w).execute(new RunnableC4379p(this, 1));
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
                ((com.google.android.gms.internal.consent_sdk.r) this.f24937u).startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } catch (ActivityNotFoundException e9) {
                Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString2)), e9);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4323b f() {
        Application application = (Application) ((C4409w2) this.f24936n).f36550u;
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f36261a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f36262b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        C4343g c4343g = (C4343g) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24938v).f();
        C4371n c4371n = (C4371n) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24939w).f();
        C4367m a9 = ((com.google.android.gms.internal.consent_sdk.E1) this.f24940x).a();
        S0.n g9 = ((S0.i) this.f24941y).g();
        com.google.android.gms.internal.consent_sdk.O o4 = (com.google.android.gms.internal.consent_sdk.O) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24942z).f();
        C4410x c4410x = (C4410x) ((com.google.android.gms.internal.consent_sdk.Z2) this.f24935A).f();
        C4323b c4323b = new C4323b();
        c4323b.f36417a = application;
        c4323b.f36418b = handler;
        c4323b.f36419c = b9;
        c4323b.f36420d = c4343g;
        c4323b.f36421e = c4371n;
        c4323b.f36422f = a9;
        c4323b.f36423g = g9;
        c4323b.f36424h = o4;
        c4323b.i = c4410x;
        return c4323b;
    }

    @Override // com.google.android.gms.internal.ads.AD
    public P3.a c() {
        C2889Yb c2889Yb = C4906k.f40186C.f40192d;
        A3.r rVar = new A3.r(0, 0, 0);
        C3091d9 c3091d9 = new C3091d9();
        Context context = (Context) this.f24936n;
        C5189a c5189a = (C5189a) this.f24938v;
        C4797a c4797a = (C4797a) this.f24939w;
        C3236fu c3236fu = (C3236fu) this.f24941y;
        InterfaceC4084vh g9 = C2889Yb.g(rVar, context, (C3464k7) this.f24937u, c3091d9, null, (C3230fo) this.f24942z, (BinderC2903Yp) this.f24940x, null, null, null, c3236fu, "", c4797a, c5189a, false, false);
        Z8 z82 = new Z8(g9);
        g9.h0().f26956z = new C2490Ah(z82, 0);
        g9.loadUrl((String) this.f24935A);
        return z82;
    }

    public void d(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(NativeAdvancedJsUtils.f18693p);
        String queryParameter2 = parse.getQueryParameter("args");
        com.google.android.gms.internal.consent_sdk.D[] dArr = {this, (S0.n) this.f24941y};
        com.google.android.gms.internal.consent_sdk.O o4 = (com.google.android.gms.internal.consent_sdk.O) this.f24940x;
        o4.getClass();
        o4.f36352a.execute(new E2.x(11, queryParameter, queryParameter2, dArr));
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: c, reason: collision with other method in class */
    public Executor mo4c() {
        final Handler handler = (Handler) this.f24938v;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
