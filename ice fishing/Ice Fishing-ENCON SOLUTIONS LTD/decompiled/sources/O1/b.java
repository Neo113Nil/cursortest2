package O1;

import J1.p;
import J1.v;
import J1.w;
import J1.x;
import J1.y;
import J1.z;
import N1.k;
import Q1.C0078a;
import R1.l;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.i;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class b implements p {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4 A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[Catch: IOException -> 0x0159, TRY_ENTER, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d4  */
    @Override // J1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        x xVar;
        IOException iOException;
        x xVar2;
        IOException iOException2;
        int i2;
        y a2;
        z zVar;
        IOException iOException3;
        x c2;
        boolean z2;
        long j2;
        boolean z3;
        N1.e eVar = gVar.f1241d;
        i.b(eVar);
        N1.i call = (N1.i) eVar.f1168b;
        e eVar2 = (e) eVar.f1170d;
        k kVar = (k) eVar.f1171e;
        v vVar = gVar.f1242e;
        w wVar = vVar.f980d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z4 = true;
        try {
            try {
                i.e(call, "call");
                eVar2.e(vVar);
                try {
                    if (!l.u(vVar.f978b) || wVar == null) {
                        iOException3 = null;
                        call.f(eVar, true, false, null);
                        xVar = null;
                    } else {
                        try {
                            if ("100-continue".equalsIgnoreCase(vVar.f979c.a("Expect"))) {
                                try {
                                    eVar2.f();
                                    c2 = eVar.c(true);
                                    try {
                                        i.e(call, "call");
                                        z2 = false;
                                    } catch (IOException e2) {
                                        e = e2;
                                        xVar = c2;
                                        if (!(e instanceof C0078a)) {
                                            throw e;
                                        }
                                        if (!eVar.f1167a) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (xVar == null) {
                                        }
                                        xVar2 = xVar;
                                        xVar2.f987a = vVar;
                                        xVar2.f991e = kVar.f1202e;
                                        xVar2.f997k = currentTimeMillis;
                                        iOException2 = iOException;
                                        xVar2.f998l = System.currentTimeMillis();
                                        y a3 = xVar2.a();
                                        i2 = a3.f1003d;
                                        if (i2 != 100) {
                                        }
                                        x c3 = eVar.c(false);
                                        i.b(c3);
                                        if (z4) {
                                        }
                                        c3.f987a = vVar;
                                        c3.f991e = kVar.f1202e;
                                        c3.f997k = currentTimeMillis;
                                        c3.f998l = System.currentTimeMillis();
                                        a3 = c3.a();
                                        i2 = a3.f1003d;
                                        i.e(call, "call");
                                        x b2 = a3.b();
                                        b2.f993g = eVar.b(a3);
                                        a2 = b2.a();
                                        if (!"close".equalsIgnoreCase(a2.f1000a.f979c.a("Connection"))) {
                                        }
                                        eVar2.h().k();
                                        if (i2 != 204) {
                                        }
                                        zVar = a2.f1006g;
                                        if ((zVar != null ? -1L : zVar.b()) > 0) {
                                        }
                                        return a2;
                                    }
                                } catch (IOException e3) {
                                    i.e(call, "call");
                                    eVar.d(e3);
                                    throw e3;
                                }
                            } else {
                                z2 = true;
                                c2 = null;
                            }
                            try {
                                if (c2 == null) {
                                    try {
                                        w wVar2 = vVar.f980d;
                                        i.b(wVar2);
                                        j2 = wVar2.f984b;
                                        i.e(call, "call");
                                        xVar = c2;
                                    } catch (IOException e4) {
                                        e = e4;
                                        xVar = c2;
                                    }
                                    try {
                                        z3 = z2;
                                        W1.p pVar = new W1.p(new N1.c(eVar, eVar2.a(vVar, j2), j2));
                                        byte[] bArr = wVar.f985c;
                                        if (pVar.f1894c) {
                                            throw new IllegalStateException("closed");
                                        }
                                        pVar.f1893b.s(bArr, wVar.f986d, wVar.f984b);
                                        pVar.a();
                                        pVar.close();
                                    } catch (IOException e5) {
                                        e = e5;
                                        boolean z5 = z2;
                                        z4 = z5;
                                        if (!(e instanceof C0078a)) {
                                        }
                                    }
                                } else {
                                    xVar = c2;
                                    z3 = z2;
                                    call.f(eVar, true, false, null);
                                    if (kVar.f1204g == null) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        eVar2.h().k();
                                    }
                                }
                                z4 = z3;
                                iOException3 = null;
                            } catch (IOException e6) {
                                e = e6;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            xVar = null;
                        }
                    }
                    try {
                        eVar2.d();
                        iOException = iOException3;
                    } catch (IOException e8) {
                        try {
                            eVar.d(e8);
                            throw e8;
                        } catch (IOException e9) {
                            e = e9;
                            if (!(e instanceof C0078a)) {
                            }
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    xVar = null;
                    if (!(e instanceof C0078a)) {
                    }
                }
            } catch (IOException e11) {
                i.e(call, "call");
                eVar.d(e11);
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
        }
        try {
            if (xVar == null) {
                try {
                    xVar = eVar.c(false);
                    i.b(xVar);
                    if (z4) {
                        i.e(call, "call");
                        xVar2 = xVar;
                        z4 = false;
                        xVar2.f987a = vVar;
                        xVar2.f991e = kVar.f1202e;
                        xVar2.f997k = currentTimeMillis;
                        iOException2 = iOException;
                        xVar2.f998l = System.currentTimeMillis();
                        y a32 = xVar2.a();
                        i2 = a32.f1003d;
                        if (i2 != 100) {
                            if (102 <= i2 && i2 < 200) {
                            }
                            i.e(call, "call");
                            x b22 = a32.b();
                            b22.f993g = eVar.b(a32);
                            a2 = b22.a();
                            if (!"close".equalsIgnoreCase(a2.f1000a.f979c.a("Connection")) || "close".equalsIgnoreCase(y.a(a2, "Connection"))) {
                                eVar2.h().k();
                            }
                            if (i2 != 204 || i2 == 205) {
                                zVar = a2.f1006g;
                                if ((zVar != null ? -1L : zVar.b()) > 0) {
                                    StringBuilder sb = new StringBuilder("HTTP ");
                                    sb.append(i2);
                                    sb.append(" had non-zero Content-Length: ");
                                    sb.append(zVar == null ? null : Long.valueOf(zVar.b()));
                                    throw new ProtocolException(sb.toString());
                                }
                            }
                            return a2;
                        }
                        x c32 = eVar.c(false);
                        i.b(c32);
                        if (z4) {
                            i.e(call, "call");
                        }
                        c32.f987a = vVar;
                        c32.f991e = kVar.f1202e;
                        c32.f997k = currentTimeMillis;
                        c32.f998l = System.currentTimeMillis();
                        a32 = c32.a();
                        i2 = a32.f1003d;
                        i.e(call, "call");
                        x b222 = a32.b();
                        b222.f993g = eVar.b(a32);
                        a2 = b222.a();
                        if (!"close".equalsIgnoreCase(a2.f1000a.f979c.a("Connection"))) {
                        }
                        eVar2.h().k();
                        if (i2 != 204) {
                        }
                        zVar = a2.f1006g;
                        if ((zVar != null ? -1L : zVar.b()) > 0) {
                        }
                        return a2;
                    }
                } catch (IOException e13) {
                    e = e13;
                    iOException2 = iOException;
                    if (iOException2 != null) {
                    }
                }
            }
            xVar2.f998l = System.currentTimeMillis();
            y a322 = xVar2.a();
            i2 = a322.f1003d;
            if (i2 != 100) {
            }
            x c322 = eVar.c(false);
            i.b(c322);
            if (z4) {
            }
            c322.f987a = vVar;
            c322.f991e = kVar.f1202e;
            c322.f997k = currentTimeMillis;
            c322.f998l = System.currentTimeMillis();
            a322 = c322.a();
            i2 = a322.f1003d;
            i.e(call, "call");
            x b2222 = a322.b();
            b2222.f993g = eVar.b(a322);
            a2 = b2222.a();
            if (!"close".equalsIgnoreCase(a2.f1000a.f979c.a("Connection"))) {
            }
            eVar2.h().k();
            if (i2 != 204) {
            }
            zVar = a2.f1006g;
            if ((zVar != null ? -1L : zVar.b()) > 0) {
            }
            return a2;
        } catch (IOException e14) {
            e = e14;
            if (iOException2 != null) {
                throw e;
            }
            IOException iOException4 = iOException2;
            AbstractC1050a.a(iOException4, e);
            throw iOException4;
        }
        xVar2 = xVar;
        xVar2.f987a = vVar;
        xVar2.f991e = kVar.f1202e;
        xVar2.f997k = currentTimeMillis;
        iOException2 = iOException;
    }
}
