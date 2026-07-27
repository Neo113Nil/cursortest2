package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class Rx {

    /* renamed from: h, reason: collision with root package name */
    public static final String f27373h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f27374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27376c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27377d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27378e;

    /* renamed from: f, reason: collision with root package name */
    public final S0.e f27379f;

    /* renamed from: g, reason: collision with root package name */
    public final Qx f27380g;

    public Rx(Context context, String str, String str2, String str3) {
        if (S0.e.f2779w == null) {
            S0.e.f2779w = new S0.e(context);
        }
        this.f27379f = S0.e.f2779w;
        this.f27380g = Qx.f(context);
        this.f27374a = str;
        this.f27375b = str.concat("_3p");
        this.f27376c = str2;
        this.f27377d = str2.concat("_3p");
        this.f27378e = str3;
    }

    public final C3381j1 a(String str, long j6, String str2, boolean z3) {
        String str3 = this.f27375b;
        S0.e eVar = this.f27379f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f27373h)) {
                    String string = ((SharedPreferences) eVar.f2782v).getString(str3, null);
                    String string2 = ((SharedPreferences) eVar.f2782v).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C3381j1(5);
        }
        boolean z6 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f27378e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f27376c;
        String str5 = this.f27377d;
        long j9 = ((SharedPreferences) eVar.f2782v).getLong(z6 ? str5 : str4, -1L);
        if (j9 != -1) {
            if (currentTimeMillis < j9) {
                eVar.t(Long.valueOf(currentTimeMillis), z6 ? str5 : str4);
            } else if (currentTimeMillis >= j9 + j6) {
                return b(str, str2);
            }
        }
        if (!z6) {
            str3 = this.f27374a;
        }
        String string3 = ((SharedPreferences) eVar.f2782v).getString(str3, null);
        if (string3 == null && !z3) {
            return b(str, str2);
        }
        if (z6) {
            str4 = str5;
        }
        return new C3381j1(string3, ((SharedPreferences) eVar.f2782v).getLong(str4, -1L), 5);
    }

    public final C3381j1 b(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f27379f.t(uuid, "paid_3p_hash_key");
        return d(e(str, str2, uuid), true);
    }

    public final void c(boolean z3) {
        String str = z3 ? this.f27377d : this.f27376c;
        S0.e eVar = this.f27379f;
        eVar.D(str);
        eVar.D(z3 ? this.f27375b : this.f27374a);
    }

    public final C3381j1 d(String str, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f27378e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z3 ? this.f27377d : this.f27376c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        S0.e eVar = this.f27379f;
        eVar.t(valueOf, str2);
        eVar.t(str, z3 ? this.f27375b : this.f27374a);
        return new C3381j1(str, currentTimeMillis, 5);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(D.y.s(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        int length = str4.length();
        String str5 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str5.length() + length + 120);
        u1.h.i(sb, this.f27378e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }
}
