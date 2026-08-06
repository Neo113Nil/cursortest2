package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312bm extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public List f5687d;

    /* renamed from: e, reason: collision with root package name */
    public List f5688e;

    /* renamed from: f, reason: collision with root package name */
    public String f5689f;

    /* renamed from: g, reason: collision with root package name */
    public String f5690g;

    /* renamed from: h, reason: collision with root package name */
    public Map f5691h;

    /* renamed from: i, reason: collision with root package name */
    public C0706r3 f5692i;

    /* renamed from: j, reason: collision with root package name */
    public List f5693j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5694k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5695l;

    /* renamed from: m, reason: collision with root package name */
    public String f5696m;

    /* renamed from: n, reason: collision with root package name */
    public long f5697n;

    /* renamed from: o, reason: collision with root package name */
    public final C0564lg f5698o;

    /* renamed from: p, reason: collision with root package name */
    public final H7 f5699p;

    public C0312bm() {
        this(C0610na.k().u(), new H7());
    }

    public final long a(long j2) {
        if (this.f5697n == 0) {
            this.f5697n = j2;
        }
        return this.f5697n;
    }

    public final C0706r3 c() {
        return this.f5692i;
    }

    public final Map<String, String> d() {
        return this.f5691h;
    }

    public final String e() {
        return this.f5696m;
    }

    public final String f() {
        return this.f5689f;
    }

    public final long g() {
        return this.f5697n;
    }

    public final String h() {
        return this.f5690g;
    }

    public final List<String> i() {
        return this.f5693j;
    }

    public final C0564lg j() {
        return this.f5698o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!AbstractC0572lo.a((Collection) this.f5687d)) {
            linkedHashSet.addAll(this.f5687d);
        }
        if (!AbstractC0572lo.a((Collection) this.f5688e)) {
            linkedHashSet.addAll(this.f5688e);
        }
        String[] strArr = (String[]) this.f5699p.f4463a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || z1.g.a0(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
        arrayList = new ArrayList();
        for (String str2 : strArr2) {
            if (str2 == null || z1.g.a0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f5688e;
    }

    public final List<String> m() {
        return this.f5687d;
    }

    public final boolean n() {
        return this.f5694k;
    }

    public final boolean o() {
        return this.f5695l;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f5687d + ", mStartupHostsFromClient=" + this.f5688e + ", mDistributionReferrer='" + this.f5689f + "', mInstallReferrerSource='" + this.f5690g + "', mClidsFromClient=" + this.f5691h + ", mNewCustomHosts=" + this.f5693j + ", mHasNewCustomHosts=" + this.f5694k + ", mSuccessfulStartup=" + this.f5695l + ", mCountryInit='" + this.f5696m + "', mFirstStartupTime=" + this.f5697n + "} " + super.toString();
    }

    public C0312bm(C0564lg c0564lg, H7 h7) {
        this.f5692i = new C0706r3(null, S7.f5045c);
        this.f5697n = 0L;
        this.f5698o = c0564lg;
        this.f5699p = h7;
    }

    public final void a(List<String> list) {
        this.f5693j = list;
    }

    public final void a(boolean z2) {
        this.f5694k = z2;
    }

    public final void a(String str) {
        this.f5696m = str;
    }
}
