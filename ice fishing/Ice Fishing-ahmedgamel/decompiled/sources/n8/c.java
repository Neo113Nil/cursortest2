package n8;

import com.google.android.gms.internal.ads.C3451jv;
import com.google.android.gms.internal.ads.WP;
import i8.l;
import i8.o;
import i8.t;
import i8.u;
import i8.v;
import i8.x;
import java.io.IOException;
import java.net.ProtocolException;
import m8.p;
import m8.q;
import p8.C4855a;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final c f39682a = new c();

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0227, code lost:
    
        if (com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(r2) != false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[Catch: IOException -> 0x0164, TryCatch #7 {IOException -> 0x0164, blocks: (B:33:0x0122, B:37:0x013f, B:39:0x0148, B:41:0x014b, B:48:0x0167, B:52:0x0173, B:57:0x0181, B:58:0x0188, B:61:0x018b, B:64:0x0194, B:69:0x01a1, B:71:0x01bb, B:72:0x020a, B:74:0x021a, B:77:0x0223, B:84:0x0238, B:86:0x0245, B:87:0x0269, B:88:0x0229, B:89:0x01e3, B:90:0x01ea, B:92:0x01ed, B:93:0x01f5), top: B:32:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173 A[Catch: IOException -> 0x0164, TryCatch #7 {IOException -> 0x0164, blocks: (B:33:0x0122, B:37:0x013f, B:39:0x0148, B:41:0x014b, B:48:0x0167, B:52:0x0173, B:57:0x0181, B:58:0x0188, B:61:0x018b, B:64:0x0194, B:69:0x01a1, B:71:0x01bb, B:72:0x020a, B:74:0x021a, B:77:0x0223, B:84:0x0238, B:86:0x0245, B:87:0x0269, B:88:0x0229, B:89:0x01e3, B:90:0x01ea, B:92:0x01ed, B:93:0x01f5), top: B:32:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b A[Catch: IOException -> 0x0164, TryCatch #7 {IOException -> 0x0164, blocks: (B:33:0x0122, B:37:0x013f, B:39:0x0148, B:41:0x014b, B:48:0x0167, B:52:0x0173, B:57:0x0181, B:58:0x0188, B:61:0x018b, B:64:0x0194, B:69:0x01a1, B:71:0x01bb, B:72:0x020a, B:74:0x021a, B:77:0x0223, B:84:0x0238, B:86:0x0245, B:87:0x0269, B:88:0x0229, B:89:0x01e3, B:90:0x01ea, B:92:0x01ed, B:93:0x01f5), top: B:32:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021a A[Catch: IOException -> 0x0164, TryCatch #7 {IOException -> 0x0164, blocks: (B:33:0x0122, B:37:0x013f, B:39:0x0148, B:41:0x014b, B:48:0x0167, B:52:0x0173, B:57:0x0181, B:58:0x0188, B:61:0x018b, B:64:0x0194, B:69:0x01a1, B:71:0x01bb, B:72:0x020a, B:74:0x021a, B:77:0x0223, B:84:0x0238, B:86:0x0245, B:87:0x0269, B:88:0x0229, B:89:0x01e3, B:90:0x01ea, B:92:0x01ed, B:93:0x01f5), top: B:32:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed A[Catch: IOException -> 0x0164, TryCatch #7 {IOException -> 0x0164, blocks: (B:33:0x0122, B:37:0x013f, B:39:0x0148, B:41:0x014b, B:48:0x0167, B:52:0x0173, B:57:0x0181, B:58:0x0188, B:61:0x018b, B:64:0x0194, B:69:0x01a1, B:71:0x01bb, B:72:0x020a, B:74:0x021a, B:77:0x0223, B:84:0x0238, B:86:0x0245, B:87:0x0269, B:88:0x0229, B:89:0x01e3, B:90:0x01ea, B:92:0x01ed, B:93:0x01f5), top: B:32:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // i8.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v a(h hVar) {
        u uVar;
        f fVar;
        IOException iOException;
        boolean z6;
        IOException iOException2;
        v a9;
        int i;
        x xVar;
        boolean z9;
        boolean z10;
        String str;
        v a10;
        ?? r52;
        u uVar2;
        C3451jv c3451jv = hVar.f39687d;
        kotlin.jvm.internal.h.b(c3451jv);
        p call = (p) c3451jv.f32126v;
        f fVar2 = (f) c3451jv.f32128x;
        C4945n c4945n = hVar.f39688e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean p9 = X2.a.p((String) c4945n.f40492v);
        ?? r10 = 1;
        r10 = 1;
        t tVar = (t) c4945n.f40494x;
        boolean z11 = p9 && tVar != null;
        l lVar = (l) c4945n.f40493w;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(lVar.a("Connection"));
        try {
            try {
                kotlin.jvm.internal.h.e(call, "call");
                fVar2.a(c4945n);
            } catch (IOException e9) {
                e = e9;
            }
            try {
                try {
                    if (equalsIgnoreCase) {
                        fVar = fVar2;
                    } else {
                        if (z11) {
                            try {
                                try {
                                    if ("100-continue".equalsIgnoreCase(lVar.a("Expect"))) {
                                        try {
                                            fVar2.h();
                                            uVar = c3451jv.d(true);
                                            try {
                                                kotlin.jvm.internal.h.e(call, "call");
                                                uVar2 = uVar;
                                                uVar = null;
                                            } catch (IOException e10) {
                                                e = e10;
                                                fVar = fVar2;
                                                if (!(e instanceof C4855a)) {
                                                }
                                            }
                                        } catch (IOException e11) {
                                            kotlin.jvm.internal.h.e(call, "call");
                                            c3451jv.e(e11);
                                            throw e11;
                                        }
                                    } else {
                                        uVar = 1;
                                        uVar2 = null;
                                    }
                                    try {
                                        if (uVar2 == null) {
                                            try {
                                                tVar.getClass();
                                                kotlin.jvm.internal.h.b(tVar);
                                                long a11 = tVar.a();
                                                kotlin.jvm.internal.h.e(call, "call");
                                                fVar = fVar2;
                                                y8.p pVar = new y8.p(new m8.g(c3451jv, fVar2.g(c4945n, a11), a11));
                                                tVar.c(pVar);
                                                pVar.close();
                                            } catch (IOException e12) {
                                                e = e12;
                                                fVar = fVar2;
                                                r10 = uVar;
                                                uVar = uVar2;
                                                if (!(e instanceof C4855a)) {
                                                }
                                            }
                                        } else {
                                            fVar = fVar2;
                                            call.k(c3451jv, true, false, null);
                                            if (!(c3451jv.b().f39559k != null)) {
                                                fVar.j().d();
                                            }
                                        }
                                        r52 = uVar;
                                        uVar = uVar2;
                                        fVar.b();
                                        iOException = null;
                                        z6 = r52;
                                    } catch (IOException e13) {
                                        e = e13;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    fVar = fVar2;
                                    uVar = null;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                fVar = fVar2;
                                uVar = null;
                                r10 = 1;
                                if (!(e instanceof C4855a)) {
                                }
                            }
                            if (uVar == null) {
                                try {
                                    uVar = c3451jv.d(false);
                                    kotlin.jvm.internal.h.b(uVar);
                                    if (z6) {
                                        kotlin.jvm.internal.h.e(call, "call");
                                        z6 = false;
                                    }
                                } catch (IOException e16) {
                                    e = e16;
                                    iOException2 = iOException;
                                    if (iOException2 != null) {
                                        throw e;
                                    }
                                    A8.b.a(iOException2, e);
                                    throw iOException2;
                                }
                            }
                            uVar.f38349a = c4945n;
                            uVar.f38353e = c3451jv.b().f39556g;
                            uVar.f38359l = currentTimeMillis;
                            iOException2 = iOException;
                            uVar.f38360m = System.currentTimeMillis();
                            a9 = uVar.a();
                            i = a9.f38374w;
                            while (true) {
                                xVar = a9.f38377z;
                                if (i != 100 && (102 > i || i >= 200)) {
                                    break;
                                }
                                u d9 = c3451jv.d(false);
                                kotlin.jvm.internal.h.b(d9);
                                if (z6) {
                                    kotlin.jvm.internal.h.e(call, "call");
                                }
                                d9.f38349a = c4945n;
                                d9.f38353e = c3451jv.b().f39556g;
                                d9.f38359l = currentTimeMillis;
                                d9.f38360m = System.currentTimeMillis();
                                a9 = d9.a();
                                i = a9.f38374w;
                            }
                            kotlin.jvm.internal.h.e(call, "call");
                            z9 = i == 101;
                            if (z9) {
                                if (c3451jv.b().f39559k != null) {
                                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                }
                            }
                            if (z9) {
                                String a12 = a9.f38376y.a("Connection");
                                if (a12 == null) {
                                    a12 = null;
                                }
                                if ("upgrade".equalsIgnoreCase(a12)) {
                                    z10 = true;
                                    if (equalsIgnoreCase || !z10) {
                                        if (equalsIgnoreCase) {
                                            str = null;
                                        } else {
                                            str = null;
                                            call.k(c3451jv, true, false, null);
                                        }
                                        i c9 = c3451jv.c(a9);
                                        u b9 = a9.b();
                                        b9.f38355g = c9;
                                        b9.f38362o = new b();
                                        a10 = b9.a();
                                    } else {
                                        u b10 = a9.b();
                                        b10.f38355g = new j8.a(xVar.j(), xVar.b());
                                        c3451jv.f32124n = true;
                                        if (call.f39536B) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        call.f39536B = true;
                                        call.f39547w.i();
                                        e j6 = fVar.j();
                                        kotlin.jvm.internal.h.c(j6, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                        q qVar = (q) j6;
                                        qVar.f39555f.setSoTimeout(0);
                                        qVar.d();
                                        b10.f38356h = new WP(c3451jv);
                                        a10 = b10.a();
                                        str = null;
                                    }
                                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((l) a10.f38371n.f40493w).a("Connection"))) {
                                        String a13 = a10.f38376y.a("Connection");
                                        if (a13 == null) {
                                            a13 = str;
                                        }
                                    }
                                    fVar.j().d();
                                    if ((i == 204 && i != 205) || a10.f38377z.b() <= 0) {
                                        return a10;
                                    }
                                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f38377z.b());
                                }
                            }
                            z10 = false;
                            if (equalsIgnoreCase) {
                            }
                            if (equalsIgnoreCase) {
                            }
                            i c92 = c3451jv.c(a9);
                            u b92 = a9.b();
                            b92.f38355g = c92;
                            b92.f38362o = new b();
                            a10 = b92.a();
                            if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((l) a10.f38371n.f40493w).a("Connection"))) {
                            }
                            fVar.j().d();
                            if (i == 204) {
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f38377z.b());
                        }
                        fVar = fVar2;
                        call.k(c3451jv, true, false, null);
                    }
                    uVar.f38360m = System.currentTimeMillis();
                    a9 = uVar.a();
                    i = a9.f38374w;
                    while (true) {
                        xVar = a9.f38377z;
                        if (i != 100) {
                            break;
                        }
                        u d92 = c3451jv.d(false);
                        kotlin.jvm.internal.h.b(d92);
                        if (z6) {
                        }
                        d92.f38349a = c4945n;
                        d92.f38353e = c3451jv.b().f39556g;
                        d92.f38359l = currentTimeMillis;
                        d92.f38360m = System.currentTimeMillis();
                        a9 = d92.a();
                        i = a9.f38374w;
                    }
                    kotlin.jvm.internal.h.e(call, "call");
                    if (i == 101) {
                    }
                    if (z9) {
                    }
                    if (z9) {
                    }
                    z10 = false;
                    if (equalsIgnoreCase) {
                    }
                    if (equalsIgnoreCase) {
                    }
                    i c922 = c3451jv.c(a9);
                    u b922 = a9.b();
                    b922.f38355g = c922;
                    b922.f38362o = new b();
                    a10 = b922.a();
                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((l) a10.f38371n.f40493w).a("Connection"))) {
                    }
                    fVar.j().d();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f38377z.b());
                } catch (IOException e17) {
                    e = e17;
                    if (iOException2 != null) {
                    }
                }
                fVar.b();
                iOException = null;
                z6 = r52;
                if (uVar == null) {
                }
                uVar.f38349a = c4945n;
                uVar.f38353e = c3451jv.b().f39556g;
                uVar.f38359l = currentTimeMillis;
                iOException2 = iOException;
            } catch (IOException e18) {
                try {
                    c3451jv.e(e18);
                    throw e18;
                } catch (IOException e19) {
                    e = e19;
                    r10 = r52 == true ? 1 : 0;
                    if (!(e instanceof C4855a)) {
                        throw e;
                    }
                    if (!c3451jv.f32125u) {
                        throw e;
                    }
                    iOException = e;
                    z6 = r10;
                    if (uVar == null) {
                    }
                    uVar.f38349a = c4945n;
                    uVar.f38353e = c3451jv.b().f39556g;
                    uVar.f38359l = currentTimeMillis;
                    iOException2 = iOException;
                    uVar.f38360m = System.currentTimeMillis();
                    a9 = uVar.a();
                    i = a9.f38374w;
                    while (true) {
                        xVar = a9.f38377z;
                        if (i != 100) {
                        }
                        u d922 = c3451jv.d(false);
                        kotlin.jvm.internal.h.b(d922);
                        if (z6) {
                        }
                        d922.f38349a = c4945n;
                        d922.f38353e = c3451jv.b().f39556g;
                        d922.f38359l = currentTimeMillis;
                        d922.f38360m = System.currentTimeMillis();
                        a9 = d922.a();
                        i = a9.f38374w;
                    }
                    kotlin.jvm.internal.h.e(call, "call");
                    if (i == 101) {
                    }
                    if (z9) {
                    }
                    if (z9) {
                    }
                    z10 = false;
                    if (equalsIgnoreCase) {
                    }
                    if (equalsIgnoreCase) {
                    }
                    i c9222 = c3451jv.c(a9);
                    u b9222 = a9.b();
                    b9222.f38355g = c9222;
                    b9222.f38362o = new b();
                    a10 = b9222.a();
                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((l) a10.f38371n.f40493w).a("Connection"))) {
                    }
                    fVar.j().d();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f38377z.b());
                }
            }
            r52 = 1;
            uVar = null;
        } catch (IOException e20) {
            kotlin.jvm.internal.h.e(call, "call");
            c3451jv.e(e20);
            throw e20;
        }
    }
}
