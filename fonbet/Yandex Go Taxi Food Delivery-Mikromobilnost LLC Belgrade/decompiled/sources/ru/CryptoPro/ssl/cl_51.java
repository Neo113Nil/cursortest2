package ru.CryptoPro.ssl;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class cl_51 extends cl_47 {
    public static final byte[] h = {0};
    public cl_84 b;
    public cl_87 c;
    public cl_106 d;
    public cl_14 e;
    public byte[] f;
    public cl_67 g;

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_84 cl_84Var = this.b;
        cl_62Var.a(cl_84Var.o);
        cl_62Var.a(cl_84Var.p);
        int i = 0;
        cl_62Var.write(this.c.a, 0, 32);
        cl_62Var.d(this.d.b());
        AbstractCollection abstractCollection = this.e.a;
        byte[] bArr = new byte[abstractCollection.size() * 2];
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            int i2 = ((cl_8) it.next()).b;
            bArr[i] = (byte) (i2 >> 8);
            bArr[i + 1] = (byte) i2;
            i += 2;
        }
        cl_62Var.b(bArr);
        cl_62Var.d(this.f);
        this.g.b(cl_62Var);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return (this.e.a.size() * 2) + this.d.a.length + 38 + this.f.length + this.g.d();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ClientHello, ");
        stringBuffer.append(this.b);
        stringBuffer.append("\nRandomCookie:  ");
        stringBuffer.append(this.c.a());
        stringBuffer.append("Session ID:  ");
        stringBuffer.append(this.d);
        stringBuffer.append("\nCipher Suites: ");
        stringBuffer.append(this.e);
        stringBuffer.append("\n");
        stringBuffer.append(cl_47.a("Compression Methods", this.f));
        stringBuffer.append(this.g.e());
        stringBuffer.append("***\n");
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 1;
    }
}
