package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
final class cl_45 {
    public int a = -1;
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();
    public MessageDigest c;
    public MessageDigest d;
    public MessageDigest e;
    public MessageDigest f;
    public final int g;

    public cl_45(boolean z) {
        this.g = z ? 3 : 2;
    }

    public final void a() {
        if (this.a == -1) {
            this.b.reset();
        } else {
            kbs.g("reset() can be only be called before protocolDetermined");
        }
    }

    public final void b(cl_11 cl_11Var) {
        String g = cl_11Var.g();
        int i = this.g;
        this.c = cl_19.a(i, g);
        this.d = cl_19.a(i, JCP.GOST_DIGEST_NAME);
        this.e = cl_19.a(i, JCP.GOST_DIGEST_2012_256_NAME);
        this.f = cl_19.a(i, JCP.GOST_DIGEST_2012_512_NAME);
    }

    public final void c(cl_84 cl_84Var, cl_8 cl_8Var) {
        if (this.a != -1) {
            return;
        }
        cl_11 cl_11Var = cl_8Var.w;
        boolean z = cl_11Var == cl_11.q || (cl_11Var == cl_11.r || cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u);
        int i = cl_84Var.compareTo(cl_84.z) >= 0 ? 2 : 1;
        this.a = i;
        ByteArrayOutputStream byteArrayOutputStream = this.b;
        if (i == 1) {
            if (z) {
                try {
                    b(cl_11Var);
                } catch (NoSuchAlgorithmException e) {
                    ny61.n("Algorithm MD5 or SHA or GOST R 34.11 not available", e);
                    return;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            d(0, byteArray.length, byteArray);
            return;
        }
        if (i == 2 && z) {
            try {
                b(cl_11Var);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                d(0, byteArray2.length, byteArray2);
            } catch (NoSuchAlgorithmException e2) {
                ny61.n("Algorithm GOST R 34.11 not available", e2);
            }
        }
    }

    public final void d(int i, int i2, byte[] bArr) {
        MessageDigest messageDigest = this.c;
        if (messageDigest != null) {
            messageDigest.update(bArr, i, i2);
        }
        MessageDigest messageDigest2 = this.d;
        if (messageDigest2 != null) {
            messageDigest2.update(bArr, i, i2);
        }
        MessageDigest messageDigest3 = this.e;
        if (messageDigest3 != null) {
            messageDigest3.update(bArr, i, i2);
        }
        MessageDigest messageDigest4 = this.f;
        if (messageDigest4 != null) {
            messageDigest4.update(bArr, i, i2);
        }
    }
}
