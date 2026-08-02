package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2643Jh {

    /* renamed from: a, reason: collision with root package name */
    public final Ux f26481a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2592Gh f26482b;

    public C2643Jh(ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh, Ux ux) {
        this.f26481a = ux;
        this.f26482b = viewTreeObserverOnGlobalLayoutListenerC2592Gh;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            w2.z.k("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f26482b;
        C3464k7 c3464k7 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25874u;
        if (c3464k7 == null) {
            w2.z.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3358i7 interfaceC3358i7 = c3464k7.f32160b;
        if (interfaceC3358i7 == null) {
            w2.z.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext() != null) {
            return interfaceC3358i7.c(viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC2592Gh, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25866n.f28000a);
        }
        w2.z.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f26482b;
        C3464k7 c3464k7 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25874u;
        if (c3464k7 == null) {
            w2.z.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3358i7 interfaceC3358i7 = c3464k7.f32160b;
        if (interfaceC3358i7 == null) {
            w2.z.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext() != null) {
            return interfaceC3358i7.i(viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext(), viewTreeObserverOnGlobalLayoutListenerC2592Gh, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25866n.f28000a);
        }
        w2.z.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f26482b;
        AbstractC3592ma.a(viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.of)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            C2677Lh c2677Lh = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25846G;
            C3387ik c3387ik = c2677Lh != null ? c2677Lh.f26943T : null;
            if (c3387ik != null) {
                long j6 = c3387ik.f31884a.get();
                if (j6 > 0) {
                    jSONObject.put("plcmtid", j6);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e9) {
            w2.z.l("Error constructing JSON.", e9);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (!TextUtils.isEmpty(str)) {
            w2.D.f41627l.post(new RunnableC3996u0(18, this, str));
        } else {
            int i = w2.z.f41712b;
            x2.i.f("URL is empty, ignoring message");
        }
    }
}
