package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.C2841Wf;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3288h1;
import com.google.android.gms.internal.ads.OD;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Zu;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import t2.E;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3288h1 implements P0, Q0, Gu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31132n;

    /* renamed from: u, reason: collision with root package name */
    public long f31133u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31134v;

    public /* synthetic */ C3288h1(long j9, Object obj, int i) {
        this.f31132n = i;
        this.f31133u = j9;
        this.f31134v = obj;
    }

    public static final void A(C3165eo c3165eo, String str, long j9) {
        if (c3165eo != null) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ee)).booleanValue()) {
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "lat_init");
                a9.r(str, Long.toString(j9));
                a9.s();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.P0
    public void B(byte[] bArr, int i, int i4) {
        ((J0) this.f31134v).I(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public boolean E(byte[] bArr, int i, int i4, boolean z8) {
        return ((J0) this.f31134v).E(bArr, 0, i4, z8);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public boolean I(byte[] bArr, int i, int i4, boolean z8) {
        return ((J0) this.f31134v).I(bArr, i, i4, z8);
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((t2.E) ((C2766Rp) this.f31134v).f683u).t()) {
            return null;
        }
        C3296h9 Q3 = C3350i9.Q();
        Q3.h();
        C3350i9 c3350i9 = (C3350i9) Q3.f30000u;
        long j9 = this.f31133u;
        c3350i9.M(j9);
        byte[] b9 = ((C3350i9) Q3.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        AbstractC2655Lg.w(sQLiteDatabase, j9, b9);
        return null;
    }

    public void c(int i) {
        if (i < 64) {
            this.f31133u &= ~(1 << i);
            return;
        }
        C3288h1 c3288h1 = (C3288h1) this.f31134v;
        if (c3288h1 != null) {
            c3288h1.c(i - 64);
        }
    }

    public int d(int i) {
        C3288h1 c3288h1 = (C3288h1) this.f31134v;
        if (c3288h1 == null) {
            return i >= 64 ? Long.bitCount(this.f31133u) : Long.bitCount(this.f31133u & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f31133u & ((1 << i) - 1));
        }
        return Long.bitCount(this.f31133u) + c3288h1.d(i - 64);
    }

    public void e() {
        if (((C3288h1) this.f31134v) == null) {
            this.f31134v = new C3288h1(8);
        }
    }

    public boolean f(int i) {
        if (i < 64) {
            return (this.f31133u & (1 << i)) != 0;
        }
        e();
        return ((C3288h1) this.f31134v).f(i - 64);
    }

    public void g(int i, boolean z8) {
        if (i >= 64) {
            e();
            ((C3288h1) this.f31134v).g(i - 64, z8);
            return;
        }
        long j9 = this.f31133u;
        boolean z9 = (Long.MIN_VALUE & j9) != 0;
        long j10 = (1 << i) - 1;
        this.f31133u = ((j9 & (~j10)) << 1) | (j9 & j10);
        if (z8) {
            r(i);
        } else {
            c(i);
        }
        if (z9 || ((C3288h1) this.f31134v) != null) {
            e();
            ((C3288h1) this.f31134v).g(0, z9);
        }
    }

    public e8.m j() {
        I1.b bVar = new I1.b(4);
        while (true) {
            String C7 = ((u8.r) this.f31134v).C(this.f31133u);
            this.f31133u -= C7.length();
            if (C7.length() == 0) {
                return bVar.f();
            }
            int Q3 = M7.j.Q(C7, ':', 1, 4);
            if (Q3 != -1) {
                String substring = C7.substring(0, Q3);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                String substring2 = C7.substring(Q3 + 1);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                K3.b.b(bVar, substring, substring2);
            } else if (C7.charAt(0) == ':') {
                String substring3 = C7.substring(1);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                K3.b.b(bVar, "", substring3);
            } else {
                K3.b.b(bVar, "", C7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.P0
    public void k() {
        ((J0) this.f31134v).f25677y = 0;
    }

    public boolean l(int i) {
        if (i >= 64) {
            e();
            return ((C3288h1) this.f31134v).l(i - 64);
        }
        long j9 = 1 << i;
        long j10 = this.f31133u;
        boolean z8 = (j10 & j9) != 0;
        long j11 = j10 & (~j9);
        this.f31133u = j11;
        long j12 = j9 - 1;
        this.f31133u = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        C3288h1 c3288h1 = (C3288h1) this.f31134v;
        if (c3288h1 != null) {
            if (c3288h1.f(0)) {
                r(63);
            }
            ((C3288h1) this.f31134v).l(0);
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public long m() {
        return ((J0) this.f31134v).m() - this.f31133u;
    }

    public void n() {
        this.f31133u = 0L;
        C3288h1 c3288h1 = (C3288h1) this.f31134v;
        if (c3288h1 != null) {
            c3288h1.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.P0
    public long p() {
        return ((J0) this.f31134v).f25675w - this.f31133u;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public long q() {
        return ((J0) this.f31134v).f25674v - this.f31133u;
    }

    public void r(int i) {
        if (i < 64) {
            this.f31133u |= 1 << i;
        } else {
            e();
            ((C3288h1) this.f31134v).r(i - 64);
        }
    }

    @Override // com.google.android.gms.internal.ads.P0
    public void s(int i) {
        ((J0) this.f31134v).b(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(Context context, C5107a c5107a, boolean z8, C2841Wf c2841Wf, String str, String str2, RunnableC4021ui runnableC4021ui, final Zu zu, final C3165eo c3165eo, final Long l9, boolean z9) {
        PackageInfo e6;
        int i = 4;
        boolean z10 = false;
        Object[] objArr = 0;
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        if (SystemClock.elapsedRealtime() - this.f31133u < com.anythink.basead.exoplayer.f.f7344a) {
            int i4 = t2.C.f40822b;
            u2.i.f("Not retrying to fetch app settings");
            return;
        }
        S2.a aVar = jVar.f39810k;
        aVar.getClass();
        this.f31133u = SystemClock.elapsedRealtime();
        if (c2841Wf != null && !TextUtils.isEmpty(c2841Wf.f28423e)) {
            long j9 = c2841Wf.f28424f;
            aVar.getClass();
            if (System.currentTimeMillis() - j9 <= ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31619a5)).longValue() && c2841Wf.f28426h) {
                return;
            }
        }
        if (context == null) {
            int i9 = t2.C.f40822b;
            u2.i.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i10 = t2.C.f40822b;
            u2.i.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f31134v = applicationContext;
        final Vu f6 = Vu.f(context, 4);
        f6.a();
        C2855Xc o9 = jVar.f39817r.o((Context) this.f31134v, c5107a, zu);
        C2837Wb c2837Wb = AbstractC2655Lg.f26168C;
        C2889Zc a9 = o9.a("google.afma.config.fetchAppSettings", c2837Wb, c2837Wb);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z8);
            jSONObject.put("pn", context.getPackageName());
            C3151ea c3151ea = AbstractC3368ia.f31613a;
            q2.r rVar = q2.r.f40116e;
            jSONObject.put("experiment_ids", TextUtils.join(",", rVar.f40117a.B()));
            jSONObject.put("js", c5107a.f41217n);
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Qa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z9);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f31134v).getApplicationInfo();
                if (applicationInfo != null && (e6 = U2.c.a(context).e(0, applicationInfo.packageName)) != null) {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.i, e6.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                t2.C.k("Error fetching PackageInfo.");
            }
            J3.a a10 = a9.a(jSONObject);
            CD cd = new CD() { // from class: p2.c
                @Override // com.google.android.gms.internal.ads.CD
                public final J3.a b(Object obj) {
                    Long l10 = l9;
                    C3165eo c3165eo2 = c3165eo;
                    Vu vu = f6;
                    Zu zu2 = zu;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        j jVar2 = j.f39798C;
                        E g9 = jVar2.f39808h.g();
                        g9.i();
                        synchronized (g9.f40830a) {
                            try {
                                jVar2.f39810k.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (string != null && !string.equals(g9.f40842n.f28423e)) {
                                    g9.f40842n = new C2841Wf(string, currentTimeMillis);
                                    SharedPreferences.Editor editor = g9.f40836g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        g9.f40836g.putLong("app_settings_last_update_ms", currentTimeMillis);
                                        g9.f40836g.apply();
                                    }
                                    g9.j();
                                    Iterator it = g9.f40832c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                                g9.f40842n.f28424f = currentTimeMillis;
                            } finally {
                            }
                        }
                        if (l10 != null) {
                            j.f39798C.f39810k.getClass();
                            C3288h1.A(c3165eo2, "cld_s", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }
                    String optString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(optString)) {
                        vu.h(optString);
                    }
                    vu.b(optBoolean);
                    zu2.b(vu.m());
                    return OD.f26665u;
                }
            };
            C3157eg c3157eg = AbstractC3212fg.f30745h;
            C3945tD y6 = C3686oN.y(a10, cd, c3157eg);
            if (runnableC4021ui != null) {
                ((C3320hg) a10).f31242n.c(runnableC4021ui, c3157eg);
            }
            if (l9 != null) {
                ((C3320hg) a10).f31242n.c(new h3.l(c3165eo, l9, 8, z10), c3157eg);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.D8)).booleanValue()) {
                y6.c(new MD((int) (objArr == true ? 1 : 0), (Object) y6, (Object) new C3731pE(str3, i)), c3157eg);
            } else {
                AbstractC2720Pd.g(y6, "ConfigLoader.maybeFetchNewAppSettings", c3157eg);
            }
        } catch (Exception e9) {
            int i11 = t2.C.f40822b;
            u2.i.d("Error requesting application settings", e9);
            f6.c(e9);
            f6.b(false);
            zu.b(f6.m());
        }
    }

    public String toString() {
        switch (this.f31132n) {
            case 8:
                if (((C3288h1) this.f31134v) == null) {
                    return Long.toBinaryString(this.f31133u);
                }
                return ((C3288h1) this.f31134v).toString() + "xx" + Long.toBinaryString(this.f31133u);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.P0
    public void u(int i) {
        ((J0) this.f31134v).d(i, false);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void v() {
        ((PQ) this.f31134v).v();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void w(InterfaceC3015c1 interfaceC3015c1) {
        ((PQ) this.f31134v).w(new C3342i1(this, interfaceC3015c1, interfaceC3015c1));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public InterfaceC3448k1 x(int i, int i4) {
        return ((PQ) this.f31134v).x(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public void y(byte[] bArr, int i, int i4) {
        ((J0) this.f31134v).E(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.JN
    public int z(byte[] bArr, int i, int i4) {
        return ((J0) this.f31134v).z(bArr, i, i4);
    }

    public C3288h1(J0 j02, long j9) {
        this.f31132n = 0;
        this.f31134v = j02;
        PA.n(j02.f25675w >= j9);
        this.f31133u = j9;
    }

    public /* synthetic */ C3288h1(Object obj, long j9, int i) {
        this.f31132n = i;
        this.f31134v = obj;
        this.f31133u = j9;
    }

    public C3288h1(int i) {
        this.f31132n = i;
        switch (i) {
            case 5:
                this.f31134v = null;
                this.f31133u = -1L;
                break;
            case 6:
            default:
                this.f31134v = new ArrayList();
                break;
            case 7:
                break;
            case 8:
                this.f31133u = 0L;
                break;
        }
    }

    public C3288h1(u8.r source) {
        this.f31132n = 6;
        kotlin.jvm.internal.h.e(source, "source");
        this.f31134v = source;
        this.f31133u = 262144L;
    }
}
