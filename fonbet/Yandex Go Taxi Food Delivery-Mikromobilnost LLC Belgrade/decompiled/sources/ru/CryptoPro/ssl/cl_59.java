package ru.CryptoPro.ssl;

/* loaded from: classes4.dex */
final class cl_59 extends cl_47 {
    public cl_84 b;
    public cl_87 c;
    public cl_106 d;
    public cl_8 e;
    public byte f;
    public cl_67 g;

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.a(this.b.o);
        cl_62Var.a(this.b.p);
        cl_62Var.write(this.c.a, 0, 32);
        cl_62Var.d(this.d.b());
        cl_62Var.a(this.e.b >> 8);
        cl_62Var.a(this.e.b & 255);
        cl_62Var.a(this.f);
        this.g.b(cl_62Var);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return this.d.a.length + 38 + this.g.d();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ServerHello, ");
        stringBuffer.append(this.b);
        stringBuffer.append("\nRandomCookie:  ");
        stringBuffer.append(this.c.a());
        stringBuffer.append("Session ID:  ");
        stringBuffer.append(this.d);
        stringBuffer.append("\nCipher Suite: ");
        stringBuffer.append(this.e);
        stringBuffer.append("\nCompression Method: ");
        stringBuffer.append((int) this.f);
        stringBuffer.append("\n");
        stringBuffer.append(this.g.e());
        stringBuffer.append("***\n");
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 2;
    }
}
