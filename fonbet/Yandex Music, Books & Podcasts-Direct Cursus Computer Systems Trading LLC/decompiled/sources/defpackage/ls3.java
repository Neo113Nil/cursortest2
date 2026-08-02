package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class ls3 implements bse {
    public final boolean a;

    public ls3(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019d, code lost:
    
        if ("close".equalsIgnoreCase(r1) != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d A[Catch: IOException -> 0x010c, TryCatch #4 {IOException -> 0x010c, blocks: (B:33:0x00fe, B:35:0x0107, B:43:0x0111, B:46:0x0134, B:48:0x013d, B:49:0x0140, B:50:0x0154), top: B:32:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190 A[Catch: IOException -> 0x016e, TryCatch #3 {IOException -> 0x016e, blocks: (B:53:0x0159, B:57:0x0161, B:58:0x017f, B:60:0x0190, B:63:0x0199, B:70:0x01ae, B:72:0x01b2, B:75:0x01bf, B:77:0x01d2, B:78:0x01dc, B:79:0x01e6, B:83:0x019f, B:84:0x0171), top: B:52:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2 A[Catch: IOException -> 0x016e, TryCatch #3 {IOException -> 0x016e, blocks: (B:53:0x0159, B:57:0x0161, B:58:0x017f, B:60:0x0190, B:63:0x0199, B:70:0x01ae, B:72:0x01b2, B:75:0x01bf, B:77:0x01d2, B:78:0x01dc, B:79:0x01e6, B:83:0x019f, B:84:0x0171), top: B:52:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf A[Catch: IOException -> 0x016e, TryCatch #3 {IOException -> 0x016e, blocks: (B:53:0x0159, B:57:0x0161, B:58:0x017f, B:60:0x0190, B:63:0x0199, B:70:0x01ae, B:72:0x01b2, B:75:0x01bf, B:77:0x01d2, B:78:0x01dc, B:79:0x01e6, B:83:0x019f, B:84:0x0171), top: B:52:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        k3o k3oVar;
        iob iobVar;
        IOException iOException;
        IOException iOException2;
        k3o k3oVar2;
        boolean z;
        l3o a;
        int i;
        l3o a2;
        d0o d0oVar;
        o3o o3oVar;
        boolean z2;
        boolean z3;
        long a3;
        evj evjVar = (evj) uknVar.h;
        evjVar.getClass();
        iob iobVar2 = (iob) evjVar.e;
        okn oknVar = (okn) evjVar.f;
        jib jibVar = (jib) evjVar.d;
        mkn mknVar = (mkn) evjVar.c;
        d0o d0oVar2 = (d0o) uknVar.i;
        h0o h0oVar = d0oVar2.d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z4 = true;
        try {
            try {
                jibVar.n(mknVar);
                iobVar2.e(d0oVar2);
                jibVar.m(mknVar, d0oVar2);
                try {
                    if (!sj2.A(d0oVar2.b) || h0oVar == null) {
                        iobVar = iobVar2;
                        iOException = null;
                        mknVar.g(evjVar, true, false, null);
                        k3oVar = null;
                    } else {
                        try {
                        } catch (IOException e) {
                            e = e;
                        }
                        try {
                            if ("100-continue".equalsIgnoreCase(d0oVar2.c.a("Expect"))) {
                                try {
                                    iobVar2.h();
                                    k3o h = evjVar.h(true);
                                    try {
                                        jibVar.r(mknVar);
                                        k3oVar = h;
                                        z2 = false;
                                    } catch (IOException e2) {
                                        e = e2;
                                        iobVar = iobVar2;
                                        k3oVar = h;
                                        iOException = null;
                                        if (e instanceof i66) {
                                        }
                                    }
                                } catch (IOException e3) {
                                    jibVar.getClass();
                                    evjVar.m(e3);
                                    throw e3;
                                }
                            } else {
                                z2 = true;
                                k3oVar = null;
                            }
                            try {
                                if (k3oVar == null) {
                                    try {
                                        h0o h0oVar2 = d0oVar2.d;
                                        h0oVar2.getClass();
                                        a3 = h0oVar2.a();
                                        jibVar.l(mknVar);
                                        z3 = z2;
                                    } catch (IOException e4) {
                                        e = e4;
                                        iobVar = iobVar2;
                                        z3 = z2;
                                    }
                                    try {
                                        iobVar = iobVar2;
                                        hkn hknVar = new hkn(new gob(evjVar, iobVar2.f(d0oVar2, a3), a3));
                                        h0oVar.d(hknVar);
                                        hknVar.close();
                                    } catch (IOException e5) {
                                        e = e5;
                                        iobVar = iobVar2;
                                        z4 = z3;
                                        iOException = null;
                                        if (e instanceof i66) {
                                        }
                                    }
                                } else {
                                    iobVar = iobVar2;
                                    z3 = z2;
                                    mknVar.g(evjVar, true, false, null);
                                    if (oknVar.g == null) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        iobVar.d().k();
                                    }
                                }
                                z4 = z3;
                                iOException = null;
                            } catch (IOException e6) {
                                e = e6;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            iobVar = iobVar2;
                            iOException = null;
                            k3oVar = null;
                            if (e instanceof i66) {
                            }
                        }
                    }
                    try {
                        iobVar.b();
                        k3oVar2 = k3oVar;
                        iOException2 = iOException;
                    } catch (IOException e8) {
                        try {
                            evjVar.m(e8);
                            throw e8;
                        } catch (IOException e9) {
                            e = e9;
                            if (e instanceof i66) {
                                throw e;
                            }
                            if (!evjVar.a) {
                                throw e;
                            }
                            k3o k3oVar3 = k3oVar;
                            iOException2 = e;
                            k3oVar2 = k3oVar3;
                            z = z4;
                            if (k3oVar2 == null) {
                            }
                            k3oVar2.a = d0oVar2;
                            k3oVar2.e = oknVar.e;
                            k3oVar2.k = currentTimeMillis;
                            k3oVar2.l = System.currentTimeMillis();
                            a = k3oVar2.a();
                            i = a.d;
                            if (i != 100) {
                            }
                            k3o h2 = evjVar.h(false);
                            h2.getClass();
                            if (z) {
                            }
                            h2.a = d0oVar2;
                            h2.e = oknVar.e;
                            h2.k = currentTimeMillis;
                            h2.l = System.currentTimeMillis();
                            a = h2.a();
                            i = a.d;
                            jibVar.q(mknVar, a);
                            if (this.a) {
                            }
                            k3o g = a.g();
                            g.g = evjVar.f(a);
                            a2 = g.a();
                            d0oVar = a2.a;
                            d0oVar.getClass();
                            if (!"close".equalsIgnoreCase(d0oVar.c.a("Connection"))) {
                            }
                            iobVar.d().k();
                            if (i != 204) {
                            }
                            o3oVar = a2.g;
                            if ((o3oVar != null ? o3oVar.g() : -1L) > 0) {
                            }
                            return a2;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    iobVar = iobVar2;
                    iOException = null;
                    k3oVar = null;
                    if (e instanceof i66) {
                    }
                }
            } catch (IOException e11) {
                jibVar.getClass();
                evjVar.m(e11);
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
        }
        z = z4;
        if (k3oVar2 == null) {
            try {
                k3oVar2 = evjVar.h(false);
                k3oVar2.getClass();
                if (z) {
                    jibVar.r(mknVar);
                    z = false;
                }
            } catch (IOException e13) {
                e = e13;
                if (iOException2 != null) {
                }
            }
        }
        k3oVar2.a = d0oVar2;
        k3oVar2.e = oknVar.e;
        k3oVar2.k = currentTimeMillis;
        k3oVar2.l = System.currentTimeMillis();
        a = k3oVar2.a();
        i = a.d;
        try {
            if (i != 100) {
                if (102 <= i && i < 200) {
                }
                jibVar.q(mknVar, a);
                if (this.a || i != 101) {
                    k3o g2 = a.g();
                    g2.g = evjVar.f(a);
                    a2 = g2.a();
                } else {
                    k3o g3 = a.g();
                    g3.g = cvt.c;
                    a2 = g3.a();
                }
                d0oVar = a2.a;
                d0oVar.getClass();
                if (!"close".equalsIgnoreCase(d0oVar.c.a("Connection"))) {
                    String a4 = a2.f.a("Connection");
                    String str = a4;
                    if (a4 == null) {
                        str = iOException;
                    }
                }
                iobVar.d().k();
                if (i != 204 || i == 205) {
                    o3oVar = a2.g;
                    if ((o3oVar != null ? o3oVar.g() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i);
                        sb.append(" had non-zero Content-Length: ");
                        o3o o3oVar2 = a2.g;
                        sb.append(o3oVar2 != null ? Long.valueOf(o3oVar2.g()) : iOException);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a2;
            }
            if (this.a) {
            }
            k3o g22 = a.g();
            g22.g = evjVar.f(a);
            a2 = g22.a();
            d0oVar = a2.a;
            d0oVar.getClass();
            if (!"close".equalsIgnoreCase(d0oVar.c.a("Connection"))) {
            }
            iobVar.d().k();
            if (i != 204) {
            }
            o3oVar = a2.g;
            if ((o3oVar != null ? o3oVar.g() : -1L) > 0) {
            }
            return a2;
        } catch (IOException e14) {
            e = e14;
            if (iOException2 != null) {
                throw e;
            }
            fob.a(iOException2, e);
            throw iOException2;
        }
        k3o h22 = evjVar.h(false);
        h22.getClass();
        if (z) {
            jibVar.r(mknVar);
        }
        h22.a = d0oVar2;
        h22.e = oknVar.e;
        h22.k = currentTimeMillis;
        h22.l = System.currentTimeMillis();
        a = h22.a();
        i = a.d;
        jibVar.q(mknVar, a);
    }
}
