package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Uv {

    /* renamed from: a, reason: collision with root package name */
    public final C3 f28036a;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC3645nw f28039d;

    /* renamed from: g, reason: collision with root package name */
    public final String f28042g;

    /* renamed from: b, reason: collision with root package name */
    public final C3375iw f28037b = new C3375iw();

    /* renamed from: e, reason: collision with root package name */
    public boolean f28040e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28041f = false;

    /* renamed from: c, reason: collision with root package name */
    public Aw f28038c = new Aw(null);

    public Uv(Xw xw, C3 c32, String str) {
        this.f28036a = c32;
        this.f28042g = str;
        Tv tv = Tv.HTML;
        Tv tv2 = (Tv) c32.f24026z;
        if (tv2 == tv || tv2 == Tv.JAVASCRIPT) {
            C3699ow c3699ow = new C3699ow(str);
            WebView webView = (WebView) c32.f24021u;
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            c3699ow.f32809b = new Aw(webView);
            this.f28039d = c3699ow;
        } else {
            this.f28039d = new C3860rw(str, Collections.unmodifiableMap((HashMap) c32.f24023w));
        }
        this.f28039d.a();
        C3161ew.f30001c.f30002a.add(this);
        AbstractC3645nw abstractC3645nw = this.f28039d;
        V2 v22 = V2.f28077z;
        WebView c9 = abstractC3645nw.c();
        JSONObject jSONObject = new JSONObject();
        AbstractC3914sw.b(jSONObject, "impressionOwner", (Zv) xw.f28607u);
        AbstractC3914sw.b(jSONObject, "mediaEventsOwner", (Zv) xw.f28608v);
        AbstractC3914sw.b(jSONObject, "creativeType", (Vv) xw.f28609w);
        AbstractC3914sw.b(jSONObject, "impressionType", (Xv) xw.f28610x);
        AbstractC3914sw.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(xw.f28606n));
        v22.z(c9, "init", jSONObject, abstractC3645nw.f32808a);
    }

    public final void a() {
        if (this.f28040e || this.f28039d == null) {
            return;
        }
        this.f28040e = true;
        ArrayList arrayList = C3161ew.f30001c.f30003b;
        boolean z3 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z3) {
            C3483kw b9 = C3483kw.b();
            b9.getClass();
            C3107dw c3107dw = C3107dw.f29860w;
            c3107dw.f30678v = b9;
            c3107dw.f30676n = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z6 = runningAppProcessInfo.importance == 100 || c3107dw.a();
            c3107dw.f30677u = z6;
            c3107dw.b(z6);
            C4076vw.f34760g.getClass();
            C4076vw.b();
            C3001bw c3001bw = b9.f31668b;
            c3001bw.getClass();
            c3001bw.f29371f.submit(new RunnableC3470kj(c3001bw));
            c3001bw.f29367b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c3001bw);
        }
        float f3 = C3483kw.b().f31667a;
        AbstractC3645nw abstractC3645nw = this.f28039d;
        V2.f28077z.z(abstractC3645nw.c(), "setDeviceVolume", Float.valueOf(f3), abstractC3645nw.f32808a);
        AbstractC3645nw abstractC3645nw2 = this.f28039d;
        Date date = (Date) C3054cw.f29643e.f29646c;
        abstractC3645nw2.f(date != null ? (Date) date.clone() : null);
        this.f28039d.d(this, this.f28036a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f28041f || ((View) this.f28038c.get()) == view) {
            return;
        }
        this.f28038c = new Aw(view);
        AbstractC3645nw abstractC3645nw = this.f28039d;
        abstractC3645nw.getClass();
        abstractC3645nw.f32810c = System.nanoTime();
        abstractC3645nw.f32811d = 1;
        Collection<Uv> unmodifiableCollection = Collections.unmodifiableCollection(C3161ew.f30001c.f30002a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (Uv uv : unmodifiableCollection) {
            if (uv != this && ((View) uv.f28038c.get()) == view) {
                uv.f28038c.clear();
            }
        }
    }

    public final void c() {
        if (this.f28041f) {
            return;
        }
        this.f28038c.clear();
        if (!this.f28041f) {
            this.f28037b.f31136a.clear();
        }
        this.f28041f = true;
        AbstractC3645nw abstractC3645nw = this.f28039d;
        V2.f28077z.z(abstractC3645nw.c(), "finishSession", abstractC3645nw.f32808a);
        C3161ew c3161ew = C3161ew.f30001c;
        ArrayList arrayList = c3161ew.f30002a;
        ArrayList arrayList2 = c3161ew.f30003b;
        boolean z3 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z3 && arrayList2.size() <= 0) {
            C3483kw b9 = C3483kw.b();
            b9.getClass();
            C4076vw c4076vw = C4076vw.f34760g;
            c4076vw.getClass();
            Handler handler = C4076vw.i;
            if (handler != null) {
                handler.removeCallbacks(C4076vw.f34763k);
                C4076vw.i = null;
            }
            c4076vw.f34764a.clear();
            C4076vw.f34761h.post(new RunnableC3807qw(c4076vw));
            C3107dw c3107dw = C3107dw.f29860w;
            c3107dw.f30676n = false;
            c3107dw.f30678v = null;
            C3001bw c3001bw = b9.f31668b;
            c3001bw.f29367b.getContentResolver().unregisterContentObserver(c3001bw);
        }
        this.f28039d.b();
        this.f28039d = null;
    }
}
