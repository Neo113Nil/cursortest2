package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3221fp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30889a;

    /* renamed from: b, reason: collision with root package name */
    public final C5107a f30890b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f30891c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f30892d = new AtomicReference("");

    public C3221fp(Context context, C5107a c5107a, SD sd) {
        this.f30889a = context;
        this.f30890b = c5107a;
        this.f30891c = sd;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Nf), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        t2.D d2 = t2.G.f40858l;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        C3151ea c3151ea = AbstractC3368ia.Jf;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C3151ea c3151ea2 = AbstractC3368ia.Lf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Mf)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Nf)).isEmpty()) {
                String str = (String) this.f30892d.get();
                if (!str.isEmpty()) {
                    return str;
                }
                this.f30891c.execute(new RunnableC3376ij(11, this));
                return null;
            }
        }
        return null;
    }

    public final String b() {
        String str;
        C5107a c5107a = this.f30890b;
        String str2 = null;
        if (c5107a.f41220w) {
            str = C2588Hh.class.getName();
        } else {
            try {
                str = (String) new JSONObject(c((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Lf))).get(Integer.toString(c5107a.f41219v));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e6) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Kf)).booleanValue()) {
                    p2.j.f39798C.f39808h.d("SdkIE", e6);
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = c((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Mf));
        } catch (IllegalArgumentException e9) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Kf)).booleanValue()) {
                p2.j.f39798C.f39808h.d("SdkIE", e9);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.f30889a.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
