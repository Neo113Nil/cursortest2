package i8;

import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class b implements A {

    /* renamed from: b, reason: collision with root package name */
    public static final b f38195b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f38196c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final b f38197d = new b();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f38216d.put(str, fVar);
        return fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static z c(String javaName) {
        kotlin.jvm.internal.h.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return z.f38388x;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return z.f38387w;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return z.f38386v;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return z.f38389y;
            }
        } else if (javaName.equals("SSLv3")) {
            return z.f38390z;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static s d(String str) {
        s sVar = s.f38343v;
        if (str.equals("http/1.0")) {
            return sVar;
        }
        s sVar2 = s.f38344w;
        if (str.equals("http/1.1")) {
            return sVar2;
        }
        s sVar3 = s.f38347z;
        if (str.equals("h2_prior_knowledge")) {
            return sVar3;
        }
        s sVar4 = s.f38346y;
        if (str.equals("h2")) {
            return sVar4;
        }
        s sVar5 = s.f38345x;
        if (str.equals("spdy/3.1")) {
            return sVar5;
        }
        s sVar6 = s.f38339A;
        if (str.equals("quic")) {
            return sVar6;
        }
        s sVar7 = s.f38340B;
        if (Q7.q.h0(str, "h3")) {
            return sVar7;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public synchronized f b(String javaName) {
        f fVar;
        String str;
        try {
            kotlin.jvm.internal.h.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = f.f38216d;
            fVar = (f) linkedHashMap.get(javaName);
            if (fVar == null) {
                if (Q7.q.h0(javaName, "TLS_")) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    str = "SSL_".concat(substring);
                } else if (Q7.q.h0(javaName, "SSL_")) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring2, "substring(...)");
                    str = "TLS_".concat(substring2);
                } else {
                    str = javaName;
                }
                fVar = (f) linkedHashMap.get(str);
                if (fVar == null) {
                    fVar = new f(javaName);
                }
                linkedHashMap.put(javaName, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
