package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13115a = "start_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f13116b = "end_time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13117c = "psid";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13118d = "launch_mode";

    /* renamed from: e, reason: collision with root package name */
    public static final int f13119e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13120f = 1;

    /* renamed from: g, reason: collision with root package name */
    long f13121g;
    JSONObject i;

    /* renamed from: k, reason: collision with root package name */
    private final String f13124k = "g";

    /* renamed from: j, reason: collision with root package name */
    Runnable f13123j = new Runnable() { // from class: com.anythink.core.common.d.g.1
        @Override // java.lang.Runnable
        public final void run() {
            g.a(g.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    int f13122h = 0;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f13125l = com.anythink.core.common.v.b.b.a().a(14);

    public g(long j6) {
        this.f13121g = j6;
    }

    private void a() {
        if (this.i != null) {
            af.b(t.b().g(), u.b.f13633a, t.b().p() + "playRecord", "");
            this.f13121g = 0L;
            JSONObject jSONObject = this.i;
            long optLong = jSONObject.optLong(f13115a);
            long optLong2 = jSONObject.optLong(f13116b);
            String optString = jSONObject.optString(f13117c);
            int optInt = jSONObject.optInt(f13118d);
            this.i = null;
            com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
        }
    }

    private void b(long j6) {
        String p9 = t.b().p();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f13117c, t.b().r());
            jSONObject.put(f13115a, this.f13121g);
            jSONObject.put(f13116b, System.currentTimeMillis());
            jSONObject.put(f13118d, this.f13122h);
            this.i = jSONObject;
            af.b(t.b().g(), u.b.f13633a, p9 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        if (com.anythink.core.d.d.a(t.b().g()).b(p9).P() == 1) {
            this.f13125l.postDelayed(this.f13123j, r5.N());
        }
        System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f13125l;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.anythink.core.common.d.g.3
                @Override // java.lang.Runnable
                public final void run() {
                    g.b(g.this, currentTimeMillis);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f13125l;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.anythink.core.common.d.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    g.a(g.this, currentTimeMillis);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(long j6) {
        long j9;
        Handler handler = this.f13125l;
        if (handler != null) {
            handler.removeCallbacks(this.f13123j);
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(f13115a);
            long optLong2 = jSONObject.optLong(f13116b);
            String optString = jSONObject.optString(f13117c);
            int optInt = jSONObject.optInt(f13118d);
            if (System.currentTimeMillis() - optLong2 > k9.N()) {
                af.b(t.b().g(), u.b.f13633a, t.b().p() + "playRecord", "");
                com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                j9 = 0;
                this.f13121g = 0L;
                this.i = null;
                if (this.f13121g != j9) {
                    this.f13122h = 1;
                    try {
                        this.f13121g = t.b().a(t.b().g(), t.b().p(), 1);
                    } catch (Exception unused) {
                    }
                } else {
                    String p9 = t.b().p();
                    af.b(t.b().g(), u.b.f13633a, p9 + "playRecord", "");
                }
                if (this.f13121g == 0) {
                    this.f13121g = System.currentTimeMillis();
                }
                System.currentTimeMillis();
            }
        }
        j9 = 0;
        this.i = null;
        if (this.f13121g != j9) {
        }
        if (this.f13121g == 0) {
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void b(g gVar, long j6) {
        String p9 = t.b().p();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f13117c, t.b().r());
            jSONObject.put(f13115a, gVar.f13121g);
            jSONObject.put(f13116b, System.currentTimeMillis());
            jSONObject.put(f13118d, gVar.f13122h);
            gVar.i = jSONObject;
            af.b(t.b().g(), u.b.f13633a, p9 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        if (com.anythink.core.d.d.a(t.b().g()).b(p9).P() == 1) {
            gVar.f13125l.postDelayed(gVar.f13123j, r5.N());
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void a(g gVar) {
        if (gVar.i != null) {
            af.b(t.b().g(), u.b.f13633a, t.b().p() + "playRecord", "");
            gVar.f13121g = 0L;
            JSONObject jSONObject = gVar.i;
            long optLong = jSONObject.optLong(f13115a);
            long optLong2 = jSONObject.optLong(f13116b);
            String optString = jSONObject.optString(f13117c);
            int optInt = jSONObject.optInt(f13118d);
            gVar.i = null;
            com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(g gVar, long j6) {
        long j9;
        Handler handler = gVar.f13125l;
        if (handler != null) {
            handler.removeCallbacks(gVar.f13123j);
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        JSONObject jSONObject = gVar.i;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(f13115a);
            long optLong2 = jSONObject.optLong(f13116b);
            String optString = jSONObject.optString(f13117c);
            int optInt = jSONObject.optInt(f13118d);
            if (System.currentTimeMillis() - optLong2 > k9.N()) {
                af.b(t.b().g(), u.b.f13633a, t.b().p() + "playRecord", "");
                com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                j9 = 0;
                gVar.f13121g = 0L;
                gVar.i = null;
                if (gVar.f13121g != j9) {
                    gVar.f13122h = 1;
                    try {
                        gVar.f13121g = t.b().a(t.b().g(), t.b().p(), 1);
                    } catch (Exception unused) {
                    }
                } else {
                    String p9 = t.b().p();
                    af.b(t.b().g(), u.b.f13633a, p9 + "playRecord", "");
                }
                if (gVar.f13121g == 0) {
                    gVar.f13121g = System.currentTimeMillis();
                }
                System.currentTimeMillis();
            }
        }
        j9 = 0;
        gVar.i = null;
        if (gVar.f13121g != j9) {
        }
        if (gVar.f13121g == 0) {
        }
        System.currentTimeMillis();
    }
}
