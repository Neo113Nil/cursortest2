package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import r2.C4906k;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Tu implements Su {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28607a;

    /* renamed from: p, reason: collision with root package name */
    public final int f28621p;

    /* renamed from: b, reason: collision with root package name */
    public long f28608b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f28609c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28610d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f28622q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f28623r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f28611e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f28612f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f28613g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f28614h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f28615j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f28616k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f28617l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f28618m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f28619n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28620o = false;

    public Tu(Context context, int i) {
        this.f28607a = context;
        this.f28621p = i;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su S(String str) {
        synchronized (this) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Y9)).booleanValue()) {
                this.f28618m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su a(boolean z6) {
        synchronized (this) {
            this.f28610d = z6;
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
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Y9)).booleanValue()) {
                String d9 = x2.d.d(C2521Ce.d(th), "SHA-256");
                if (d9 == null) {
                    d9 = "";
                }
                this.f28617l = d9;
                String d10 = C2521Ce.d(th);
                com.bumptech.glide.manager.o d11 = com.bumptech.glide.manager.o.d(new PA('\n'));
                d10.getClass();
                this.f28616k = (String) ((AbstractC3093dB) ((InterfaceC3146eB) d11.f24256w).j(d11, d10)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized boolean f() {
        return this.f28620o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.f28613g = r0;
     */
    @Override // com.google.android.gms.internal.ads.Su
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Su g(C2590Gf c2590Gf) {
        synchronized (this) {
            try {
                String str = ((Ut) c2590Gf.f25831v).f28801b;
                if (!TextUtils.isEmpty(str)) {
                    this.f28612f = str;
                }
                Iterator it = ((List) c2590Gf.f25830u).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = ((St) it.next()).f28392b0;
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
    public final Su h(C4969z0 c4969z0) {
        synchronized (this) {
            try {
                IBinder iBinder = c4969z0.f40516x;
                if (iBinder != null) {
                    BinderC3871rk binderC3871rk = (BinderC3871rk) iBinder;
                    String str = binderC3871rk.f34473w;
                    if (!TextUtils.isEmpty(str)) {
                        this.f28612f = str;
                    }
                    String str2 = binderC3871rk.f34471u;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f28613g = str2;
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

    @Override // com.google.android.gms.internal.ads.Su
    public final Su k(int i) {
        synchronized (this) {
            this.f28622q = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final boolean l() {
        return !TextUtils.isEmpty(this.f28614h);
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su m(String str) {
        synchronized (this) {
            this.f28614h = str;
        }
        return this;
    }

    public final synchronized void n() {
        Configuration configuration;
        C4906k c4906k = C4906k.f40186C;
        O2.i iVar = c4906k.f40194f;
        Context context = this.f28607a;
        this.f28611e = iVar.A(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f28623r = i;
        c4906k.f40198k.getClass();
        this.f28608b = SystemClock.elapsedRealtime();
        this.f28620o = true;
    }

    public final synchronized void o() {
        C4906k.f40186C.f40198k.getClass();
        this.f28609c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized Uu q() {
        try {
            if (this.f28619n) {
                return null;
            }
            this.f28619n = true;
            if (!this.f28620o) {
                n();
            }
            if (this.f28609c < 0) {
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
            this.f28615j = i;
        }
        return this;
    }
}
