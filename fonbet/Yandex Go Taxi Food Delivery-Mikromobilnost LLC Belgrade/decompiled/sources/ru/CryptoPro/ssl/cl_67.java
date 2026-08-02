package ru.CryptoPro.ssl;

import defpackage.b64;
import defpackage.dy31;
import defpackage.ny61;
import defpackage.oyr;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes4.dex */
final class cl_67 {
    public List a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [ru.CryptoPro.ssl.cl_26] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ru.CryptoPro.ssl.cl_108, ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [ru.CryptoPro.ssl.cl_104, ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ru.CryptoPro.ssl.cl_38, ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ru.CryptoPro.ssl.cl_107, ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ru.CryptoPro.ssl.cl_0, ru.CryptoPro.ssl.cl_66] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ru.CryptoPro.ssl.cl_89] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ru.CryptoPro.ssl.cl_28] */
    public cl_67(cl_46 cl_46Var, boolean z, boolean z2) {
        cl_36 cl_36Var;
        ?? cl_114Var;
        int i;
        SNIServerName cl_105Var;
        int d = cl_46Var.d();
        this.a = new ArrayList();
        this.b = d + 2;
        while (d > 0) {
            int d2 = cl_46Var.d();
            int d3 = cl_46Var.d();
            Iterator it = cl_36.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cl_36Var = new cl_36(d2, oyr.i(d2, "type_"));
                    break;
                } else {
                    cl_36Var = (cl_36) it.next();
                    if (cl_36Var.a == d2) {
                        break;
                    }
                }
            }
            cl_36 cl_36Var2 = cl_36.d;
            int i2 = 0;
            if (cl_36Var == cl_36Var2) {
                cl_114Var = new cl_104(cl_36Var2);
                if (d3 >= 2) {
                    int d4 = cl_46Var.d();
                    cl_114Var.f = d4;
                    if (d4 == 0 || d4 + 2 != d3) {
                        dy31.j(cl_36Var2, " extension");
                        throw null;
                    }
                    i = d3 - 2;
                    cl_114Var.e = new LinkedHashMap();
                    while (i > 0) {
                        int c = cl_46Var.c();
                        byte[] g = cl_46Var.g();
                        if (c != 0) {
                            try {
                                cl_105Var = new cl_105(c, g);
                            } catch (IllegalArgumentException e) {
                                StringBuilder t = b64.t(c, "Illegal server name, type=(", "), value=");
                                t.append(Arrays.toString(g));
                                SSLProtocolException sSLProtocolException = new SSLProtocolException(t.toString());
                                sSLProtocolException.initCause(e);
                                throw sSLProtocolException;
                            }
                        } else {
                            if (g.length == 0) {
                                dy31.m("Empty HostName in server name indication");
                                throw null;
                            }
                            try {
                                cl_105Var = new SNIHostName(g);
                            } catch (IllegalArgumentException e2) {
                                StringBuilder t2 = b64.t(c, "Illegal server name, type=host_name(", "), name=");
                                t2.append(new String(g, StandardCharsets.UTF_8));
                                t2.append(", value=");
                                t2.append(Arrays.toString(g));
                                SSLProtocolException sSLProtocolException2 = new SSLProtocolException(t2.toString());
                                sSLProtocolException2.initCause(e2);
                                throw sSLProtocolException2;
                            }
                        }
                        if (cl_114Var.e.put(Integer.valueOf(cl_105Var.getType()), cl_105Var) != null) {
                            throw new SSLProtocolException("Duplicated server name of type " + cl_105Var.getType());
                        }
                        i -= g.length + 3;
                    }
                } else {
                    if (d3 == 0) {
                        cl_114Var.f = 0;
                        cl_114Var.e = Collections.EMPTY_MAP;
                    }
                    i = d3;
                }
                if (i != 0) {
                    dy31.m("Invalid server_name extension");
                    throw null;
                }
            } else {
                cl_36 cl_36Var3 = cl_36.g;
                if (cl_36Var == cl_36Var3) {
                    cl_114Var = new cl_108(cl_36Var3);
                    int d5 = cl_46Var.d();
                    cl_114Var.f = d5;
                    if (d5 == 0 || d5 + 2 != d3) {
                        dy31.j(cl_36Var3, " extension");
                        throw null;
                    }
                    cl_114Var.e = new ArrayList();
                    while (d5 > 1) {
                        i2++;
                        cl_114Var.e.add(cl_109.c(cl_46Var.c(), cl_46Var.c(), i2));
                        d5 -= 2;
                    }
                    if (d5 != 0) {
                        dy31.m("Invalid server_name extension");
                        throw null;
                    }
                } else if (cl_36Var == cl_36.e) {
                    cl_114Var = new cl_26(cl_46Var, d3);
                } else if (cl_36Var == cl_36.f) {
                    cl_114Var = new cl_28(cl_46Var);
                } else if (cl_36Var == cl_36.k) {
                    cl_114Var = new cl_89(cl_46Var, d3);
                } else {
                    cl_36 cl_36Var4 = cl_36.h;
                    if (cl_36Var == cl_36Var4) {
                        cl_114Var = new cl_0(cl_36Var4);
                        cl_114Var.e = 0;
                        cl_114Var.f = null;
                        if (d3 < 2) {
                            dy31.d(d3, cl_36Var4, " extension: insufficient data (length=");
                            throw null;
                        }
                        int d6 = cl_46Var.d();
                        cl_114Var.e = d6;
                        if (d6 < 2 || d6 + 2 != d3) {
                            dy31.d(d6, cl_36Var4, " extension: incorrect list length (length=");
                            throw null;
                        }
                        cl_114Var.f = new ArrayList();
                        while (d6 > 0) {
                            byte[] n = cl_46Var.n();
                            if (n.length == 0) {
                                dy31.j(cl_36Var4, " extension: empty application protocol name");
                                throw null;
                            }
                            cl_114Var.f.add(new String(n, StandardCharsets.UTF_8));
                            d6 -= n.length + 1;
                        }
                        if (d6 != 0) {
                            dy31.d(d6, cl_36Var4, " extension: extra data (length=");
                            throw null;
                        }
                    } else {
                        cl_36 cl_36Var5 = cl_36.i;
                        if (cl_36Var == cl_36Var5) {
                            cl_114Var = new cl_35(cl_36Var5);
                            if (d3 != 0) {
                                dy31.j(cl_36Var5, " extension");
                                throw null;
                            }
                        } else {
                            cl_36 cl_36Var6 = cl_36.j;
                            if (cl_36Var == cl_36Var6) {
                                cl_114Var = new cl_107(cl_36Var6);
                                cl_114Var.e = null;
                                if (d3 != 0) {
                                    dy31.j(cl_36Var6, " extension");
                                    throw null;
                                }
                            } else {
                                cl_36 cl_36Var7 = cl_36.l;
                                if (cl_36Var == cl_36Var7) {
                                    cl_114Var = new cl_38(cl_36Var7);
                                    cl_114Var.c = null;
                                    byte[] bArr = new byte[d3];
                                    cl_114Var.c = bArr;
                                    cl_46Var.read(bArr, 0, d3);
                                    if (d3 != cl_114Var.c.length) {
                                        ny61.v("Invalid extension length");
                                        throw null;
                                    }
                                    if (z2) {
                                        cl_38.a(cl_114Var, z);
                                    }
                                } else {
                                    cl_114Var = new cl_114(cl_46Var, d3, cl_36Var);
                                }
                            }
                        }
                    }
                }
            }
            this.a.add(cl_114Var);
            d -= d3 + 4;
        }
        if (d == 0) {
            return;
        }
        dy31.m("Error parsing extensions: extra data");
        throw null;
    }

    public final cl_66 a(cl_36 cl_36Var) {
        for (cl_66 cl_66Var : this.a) {
            if (cl_66Var.d == cl_36Var) {
                return cl_66Var;
            }
        }
        return null;
    }

    public final void b(cl_62 cl_62Var) {
        int d = d();
        if (d == 0) {
            return;
        }
        cl_62Var.e(d - 2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cl_66) it.next()).a(cl_62Var);
        }
    }

    public final void c(cl_66 cl_66Var) {
        if (this.a.isEmpty()) {
            this.a = new ArrayList();
        }
        this.a.add(cl_66Var);
        this.b = -1;
    }

    public final int d() {
        int i = this.b;
        if (i >= 0) {
            return i;
        }
        if (this.a.isEmpty()) {
            this.b = 0;
        } else {
            this.b = 2;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b += ((cl_66) it.next()).b();
            }
        }
        return this.b;
    }

    public final String e() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((cl_66) it.next()).toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public cl_67() {
        this.a = Collections.EMPTY_LIST;
    }
}
