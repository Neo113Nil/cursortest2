package j8;

import com.google.android.gms.internal.ads.C4088vv;
import e8.m;
import e8.p;
import e8.u;
import e8.v;
import e8.w;
import e8.y;
import i8.q;
import i8.r;
import java.io.IOException;
import java.net.ProtocolException;
import l8.C4709a;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38592a = new c();

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
    @Override // e8.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(h hVar) {
        v vVar;
        f fVar;
        IOException iOException;
        boolean z8;
        IOException iOException2;
        w a9;
        int i;
        y yVar;
        boolean z9;
        boolean z10;
        String str;
        w a10;
        ?? r52;
        v vVar2;
        C4088vv c4088vv = hVar.f38597d;
        kotlin.jvm.internal.h.b(c4088vv);
        q call = (q) c4088vv.f34899v;
        f fVar2 = (f) c4088vv.f34901x;
        C4903n c4903n = hVar.f38598e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean x3 = com.bumptech.glide.h.x((String) c4903n.f40102v);
        ?? r10 = 1;
        r10 = 1;
        u uVar = (u) c4903n.f40104x;
        boolean z11 = x3 && uVar != null;
        m mVar = (m) c4903n.f40103w;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(mVar.a("Connection"));
        try {
            try {
                kotlin.jvm.internal.h.e(call, "call");
                fVar2.h(c4903n);
            } catch (IOException e6) {
                e = e6;
            }
            try {
                try {
                    if (equalsIgnoreCase) {
                        fVar = fVar2;
                    } else {
                        if (z11) {
                            try {
                                try {
                                    if ("100-continue".equalsIgnoreCase(mVar.a("Expect"))) {
                                        try {
                                            fVar2.d();
                                            vVar = c4088vv.d(true);
                                            try {
                                                kotlin.jvm.internal.h.e(call, "call");
                                                vVar2 = vVar;
                                                vVar = null;
                                            } catch (IOException e9) {
                                                e = e9;
                                                fVar = fVar2;
                                                if (!(e instanceof C4709a)) {
                                                }
                                            }
                                        } catch (IOException e10) {
                                            kotlin.jvm.internal.h.e(call, "call");
                                            c4088vv.e(e10);
                                            throw e10;
                                        }
                                    } else {
                                        vVar = 1;
                                        vVar2 = null;
                                    }
                                    try {
                                        if (vVar2 == null) {
                                            try {
                                                uVar.getClass();
                                                kotlin.jvm.internal.h.b(uVar);
                                                long a11 = uVar.a();
                                                kotlin.jvm.internal.h.e(call, "call");
                                                fVar = fVar2;
                                                u8.p pVar = new u8.p(new i8.g(c4088vv, fVar2.i(c4903n, a11), a11));
                                                uVar.c(pVar);
                                                pVar.close();
                                            } catch (IOException e11) {
                                                e = e11;
                                                fVar = fVar2;
                                                r10 = vVar;
                                                vVar = vVar2;
                                                if (!(e instanceof C4709a)) {
                                                }
                                            }
                                        } else {
                                            fVar = fVar2;
                                            call.k(c4088vv, true, false, null);
                                            if (!(c4088vv.b().f38414k != null)) {
                                                fVar.f().e();
                                            }
                                        }
                                        r52 = vVar;
                                        vVar = vVar2;
                                        fVar.a();
                                        iOException = null;
                                        z8 = r52;
                                    } catch (IOException e12) {
                                        e = e12;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    fVar = fVar2;
                                    vVar = null;
                                }
                            } catch (IOException e14) {
                                e = e14;
                                fVar = fVar2;
                                vVar = null;
                                r10 = 1;
                                if (!(e instanceof C4709a)) {
                                }
                            }
                            if (vVar == null) {
                                try {
                                    vVar = c4088vv.d(false);
                                    kotlin.jvm.internal.h.b(vVar);
                                    if (z8) {
                                        kotlin.jvm.internal.h.e(call, "call");
                                        z8 = false;
                                    }
                                } catch (IOException e15) {
                                    e = e15;
                                    iOException2 = iOException;
                                    if (iOException2 != null) {
                                        throw e;
                                    }
                                    com.bumptech.glide.d.b(iOException2, e);
                                    throw iOException2;
                                }
                            }
                            vVar.f37508a = c4903n;
                            vVar.f37512e = c4088vv.b().f38411g;
                            vVar.f37518l = currentTimeMillis;
                            iOException2 = iOException;
                            vVar.f37519m = System.currentTimeMillis();
                            a9 = vVar.a();
                            i = a9.f37533w;
                            while (true) {
                                yVar = a9.f37536z;
                                if (i != 100 && (102 > i || i >= 200)) {
                                    break;
                                }
                                v d2 = c4088vv.d(false);
                                kotlin.jvm.internal.h.b(d2);
                                if (z8) {
                                    kotlin.jvm.internal.h.e(call, "call");
                                }
                                d2.f37508a = c4903n;
                                d2.f37512e = c4088vv.b().f38411g;
                                d2.f37518l = currentTimeMillis;
                                d2.f37519m = System.currentTimeMillis();
                                a9 = d2.a();
                                i = a9.f37533w;
                            }
                            kotlin.jvm.internal.h.e(call, "call");
                            z9 = i == 101;
                            if (z9) {
                                if (c4088vv.b().f38414k != null) {
                                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                }
                            }
                            if (z9) {
                                String a12 = a9.f37535y.a("Connection");
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
                                            call.k(c4088vv, true, false, null);
                                        }
                                        i c4 = c4088vv.c(a9);
                                        v b9 = a9.b();
                                        b9.f37514g = c4;
                                        b9.f37521o = new b();
                                        a10 = b9.a();
                                    } else {
                                        v b10 = a9.b();
                                        b10.f37514g = new f8.a(yVar.j(), yVar.b());
                                        c4088vv.f34897n = true;
                                        if (call.f38391B) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        call.f38391B = true;
                                        call.f38402w.i();
                                        e f6 = fVar.f();
                                        kotlin.jvm.internal.h.c(f6, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                        r rVar = (r) f6;
                                        rVar.f38410f.setSoTimeout(0);
                                        rVar.e();
                                        b10.f37515h = new S0.c(c4088vv);
                                        a10 = b10.a();
                                        str = null;
                                    }
                                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((m) a10.f37530n.f40103w).a("Connection"))) {
                                        String a13 = a10.f37535y.a("Connection");
                                        if (a13 == null) {
                                            a13 = str;
                                        }
                                    }
                                    fVar.f().e();
                                    if ((i == 204 && i != 205) || a10.f37536z.b() <= 0) {
                                        return a10;
                                    }
                                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f37536z.b());
                                }
                            }
                            z10 = false;
                            if (equalsIgnoreCase) {
                            }
                            if (equalsIgnoreCase) {
                            }
                            i c42 = c4088vv.c(a9);
                            v b92 = a9.b();
                            b92.f37514g = c42;
                            b92.f37521o = new b();
                            a10 = b92.a();
                            if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((m) a10.f37530n.f40103w).a("Connection"))) {
                            }
                            fVar.f().e();
                            if (i == 204) {
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f37536z.b());
                        }
                        fVar = fVar2;
                        call.k(c4088vv, true, false, null);
                    }
                    vVar.f37519m = System.currentTimeMillis();
                    a9 = vVar.a();
                    i = a9.f37533w;
                    while (true) {
                        yVar = a9.f37536z;
                        if (i != 100) {
                            break;
                        }
                        v d22 = c4088vv.d(false);
                        kotlin.jvm.internal.h.b(d22);
                        if (z8) {
                        }
                        d22.f37508a = c4903n;
                        d22.f37512e = c4088vv.b().f38411g;
                        d22.f37518l = currentTimeMillis;
                        d22.f37519m = System.currentTimeMillis();
                        a9 = d22.a();
                        i = a9.f37533w;
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
                    i c422 = c4088vv.c(a9);
                    v b922 = a9.b();
                    b922.f37514g = c422;
                    b922.f37521o = new b();
                    a10 = b922.a();
                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((m) a10.f37530n.f40103w).a("Connection"))) {
                    }
                    fVar.f().e();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f37536z.b());
                } catch (IOException e16) {
                    e = e16;
                    if (iOException2 != null) {
                    }
                }
                fVar.a();
                iOException = null;
                z8 = r52;
                if (vVar == null) {
                }
                vVar.f37508a = c4903n;
                vVar.f37512e = c4088vv.b().f38411g;
                vVar.f37518l = currentTimeMillis;
                iOException2 = iOException;
            } catch (IOException e17) {
                try {
                    c4088vv.e(e17);
                    throw e17;
                } catch (IOException e18) {
                    e = e18;
                    r10 = r52 == true ? 1 : 0;
                    if (!(e instanceof C4709a)) {
                        throw e;
                    }
                    if (!c4088vv.f34898u) {
                        throw e;
                    }
                    iOException = e;
                    z8 = r10;
                    if (vVar == null) {
                    }
                    vVar.f37508a = c4903n;
                    vVar.f37512e = c4088vv.b().f38411g;
                    vVar.f37518l = currentTimeMillis;
                    iOException2 = iOException;
                    vVar.f37519m = System.currentTimeMillis();
                    a9 = vVar.a();
                    i = a9.f37533w;
                    while (true) {
                        yVar = a9.f37536z;
                        if (i != 100) {
                        }
                        v d222 = c4088vv.d(false);
                        kotlin.jvm.internal.h.b(d222);
                        if (z8) {
                        }
                        d222.f37508a = c4903n;
                        d222.f37512e = c4088vv.b().f38411g;
                        d222.f37518l = currentTimeMillis;
                        d222.f37519m = System.currentTimeMillis();
                        a9 = d222.a();
                        i = a9.f37533w;
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
                    i c4222 = c4088vv.c(a9);
                    v b9222 = a9.b();
                    b9222.f37514g = c4222;
                    b9222.f37521o = new b();
                    a10 = b9222.a();
                    if (!com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(((m) a10.f37530n.f40103w).a("Connection"))) {
                    }
                    fVar.f().e();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a10.f37536z.b());
                }
            }
            r52 = 1;
            vVar = null;
        } catch (IOException e19) {
            kotlin.jvm.internal.h.e(call, "call");
            c4088vv.e(e19);
            throw e19;
        }
    }
}
