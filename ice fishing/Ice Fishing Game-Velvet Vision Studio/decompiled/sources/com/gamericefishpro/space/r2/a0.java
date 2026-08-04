package com.gamericefishpro.space.r2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final com.gamericefishpro.space.u6.c a = new com.gamericefishpro.space.u6.c(new u(9), new z(0));
    public static final com.gamericefishpro.space.u6.c b = new com.gamericefishpro.space.u6.c(new u(10), new z(1));
    public static final com.gamericefishpro.space.u6.c c = new com.gamericefishpro.space.u6.c(new u(11), new z(2));
    public static final com.gamericefishpro.space.u6.c d = new com.gamericefishpro.space.u6.c(new u(12), new z(3));
    public static final com.gamericefishpro.space.u6.c e = new com.gamericefishpro.space.u6.c(new u(13), new z(4));

    public static a a(String str, i0 i0Var, long j, com.gamericefishpro.space.c3.d dVar, com.gamericefishpro.space.u2.d dVar2, int i) {
        com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.ph.g0.d;
        return new a(new com.gamericefishpro.space.y2.c(str, i0Var, g0Var, g0Var, dVar2, dVar), i, 1, j);
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            com.gamericefishpro.space.w2.a.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = h0.c;
        return j;
    }

    public static final int c(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((m) CollectionsKt.B(list)).c;
        if (i > ((m) CollectionsKt.B(list)).c) {
            com.gamericefishpro.space.w2.a.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            m mVar = (m) list.get(i2);
            if (mVar.b > i) {
                b2 = 1;
            } else {
                b2 = mVar.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i2, "Found paragraph index ", " should be in range [0, ");
        sbK.append(list.size());
        sbK.append(").\nDebug info: index=");
        sbK.append(i);
        sbK.append(", paragraphs=[");
        sbK.append(com.gamericefishpro.space.e3.a.a(list, null, new com.gamericefishpro.space.j7.c(28), 31));
        sbK.append(']');
        com.gamericefishpro.space.w2.a.a(sbK.toString());
        return i2;
    }

    public static final int d(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            m mVar = (m) list.get(i3);
            if (mVar.d > i) {
                b2 = 1;
            } else {
                b2 = mVar.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:104:0x017c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0182  */
    /* JADX WARN: Code duplicated, block: B:110:0x0187  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    public static final i0 e(i0 i0Var, com.gamericefishpro.space.c3.l lVar) {
        com.gamericefishpro.space.b3.a aVar;
        com.gamericefishpro.space.b3.o oVar;
        com.gamericefishpro.space.u2.k kVar;
        long j;
        com.gamericefishpro.space.b3.q qVar;
        int i;
        int i2;
        com.gamericefishpro.space.b3.s sVar;
        b0 b0Var = i0Var.a;
        com.gamericefishpro.space.b3.o oVar2 = c0.d;
        com.gamericefishpro.space.b3.o oVar3 = b0Var.a;
        if (oVar3.equals(com.gamericefishpro.space.b3.n.a)) {
            oVar3 = c0.d;
        }
        com.gamericefishpro.space.b3.o oVar4 = oVar3;
        long j2 = b0Var.b;
        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = c0.a;
        }
        long j3 = j2;
        com.gamericefishpro.space.u2.k kVar2 = b0Var.c;
        if (kVar2 == null) {
            kVar2 = com.gamericefishpro.space.u2.k.i;
        }
        com.gamericefishpro.space.u2.k kVar3 = kVar2;
        com.gamericefishpro.space.u2.i iVar = b0Var.d;
        com.gamericefishpro.space.u2.i iVar2 = new com.gamericefishpro.space.u2.i(iVar != null ? iVar.a : 0);
        com.gamericefishpro.space.u2.j jVar = b0Var.e;
        com.gamericefishpro.space.u2.j jVar2 = new com.gamericefishpro.space.u2.j(jVar != null ? jVar.a : 65535);
        com.gamericefishpro.space.u2.b bVar = b0Var.f;
        if (bVar == null) {
            bVar = com.gamericefishpro.space.u2.b.a;
        }
        com.gamericefishpro.space.u2.b bVar2 = bVar;
        String str = b0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = b0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = c0.b;
        }
        com.gamericefishpro.space.b3.a aVar2 = b0Var.i;
        float f = aVar2 != null ? aVar2.a : 0.0f;
        com.gamericefishpro.space.b3.a aVar3 = new com.gamericefishpro.space.b3.a(Float.isNaN(f) ? 0.0f : f);
        com.gamericefishpro.space.b3.p pVar = b0Var.j;
        if (pVar == null) {
            pVar = com.gamericefishpro.space.b3.p.c;
        }
        com.gamericefishpro.space.b3.p pVar2 = pVar;
        com.gamericefishpro.space.x2.b bVar3 = b0Var.k;
        if (bVar3 == null) {
            com.gamericefishpro.space.x2.b bVar4 = com.gamericefishpro.space.x2.b.i;
            com.gamericefishpro.space.r5.b bVar5 = com.gamericefishpro.space.x2.c.a;
            bVar5.getClass();
            LocaleList localeList = LocaleList.getDefault();
            aVar = aVar3;
            synchronized (((com.gamericefishpro.space.u4.b) bVar5.v)) {
                oVar = oVar4;
                try {
                    com.gamericefishpro.space.x2.b bVar6 = (com.gamericefishpro.space.x2.b) bVar5.i;
                    if (bVar6 == null || localeList != ((LocaleList) bVar5.e)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        int i3 = 0;
                        while (i3 < size) {
                            arrayList.add(new com.gamericefishpro.space.x2.a(localeList.get(i3)));
                            i3++;
                            size = size;
                            kVar3 = kVar3;
                        }
                        kVar = kVar3;
                        com.gamericefishpro.space.x2.b bVar7 = new com.gamericefishpro.space.x2.b(arrayList);
                        bVar5.e = localeList;
                        bVar5.i = bVar7;
                        bVar3 = bVar7;
                    } else {
                        kVar = kVar3;
                        bVar3 = bVar6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            aVar = aVar3;
            oVar = oVar4;
            kVar = kVar3;
        }
        com.gamericefishpro.space.x2.b bVar8 = bVar3;
        long j5 = b0Var.l;
        if (j5 == 16) {
            j5 = c0.c;
        }
        com.gamericefishpro.space.b3.l lVar2 = b0Var.m;
        if (lVar2 == null) {
            lVar2 = com.gamericefishpro.space.b3.l.b;
        }
        com.gamericefishpro.space.o1.j0 j0Var = b0Var.n;
        if (j0Var == null) {
            j0Var = com.gamericefishpro.space.o1.j0.d;
        }
        com.gamericefishpro.space.q1.c cVar = b0Var.o;
        if (cVar == null) {
            cVar = com.gamericefishpro.space.q1.f.b;
        }
        b0 b0Var2 = new b0(oVar, j3, kVar, iVar2, jVar2, bVar2, str2, j4, aVar, pVar2, bVar8, j5, lVar2, j0Var, cVar);
        p pVar3 = i0Var.b;
        int i4 = q.b;
        int i5 = pVar3.a;
        int i6 = 5;
        if (i5 == 0) {
            i5 = 5;
        }
        int i7 = pVar3.b;
        if (i7 != 3) {
            if (i7 == 0) {
                int iOrdinal = lVar.ordinal();
                if (iOrdinal == 0) {
                    i7 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    i6 = 2;
                }
            }
            j = pVar3.c;
            if ((j & 1095216660480L) == 0) {
                j = q.a;
            }
            qVar = pVar3.d;
            if (qVar == null) {
                qVar = com.gamericefishpro.space.b3.q.c;
            }
            long j6 = j;
            r rVar = pVar3.e;
            com.gamericefishpro.space.b3.i iVar3 = pVar3.f;
            i = pVar3.g;
            if (i == 0) {
                i = com.gamericefishpro.space.b3.e.b;
            }
            i2 = pVar3.h;
            if (i2 == 0) {
                i2 = 1;
            }
            sVar = pVar3.i;
            if (sVar == null) {
                sVar = com.gamericefishpro.space.b3.s.c;
            }
            return new i0(b0Var2, new p(i5, i7, j6, qVar, rVar, iVar3, i, i2, sVar), i0Var.c);
        }
        int iOrdinal2 = lVar.ordinal();
        if (iOrdinal2 == 0) {
            i6 = 4;
        } else if (iOrdinal2 != 1) {
            throw new com.gamericefishpro.space.oh.k();
        }
        i7 = i6;
        j = pVar3.c;
        if ((j & 1095216660480L) == 0) {
            j = q.a;
        }
        qVar = pVar3.d;
        if (qVar == null) {
            qVar = com.gamericefishpro.space.b3.q.c;
        }
        long j7 = j;
        r rVar2 = pVar3.e;
        com.gamericefishpro.space.b3.i iVar4 = pVar3.f;
        i = pVar3.g;
        if (i == 0) {
            i = com.gamericefishpro.space.b3.e.b;
        }
        i2 = pVar3.h;
        if (i2 == 0) {
            i2 = 1;
        }
        sVar = pVar3.i;
        if (sVar == null) {
            sVar = com.gamericefishpro.space.b3.s.c;
        }
        return new i0(b0Var2, new p(i5, i7, j7, qVar, rVar2, iVar4, i, i2, sVar), i0Var.c);
    }
}
