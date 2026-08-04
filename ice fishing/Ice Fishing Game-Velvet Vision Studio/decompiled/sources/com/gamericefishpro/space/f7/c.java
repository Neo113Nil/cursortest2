package com.gamericefishpro.space.f7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.c7.m;
import com.gamericefishpro.space.c7.n;
import com.gamericefishpro.space.d0.p;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d7.k;
import com.gamericefishpro.space.d7.l;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.si.e0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final com.gamericefishpro.space.d7.c a;
    public final com.gamericefishpro.space.d7.f b;
    public final m c;
    public final k d;
    public final com.gamericefishpro.space.c7.e e;
    public final com.gamericefishpro.space.c7.e f;
    public final com.gamericefishpro.space.c7.e g;
    public final com.gamericefishpro.space.c7.e h;

    public c(com.gamericefishpro.space.d7.c fishLevelDao, com.gamericefishpro.space.d7.f achievementDao, m settingsDataStore, k historyDao) {
        Intrinsics.checkNotNullParameter(fishLevelDao, "fishLevelDao");
        Intrinsics.checkNotNullParameter(achievementDao, "achievementDao");
        Intrinsics.checkNotNullParameter(settingsDataStore, "settingsDataStore");
        Intrinsics.checkNotNullParameter(historyDao, "historyDao");
        this.a = fishLevelDao;
        this.b = achievementDao;
        this.c = settingsDataStore;
        this.d = historyDao;
        this.e = settingsDataStore.b;
        this.f = settingsDataStore.c;
        this.g = settingsDataStore.d;
        this.h = settingsDataStore.e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c A[PHI: r1 r2 r3 r4
      0x008c: PHI (r1v7 int) = (r1v5 int), (r1v13 int) binds: [B:42:0x0127, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r2v6 int) = (r2v4 int), (r2v9 int) binds: [B:42:0x0127, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r3v7 int) = (r3v5 int), (r3v10 int) binds: [B:42:0x0127, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r4v11 com.gamericefishpro.space.f7.c) = (r4v9 com.gamericefishpro.space.f7.c), (r4v12 com.gamericefishpro.space.f7.c) binds: [B:42:0x0127, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca A[DONT_INVERT, PHI: r1 r2 r3
      0x01ca: PHI (r1v16 int) = (r1v14 int), (r1v14 int), (r1v17 int) binds: [B:52:0x01b2, B:54:0x01c6, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r2v12 int) = (r2v10 int), (r2v10 int), (r2v16 int) binds: [B:52:0x01b2, B:54:0x01c6, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r3v13 com.gamericefishpro.space.f7.c) = (r3v11 com.gamericefishpro.space.f7.c), (r3v11 com.gamericefishpro.space.f7.c), (r3v14 com.gamericefishpro.space.f7.c) binds: [B:52:0x01b2, B:54:0x01c6, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e5 A[PHI: r1 r3
      0x01e5: PHI (r1v18 int) = (r1v16 int), (r1v19 int) binds: [B:56:0x01ca, B:61:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r3v15 com.gamericefishpro.space.f7.c) = (r3v13 com.gamericefishpro.space.f7.c), (r3v16 com.gamericefishpro.space.f7.c) binds: [B:56:0x01ca, B:61:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x020c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    /* JADX WARN: Code duplicated, block: B:72:0x0230  */
    /* JADX WARN: Code duplicated, block: B:75:0x0249 A[PHI: r2 r5
      0x0249: PHI (r2v31 com.gamericefishpro.space.f7.c) = (r2v29 com.gamericefishpro.space.f7.c), (r2v32 com.gamericefishpro.space.f7.c) binds: [B:73:0x0246, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r5v25 java.lang.Object) = (r5v24 java.lang.Object), (r5v1 java.lang.Object) binds: [B:73:0x0246, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0251  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0268 A[PHI: r1 r2
      0x0268: PHI (r1v33 int) = (r1v27 int), (r1v34 int) binds: [B:76:0x024f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r2v35 com.gamericefishpro.space.f7.c) = (r2v31 com.gamericefishpro.space.f7.c), (r2v36 com.gamericefishpro.space.f7.c) binds: [B:76:0x024f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027f, code lost:
    
        if (r1.a("perfect_score", r2, r6) == r7) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, int i3, int i4, com.gamericefishpro.space.vh.c cVar) {
        a aVar;
        c cVar2;
        Object objU;
        int i5;
        int i6;
        c cVar3;
        Object objH;
        int i7;
        int i8;
        Object objH2;
        int i9;
        int i10;
        c cVar4;
        String str;
        com.gamericefishpro.space.d7.f fVar;
        long jCurrentTimeMillis;
        com.gamericefishpro.space.d7.f fVar2;
        long jCurrentTimeMillis2;
        c cVar5;
        c cVar6;
        com.gamericefishpro.space.d7.f fVar3;
        long jCurrentTimeMillis3;
        int iIntValue;
        com.gamericefishpro.space.d7.f fVar4;
        long jCurrentTimeMillis4;
        int i11;
        final int i12 = i;
        final int i13 = i2;
        final int i14 = i3;
        final int i15 = i4;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i16 = aVar.A;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                aVar.A = i16 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objH3 = aVar.y;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        final int i17 = 0;
        switch (aVar.A) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.wa.b.P(objH3);
                aVar.d = this;
                aVar.e = i12;
                aVar.i = i13;
                aVar.v = i14;
                aVar.w = i15;
                aVar.A = 1;
                Object objH4 = com.gamericefishpro.space.hj.c.H(this.a.a, aVar, new Function1() { // from class: com.gamericefishpro.space.d7.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Exception {
                        int i18 = i13;
                        int i19 = i14;
                        int i20 = i15;
                        int i21 = i12;
                        com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                        Intrinsics.checkNotNullParameter(_connection, "_connection");
                        com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE fish_levels SET isLocked = 0, stars = ?, bestScore = ?, coinsEarned = ? WHERE level = ?");
                        try {
                            cVarO.a(1, i18);
                            cVarO.a(2, i19);
                            cVarO.a(3, i20);
                            cVarO.a(4, i21);
                            cVarO.H();
                            return Unit.a;
                        } finally {
                            cVarO.close();
                        }
                    }
                }, false, true);
                if (objH4 != aVar2) {
                    objH4 = Unit.a;
                }
                if (objH4 != aVar2) {
                    cVar2 = this;
                    m mVar = cVar2.c;
                    aVar.d = cVar2;
                    aVar.e = i12;
                    aVar.i = i13;
                    aVar.v = i14;
                    aVar.A = 2;
                    objU = y3.u(n.a(mVar.a), new com.gamericefishpro.space.c7.b(i15, 0, null), aVar);
                    if (objU != aVar2) {
                        objU = Unit.a;
                    }
                    if (objU != aVar2) {
                        int i18 = i14;
                        i5 = i12;
                        i6 = i18;
                        cVar3 = cVar2;
                        com.gamericefishpro.space.d7.c cVar7 = cVar3.a;
                        final int i19 = i5 + 1;
                        aVar.d = cVar3;
                        aVar.e = i5;
                        aVar.i = i13;
                        aVar.v = i6;
                        aVar.A = 3;
                        objH = com.gamericefishpro.space.hj.c.H(cVar7.a, aVar, new Function1() { // from class: com.gamericefishpro.space.d7.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) throws Exception {
                                int i110 = i17;
                                int i111 = i17;
                                int i20 = i17;
                                int i21 = i19;
                                com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                                Intrinsics.checkNotNullParameter(_connection, "_connection");
                                com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE fish_levels SET isLocked = 0, stars = ?, bestScore = ?, coinsEarned = ? WHERE level = ?");
                                try {
                                    cVarO.a(1, i110);
                                    cVarO.a(2, i111);
                                    cVarO.a(3, i20);
                                    cVarO.a(4, i21);
                                    cVarO.H();
                                    return Unit.a;
                                } finally {
                                    cVarO.close();
                                }
                            }
                        }, false, true);
                        if (objH != aVar2) {
                            objH = Unit.a;
                        }
                        if (objH != aVar2) {
                            int i20 = i6;
                            i7 = i13;
                            i8 = i5;
                            k kVar = cVar3.d;
                            l lVar = new l(i8, i20, i7, 97, null, true);
                            aVar.d = cVar3;
                            aVar.e = i8;
                            aVar.i = i7;
                            aVar.A = 4;
                            objH2 = com.gamericefishpro.space.hj.c.H(kVar.a, aVar, new q0(5, kVar, lVar), false, true);
                            if (objH2 != aVar2) {
                                objH2 = Unit.a;
                            }
                            if (objH2 != aVar2) {
                                i9 = i7;
                                i10 = i8;
                                cVar4 = cVar3;
                                str = (String) m0.e(new Pair(new Integer(1), "first_level"), new Pair(new Integer(5), "level_5"), new Pair(new Integer(10), "level_10"), new Pair(new Integer(20), "level_20"), new Pair(new Integer(30), "level_30")).get(new Integer(i10));
                                if (str != null) {
                                    fVar = cVar4.b;
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                    aVar.d = cVar4;
                                    aVar.e = i10;
                                    aVar.i = i9;
                                    aVar.A = 5;
                                    if (fVar.a(str, jCurrentTimeMillis, aVar) != aVar2) {
                                        if (i10 == 1) {
                                            fVar2 = cVar4.b;
                                            jCurrentTimeMillis2 = System.currentTimeMillis();
                                            aVar.d = cVar4;
                                            aVar.e = i9;
                                            aVar.A = 6;
                                            if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                                cVar5 = cVar4;
                                                cVar4 = cVar5;
                                                m mVar2 = cVar4.c;
                                                aVar.d = cVar4;
                                                aVar.e = i9;
                                                aVar.A = 7;
                                                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar2.a)).e).j(), 0), aVar);
                                                if (objH3 != aVar2) {
                                                    cVar6 = cVar4;
                                                    if (((Number) objH3).intValue() >= 500) {
                                                        fVar3 = cVar6.b;
                                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                                        aVar.d = cVar6;
                                                        aVar.e = i9;
                                                        aVar.A = 8;
                                                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                        }
                                                    }
                                                    if (i9 == 3) {
                                                        com.gamericefishpro.space.d7.c cVar8 = cVar6.a;
                                                        aVar.d = cVar6;
                                                        aVar.A = 9;
                                                        objH3 = com.gamericefishpro.space.hj.c.H(cVar8.a, aVar, new p(9), true, false);
                                                        if (objH3 != aVar2) {
                                                            iIntValue = ((Number) objH3).intValue();
                                                            if (iIntValue >= 5) {
                                                                fVar4 = cVar6.b;
                                                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                                                aVar.d = cVar6;
                                                                aVar.e = iIntValue;
                                                                i11 = 10;
                                                                aVar.A = 10;
                                                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                                }
                                                            } else {
                                                                i11 = 10;
                                                            }
                                                            if (iIntValue >= i11) {
                                                                com.gamericefishpro.space.d7.f fVar5 = cVar6.b;
                                                                long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                                aVar.d = null;
                                                                aVar.A = 11;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    return Unit.a;
                                                }
                                            }
                                        } else {
                                            m mVar3 = cVar4.c;
                                            aVar.d = cVar4;
                                            aVar.e = i9;
                                            aVar.A = 7;
                                            objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar3.a)).e).j(), 0), aVar);
                                            if (objH3 != aVar2) {
                                                cVar6 = cVar4;
                                                if (((Number) objH3).intValue() >= 500) {
                                                    fVar3 = cVar6.b;
                                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = i9;
                                                    aVar.A = 8;
                                                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                    }
                                                }
                                                if (i9 == 3) {
                                                    com.gamericefishpro.space.d7.c cVar9 = cVar6.a;
                                                    aVar.d = cVar6;
                                                    aVar.A = 9;
                                                    objH3 = com.gamericefishpro.space.hj.c.H(cVar9.a, aVar, new p(9), true, false);
                                                    if (objH3 != aVar2) {
                                                        iIntValue = ((Number) objH3).intValue();
                                                        if (iIntValue >= 5) {
                                                            fVar4 = cVar6.b;
                                                            jCurrentTimeMillis4 = System.currentTimeMillis();
                                                            aVar.d = cVar6;
                                                            aVar.e = iIntValue;
                                                            i11 = 10;
                                                            aVar.A = 10;
                                                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                            }
                                                        } else {
                                                            i11 = 10;
                                                        }
                                                        if (iIntValue >= i11) {
                                                            com.gamericefishpro.space.d7.f fVar6 = cVar6.b;
                                                            long jCurrentTimeMillis6 = System.currentTimeMillis();
                                                            aVar.d = null;
                                                            aVar.A = 11;
                                                        }
                                                    }
                                                    break;
                                                }
                                                return Unit.a;
                                            }
                                        }
                                    }
                                } else if (i10 == 1) {
                                    fVar2 = cVar4.b;
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 6;
                                    if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                        cVar5 = cVar4;
                                        cVar4 = cVar5;
                                        m mVar4 = cVar4.c;
                                        aVar.d = cVar4;
                                        aVar.e = i9;
                                        aVar.A = 7;
                                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar4.a)).e).j(), 0), aVar);
                                        if (objH3 != aVar2) {
                                            cVar6 = cVar4;
                                            if (((Number) objH3).intValue() >= 500) {
                                                fVar3 = cVar6.b;
                                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = i9;
                                                aVar.A = 8;
                                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                }
                                            }
                                            if (i9 == 3) {
                                                com.gamericefishpro.space.d7.c cVar10 = cVar6.a;
                                                aVar.d = cVar6;
                                                aVar.A = 9;
                                                objH3 = com.gamericefishpro.space.hj.c.H(cVar10.a, aVar, new p(9), true, false);
                                                if (objH3 != aVar2) {
                                                    iIntValue = ((Number) objH3).intValue();
                                                    if (iIntValue >= 5) {
                                                        fVar4 = cVar6.b;
                                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                                        aVar.d = cVar6;
                                                        aVar.e = iIntValue;
                                                        i11 = 10;
                                                        aVar.A = 10;
                                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                        }
                                                    } else {
                                                        i11 = 10;
                                                    }
                                                    if (iIntValue >= i11) {
                                                        com.gamericefishpro.space.d7.f fVar7 = cVar6.b;
                                                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                                                        aVar.d = null;
                                                        aVar.A = 11;
                                                    }
                                                }
                                                break;
                                            }
                                            return Unit.a;
                                        }
                                    }
                                } else {
                                    m mVar5 = cVar4.c;
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 7;
                                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar5.a)).e).j(), 0), aVar);
                                    if (objH3 != aVar2) {
                                        cVar6 = cVar4;
                                        if (((Number) objH3).intValue() >= 500) {
                                            fVar3 = cVar6.b;
                                            jCurrentTimeMillis3 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = i9;
                                            aVar.A = 8;
                                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                            }
                                        }
                                        if (i9 == 3) {
                                            com.gamericefishpro.space.d7.c cVar11 = cVar6.a;
                                            aVar.d = cVar6;
                                            aVar.A = 9;
                                            objH3 = com.gamericefishpro.space.hj.c.H(cVar11.a, aVar, new p(9), true, false);
                                            if (objH3 != aVar2) {
                                                iIntValue = ((Number) objH3).intValue();
                                                if (iIntValue >= 5) {
                                                    fVar4 = cVar6.b;
                                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = iIntValue;
                                                    i11 = 10;
                                                    aVar.A = 10;
                                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                    }
                                                } else {
                                                    i11 = 10;
                                                }
                                                if (iIntValue >= i11) {
                                                    com.gamericefishpro.space.d7.f fVar8 = cVar6.b;
                                                    long jCurrentTimeMillis8 = System.currentTimeMillis();
                                                    aVar.d = null;
                                                    aVar.A = 11;
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar2;
            case 1:
                int i21 = aVar.w;
                int i22 = aVar.v;
                int i23 = aVar.i;
                int i24 = aVar.e;
                cVar2 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                i15 = i21;
                i12 = i24;
                i14 = i22;
                i13 = i23;
                m mVar6 = cVar2.c;
                aVar.d = cVar2;
                aVar.e = i12;
                aVar.i = i13;
                aVar.v = i14;
                aVar.A = 2;
                objU = y3.u(n.a(mVar6.a), new com.gamericefishpro.space.c7.b(i15, 0, null), aVar);
                if (objU != aVar2) {
                    objU = Unit.a;
                }
                if (objU != aVar2) {
                    int i110 = i14;
                    i5 = i12;
                    i6 = i110;
                    cVar3 = cVar2;
                    com.gamericefishpro.space.d7.c cVar12 = cVar3.a;
                    final int i111 = i5 + 1;
                    aVar.d = cVar3;
                    aVar.e = i5;
                    aVar.i = i13;
                    aVar.v = i6;
                    aVar.A = 3;
                    objH = com.gamericefishpro.space.hj.c.H(cVar12.a, aVar, new Function1() { // from class: com.gamericefishpro.space.d7.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws Exception {
                            int i112 = i17;
                            int i113 = i17;
                            int i25 = i17;
                            int i26 = i111;
                            com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                            Intrinsics.checkNotNullParameter(_connection, "_connection");
                            com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE fish_levels SET isLocked = 0, stars = ?, bestScore = ?, coinsEarned = ? WHERE level = ?");
                            try {
                                cVarO.a(1, i112);
                                cVarO.a(2, i113);
                                cVarO.a(3, i25);
                                cVarO.a(4, i26);
                                cVarO.H();
                                return Unit.a;
                            } finally {
                                cVarO.close();
                            }
                        }
                    }, false, true);
                    if (objH != aVar2) {
                        objH = Unit.a;
                    }
                    if (objH != aVar2) {
                        int i25 = i6;
                        i7 = i13;
                        i8 = i5;
                        k kVar2 = cVar3.d;
                        l lVar2 = new l(i8, i25, i7, 97, null, true);
                        aVar.d = cVar3;
                        aVar.e = i8;
                        aVar.i = i7;
                        aVar.A = 4;
                        objH2 = com.gamericefishpro.space.hj.c.H(kVar2.a, aVar, new q0(5, kVar2, lVar2), false, true);
                        if (objH2 != aVar2) {
                            objH2 = Unit.a;
                        }
                        if (objH2 != aVar2) {
                            i9 = i7;
                            i10 = i8;
                            cVar4 = cVar3;
                            str = (String) m0.e(new Pair(new Integer(1), "first_level"), new Pair(new Integer(5), "level_5"), new Pair(new Integer(10), "level_10"), new Pair(new Integer(20), "level_20"), new Pair(new Integer(30), "level_30")).get(new Integer(i10));
                            if (str != null) {
                                fVar = cVar4.b;
                                jCurrentTimeMillis = System.currentTimeMillis();
                                aVar.d = cVar4;
                                aVar.e = i10;
                                aVar.i = i9;
                                aVar.A = 5;
                                if (fVar.a(str, jCurrentTimeMillis, aVar) != aVar2) {
                                    if (i10 == 1) {
                                        fVar2 = cVar4.b;
                                        jCurrentTimeMillis2 = System.currentTimeMillis();
                                        aVar.d = cVar4;
                                        aVar.e = i9;
                                        aVar.A = 6;
                                        if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                            cVar5 = cVar4;
                                            cVar4 = cVar5;
                                            m mVar7 = cVar4.c;
                                            aVar.d = cVar4;
                                            aVar.e = i9;
                                            aVar.A = 7;
                                            objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar7.a)).e).j(), 0), aVar);
                                            if (objH3 != aVar2) {
                                                cVar6 = cVar4;
                                                if (((Number) objH3).intValue() >= 500) {
                                                    fVar3 = cVar6.b;
                                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = i9;
                                                    aVar.A = 8;
                                                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                    }
                                                }
                                                if (i9 == 3) {
                                                    com.gamericefishpro.space.d7.c cVar13 = cVar6.a;
                                                    aVar.d = cVar6;
                                                    aVar.A = 9;
                                                    objH3 = com.gamericefishpro.space.hj.c.H(cVar13.a, aVar, new p(9), true, false);
                                                    if (objH3 != aVar2) {
                                                        iIntValue = ((Number) objH3).intValue();
                                                        if (iIntValue >= 5) {
                                                            fVar4 = cVar6.b;
                                                            jCurrentTimeMillis4 = System.currentTimeMillis();
                                                            aVar.d = cVar6;
                                                            aVar.e = iIntValue;
                                                            i11 = 10;
                                                            aVar.A = 10;
                                                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                            }
                                                        } else {
                                                            i11 = 10;
                                                        }
                                                        if (iIntValue >= i11) {
                                                            com.gamericefishpro.space.d7.f fVar9 = cVar6.b;
                                                            long jCurrentTimeMillis9 = System.currentTimeMillis();
                                                            aVar.d = null;
                                                            aVar.A = 11;
                                                        }
                                                    }
                                                    break;
                                                }
                                                return Unit.a;
                                            }
                                        }
                                    } else {
                                        m mVar8 = cVar4.c;
                                        aVar.d = cVar4;
                                        aVar.e = i9;
                                        aVar.A = 7;
                                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar8.a)).e).j(), 0), aVar);
                                        if (objH3 != aVar2) {
                                            cVar6 = cVar4;
                                            if (((Number) objH3).intValue() >= 500) {
                                                fVar3 = cVar6.b;
                                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = i9;
                                                aVar.A = 8;
                                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                }
                                            }
                                            if (i9 == 3) {
                                                com.gamericefishpro.space.d7.c cVar14 = cVar6.a;
                                                aVar.d = cVar6;
                                                aVar.A = 9;
                                                objH3 = com.gamericefishpro.space.hj.c.H(cVar14.a, aVar, new p(9), true, false);
                                                if (objH3 != aVar2) {
                                                    iIntValue = ((Number) objH3).intValue();
                                                    if (iIntValue >= 5) {
                                                        fVar4 = cVar6.b;
                                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                                        aVar.d = cVar6;
                                                        aVar.e = iIntValue;
                                                        i11 = 10;
                                                        aVar.A = 10;
                                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                        }
                                                    } else {
                                                        i11 = 10;
                                                    }
                                                    if (iIntValue >= i11) {
                                                        com.gamericefishpro.space.d7.f fVar10 = cVar6.b;
                                                        long jCurrentTimeMillis10 = System.currentTimeMillis();
                                                        aVar.d = null;
                                                        aVar.A = 11;
                                                    }
                                                }
                                                break;
                                            }
                                            return Unit.a;
                                        }
                                    }
                                }
                            } else if (i10 == 1) {
                                fVar2 = cVar4.b;
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 6;
                                if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                    cVar5 = cVar4;
                                    cVar4 = cVar5;
                                    m mVar9 = cVar4.c;
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 7;
                                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar9.a)).e).j(), 0), aVar);
                                    if (objH3 != aVar2) {
                                        cVar6 = cVar4;
                                        if (((Number) objH3).intValue() >= 500) {
                                            fVar3 = cVar6.b;
                                            jCurrentTimeMillis3 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = i9;
                                            aVar.A = 8;
                                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                            }
                                        }
                                        if (i9 == 3) {
                                            com.gamericefishpro.space.d7.c cVar15 = cVar6.a;
                                            aVar.d = cVar6;
                                            aVar.A = 9;
                                            objH3 = com.gamericefishpro.space.hj.c.H(cVar15.a, aVar, new p(9), true, false);
                                            if (objH3 != aVar2) {
                                                iIntValue = ((Number) objH3).intValue();
                                                if (iIntValue >= 5) {
                                                    fVar4 = cVar6.b;
                                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = iIntValue;
                                                    i11 = 10;
                                                    aVar.A = 10;
                                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                    }
                                                } else {
                                                    i11 = 10;
                                                }
                                                if (iIntValue >= i11) {
                                                    com.gamericefishpro.space.d7.f fVar11 = cVar6.b;
                                                    long jCurrentTimeMillis11 = System.currentTimeMillis();
                                                    aVar.d = null;
                                                    aVar.A = 11;
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            } else {
                                m mVar10 = cVar4.c;
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 7;
                                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar10.a)).e).j(), 0), aVar);
                                if (objH3 != aVar2) {
                                    cVar6 = cVar4;
                                    if (((Number) objH3).intValue() >= 500) {
                                        fVar3 = cVar6.b;
                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = i9;
                                        aVar.A = 8;
                                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                        }
                                    }
                                    if (i9 == 3) {
                                        com.gamericefishpro.space.d7.c cVar16 = cVar6.a;
                                        aVar.d = cVar6;
                                        aVar.A = 9;
                                        objH3 = com.gamericefishpro.space.hj.c.H(cVar16.a, aVar, new p(9), true, false);
                                        if (objH3 != aVar2) {
                                            iIntValue = ((Number) objH3).intValue();
                                            if (iIntValue >= 5) {
                                                fVar4 = cVar6.b;
                                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = iIntValue;
                                                i11 = 10;
                                                aVar.A = 10;
                                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                }
                                            } else {
                                                i11 = 10;
                                            }
                                            if (iIntValue >= i11) {
                                                com.gamericefishpro.space.d7.f fVar12 = cVar6.b;
                                                long jCurrentTimeMillis12 = System.currentTimeMillis();
                                                aVar.d = null;
                                                aVar.A = 11;
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                return aVar2;
            case 2:
                i6 = aVar.v;
                i13 = aVar.i;
                i5 = aVar.e;
                cVar3 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                com.gamericefishpro.space.d7.c cVar17 = cVar3.a;
                final int i112 = i5 + 1;
                aVar.d = cVar3;
                aVar.e = i5;
                aVar.i = i13;
                aVar.v = i6;
                aVar.A = 3;
                objH = com.gamericefishpro.space.hj.c.H(cVar17.a, aVar, new Function1() { // from class: com.gamericefishpro.space.d7.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Exception {
                        int i113 = i17;
                        int i114 = i17;
                        int i26 = i17;
                        int i27 = i112;
                        com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                        Intrinsics.checkNotNullParameter(_connection, "_connection");
                        com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE fish_levels SET isLocked = 0, stars = ?, bestScore = ?, coinsEarned = ? WHERE level = ?");
                        try {
                            cVarO.a(1, i113);
                            cVarO.a(2, i114);
                            cVarO.a(3, i26);
                            cVarO.a(4, i27);
                            cVarO.H();
                            return Unit.a;
                        } finally {
                            cVarO.close();
                        }
                    }
                }, false, true);
                if (objH != aVar2) {
                    objH = Unit.a;
                }
                if (objH != aVar2) {
                    int i26 = i6;
                    i7 = i13;
                    i8 = i5;
                    k kVar3 = cVar3.d;
                    l lVar3 = new l(i8, i26, i7, 97, null, true);
                    aVar.d = cVar3;
                    aVar.e = i8;
                    aVar.i = i7;
                    aVar.A = 4;
                    objH2 = com.gamericefishpro.space.hj.c.H(kVar3.a, aVar, new q0(5, kVar3, lVar3), false, true);
                    if (objH2 != aVar2) {
                        objH2 = Unit.a;
                    }
                    if (objH2 != aVar2) {
                        i9 = i7;
                        i10 = i8;
                        cVar4 = cVar3;
                        str = (String) m0.e(new Pair(new Integer(1), "first_level"), new Pair(new Integer(5), "level_5"), new Pair(new Integer(10), "level_10"), new Pair(new Integer(20), "level_20"), new Pair(new Integer(30), "level_30")).get(new Integer(i10));
                        if (str != null) {
                            fVar = cVar4.b;
                            jCurrentTimeMillis = System.currentTimeMillis();
                            aVar.d = cVar4;
                            aVar.e = i10;
                            aVar.i = i9;
                            aVar.A = 5;
                            if (fVar.a(str, jCurrentTimeMillis, aVar) != aVar2) {
                                if (i10 == 1) {
                                    fVar2 = cVar4.b;
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 6;
                                    if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                        cVar5 = cVar4;
                                        cVar4 = cVar5;
                                        m mVar11 = cVar4.c;
                                        aVar.d = cVar4;
                                        aVar.e = i9;
                                        aVar.A = 7;
                                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar11.a)).e).j(), 0), aVar);
                                        if (objH3 != aVar2) {
                                            cVar6 = cVar4;
                                            if (((Number) objH3).intValue() >= 500) {
                                                fVar3 = cVar6.b;
                                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = i9;
                                                aVar.A = 8;
                                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                                }
                                            }
                                            if (i9 == 3) {
                                                com.gamericefishpro.space.d7.c cVar18 = cVar6.a;
                                                aVar.d = cVar6;
                                                aVar.A = 9;
                                                objH3 = com.gamericefishpro.space.hj.c.H(cVar18.a, aVar, new p(9), true, false);
                                                if (objH3 != aVar2) {
                                                    iIntValue = ((Number) objH3).intValue();
                                                    if (iIntValue >= 5) {
                                                        fVar4 = cVar6.b;
                                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                                        aVar.d = cVar6;
                                                        aVar.e = iIntValue;
                                                        i11 = 10;
                                                        aVar.A = 10;
                                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                        }
                                                    } else {
                                                        i11 = 10;
                                                    }
                                                    if (iIntValue >= i11) {
                                                        com.gamericefishpro.space.d7.f fVar13 = cVar6.b;
                                                        long jCurrentTimeMillis13 = System.currentTimeMillis();
                                                        aVar.d = null;
                                                        aVar.A = 11;
                                                    }
                                                }
                                                break;
                                            }
                                            return Unit.a;
                                        }
                                    }
                                } else {
                                    m mVar12 = cVar4.c;
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 7;
                                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar12.a)).e).j(), 0), aVar);
                                    if (objH3 != aVar2) {
                                        cVar6 = cVar4;
                                        if (((Number) objH3).intValue() >= 500) {
                                            fVar3 = cVar6.b;
                                            jCurrentTimeMillis3 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = i9;
                                            aVar.A = 8;
                                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                            }
                                        }
                                        if (i9 == 3) {
                                            com.gamericefishpro.space.d7.c cVar19 = cVar6.a;
                                            aVar.d = cVar6;
                                            aVar.A = 9;
                                            objH3 = com.gamericefishpro.space.hj.c.H(cVar19.a, aVar, new p(9), true, false);
                                            if (objH3 != aVar2) {
                                                iIntValue = ((Number) objH3).intValue();
                                                if (iIntValue >= 5) {
                                                    fVar4 = cVar6.b;
                                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = iIntValue;
                                                    i11 = 10;
                                                    aVar.A = 10;
                                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                    }
                                                } else {
                                                    i11 = 10;
                                                }
                                                if (iIntValue >= i11) {
                                                    com.gamericefishpro.space.d7.f fVar14 = cVar6.b;
                                                    long jCurrentTimeMillis14 = System.currentTimeMillis();
                                                    aVar.d = null;
                                                    aVar.A = 11;
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        } else if (i10 == 1) {
                            fVar2 = cVar4.b;
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                            aVar.d = cVar4;
                            aVar.e = i9;
                            aVar.A = 6;
                            if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                cVar5 = cVar4;
                                cVar4 = cVar5;
                                m mVar13 = cVar4.c;
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 7;
                                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar13.a)).e).j(), 0), aVar);
                                if (objH3 != aVar2) {
                                    cVar6 = cVar4;
                                    if (((Number) objH3).intValue() >= 500) {
                                        fVar3 = cVar6.b;
                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = i9;
                                        aVar.A = 8;
                                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                        }
                                    }
                                    if (i9 == 3) {
                                        com.gamericefishpro.space.d7.c cVar110 = cVar6.a;
                                        aVar.d = cVar6;
                                        aVar.A = 9;
                                        objH3 = com.gamericefishpro.space.hj.c.H(cVar110.a, aVar, new p(9), true, false);
                                        if (objH3 != aVar2) {
                                            iIntValue = ((Number) objH3).intValue();
                                            if (iIntValue >= 5) {
                                                fVar4 = cVar6.b;
                                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = iIntValue;
                                                i11 = 10;
                                                aVar.A = 10;
                                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                }
                                            } else {
                                                i11 = 10;
                                            }
                                            if (iIntValue >= i11) {
                                                com.gamericefishpro.space.d7.f fVar15 = cVar6.b;
                                                long jCurrentTimeMillis15 = System.currentTimeMillis();
                                                aVar.d = null;
                                                aVar.A = 11;
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                            }
                        } else {
                            m mVar14 = cVar4.c;
                            aVar.d = cVar4;
                            aVar.e = i9;
                            aVar.A = 7;
                            objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar14.a)).e).j(), 0), aVar);
                            if (objH3 != aVar2) {
                                cVar6 = cVar4;
                                if (((Number) objH3).intValue() >= 500) {
                                    fVar3 = cVar6.b;
                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                    aVar.d = cVar6;
                                    aVar.e = i9;
                                    aVar.A = 8;
                                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                    }
                                }
                                if (i9 == 3) {
                                    com.gamericefishpro.space.d7.c cVar111 = cVar6.a;
                                    aVar.d = cVar6;
                                    aVar.A = 9;
                                    objH3 = com.gamericefishpro.space.hj.c.H(cVar111.a, aVar, new p(9), true, false);
                                    if (objH3 != aVar2) {
                                        iIntValue = ((Number) objH3).intValue();
                                        if (iIntValue >= 5) {
                                            fVar4 = cVar6.b;
                                            jCurrentTimeMillis4 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = iIntValue;
                                            i11 = 10;
                                            aVar.A = 10;
                                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                            }
                                        } else {
                                            i11 = 10;
                                        }
                                        if (iIntValue >= i11) {
                                            com.gamericefishpro.space.d7.f fVar16 = cVar6.b;
                                            long jCurrentTimeMillis16 = System.currentTimeMillis();
                                            aVar.d = null;
                                            aVar.A = 11;
                                        }
                                    }
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                    }
                }
                return aVar2;
            case 3:
                i6 = aVar.v;
                i13 = aVar.i;
                i5 = aVar.e;
                cVar3 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                int i27 = i6;
                i7 = i13;
                i8 = i5;
                k kVar4 = cVar3.d;
                l lVar4 = new l(i8, i27, i7, 97, null, true);
                aVar.d = cVar3;
                aVar.e = i8;
                aVar.i = i7;
                aVar.A = 4;
                objH2 = com.gamericefishpro.space.hj.c.H(kVar4.a, aVar, new q0(5, kVar4, lVar4), false, true);
                if (objH2 != aVar2) {
                    objH2 = Unit.a;
                }
                if (objH2 != aVar2) {
                    i9 = i7;
                    i10 = i8;
                    cVar4 = cVar3;
                    str = (String) m0.e(new Pair(new Integer(1), "first_level"), new Pair(new Integer(5), "level_5"), new Pair(new Integer(10), "level_10"), new Pair(new Integer(20), "level_20"), new Pair(new Integer(30), "level_30")).get(new Integer(i10));
                    if (str != null) {
                        fVar = cVar4.b;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        aVar.d = cVar4;
                        aVar.e = i10;
                        aVar.i = i9;
                        aVar.A = 5;
                        if (fVar.a(str, jCurrentTimeMillis, aVar) != aVar2) {
                            if (i10 == 1) {
                                fVar2 = cVar4.b;
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 6;
                                if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                    cVar5 = cVar4;
                                    cVar4 = cVar5;
                                    m mVar15 = cVar4.c;
                                    aVar.d = cVar4;
                                    aVar.e = i9;
                                    aVar.A = 7;
                                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar15.a)).e).j(), 0), aVar);
                                    if (objH3 != aVar2) {
                                        cVar6 = cVar4;
                                        if (((Number) objH3).intValue() >= 500) {
                                            fVar3 = cVar6.b;
                                            jCurrentTimeMillis3 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = i9;
                                            aVar.A = 8;
                                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                            }
                                        }
                                        if (i9 == 3) {
                                            com.gamericefishpro.space.d7.c cVar112 = cVar6.a;
                                            aVar.d = cVar6;
                                            aVar.A = 9;
                                            objH3 = com.gamericefishpro.space.hj.c.H(cVar112.a, aVar, new p(9), true, false);
                                            if (objH3 != aVar2) {
                                                iIntValue = ((Number) objH3).intValue();
                                                if (iIntValue >= 5) {
                                                    fVar4 = cVar6.b;
                                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                                    aVar.d = cVar6;
                                                    aVar.e = iIntValue;
                                                    i11 = 10;
                                                    aVar.A = 10;
                                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                    }
                                                } else {
                                                    i11 = 10;
                                                }
                                                if (iIntValue >= i11) {
                                                    com.gamericefishpro.space.d7.f fVar17 = cVar6.b;
                                                    long jCurrentTimeMillis17 = System.currentTimeMillis();
                                                    aVar.d = null;
                                                    aVar.A = 11;
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            } else {
                                m mVar16 = cVar4.c;
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 7;
                                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar16.a)).e).j(), 0), aVar);
                                if (objH3 != aVar2) {
                                    cVar6 = cVar4;
                                    if (((Number) objH3).intValue() >= 500) {
                                        fVar3 = cVar6.b;
                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = i9;
                                        aVar.A = 8;
                                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                        }
                                    }
                                    if (i9 == 3) {
                                        com.gamericefishpro.space.d7.c cVar113 = cVar6.a;
                                        aVar.d = cVar6;
                                        aVar.A = 9;
                                        objH3 = com.gamericefishpro.space.hj.c.H(cVar113.a, aVar, new p(9), true, false);
                                        if (objH3 != aVar2) {
                                            iIntValue = ((Number) objH3).intValue();
                                            if (iIntValue >= 5) {
                                                fVar4 = cVar6.b;
                                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = iIntValue;
                                                i11 = 10;
                                                aVar.A = 10;
                                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                }
                                            } else {
                                                i11 = 10;
                                            }
                                            if (iIntValue >= i11) {
                                                com.gamericefishpro.space.d7.f fVar18 = cVar6.b;
                                                long jCurrentTimeMillis18 = System.currentTimeMillis();
                                                aVar.d = null;
                                                aVar.A = 11;
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                            }
                        }
                    } else if (i10 == 1) {
                        fVar2 = cVar4.b;
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        aVar.d = cVar4;
                        aVar.e = i9;
                        aVar.A = 6;
                        if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                            cVar5 = cVar4;
                            cVar4 = cVar5;
                            m mVar17 = cVar4.c;
                            aVar.d = cVar4;
                            aVar.e = i9;
                            aVar.A = 7;
                            objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar17.a)).e).j(), 0), aVar);
                            if (objH3 != aVar2) {
                                cVar6 = cVar4;
                                if (((Number) objH3).intValue() >= 500) {
                                    fVar3 = cVar6.b;
                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                    aVar.d = cVar6;
                                    aVar.e = i9;
                                    aVar.A = 8;
                                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                    }
                                }
                                if (i9 == 3) {
                                    com.gamericefishpro.space.d7.c cVar114 = cVar6.a;
                                    aVar.d = cVar6;
                                    aVar.A = 9;
                                    objH3 = com.gamericefishpro.space.hj.c.H(cVar114.a, aVar, new p(9), true, false);
                                    if (objH3 != aVar2) {
                                        iIntValue = ((Number) objH3).intValue();
                                        if (iIntValue >= 5) {
                                            fVar4 = cVar6.b;
                                            jCurrentTimeMillis4 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = iIntValue;
                                            i11 = 10;
                                            aVar.A = 10;
                                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                            }
                                        } else {
                                            i11 = 10;
                                        }
                                        if (iIntValue >= i11) {
                                            com.gamericefishpro.space.d7.f fVar19 = cVar6.b;
                                            long jCurrentTimeMillis19 = System.currentTimeMillis();
                                            aVar.d = null;
                                            aVar.A = 11;
                                        }
                                    }
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                    } else {
                        m mVar18 = cVar4.c;
                        aVar.d = cVar4;
                        aVar.e = i9;
                        aVar.A = 7;
                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar18.a)).e).j(), 0), aVar);
                        if (objH3 != aVar2) {
                            cVar6 = cVar4;
                            if (((Number) objH3).intValue() >= 500) {
                                fVar3 = cVar6.b;
                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                aVar.d = cVar6;
                                aVar.e = i9;
                                aVar.A = 8;
                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                }
                            }
                            if (i9 == 3) {
                                com.gamericefishpro.space.d7.c cVar115 = cVar6.a;
                                aVar.d = cVar6;
                                aVar.A = 9;
                                objH3 = com.gamericefishpro.space.hj.c.H(cVar115.a, aVar, new p(9), true, false);
                                if (objH3 != aVar2) {
                                    iIntValue = ((Number) objH3).intValue();
                                    if (iIntValue >= 5) {
                                        fVar4 = cVar6.b;
                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = iIntValue;
                                        i11 = 10;
                                        aVar.A = 10;
                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                        }
                                    } else {
                                        i11 = 10;
                                    }
                                    if (iIntValue >= i11) {
                                        com.gamericefishpro.space.d7.f fVar110 = cVar6.b;
                                        long jCurrentTimeMillis110 = System.currentTimeMillis();
                                        aVar.d = null;
                                        aVar.A = 11;
                                    }
                                }
                                break;
                            }
                            return Unit.a;
                        }
                    }
                }
                return aVar2;
            case 4:
                i9 = aVar.i;
                i10 = aVar.e;
                cVar4 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                str = (String) m0.e(new Pair(new Integer(1), "first_level"), new Pair(new Integer(5), "level_5"), new Pair(new Integer(10), "level_10"), new Pair(new Integer(20), "level_20"), new Pair(new Integer(30), "level_30")).get(new Integer(i10));
                if (str != null) {
                    fVar = cVar4.b;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    aVar.d = cVar4;
                    aVar.e = i10;
                    aVar.i = i9;
                    aVar.A = 5;
                    if (fVar.a(str, jCurrentTimeMillis, aVar) != aVar2) {
                        if (i10 == 1) {
                            fVar2 = cVar4.b;
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                            aVar.d = cVar4;
                            aVar.e = i9;
                            aVar.A = 6;
                            if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                                cVar5 = cVar4;
                                cVar4 = cVar5;
                                m mVar19 = cVar4.c;
                                aVar.d = cVar4;
                                aVar.e = i9;
                                aVar.A = 7;
                                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar19.a)).e).j(), 0), aVar);
                                if (objH3 != aVar2) {
                                    cVar6 = cVar4;
                                    if (((Number) objH3).intValue() >= 500) {
                                        fVar3 = cVar6.b;
                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = i9;
                                        aVar.A = 8;
                                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                        }
                                    }
                                    if (i9 == 3) {
                                        com.gamericefishpro.space.d7.c cVar116 = cVar6.a;
                                        aVar.d = cVar6;
                                        aVar.A = 9;
                                        objH3 = com.gamericefishpro.space.hj.c.H(cVar116.a, aVar, new p(9), true, false);
                                        if (objH3 != aVar2) {
                                            iIntValue = ((Number) objH3).intValue();
                                            if (iIntValue >= 5) {
                                                fVar4 = cVar6.b;
                                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                                aVar.d = cVar6;
                                                aVar.e = iIntValue;
                                                i11 = 10;
                                                aVar.A = 10;
                                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                                }
                                            } else {
                                                i11 = 10;
                                            }
                                            if (iIntValue >= i11) {
                                                com.gamericefishpro.space.d7.f fVar111 = cVar6.b;
                                                long jCurrentTimeMillis111 = System.currentTimeMillis();
                                                aVar.d = null;
                                                aVar.A = 11;
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                            }
                        } else {
                            m mVar110 = cVar4.c;
                            aVar.d = cVar4;
                            aVar.e = i9;
                            aVar.A = 7;
                            objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar110.a)).e).j(), 0), aVar);
                            if (objH3 != aVar2) {
                                cVar6 = cVar4;
                                if (((Number) objH3).intValue() >= 500) {
                                    fVar3 = cVar6.b;
                                    jCurrentTimeMillis3 = System.currentTimeMillis();
                                    aVar.d = cVar6;
                                    aVar.e = i9;
                                    aVar.A = 8;
                                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                    }
                                }
                                if (i9 == 3) {
                                    com.gamericefishpro.space.d7.c cVar117 = cVar6.a;
                                    aVar.d = cVar6;
                                    aVar.A = 9;
                                    objH3 = com.gamericefishpro.space.hj.c.H(cVar117.a, aVar, new p(9), true, false);
                                    if (objH3 != aVar2) {
                                        iIntValue = ((Number) objH3).intValue();
                                        if (iIntValue >= 5) {
                                            fVar4 = cVar6.b;
                                            jCurrentTimeMillis4 = System.currentTimeMillis();
                                            aVar.d = cVar6;
                                            aVar.e = iIntValue;
                                            i11 = 10;
                                            aVar.A = 10;
                                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                            }
                                        } else {
                                            i11 = 10;
                                        }
                                        if (iIntValue >= i11) {
                                            com.gamericefishpro.space.d7.f fVar112 = cVar6.b;
                                            long jCurrentTimeMillis112 = System.currentTimeMillis();
                                            aVar.d = null;
                                            aVar.A = 11;
                                        }
                                    }
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                    }
                } else if (i10 == 1) {
                    fVar2 = cVar4.b;
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    aVar.d = cVar4;
                    aVar.e = i9;
                    aVar.A = 6;
                    if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                        cVar5 = cVar4;
                        cVar4 = cVar5;
                        m mVar111 = cVar4.c;
                        aVar.d = cVar4;
                        aVar.e = i9;
                        aVar.A = 7;
                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar111.a)).e).j(), 0), aVar);
                        if (objH3 != aVar2) {
                            cVar6 = cVar4;
                            if (((Number) objH3).intValue() >= 500) {
                                fVar3 = cVar6.b;
                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                aVar.d = cVar6;
                                aVar.e = i9;
                                aVar.A = 8;
                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                }
                            }
                            if (i9 == 3) {
                                com.gamericefishpro.space.d7.c cVar118 = cVar6.a;
                                aVar.d = cVar6;
                                aVar.A = 9;
                                objH3 = com.gamericefishpro.space.hj.c.H(cVar118.a, aVar, new p(9), true, false);
                                if (objH3 != aVar2) {
                                    iIntValue = ((Number) objH3).intValue();
                                    if (iIntValue >= 5) {
                                        fVar4 = cVar6.b;
                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = iIntValue;
                                        i11 = 10;
                                        aVar.A = 10;
                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                        }
                                    } else {
                                        i11 = 10;
                                    }
                                    if (iIntValue >= i11) {
                                        com.gamericefishpro.space.d7.f fVar113 = cVar6.b;
                                        long jCurrentTimeMillis113 = System.currentTimeMillis();
                                        aVar.d = null;
                                        aVar.A = 11;
                                    }
                                }
                                break;
                            }
                            return Unit.a;
                        }
                    }
                } else {
                    m mVar112 = cVar4.c;
                    aVar.d = cVar4;
                    aVar.e = i9;
                    aVar.A = 7;
                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar112.a)).e).j(), 0), aVar);
                    if (objH3 != aVar2) {
                        cVar6 = cVar4;
                        if (((Number) objH3).intValue() >= 500) {
                            fVar3 = cVar6.b;
                            jCurrentTimeMillis3 = System.currentTimeMillis();
                            aVar.d = cVar6;
                            aVar.e = i9;
                            aVar.A = 8;
                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                            }
                        }
                        if (i9 == 3) {
                            com.gamericefishpro.space.d7.c cVar119 = cVar6.a;
                            aVar.d = cVar6;
                            aVar.A = 9;
                            objH3 = com.gamericefishpro.space.hj.c.H(cVar119.a, aVar, new p(9), true, false);
                            if (objH3 != aVar2) {
                                iIntValue = ((Number) objH3).intValue();
                                if (iIntValue >= 5) {
                                    fVar4 = cVar6.b;
                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                    aVar.d = cVar6;
                                    aVar.e = iIntValue;
                                    i11 = 10;
                                    aVar.A = 10;
                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                    }
                                } else {
                                    i11 = 10;
                                }
                                if (iIntValue >= i11) {
                                    com.gamericefishpro.space.d7.f fVar114 = cVar6.b;
                                    long jCurrentTimeMillis114 = System.currentTimeMillis();
                                    aVar.d = null;
                                    aVar.A = 11;
                                }
                            }
                            break;
                        }
                        return Unit.a;
                    }
                }
                return aVar2;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                i9 = aVar.i;
                i10 = aVar.e;
                cVar4 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                if (i10 == 1) {
                    fVar2 = cVar4.b;
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    aVar.d = cVar4;
                    aVar.e = i9;
                    aVar.A = 6;
                    if (fVar2.a("first_catch", jCurrentTimeMillis2, aVar) != aVar2) {
                        cVar5 = cVar4;
                        cVar4 = cVar5;
                        m mVar113 = cVar4.c;
                        aVar.d = cVar4;
                        aVar.e = i9;
                        aVar.A = 7;
                        objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar113.a)).e).j(), 0), aVar);
                        if (objH3 != aVar2) {
                            cVar6 = cVar4;
                            if (((Number) objH3).intValue() >= 500) {
                                fVar3 = cVar6.b;
                                jCurrentTimeMillis3 = System.currentTimeMillis();
                                aVar.d = cVar6;
                                aVar.e = i9;
                                aVar.A = 8;
                                if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                                }
                            }
                            if (i9 == 3) {
                                com.gamericefishpro.space.d7.c cVar1110 = cVar6.a;
                                aVar.d = cVar6;
                                aVar.A = 9;
                                objH3 = com.gamericefishpro.space.hj.c.H(cVar1110.a, aVar, new p(9), true, false);
                                if (objH3 != aVar2) {
                                    iIntValue = ((Number) objH3).intValue();
                                    if (iIntValue >= 5) {
                                        fVar4 = cVar6.b;
                                        jCurrentTimeMillis4 = System.currentTimeMillis();
                                        aVar.d = cVar6;
                                        aVar.e = iIntValue;
                                        i11 = 10;
                                        aVar.A = 10;
                                        if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                        }
                                    } else {
                                        i11 = 10;
                                    }
                                    if (iIntValue >= i11) {
                                        com.gamericefishpro.space.d7.f fVar115 = cVar6.b;
                                        long jCurrentTimeMillis115 = System.currentTimeMillis();
                                        aVar.d = null;
                                        aVar.A = 11;
                                    }
                                }
                                break;
                            }
                            return Unit.a;
                        }
                    }
                } else {
                    m mVar114 = cVar4.c;
                    aVar.d = cVar4;
                    aVar.e = i9;
                    aVar.A = 7;
                    objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar114.a)).e).j(), 0), aVar);
                    if (objH3 != aVar2) {
                        cVar6 = cVar4;
                        if (((Number) objH3).intValue() >= 500) {
                            fVar3 = cVar6.b;
                            jCurrentTimeMillis3 = System.currentTimeMillis();
                            aVar.d = cVar6;
                            aVar.e = i9;
                            aVar.A = 8;
                            if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                            }
                        }
                        if (i9 == 3) {
                            com.gamericefishpro.space.d7.c cVar1111 = cVar6.a;
                            aVar.d = cVar6;
                            aVar.A = 9;
                            objH3 = com.gamericefishpro.space.hj.c.H(cVar1111.a, aVar, new p(9), true, false);
                            if (objH3 != aVar2) {
                                iIntValue = ((Number) objH3).intValue();
                                if (iIntValue >= 5) {
                                    fVar4 = cVar6.b;
                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                    aVar.d = cVar6;
                                    aVar.e = iIntValue;
                                    i11 = 10;
                                    aVar.A = 10;
                                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                    }
                                } else {
                                    i11 = 10;
                                }
                                if (iIntValue >= i11) {
                                    com.gamericefishpro.space.d7.f fVar116 = cVar6.b;
                                    long jCurrentTimeMillis116 = System.currentTimeMillis();
                                    aVar.d = null;
                                    aVar.A = 11;
                                }
                            }
                            break;
                        }
                        return Unit.a;
                    }
                }
                return aVar2;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                i9 = aVar.e;
                cVar5 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                cVar4 = cVar5;
                m mVar115 = cVar4.c;
                aVar.d = cVar4;
                aVar.e = i9;
                aVar.A = 7;
                objH3 = e0.h(new com.gamericefishpro.space.c7.e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(mVar115.a)).e).j(), 0), aVar);
                if (objH3 != aVar2) {
                    cVar6 = cVar4;
                    if (((Number) objH3).intValue() >= 500) {
                        fVar3 = cVar6.b;
                        jCurrentTimeMillis3 = System.currentTimeMillis();
                        aVar.d = cVar6;
                        aVar.e = i9;
                        aVar.A = 8;
                        if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                        }
                    }
                    if (i9 == 3) {
                        com.gamericefishpro.space.d7.c cVar1112 = cVar6.a;
                        aVar.d = cVar6;
                        aVar.A = 9;
                        objH3 = com.gamericefishpro.space.hj.c.H(cVar1112.a, aVar, new p(9), true, false);
                        if (objH3 != aVar2) {
                            iIntValue = ((Number) objH3).intValue();
                            if (iIntValue >= 5) {
                                fVar4 = cVar6.b;
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                                aVar.d = cVar6;
                                aVar.e = iIntValue;
                                i11 = 10;
                                aVar.A = 10;
                                if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                                }
                            } else {
                                i11 = 10;
                            }
                            if (iIntValue >= i11) {
                                com.gamericefishpro.space.d7.f fVar117 = cVar6.b;
                                long jCurrentTimeMillis117 = System.currentTimeMillis();
                                aVar.d = null;
                                aVar.A = 11;
                            }
                        }
                        break;
                    }
                    return Unit.a;
                }
                return aVar2;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                i9 = aVar.e;
                cVar6 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                if (((Number) objH3).intValue() >= 500) {
                    fVar3 = cVar6.b;
                    jCurrentTimeMillis3 = System.currentTimeMillis();
                    aVar.d = cVar6;
                    aVar.e = i9;
                    aVar.A = 8;
                    if (fVar3.a("coin_collector", jCurrentTimeMillis3, aVar) != aVar2) {
                    }
                    return aVar2;
                }
                if (i9 == 3) {
                    com.gamericefishpro.space.d7.c cVar1113 = cVar6.a;
                    aVar.d = cVar6;
                    aVar.A = 9;
                    objH3 = com.gamericefishpro.space.hj.c.H(cVar1113.a, aVar, new p(9), true, false);
                    if (objH3 != aVar2) {
                        iIntValue = ((Number) objH3).intValue();
                        if (iIntValue >= 5) {
                            fVar4 = cVar6.b;
                            jCurrentTimeMillis4 = System.currentTimeMillis();
                            aVar.d = cVar6;
                            aVar.e = iIntValue;
                            i11 = 10;
                            aVar.A = 10;
                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                            }
                        } else {
                            i11 = 10;
                        }
                        if (iIntValue >= i11) {
                            com.gamericefishpro.space.d7.f fVar118 = cVar6.b;
                            long jCurrentTimeMillis118 = System.currentTimeMillis();
                            aVar.d = null;
                            aVar.A = 11;
                        }
                        break;
                    }
                    return aVar2;
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                i9 = aVar.e;
                cVar6 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                if (i9 == 3) {
                    com.gamericefishpro.space.d7.c cVar1114 = cVar6.a;
                    aVar.d = cVar6;
                    aVar.A = 9;
                    objH3 = com.gamericefishpro.space.hj.c.H(cVar1114.a, aVar, new p(9), true, false);
                    if (objH3 != aVar2) {
                        iIntValue = ((Number) objH3).intValue();
                        if (iIntValue >= 5) {
                            fVar4 = cVar6.b;
                            jCurrentTimeMillis4 = System.currentTimeMillis();
                            aVar.d = cVar6;
                            aVar.e = iIntValue;
                            i11 = 10;
                            aVar.A = 10;
                            if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                            }
                        } else {
                            i11 = 10;
                        }
                        if (iIntValue >= i11) {
                            com.gamericefishpro.space.d7.f fVar119 = cVar6.b;
                            long jCurrentTimeMillis119 = System.currentTimeMillis();
                            aVar.d = null;
                            aVar.A = 11;
                        }
                        break;
                    }
                    return aVar2;
                }
                return Unit.a;
            case 9:
                c cVar20 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                cVar6 = cVar20;
                iIntValue = ((Number) objH3).intValue();
                if (iIntValue >= 5) {
                    fVar4 = cVar6.b;
                    jCurrentTimeMillis4 = System.currentTimeMillis();
                    aVar.d = cVar6;
                    aVar.e = iIntValue;
                    i11 = 10;
                    aVar.A = 10;
                    if (fVar4.a("three_stars", jCurrentTimeMillis4, aVar) != aVar2) {
                    }
                    return aVar2;
                }
                i11 = 10;
                if (iIntValue >= i11) {
                    com.gamericefishpro.space.d7.f fVar1110 = cVar6.b;
                    long jCurrentTimeMillis1110 = System.currentTimeMillis();
                    aVar.d = null;
                    aVar.A = 11;
                    break;
                }
                return Unit.a;
            case 10:
                iIntValue = aVar.e;
                cVar6 = aVar.d;
                com.gamericefishpro.space.wa.b.P(objH3);
                i11 = 10;
                if (iIntValue >= i11) {
                    com.gamericefishpro.space.d7.f fVar1111 = cVar6.b;
                    long jCurrentTimeMillis1111 = System.currentTimeMillis();
                    aVar.d = null;
                    aVar.A = 11;
                    break;
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.wa.b.P(objH3);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object b(int i, String str, com.gamericefishpro.space.vh.i iVar) {
        l lVar = new l(i, 0, 0, 65, str, false);
        k kVar = this.d;
        Object objH = com.gamericefishpro.space.hj.c.H(kVar.a, iVar, new q0(5, kVar, lVar), false, true);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objH != aVar) {
            objH = Unit.a;
        }
        return objH == aVar ? objH : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[PHI: r2
      0x00a1: PHI (r2v5 com.gamericefishpro.space.f7.c) = (r2v4 com.gamericefishpro.space.f7.c), (r2v9 com.gamericefishpro.space.f7.c) binds: [B:37:0x009e, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        if (r11 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.gamericefishpro.space.vh.c cVar) {
        b bVar;
        c cVar2;
        Object objH;
        Object objU;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.e;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.v;
        int i3 = 2;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            bVar.d = this;
            bVar.v = 1;
            Object objH2 = com.gamericefishpro.space.hj.c.H(this.a.a, bVar, new p(10), false, true);
            if (objH2 != obj2) {
                objH2 = Unit.a;
            }
            if (objH2 != obj2) {
                cVar2 = this;
            }
            return obj2;
        }
        if (i2 == 1) {
            cVar2 = bVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i2 == 2) {
                cVar2 = bVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = cVar2.d;
                bVar.d = cVar2;
                bVar.v = 3;
                objH = com.gamericefishpro.space.hj.c.H(kVar.a, bVar, new p(14), false, true);
                if (objH != obj2) {
                    objH = Unit.a;
                }
                if (objH != obj2) {
                    m mVar = cVar2.c;
                    bVar.d = null;
                    bVar.v = 4;
                    objU = y3.u(n.a(mVar.a), new com.gamericefishpro.space.c7.f(i3, 0, null), bVar);
                    if (objU != obj2) {
                        objU = Unit.a;
                    }
                }
                return obj2;
            }
            if (i2 == 3) {
                cVar2 = bVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                m mVar2 = cVar2.c;
                bVar.d = null;
                bVar.v = 4;
                objU = y3.u(n.a(mVar2.a), new com.gamericefishpro.space.c7.f(i3, 0, null), bVar);
                if (objU != obj2) {
                    objU = Unit.a;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
        }
        return Unit.a;
        com.gamericefishpro.space.d7.f fVar = cVar2.b;
        bVar.d = cVar2;
        bVar.v = 2;
        Object objH3 = com.gamericefishpro.space.hj.c.H(fVar.a, bVar, new p(12), false, true);
        if (objH3 != obj2) {
            objH3 = Unit.a;
        }
        if (objH3 != obj2) {
            k kVar2 = cVar2.d;
            bVar.d = cVar2;
            bVar.v = 3;
            objH = com.gamericefishpro.space.hj.c.H(kVar2.a, bVar, new p(14), false, true);
            if (objH != obj2) {
                objH = Unit.a;
            }
            if (objH != obj2) {
                m mVar3 = cVar2.c;
                bVar.d = null;
                bVar.v = 4;
                objU = y3.u(n.a(mVar3.a), new com.gamericefishpro.space.c7.f(i3, 0, null), bVar);
                if (objU != obj2) {
                    objU = Unit.a;
                }
            }
        }
        return obj2;
    }

    public final Object d(String str, com.gamericefishpro.space.vh.c cVar) {
        Object objA = this.b.a(str, System.currentTimeMillis(), cVar);
        return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
    }
}
