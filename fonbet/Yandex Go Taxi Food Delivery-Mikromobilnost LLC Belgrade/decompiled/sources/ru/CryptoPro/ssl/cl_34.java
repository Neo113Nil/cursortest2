package ru.CryptoPro.ssl;

import java.security.KeyPair;

/* loaded from: classes4.dex */
class cl_34 {
    public KeyPair a;
    public int b;
    public final long c = System.currentTimeMillis() + 3600000;

    public cl_34(KeyPair keyPair) {
        this.a = keyPair;
    }

    public static KeyPair a(cl_34 cl_34Var) {
        if (cl_34Var.a == null || cl_34Var.b >= 200 || System.currentTimeMillis() >= cl_34Var.c) {
            cl_34Var.a = null;
            return null;
        }
        cl_34Var.b++;
        return cl_34Var.a;
    }
}
