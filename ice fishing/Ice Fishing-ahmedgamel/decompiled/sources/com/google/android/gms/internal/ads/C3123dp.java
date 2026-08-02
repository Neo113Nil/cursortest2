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
import r2.C4906k;
import w2.HandlerC5139A;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123dp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30637a;

    /* renamed from: b, reason: collision with root package name */
    public final C5189a f30638b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f30639c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f30640d = new AtomicReference("");

    public C3123dp(Context context, C5189a c5189a, RD rd) {
        this.f30637a = context;
        this.f30638b = c5189a;
        this.f30639c = rd;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Tf), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        HandlerC5139A handlerC5139A = w2.D.f41627l;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        C3324ha c3324ha = AbstractC3592ma.Pf;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C3324ha c3324ha2 = AbstractC3592ma.Rf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Sf)).isEmpty() && !((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Tf)).isEmpty()) {
                String str = (String) this.f30640d.get();
                if (!str.isEmpty()) {
                    return str;
                }
                this.f30639c.execute(new RunnableC3493kj(11, this));
                return null;
            }
        }
        return null;
    }

    public final String b() {
        String str;
        C5189a c5189a = this.f30638b;
        String str2 = null;
        if (c5189a.f41848w) {
            str = C2677Lh.class.getName();
        } else {
            try {
                str = (String) new JSONObject(c((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Rf))).get(Integer.toString(c5189a.f41847v));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e9) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qf)).booleanValue()) {
                    C4906k.f40186C.f40196h.d("SdkIE", e9);
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = c((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Sf));
        } catch (IllegalArgumentException e10) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qf)).booleanValue()) {
                C4906k.f40186C.f40196h.d("SdkIE", e10);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.f30637a.getClassLoader().loadClass(str).getDeclaredMethods()) {
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
