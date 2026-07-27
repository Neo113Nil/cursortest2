package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2623Jh {

    /* renamed from: a, reason: collision with root package name */
    public final Ux f25727a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2572Gh f25728b;

    public C2623Jh(ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh, Ux ux) {
        this.f25727a = ux;
        this.f25728b = viewTreeObserverOnGlobalLayoutListenerC2572Gh;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            u2.z.k("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f25728b;
        C3441k7 c3441k7 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25087u;
        if (c3441k7 == null) {
            u2.z.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3335i7 interfaceC3335i7 = c3441k7.f31381b;
        if (interfaceC3335i7 == null) {
            u2.z.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext() != null) {
            return interfaceC3335i7.c(viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC2572Gh, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25079n.f27316a);
        }
        u2.z.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f25728b;
        C3441k7 c3441k7 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25087u;
        if (c3441k7 == null) {
            u2.z.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3335i7 interfaceC3335i7 = c3441k7.f31381b;
        if (interfaceC3335i7 == null) {
            u2.z.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext() != null) {
            return interfaceC3335i7.i(viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext(), viewTreeObserverOnGlobalLayoutListenerC2572Gh, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25079n.f27316a);
        }
        u2.z.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f25728b;
        AbstractC3569ma.a(viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.of)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            C2657Lh c2657Lh = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25061G;
            C3364ik c3364ik = c2657Lh != null ? c2657Lh.f26146T : null;
            if (c3364ik != null) {
                long j6 = c3364ik.f31114a.get();
                if (j6 > 0) {
                    jSONObject.put("plcmtid", j6);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e9) {
            u2.z.l("Error constructing JSON.", e9);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (!TextUtils.isEmpty(str)) {
            u2.D.f41234l.post(new RunnableC3973u0(18, this, str));
        } else {
            int i = u2.z.f41319b;
            v2.i.f("URL is empty, ignoring message");
        }
    }
}
