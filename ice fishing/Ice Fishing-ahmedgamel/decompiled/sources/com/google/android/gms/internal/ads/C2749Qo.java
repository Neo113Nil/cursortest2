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
import p2.C4835j;
import q2.InterfaceC4899o0;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2749Qo {

    /* renamed from: a, reason: collision with root package name */
    public final C2783So f27080a;

    /* renamed from: b, reason: collision with root package name */
    public final C2940ap f27081b;

    /* renamed from: c, reason: collision with root package name */
    public final C2579Go f27082c;

    /* renamed from: d, reason: collision with root package name */
    public final C2681Mo f27083d;

    /* renamed from: e, reason: collision with root package name */
    public final C2545Eo f27084e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC2895Zo f27085f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf f27086g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf f27087h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f27088j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27089k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f27094p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27097s;

    /* renamed from: t, reason: collision with root package name */
    public int f27098t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27099u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f27090l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f27091m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f27092n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f27093o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f27095q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public EnumC2698No f27096r = EnumC2698No.f26536n;

    /* renamed from: v, reason: collision with root package name */
    public EnumC2732Po f27100v = EnumC2732Po.f26861n;

    /* renamed from: w, reason: collision with root package name */
    public long f27101w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f27102x = "";

    public C2749Qo(C2783So c2783So, C2940ap c2940ap, C2579Go c2579Go, Context context, C5110a c5110a, C2681Mo c2681Mo, BinderC2895Zo binderC2895Zo, SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf, SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2, String str) {
        this.f27080a = c2783So;
        this.f27081b = c2940ap;
        this.f27082c = c2579Go;
        this.f27084e = new C2545Eo(context, 0);
        this.i = c5110a.f41391n;
        this.f27089k = str;
        this.f27083d = c2681Mo;
        this.f27085f = binderC2895Zo;
        this.f27086g = sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf;
        this.f27087h = sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2;
        this.f27088j = context;
        C4835j.f39733C.f39749o.f41294g = this;
    }

    public final void a() {
        String str;
        boolean z3;
        C3301ha c3301ha = AbstractC3569ma.ka;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.za)).booleanValue()) {
                C5069B g4 = C4835j.f39733C.f39743h.g();
                g4.i();
                synchronized (g4.f41209a) {
                    z3 = g4.f41232y;
                }
                if (z3) {
                    j();
                    return;
                }
            }
            C5069B g9 = C4835j.f39733C.f39743h.g();
            g9.i();
            synchronized (g9.f41209a) {
                str = g9.f41231x;
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

    public final void b(boolean z3) {
        if (!this.f27099u && z3) {
            j();
        }
        g(z3, true);
    }

    public final synchronized void c(String str, C2613Io c2613Io) {
        C3301ha c3301ha = AbstractC3569ma.ka;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && f()) {
            if (this.f27098t >= ((Integer) rVar.f40210c.a(AbstractC3569ma.ma)).intValue()) {
                int i = u2.z.f41322b;
                v2.i.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap hashMap = this.f27090l;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            this.f27098t++;
            ((List) hashMap.get(str)).add(c2613Io);
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Ia)).booleanValue()) {
                String str2 = c2613Io.f25587v;
                this.f27091m.put(str2, c2613Io);
                HashMap hashMap2 = this.f27092n;
                if (hashMap2.containsKey(str2)) {
                    List list = (List) hashMap2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C3467kg) it.next()).b(c2613Io);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized C3467kg d(String str) {
        C3467kg c3467kg;
        try {
            c3467kg = new C3467kg();
            HashMap hashMap = this.f27091m;
            if (hashMap.containsKey(str)) {
                c3467kg.b((C2613Io) hashMap.get(str));
            } else {
                HashMap hashMap2 = this.f27092n;
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, new ArrayList());
                }
                ((List) hashMap2.get(str)).add(c3467kg);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3467kg;
    }

    public final synchronized void e(InterfaceC4899o0 interfaceC4899o0, EnumC2732Po enumC2732Po) {
        if (!f()) {
            try {
                interfaceC4899o0.o2(SK.F(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = u2.z.f41322b;
                v2.i.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ka)).booleanValue()) {
            this.f27100v = enumC2732Po;
            this.f27080a.a(interfaceC4899o0, new C3303hc(this, 1), new C2818Vb(4, this.f27085f), new C3303hc(this, 0));
            return;
        } else {
            try {
                interfaceC4899o0.o2(SK.F(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i6 = u2.z.f41322b;
                v2.i.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.za)).booleanValue()) {
            return this.f27097s || C4835j.f39733C.f39749o.g();
        }
        return this.f27097s;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(boolean z3, boolean z6) {
        try {
            if (this.f27097s != z3) {
                this.f27097s = z3;
                if (z3) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.za)).booleanValue()) {
                        if (!C4835j.f39733C.f39749o.g()) {
                        }
                    }
                    k();
                    if (z6) {
                        m();
                        return;
                    }
                }
                if (!f()) {
                    l();
                }
                if (z6) {
                }
            }
        } finally {
        }
    }

    public final synchronized void h(EnumC2698No enumC2698No, boolean z3) {
        try {
            if (this.f27096r != enumC2698No) {
                if (f()) {
                    l();
                }
                this.f27096r = enumC2698No;
                if (f()) {
                    k();
                }
                if (z3) {
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
            for (Map.Entry entry : this.f27090l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C2613Io c2613Io : (List) entry.getValue()) {
                    if (c2613Io.f25589x != EnumC2596Ho.f25377n) {
                        jSONArray.put(c2613Io.a());
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
        this.f27099u = true;
        C2681Mo c2681Mo = this.f27083d;
        c2681Mo.getClass();
        BinderC2647Ko binderC2647Ko = new BinderC2647Ko(c2681Mo);
        C2494Bo c2494Bo = c2681Mo.f26335a;
        c2494Bo.getClass();
        c2494Bo.f23957e.f31479n.a(new RunnableC3973u0(28, c2494Bo, binderC2647Ko), c2494Bo.f23961j);
        this.f27080a.f27559v = this;
        this.f27081b.f29129f = this;
        this.f27082c.i = this;
        this.f27085f.f28968y = this;
        C3301ha c3301ha = AbstractC3569ma.Oa;
        q2.r rVar = q2.r.f40207e;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40210c.a(c3301ha))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f27088j);
            List asList = Arrays.asList(((String) rVar.f40210c.a(c3301ha)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf = this.f27086g;
            sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf.f25937c = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        C3301ha c3301ha2 = AbstractC3569ma.Pa;
        if (!TextUtils.isEmpty((CharSequence) rVar.f40210c.a(c3301ha2))) {
            SharedPreferences sharedPreferences = this.f27088j.getSharedPreferences("admob", 0);
            List asList2 = Arrays.asList(((String) rVar.f40210c.a(c3301ha2)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2 = this.f27087h;
            sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2.f25937c = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        C5069B g4 = C4835j.f39733C.f39743h.g();
        g4.i();
        synchronized (g4.f41209a) {
            str = g4.f41231x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((EnumC2698No) Enum.valueOf(EnumC2698No.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f27093o = jSONObject.optString("networkExtras", "{}");
                    this.f27095q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        C5069B g9 = C4835j.f39733C.f39743h.g();
        g9.i();
        synchronized (g9.f41209a) {
            str2 = g9.f41202A;
        }
        this.f27102x = str2;
    }

    public final synchronized void k() {
        int ordinal = this.f27096r.ordinal();
        if (ordinal == 1) {
            this.f27081b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f27082c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int ordinal = this.f27096r.ordinal();
            if (ordinal == 1) {
                C2940ap c2940ap = this.f27081b;
                synchronized (c2940ap) {
                    try {
                        if (c2940ap.f29130g) {
                            SensorManager sensorManager2 = c2940ap.f29125b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(c2940ap, c2940ap.f29126c);
                                u2.z.k("Stopped listening for shake gestures.");
                            }
                            c2940ap.f29130g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            C2579Go c2579Go = this.f27082c;
            synchronized (c2579Go) {
                try {
                    if (c2579Go.f25122j && (sensorManager = c2579Go.f25114a) != null && (sensor = c2579Go.f25115b) != null) {
                        sensorManager.unregisterListener(c2579Go, sensor);
                        c2579Go.f25122j = false;
                        u2.z.k("Stopped listening for flick gestures.");
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
        C4835j c4835j = C4835j.f39733C;
        C5069B g4 = c4835j.f39743h.g();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f27097s);
                jSONObject2.put("gesture", this.f27096r);
                long j6 = this.f27095q;
                c4835j.f39745k.getClass();
                if (j6 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f27093o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f27095q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        g4.getClass();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ka)).booleanValue()) {
            g4.i();
            synchronized (g4.f41209a) {
                try {
                    if (g4.f41231x.equals(jSONObject)) {
                        return;
                    }
                    g4.f41231x = jSONObject;
                    SharedPreferences.Editor editor = g4.f41215g;
                    if (editor != null) {
                        editor.putString("inspector_info", jSONObject);
                        g4.f41215g.apply();
                    }
                    g4.j();
                } finally {
                }
            }
        }
    }
}
