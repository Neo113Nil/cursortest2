package ru.CryptoPro.ssl;

import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLProtocolException;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class cl_49 extends cl_47 {
    public byte[] b;
    public cl_53[] c;
    public cl_84 d;
    public ArrayList e;
    public int f;
    public boolean g;
    public static final byte[] h = {1, 2};
    public static final byte[] D = {22};
    public static final byte[] E = {-17, -18, 22};
    public static final byte[] F = {-17, -18};

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        int i;
        cl_53[] cl_53VarArr = this.c;
        boolean z = this.g;
        cl_62Var.d(this.b);
        if (this.d.n >= cl_84.z.n) {
            cl_62Var.e(this.f);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                cl_109 cl_109Var = (cl_109) it.next();
                cl_62Var.a(cl_109Var.a());
                cl_62Var.a(cl_109Var.b & 255);
            }
        }
        if (z) {
            i = 0;
        } else {
            i = 0;
            for (cl_53 cl_53Var : cl_53VarArr) {
                i += cl_53Var.a.length + 2;
            }
        }
        cl_62Var.e(i);
        if (z) {
            return;
        }
        for (cl_53 cl_53Var2 : cl_53VarArr) {
            cl_62Var.b(cl_53Var2.a);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        int length = this.b.length + 3;
        if (this.d.n >= cl_84.z.n) {
            length += this.f + 2;
        }
        if (!this.g) {
            int i = 0;
            while (true) {
                cl_53[] cl_53VarArr = this.c;
                if (i >= cl_53VarArr.length) {
                    break;
                }
                length += cl_53VarArr[i].a.length + 2;
                i++;
            }
        }
        return length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        String str;
        String str2;
        cl_53[] cl_53VarArr = this.c;
        byte[] bArr = this.b;
        StringBuffer stringBuffer = new StringBuffer("*** CertificateRequest\nCert Types: ");
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            switch (b) {
                case 1:
                    str2 = "RSA";
                    break;
                case 2:
                    str2 = "DSS";
                    break;
                case 3:
                    str2 = "Fixed DH (RSA sig)";
                    break;
                case 4:
                    str2 = "Fixed DH (DSS sig)";
                    break;
                case 5:
                    str2 = "Ephemeral DH (RSA sig)";
                    break;
                case 6:
                    str2 = "Ephemeral DH (DSS sig)";
                    break;
                default:
                    switch (b) {
                        case 64:
                            str2 = JCP.ECDSA_NAME;
                            break;
                        case 65:
                            str2 = "Fixed ECDH (RSA sig)";
                            break;
                        case 66:
                            str2 = "Fixed ECDH (ECDSA sig)";
                            break;
                        default:
                            str2 = "Type-" + (bArr[i] & 255);
                            break;
                    }
            }
            stringBuffer.append(str2);
            if (i != bArr.length - 1) {
                stringBuffer.append(Extension.FIX_SPACE);
            }
        }
        stringBuffer.append("\n");
        if (this.d.n >= cl_84.z.n) {
            StringBuffer stringBuffer2 = new StringBuffer();
            Iterator it = this.e.iterator();
            boolean z = false;
            while (it.hasNext()) {
                cl_109 cl_109Var = (cl_109) it.next();
                if (z) {
                    stringBuffer2.append(Extension.FIX_SPACE);
                    stringBuffer2.append(cl_109Var.c);
                } else {
                    stringBuffer2.append(cl_109Var.c);
                    z = true;
                }
            }
            stringBuffer.append("Supported Signature Algorithms: ");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("\n");
        }
        stringBuffer.append("Cert Authorities:\n");
        if (cl_53VarArr.length == 0) {
            str = "<Empty>\n";
        } else {
            if (!this.g) {
                for (cl_53 cl_53Var : cl_53VarArr) {
                    cl_53Var.getClass();
                    StringBuffer stringBuffer3 = new StringBuffer("<");
                    stringBuffer3.append(new X500Principal(cl_53Var.a).toString());
                    stringBuffer3.append(">\n");
                    stringBuffer.append(stringBuffer3.toString());
                }
                return stringBuffer.toString();
            }
            str = "Authority list's size is too large.";
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public int e() {
        int i = 0;
        for (cl_53 cl_53Var : this.c) {
            i += cl_53Var.a.length + 2;
        }
        return i;
    }

    public final X500Principal[] h() {
        cl_53[] cl_53VarArr = this.c;
        X500Principal[] x500PrincipalArr = new X500Principal[cl_53VarArr.length];
        for (int i = 0; i < cl_53VarArr.length; i++) {
            cl_53 cl_53Var = cl_53VarArr[i];
            cl_53Var.getClass();
            try {
                x500PrincipalArr[i] = new X500Principal(cl_53Var.a);
            } catch (IllegalArgumentException e) {
                throw ((SSLProtocolException) new SSLProtocolException(e.getMessage()).initCause(e));
            }
        }
        return x500PrincipalArr;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 13;
    }
}
