package ru.CryptoPro.ssl;

import java.util.ArrayList;

/* loaded from: classes4.dex */
final class cl_36 {
    public static final ArrayList c = new ArrayList(14);
    public static final cl_36 d = a(0, "server_name");
    public static final cl_36 e;
    public static final cl_36 f;
    public static final cl_36 g;
    public static final cl_36 h;
    public static final cl_36 i;
    public static final cl_36 j;
    public static final cl_36 k;
    public static final cl_36 l;
    public final int a;
    public final String b;

    static {
        a(1, "max_fragment_length");
        a(2, "client_certificate_url");
        a(3, "trusted_ca_keys");
        a(4, "truncated_hmac");
        a(5, "status_request");
        a(6, "user_mapping");
        a(9, "cert_type");
        e = a(10, "elliptic_curves");
        f = a(11, "ec_point_formats");
        a(12, "srp");
        g = a(13, "signature_algorithms");
        h = a(16, "application_layer_protocol_negotiation");
        i = a(23, "extended_master_secret");
        j = a(35, "session_ticket");
        k = a(65281, "renegotiation_info");
        l = a(65000, "ext_hash_and_mac_alg_select");
    }

    public cl_36(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    public static cl_36 a(int i2, String str) {
        cl_36 cl_36Var = new cl_36(i2, str);
        c.add(cl_36Var);
        return cl_36Var;
    }

    public String toString() {
        return this.b;
    }
}
