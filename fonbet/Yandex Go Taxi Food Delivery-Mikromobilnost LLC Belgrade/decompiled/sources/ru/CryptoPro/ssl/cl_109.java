package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.oyr;
import java.security.AlgorithmConstraints;
import java.security.CryptoPrimitive;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.util.KeyUtil;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_109 {
    public static final Set e = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.SIGNATURE));
    public static final SortedMap f;
    public static final SortedMap g;
    public static final SortedMap h;
    public static final SortedMap i;
    public cl_110 a;
    public int b;
    public String c;
    public int d;

    static {
        SortedMap synchronizedSortedMap = Collections.synchronizedSortedMap(new TreeMap());
        f = synchronizedSortedMap;
        g = Collections.synchronizedSortedMap(new TreeMap());
        h = Collections.synchronizedSortedMap(new TreeMap());
        i = Collections.synchronizedSortedMap(new TreeMap());
        synchronized (synchronizedSortedMap) {
            try {
                cl_110 cl_110Var = cl_110.c;
                cl_111 cl_111Var = cl_111.RSA;
                e(cl_110Var, cl_111Var, "MD5withRSA", 239, false, false);
                cl_110 cl_110Var2 = cl_110.d;
                e(cl_110Var2, cl_111.DSA, "SHA1withDSA", 238, false, false);
                e(cl_110Var2, cl_111Var, JCP.SIGN_SHA1_RSA_NAME, 237, false, false);
                cl_111 cl_111Var2 = cl_111.ECDSA;
                e(cl_110Var2, cl_111Var2, JCP.SIGN_SHA1_ECDSA_NAME, 236, false, false);
                cl_110 cl_110Var3 = cl_110.e;
                e(cl_110Var3, cl_111Var, JCP.SIGN_SHA224_RSA_NAME, 235, false, false);
                e(cl_110Var3, cl_111Var2, JCP.SIGN_SHA224_ECDSA_NAME, MSException.ERROR_MORE_DATA, false, false);
                cl_110 cl_110Var4 = cl_110.f;
                e(cl_110Var4, cl_111Var, JCP.SIGN_SHA256_RSA_NAME, 233, false, false);
                e(cl_110Var4, cl_111Var2, JCP.SIGN_SHA256_ECDSA_NAME, 232, false, false);
                cl_110 cl_110Var5 = cl_110.g;
                e(cl_110Var5, cl_111Var, JCP.SIGN_SHA384_RSA_NAME, 231, false, false);
                e(cl_110Var5, cl_111Var2, JCP.SIGN_SHA384_ECDSA_NAME, 230, false, false);
                cl_110 cl_110Var6 = cl_110.h;
                e(cl_110Var6, cl_111Var, JCP.SIGN_SHA512_RSA_NAME, 229, false, false);
                int i2 = 228;
                e(cl_110Var6, cl_111Var2, JCP.SIGN_SHA512_ECDSA_NAME, 228, false, false);
                if (cpSSLConfig.isUseNewTLS()) {
                    cl_110 cl_110Var7 = cl_110.l;
                    e(cl_110Var7, cl_111.GOST3410_2012_256_IANA, JCP.GOST_SIGN_2012_256_NAME, 227, true, true);
                    e(cl_110Var7, cl_111.GOST3410_2012_512_IANA, JCP.GOST_SIGN_2012_512_NAME, 226, true, true);
                    i2 = 226;
                }
                e(cl_110.i, cl_111.GR3410, "GOST3411withGOST3410EL", i2 - 1, true, false);
                e(cl_110.k, cl_111.GR3410_2012_512, JCP.GOST_SIGN_2012_512_NAME, i2 - 2, true, false);
                e(cl_110.j, cl_111.GR3410_2012_256, JCP.GOST_SIGN_2012_256_NAME, i2 - 3, true, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList b(AlgorithmConstraints algorithmConstraints, Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            cl_109 cl_109Var = (cl_109) it.next();
            if (cl_109Var.d <= 240) {
                if (algorithmConstraints.permits(e, cl_109Var.c, null)) {
                    arrayList.add(cl_109Var);
                }
            }
        }
        return arrayList;
    }

    public static cl_109 c(int i2, int i3, int i4) {
        int i5 = i2 & 255;
        int i6 = i3 & 255;
        int i7 = (i5 << 8) | i6;
        cl_109 cl_109Var = (cl_109) f.get(Integer.valueOf(i7));
        if (cl_109Var == null) {
            String str = "Unknown (hash:0x" + Integer.toString(i5, 16) + ", signature:0x" + Integer.toString(i6, 16) + Extension.C_BRAKE;
            cl_109Var = new cl_109();
            int i8 = (i7 >> 8) & 255;
            cl_110 cl_110Var = cl_110.a;
            if (i8 != 8) {
                switch (i8) {
                    case 0:
                        cl_110Var = cl_110.b;
                        break;
                    case 1:
                        cl_110Var = cl_110.c;
                        break;
                    case 2:
                        cl_110Var = cl_110.d;
                        break;
                    case 3:
                        cl_110Var = cl_110.e;
                        break;
                    case 4:
                        cl_110Var = cl_110.f;
                        break;
                    case 5:
                        cl_110Var = cl_110.g;
                        break;
                    case 6:
                        cl_110Var = cl_110.h;
                        break;
                    default:
                        switch (i8) {
                            case 237:
                                cl_110Var = cl_110.i;
                                break;
                            case 238:
                                cl_110Var = cl_110.j;
                                break;
                            case 239:
                                cl_110Var = cl_110.k;
                                break;
                        }
                }
            } else {
                cl_110Var = cl_110.l;
            }
            cl_109Var.a = cl_110Var;
            cl_109Var.c = str;
            cl_109Var.b = i7;
            cl_109Var.d = i4 + 241;
        }
        return cl_109Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cl_109 d(Collection collection, String str, PrivateKey privateKey) {
        int i2;
        Iterator it;
        cl_110 cl_110Var;
        if (str == null && !collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                cl_109 cl_109Var = (cl_109) it2.next();
                if (cl_109Var.d <= 240) {
                    return cl_109Var;
                }
            }
            return null;
        }
        if (str == null) {
            return null;
        }
        if (privateKey != null && "rsa".equalsIgnoreCase(privateKey.getAlgorithm()) && str.equalsIgnoreCase("rsa")) {
            int keySize = KeyUtil.getKeySize(privateKey);
            if (keySize >= 768) {
                cl_110Var = cl_110.h;
            } else if (keySize >= 512 && keySize < 768) {
                cl_110Var = cl_110.f;
            } else if (keySize > 0 && keySize < 512) {
                cl_110Var = cl_110.d;
            }
            i2 = cl_110Var.p;
            it = collection.iterator();
            while (it.hasNext()) {
                cl_109 cl_109Var2 = (cl_109) it.next();
                int i3 = cl_109Var2.b & 255;
                if (!str.equalsIgnoreCase("rsa") || i3 != cl_111.RSA.l) {
                    if (str.equalsIgnoreCase("dsa")) {
                        if (i3 == cl_111.DSA.l) {
                            return cl_109Var2;
                        }
                    }
                    if (str.equalsIgnoreCase("ecdsa")) {
                        if (i3 == cl_111.ECDSA.l) {
                            return cl_109Var2;
                        }
                    }
                    if (str.equalsIgnoreCase("ec")) {
                        if (i3 == cl_111.ECDSA.l) {
                            return cl_109Var2;
                        }
                    }
                    String resolveSignatureAlgorithmByKeyAlgorithm = ParamUtil.resolveSignatureAlgorithmByKeyAlgorithm(str);
                    if (resolveSignatureAlgorithmByKeyAlgorithm != null && cl_109Var2.c.equalsIgnoreCase(resolveSignatureAlgorithmByKeyAlgorithm)) {
                        return cl_109Var2;
                    }
                } else if (cl_109Var2.a.p <= i2) {
                    return cl_109Var2;
                }
            }
            return null;
        }
        i2 = Integer.MAX_VALUE;
        it = collection.iterator();
        while (it.hasNext()) {
        }
        return null;
    }

    public static void e(cl_110 cl_110Var, cl_111 cl_111Var, String str, int i2, boolean z, boolean z2) {
        cl_109 cl_109Var = new cl_109();
        cl_109Var.a = cl_110Var;
        cl_109Var.c = str;
        int i3 = ((cl_110Var.o & 255) << 8) | (cl_111Var.l & 255);
        cl_109Var.b = i3;
        cl_109Var.d = i2;
        if (f.put(Integer.valueOf(i3), cl_109Var) != null) {
            kbs.g(oyr.i(i3, "Duplicate SignatureAndHashAlgorithm definition, id: "));
            return;
        }
        if (g.put(Integer.valueOf(i2), cl_109Var) != null) {
            kbs.g(oyr.i(i2, "Duplicate SignatureAndHashAlgorithm definition, priority: "));
        } else if (z) {
            i.put(Integer.valueOf(i3), cl_109Var);
            if (z2) {
                return;
            }
            h.put(Integer.valueOf(i3), cl_109Var);
        }
    }

    public static String[] f(Collection collection) {
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((cl_109) it.next()).c);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static HashSet g(Collection collection) {
        HashSet hashSet = new HashSet();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cl_110 cl_110Var = ((cl_109) it.next()).a;
                if (cl_110Var.o > 0) {
                    hashSet.add(cl_110Var.n);
                }
            }
        }
        return hashSet;
    }

    public final int a() {
        return (this.b >> 8) & 255;
    }
}
