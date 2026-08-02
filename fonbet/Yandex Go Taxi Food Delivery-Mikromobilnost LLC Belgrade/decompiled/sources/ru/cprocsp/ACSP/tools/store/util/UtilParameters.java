package ru.cprocsp.ACSP.tools.store.util;

import defpackage.izh0;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;

/* loaded from: classes4.dex */
public class UtilParameters {
    private static final Map<String, String> signatureOidList = new HashMap<String, String>() { // from class: ru.cprocsp.ACSP.tools.store.util.UtilParameters.1
        {
            put(JCP.GOST_EL_2012_256_NAME, "1.2.643.7.1.1.1.1");
            put(JCP.GOST_DH_2012_256_NAME, "1.2.643.7.1.1.6.1");
            put(JCP.GOST_EL_2012_512_NAME, "1.2.643.7.1.1.1.2");
            put(JCP.GOST_DH_2012_512_NAME, "1.2.643.7.1.1.6.2");
        }
    };
    private static final Map<String, String> signatureAlgList = new HashMap<String, String>() { // from class: ru.cprocsp.ACSP.tools.store.util.UtilParameters.2
        {
            put(JCP.GOST_EL_DEGREE_NAME, "GOST3411withGOST3410EL");
            put("GOST3410DHEL", "GOST3411withGOST3410EL");
            put(JCP.GOST_EL_2012_256_NAME, JCP.GOST_SIGN_2012_256_NAME);
            put(JCP.GOST_DH_2012_256_NAME, JCP.GOST_SIGN_2012_256_NAME);
            put(JCP.GOST_EL_2012_512_NAME, JCP.GOST_SIGN_2012_512_NAME);
            put(JCP.GOST_DH_2012_512_NAME, JCP.GOST_SIGN_2012_512_NAME);
        }
    };
    private static final Map<String, Integer> keyAlgorithmDescriptionIdList = new HashMap<String, Integer>() { // from class: ru.cprocsp.ACSP.tools.store.util.UtilParameters.3
        {
            put(JCP.GOST_EL_DEGREE_NAME, Integer.valueOf(izh0.MNKeyAlgorithmList_2001));
            put("GOST3410DHEL", Integer.valueOf(izh0.MNKeyAlgorithmList_2001));
            put(JCP.GOST_EL_2012_256_NAME, Integer.valueOf(izh0.MNKeyAlgorithmList_2012_256));
            put(JCP.GOST_DH_2012_256_NAME, Integer.valueOf(izh0.MNKeyAlgorithmList_2012_256_DH));
            put(JCP.GOST_EL_2012_512_NAME, Integer.valueOf(izh0.MNKeyAlgorithmList_2012_512));
            put(JCP.GOST_DH_2012_512_NAME, Integer.valueOf(izh0.MNKeyAlgorithmList_2012_512_DH));
        }
    };

    public static AlgIdSpec getKeyAlgSpec(String str, String str2) {
        Map<String, String> map = signatureOidList;
        return map.containsKey(str) ? new NameAlgIdSpec(map.get(str), str2) : str.equalsIgnoreCase("GOST3410DHEL") ? new NameAlgIdSpec(AlgIdSpec.getDHDefault(), str2) : new NameAlgIdSpec(str2);
    }

    public static String getKeyAlgorithmByIndex(int i, boolean z) {
        return i != 1 ? i != 2 ? z ? "GOST3410DHEL" : JCP.GOST_EL_DEGREE_NAME : z ? JCP.GOST_DH_2012_512_NAME : JCP.GOST_EL_2012_512_NAME : z ? JCP.GOST_DH_2012_256_NAME : JCP.GOST_EL_2012_256_NAME;
    }

    public static Integer getKeyAlgorithmDescriptionByKeyAlgorithm(String str) {
        Map<String, Integer> map = keyAlgorithmDescriptionIdList;
        return map.containsKey(str) ? map.get(str) : map.get(JCP.GOST_EL_DEGREE_NAME);
    }

    public static String getSignatureAlgorithmByKeyAlgorithm(String str) {
        Map<String, String> map = signatureAlgList;
        return map.containsKey(str) ? map.get(str) : map.get(JCP.GOST_EL_DEGREE_NAME);
    }
}
