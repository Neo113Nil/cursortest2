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
import com.google.android.gms.internal.ads.C2909Zf;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3404j1;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Wu;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import r2.C4906k;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3404j1 implements R0, S0, Eu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31942n;

    /* renamed from: u, reason: collision with root package name */
    public long f31943u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31944v;

    public /* synthetic */ C3404j1(long j6, Object obj, int i) {
        this.f31942n = i;
        this.f31943u = j6;
        this.f31944v = obj;
    }

    public static final void z(C3230fo c3230fo, String str, long j6) {
        if (c3230fo != null) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ee)).booleanValue()) {
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "lat_init");
                a9.M(str, Long.toString(j6));
                a9.N();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public boolean A(byte[] bArr, int i, int i4, boolean z6) {
        return ((K0) this.f31944v).A(bArr, 0, i4, z6);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void B() {
        ((FQ) this.f31944v).B();
    }

    @Override // com.google.android.gms.internal.ads.S0
    public InterfaceC3566m1 C(int i, int i4) {
        return ((FQ) this.f31944v).C(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void D(InterfaceC3136e1 interfaceC3136e1) {
        ((FQ) this.f31944v).D(new C3458k1(this, interfaceC3136e1, interfaceC3136e1));
    }

    @Override // com.google.android.gms.internal.ads.R0
    public boolean E(byte[] bArr, int i, int i4, boolean z6) {
        return ((K0) this.f31944v).E(bArr, i, i4, z6);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C5140B) ((C2736Op) this.f31944v).f256u).t()) {
            return null;
        }
        C3466k9 Q8 = C3520l9.Q();
        Q8.h();
        C3520l9 c3520l9 = (C3520l9) Q8.f28504u;
        long j6 = this.f31943u;
        c3520l9.M(j6);
        byte[] b9 = ((C3520l9) Q8.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        SK.J(sQLiteDatabase, j6, b9);
        return null;
    }

    public void c(int i) {
        if (i < 64) {
            this.f31943u &= ~(1 << i);
            return;
        }
        C3404j1 c3404j1 = (C3404j1) this.f31944v;
        if (c3404j1 != null) {
            c3404j1.c(i - 64);
        }
    }

    public int d(int i) {
        C3404j1 c3404j1 = (C3404j1) this.f31944v;
        if (c3404j1 == null) {
            return i >= 64 ? Long.bitCount(this.f31943u) : Long.bitCount(this.f31943u & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f31943u & ((1 << i) - 1));
        }
        return Long.bitCount(this.f31943u) + c3404j1.d(i - 64);
    }

    public void e() {
        if (((C3404j1) this.f31944v) == null) {
            this.f31944v = new C3404j1(8);
        }
    }

    public boolean f(int i) {
        if (i < 64) {
            return (this.f31943u & (1 << i)) != 0;
        }
        e();
        return ((C3404j1) this.f31944v).f(i - 64);
    }

    public void g(int i, boolean z6) {
        if (i >= 64) {
            e();
            ((C3404j1) this.f31944v).g(i - 64, z6);
            return;
        }
        long j6 = this.f31943u;
        boolean z9 = (Long.MIN_VALUE & j6) != 0;
        long j9 = (1 << i) - 1;
        this.f31943u = ((j6 & (~j9)) << 1) | (j6 & j9);
        if (z6) {
            w(i);
        } else {
            c(i);
        }
        if (z9 || ((C3404j1) this.f31944v) != null) {
            e();
            ((C3404j1) this.f31944v).g(0, z9);
        }
    }

    public i8.l h() {
        I1.d dVar = new I1.d(3);
        while (true) {
            String D8 = ((y8.r) this.f31944v).D(this.f31943u);
            this.f31943u -= D8.length();
            if (D8.length() == 0) {
                return dVar.e();
            }
            int p02 = Q7.j.p0(D8, ':', 1, 4);
            if (p02 != -1) {
                String substring = D8.substring(0, p02);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                String substring2 = D8.substring(p02 + 1);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                X2.a.b(dVar, substring, substring2);
            } else if (D8.charAt(0) == ':') {
                String substring3 = D8.substring(1);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                X2.a.b(dVar, "", substring3);
            } else {
                X2.a.b(dVar, "", D8);
            }
        }
    }

    public boolean k(int i) {
        if (i >= 64) {
            e();
            return ((C3404j1) this.f31944v).k(i - 64);
        }
        long j6 = 1 << i;
        long j9 = this.f31943u;
        boolean z6 = (j9 & j6) != 0;
        long j10 = j9 & (~j6);
        this.f31943u = j10;
        long j11 = j6 - 1;
        this.f31943u = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        C3404j1 c3404j1 = (C3404j1) this.f31944v;
        if (c3404j1 != null) {
            if (c3404j1.f(0)) {
                w(63);
            }
            ((C3404j1) this.f31944v).k(0);
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void l() {
        ((K0) this.f31944v).f26573y = 0;
    }

    public void n() {
        this.f31943u = 0L;
        C3404j1 c3404j1 = (C3404j1) this.f31944v;
        if (c3404j1 != null) {
            c3404j1.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long p() {
        return ((K0) this.f31944v).f26571w - this.f31943u;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long q() {
        return ((K0) this.f31944v).q() - this.f31943u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public int r(byte[] bArr, int i, int i4) {
        return ((K0) this.f31944v).r(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public long s() {
        return ((K0) this.f31944v).f26570v - this.f31943u;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void t(int i) {
        ((K0) this.f31944v).d(i, false);
    }

    public String toString() {
        switch (this.f31942n) {
            case 8:
                if (((C3404j1) this.f31944v) == null) {
                    return Long.toBinaryString(this.f31943u);
                }
                return ((C3404j1) this.f31944v).toString() + "xx" + Long.toBinaryString(this.f31943u);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void u(byte[] bArr, int i, int i4) {
        ((K0) this.f31944v).A(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void v(int i) {
        ((K0) this.f31944v).a(i, false);
    }

    public void w(int i) {
        if (i < 64) {
            this.f31943u |= 1 << i;
        } else {
            e();
            ((C3404j1) this.f31944v).w(i - 64);
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public void x(byte[] bArr, int i, int i4) {
        ((K0) this.f31944v).E(bArr, i, i4, false);
    }

    public void y(Context context, C5189a c5189a, boolean z6, C2909Zf c2909Zf, String str, String str2, RunnableC4193xi runnableC4193xi, final Wu wu, final C3230fo c3230fo, final Long l9, boolean z9) {
        PackageInfo g9;
        int i = 0;
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        if (SystemClock.elapsedRealtime() - this.f31943u < com.anythink.basead.exoplayer.f.f7973a) {
            int i4 = w2.z.f41712b;
            x2.i.f("Not retrying to fetch app settings");
            return;
        }
        V2.a aVar = c4906k.f40198k;
        aVar.getClass();
        this.f31943u = SystemClock.elapsedRealtime();
        if (c2909Zf != null && !TextUtils.isEmpty(c2909Zf.f29694e)) {
            long j6 = c2909Zf.f29695f;
            aVar.getClass();
            if (System.currentTimeMillis() - j6 <= ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32977a5)).longValue() && c2909Zf.f29697h) {
                return;
            }
        }
        if (context == null) {
            int i6 = w2.z.f41712b;
            x2.i.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i9 = w2.z.f41712b;
            x2.i.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f31944v = applicationContext;
        final Su e9 = Su.e(context, 4);
        e9.c();
        C3112dd l10 = c4906k.f40205r.l((Context) this.f31944v, c5189a, wu);
        C2889Yb c2889Yb = AbstractC3066cl.f30344C;
        C3219fd a9 = l10.a("google.afma.config.fetchAppSettings", c2889Yb, c2889Yb);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z6);
            jSONObject.put("pn", context.getPackageName());
            C3324ha c3324ha = AbstractC3592ma.f32971a;
            s2.r rVar = s2.r.f40506e;
            jSONObject.put("experiment_ids", TextUtils.join(",", rVar.f40507a.A()));
            jSONObject.put("js", c5189a.f41845n);
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Qa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z9);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f31944v).getApplicationInfo();
                if (applicationInfo != null && (g9 = X2.b.a(context).g(0, applicationInfo.packageName)) != null) {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.i, g9.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                w2.z.k("Error fetching PackageInfo.");
            }
            P3.a b9 = a9.b(jSONObject);
            BD bd = new BD() { // from class: r2.c
                @Override // com.google.android.gms.internal.ads.BD
                public final P3.a a(Object obj) {
                    Long l11 = l9;
                    C3230fo c3230fo2 = c3230fo;
                    Su su = e9;
                    Wu wu2 = wu;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        C4906k c4906k2 = C4906k.f40186C;
                        C5140B g10 = c4906k2.f40196h.g();
                        g10.i();
                        synchronized (g10.f41599a) {
                            try {
                                c4906k2.f40198k.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (string != null && !string.equals(g10.f41611n.f29694e)) {
                                    g10.f41611n = new C2909Zf(string, currentTimeMillis);
                                    SharedPreferences.Editor editor = g10.f41605g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        g10.f41605g.putLong("app_settings_last_update_ms", currentTimeMillis);
                                        g10.f41605g.apply();
                                    }
                                    g10.j();
                                    Iterator it = g10.f41601c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                                g10.f41611n.f29695f = currentTimeMillis;
                            } finally {
                            }
                        }
                        if (l11 != null) {
                            C4906k.f40186C.f40198k.getClass();
                            C3404j1.z(c3230fo2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                        }
                    }
                    String optString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(optString)) {
                        su.S(optString);
                    }
                    su.a(optBoolean);
                    wu2.b(su.q());
                    return ND.f27257u;
                }
            };
            C3383ig c3383ig = AbstractC3436jg.f32062h;
            C3901sD t6 = QC.t(b9, bd, c3383ig);
            if (runnableC4193xi != null) {
                ((C3490kg) b9).f32256n.a(runnableC4193xi, c3383ig);
            }
            if (l9 != null) {
                ((C3490kg) b9).f32256n.a(new RunnableC3214fP(18, c3230fo, l9), c3383ig);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.D8)).booleanValue()) {
                t6.a(new LD(i, t6, new C3579mE(str3, 6)), c3383ig);
            } else {
                MA.f(t6, "ConfigLoader.maybeFetchNewAppSettings", c3383ig);
            }
        } catch (Exception e10) {
            int i10 = w2.z.f41712b;
            x2.i.d("Error requesting application settings", e10);
            e9.d(e10);
            e9.a(false);
            wu.b(e9.q());
        }
    }

    public C3404j1(K0 k02, long j6) {
        this.f31942n = 0;
        this.f31944v = k02;
        AbstractC2792Sd.i(k02.f26571w >= j6);
        this.f31943u = j6;
    }

    public /* synthetic */ C3404j1(Object obj, long j6, int i) {
        this.f31942n = i;
        this.f31944v = obj;
        this.f31943u = j6;
    }

    public C3404j1(int i) {
        this.f31942n = i;
        switch (i) {
            case 5:
                this.f31944v = null;
                this.f31943u = -1L;
                break;
            case 6:
            default:
                this.f31944v = new ArrayList();
                break;
            case 7:
                break;
            case 8:
                this.f31943u = 0L;
                break;
        }
    }

    public C3404j1(y8.r source) {
        this.f31942n = 6;
        kotlin.jvm.internal.h.e(source, "source");
        this.f31944v = source;
        this.f31943u = 262144L;
    }
}
