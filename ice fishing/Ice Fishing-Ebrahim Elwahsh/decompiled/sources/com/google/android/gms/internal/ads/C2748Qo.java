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
import q2.InterfaceC4906o0;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2748Qo {

    /* renamed from: a, reason: collision with root package name */
    public final C2799To f27217a;

    /* renamed from: b, reason: collision with root package name */
    public final C3057cp f27218b;

    /* renamed from: c, reason: collision with root package name */
    public final C2578Go f27219c;

    /* renamed from: d, reason: collision with root package name */
    public final C2680Mo f27220d;

    /* renamed from: e, reason: collision with root package name */
    public final C2561Fo f27221e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC2948ap f27222f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf f27223g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf f27224h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f27225j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27226k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f27231p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27234s;

    /* renamed from: t, reason: collision with root package name */
    public int f27235t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27236u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f27227l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f27228m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f27229n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f27230o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f27232q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public EnumC2697No f27233r = EnumC2697No.f26603n;

    /* renamed from: v, reason: collision with root package name */
    public EnumC2731Po f27237v = EnumC2731Po.f27050n;

    /* renamed from: w, reason: collision with root package name */
    public long f27238w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f27239x = "";

    public C2748Qo(C2799To c2799To, C3057cp c3057cp, C2578Go c2578Go, Context context, C5107a c5107a, C2680Mo c2680Mo, BinderC2948ap binderC2948ap, SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf, SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2, String str) {
        this.f27217a = c2799To;
        this.f27218b = c3057cp;
        this.f27219c = c2578Go;
        this.f27221e = new C2561Fo(context, 0);
        this.i = c5107a.f41217n;
        this.f27226k = str;
        this.f27220d = c2680Mo;
        this.f27222f = binderC2948ap;
        this.f27223g = sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf;
        this.f27224h = sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2;
        this.f27225j = context;
        p2.j.f39798C.f39814o.f40917g = this;
    }

    public final void a() {
        String str;
        boolean z8;
        C3151ea c3151ea = AbstractC3368ia.ka;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                t2.E g9 = p2.j.f39798C.f39808h.g();
                g9.i();
                synchronized (g9.f40830a) {
                    z8 = g9.f40853y;
                }
                if (z8) {
                    j();
                    return;
                }
            }
            t2.E g10 = p2.j.f39798C.f39808h.g();
            g10.i();
            synchronized (g10.f40830a) {
                str = g10.f40852x;
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

    public final void b(boolean z8) {
        if (!this.f27236u && z8) {
            j();
        }
        g(z8, true);
    }

    public final synchronized void c(String str, C2612Io c2612Io) {
        C3151ea c3151ea = AbstractC3368ia.ka;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && f()) {
            if (this.f27235t >= ((Integer) rVar.f40119c.a(AbstractC3368ia.ma)).intValue()) {
                int i = t2.C.f40822b;
                u2.i.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap hashMap = this.f27227l;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            this.f27235t++;
            ((List) hashMap.get(str)).add(c2612Io);
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ia)).booleanValue()) {
                String str2 = c2612Io.f25622v;
                this.f27228m.put(str2, c2612Io);
                HashMap hashMap2 = this.f27229n;
                if (hashMap2.containsKey(str2)) {
                    List list = (List) hashMap2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C3320hg) it.next()).a(c2612Io);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized C3320hg d(String str) {
        C3320hg c3320hg;
        try {
            c3320hg = new C3320hg();
            HashMap hashMap = this.f27228m;
            if (hashMap.containsKey(str)) {
                c3320hg.a((C2612Io) hashMap.get(str));
            } else {
                HashMap hashMap2 = this.f27229n;
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, new ArrayList());
                }
                ((List) hashMap2.get(str)).add(c3320hg);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3320hg;
    }

    public final synchronized void e(InterfaceC4906o0 interfaceC4906o0, EnumC2731Po enumC2731Po) {
        if (!f()) {
            try {
                interfaceC4906o0.c0(AbstractC3217fl.M(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = t2.C.f40822b;
                u2.i.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ka)).booleanValue()) {
            this.f27237v = enumC2731Po;
            this.f27217a.a(interfaceC4906o0, new C3044cc(this, 1), new C2752Rb(4, this.f27222f), new C3044cc(this, 0));
            return;
        } else {
            try {
                interfaceC4906o0.c0(AbstractC3217fl.M(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i4 = t2.C.f40822b;
                u2.i.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
            return this.f27234s || p2.j.f39798C.f39814o.g();
        }
        return this.f27234s;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(boolean z8, boolean z9) {
        try {
            if (this.f27234s != z8) {
                this.f27234s = z8;
                if (z8) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                        if (!p2.j.f39798C.f39814o.g()) {
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

    public final synchronized void h(EnumC2697No enumC2697No, boolean z8) {
        try {
            if (this.f27233r != enumC2697No) {
                if (f()) {
                    l();
                }
                this.f27233r = enumC2697No;
                if (f()) {
                    k();
                }
                if (z8) {
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
            for (Map.Entry entry : this.f27227l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C2612Io c2612Io : (List) entry.getValue()) {
                    if (c2612Io.f25624x != EnumC2595Ho.f25419n) {
                        jSONArray.put(c2612Io.a());
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
        this.f27236u = true;
        C2680Mo c2680Mo = this.f27220d;
        c2680Mo.getClass();
        BinderC2646Ko binderC2646Ko = new BinderC2646Ko(c2680Mo);
        C2527Do c2527Do = c2680Mo.f26375a;
        c2527Do.getClass();
        c2527Do.f24559e.f31242n.c(new MD(29, c2527Do, binderC2646Ko), c2527Do.f24563j);
        this.f27217a.f27833v = this;
        this.f27218b.f29758f = this;
        this.f27219c.i = this;
        this.f27222f.f29328y = this;
        C3151ea c3151ea = AbstractC3368ia.Oa;
        q2.r rVar = q2.r.f40116e;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40119c.a(c3151ea))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f27225j);
            List asList = Arrays.asList(((String) rVar.f40119c.a(c3151ea)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf = this.f27223g;
            sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf.f25378c = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        C3151ea c3151ea2 = AbstractC3368ia.Pa;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40119c.a(c3151ea2))) {
            SharedPreferences sharedPreferences = this.f27225j.getSharedPreferences("admob", 0);
            List asList2 = Arrays.asList(((String) rVar.f40119c.a(c3151ea2)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2 = this.f27224h;
            sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2.f25378c = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        t2.E g9 = p2.j.f39798C.f39808h.g();
        g9.i();
        synchronized (g9.f40830a) {
            str = g9.f40852x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((EnumC2697No) Enum.valueOf(EnumC2697No.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f27230o = jSONObject.optString("networkExtras", "{}");
                    this.f27232q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        t2.E g10 = p2.j.f39798C.f39808h.g();
        g10.i();
        synchronized (g10.f40830a) {
            str2 = g10.f40823A;
        }
        this.f27239x = str2;
    }

    public final synchronized void k() {
        int ordinal = this.f27233r.ordinal();
        if (ordinal == 1) {
            this.f27218b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f27219c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int ordinal = this.f27233r.ordinal();
            if (ordinal == 1) {
                C3057cp c3057cp = this.f27218b;
                synchronized (c3057cp) {
                    try {
                        if (c3057cp.f29759g) {
                            SensorManager sensorManager2 = c3057cp.f29754b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(c3057cp, c3057cp.f29755c);
                                t2.C.k("Stopped listening for shake gestures.");
                            }
                            c3057cp.f29759g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            C2578Go c2578Go = this.f27219c;
            synchronized (c2578Go) {
                try {
                    if (c2578Go.f25216j && (sensorManager = c2578Go.f25208a) != null && (sensor = c2578Go.f25209b) != null) {
                        sensorManager.unregisterListener(c2578Go, sensor);
                        c2578Go.f25216j = false;
                        t2.C.k("Stopped listening for flick gestures.");
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
        p2.j jVar = p2.j.f39798C;
        t2.E g9 = jVar.f39808h.g();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f27234s);
                jSONObject2.put("gesture", this.f27233r);
                long j9 = this.f27232q;
                jVar.f39810k.getClass();
                if (j9 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f27230o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f27232q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        g9.getClass();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ka)).booleanValue()) {
            g9.i();
            synchronized (g9.f40830a) {
                try {
                    if (g9.f40852x.equals(jSONObject)) {
                        return;
                    }
                    g9.f40852x = jSONObject;
                    SharedPreferences.Editor editor = g9.f40836g;
                    if (editor != null) {
                        editor.putString("inspector_info", jSONObject);
                        g9.f40836g.apply();
                    }
                    g9.j();
                } finally {
                }
            }
        }
    }
}
