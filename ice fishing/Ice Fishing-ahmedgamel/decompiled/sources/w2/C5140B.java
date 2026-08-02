package w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2909Zf;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.RunnableC3214fP;
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
import r2.C4906k;

/* renamed from: w2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5140B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41600b;

    /* renamed from: d, reason: collision with root package name */
    public P3.a f41602d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f41604f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f41605g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f41607j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f41599a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41601c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public D8 f41603e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41606h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41608k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f41609l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f41610m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C2909Zf f41611n = new C2909Zf("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f41612o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f41613p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f41614q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f41615r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f41616s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f41617t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f41618u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41619v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f41620w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f41621x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f41622y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f41623z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f41592A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f41593B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f41594C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f41595D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41596E = false;

    /* renamed from: F, reason: collision with root package name */
    public int f41597F = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f41598G = 0;

    public final void a(String str) {
        i();
        synchronized (this.f41599a) {
            try {
                this.f41609l = str;
                if (this.f41605g != null) {
                    if (str.equals("-1")) {
                        this.f41605g.remove("IABTCF_TCString");
                    } else {
                        this.f41605g.putString("IABTCF_TCString", str);
                    }
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        i();
        synchronized (this.f41599a) {
            try {
                this.f41610m = i;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        i();
        synchronized (this.f41599a) {
            try {
                if (this.f41594C == i) {
                    return;
                }
                this.f41594C = i;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j6) {
        i();
        synchronized (this.f41599a) {
            try {
                if (this.f41595D == j6) {
                    return;
                }
                this.f41595D = j6;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j6);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z6) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
            i();
            synchronized (this.f41599a) {
                try {
                    if (this.f41622y == z6) {
                        return;
                    }
                    this.f41622y = z6;
                    SharedPreferences.Editor editor = this.f41605g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z6);
                        this.f41605g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
            i();
            synchronized (this.f41599a) {
                try {
                    if (this.f41623z.equals(str)) {
                        return;
                    }
                    this.f41623z = str;
                    SharedPreferences.Editor editor = this.f41605g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f41605g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Na)).booleanValue()) {
            i();
            synchronized (this.f41599a) {
                try {
                    if (this.f41592A.equals(str)) {
                        return;
                    }
                    this.f41592A = str;
                    SharedPreferences.Editor editor = this.f41605g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f41605g.apply();
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
        synchronized (this.f41599a) {
            try {
                if (this.f41596E) {
                    return;
                }
                this.f41596E = true;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        P3.a aVar = this.f41602d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f41602d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Thread.currentThread().interrupt();
            int i = z.f41712b;
            x2.i.g("Interrupted while waiting for preferences loaded.", e9);
        } catch (CancellationException e10) {
            e = e10;
            int i4 = z.f41712b;
            x2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            int i42 = z.f41712b;
            x2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            int i422 = z.f41712b;
            x2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void j() {
        AbstractC3436jg.f32055a.execute(new r3.b(13, this));
    }

    public final void k(Context context) {
        synchronized (this.f41599a) {
            try {
                if (this.f41604f != null) {
                    return;
                }
                this.f41602d = AbstractC3436jg.f32055a.a(new RunnableC3214fP(21, this, context));
                this.f41600b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z6;
        i();
        synchronized (this.f41599a) {
            z6 = this.f41618u;
        }
        return z6;
    }

    public final boolean m() {
        boolean z6;
        i();
        synchronized (this.f41599a) {
            z6 = this.f41619v;
        }
        return z6;
    }

    public final C2909Zf n() {
        C2909Zf c2909Zf;
        i();
        synchronized (this.f41599a) {
            try {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ed)).booleanValue() && this.f41611n.a()) {
                    Iterator it = this.f41601c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c2909Zf = this.f41611n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2909Zf;
    }

    public final void o(long j6) {
        i();
        synchronized (this.f41599a) {
            try {
                if (this.f41613p == j6) {
                    return;
                }
                this.f41613p = j6;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j6);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(String str, String str2, boolean z6) {
        i();
        synchronized (this.f41599a) {
            try {
                JSONArray optJSONArray = this.f41617t.optJSONArray(str);
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
                        if (z6 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z6);
                    C4906k.f40186C.f40198k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f41617t.put(str, optJSONArray);
                } catch (JSONException e9) {
                    int i4 = z.f41712b;
                    x2.i.g("Could not update native advanced settings", e9);
                }
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f41617t.toString());
                    this.f41605g.apply();
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
        synchronized (this.f41599a) {
            str = this.f41620w;
        }
        return str;
    }

    public final void r(String str) {
        i();
        synchronized (this.f41599a) {
            try {
                if (TextUtils.equals(this.f41620w, str)) {
                    return;
                }
                this.f41620w = str;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(boolean z6) {
        i();
        synchronized (this.f41599a) {
            try {
                if (z6 == this.f41608k) {
                    return;
                }
                this.f41608k = z6;
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z6);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z6;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33003d1)).booleanValue()) {
            return false;
        }
        i();
        synchronized (this.f41599a) {
            z6 = this.f41608k;
        }
        return z6;
    }

    public final void u(boolean z6) {
        i();
        synchronized (this.f41599a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.Rb)).longValue();
                SharedPreferences.Editor editor = this.f41605g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z6);
                    this.f41605g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f41605g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
