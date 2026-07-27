package com.anythink.core.common.n.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {
    final String bq;

    /* renamed from: a, reason: collision with root package name */
    static final Comparator<String> f15798a = new L.b(2);
    private static final Map<String, i> br = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final i f15799b = c("SSL_RSA_WITH_NULL_MD5");

    /* renamed from: c, reason: collision with root package name */
    public static final i f15800c = c("SSL_RSA_WITH_NULL_SHA");

    /* renamed from: d, reason: collision with root package name */
    public static final i f15801d = c("SSL_RSA_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: e, reason: collision with root package name */
    public static final i f15802e = c("SSL_RSA_WITH_RC4_128_MD5");

    /* renamed from: f, reason: collision with root package name */
    public static final i f15803f = c("SSL_RSA_WITH_RC4_128_SHA");

    /* renamed from: g, reason: collision with root package name */
    public static final i f15804g = c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: h, reason: collision with root package name */
    public static final i f15805h = c("SSL_RSA_WITH_DES_CBC_SHA");
    public static final i i = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: j, reason: collision with root package name */
    public static final i f15806j = c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: k, reason: collision with root package name */
    public static final i f15807k = c("SSL_DHE_DSS_WITH_DES_CBC_SHA");

    /* renamed from: l, reason: collision with root package name */
    public static final i f15808l = c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: m, reason: collision with root package name */
    public static final i f15809m = c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: n, reason: collision with root package name */
    public static final i f15810n = c("SSL_DHE_RSA_WITH_DES_CBC_SHA");

    /* renamed from: o, reason: collision with root package name */
    public static final i f15811o = c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: p, reason: collision with root package name */
    public static final i f15812p = c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: q, reason: collision with root package name */
    public static final i f15813q = c("SSL_DH_anon_WITH_RC4_128_MD5");

    /* renamed from: r, reason: collision with root package name */
    public static final i f15814r = c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: s, reason: collision with root package name */
    public static final i f15815s = c("SSL_DH_anon_WITH_DES_CBC_SHA");

    /* renamed from: t, reason: collision with root package name */
    public static final i f15816t = c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: u, reason: collision with root package name */
    public static final i f15817u = c("TLS_KRB5_WITH_DES_CBC_SHA");

    /* renamed from: v, reason: collision with root package name */
    public static final i f15818v = c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: w, reason: collision with root package name */
    public static final i f15819w = c("TLS_KRB5_WITH_RC4_128_SHA");

    /* renamed from: x, reason: collision with root package name */
    public static final i f15820x = c("TLS_KRB5_WITH_DES_CBC_MD5");

    /* renamed from: y, reason: collision with root package name */
    public static final i f15821y = c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");

    /* renamed from: z, reason: collision with root package name */
    public static final i f15822z = c("TLS_KRB5_WITH_RC4_128_MD5");

    /* renamed from: A, reason: collision with root package name */
    public static final i f15774A = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");

    /* renamed from: B, reason: collision with root package name */
    public static final i f15775B = c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");

    /* renamed from: C, reason: collision with root package name */
    public static final i f15776C = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");

    /* renamed from: D, reason: collision with root package name */
    public static final i f15777D = c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: E, reason: collision with root package name */
    public static final i f15778E = c("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: F, reason: collision with root package name */
    public static final i f15779F = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");

    /* renamed from: G, reason: collision with root package name */
    public static final i f15780G = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: H, reason: collision with root package name */
    public static final i f15781H = c("TLS_DH_anon_WITH_AES_128_CBC_SHA");

    /* renamed from: I, reason: collision with root package name */
    public static final i f15782I = c("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final i J = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");

    /* renamed from: K, reason: collision with root package name */
    public static final i f15783K = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: L, reason: collision with root package name */
    public static final i f15784L = c("TLS_DH_anon_WITH_AES_256_CBC_SHA");

    /* renamed from: M, reason: collision with root package name */
    public static final i f15785M = c("TLS_RSA_WITH_NULL_SHA256");

    /* renamed from: N, reason: collision with root package name */
    public static final i f15786N = c("TLS_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: O, reason: collision with root package name */
    public static final i f15787O = c("TLS_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: P, reason: collision with root package name */
    public static final i f15788P = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");

    /* renamed from: Q, reason: collision with root package name */
    public static final i f15789Q = c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: R, reason: collision with root package name */
    public static final i f15790R = c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: S, reason: collision with root package name */
    public static final i f15791S = c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: T, reason: collision with root package name */
    public static final i f15792T = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: U, reason: collision with root package name */
    public static final i f15793U = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");

    /* renamed from: V, reason: collision with root package name */
    public static final i f15794V = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: W, reason: collision with root package name */
    public static final i f15795W = c("TLS_DH_anon_WITH_AES_128_CBC_SHA256");

    /* renamed from: X, reason: collision with root package name */
    public static final i f15796X = c("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final i Y = c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: Z, reason: collision with root package name */
    public static final i f15797Z = c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    public static final i aa = c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final i ab = c("TLS_PSK_WITH_RC4_128_SHA");
    public static final i ac = c("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final i ad = c("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final i ae = c("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final i af = c("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final i ag = c("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final i ah = c("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final i ai = c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final i aj = c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final i ak = c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final i al = c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final i am = c("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final i an = c("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final i ao = c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final i ap = c("TLS_FALLBACK_SCSV");
    public static final i aq = c("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final i ar = c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final i as = c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final i at = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final i au = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final i av = c("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final i aw = c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final i ax = c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final i ay = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final i az = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final i aA = c("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final i aB = c("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final i aC = c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final i aD = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final i aE = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final i aF = c("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final i aG = c("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final i aH = c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final i aI = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final i aJ = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final i aK = c("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final i aL = c("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final i aM = c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final i aN = c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final i aO = c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final i aP = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final i aQ = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final i aR = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final i aS = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final i aT = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final i aU = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final i aV = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final i aW = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final i aX = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final i aY = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final i aZ = c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final i ba = c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final i bb = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final i bc = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final i bd = c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final i be = c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final i bf = c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final i bg = c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final i bh = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final i bi = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final i bj = c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final i bk = c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    public static final i bl = c("TLS_AES_128_GCM_SHA256");
    public static final i bm = c("TLS_AES_256_GCM_SHA384");
    public static final i bn = c("TLS_CHACHA20_POLY1305_SHA256");
    public static final i bo = c("TLS_AES_128_CCM_SHA256");
    public static final i bp = c("TLS_AES_128_CCM_8_SHA256");

    private i(String str) {
        str.getClass();
        this.bq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i4 = 4; i4 < min; i4++) {
            char charAt = str.charAt(i4);
            char charAt2 = str2.charAt(i4);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    private static i c(String str) {
        i iVar = new i(str);
        br.put(str, iVar);
        return iVar;
    }

    public final String toString() {
        return this.bq;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public static synchronized i a(String str) {
        i iVar;
        String str2;
        synchronized (i.class) {
            try {
                Map<String, i> map = br;
                iVar = map.get(str);
                if (iVar == null) {
                    if (str.startsWith("TLS_")) {
                        str2 = "SSL_" + str.substring(4);
                    } else if (str.startsWith("SSL_")) {
                        str2 = "TLS_" + str.substring(4);
                    } else {
                        str2 = str;
                    }
                    iVar = map.get(str2);
                    if (iVar == null) {
                        iVar = new i(str);
                    }
                    map.put(str, iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static List<i> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private String a() {
        return this.bq;
    }
}
