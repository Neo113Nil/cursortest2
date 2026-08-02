package ru.CryptoPro.ssl.util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class AlgorithmDecomposer {
    public static final Pattern a = Pattern.compile("/");
    public static final Pattern b = Pattern.compile("with|and", 2);

    public Set decompose(String str) {
        if (str == null || str.length() == 0) {
            return new HashSet();
        }
        String[] split = a.split(str);
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            if (str2 != null && str2.length() != 0) {
                for (String str3 : b.split(str2)) {
                    if (str3 != null && str3.length() != 0) {
                        hashSet.add(str3);
                    }
                }
            }
        }
        if (hashSet.contains(JCP.DIGEST_SHA1) && !hashSet.contains("SHA-1")) {
            hashSet.add("SHA-1");
        }
        if (hashSet.contains("SHA-1") && !hashSet.contains(JCP.DIGEST_SHA1)) {
            hashSet.add(JCP.DIGEST_SHA1);
        }
        if (hashSet.contains(JCP.DIGEST_SHA224) && !hashSet.contains(JCP.DIGEST_SHA_224)) {
            hashSet.add(JCP.DIGEST_SHA_224);
        }
        if (hashSet.contains(JCP.DIGEST_SHA_224) && !hashSet.contains(JCP.DIGEST_SHA224)) {
            hashSet.add(JCP.DIGEST_SHA224);
        }
        if (hashSet.contains(JCP.DIGEST_SHA256) && !hashSet.contains(JCP.DIGEST_SHA_256)) {
            hashSet.add(JCP.DIGEST_SHA_256);
        }
        if (hashSet.contains(JCP.DIGEST_SHA_256) && !hashSet.contains(JCP.DIGEST_SHA256)) {
            hashSet.add(JCP.DIGEST_SHA256);
        }
        if (hashSet.contains(JCP.DIGEST_SHA384) && !hashSet.contains(JCP.DIGEST_SHA_384)) {
            hashSet.add(JCP.DIGEST_SHA_384);
        }
        if (hashSet.contains(JCP.DIGEST_SHA_384) && !hashSet.contains(JCP.DIGEST_SHA384)) {
            hashSet.add(JCP.DIGEST_SHA384);
        }
        if (hashSet.contains(JCP.DIGEST_SHA512) && !hashSet.contains(JCP.DIGEST_SHA_512)) {
            hashSet.add(JCP.DIGEST_SHA_512);
        }
        if (hashSet.contains(JCP.DIGEST_SHA_512) && !hashSet.contains(JCP.DIGEST_SHA512)) {
            hashSet.add(JCP.DIGEST_SHA512);
        }
        return hashSet;
    }
}
