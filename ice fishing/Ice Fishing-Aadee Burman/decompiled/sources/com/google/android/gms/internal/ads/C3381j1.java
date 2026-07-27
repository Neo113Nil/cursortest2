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
import com.google.android.gms.internal.ads.C2886Zf;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3381j1;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Wu;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p2.C4835j;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3381j1 implements R0, S0, Eu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31155n;

    /* renamed from: u, reason: collision with root package name */
    public long f31156u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31157v;

    public /* synthetic */ C3381j1(long j6, Object obj, int i) {
        this.f31155n = i;
        this.f31156u = j6;
        this.f31157v = obj;
    }

    public static final void E(C3153eo c3153eo, String str, long j6) {
        if (c3153eo != null) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ee)).booleanValue()) {
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "lat_init");
                a9.v(str, Long.toString(j6));
                a9.y();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public boolean A(byte[] bArr, int i, int i6, boolean z3) {
        return ((K0) this.f31157v).A(bArr, i, i6, z3);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void B() {
        ((CQ) this.f31157v).B();
    }

    @Override // com.google.android.gms.internal.ads.S0
    public InterfaceC3543m1 C(int i, int i6) {
        return ((CQ) this.f31157v).C(i, i6);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void D(InterfaceC3113e1 interfaceC3113e1) {
        ((CQ) this.f31157v).D(new C3435k1(this, interfaceC3113e1, interfaceC3113e1));
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C5069B) ((C2716Op) this.f31157v).f731u).t()) {
            return null;
        }
        C3443k9 Q8 = C3497l9.Q();
        Q8.h();
        C3497l9 c3497l9 = (C3497l9) Q8.f27721u;
        long j6 = this.f31156u;
        c3497l9.M(j6);
        byte[] b9 = ((C3497l9) Q8.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        SK.J(sQLiteDatabase, j6, b9);
        return null;
    }

    public void b(int i) {
        if (i < 64) {
            this.f31156u &= ~(1 << i);
            return;
        }
        C3381j1 c3381j1 = (C3381j1) this.f31157v;
        if (c3381j1 != null) {
            c3381j1.b(i - 64);
        }
    }

    public int c(int i) {
        C3381j1 c3381j1 = (C3381j1) this.f31157v;
        if (c3381j1 == null) {
            return i >= 64 ? Long.bitCount(this.f31156u) : Long.bitCount(this.f31156u & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f31156u & ((1 << i) - 1));
        }
        return Long.bitCount(this.f31156u) + c3381j1.c(i - 64);
    }

    public void d() {
        if (((C3381j1) this.f31157v) == null) {
            this.f31157v = new C3381j1(8);
        }
    }

    public boolean e(int i) {
        if (i < 64) {
            return (this.f31156u & (1 << i)) != 0;
        }
        d();
        return ((C3381j1) this.f31157v).e(i - 64);
    }

    public void f(int i, boolean z3) {
        if (i >= 64) {
            d();
            ((C3381j1) this.f31157v).f(i - 64, z3);
            return;
        }
        long j6 = this.f31156u;
        boolean z6 = (Long.MIN_VALUE & j6) != 0;
        long j9 = (1 << i) - 1;
        this.f31156u = ((j6 & (~j9)) << 1) | (j6 & j9);
        if (z3) {
            w(i);
        } else {
            b(i);
        }
        if (z6 || ((C3381j1) this.f31157v) != null) {
            d();
            ((C3381j1) this.f31157v).f(0, z6);
        }
    }

    public i8.l h() {
        G1.e eVar = new G1.e(3);
        while (true) {
            String D8 = ((y8.r) this.f31157v).D(this.f31156u);
            this.f31156u -= D8.length();
            if (D8.length() == 0) {
                return eVar.b();
            }
            int Z8 = Q7.j.Z(D8, ':', 1, 4);
            if (Z8 != -1) {
                String substring = D8.substring(0, Z8);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                String substring2 = D8.substring(Z8 + 1);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                com.bumptech.glide.f.f(eVar, substring, substring2);
            } else if (D8.charAt(0) == ':') {
                String substring3 = D8.substring(1);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                com.bumptech.glide.f.f(eVar, "", substring3);
            } else {
                com.bumptech.glide.f.f(eVar, "", D8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void l() {
        ((K0) this.f31157v).f25821y = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public int m(byte[] bArr, int i, int i6) {
        return ((K0) this.f31157v).m(bArr, i, i6);
    }

    public boolean n(int i) {
        if (i >= 64) {
            d();
            return ((C3381j1) this.f31157v).n(i - 64);
        }
        long j6 = 1 << i;
        long j9 = this.f31156u;
        boolean z3 = (j9 & j6) != 0;
        long j10 = j9 & (~j6);
        this.f31156u = j10;
        long j11 = j6 - 1;
        this.f31156u = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        C3381j1 c3381j1 = (C3381j1) this.f31157v;
        if (c3381j1 != null) {
            if (c3381j1.e(0)) {
                w(63);
            }
            ((C3381j1) this.f31157v).n(0);
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long p() {
        return ((K0) this.f31157v).f25819w - this.f31156u;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long q() {
        return ((K0) this.f31157v).q() - this.f31156u;
    }

    public void r() {
        this.f31156u = 0L;
        C3381j1 c3381j1 = (C3381j1) this.f31157v;
        if (c3381j1 != null) {
            c3381j1.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long s() {
        return ((K0) this.f31157v).f25818v - this.f31156u;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void t(int i) {
        ((K0) this.f31157v).c(i, false);
    }

    public String toString() {
        switch (this.f31155n) {
            case 8:
                if (((C3381j1) this.f31157v) == null) {
                    return Long.toBinaryString(this.f31156u);
                }
                return ((C3381j1) this.f31157v).toString() + "xx" + Long.toBinaryString(this.f31156u);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void u(byte[] bArr, int i, int i6) {
        ((K0) this.f31157v).z(bArr, i, i6, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void v(int i) {
        ((K0) this.f31157v).a(i, false);
    }

    public void w(int i) {
        if (i < 64) {
            this.f31156u |= 1 << i;
        } else {
            d();
            ((C3381j1) this.f31157v).w(i - 64);
        }
    }

    public void x(Context context, C5110a c5110a, boolean z3, C2886Zf c2886Zf, String str, String str2, RunnableC4170xi runnableC4170xi, final Wu wu, final C3153eo c3153eo, final Long l9, boolean z6) {
        PackageInfo c9;
        int i = 0;
        C4835j c4835j = C4835j.f39730C;
        c4835j.f39742k.getClass();
        if (SystemClock.elapsedRealtime() - this.f31156u < com.anythink.basead.exoplayer.f.f7187a) {
            int i6 = u2.z.f41319b;
            v2.i.f("Not retrying to fetch app settings");
            return;
        }
        T2.a aVar = c4835j.f39742k;
        aVar.getClass();
        this.f31156u = SystemClock.elapsedRealtime();
        if (c2886Zf != null && !TextUtils.isEmpty(c2886Zf.f28917e)) {
            long j6 = c2886Zf.f28918f;
            aVar.getClass();
            if (System.currentTimeMillis() - j6 <= ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32198a5)).longValue() && c2886Zf.f28920h) {
                return;
            }
        }
        if (context == null) {
            int i9 = u2.z.f41319b;
            v2.i.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i10 = u2.z.f41319b;
            v2.i.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f31157v = applicationContext;
        final Su g4 = Su.g(context, 4);
        g4.c();
        C3089dd m4 = c4835j.f39749r.m((Context) this.f31157v, c5110a, wu);
        C2866Yb c2866Yb = AbstractC3043cl.f29559C;
        C3196fd a9 = m4.a("google.afma.config.fetchAppSettings", c2866Yb, c2866Yb);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z3);
            jSONObject.put("pn", context.getPackageName());
            C3301ha c3301ha = AbstractC3569ma.f32192a;
            q2.r rVar = q2.r.f40204e;
            jSONObject.put("experiment_ids", TextUtils.join(",", rVar.f40205a.B()));
            jSONObject.put("js", c5110a.f41388n);
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Qa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z6);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f31157v).getApplicationInfo();
                if (applicationInfo != null && (c9 = V2.c.a(context).c(0, applicationInfo.packageName)) != null) {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.i, c9.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                u2.z.k("Error fetching PackageInfo.");
            }
            N3.a b9 = a9.b(jSONObject);
            BD bd = new BD() { // from class: p2.c
                @Override // com.google.android.gms.internal.ads.BD
                public final N3.a a(Object obj) {
                    Long l10 = l9;
                    C3153eo c3153eo2 = c3153eo;
                    Su su = g4;
                    Wu wu2 = wu;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        C4835j c4835j2 = C4835j.f39730C;
                        C5069B g9 = c4835j2.f39740h.g();
                        g9.i();
                        synchronized (g9.f41206a) {
                            try {
                                c4835j2.f39742k.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (string != null && !string.equals(g9.f41218n.f28917e)) {
                                    g9.f41218n = new C2886Zf(string, currentTimeMillis);
                                    SharedPreferences.Editor editor = g9.f41212g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        g9.f41212g.putLong("app_settings_last_update_ms", currentTimeMillis);
                                        g9.f41212g.apply();
                                    }
                                    g9.j();
                                    Iterator it = g9.f41208c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                                g9.f41218n.f28918f = currentTimeMillis;
                            } finally {
                            }
                        }
                        if (l10 != null) {
                            C4835j.f39730C.f39742k.getClass();
                            C3381j1.E(c3153eo2, "cld_s", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }
                    String optString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(optString)) {
                        su.S(optString);
                    }
                    su.a(optBoolean);
                    wu2.b(su.q());
                    return ND.f26473u;
                }
            };
            C3360ig c3360ig = AbstractC3413jg.f31275h;
            C3878sD t6 = QC.t(b9, bd, c3360ig);
            if (runnableC4170xi != null) {
                ((C3467kg) b9).f31479n.a(runnableC4170xi, c3360ig);
            }
            if (l9 != null) {
                ((C3467kg) b9).f31479n.a(new RunnableC3191fP(18, c3153eo, l9), c3360ig);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.D8)).booleanValue()) {
                t6.a(new LD(i, t6, new C3556mE(str3, 6)), c3360ig);
            } else {
                MA.f(t6, "ConfigLoader.maybeFetchNewAppSettings", c3360ig);
            }
        } catch (Exception e9) {
            int i11 = u2.z.f41319b;
            v2.i.d("Error requesting application settings", e9);
            g4.d(e9);
            g4.a(false);
            wu.b(g4.q());
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void y(byte[] bArr, int i, int i6) {
        ((K0) this.f31157v).A(bArr, i, i6, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public boolean z(byte[] bArr, int i, int i6, boolean z3) {
        return ((K0) this.f31157v).z(bArr, 0, i6, z3);
    }

    public C3381j1(K0 k02, long j6) {
        this.f31155n = 0;
        this.f31157v = k02;
        AbstractC2772Sd.i(k02.f25819w >= j6);
        this.f31156u = j6;
    }

    public /* synthetic */ C3381j1(Object obj, long j6, int i) {
        this.f31155n = i;
        this.f31157v = obj;
        this.f31156u = j6;
    }

    public C3381j1(int i) {
        this.f31155n = i;
        switch (i) {
            case 5:
                this.f31157v = null;
                this.f31156u = -1L;
                break;
            case 6:
            default:
                this.f31157v = new ArrayList();
                break;
            case 7:
                break;
            case 8:
                this.f31156u = 0L;
                break;
        }
    }

    public C3381j1(y8.r source) {
        this.f31155n = 6;
        kotlin.jvm.internal.h.e(source, "source");
        this.f31157v = source;
        this.f31156u = 262144L;
    }
}
