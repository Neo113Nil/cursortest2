package defpackage;

import io.grpc.okhttp.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class koj {
    public static final q2i L = wue.a(":status", new bs4(25));
    public boolean A;
    public int B;
    public int C;
    public final ynb D;
    public final anx E;
    public final noj F;
    public boolean G;
    public final e3s H;
    public pxj I;
    public int J;
    public final /* synthetic */ a K;
    public jzh a;
    public final Object b;
    public final xiu c;
    public final jzh d;
    public int e;
    public boolean f;
    public boolean g;
    public final qgr h;
    public boolean i;
    public oo4 j;
    public ch7 k;
    public boolean l;
    public t5 m;
    public volatile boolean n;
    public boolean o;
    public boolean p;
    public sgr q;
    public s2i r;
    public Charset s;
    public boolean t;
    public final int u;
    public final Object v;
    public ArrayList w;
    public final hi3 x;
    public boolean y;
    public boolean z;

    public koj(a aVar, int i, qgr qgrVar, Object obj, ynb ynbVar, anx anxVar, noj nojVar, int i2) {
        this.K = aVar;
        xiu xiuVar = aVar.a;
        this.b = new Object();
        o2g.O(xiuVar, "transportTracer");
        this.c = xiuVar;
        jzh jzhVar = new jzh(this, i, qgrVar, xiuVar);
        this.d = jzhVar;
        this.a = jzhVar;
        this.k = ch7.d;
        this.l = false;
        this.h = qgrVar;
        this.s = pe4.b;
        this.x = new hi3();
        this.y = false;
        this.z = false;
        this.A = false;
        this.G = true;
        this.J = -1;
        o2g.O(obj, "lock");
        this.v = obj;
        this.D = ynbVar;
        this.E = anxVar;
        this.F = nojVar;
        this.B = i2;
        this.C = i2;
        this.u = i2;
        jkk.a.getClass();
        this.H = jee.a;
    }

    public static void a(koj kojVar, s2i s2iVar, String str) {
        byte[] bArr;
        a aVar = kojVar.K;
        String str2 = aVar.k;
        String str3 = aVar.i;
        boolean z = aVar.o;
        noj nojVar = kojVar.F;
        boolean z2 = nojVar.B == null;
        vtd vtdVar = yvd.a;
        o2g.O(s2iVar, "headers");
        o2g.O(str2, "authority");
        s2iVar.a(xqd.j);
        s2iVar.a(xqd.k);
        l2i l2iVar = xqd.l;
        s2iVar.a(l2iVar);
        ArrayList arrayList = new ArrayList(s2iVar.b + 7);
        if (z2) {
            arrayList.add(yvd.b);
        } else {
            arrayList.add(yvd.a);
        }
        if (z) {
            arrayList.add(yvd.d);
        } else {
            arrayList.add(yvd.c);
        }
        arrayList.add(new vtd(vtd.h, str2));
        arrayList.add(new vtd(vtd.f, str));
        arrayList.add(new vtd(l2iVar.a, str3));
        arrayList.add(yvd.e);
        arrayList.add(yvd.f);
        Logger logger = q9t.a;
        Charset charset = wue.a;
        int i = s2iVar.b * 2;
        byte[][] bArr2 = new byte[i][];
        Object[] objArr = s2iVar.a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr2, 0, i);
        } else {
            for (int i2 = 0; i2 < s2iVar.b; i2++) {
                int i3 = i2 * 2;
                bArr2[i3] = s2iVar.f(i2);
                int i4 = i3 + 1;
                Object obj = s2iVar.a[i4];
                if (obj instanceof byte[]) {
                    bArr = (byte[]) obj;
                } else {
                    ((p2i) obj).getClass();
                    bArr = null;
                }
                bArr2[i4] = bArr;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6 += 2) {
            byte[] bArr3 = bArr2[i6];
            byte[] bArr4 = bArr2[i6 + 1];
            if (q9t.a(bArr3, q9t.b)) {
                bArr2[i5] = bArr3;
                bArr2[i5 + 1] = wue.b.c(bArr4).getBytes(pe4.a);
            } else {
                for (byte b : bArr4) {
                    if (b < 32 || b > 126) {
                        String str4 = new String(bArr3, pe4.a);
                        Logger logger2 = q9t.a;
                        StringBuilder u = ouj.u("Metadata key=", str4, ", value=");
                        u.append(Arrays.toString(bArr4));
                        u.append(" contains invalid ASCII characters");
                        logger2.warning(u.toString());
                        break;
                    }
                }
                bArr2[i5] = bArr3;
                bArr2[i5 + 1] = bArr4;
            }
            i5 += 2;
        }
        if (i5 != i) {
            bArr2 = (byte[][]) Arrays.copyOfRange(bArr2, 0, i5);
        }
        for (int i7 = 0; i7 < bArr2.length; i7 += 2) {
            byte[] bArr5 = bArr2[i7];
            pn3 pn3Var = pn3.d;
            pn3 M = ovn.M(bArr5);
            byte[] bArr6 = M.a;
            if (bArr6.length != 0 && bArr6[0] != 58) {
                arrayList.add(new vtd(M, ovn.M(bArr2[i7 + 1])));
            }
        }
        kojVar.w = arrayList;
        sgr sgrVar = nojVar.v;
        if (sgrVar != null) {
            aVar.l.l(sgrVar, no4.d, true, new s2i());
            return;
        }
        if (nojVar.n.size() < nojVar.C) {
            nojVar.t(aVar);
            return;
        }
        nojVar.D.add(aVar);
        if (!nojVar.z) {
            nojVar.z = true;
            baf bafVar = nojVar.F;
            if (bafVar != null) {
                bafVar.b();
            }
        }
        if (aVar.c) {
            nojVar.M.F(aVar, true);
        }
    }

    public static void b(koj kojVar, hi3 hi3Var, boolean z, boolean z2) {
        if (kojVar.A) {
            return;
        }
        if (!kojVar.G) {
            o2g.U("streamId should be set", kojVar.J != -1);
            kojVar.E.r(z, kojVar.I, hi3Var, z2);
        } else {
            kojVar.x.t0(hi3Var, (int) hi3Var.b);
            kojVar.y |= z;
            kojVar.z |= z2;
        }
    }

    public static Charset g(s2i s2iVar) {
        String str = (String) s2iVar.c(xqd.j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return pe4.b;
    }

    public static sgr n(s2i s2iVar) {
        char charAt;
        Integer num = (Integer) s2iVar.c(L);
        if (num == null) {
            return sgr.n.i("Missing HTTP status code");
        }
        String str = (String) s2iVar.c(xqd.j);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return xqd.g(num.intValue()).c("invalid content-type: " + str);
    }

    public final void c(int i) {
        int i2 = this.C - i;
        this.C = i2;
        float f = i2;
        int i3 = this.u;
        if (f <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.D.z(this.J, i4);
        }
    }

    public final void d(sgr sgrVar, boolean z, s2i s2iVar) {
        if (this.A) {
            return;
        }
        this.A = true;
        boolean z2 = this.G;
        noj nojVar = this.F;
        if (!z2) {
            nojVar.i(this.J, sgrVar, no4.a, z, afb.CANCEL, s2iVar);
            return;
        }
        LinkedList linkedList = nojVar.D;
        a aVar = this.K;
        linkedList.remove(aVar);
        nojVar.n(aVar);
        this.w = null;
        this.x.b();
        this.G = false;
        if (s2iVar == null) {
            s2iVar = new s2i();
        }
        m(sgrVar, true, s2iVar);
    }

    public final void e(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h.g(sgrVar);
        this.j.n(sgrVar, no4Var, s2iVar);
        if (this.c != null) {
            sgrVar.g();
        }
    }

    public final void f(Throwable th) {
        d(sgr.f(th), true, new s2i());
    }

    public final void h(s2i s2iVar) {
        e3s e3sVar = e3s.b;
        o2g.U("Received headers on closed stream", !this.o);
        for (qo4 qo4Var : this.h.a) {
            qo4Var.b();
        }
        String str = (String) s2iVar.c(xqd.e);
        if (str != null) {
            bh7 bh7Var = (bh7) this.k.a.get(str);
            nq4 nq4Var = bh7Var != null ? bh7Var.a : null;
            if (nq4Var == null) {
                f(sgr.n.i("Can't find decompressor for ".concat(str)).b());
                return;
            } else if (nq4Var != e3sVar) {
                jzh jzhVar = this.a;
                jzhVar.getClass();
                o2g.U("Already set full stream decompressor", true);
                jzhVar.e = nq4Var;
            }
        }
        this.j.d(s2iVar);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.f && this.e < 32768 && !this.g;
            } finally {
            }
        }
        return z;
    }

    public final void j(int i, hi3 hi3Var, boolean z) {
        Throwable th;
        long j = hi3Var.b;
        int i2 = this.B - (((int) j) + i);
        this.B = i2;
        this.C -= i;
        if (i2 < 0) {
            this.D.o(this.J, afb.FLOW_CONTROL_ERROR);
            this.F.i(this.J, sgr.n.i("Received data size exceeded our receiving window size"), no4.a, false, null, null);
            return;
        }
        apj apjVar = new apj(hi3Var);
        sgr sgrVar = this.q;
        boolean z2 = false;
        if (sgrVar != null) {
            Charset charset = this.s;
            zjn zjnVar = akn.a;
            o2g.O(charset, "charset");
            int i3 = (int) hi3Var.b;
            byte[] bArr = new byte[i3];
            apjVar.H(bArr, 0, i3);
            this.q = sgrVar.c("DATA-----------------------------\n".concat(new String(bArr, charset)));
            apjVar.close();
            if (this.q.b.length() > 1000 || z) {
                d(this.q, false, this.r);
                return;
            }
            return;
        }
        if (!this.t) {
            d(sgr.n.i("headers not received before payload"), false, new s2i());
            return;
        }
        int i4 = (int) j;
        boolean z3 = true;
        try {
            if (this.o) {
                u5.g.log(Level.INFO, "Received data on closed stream");
                apjVar.close();
            } else {
                try {
                    jzh jzhVar = this.a;
                    jzhVar.getClass();
                    try {
                        if (!jzhVar.isClosed() && !jzhVar.q) {
                            jzhVar.l.Q(apjVar);
                            try {
                                jzhVar.a();
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (z3) {
                                    apjVar.close();
                                }
                                throw th;
                            }
                        }
                        apjVar.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        f(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z2) {
                            throw th;
                        }
                        apjVar.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i4 > 0) {
                    this.q = sgr.n.i("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.q = sgr.n.i("Received unexpected EOS on empty DATA frame from server");
                }
                s2i s2iVar = new s2i();
                this.r = s2iVar;
                m(this.q, false, s2iVar);
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void k(ArrayList arrayList, boolean z) {
        sgr c;
        q2i q2iVar = L;
        if (z) {
            byte[][] a = qvt.a(arrayList);
            s2i s2iVar = new s2i(a.length / 2, a);
            if (this.q == null && !this.t) {
                sgr n = n(s2iVar);
                this.q = n;
                if (n != null) {
                    this.r = s2iVar;
                }
            }
            sgr sgrVar = this.q;
            if (sgrVar != null) {
                sgr c2 = sgrVar.c("trailers: " + s2iVar);
                this.q = c2;
                d(c2, false, this.r);
                return;
            }
            q2i q2iVar2 = dwe.b;
            sgr sgrVar2 = (sgr) s2iVar.c(q2iVar2);
            if (sgrVar2 != null) {
                c = sgrVar2.i((String) s2iVar.c(dwe.a));
            } else if (this.t) {
                c = sgr.g.i("missing GRPC status in response");
            } else {
                Integer num = (Integer) s2iVar.c(q2iVar);
                c = (num != null ? xqd.g(num.intValue()) : sgr.n.i("missing HTTP status code")).c("missing GRPC status, inferred error from HTTP status code");
            }
            s2iVar.a(q2iVar);
            s2iVar.a(q2iVar2);
            s2iVar.a(dwe.a);
            if (this.o) {
                u5.g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c, s2iVar});
                return;
            }
            for (qo4 qo4Var : this.h.a) {
                qo4Var.e(s2iVar);
            }
            m(c, false, s2iVar);
            return;
        }
        byte[][] a2 = qvt.a(arrayList);
        s2i s2iVar2 = new s2i(a2.length / 2, a2);
        sgr sgrVar3 = this.q;
        if (sgrVar3 != null) {
            this.q = sgrVar3.c("headers: " + s2iVar2);
            return;
        }
        try {
            if (this.t) {
                sgr i = sgr.n.i("Received headers twice");
                this.q = i;
                this.q = i.c("headers: " + s2iVar2);
                this.r = s2iVar2;
                this.s = g(s2iVar2);
                return;
            }
            Integer num2 = (Integer) s2iVar2.c(q2iVar);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                sgr sgrVar4 = this.q;
                if (sgrVar4 != null) {
                    this.q = sgrVar4.c("headers: " + s2iVar2);
                    this.r = s2iVar2;
                    this.s = g(s2iVar2);
                    return;
                }
                return;
            }
            this.t = true;
            sgr n2 = n(s2iVar2);
            this.q = n2;
            if (n2 != null) {
                this.q = n2.c("headers: " + s2iVar2);
                this.r = s2iVar2;
                this.s = g(s2iVar2);
                return;
            }
            s2iVar2.a(q2iVar);
            s2iVar2.a(dwe.b);
            s2iVar2.a(dwe.a);
            h(s2iVar2);
            sgr sgrVar5 = this.q;
            if (sgrVar5 != null) {
                this.q = sgrVar5.c("headers: " + s2iVar2);
                this.r = s2iVar2;
                this.s = g(s2iVar2);
            }
        } catch (Throwable th) {
            sgr sgrVar6 = this.q;
            if (sgrVar6 != null) {
                this.q = sgrVar6.c("headers: " + s2iVar2);
                this.r = s2iVar2;
                this.s = g(s2iVar2);
            }
            throw th;
        }
    }

    public final void l(sgr sgrVar, no4 no4Var, boolean z, s2i s2iVar) {
        o2g.O(sgrVar, "status");
        if (!this.o || z) {
            this.o = true;
            this.p = sgrVar.g();
            synchronized (this.b) {
                try {
                    this.g = true;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            if (this.l) {
                this.m = null;
                e(sgrVar, no4Var, s2iVar);
                return;
            }
            this.m = new t5(this, sgrVar, no4Var, s2iVar, 0);
            jzh jzhVar = this.a;
            if (z) {
                jzhVar.close();
            } else {
                if (jzhVar.isClosed()) {
                    return;
                }
                if (jzhVar.l.c == 0) {
                    jzhVar.close();
                } else {
                    jzhVar.q = true;
                }
            }
        }
    }

    public final void m(sgr sgrVar, boolean z, s2i s2iVar) {
        l(sgrVar, no4.a, z, s2iVar);
    }
}
