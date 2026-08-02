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
    public String f14331a;

    /* renamed from: c, reason: collision with root package name */
    public int f14333c;

    /* renamed from: d, reason: collision with root package name */
    public com.anythink.core.common.d.c f14334d;

    /* renamed from: e, reason: collision with root package name */
    public com.anythink.core.common.n f14335e;

    /* renamed from: f, reason: collision with root package name */
    public ATAdMultipleLoadedListener f14336f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f14337g;

    /* renamed from: h, reason: collision with root package name */
    public int f14338h;
    public d i;

    /* renamed from: l, reason: collision with root package name */
    public ATAdxBidFloorInfo f14341l;

    /* renamed from: m, reason: collision with root package name */
    public final h f14342m;

    /* renamed from: p, reason: collision with root package name */
    private Context f14345p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference<Activity> f14346q;

    /* renamed from: r, reason: collision with root package name */
    private ATAdRequest f14347r;

    /* renamed from: b, reason: collision with root package name */
    public int f14332b = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f14343n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f14344o = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14339j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f14340k = SystemClock.elapsedRealtime();

    public ar() {
        h hVar = new h();
        this.f14342m = hVar;
        hVar.a(System.currentTimeMillis());
    }

    private int f() {
        return this.f14333c;
    }

    private long g() {
        return this.f14343n;
    }

    private long h() {
        return this.f14344o;
    }

    public final void a(Context context) {
        this.f14345p = com.anythink.core.common.d.t.b().g();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        this.f14346q = new WeakReference<>(activity);
        com.anythink.core.common.d.t.b().a(activity);
    }

    public final ATAdRequest b() {
        return this.f14347r;
    }

    public final ar c() {
        ar arVar = new ar();
        arVar.f14345p = this.f14345p;
        arVar.f14346q = this.f14346q;
        arVar.f14333c = this.f14333c;
        arVar.f14334d = this.f14334d;
        arVar.f14335e = this.f14335e;
        arVar.f14337g = this.f14337g;
        arVar.f14338h = this.f14338h;
        arVar.f14347r = this.f14347r;
        return arVar;
    }

    public final boolean d() {
        int i = this.f14333c;
        return i == 13 || i == 14;
    }

    public final boolean e() {
        int i = this.f14333c;
        return (i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void b(long j6) {
        this.f14344o = j6;
    }

    public final Context a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f14346q;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity N8 = com.anythink.core.common.d.t.b().N();
        return N8 != null ? N8 : this.f14345p;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.f14347r = aTAdRequest;
    }

    private void a(long j6) {
        this.f14343n = j6;
    }
}
