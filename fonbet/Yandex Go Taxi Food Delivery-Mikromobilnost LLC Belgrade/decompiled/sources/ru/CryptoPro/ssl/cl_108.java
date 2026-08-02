package ru.CryptoPro.ssl;

import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class cl_108 extends cl_66 {
    public ArrayList e;
    public int f;

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        int i = this.f;
        cl_62Var.e(i + 2);
        cl_62Var.e(i);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            cl_109 cl_109Var = (cl_109) it.next();
            cl_62Var.a(cl_109Var.a());
            cl_62Var.a(cl_109Var.b & 255);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return this.f + 6;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.e.iterator();
        boolean z = false;
        while (it.hasNext()) {
            cl_109 cl_109Var = (cl_109) it.next();
            if (z) {
                stringBuffer.append(Extension.FIX_SPACE + cl_109Var.c);
            } else {
                stringBuffer.append(cl_109Var.c);
                z = true;
            }
        }
        return "Extension " + this.d + ", signature_algorithms: " + ((Object) stringBuffer);
    }
}
