package ru.CryptoPro.ssl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCPRequest.KeyUsage;

/* loaded from: classes4.dex */
enum cl_118 {
    a(Collections.EMPTY_SET),
    b(new HashSet(Arrays.asList("2.5.29.37.0", "1.3.6.1.5.5.7.3.2"))),
    c(new HashSet(Arrays.asList("2.5.29.37.0", KeyUsage.STR_OID_PKIX_SERVER_AUTH, "2.16.840.1.113730.4.1", "1.3.6.1.4.1.311.10.3.3")));

    final Set d;

    cl_118(Set set) {
        this.d = set;
    }

    public String b() {
        return this == b ? "tls client" : this == c ? "tls server" : "generic";
    }
}
