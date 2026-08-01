package com.anythink.core.common.h;

import android.os.Looper;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;

/* loaded from: classes.dex */
public class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    private int f13867b;

    /* renamed from: c, reason: collision with root package name */
    private long f13868c;

    /* renamed from: d, reason: collision with root package name */
    private ATBaseAdAdapter f13869d;

    /* renamed from: e, reason: collision with root package name */
    private BaseAd f13870e;

    /* renamed from: f, reason: collision with root package name */
    private int f13871f;

    /* renamed from: g, reason: collision with root package name */
    private long f13872g;

    /* renamed from: h, reason: collision with root package name */
    private int f13873h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13874j;

    /* renamed from: a, reason: collision with root package name */
    private String f13866a = getClass().getSimpleName();

    /* renamed from: k, reason: collision with root package name */
    private String f13875k = "1";

    private long q() {
        return this.f13872g;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        bv unitGroupInfo = this.f13869d.getUnitGroupInfo();
        bv unitGroupInfo2 = cVar2.f13869d.getUnitGroupInfo();
        int b9 = com.anythink.core.common.v.l.b(unitGroupInfo, unitGroupInfo2);
        if (b9 < 0) {
            return -1;
        }
        if (b9 > 0) {
            return 1;
        }
        int i = unitGroupInfo.f13813m;
        int i6 = unitGroupInfo2.f13813m;
        if (i < i6) {
            return -1;
        }
        if (i != i6) {
            return 1;
        }
        if (b() < cVar2.b()) {
            return -1;
        }
        return b() != cVar2.b() ? 1 : 0;
    }

    public final long d() {
        return this.f13868c;
    }

    public final ATBaseAdAdapter e() {
        return this.f13869d;
    }

    public final BaseAd f() {
        return this.f13870e;
    }

    public final boolean g() {
        BaseAd baseAd;
        try {
        } catch (Exception e9) {
            Log.e("AdCacheInfo", "isNetworkAdReady()  >>> " + e9.getMessage());
        }
        if (this.f13874j || this.f13871f > 0) {
            return false;
        }
        if (this.f13869d != null && (baseAd = this.f13870e) != null && baseAd.isValid()) {
            return true;
        }
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        ATBaseAdAdapter aTBaseAdAdapter = this.f13869d;
        if (aTBaseAdAdapter != null) {
            return aTBaseAdAdapter.internalIsAdReady();
        }
        return false;
    }

    public final boolean h() {
        return this.f13874j;
    }

    public final n i() {
        BaseAd baseAd = this.f13870e;
        return baseAd != null ? baseAd.getDetail() : this.f13869d.getTrackingInfo();
    }

    public final boolean j() {
        return this.f13868c + this.f13872g > System.currentTimeMillis();
    }

    public final boolean k() {
        return j() && g();
    }

    public final String l() {
        return this.f13875k;
    }

    public final synchronized void m() {
        if (this.f13874j) {
            return;
        }
        this.f13874j = true;
        if (this.f13871f <= 0) {
            com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.core.common.h.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (c.this.f13871f <= 0) {
                            if (c.this.f13869d != null) {
                                c.this.f13869d.internalDestory();
                            }
                            if (c.this.f13870e != null) {
                                c.this.f13870e.destroy();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public final double n() {
        return com.anythink.core.common.v.p.a(this.f13869d.getUnitGroupInfo());
    }

    public final bv o() {
        return this.f13869d.getUnitGroupInfo();
    }

    public final ATAdInfo p() {
        BaseAd baseAd = this.f13870e;
        ATBaseAdAdapter aTBaseAdAdapter = this.f13869d;
        if (baseAd != null) {
            return com.anythink.core.common.d.l.a(baseAd, aTBaseAdAdapter, 4);
        }
        if (aTBaseAdAdapter != null) {
            return com.anythink.core.common.d.l.a(aTBaseAdAdapter, 4);
        }
        return null;
    }

    public String toString() {
        return "AdCacheInfo{UnitGroupInfo:" + this.f13869d.getUnitGroupInfo().toString() + ", showTime=" + this.f13871f + ", cacheTime=" + this.f13872g + ", upStatus=" + this.f13873h + ", upStatusOutDateTime=" + (this.f13868c + this.i) + ", hasDestroy=" + this.f13874j + '}';
    }

    private int d(c cVar) {
        bv unitGroupInfo = this.f13869d.getUnitGroupInfo();
        bv unitGroupInfo2 = cVar.f13869d.getUnitGroupInfo();
        int b9 = com.anythink.core.common.v.l.b(unitGroupInfo, unitGroupInfo2);
        if (b9 < 0) {
            return -1;
        }
        if (b9 > 0) {
            return 1;
        }
        int i = unitGroupInfo.f13813m;
        int i6 = unitGroupInfo2.f13813m;
        if (i < i6) {
            return -1;
        }
        if (i != i6) {
            return 1;
        }
        if (b() < cVar.b()) {
            return -1;
        }
        return b() != cVar.b() ? 1 : 0;
    }

    public final boolean a() {
        return this.f13873h == 1 && System.currentTimeMillis() - this.f13868c < this.i;
    }

    public final long b() {
        return this.f13868c + this.i;
    }

    public final int c() {
        return this.f13871f;
    }

    public final void a(long j6) {
        this.i = j6;
    }

    public final void b(long j6) {
        this.f13872g = j6;
    }

    public final void c(long j6) {
        this.f13873h = 1;
        this.f13868c = j6;
    }

    public final void a(int i) {
        bv unitGroupInfo;
        ad R8;
        this.f13871f = i;
        if (i > 0) {
            this.f13873h = 0;
            ATBaseAdAdapter aTBaseAdAdapter = this.f13869d;
            if (aTBaseAdAdapter == null || (unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo()) == null || (R8 = unitGroupInfo.R()) == null) {
                return;
            }
            R8.q();
        }
    }

    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f13869d = aTBaseAdAdapter;
    }

    public final void a(BaseAd baseAd) {
        this.f13870e = baseAd;
        ATBaseAdAdapter aTBaseAdAdapter = this.f13869d;
        if ((!(aTBaseAdAdapter != null) || !(aTBaseAdAdapter.getUnitGroupInfo() != null)) || this.f13869d.getUnitGroupInfo().aX() != null) {
            return;
        }
        this.f13869d.getUnitGroupInfo().a(baseAd);
    }

    public final void a(String str) {
        this.f13875k = str;
    }
}
