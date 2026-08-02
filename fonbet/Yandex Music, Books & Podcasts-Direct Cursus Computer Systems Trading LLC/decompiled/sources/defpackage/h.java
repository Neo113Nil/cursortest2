package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h {
    public static final pn3 a;
    public static final pn3 b;
    public static final pn3 c;
    public static final pn3 d;
    public static final pn3 e;

    static {
        pn3 pn3Var = pn3.d;
        a = ovn.C("/");
        b = ovn.C("\\");
        c = ovn.C("/\\");
        d = ovn.C(".");
        e = ovn.C("..");
    }

    public static final int a(cak cakVar) {
        pn3 pn3Var = cakVar.a;
        if (pn3Var.d() != 0) {
            if (pn3Var.k(0) != 47) {
                if (pn3Var.k(0) == 92) {
                    if (pn3Var.d() > 2 && pn3Var.k(1) == 92) {
                        pn3 pn3Var2 = b;
                        pn3Var2.getClass();
                        int g = pn3Var.g(2, pn3Var2.i());
                        return g == -1 ? pn3Var.d() : g;
                    }
                } else if (pn3Var.d() > 2 && pn3Var.k(1) == 58 && pn3Var.k(2) == 92) {
                    char k = (char) pn3Var.k(0);
                    if ('a' <= k && k < '{') {
                        return 3;
                    }
                    if ('A' <= k && k < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final cak b(cak cakVar, cak cakVar2, boolean z) {
        cakVar2.getClass();
        if (a(cakVar2) != -1 || cakVar2.e() != null) {
            return cakVar2;
        }
        pn3 c2 = c(cakVar);
        if (c2 == null && (c2 = c(cakVar2)) == null) {
            c2 = f(cak.b);
        }
        hi3 hi3Var = new hi3();
        hi3Var.L0(cakVar.a);
        if (hi3Var.b > 0) {
            hi3Var.L0(c2);
        }
        hi3Var.L0(cakVar2.a);
        return d(hi3Var, z);
    }

    public static final pn3 c(cak cakVar) {
        pn3 pn3Var = cakVar.a;
        pn3 pn3Var2 = a;
        if (pn3.h(pn3Var, pn3Var2) != -1) {
            return pn3Var2;
        }
        pn3 pn3Var3 = cakVar.a;
        pn3 pn3Var4 = b;
        if (pn3.h(pn3Var3, pn3Var4) != -1) {
            return pn3Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cak d(hi3 hi3Var, boolean z) {
        pn3 pn3Var;
        long j;
        char P;
        boolean N;
        pn3 pn3Var2;
        int size;
        int i;
        pn3 g0;
        hi3 hi3Var2 = new hi3();
        pn3 pn3Var3 = null;
        int i2 = 0;
        while (true) {
            if (!hi3Var.A0(0L, a)) {
                pn3Var = b;
                if (!hi3Var.A0(0L, pn3Var)) {
                    break;
                }
            }
            byte readByte = hi3Var.readByte();
            if (pn3Var3 == null) {
                pn3Var3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && Intrinsics.d(pn3Var3, pn3Var);
        pn3 pn3Var4 = c;
        if (z2) {
            pn3Var3.getClass();
            hi3Var2.L0(pn3Var3);
            hi3Var2.L0(pn3Var3);
        } else if (i2 > 0) {
            pn3Var3.getClass();
            hi3Var2.L0(pn3Var3);
        } else {
            long C = hi3Var.C(pn3Var4);
            if (pn3Var3 == null) {
                pn3Var3 = C == -1 ? f(cak.b) : e(hi3Var.P(C));
            }
            if (Intrinsics.d(pn3Var3, pn3Var) && hi3Var.b >= 2) {
                j = -1;
                if (hi3Var.P(1L) == 58 && (('a' <= (P = (char) hi3Var.P(0L)) && P < '{') || ('A' <= P && P < '['))) {
                    if (C == 2) {
                        hi3Var2.t0(hi3Var, 3L);
                    } else {
                        hi3Var2.t0(hi3Var, 2L);
                    }
                }
                boolean z3 = hi3Var2.b <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    N = hi3Var.N();
                    pn3Var2 = d;
                    if (!N) {
                        break;
                    }
                    long C2 = hi3Var.C(pn3Var4);
                    if (C2 == j) {
                        g0 = hi3Var.g0(hi3Var.b);
                    } else {
                        g0 = hi3Var.g0(C2);
                        hi3Var.readByte();
                    }
                    pn3 pn3Var5 = e;
                    if (Intrinsics.d(g0, pn3Var5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.d(CollectionsKt.Y(arrayList), pn3Var5)))) {
                                arrayList.add(g0);
                            } else if (!z2 || arrayList.size() != 1) {
                                z75.B(arrayList);
                            }
                        }
                    } else if (!Intrinsics.d(g0, pn3Var2) && !Intrinsics.d(g0, pn3.d)) {
                        arrayList.add(g0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        hi3Var2.L0(pn3Var3);
                    }
                    hi3Var2.L0((pn3) arrayList.get(i));
                }
                if (hi3Var2.b == 0) {
                    hi3Var2.L0(pn3Var2);
                }
                return new cak(hi3Var2.g0(hi3Var2.b));
            }
        }
        j = -1;
        if (hi3Var2.b <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            N = hi3Var.N();
            pn3Var2 = d;
            if (!N) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (hi3Var2.b == 0) {
        }
        return new cak(hi3Var2.g0(hi3Var2.b));
    }

    public static final pn3 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        xq0.x(k5r.i(b2, "not a directory separator: "));
        return null;
    }

    public static final pn3 f(String str) {
        if (Intrinsics.d(str, "/")) {
            return a;
        }
        if (Intrinsics.d(str, "\\")) {
            return b;
        }
        xq0.x(f1d.g("not a directory separator: ", str));
        return null;
    }
}
