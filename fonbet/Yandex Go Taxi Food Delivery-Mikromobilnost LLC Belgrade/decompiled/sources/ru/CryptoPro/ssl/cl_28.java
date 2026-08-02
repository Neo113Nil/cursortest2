package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.oyr;
import java.util.ArrayList;

/* loaded from: classes4.dex */
final class cl_28 extends cl_66 {
    public static final cl_28 f = new cl_28(new byte[]{0});
    public final byte[] e;

    public cl_28(cl_46 cl_46Var) {
        super(cl_36.f);
        byte[] n = cl_46Var.n();
        this.e = n;
        for (byte b : n) {
            if (b == 0) {
                return;
            }
        }
        dy31.m("Peer does not support uncompressed points");
        throw null;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        byte[] bArr = this.e;
        cl_62Var.e(bArr.length + 1);
        cl_62Var.d(bArr);
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return this.e.length + 5;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        ArrayList arrayList = new ArrayList();
        for (byte b : this.e) {
            int i = b & 255;
            arrayList.add(i != 0 ? i != 1 ? i != 2 ? oyr.i(i, "unknown-") : "ansiX962_compressed_char2" : "ansiX962_compressed_prime" : "uncompressed");
        }
        return "Extension " + this.d + ", formats: " + arrayList;
    }

    public cl_28(byte[] bArr) {
        super(cl_36.f);
        this.e = bArr;
    }
}
