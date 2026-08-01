package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import p2.C4835j;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Tu implements Su {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27810a;

    /* renamed from: p, reason: collision with root package name */
    public final int f27824p;

    /* renamed from: b, reason: collision with root package name */
    public long f27811b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f27812c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27813d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f27825q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f27826r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f27814e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f27815f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f27816g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f27817h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f27818j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f27819k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f27820l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f27821m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f27822n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27823o = false;

    public Tu(Context context, int i) {
        this.f27810a = context;
        this.f27824p = i;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su S(String str) {
        synchronized (this) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Y9)).booleanValue()) {
                this.f27821m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su a(boolean z3) {
        synchronized (this) {
            this.f27813d = z3;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su b(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final /* bridge */ /* synthetic */ Su c() {
        n();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su d(Throwable th) {
        synchronized (this) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Y9)).booleanValue()) {
                String d2 = v2.d.d(C2501Ce.d(th), "SHA-256");
                if (d2 == null) {
                    d2 = "";
                }
                this.f27820l = d2;
                String d9 = C2501Ce.d(th);
                com.bumptech.glide.manager.p d10 = com.bumptech.glide.manager.p.d(new PA('\n'));
                d9.getClass();
                this.f27819k = (String) ((AbstractC3070dB) ((InterfaceC3123eB) d10.f23471w).j(d10, d9)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized boolean f() {
        return this.f27823o;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su h(C4920z0 c4920z0) {
        synchronized (this) {
            try {
                IBinder iBinder = c4920z0.f40217x;
                if (iBinder != null) {
                    BinderC3848rk binderC3848rk = (BinderC3848rk) iBinder;
                    String str = binderC3848rk.f33701w;
                    if (!TextUtils.isEmpty(str)) {
                        this.f27815f = str;
                    }
                    String str2 = binderC3848rk.f33699u;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f27816g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final /* bridge */ /* synthetic */ Su i() {
        o();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.f27816g = r0;
     */
    @Override // com.google.android.gms.internal.ads.Su
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Su j(C2570Gf c2570Gf) {
        synchronized (this) {
            try {
                String str = ((Ut) c2570Gf.f25043v).f28004b;
                if (!TextUtils.isEmpty(str)) {
                    this.f27815f = str;
                }
                Iterator it = ((List) c2570Gf.f25042u).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = ((St) it.next()).f27609b0;
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su k(int i) {
        synchronized (this) {
            this.f27825q = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final boolean l() {
        return !TextUtils.isEmpty(this.f27817h);
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su m(String str) {
        synchronized (this) {
            this.f27817h = str;
        }
        return this;
    }

    public final synchronized void n() {
        Configuration configuration;
        C4835j c4835j = C4835j.f39733C;
        a4.e eVar = c4835j.f39741f;
        Context context = this.f27810a;
        this.f27814e = eVar.x(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f27826r = i;
        c4835j.f39745k.getClass();
        this.f27811b = SystemClock.elapsedRealtime();
        this.f27823o = true;
    }

    public final synchronized void o() {
        C4835j.f39733C.f39745k.getClass();
        this.f27812c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized Uu q() {
        try {
            if (this.f27822n) {
                return null;
            }
            this.f27822n = true;
            if (!this.f27823o) {
                n();
            }
            if (this.f27812c < 0) {
                o();
            }
            return new Uu(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su v(int i) {
        synchronized (this) {
            this.f27818j = i;
        }
        return this;
    }
}
