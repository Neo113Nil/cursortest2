package h2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final v0.j f2735a = new v0.j(new u(22), new m(23));

    /* renamed from: b, reason: collision with root package name */
    public static final v0.j f2736b = new v0.j(new u(23), new m(24));

    /* renamed from: c, reason: collision with root package name */
    public static final v0.j f2737c = new v0.j(new u(24), new m(25));

    public static a a(String str, h0 h0Var, long j3, s2.c cVar, k2.d dVar, int i10) {
        bc.v vVar = bc.v.f1067g;
        return new a(new o2.d(str, h0Var, vVar, vVar, dVar, cVar), i10, 1, j3);
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            m2.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j3 = (i11 & 4294967295L) | (i10 << 32);
        int i12 = g0.f2671c;
        return j3;
    }

    public static final int c(int i10, List list) {
        int i11;
        int i12 = ((n) bc.m.X(list)).f2688c;
        if (i10 > ((n) bc.m.X(list)).f2688c) {
            m2.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            n nVar = (n) list.get(i11);
            char c3 = nVar.f2687b > i10 ? (char) 1 : nVar.f2688c <= i10 ? (char) 65535 : (char) 0;
            if (c3 >= 0) {
                if (c3 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        m2.a.a("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + u2.a.a(list, null, new m(0), 31) + ']');
        return i11;
    }

    public static final int d(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            n nVar = (n) list.get(i12);
            char c3 = nVar.f2689d > i10 ? (char) 1 : nVar.f2690e <= i10 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i11 = i12 + 1;
            } else {
                if (c3 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final h0 e(h0 h0Var, s2.l lVar) {
        r2.o oVar;
        long j3;
        k2.l lVar2;
        k2.j jVar;
        n2.b bVar;
        a0 a0Var = h0Var.f2674a;
        r2.o oVar2 = b0.f2630d;
        r2.o oVar3 = a0Var.f2612a;
        if (oVar3.equals(r2.n.f6036a)) {
            oVar3 = b0.f2630d;
        }
        r2.o oVar4 = oVar3;
        long j6 = a0Var.f2613b;
        s2.o[] oVarArr = s2.n.f6400b;
        if ((j6 & 1095216660480L) == 0) {
            j6 = b0.f2627a;
        }
        long j10 = j6;
        k2.l lVar3 = a0Var.f2614c;
        if (lVar3 == null) {
            lVar3 = k2.l.f3612i;
        }
        k2.l lVar4 = lVar3;
        k2.j jVar2 = a0Var.f2615d;
        k2.j jVar3 = new k2.j(jVar2 != null ? jVar2.f3609a : 0);
        k2.k kVar = a0Var.f2616e;
        k2.k kVar2 = new k2.k(kVar != null ? kVar.f3610a : 65535);
        k2.r rVar = a0Var.f2617f;
        if (rVar == null) {
            rVar = k2.r.f3618a;
        }
        k2.r rVar2 = rVar;
        String str = a0Var.f2618g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = a0Var.f2619h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = b0.f2628b;
        }
        r2.a aVar = a0Var.f2620i;
        r2.a aVar2 = new r2.a(aVar != null ? aVar.f6013a : 0.0f);
        r2.p pVar = a0Var.f2621j;
        if (pVar == null) {
            pVar = r2.p.f6037c;
        }
        r2.p pVar2 = pVar;
        n2.b bVar2 = a0Var.f2622k;
        if (bVar2 == null) {
            n2.b bVar3 = n2.b.f5041i;
            a5.c cVar = n2.c.f5044a;
            cVar.getClass();
            LocaleList localeList = LocaleList.getDefault();
            oVar = oVar4;
            synchronized (((m6.i) cVar.f263i)) {
                j3 = j10;
                try {
                    bVar = (n2.b) cVar.f261g;
                    if (bVar == null || localeList != ((LocaleList) cVar.f262h)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        lVar2 = lVar4;
                        int i10 = 0;
                        while (i10 < size) {
                            arrayList.add(new n2.a(localeList.get(i10)));
                            i10++;
                            size = size;
                            jVar3 = jVar3;
                        }
                        jVar = jVar3;
                        bVar = new n2.b(arrayList);
                        cVar.f262h = localeList;
                        cVar.f261g = bVar;
                    } else {
                        lVar2 = lVar4;
                        jVar = jVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar2 = bVar;
        } else {
            oVar = oVar4;
            j3 = j10;
            lVar2 = lVar4;
            jVar = jVar3;
        }
        n2.b bVar4 = bVar2;
        long j12 = a0Var.f2623l;
        if (j12 == 16) {
            j12 = b0.f2629c;
        }
        r2.l lVar5 = a0Var.f2624m;
        if (lVar5 == null) {
            lVar5 = r2.l.f6032b;
        }
        f1.f0 f0Var = a0Var.f2625n;
        if (f0Var == null) {
            f0Var = f1.f0.f2248d;
        }
        h1.c cVar2 = a0Var.f2626o;
        if (cVar2 == null) {
            cVar2 = h1.f.f2601b;
        }
        a0 a0Var2 = new a0(oVar, j3, lVar2, jVar, kVar2, rVar2, str2, j11, aVar2, pVar2, bVar4, j12, lVar5, f0Var, cVar2);
        q qVar = h0Var.f2675b;
        int i11 = r.f2706b;
        int i12 = qVar.f2696a;
        int i13 = 5;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 5;
        }
        int i14 = qVar.f2697b;
        if (i14 == 3) {
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                i13 = 4;
            } else if (ordinal != 1) {
                throw new ac.d();
            }
        } else if (i14 == Integer.MIN_VALUE) {
            int ordinal2 = lVar.ordinal();
            if (ordinal2 == 0) {
                i13 = 1;
            } else {
                if (ordinal2 != 1) {
                    throw new ac.d();
                }
                i13 = 2;
            }
        } else {
            i13 = i14;
        }
        long j13 = qVar.f2698c;
        if ((j13 & 1095216660480L) == 0) {
            j13 = r.f2705a;
        }
        r2.q qVar2 = qVar.f2699d;
        if (qVar2 == null) {
            qVar2 = r2.q.f6040c;
        }
        s sVar = qVar.f2700e;
        r2.q qVar3 = qVar2;
        r2.i iVar = qVar.f2701f;
        int i15 = qVar.f2702g;
        if (i15 == 0) {
            i15 = r2.e.f6018b;
        }
        int i16 = qVar.f2703h;
        if (i16 == Integer.MIN_VALUE) {
            i16 = 1;
        }
        r2.s sVar2 = qVar.f2704i;
        if (sVar2 == null) {
            sVar2 = r2.s.f6044c;
        }
        return new h0(a0Var2, new q(i12, i13, j13, qVar3, sVar, iVar, i15, i16, sVar2), h0Var.f2676c);
    }
}
