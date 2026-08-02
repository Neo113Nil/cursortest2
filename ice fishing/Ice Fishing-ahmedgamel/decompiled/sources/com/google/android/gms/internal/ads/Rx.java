package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class Rx {

    /* renamed from: h, reason: collision with root package name */
    public static final String f28087h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f28088a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28089b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28090c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28091d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28092e;

    /* renamed from: f, reason: collision with root package name */
    public final S0.e f28093f;

    /* renamed from: g, reason: collision with root package name */
    public final Qx f28094g;

    public Rx(Context context, String str, String str2, String str3) {
        if (S0.e.f2906w == null) {
            S0.e.f2906w = new S0.e(context);
        }
        this.f28093f = S0.e.f2906w;
        this.f28094g = Qx.f(context);
        this.f28088a = str;
        this.f28089b = str.concat("_3p");
        this.f28090c = str2;
        this.f28091d = str2.concat("_3p");
        this.f28092e = str3;
    }

    public final C3404j1 a(String str, long j6, String str2, boolean z6) {
        String str3 = this.f28089b;
        S0.e eVar = this.f28093f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f28087h)) {
                    String string = ((SharedPreferences) eVar.f2909v).getString(str3, null);
                    String string2 = ((SharedPreferences) eVar.f2909v).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C3404j1(5);
        }
        boolean z9 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f28092e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f28090c;
        String str5 = this.f28091d;
        long j9 = ((SharedPreferences) eVar.f2909v).getLong(z9 ? str5 : str4, -1L);
        if (j9 != -1) {
            if (currentTimeMillis < j9) {
                eVar.J(Long.valueOf(currentTimeMillis), z9 ? str5 : str4);
            } else if (currentTimeMillis >= j9 + j6) {
                return b(str, str2);
            }
        }
        if (!z9) {
            str3 = this.f28088a;
        }
        String string3 = ((SharedPreferences) eVar.f2909v).getString(str3, null);
        if (string3 == null && !z6) {
            return b(str, str2);
        }
        if (z9) {
            str4 = str5;
        }
        return new C3404j1(string3, ((SharedPreferences) eVar.f2909v).getLong(str4, -1L), 5);
    }

    public final C3404j1 b(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f28093f.J(uuid, "paid_3p_hash_key");
        return d(e(str, str2, uuid), true);
    }

    public final void c(boolean z6) {
        String str = z6 ? this.f28091d : this.f28090c;
        S0.e eVar = this.f28093f;
        eVar.R(str);
        eVar.R(z6 ? this.f28089b : this.f28088a);
    }

    public final C3404j1 d(String str, boolean z6) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f28092e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z6 ? this.f28091d : this.f28090c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        S0.e eVar = this.f28093f;
        eVar.J(valueOf, str2);
        eVar.J(str, z6 ? this.f28089b : this.f28088a);
        return new C3404j1(str, currentTimeMillis, 5);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(D.x.p(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        int length = str4.length();
        String str5 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str5.length() + length + 120);
        AbstractC5128c.h(sb, this.f28092e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }
}
