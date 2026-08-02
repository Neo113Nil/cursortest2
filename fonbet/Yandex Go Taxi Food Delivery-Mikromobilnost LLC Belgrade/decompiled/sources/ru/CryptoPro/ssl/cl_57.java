package ru.CryptoPro.ssl;

import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
final class cl_57 extends cl_47 {
    public int b;
    public byte[] c;

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        int i = this.b;
        cl_82 cl_82Var = cl_62Var.c;
        if (cl_82Var.B() < 4) {
            cl_62Var.flush();
        }
        cl_82Var.write(i >> 24);
        cl_82Var.write(i >> 16);
        cl_82Var.write(i >> 8);
        cl_82Var.write(i);
        cl_62Var.b(this.c);
    }

    public byte[] b() {
        return this.c;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return this.c.length + 6;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** NewSessionTicket\nTicket lifetime  (sec):  ");
        stringBuffer.append(this.b);
        stringBuffer.append("\nTicket:  ");
        stringBuffer.append(Array.toHexString(this.c));
        stringBuffer.append("***\n");
        return stringBuffer.toString();
    }

    public int e() {
        return this.b * 1000;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 4;
    }
}
