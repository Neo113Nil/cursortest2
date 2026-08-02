package io.appmetrica.analytics.impl;

import defpackage.evu0;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0864xp extends I6 {
    public List d;
    public List e;
    public String f;
    public String g;
    public Map h;
    public C0467k4 i;
    public List j;
    public boolean k;
    public boolean l;
    public String m;
    public long n;
    public final Yi o;
    public final F8 p;

    public C0864xp(Yi yi, F8 f8) {
        this.i = new C0467k4(null, EnumC0271d9.d);
        this.n = 0L;
        this.o = yi;
        this.p = f8;
    }

    public final long a(long j) {
        if (this.n == 0) {
            this.n = j;
        }
        return this.n;
    }

    public final C0467k4 c() {
        return this.i;
    }

    public final Map<String, String> d() {
        return this.h;
    }

    public final String e() {
        return this.m;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.n;
    }

    public final String h() {
        return this.g;
    }

    public final List<String> i() {
        return this.j;
    }

    public final Yi j() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r3 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!Or.a((Collection) this.d)) {
            linkedHashSet.addAll(this.d);
        }
        if (!Or.a((Collection) this.e)) {
            linkedHashSet.addAll(this.e);
        }
        String[] strArr = (String[]) this.p.a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || evu0.J(str)) {
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
            if (str2 == null || evu0.J(str2)) {
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
        return this.e;
    }

    public final List<String> m() {
        return this.d;
    }

    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.l;
    }

    @Override // io.appmetrica.analytics.impl.I6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.d + ", mStartupHostsFromClient=" + this.e + ", mDistributionReferrer='" + this.f + "', mInstallReferrerSource='" + this.g + "', mClidsFromClient=" + this.h + ", mNewCustomHosts=" + this.j + ", mHasNewCustomHosts=" + this.k + ", mSuccessfulStartup=" + this.l + ", mCountryInit='" + this.m + "', mFirstStartupTime=" + this.n + "} " + super.toString();
    }

    public final void a(List<String> list) {
        this.j = list;
    }

    public final void a(boolean z) {
        this.k = z;
    }

    public final void a(String str) {
        this.m = str;
    }

    public C0864xp() {
        this(Jb.k().u(), new F8());
    }
}
