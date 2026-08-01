package com.anythink.core.common.h;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    public String f13545a;

    /* renamed from: c, reason: collision with root package name */
    public int f13547c;

    /* renamed from: d, reason: collision with root package name */
    public com.anythink.core.common.d.c f13548d;

    /* renamed from: e, reason: collision with root package name */
    public com.anythink.core.common.n f13549e;

    /* renamed from: f, reason: collision with root package name */
    public ATAdMultipleLoadedListener f13550f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f13551g;

    /* renamed from: h, reason: collision with root package name */
    public int f13552h;
    public d i;

    /* renamed from: l, reason: collision with root package name */
    public ATAdxBidFloorInfo f13555l;

    /* renamed from: m, reason: collision with root package name */
    public final h f13556m;

    /* renamed from: p, reason: collision with root package name */
    private Context f13559p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference<Activity> f13560q;

    /* renamed from: r, reason: collision with root package name */
    private ATAdRequest f13561r;

    /* renamed from: b, reason: collision with root package name */
    public int f13546b = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f13557n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f13558o = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13553j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f13554k = SystemClock.elapsedRealtime();

    public ar() {
        h hVar = new h();
        this.f13556m = hVar;
        hVar.a(System.currentTimeMillis());
    }

    private int f() {
        return this.f13547c;
    }

    private long g() {
        return this.f13557n;
    }

    private long h() {
        return this.f13558o;
    }

    public final void a(Context context) {
        this.f13559p = com.anythink.core.common.d.t.b().g();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        this.f13560q = new WeakReference<>(activity);
        com.anythink.core.common.d.t.b().a(activity);
    }

    public final ATAdRequest b() {
        return this.f13561r;
    }

    public final ar c() {
        ar arVar = new ar();
        arVar.f13559p = this.f13559p;
        arVar.f13560q = this.f13560q;
        arVar.f13547c = this.f13547c;
        arVar.f13548d = this.f13548d;
        arVar.f13549e = this.f13549e;
        arVar.f13551g = this.f13551g;
        arVar.f13552h = this.f13552h;
        arVar.f13561r = this.f13561r;
        return arVar;
    }

    public final boolean d() {
        int i = this.f13547c;
        return i == 13 || i == 14;
    }

    public final boolean e() {
        int i = this.f13547c;
        return (i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void b(long j6) {
        this.f13558o = j6;
    }

    public final Context a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f13560q;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity N8 = com.anythink.core.common.d.t.b().N();
        return N8 != null ? N8 : this.f13559p;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.f13561r = aTAdRequest;
    }

    private void a(long j6) {
        this.f13557n = j6;
    }
}
