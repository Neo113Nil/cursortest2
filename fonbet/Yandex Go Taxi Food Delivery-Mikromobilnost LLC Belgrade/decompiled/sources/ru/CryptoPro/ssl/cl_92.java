package ru.CryptoPro.ssl;

import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.ssl.util.AlgorithmDecomposer;

/* loaded from: classes4.dex */
class cl_92 extends AlgorithmDecomposer {
    public final boolean c;

    public cl_92(boolean z) {
        this.c = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ru.CryptoPro.ssl.util.AlgorithmDecomposer
    public Set decompose(String str) {
        cl_8 cl_8Var;
        String str2;
        String str3;
        if (str.startsWith("SSL_") || str.startsWith("TLS_")) {
            try {
                cl_8Var = cl_8.c(str);
            } catch (IllegalArgumentException unused) {
                cl_8Var = null;
            }
            if (cl_8Var != null) {
                cl_11 cl_11Var = cl_8Var.w;
                cl_9 cl_9Var = cl_8Var.x;
                cl_12 cl_12Var = cl_8Var.y;
                HashSet hashSet = new HashSet();
                boolean z = this.c;
                if (cl_11Var != null) {
                    HashSet hashSet2 = new HashSet();
                    int i = cl_93.a[cl_11Var.ordinal()];
                    String str4 = "RSA";
                    switch (i) {
                        case 1:
                            if (!z) {
                                str4 = "K_NULL";
                                hashSet2.add(str4);
                                break;
                            }
                            break;
                        case 2:
                            hashSet2.add(str4);
                            break;
                        case 3:
                            hashSet2.add("RSA");
                            str4 = "RSA_EXPORT";
                            hashSet2.add(str4);
                            break;
                        case 4:
                            hashSet2.add("RSA");
                            hashSet2.add("DH");
                            hashSet2.add("DiffieHellman");
                            str4 = "DH_RSA";
                            hashSet2.add(str4);
                            break;
                        case 5:
                            hashSet2.add("DSA");
                            hashSet2.add("DSS");
                            hashSet2.add("DH");
                            hashSet2.add("DiffieHellman");
                            str4 = "DH_DSS";
                            hashSet2.add(str4);
                            break;
                        case 6:
                            hashSet2.add("DSA");
                            hashSet2.add("DSS");
                            hashSet2.add("DH");
                            hashSet2.add("DHE");
                            hashSet2.add("DiffieHellman");
                            str4 = "DHE_DSS";
                            hashSet2.add(str4);
                            break;
                        case 7:
                            hashSet2.add("RSA");
                            hashSet2.add("DH");
                            hashSet2.add("DHE");
                            hashSet2.add("DiffieHellman");
                            str4 = "DHE_RSA";
                            hashSet2.add(str4);
                            break;
                        case 8:
                            if (!z) {
                                hashSet2.add("ANON");
                                hashSet2.add("DH");
                                hashSet2.add("DiffieHellman");
                                str4 = "DH_ANON";
                                hashSet2.add(str4);
                                break;
                            }
                            break;
                        case 9:
                            hashSet2.add(JCP.ECDH_NAME);
                            hashSet2.add(JCP.ECDSA_NAME);
                            str4 = "ECDH_ECDSA";
                            hashSet2.add(str4);
                            break;
                        case 10:
                            hashSet2.add(JCP.ECDH_NAME);
                            hashSet2.add("RSA");
                            str4 = "ECDH_RSA";
                            hashSet2.add(str4);
                            break;
                        case 11:
                            hashSet2.add("ECDHE");
                            hashSet2.add(JCP.ECDSA_NAME);
                            str4 = "ECDHE_ECDSA";
                            hashSet2.add(str4);
                            break;
                        case 12:
                            hashSet2.add("ECDHE");
                            hashSet2.add("RSA");
                            str4 = "ECDHE_RSA";
                            hashSet2.add(str4);
                            break;
                        case 13:
                            if (!z) {
                                hashSet2.add(JCP.ECDH_NAME);
                                hashSet2.add("ANON");
                                str4 = "ECDH_ANON";
                                hashSet2.add(str4);
                                break;
                            }
                            break;
                        case 14:
                            if (!z) {
                                str4 = "KRB5";
                                hashSet2.add(str4);
                                break;
                            }
                            break;
                        case 15:
                            if (!z) {
                                str4 = "KRB5_EXPORT";
                                hashSet2.add(str4);
                                break;
                            }
                            break;
                        case 16:
                        case 17:
                            hashSet2.add("GR3410");
                            str4 = "GR3410_2012_256";
                            hashSet2.add(str4);
                            break;
                    }
                    hashSet.addAll(hashSet2);
                }
                if (!z) {
                    if (cl_9Var != null) {
                        HashSet hashSet3 = new HashSet();
                        hashSet3.addAll(super.decompose(cl_9Var.b));
                        if (cl_9Var == cl_8.H) {
                            str3 = "C_NULL";
                        } else if (cl_9Var == cl_8.J) {
                            str3 = "RC2_CBC_40";
                        } else if (cl_9Var == cl_8.I) {
                            str3 = "RC4_40";
                        } else if (cl_9Var == cl_8.L) {
                            str3 = "RC4_128";
                        } else if (cl_9Var == cl_8.K) {
                            hashSet3.add("DES40_CBC");
                            str3 = "DES_CBC_40";
                        } else if (cl_9Var == cl_8.M) {
                            str3 = "DES_CBC";
                        } else if (cl_9Var == cl_8.N) {
                            str3 = "3DES_EDE_CBC";
                        } else if (cl_9Var == cl_8.O) {
                            str3 = "AES_128_CBC";
                        } else {
                            if (cl_9Var == cl_8.P) {
                                str3 = "AES_256_CBC";
                            }
                            hashSet.addAll(hashSet3);
                        }
                        hashSet3.add(str3);
                        hashSet.addAll(hashSet3);
                    }
                    if (cl_12Var != null) {
                        HashSet hashSet4 = new HashSet();
                        if (cl_12Var == cl_8.Q && cl_9Var.k != cl_10.c) {
                            str2 = "M_NULL";
                        } else if (cl_12Var == cl_8.R) {
                            hashSet4.add("MD5");
                            str2 = "HmacMD5";
                        } else if (cl_12Var == cl_8.S) {
                            hashSet4.add(JCP.DIGEST_SHA1);
                            hashSet4.add("SHA-1");
                            str2 = "HmacSHA1";
                        } else if (cl_12Var == cl_8.T) {
                            hashSet4.add(JCP.DIGEST_SHA256);
                            hashSet4.add(JCP.DIGEST_SHA_256);
                            str2 = "HmacSHA256";
                        } else {
                            if (cl_12Var == cl_8.U) {
                                hashSet4.add(JCP.DIGEST_SHA384);
                                hashSet4.add(JCP.DIGEST_SHA_384);
                                str2 = "HmacSHA384";
                            }
                            hashSet.addAll(hashSet4);
                        }
                        hashSet4.add(str2);
                        hashSet.addAll(hashSet4);
                    }
                }
                return hashSet;
            }
        }
        return super.decompose(str);
    }
}
