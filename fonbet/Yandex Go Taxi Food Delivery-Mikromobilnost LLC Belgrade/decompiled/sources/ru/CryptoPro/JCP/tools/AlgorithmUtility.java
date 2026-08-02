package ru.CryptoPro.JCP.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class AlgorithmUtility {
    public static final Map MAP_REPLACING_DIGEST_ALGORITHMS;
    public static final Map MAP_REPLACING_KEY_ALGORITHMS;
    public static final Vector MAP_REPLACING_KEY_NAMES;
    public static final Vector MAP_REPLACING_SIGNATURE_ALGORITHMS;
    public static final ArrayList a;
    public static final ArrayList b;
    public static final ArrayList c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MAP_REPLACING_DIGEST_ALGORITHMS = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        MAP_REPLACING_KEY_ALGORITHMS = linkedHashMap2;
        Vector vector = new Vector();
        MAP_REPLACING_SIGNATURE_ALGORITHMS = vector;
        Vector vector2 = new Vector();
        MAP_REPLACING_KEY_NAMES = vector2;
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        c = arrayList3;
        linkedHashMap.put("1.2.643.2.2.9", JCP.GOST_DIGEST_NAME);
        linkedHashMap.put("1.2.643.7.1.1.2.2", JCP.GOST_DIGEST_2012_256_NAME);
        linkedHashMap.put("1.2.643.7.1.1.2.3", JCP.GOST_DIGEST_2012_512_NAME);
        linkedHashMap2.put("1.2.643.2.2.98", "GOST3410DHEL");
        linkedHashMap2.put("1.2.643.2.2.19", JCP.GOST_EL_DEGREE_NAME);
        linkedHashMap2.put("1.2.643.7.1.1.1.1", JCP.GOST_EL_2012_256_NAME);
        linkedHashMap2.put("1.2.643.7.1.1.6.1", JCP.GOST_DH_2012_256_NAME);
        linkedHashMap2.put("1.2.643.7.1.1.1.2", JCP.GOST_EL_2012_512_NAME);
        linkedHashMap2.put("1.2.643.7.1.1.6.2", JCP.GOST_DH_2012_512_NAME);
        vector.add("1.2.643.2.2.3");
        vector.add("1.2.643.7.1.1.3.2");
        vector.add("1.2.643.7.1.1.3.3");
        vector2.add(JCP.GOST_EL_DEGREE_NAME);
        vector2.add("GOST3410DHEL");
        vector2.add(JCP.GOST_EL_2012_256_NAME);
        vector2.add(JCP.GOST_DH_2012_256_NAME);
        vector2.add(JCP.GOST_EL_2012_512_NAME);
        vector2.add(JCP.GOST_DH_2012_512_NAME);
        arrayList.add("1.2.643.2.2.98");
        arrayList.add("1.2.643.2.2.19");
        arrayList2.add("1.2.643.7.1.1.1.1");
        arrayList2.add("1.2.643.7.1.1.6.1");
        arrayList3.add("1.2.643.7.1.1.1.2");
        arrayList3.add("1.2.643.7.1.1.6.2");
    }

    public static String digestAlgToDigestOid(String str) {
        String str2 = "1.2.643.7.1.1.2.2";
        if (!str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME) && !str.equalsIgnoreCase("1.2.643.7.1.1.2.2")) {
            str2 = "1.2.643.7.1.1.2.3";
            if (!str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME) && !str.equalsIgnoreCase("1.2.643.7.1.1.2.3")) {
                return "1.2.643.2.2.9";
            }
        }
        return str2;
    }

    public static String digestAlgToSignatureOid(String str) {
        return (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.2.2")) ? "1.2.643.7.1.1.3.2" : (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.2.3")) ? "1.2.643.7.1.1.3.3" : "1.2.643.2.2.3";
    }

    public static String digestOidToKeyAlgorithmOid(String str) {
        return str.equalsIgnoreCase("1.2.643.7.1.1.2.2") ? "1.2.643.7.1.1.1.1" : str.equalsIgnoreCase("1.2.643.7.1.1.2.3") ? "1.2.643.7.1.1.1.2" : "1.2.643.2.2.19";
    }

    public static String keyAlgToDigestOid(String str) {
        return (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.1.1") || str.equalsIgnoreCase("1.2.643.7.1.1.6.1")) ? "1.2.643.7.1.1.2.2" : (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.1.2") || str.equalsIgnoreCase("1.2.643.7.1.1.6.2")) ? "1.2.643.7.1.1.2.3" : "1.2.643.2.2.9";
    }

    public static String keyAlgToKeyAlgorithmOid(String str) {
        return (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? "1.2.643.7.1.1.1.1" : (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? "1.2.643.7.1.1.1.2" : "1.2.643.2.2.19";
    }

    public static List keyAlgToKeyAlgorithmOidAdES(String str) {
        return Collections.unmodifiableList((str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? b : (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? c : a);
    }

    public static String keyAlgToSignatureOid(String str) {
        return (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.1.1") || str.equalsIgnoreCase("1.2.643.7.1.1.6.1")) ? "1.2.643.7.1.1.3.2" : (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) || str.equalsIgnoreCase("1.2.643.7.1.1.1.2") || str.equalsIgnoreCase("1.2.643.7.1.1.6.2")) ? "1.2.643.7.1.1.3.3" : "1.2.643.2.2.3";
    }

    public static String signAlgToSignatureOid(String str) {
        String str2 = "1.2.643.7.1.1.3.2";
        if (!str.equalsIgnoreCase("1.2.643.7.1.1.3.2") && !str.equalsIgnoreCase(JCP.GOST_SIGN_2012_256_NAME)) {
            str2 = "1.2.643.7.1.1.3.3";
            if (!str.equalsIgnoreCase("1.2.643.7.1.1.3.3") && !str.equalsIgnoreCase(JCP.GOST_SIGN_2012_512_NAME)) {
                return "1.2.643.2.2.3";
            }
        }
        return str2;
    }

    public static String signOidToSignatureAlgorithm(String str) {
        boolean equalsIgnoreCase = str.equalsIgnoreCase("1.2.643.7.1.1.3.2");
        String str2 = JCP.GOST_SIGN_2012_256_NAME;
        if (!equalsIgnoreCase && !str.equalsIgnoreCase(JCP.GOST_SIGN_2012_256_NAME)) {
            boolean equalsIgnoreCase2 = str.equalsIgnoreCase("1.2.643.7.1.1.3.3");
            str2 = JCP.GOST_SIGN_2012_512_NAME;
            if (!equalsIgnoreCase2 && !str.equalsIgnoreCase(JCP.GOST_SIGN_2012_512_NAME)) {
                return "GOST3411withGOST3410EL";
            }
        }
        return str2;
    }
}
