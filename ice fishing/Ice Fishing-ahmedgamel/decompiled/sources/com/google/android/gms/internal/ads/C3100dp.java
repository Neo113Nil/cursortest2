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
import p2.C4835j;
import u2.HandlerC5068A;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3100dp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29849a;

    /* renamed from: b, reason: collision with root package name */
    public final C5110a f29850b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f29851c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f29852d = new AtomicReference("");

    public C3100dp(Context context, C5110a c5110a, RD rd) {
        this.f29849a = context;
        this.f29850b = c5110a;
        this.f29851c = rd;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Tf), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        HandlerC5068A handlerC5068A = u2.D.f41237l;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        C3301ha c3301ha = AbstractC3569ma.Pf;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            C3301ha c3301ha2 = AbstractC3569ma.Rf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Sf)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Tf)).isEmpty()) {
                String str = (String) this.f29852d.get();
                if (!str.isEmpty()) {
                    return str;
                }
                this.f29851c.execute(new RunnableC3470kj(11, this));
                return null;
            }
        }
        return null;
    }

    public final String b() {
        String str;
        C5110a c5110a = this.f29850b;
        String str2 = null;
        if (c5110a.f41394w) {
            str = C2657Lh.class.getName();
        } else {
            try {
                str = (String) new JSONObject(c((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Rf))).get(Integer.toString(c5110a.f41393v));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e9) {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Qf)).booleanValue()) {
                    C4835j.f39733C.f39743h.d("SdkIE", e9);
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = c((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Sf));
        } catch (IllegalArgumentException e10) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Qf)).booleanValue()) {
                C4835j.f39733C.f39743h.d("SdkIE", e10);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.f29849a.getClassLoader().loadClass(str).getDeclaredMethods()) {
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
