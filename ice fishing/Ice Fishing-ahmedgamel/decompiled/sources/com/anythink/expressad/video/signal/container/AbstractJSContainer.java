package com.anythink.expressad.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.factory.a;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.c.c;
import com.anythink.expressad.videocommon.e.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: k, reason: collision with root package name */
    protected static final String f22930k = "AbstractJSContainer";

    /* renamed from: a, reason: collision with root package name */
    private int f22931a;

    /* renamed from: b, reason: collision with root package name */
    private int f22932b;

    /* renamed from: l, reason: collision with root package name */
    protected Activity f22933l;

    /* renamed from: m, reason: collision with root package name */
    protected String f22934m;

    /* renamed from: n, reason: collision with root package name */
    protected String f22935n;

    /* renamed from: o, reason: collision with root package name */
    protected d f22936o;

    /* renamed from: p, reason: collision with root package name */
    protected String f22937p;

    /* renamed from: q, reason: collision with root package name */
    protected c f22938q;

    /* renamed from: r, reason: collision with root package name */
    protected String f22939r;

    /* renamed from: s, reason: collision with root package name */
    protected int f22940s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f22941t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f22942u;

    /* renamed from: v, reason: collision with root package name */
    protected int f22943v;

    /* renamed from: w, reason: collision with root package name */
    protected int f22944w;

    /* renamed from: x, reason: collision with root package name */
    protected int f22945x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f22946y;

    /* renamed from: z, reason: collision with root package name */
    protected IJSFactory f22947z;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f22931a = 0;
        this.f22932b = 1;
        this.f22940s = 2;
        this.f22941t = false;
        this.f22942u = false;
        this.f22946y = false;
        this.f22947z = new a();
    }

    private static void b(Object obj, String str) {
        h.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public final void a(Object obj) {
        h.a().a(obj, a(this.f22931a));
    }

    public final int c(com.anythink.expressad.foundation.d.d dVar) {
        j b9 = b(dVar);
        if (b9 != null) {
            return b9.d();
        }
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        return this.f22947z.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f22947z.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.f22947z.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.c getJSCommon() {
        return this.f22947z.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.f22947z.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f22947z.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        return this.f22947z.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f22935n;
    }

    public String getUnitId() {
        return this.f22934m;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().g()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().g()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().g()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().g()) {
            getActivityProxy();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        if (getJSCommon().g()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().g()) {
            getActivityProxy();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().g()) {
            getActivityProxy();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f22947z = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f22933l = activity;
    }

    public void setBidCampaign(boolean z6) {
        this.f22942u = z6;
    }

    public void setBigOffer(boolean z6) {
        this.f22946y = z6;
    }

    public void setIV(boolean z6) {
        this.f22941t = z6;
    }

    public void setIVRewardEnable(int i, int i4, int i6) {
        this.f22943v = i;
        this.f22944w = i4;
        this.f22945x = i6;
    }

    public void setMute(int i) {
        this.f22940s = i;
    }

    public void setPlacementId(String str) {
        this.f22935n = str;
    }

    public void setReward(c cVar) {
        this.f22938q = cVar;
    }

    public void setRewardId(String str) {
        this.f22939r = str;
    }

    public void setRewardUnitSetting(d dVar) {
        this.f22936o = dVar;
    }

    public void setUnitId(String str) {
        this.f22934m = str;
    }

    public void setUserId(String str) {
        this.f22937p = str;
    }

    public static void a(Object obj, String str) {
        h.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private void b(Object obj) {
        h.a().b(obj, a(this.f22932b));
    }

    private static void a(WindVaneWebView windVaneWebView, String str, String str2) {
        h.a();
        com.anythink.core.express.d.a.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
    }

    public final j b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return null;
        }
        a.C0142a a9 = com.anythink.expressad.videocommon.a.a(this.f22941t ? com.anythink.expressad.foundation.g.a.aY : 94, dVar);
        if (a9 != null && a9.c()) {
            WindVaneWebView a10 = a9.a();
            if (a10.getObject() instanceof j) {
                return (j) a10.getObject();
            }
        }
        return null;
    }

    public final String c() {
        d dVar;
        if (TextUtils.isEmpty(this.f22935n) && (dVar = this.f22936o) != null && !TextUtils.isEmpty(dVar.O())) {
            return this.f22936o.O();
        }
        return this.f22935n;
    }

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22931a = 0;
        this.f22932b = 1;
        this.f22940s = 2;
        this.f22941t = false;
        this.f22942u = false;
        this.f22946y = false;
        this.f22947z = new com.anythink.expressad.video.signal.factory.a();
    }

    private boolean b(int i) {
        try {
            if (i == 1) {
                this.f22933l.setRequestedOrientation(12);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f22933l.setRequestedOrientation(11);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void a(String str) {
        Activity activity = this.f22933l;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void a(d dVar, com.anythink.expressad.foundation.d.d dVar2) {
        d.c N8;
        if (c(dVar2) == 1) {
            return;
        }
        if (((dVar2 == null || (N8 = dVar2.N()) == null) ? false : b(N8.c())) || dVar == null) {
            return;
        }
        b(this.f22936o.b());
    }
}
