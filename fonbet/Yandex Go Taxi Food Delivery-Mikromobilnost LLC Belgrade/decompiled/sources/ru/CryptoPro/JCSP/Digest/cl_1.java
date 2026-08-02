package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public abstract class cl_1 extends GostDigest {
    public cl_1(int i, KeyInterface keyInterface, String str) {
        super(i, keyInterface, str);
    }

    public cl_1(String str, int i) {
        super(str, i);
    }

    public cl_1(cl_1 cl_1Var, String str) {
        super(cl_1Var, str);
    }
}
