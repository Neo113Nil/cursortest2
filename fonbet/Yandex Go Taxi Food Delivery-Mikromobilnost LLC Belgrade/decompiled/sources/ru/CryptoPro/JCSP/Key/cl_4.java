package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCSP.Key.AlgorithmGroups;

/* loaded from: classes4.dex */
/* synthetic */ class cl_4 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AlgorithmGroups.KeyAlgorithmGroup.values().length];
        a = iArr;
        try {
            iArr[AlgorithmGroups.KeyAlgorithmGroup.ECDSA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[AlgorithmGroups.KeyAlgorithmGroup.EDDSA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[AlgorithmGroups.KeyAlgorithmGroup.RSA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
