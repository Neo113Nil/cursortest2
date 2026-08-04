package com.gamericefishpro.space.n9;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int d;
    public final Object e;

    public q2(t2 t2Var) {
        this.d = 0;
        this.e = t2Var;
    }

    public void i(com.gamericefishpro.space.i9.v0 v0Var, Bundle bundle) {
        e3 e3Var;
        r1 r1Var;
        Uri uri;
        t2 t2Var = (t2) this.e;
        try {
            try {
                r1 r1Var2 = (r1) t2Var.d;
                v0 v0Var2 = r1Var2.y;
                r1.l(v0Var2);
                v0Var2.G.a("onActivityCreated");
                Intent intent = v0Var.i;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        r1.j(r1Var2.B);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        p1 p1Var = r1Var2.z;
                        r1.l(p1Var);
                        p1Var.A(new k2(this, z, uri, str, queryParameter));
                        r1Var = (r1) t2Var.d;
                    }
                    e3Var = r1Var.E;
                }
                r1Var = (r1) t2Var.d;
            } catch (RuntimeException e) {
                v0 v0Var3 = ((r1) t2Var.d).y;
                r1.l(v0Var3);
                v0Var3.y.b(e, "Throwable caught in onActivityCreated");
            }
            e3Var = r1Var.E;
        } finally {
            e3Var = ((r1) t2Var.d).E;
            r1.k(e3Var);
            e3Var.z(v0Var, bundle);
        }
    }

    public void j(com.gamericefishpro.space.i9.v0 v0Var) {
        e3 e3Var = ((r1) ((t2) this.e).d).E;
        r1.k(e3Var);
        synchronized (e3Var.E) {
            try {
                if (Objects.equals(e3Var.z, v0Var)) {
                    e3Var.z = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((r1) e3Var.d).v.F()) {
            e3Var.y.remove(Integer.valueOf(v0Var.d));
        }
    }

    public void k(com.gamericefishpro.space.i9.v0 v0Var) {
        r1 r1Var = (r1) ((t2) this.e).d;
        e3 e3Var = r1Var.E;
        r1.k(e3Var);
        synchronized (e3Var.E) {
            e3Var.D = false;
            e3Var.A = true;
        }
        r1 r1Var2 = (r1) e3Var.d;
        r1Var2.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (r1Var2.v.F()) {
            b3 b3VarW = e3Var.w(v0Var);
            e3Var.v = e3Var.i;
            e3Var.i = null;
            p1 p1Var = r1Var2.z;
            r1.l(p1Var);
            p1Var.A(new a(e3Var, b3VarW, jElapsedRealtime));
        } else {
            e3Var.i = null;
            p1 p1Var2 = r1Var2.z;
            r1.l(p1Var2);
            p1Var2.A(new w(e3Var, jElapsedRealtime));
        }
        w3 w3Var = r1Var.A;
        r1.k(w3Var);
        r1 r1Var3 = (r1) w3Var.d;
        r1Var3.D.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p1 p1Var3 = r1Var3.z;
        r1.l(p1Var3);
        p1Var3.A(new s3(w3Var, jElapsedRealtime2, 1));
    }

    public void l(com.gamericefishpro.space.i9.v0 v0Var) {
        r1 r1Var = (r1) ((t2) this.e).d;
        w3 w3Var = r1Var.A;
        r1.k(w3Var);
        r1 r1Var2 = (r1) w3Var.d;
        r1Var2.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p1 p1Var = r1Var2.z;
        r1.l(p1Var);
        p1Var.A(new s3(w3Var, jElapsedRealtime, 0));
        e3 e3Var = r1Var.E;
        r1.k(e3Var);
        Object obj = e3Var.E;
        synchronized (obj) {
            e3Var.D = true;
            if (!Objects.equals(v0Var, e3Var.z)) {
                synchronized (obj) {
                    e3Var.z = v0Var;
                    e3Var.A = false;
                    r1 r1Var3 = (r1) e3Var.d;
                    if (r1Var3.v.F()) {
                        e3Var.B = null;
                        p1 p1Var2 = r1Var3.z;
                        r1.l(p1Var2);
                        p1Var2.A(new d3(e3Var, 1));
                    }
                }
            }
        }
        r1 r1Var4 = (r1) e3Var.d;
        if (!r1Var4.v.F()) {
            e3Var.i = e3Var.B;
            p1 p1Var3 = r1Var4.z;
            r1.l(p1Var3);
            p1Var3.A(new d3(e3Var, 0));
            return;
        }
        e3Var.A(v0Var.e, e3Var.w(v0Var), false);
        x xVar = ((r1) e3Var.d).G;
        r1.i(xVar);
        r1 r1Var5 = (r1) xVar.d;
        r1Var5.D.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p1 p1Var4 = r1Var5.z;
        r1.l(p1Var4);
        p1Var4.A(new w(xVar, jElapsedRealtime2));
    }

    public void m(com.gamericefishpro.space.i9.v0 v0Var, Bundle bundle) {
        b3 b3Var;
        e3 e3Var = ((r1) ((t2) this.e).d).E;
        r1.k(e3Var);
        if (!((r1) e3Var.d).v.F() || bundle == null || (b3Var = (b3) e3Var.y.get(Integer.valueOf(v0Var.d))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", b3Var.c);
        bundle2.putString("name", b3Var.a);
        bundle2.putString("referrer_name", b3Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i(com.gamericefishpro.space.i9.v0.b(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                com.gamericefishpro.space.ya.a aVar = (com.gamericefishpro.space.ya.a) com.gamericefishpro.space.wa.g.c().b(com.gamericefishpro.space.ya.a.class);
                                Log.isLoggable("FirebaseMessaging", 3);
                                if (aVar != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    com.gamericefishpro.space.ya.b bVar = (com.gamericefishpro.space.ya.b) aVar;
                                    if (!com.gamericefishpro.space.za.a.b.contains("fcm")) {
                                        com.gamericefishpro.space.i9.j1 j1Var = (com.gamericefishpro.space.i9.j1) bVar.a.e;
                                        j1Var.a(new com.gamericefishpro.space.i9.w0(j1Var, string2, 0));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    bVar.a("_cmp", bundle3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else {
                                Log.isLoggable("FirebaseMessaging", 3);
                            }
                        }
                        com.gamericefishpro.space.d9.h.E("_no", bundle2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j(com.gamericefishpro.space.i9.v0.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k(com.gamericefishpro.space.i9.v0.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l(com.gamericefishpro.space.i9.v0.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m(com.gamericefishpro.space.i9.v0.b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.d;
    }

    public q2() {
        this.d = 1;
        this.e = new ArrayDeque(10);
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
