package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.InterfaceC4948o0;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2786Ro {

    /* renamed from: a, reason: collision with root package name */
    public final C2820To f28024a;

    /* renamed from: b, reason: collision with root package name */
    public final C2963ap f28025b;

    /* renamed from: c, reason: collision with root package name */
    public final C2616Ho f28026c;

    /* renamed from: d, reason: collision with root package name */
    public final C2718No f28027d;

    /* renamed from: e, reason: collision with root package name */
    public final C2582Fo f28028e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC2918Zo f28029f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf f28030g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf f28031h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f28032j;

    /* renamed from: k, reason: collision with root package name */
    public final String f28033k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f28038p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28041s;

    /* renamed from: t, reason: collision with root package name */
    public int f28042t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28043u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f28034l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f28035m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f28036n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f28037o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f28039q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public EnumC2735Oo f28040r = EnumC2735Oo.f27440n;

    /* renamed from: v, reason: collision with root package name */
    public EnumC2769Qo f28044v = EnumC2769Qo.f27854n;

    /* renamed from: w, reason: collision with root package name */
    public long f28045w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f28046x = "";

    public C2786Ro(C2820To c2820To, C2963ap c2963ap, C2616Ho c2616Ho, Context context, C5189a c5189a, C2718No c2718No, BinderC2918Zo binderC2918Zo, SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf, SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2, String str) {
        this.f28024a = c2820To;
        this.f28025b = c2963ap;
        this.f28026c = c2616Ho;
        this.f28028e = new C2582Fo(context, 0);
        this.i = c5189a.f41845n;
        this.f28033k = str;
        this.f28027d = c2718No;
        this.f28029f = binderC2918Zo;
        this.f28030g = sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf;
        this.f28031h = sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2;
        this.f28032j = context;
        C4906k.f40186C.f40202o.f41684g = this;
    }

    public final void a() {
        String str;
        boolean z6;
        C3324ha c3324ha = AbstractC3592ma.ka;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                C5140B g9 = C4906k.f40186C.f40196h.g();
                g9.i();
                synchronized (g9.f41599a) {
                    z6 = g9.f41622y;
                }
                if (z6) {
                    j();
                    return;
                }
            }
            C5140B g10 = C4906k.f40186C.f40196h.g();
            g10.i();
            synchronized (g10.f41599a) {
                str = g10.f41621x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z6) {
        if (!this.f28043u && z6) {
            j();
        }
        g(z6, true);
    }

    public final synchronized void c(String str, C2650Jo c2650Jo) {
        C3324ha c3324ha = AbstractC3592ma.ka;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && f()) {
            if (this.f28042t >= ((Integer) rVar.f40509c.a(AbstractC3592ma.ma)).intValue()) {
                int i = w2.z.f41712b;
                x2.i.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap hashMap = this.f28034l;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            this.f28042t++;
            ((List) hashMap.get(str)).add(c2650Jo);
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ia)).booleanValue()) {
                String str2 = c2650Jo.f26511v;
                this.f28035m.put(str2, c2650Jo);
                HashMap hashMap2 = this.f28036n;
                if (hashMap2.containsKey(str2)) {
                    List list = (List) hashMap2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C3490kg) it.next()).b(c2650Jo);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized C3490kg d(String str) {
        C3490kg c3490kg;
        try {
            c3490kg = new C3490kg();
            HashMap hashMap = this.f28035m;
            if (hashMap.containsKey(str)) {
                c3490kg.b((C2650Jo) hashMap.get(str));
            } else {
                HashMap hashMap2 = this.f28036n;
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, new ArrayList());
                }
                ((List) hashMap2.get(str)).add(c3490kg);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3490kg;
    }

    public final synchronized void e(InterfaceC4948o0 interfaceC4948o0, EnumC2769Qo enumC2769Qo) {
        if (!f()) {
            try {
                interfaceC4948o0.a3(SK.F(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = w2.z.f41712b;
                x2.i.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ka)).booleanValue()) {
            this.f28044v = enumC2769Qo;
            this.f28024a.a(interfaceC4948o0, new C3326hc(this, 1), new C2841Vb(4, this.f28029f), new C3326hc(this, 0));
            return;
        } else {
            try {
                interfaceC4948o0.a3(SK.F(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i4 = w2.z.f41712b;
                x2.i.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
            return this.f28041s || C4906k.f40186C.f40202o.g();
        }
        return this.f28041s;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(boolean z6, boolean z9) {
        try {
            if (this.f28041s != z6) {
                this.f28041s = z6;
                if (z6) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                        if (!C4906k.f40186C.f40202o.g()) {
                        }
                    }
                    k();
                    if (z9) {
                        m();
                        return;
                    }
                }
                if (!f()) {
                    l();
                }
                if (z9) {
                }
            }
        } finally {
        }
    }

    public final synchronized void h(EnumC2735Oo enumC2735Oo, boolean z6) {
        try {
            if (this.f28040r != enumC2735Oo) {
                if (f()) {
                    l();
                }
                this.f28040r = enumC2735Oo;
                if (f()) {
                    k();
                }
                if (z6) {
                    m();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f28034l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C2650Jo c2650Jo : (List) entry.getValue()) {
                    if (c2650Jo.f26513x != EnumC2633Io.f26341n) {
                        jSONArray.put(c2650Jo.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() {
        String str;
        String str2;
        this.f28043u = true;
        C2718No c2718No = this.f28027d;
        c2718No.getClass();
        BinderC2684Lo binderC2684Lo = new BinderC2684Lo(c2718No);
        C2531Co c2531Co = c2718No.f27317a;
        c2531Co.getClass();
        c2531Co.f24970e.f32256n.a(new RunnableC3996u0(28, c2531Co, binderC2684Lo), c2531Co.f24974j);
        this.f28024a.f28588v = this;
        this.f28025b.f29914f = this;
        this.f28026c.i = this;
        this.f28029f.f29738y = this;
        C3324ha c3324ha = AbstractC3592ma.Oa;
        s2.r rVar = s2.r.f40506e;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40509c.a(c3324ha))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f28032j);
            List asList = Arrays.asList(((String) rVar.f40509c.a(c3324ha)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf = this.f28030g;
            sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf.f26715c = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        C3324ha c3324ha2 = AbstractC3592ma.Pa;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40509c.a(c3324ha2))) {
            SharedPreferences sharedPreferences = this.f28032j.getSharedPreferences("admob", 0);
            List asList2 = Arrays.asList(((String) rVar.f40509c.a(c3324ha2)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2 = this.f28031h;
            sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2.f26715c = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        C5140B g9 = C4906k.f40186C.f40196h.g();
        g9.i();
        synchronized (g9.f41599a) {
            str = g9.f41621x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((EnumC2735Oo) Enum.valueOf(EnumC2735Oo.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f28037o = jSONObject.optString("networkExtras", "{}");
                    this.f28039q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        C5140B g10 = C4906k.f40186C.f40196h.g();
        g10.i();
        synchronized (g10.f41599a) {
            str2 = g10.f41592A;
        }
        this.f28046x = str2;
    }

    public final synchronized void k() {
        int ordinal = this.f28040r.ordinal();
        if (ordinal == 1) {
            this.f28025b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f28026c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int ordinal = this.f28040r.ordinal();
            if (ordinal == 1) {
                C2963ap c2963ap = this.f28025b;
                synchronized (c2963ap) {
                    try {
                        if (c2963ap.f29915g) {
                            SensorManager sensorManager2 = c2963ap.f29910b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(c2963ap, c2963ap.f29911c);
                                w2.z.k("Stopped listening for shake gestures.");
                            }
                            c2963ap.f29915g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            C2616Ho c2616Ho = this.f28026c;
            synchronized (c2616Ho) {
                try {
                    if (c2616Ho.f26123j && (sensorManager = c2616Ho.f26115a) != null && (sensor = c2616Ho.f26116b) != null) {
                        sensorManager.unregisterListener(c2616Ho, sensor);
                        c2616Ho.f26123j = false;
                        w2.z.k("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void m() {
        String jSONObject;
        C4906k c4906k = C4906k.f40186C;
        C5140B g9 = c4906k.f40196h.g();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f28041s);
                jSONObject2.put("gesture", this.f28040r);
                long j6 = this.f28039q;
                c4906k.f40198k.getClass();
                if (j6 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f28037o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f28039q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        g9.getClass();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ka)).booleanValue()) {
            g9.i();
            synchronized (g9.f41599a) {
                try {
                    if (g9.f41621x.equals(jSONObject)) {
                        return;
                    }
                    g9.f41621x = jSONObject;
                    SharedPreferences.Editor editor = g9.f41605g;
                    if (editor != null) {
                        editor.putString("inspector_info", jSONObject);
                        g9.f41605g.apply();
                    }
                    g9.j();
                } finally {
                }
            }
        }
    }
}
