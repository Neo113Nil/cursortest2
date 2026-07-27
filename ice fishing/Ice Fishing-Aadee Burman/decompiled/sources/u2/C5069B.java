package u2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2886Zf;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: u2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5069B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41207b;

    /* renamed from: d, reason: collision with root package name */
    public N3.a f41209d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f41211f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f41212g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f41214j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f41206a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41208c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public D8 f41210e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41213h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41215k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f41216l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f41217m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C2886Zf f41218n = new C2886Zf("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f41219o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f41220p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f41221q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f41222r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f41223s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f41224t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f41225u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41226v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f41227w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f41228x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f41229y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f41230z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f41199A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f41200B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f41201C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f41202D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41203E = false;

    /* renamed from: F, reason: collision with root package name */
    public int f41204F = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f41205G = 0;

    public final void a(String str) {
        i();
        synchronized (this.f41206a) {
            try {
                this.f41216l = str;
                if (this.f41212g != null) {
                    if (str.equals("-1")) {
                        this.f41212g.remove("IABTCF_TCString");
                    } else {
                        this.f41212g.putString("IABTCF_TCString", str);
                    }
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        i();
        synchronized (this.f41206a) {
            try {
                this.f41217m = i;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        i();
        synchronized (this.f41206a) {
            try {
                if (this.f41201C == i) {
                    return;
                }
                this.f41201C = i;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j6) {
        i();
        synchronized (this.f41206a) {
            try {
                if (this.f41202D == j6) {
                    return;
                }
                this.f41202D = j6;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j6);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z3) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
            i();
            synchronized (this.f41206a) {
                try {
                    if (this.f41229y == z3) {
                        return;
                    }
                    this.f41229y = z3;
                    SharedPreferences.Editor editor = this.f41212g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z3);
                        this.f41212g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
            i();
            synchronized (this.f41206a) {
                try {
                    if (this.f41230z.equals(str)) {
                        return;
                    }
                    this.f41230z = str;
                    SharedPreferences.Editor editor = this.f41212g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f41212g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(String str) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Na)).booleanValue()) {
            i();
            synchronized (this.f41206a) {
                try {
                    if (this.f41199A.equals(str)) {
                        return;
                    }
                    this.f41199A = str;
                    SharedPreferences.Editor editor = this.f41212g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f41212g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h() {
        i();
        synchronized (this.f41206a) {
            try {
                if (this.f41203E) {
                    return;
                }
                this.f41203E = true;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        N3.a aVar = this.f41209d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f41209d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Thread.currentThread().interrupt();
            int i = z.f41319b;
            v2.i.g("Interrupted while waiting for preferences loaded.", e9);
        } catch (CancellationException e10) {
            e = e10;
            int i6 = z.f41319b;
            v2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            int i62 = z.f41319b;
            v2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            int i622 = z.f41319b;
            v2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void j() {
        AbstractC3413jg.f31268a.execute(new p3.b(13, this));
    }

    public final void k(Context context) {
        synchronized (this.f41206a) {
            try {
                if (this.f41211f != null) {
                    return;
                }
                this.f41209d = AbstractC3413jg.f31268a.a(new RunnableC3191fP(21, this, context));
                this.f41207b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z3;
        i();
        synchronized (this.f41206a) {
            z3 = this.f41225u;
        }
        return z3;
    }

    public final boolean m() {
        boolean z3;
        i();
        synchronized (this.f41206a) {
            z3 = this.f41226v;
        }
        return z3;
    }

    public final C2886Zf n() {
        C2886Zf c2886Zf;
        i();
        synchronized (this.f41206a) {
            try {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ed)).booleanValue() && this.f41218n.a()) {
                    Iterator it = this.f41208c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c2886Zf = this.f41218n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2886Zf;
    }

    public final void o(long j6) {
        i();
        synchronized (this.f41206a) {
            try {
                if (this.f41220p == j6) {
                    return;
                }
                this.f41220p = j6;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j6);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(String str, String str2, boolean z3) {
        i();
        synchronized (this.f41206a) {
            try {
                JSONArray optJSONArray = this.f41224t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z3 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z3);
                    C4835j.f39730C.f39742k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f41224t.put(str, optJSONArray);
                } catch (JSONException e9) {
                    int i6 = z.f41319b;
                    v2.i.g("Could not update native advanced settings", e9);
                }
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f41224t.toString());
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String q() {
        String str;
        i();
        synchronized (this.f41206a) {
            str = this.f41227w;
        }
        return str;
    }

    public final void r(String str) {
        i();
        synchronized (this.f41206a) {
            try {
                if (TextUtils.equals(this.f41227w, str)) {
                    return;
                }
                this.f41227w = str;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(boolean z3) {
        i();
        synchronized (this.f41206a) {
            try {
                if (z3 == this.f41215k) {
                    return;
                }
                this.f41215k = z3;
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z3);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z3;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32224d1)).booleanValue()) {
            return false;
        }
        i();
        synchronized (this.f41206a) {
            z3 = this.f41215k;
        }
        return z3;
    }

    public final void u(boolean z3) {
        i();
        synchronized (this.f41206a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.Rb)).longValue();
                SharedPreferences.Editor editor = this.f41212g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z3);
                    this.f41212g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f41212g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
