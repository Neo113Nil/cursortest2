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
    public final C3 f28833a;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC3722ow f28836d;

    /* renamed from: g, reason: collision with root package name */
    public final String f28839g;

    /* renamed from: b, reason: collision with root package name */
    public final C3452jw f28834b = new C3452jw();

    /* renamed from: e, reason: collision with root package name */
    public boolean f28837e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28838f = false;

    /* renamed from: c, reason: collision with root package name */
    public Aw f28835c = new Aw(null);

    public Uv(Xw xw, C3 c32, String str) {
        this.f28833a = c32;
        this.f28839g = str;
        Tv tv = Tv.HTML;
        Tv tv2 = (Tv) c32.f24789z;
        if (tv2 == tv || tv2 == Tv.JAVASCRIPT) {
            C3776pw c3776pw = new C3776pw(str);
            WebView webView = (WebView) c32.f24784u;
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            c3776pw.f33766b = new Aw(webView);
            this.f28836d = c3776pw;
        } else {
            this.f28836d = new C3883rw(str, Collections.unmodifiableMap((HashMap) c32.f24786w));
        }
        this.f28836d.a();
        C3238fw.f31233c.f31234a.add(this);
        AbstractC3722ow abstractC3722ow = this.f28836d;
        V2 v22 = V2.f28874z;
        WebView c9 = abstractC3722ow.c();
        JSONObject jSONObject = new JSONObject();
        AbstractC3937sw.b(jSONObject, "impressionOwner", (EnumC2970aw) xw.f29384u);
        AbstractC3937sw.b(jSONObject, "mediaEventsOwner", (EnumC2970aw) xw.f29385v);
        AbstractC3937sw.b(jSONObject, "creativeType", (Vv) xw.f29386w);
        AbstractC3937sw.b(jSONObject, "impressionType", (Yv) xw.f29387x);
        AbstractC3937sw.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(xw.f29383n));
        v22.z(c9, "init", jSONObject, abstractC3722ow.f33765a);
    }

    public final void a() {
        if (this.f28837e || this.f28836d == null) {
            return;
        }
        this.f28837e = true;
        ArrayList arrayList = C3238fw.f31233c.f31235b;
        boolean z6 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z6) {
            C3560lw b9 = C3560lw.b();
            b9.getClass();
            C3184ew c3184ew = C3184ew.f30790w;
            c3184ew.f31746v = b9;
            c3184ew.f31744n = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z9 = runningAppProcessInfo.importance == 100 || c3184ew.a();
            c3184ew.f31745u = z9;
            c3184ew.b(z9);
            C4099vw.f35529g.getClass();
            C4099vw.b();
            C3077cw c3077cw = b9.f32647b;
            c3077cw.getClass();
            c3077cw.f30418f.submit(new RunnableC3493kj(c3077cw));
            c3077cw.f30414b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c3077cw);
        }
        float f2 = C3560lw.b().f32646a;
        AbstractC3722ow abstractC3722ow = this.f28836d;
        V2.f28874z.z(abstractC3722ow.c(), "setDeviceVolume", Float.valueOf(f2), abstractC3722ow.f33765a);
        AbstractC3722ow abstractC3722ow2 = this.f28836d;
        Date date = (Date) C3130dw.f30648e.f30651c;
        abstractC3722ow2.f(date != null ? (Date) date.clone() : null);
        this.f28836d.d(this, this.f28833a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f28838f || ((View) this.f28835c.get()) == view) {
            return;
        }
        this.f28835c = new Aw(view);
        AbstractC3722ow abstractC3722ow = this.f28836d;
        abstractC3722ow.getClass();
        abstractC3722ow.f33767c = System.nanoTime();
        abstractC3722ow.f33768d = 1;
        Collection<Uv> unmodifiableCollection = Collections.unmodifiableCollection(C3238fw.f31233c.f31234a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (Uv uv : unmodifiableCollection) {
            if (uv != this && ((View) uv.f28835c.get()) == view) {
                uv.f28835c.clear();
            }
        }
    }

    public final void c() {
        if (this.f28838f) {
            return;
        }
        this.f28835c.clear();
        if (!this.f28838f) {
            this.f28834b.f32130a.clear();
        }
        this.f28838f = true;
        AbstractC3722ow abstractC3722ow = this.f28836d;
        V2.f28874z.z(abstractC3722ow.c(), "finishSession", abstractC3722ow.f33765a);
        C3238fw c3238fw = C3238fw.f31233c;
        ArrayList arrayList = c3238fw.f31234a;
        ArrayList arrayList2 = c3238fw.f31235b;
        boolean z6 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z6 && arrayList2.size() <= 0) {
            C3560lw b9 = C3560lw.b();
            b9.getClass();
            C4099vw c4099vw = C4099vw.f35529g;
            c4099vw.getClass();
            Handler handler = C4099vw.i;
            if (handler != null) {
                handler.removeCallbacks(C4099vw.f35532k);
                C4099vw.i = null;
            }
            c4099vw.f35533a.clear();
            C4099vw.f35530h.post(new RunnableC3830qw(c4099vw));
            C3184ew c3184ew = C3184ew.f30790w;
            c3184ew.f31744n = false;
            c3184ew.f31746v = null;
            C3077cw c3077cw = b9.f32647b;
            c3077cw.f30414b.getContentResolver().unregisterContentObserver(c3077cw);
        }
        this.f28836d.b();
        this.f28836d = null;
    }
}
