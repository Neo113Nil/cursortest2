package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class t1a1 {
    public static final mvz0 a = new mvz0();

    public static final void a(boolean z, final long j, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1418011166);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.a(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 n = ljs0.n(c530.a, 48.0f, 8.0f);
            z910 d = pi6.d(x4c.B, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, n);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            g.e(z, null, k.d(null, null, 13), k.l(null, null, 13), null, wwg.S(-93934212, true, new zls() { // from class: d7n
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    o4b1.b(mt71.m(wzg0.common_bubble_tail, 0, fidVar2), null, null, null, null, 0.0f, new c36(j, 5), fidVar2, 48, 60);
                    return zy11.a;
                }
            }, btsVar), btsVar, (i2 & 14) | 200064, 18);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r23(i, 1, j, z);
        }
    }

    public static final void b(String str, long j, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-121111370);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            g.e(!(str == null || str.length() == 0), null, k.c(null, 15).a(k.e(null, 3)), k.k(null, 15).a(k.f(null, 3)), null, wwg.S(1366826718, true, new rk4(j, str), btsVar), btsVar, 200064, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hy8(str, j, i);
        }
    }

    public static final void c(zxi zxiVar, long j, fid fidVar, int i) {
        long j2;
        String str = zxiVar.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(706108427);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(zxiVar) ? 256 : 128) | 1024;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                j2 = ((el51) btsVar.m(gl51.a)).d();
            } else {
                btsVar.Y();
                j2 = j;
            }
            btsVar.u();
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c = ljs0.c(an91.m(c530Var, 32.0f, 0.0f, 2), 1.0f);
            lhl0 a3 = khl0.a(rh10.d, x4c.D, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(603292239);
            int i3 = zxiVar.a;
            int i4 = 0;
            while (i4 < i3) {
                a((zxiVar.b != i4 || str == null || str.length() == 0) ? false : true, j2, btsVar, 0);
                i4++;
            }
            btsVar.t(false);
            btsVar.t(true);
            b(str, j2, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new eye(zxiVar, j2, i, 1);
        }
    }

    public static final LinkedHashMap d(ArrayList arrayList) {
        String str = oq90.b;
        oq90 f = sms.f("/");
        LinkedHashMap l = kotlin.collections.b.l(new Pair(f, new vc61(f, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (vc61 vc61Var : a.x0(arrayList, new zc61())) {
            if (((vc61) l.put(vc61Var.a, vc61Var)) == null) {
                while (true) {
                    oq90 oq90Var = vc61Var.a;
                    oq90 c = oq90Var.c();
                    if (c != null) {
                        vc61 vc61Var2 = (vc61) l.get(c);
                        if (vc61Var2 != null) {
                            vc61Var2.q.add(oq90Var);
                            break;
                        }
                        vc61 vc61Var3 = new vc61(c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        l.put(c, vc61Var3);
                        vc61Var3.q.add(oq90Var);
                        vc61Var = vc61Var3;
                    }
                }
            }
        }
        return l;
    }

    public static final String e(int i) {
        rza.a(16);
        return HexString.STR_0x.concat(Integer.toString(i, 16));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7 A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #3 {all -> 0x0148, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:26:0x0078, B:28:0x0082, B:72:0x0147, B:82:0x0140, B:83:0x014c, B:108:0x01a7, B:114:0x01b4, B:117:0x01a2, B:11:0x01c0, B:15:0x01cc, B:16:0x01d3, B:133:0x01d4, B:134:0x01d7, B:135:0x01d8, B:136:0x01ed, B:106:0x019d, B:30:0x008b, B:32:0x0094, B:35:0x00a5, B:50:0x012a, B:64:0x0123, B:65:0x012e, B:66:0x0133, B:8:0x0029, B:19:0x0032, B:25:0x0059, B:130:0x01b8, B:131:0x01bd, B:78:0x013b), top: B:2:0x000a, inners: #0, #5, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b4 A[Catch: all -> 0x0148, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0148, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:26:0x0078, B:28:0x0082, B:72:0x0147, B:82:0x0140, B:83:0x014c, B:108:0x01a7, B:114:0x01b4, B:117:0x01a2, B:11:0x01c0, B:15:0x01cc, B:16:0x01d3, B:133:0x01d4, B:134:0x01d7, B:135:0x01d8, B:136:0x01ed, B:106:0x019d, B:30:0x008b, B:32:0x0094, B:35:0x00a5, B:50:0x012a, B:64:0x0123, B:65:0x012e, B:66:0x0133, B:8:0x0029, B:19:0x0032, B:25:0x0059, B:130:0x01b8, B:131:0x01bd, B:78:0x013b), top: B:2:0x000a, inners: #0, #5, #9, #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wc61 f(oq90 oq90Var, r1r r1rVar, tls tlsVar) {
        jci0 jci0Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        int d2;
        gfx B = r1rVar.B(oq90Var);
        try {
            long size = B.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + B.size());
            }
            long max = Math.max(size - 65558, 0L);
            do {
                jci0 jci0Var2 = new jci0(B.a(j));
                try {
                    if (jci0Var2.d2() == 101010256) {
                        int a2 = jci0Var2.a() & 65535;
                        int a3 = jci0Var2.a() & 65535;
                        long a4 = jci0Var2.a() & 65535;
                        if (a4 != (jci0Var2.a() & 65535) || a2 != 0 || a3 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        jci0Var2.skip(4L);
                        long d22 = jci0Var2.d2() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        int a5 = jci0Var2.a() & 65535;
                        ti6 ti6Var = new ti6(a5, a4, d22);
                        jci0Var2.j0(a5);
                        jci0Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            jci0Var2 = new jci0(B.a(j3));
                            try {
                                if (jci0Var2.d2() == 117853008) {
                                    int d23 = jci0Var2.d2();
                                    long X = jci0Var2.X();
                                    if (jci0Var2.d2() != 1 || d23 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    jci0Var2 = new jci0(B.a(X));
                                    try {
                                        d2 = jci0Var2.d2();
                                    } catch (Throwable th4) {
                                        try {
                                        } catch (Throwable th5) {
                                            ljo.a(th4, th5);
                                        }
                                        th3 = th4;
                                    }
                                    if (d2 != 101075792) {
                                        throw new IOException("bad zip: expected " + e(101075792) + " but was " + e(d2));
                                    }
                                    jci0Var2.skip(12L);
                                    int d24 = jci0Var2.d2();
                                    int d25 = jci0Var2.d2();
                                    long X2 = jci0Var2.X();
                                    if (X2 != jci0Var2.X() || d24 != 0 || d25 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    jci0Var2.skip(8L);
                                    try {
                                        th3 = null;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                    }
                                    ti6Var = new ti6(a5, X2, jci0Var2.X());
                                    if (th3 != null) {
                                        throw th3;
                                    }
                                }
                                try {
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                } catch (Throwable th9) {
                                    ljo.a(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        jci0 jci0Var3 = new jci0(B.a(ti6Var.c));
                        try {
                            long j4 = ti6Var.b;
                            while (j2 < j4) {
                                vc61 g = g(jci0Var3);
                                jci0Var = jci0Var3;
                                try {
                                    if (g.h >= ti6Var.c) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) tlsVar.invoke(g)).booleanValue()) {
                                        arrayList.add(g);
                                    }
                                    j2++;
                                    jci0Var3 = jci0Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        jci0Var.close();
                                    } catch (Throwable th11) {
                                        ljo.a(th, th11);
                                    }
                                    if (th == null) {
                                    }
                                }
                            }
                            try {
                                jci0Var3.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            jci0Var = jci0Var3;
                        }
                        if (th == null) {
                            throw th;
                        }
                        wc61 wc61Var = new wc61(oq90Var, r1rVar, d(arrayList));
                        try {
                            B.close();
                        } catch (Throwable unused) {
                        }
                        return wc61Var;
                    }
                    jci0Var2.close();
                    j--;
                } finally {
                    jci0Var2.close();
                }
            } while (j >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th14) {
            if (B == null) {
                throw th14;
            }
            try {
                B.close();
                throw th14;
            } catch (Throwable th15) {
                ljo.a(th14, th15);
                throw th14;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final vc61 g(final jci0 jci0Var) {
        int d2 = jci0Var.d2();
        if (d2 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(d2));
        }
        jci0Var.skip(4L);
        short a2 = jci0Var.a();
        int i = a2 & 65535;
        if ((a2 & 1) != 0) {
            ny61.v("unsupported zip: general purpose bit flag=".concat(e(i)));
            return null;
        }
        int a3 = jci0Var.a() & 65535;
        int a4 = jci0Var.a() & 65535;
        int a5 = jci0Var.a() & 65535;
        long d22 = jci0Var.d2() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = jci0Var.d2() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = jci0Var.d2() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        int a6 = jci0Var.a() & 65535;
        int a7 = jci0Var.a() & 65535;
        int a8 = jci0Var.a() & 65535;
        jci0Var.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = jci0Var.d2() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        String j0 = jci0Var.j0(a6);
        if (evu0.z(j0, (char) 0)) {
            ny61.v("bad zip: filename contains 0x00");
            return null;
        }
        long j = ref$LongRef2.element == _Gost_CryptoPro_PrivateKeyValues.maxDWORD ? 8L : 0L;
        if (ref$LongRef.element == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            j += 8;
        }
        if (ref$LongRef3.element == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            j += 8;
        }
        final long j2 = j;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        h(jci0Var, a7, new wls() { // from class: yc61
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                jci0 jci0Var2 = jci0Var;
                if (intValue == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                    if (ref$BooleanRef2.element) {
                        ny61.v("bad zip: zip64 extra repeated");
                        return null;
                    }
                    ref$BooleanRef2.element = true;
                    if (longValue < j2) {
                        ny61.v("bad zip: zip64 extra too short");
                        return null;
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long j3 = ref$LongRef4.element;
                    if (j3 == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                        j3 = jci0Var2.X();
                    }
                    ref$LongRef4.element = j3;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.element = ref$LongRef5.element == _Gost_CryptoPro_PrivateKeyValues.maxDWORD ? jci0Var2.X() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.element = ref$LongRef6.element == _Gost_CryptoPro_PrivateKeyValues.maxDWORD ? jci0Var2.X() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        ny61.v("bad zip: NTFS extra too short");
                        return null;
                    }
                    jci0Var2.skip(4L);
                    t1a1.h(jci0Var2, (int) (longValue - 4), new xc61(ref$ObjectRef, jci0Var2, ref$ObjectRef2, ref$ObjectRef3));
                }
                return zy11.a;
            }
        });
        if (j2 > 0 && !ref$BooleanRef.element) {
            ny61.v("bad zip: zip64 extra required but absent");
            return null;
        }
        String j02 = jci0Var.j0(a8);
        String str = oq90.b;
        return new vc61(sms.f("/").e(j0), cvu0.s(j0, "/", false), j02, d22, ref$LongRef.element, ref$LongRef2.element, a3, ref$LongRef3.element, a5, a4, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, (Long) ref$ObjectRef3.element, HProv.ALG_CLASS_ALL);
    }

    public static final void h(jci0 jci0Var, int i, wls wlsVar) {
        yp6 yp6Var = jci0Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                ny61.v("bad zip: truncated header in extra field");
                return;
            }
            int a2 = jci0Var.a() & 65535;
            long a3 = jci0Var.a() & 65535;
            long j2 = j - 4;
            if (j2 < a3) {
                ny61.v("bad zip: truncated value in extra field");
                return;
            }
            jci0Var.B1(a3);
            long j3 = yp6Var.b;
            wlsVar.invoke(Integer.valueOf(a2), Long.valueOf(a3));
            long j4 = (yp6Var.b + a3) - j3;
            if (j4 < 0) {
                ny61.v(oyr.i(a2, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    yp6Var.skip(j4);
                }
                j = j2 - a3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final vc61 i(jci0 jci0Var, vc61 vc61Var) {
        int d2 = jci0Var.d2();
        if (d2 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(d2));
        }
        jci0Var.skip(2L);
        short a2 = jci0Var.a();
        int i = a2 & 65535;
        if ((a2 & 1) != 0) {
            ny61.v("unsupported zip: general purpose bit flag=".concat(e(i)));
            return null;
        }
        jci0Var.skip(18L);
        int a3 = jci0Var.a() & 65535;
        jci0Var.skip(jci0Var.a() & 65535);
        if (vc61Var == null) {
            jci0Var.skip(a3);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        h(jci0Var, a3, new xc61(jci0Var, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new vc61(vc61Var.a, vc61Var.b, vc61Var.c, vc61Var.d, vc61Var.e, vc61Var.f, vc61Var.g, vc61Var.h, vc61Var.i, vc61Var.j, vc61Var.k, vc61Var.l, vc61Var.m, (Integer) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef3.element);
    }
}
