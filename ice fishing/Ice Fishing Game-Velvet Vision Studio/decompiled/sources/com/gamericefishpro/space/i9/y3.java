package com.gamericefishpro.space.i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.l1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y3 {
    public static com.gamericefishpro.space.b8.k a;
    public static com.gamericefishpro.space.u1.f b;
    public static com.gamericefishpro.space.u1.f c;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public static final com.gamericefishpro.space.m1.b C(com.gamericefishpro.space.m1.u uVar, int i) {
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                com.gamericefishpro.space.m1.u uVarZ = a4.z(uVar);
                if (uVarZ == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                com.gamericefishpro.space.m1.b bVarC = C(uVarZ, i);
                com.gamericefishpro.space.m1.b bVar = com.gamericefishpro.space.m1.b.d;
                if (bVarC == bVar) {
                    bVarC = null;
                }
                if (bVarC != null) {
                    return bVarC;
                }
                if (uVar.J) {
                    return bVar;
                }
                uVar.J = true;
                try {
                    com.gamericefishpro.space.m1.o oVarC0 = uVar.C0();
                    com.gamericefishpro.space.m1.a aVar = new com.gamericefishpro.space.m1.a(i);
                    com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner();
                    com.gamericefishpro.space.m1.u uVarF = kVar.f();
                    oVarC0.k.invoke(aVar);
                    com.gamericefishpro.space.m1.u uVarF2 = kVar.f();
                    if (aVar.b) {
                        com.gamericefishpro.space.m1.q qVar = com.gamericefishpro.space.m1.q.b;
                        return com.gamericefishpro.space.m1.b.e;
                    }
                    if (uVarF == uVarF2 || uVarF2 == null) {
                        return bVar;
                    }
                    return com.gamericefishpro.space.m1.q.d == com.gamericefishpro.space.m1.q.c ? com.gamericefishpro.space.m1.b.e : com.gamericefishpro.space.m1.b.i;
                } finally {
                    uVar.J = false;
                }
            }
            if (iOrdinal == 2) {
                return com.gamericefishpro.space.m1.b.e;
            }
            if (iOrdinal != 3) {
                throw new com.gamericefishpro.space.oh.k();
            }
        }
        return com.gamericefishpro.space.m1.b.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public static final com.gamericefishpro.space.m1.b D(com.gamericefishpro.space.m1.u uVar, int i) {
        if (!uVar.K) {
            uVar.K = true;
            try {
                com.gamericefishpro.space.m1.o oVarC0 = uVar.C0();
                com.gamericefishpro.space.m1.a aVar = new com.gamericefishpro.space.m1.a(i);
                com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner();
                com.gamericefishpro.space.m1.u uVarF = kVar.f();
                oVarC0.j.invoke(aVar);
                com.gamericefishpro.space.m1.u uVarF2 = kVar.f();
                if (aVar.b) {
                    com.gamericefishpro.space.m1.q qVar = com.gamericefishpro.space.m1.q.b;
                    return com.gamericefishpro.space.m1.b.e;
                }
                if (uVarF != uVarF2 && uVarF2 != null) {
                    return com.gamericefishpro.space.m1.q.d == com.gamericefishpro.space.m1.q.c ? com.gamericefishpro.space.m1.b.e : com.gamericefishpro.space.m1.b.i;
                }
            } finally {
                uVar.K = false;
            }
        }
        return com.gamericefishpro.space.m1.b.d;
    }

    public static final com.gamericefishpro.space.m1.b E(com.gamericefishpro.space.m1.u uVar, int i) {
        com.gamericefishpro.space.h1.l lVarE;
        com.gamericefishpro.space.h2.a1 a1Var;
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                com.gamericefishpro.space.m1.u uVarZ = a4.z(uVar);
                if (uVarZ != null) {
                    return C(uVarZ, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (!uVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = uVar.d.w;
                com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
                loop0: while (true) {
                    if (f0VarS == null) {
                        lVarE = null;
                        break;
                    }
                    if ((f0VarS.Z.f.v & 1024) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 1024) != 0) {
                                lVarE = lVar;
                                com.gamericefishpro.space.v0.e eVar = null;
                                while (lVarE != null) {
                                    if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                        break loop0;
                                    }
                                    if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                        int i2 = 0;
                                        for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                            if ((lVar2.i & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    lVarE = lVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE != null) {
                                                        eVar.b(lVarE);
                                                        lVarE = null;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                }
                            }
                            lVar = lVar.w;
                        }
                    }
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                }
                com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) lVarE;
                if (uVar2 == null) {
                    return com.gamericefishpro.space.m1.b.d;
                }
                int iOrdinal2 = uVar2.F0().ordinal();
                if (iOrdinal2 == 0) {
                    return D(uVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return E(uVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return com.gamericefishpro.space.m1.b.e;
                }
                if (iOrdinal2 != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                com.gamericefishpro.space.m1.b bVarE = E(uVar2, i);
                com.gamericefishpro.space.m1.b bVar = bVarE != com.gamericefishpro.space.m1.b.d ? bVarE : null;
                return bVar == null ? D(uVar2, i) : bVar;
            }
        }
        return com.gamericefishpro.space.m1.b.d;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0212 A[ADDED_TO_REGION, LOOP:9: B:151:0x0212->B:158:0x0226, LOOP_START, PHI: r12
      0x0212: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:150:0x0210, B:158:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x0214  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0221  */
    /* JADX WARN: Code duplicated, block: B:157:0x0224  */
    /* JADX WARN: Code duplicated, block: B:159:0x022e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0236  */
    /* JADX WARN: Code duplicated, block: B:166:0x0244 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:203:0x01a5 A[SYNTHETIC] */
    public static final boolean F(com.gamericefishpro.space.m1.u uVar) {
        com.gamericefishpro.space.v0.e eVar;
        int i;
        com.gamericefishpro.space.m1.u uVar2;
        com.gamericefishpro.space.m1.s sVar;
        com.gamericefishpro.space.h2.a1 a1Var;
        char c2;
        com.gamericefishpro.space.h2.a1 a1Var2;
        com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner();
        com.gamericefishpro.space.m1.u uVarF = kVar.f();
        com.gamericefishpro.space.m1.s sVarF0 = uVar.F0();
        if (uVarF == uVar) {
            uVar.B0(sVarF0, sVarF0);
            return true;
        }
        int i2 = 0;
        if ((uVarF == null || uVarF.H) && !uVar.H && !((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).a.F()) {
            return false;
        }
        char c3 = 16;
        if (uVarF != null) {
            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.m1.u[16]);
            if (!uVarF.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar = uVarF.d.w;
            com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarF);
            while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 1024) != 0) {
                            com.gamericefishpro.space.h1.l lVarE = lVar;
                            com.gamericefishpro.space.v0.e eVar2 = null;
                            while (lVarE != null) {
                                if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                    eVar.b((com.gamericefishpro.space.m1.u) lVarE);
                                } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                    int i3 = 0;
                                    for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                        if ((lVar2.i & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                lVarE = lVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar2.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar2.b(lVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                lVarE = com.gamericefishpro.space.h2.k.e(eVar2);
                            }
                        }
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var2 = f0VarS.Z) == null) ? null : a1Var2.e;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new com.gamericefishpro.space.m1.u[16];
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar3 = uVar.d.w;
        com.gamericefishpro.space.h2.f0 f0VarS2 = com.gamericefishpro.space.h2.k.s(uVar);
        int i4 = 1;
        int i5 = 0;
        while (f0VarS2 != null) {
            if ((f0VarS2.Z.f.v & 1024) != 0) {
                while (lVar3 != null) {
                    if ((lVar3.i & 1024) != 0) {
                        com.gamericefishpro.space.h1.l lVarE2 = lVar3;
                        com.gamericefishpro.space.v0.e eVar3 = null;
                        while (lVarE2 != null) {
                            if (lVarE2 instanceof com.gamericefishpro.space.m1.u) {
                                com.gamericefishpro.space.m1.u uVar3 = (com.gamericefishpro.space.m1.u) lVarE2;
                                Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.k(uVar3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (objArr.length < i6) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(objArr, i2, objArr2, i2, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i5] = uVar3;
                                    i5 = i6;
                                }
                                if (uVar3 == uVarF) {
                                    i4 = i2;
                                }
                            } else {
                                if ((lVarE2.i & 1024) != 0 && (lVarE2 instanceof com.gamericefishpro.space.h2.j)) {
                                    int i7 = i2;
                                    for (com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) lVarE2).I; lVar4 != null; lVar4 = lVar4.y) {
                                        if ((lVar4.i & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                lVarE2 = lVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE2 != null) {
                                                    eVar3.b(lVarE2);
                                                    lVarE2 = null;
                                                }
                                                eVar3.b(lVar4);
                                            }
                                        }
                                    }
                                    c2 = 16;
                                    if (i7 == 1) {
                                        c3 = 16;
                                    }
                                    i2 = 0;
                                }
                                lVarE2 = com.gamericefishpro.space.h2.k.e(eVar3);
                                c3 = c2;
                                i2 = 0;
                            }
                            c2 = 16;
                            lVarE2 = com.gamericefishpro.space.h2.k.e(eVar3);
                            c3 = c2;
                            i2 = 0;
                        }
                    }
                    lVar3 = lVar3.w;
                    c3 = c3;
                    i2 = 0;
                }
            }
            char c4 = c3;
            f0VarS2 = f0VarS2.v();
            lVar3 = (f0VarS2 == null || (a1Var = f0VarS2.Z) == null) ? null : a1Var.e;
            c3 = c4;
            i2 = 0;
        }
        if (i4 == 0 || uVarF == null || p(uVarF, false)) {
            com.gamericefishpro.space.h2.k.p(uVar, new com.gamericefishpro.space.a2.b(8, uVar));
            int iOrdinal = uVar.F0().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).h(uVar);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).h(uVar);
                }
            }
            if (i4 != 0 && uVarF != null) {
                uVarF.B0(com.gamericefishpro.space.m1.s.d, com.gamericefishpro.space.m1.s.i);
            }
            if (eVar != null) {
                int i8 = eVar.i - 1;
                Object[] objArr3 = eVar.d;
                if (i8 < objArr3.length) {
                    while (i8 >= 0) {
                        com.gamericefishpro.space.m1.u uVar4 = (com.gamericefishpro.space.m1.u) objArr3[i8];
                        if (kVar.f() == uVar) {
                            uVar4.B0(com.gamericefishpro.space.m1.s.e, com.gamericefishpro.space.m1.s.i);
                            i8--;
                        }
                    }
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            uVar2 = (com.gamericefishpro.space.m1.u) objArr[i];
                            if (kVar.f() == uVar) {
                                if (uVar2 == uVarF) {
                                    sVar = com.gamericefishpro.space.m1.s.d;
                                } else {
                                    sVar = com.gamericefishpro.space.m1.s.i;
                                }
                                uVar2.B0(sVar, com.gamericefishpro.space.m1.s.e);
                                i--;
                            }
                        }
                        if (kVar.f() == uVar) {
                            uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                            if (kVar.f() != uVar) {
                                return true;
                            }
                        }
                    } else if (kVar.f() == uVar) {
                        uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                        if (kVar.f() != uVar) {
                            return true;
                        }
                    }
                } else {
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            uVar2 = (com.gamericefishpro.space.m1.u) objArr[i];
                            if (kVar.f() == uVar) {
                                if (uVar2 == uVarF) {
                                    sVar = com.gamericefishpro.space.m1.s.d;
                                } else {
                                    sVar = com.gamericefishpro.space.m1.s.i;
                                }
                                uVar2.B0(sVar, com.gamericefishpro.space.m1.s.e);
                                i--;
                            }
                        }
                        if (kVar.f() == uVar) {
                            uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                            if (kVar.f() != uVar) {
                                return true;
                            }
                        }
                    } else if (kVar.f() == uVar) {
                        uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                        if (kVar.f() != uVar) {
                            return true;
                        }
                    }
                }
            } else {
                i = i5 - 1;
                if (i < objArr.length) {
                    while (i >= 0) {
                        uVar2 = (com.gamericefishpro.space.m1.u) objArr[i];
                        if (kVar.f() == uVar) {
                            if (uVar2 == uVarF) {
                                sVar = com.gamericefishpro.space.m1.s.d;
                            } else {
                                sVar = com.gamericefishpro.space.m1.s.i;
                            }
                            uVar2.B0(sVar, com.gamericefishpro.space.m1.s.e);
                            i--;
                        }
                    }
                    if (kVar.f() == uVar) {
                        uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                        if (kVar.f() != uVar) {
                            return true;
                        }
                    }
                } else if (kVar.f() == uVar) {
                    uVar.B0(sVarF0, com.gamericefishpro.space.m1.s.d);
                    if (kVar.f() != uVar) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean I(com.gamericefishpro.space.t.h0 h0Var, Object obj, Object obj2) {
        Object objG = h0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof com.gamericefishpro.space.t.i0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            h0Var.k(obj);
            return true;
        }
        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) objG;
        boolean zL = i0Var.l(obj2);
        if (zL && i0Var.g()) {
            h0Var.k(obj);
        }
        return zL;
    }

    public static final void J(com.gamericefishpro.space.t.h0 h0Var, Object obj) {
        boolean zG;
        long[] jArr = h0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = h0Var.b[i4];
                        Object obj3 = h0Var.c[i4];
                        if (obj3 instanceof com.gamericefishpro.space.t.i0) {
                            com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) obj3;
                            i0Var.l(obj);
                            zG = i0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            h0Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void K(Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i < i2) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i] = null;
            i++;
        }
    }

    public static final Object L(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return com.gamericefishpro.space.pi.a0.y(kotlin.coroutines.g.d, new com.gamericefishpro.space.k7.e(block, (com.gamericefishpro.space.th.a) null));
    }

    public static void M(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void N(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iV = V(parcel, i);
        parcel.writeBundle(bundle);
        W(parcel, iV);
    }

    public static void O(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iV = V(parcel, i);
        parcel.writeStrongBinder(iBinder);
        W(parcel, iV);
    }

    public static void P(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iV = V(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        W(parcel, iV);
    }

    public static void Q(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iV = V(parcel, i);
        parcel.writeString(str);
        W(parcel, iV);
    }

    public static void R(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iV = V(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iV);
    }

    public static void S(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iV = V(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iV);
    }

    public static int T(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static void U(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int V(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void W(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void a(boolean z, Function0 function0, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(-361453782);
        int i2 = (rVar.g(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= rVar.h(function0) ? 32 : 16;
        }
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object objA = com.gamericefishpro.space.k5.a.a(rVar);
            if (objA == null) {
                rVar.a0(535274673);
                objA = com.gamericefishpro.space.e.p.a(rVar);
                rVar.p(false);
            } else {
                rVar.a0(535271790);
                rVar.p(false);
            }
            if (objA == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zF = rVar.f(objA);
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (zF || objP == obj) {
                com.gamericefishpro.space.j5.c cVar = objA instanceof com.gamericefishpro.space.j5.c ? (com.gamericefishpro.space.j5.c) objA : null;
                com.gamericefishpro.space.tb.s sVarC = cVar != null ? cVar.c() : null;
                com.gamericefishpro.space.d.t tVar = objA instanceof com.gamericefishpro.space.d.t ? (com.gamericefishpro.space.d.t) objA : null;
                objP = new com.gamericefishpro.space.f.c(sVarC, tVar != null ? tVar.a() : null);
                rVar.k0(objP);
            }
            Object obj2 = (com.gamericefishpro.space.f.c) objP;
            long j = rVar.T;
            boolean zF2 = rVar.f(obj2) | rVar.e(j);
            Object objP2 = rVar.P();
            Object obj3 = objP2;
            if (zF2 || objP2 == obj) {
                com.gamericefishpro.space.e.j jVar = new com.gamericefishpro.space.e.j(new com.gamericefishpro.space.e.d(j, objA));
                jVar.c = new com.gamericefishpro.space.a5.h(9);
                rVar.k0(jVar);
                obj3 = jVar;
            }
            Object obj4 = (com.gamericefishpro.space.e.j) obj3;
            rVar.a0(-585307852);
            boolean zH = rVar.h(obj4) | ((i2 & 112) == 32);
            Object objP3 = rVar.P();
            if (zH || objP3 == obj) {
                objP3 = new com.gamericefishpro.space.e.e(0, obj4, function0);
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.t0.i.g((Function0) objP3, rVar);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zH2 = rVar.h(obj4) | (i4 == 4);
            Object objP4 = rVar.P();
            if (zH2 || objP4 == obj) {
                objP4 = new com.gamericefishpro.space.e.f(0, obj4, z);
                rVar.k0(objP4);
            }
            com.gamericefishpro.space.d9.h.g(boolValueOf, obj4, null, (Function1) objP4, rVar, i4);
            boolean zH3 = rVar.h(obj2) | rVar.h(obj4);
            Object objP5 = rVar.P();
            if (zH3 || objP5 == obj) {
                objP5 = new com.gamericefishpro.space.d0.q0(7, obj2, obj4);
                rVar.k0(objP5);
            }
            com.gamericefishpro.space.t0.i.c(obj2, obj4, (Function1) objP5, rVar);
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.e.g(z, function0, i, 0);
        }
    }

    public static final void b(com.gamericefishpro.space.g5.p pVar, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.f1.u uVar;
        com.gamericefishpro.space.g5.p pVar2 = pVar;
        rVar.b0(294589392);
        if ((((rVar.h(pVar2) ? 4 : 2) | i) & 3) == 2 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.e1.d dVarD = com.gamericefishpro.space.e1.k.d(rVar);
            com.gamericefishpro.space.t0.v0 v0VarL = com.gamericefishpro.space.t0.i.l(pVar2.b().e, rVar);
            List list = (List) v0VarL.getValue();
            boolean zBooleanValue = ((Boolean) rVar.j(com.gamericefishpro.space.i2.k1.a)).booleanValue();
            boolean zF = rVar.f(list);
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            Object obj2 = objP;
            if (zF || objP == obj) {
                com.gamericefishpro.space.f1.u uVar2 = new com.gamericefishpro.space.f1.u();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zBooleanValue ? true : ((com.gamericefishpro.space.f5.k) obj3).A.j.c.a(com.gamericefishpro.space.z4.p.v)) {
                        arrayList.add(obj3);
                    }
                }
                uVar2.addAll(arrayList);
                rVar.k0(uVar2);
                obj2 = uVar2;
            }
            com.gamericefishpro.space.f1.u uVar3 = (com.gamericefishpro.space.f1.u) obj2;
            i(uVar3, (List) v0VarL.getValue(), rVar, 0);
            com.gamericefishpro.space.t0.v0 v0VarL2 = com.gamericefishpro.space.t0.i.l(pVar2.b().f, rVar);
            Object objP2 = rVar.P();
            if (objP2 == obj) {
                objP2 = new com.gamericefishpro.space.f1.u();
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.f1.u uVar4 = (com.gamericefishpro.space.f1.u) objP2;
            rVar.a0(-367418626);
            ListIterator listIterator = uVar3.listIterator();
            while (true) {
                com.gamericefishpro.space.f1.a0 a0Var = (com.gamericefishpro.space.f1.a0) listIterator;
                if (!a0Var.hasNext()) {
                    break;
                }
                com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) a0Var.next();
                com.gamericefishpro.space.f5.x xVar = kVar.e;
                Intrinsics.c(xVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                com.gamericefishpro.space.g5.o oVar = (com.gamericefishpro.space.g5.o) xVar;
                boolean zH = rVar.h(pVar2) | rVar.h(kVar);
                Object objP3 = rVar.P();
                if (zH || objP3 == obj) {
                    objP3 = new com.gamericefishpro.space.e.e(4, pVar2, kVar);
                    rVar.k0(objP3);
                }
                com.gamericefishpro.space.d9.h.b((Function0) objP3, oVar.y, com.gamericefishpro.space.b1.n.c(1129586364, new com.gamericefishpro.space.g5.n(kVar, pVar2, dVarD, uVar4, oVar), rVar), rVar, 384, 0);
                pVar2 = pVar2;
                dVarD = dVarD;
                uVar4 = uVar4;
            }
            com.gamericefishpro.space.g5.p pVar3 = pVar2;
            com.gamericefishpro.space.f1.u uVar5 = uVar4;
            rVar.p(false);
            Set set = (Set) v0VarL2.getValue();
            boolean zF2 = rVar.f(v0VarL2) | rVar.h(pVar3);
            Object objP4 = rVar.P();
            if (zF2 || objP4 == obj) {
                pVar2 = pVar3;
                uVar = uVar5;
                Object cVar = new com.gamericefishpro.space.db.c(v0VarL2, pVar2, uVar, null, 1);
                rVar.k0(cVar);
                objP4 = cVar;
            } else {
                pVar2 = pVar3;
                uVar = uVar5;
            }
            com.gamericefishpro.space.t0.i.f(set, uVar, (Function2) objP4, rVar);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.n1(i, 3, pVar2);
        }
    }

    public static final void c(com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        rVar2.b0(395489236);
        if (i == 0 && rVar2.E()) {
            rVar2.V();
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.d0.g1.b(jVar, 1.0f);
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.c, com.gamericefishpro.space.h1.b.G, rVar2, 54);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarB, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.blue_fish, rVar2, 0), "Empty History", com.gamericefishpro.space.d0.g1.f(jVar, 90), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar2, 25016, 104);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, 16), rVar2);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.q0.r0.a("No adventures yet!", null, j, com.gamericefishpro.space.hj.c.C(24), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), 4.0f, 2), 16769023), rVar, 1597830, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, 8), rVar);
            com.gamericefishpro.space.q0.r0.a("Play your first level and your fishing story will appear here.", com.gamericefishpro.space.d0.j.n(jVar, 24, 0.0f, 2), com.gamericefishpro.space.o1.s.c(j, 0.75f), com.gamericefishpro.space.hj.c.C(15), null, 0L, new com.gamericefishpro.space.b3.k(3), 0L, 0, false, 0, 0, null, rVar, 25014, 0, 261096);
            rVar2 = rVar;
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g7.a(i, 3);
        }
    }

    public static final void d(com.gamericefishpro.space.u1.f icon, Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(1311164588);
        if ((i & 6) == 0) {
            i2 = i | (rVar2.f(icon) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(onClick) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-595573214);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            com.gamericefishpro.space.t0.s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 2 : 0, null, "press", rVar2, 384, 10);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(com.gamericefishpro.space.d0.g1.f(jVar, 52), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            float f = 2;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarI2, com.gamericefishpro.space.o1.s.c(j, 0.15f), dVar2), 1, com.gamericefishpro.space.o1.s.c(j, 0.4f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.q0.j.b(icon, "Settings", com.gamericefishpro.space.d0.g1.f(jVar, 24), j, rVar2, (i3 & 14) | 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.b1.f(i, 4, icon, onClick);
        }
    }

    public static final void e(com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        rVar2.b0(1903369397);
        if (i == 0 && rVar2.E()) {
            rVar2.V();
        } else {
            com.gamericefishpro.space.w.z zVarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("loading_bar", rVar2), -0.5f, 1.5f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1500, 2, com.gamericefishpro.space.w.t.a), com.gamericefishpro.space.w.j0.d), "slide_offset", rVar2, 29064);
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.G, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(jVar, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.h1.m mVarD = com.gamericefishpro.space.d0.g1.d(com.gamericefishpro.space.d0.g1.g(jVar, 200), 14);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(mVarD, dVar2), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.6f), com.gamericefishpro.space.o1.o.b), 1, com.gamericefishpro.space.o1.s.c(j, 0.25f), dVar2), 2);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarL, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.c, dVar2);
            long j2 = com.gamericefishpro.space.t7.b.a;
            com.gamericefishpro.space.o1.s sVar = new com.gamericefishpro.space.o1.s(j2);
            long j3 = com.gamericefishpro.space.t7.b.c;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(mVarB, com.gamericefishpro.space.n9.a0.c(com.gamericefishpro.space.ph.x.f(sVar, new com.gamericefishpro.space.o1.s(j3), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.9f)), new com.gamericefishpro.space.o1.s(j3), new com.gamericefishpro.space.o1.s(j2)), ((Number) zVarE.v.getValue()).floatValue() * 600.0f, (((Number) zVarE.v.getValue()).floatValue() * 600.0f) + 300.0f, 8), null, 6), rVar2, 0);
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, 12), rVar2);
            com.gamericefishpro.space.q0.r0.a("LOADING...", null, j3, com.gamericefishpro.space.hj.c.C(12), com.gamericefishpro.space.u2.k.w, com.gamericefishpro.space.hj.c.C(3), null, 0L, 0, false, 0, 0, null, rVar, 102261126, 0, 261802);
            rVar2 = rVar;
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.r2.u(i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r7v15 */
    public static final void f(Map powerUps, int i, com.gamericefishpro.space.i7.d dVar, final Function1 onPowerUpSelected, final Function1 onBuyPowerUp, com.gamericefishpro.space.t0.r rVar, int i2) {
        Intrinsics.checkNotNullParameter(powerUps, "powerUps");
        Intrinsics.checkNotNullParameter(onPowerUpSelected, "onPowerUpSelected");
        Intrinsics.checkNotNullParameter(onBuyPowerUp, "onBuyPowerUp");
        rVar.b0(2128000991);
        int i3 = i;
        int i4 = 2048;
        int i5 = i2 | (rVar.h(powerUps) ? 4 : 2) | (rVar.d(i3) ? 32 : 16) | (rVar.f(dVar) ? 256 : 128) | (rVar.h(onPowerUpSelected) ? 2048 : 1024) | (rVar.h(onBuyPowerUp) ? 16384 : 8192);
        if ((i5 & 9363) == 9362 && rVar.E()) {
            rVar.V();
        } else {
            float f = 24;
            float f2 = 12;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.b(com.gamericefishpro.space.h1.j.a, 1.0f), com.gamericefishpro.space.k0.e.a(f)), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.7f), com.gamericefishpro.space.o1.o.b), 2, com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.2f), com.gamericefishpro.space.k0.e.a(f)), f2, f2);
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.d, com.gamericefishpro.space.h1.b.D, rVar, 54);
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarM, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            rVar.a0(-555211675);
            com.gamericefishpro.space.i7.d[] dVarArrValues = com.gamericefishpro.space.i7.d.values();
            int length = dVarArrValues.length;
            boolean z = false;
            int i6 = 0;
            while (i6 < length) {
                int i7 = length;
                final com.gamericefishpro.space.i7.d dVar2 = dVarArrValues[i6];
                Integer num = (Integer) powerUps.get(dVar2);
                ?? IntValue = num != null ? num.intValue() : z;
                int i8 = i6;
                boolean z2 = dVar == dVar2 ? true : z;
                rVar.a0(-1929655365);
                boolean zF = ((i5 & 7168) == i4 ? true : z) | rVar.f(dVar2);
                Object objP = rVar.P();
                com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                if (zF || objP == fVar) {
                    final int i9 = 0;
                    objP = new Function0() { // from class: com.gamericefishpro.space.n7.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    onPowerUpSelected.invoke(dVar2);
                                    break;
                                default:
                                    onPowerUpSelected.invoke(dVar2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar.k0(objP);
                }
                Function0 function0 = (Function0) objP;
                rVar.p(z);
                rVar.a0(-1929653674);
                boolean zF2 = ((57344 & i5) == 16384) | rVar.f(dVar2);
                Object objP2 = rVar.P();
                if (zF2 || objP2 == fVar) {
                    final int i10 = 1;
                    objP2 = new Function0() { // from class: com.gamericefishpro.space.n7.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    onBuyPowerUp.invoke(dVar2);
                                    break;
                                default:
                                    onBuyPowerUp.invoke(dVar2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar.k0(objP2);
                }
                rVar.p(false);
                a4.d(dVar2, IntValue == true ? 1 : 0, i3, z2, function0, (Function0) objP2, rVar, (i5 << 3) & 896);
                i6 = i8 + 1;
                i3 = i;
                length = i7;
                z = false;
                i4 = 2048;
            }
            rVar.p(z);
            rVar.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.a(powerUps, i, dVar, onPowerUpSelected, onBuyPowerUp, i2);
        }
    }

    public static final void g(String title, com.gamericefishpro.space.b1.h content, com.gamericefishpro.space.t0.r rVar, int i) {
        Function2 function2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        rVar2.b0(-735922939);
        if ((i & 19) == 18 && rVar2.E()) {
            rVar2.V();
            function2 = content;
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.d0.g1.b(jVar, 1.0f);
            com.gamericefishpro.space.d0.v vVar = com.gamericefishpro.space.d0.h.b;
            com.gamericefishpro.space.h1.c cVar = com.gamericefishpro.space.h1.b.F;
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(vVar, cVar, rVar2, 0);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarB, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.q0.r0.a(title, com.gamericefishpro.space.d0.j.o(jVar, 16, 0.0f, 0.0f, 8, 6), com.gamericefishpro.space.o1.s.c(j, 0.6f), com.gamericefishpro.space.hj.c.C(13), com.gamericefishpro.space.u2.k.w, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, null, rVar, 102261174, 0, 261800);
            rVar2 = rVar;
            float f = 24;
            com.gamericefishpro.space.h1.m mVarN = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f)), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.5f), com.gamericefishpro.space.o1.o.b), 1, com.gamericefishpro.space.o1.s.c(j, 0.15f), com.gamericefishpro.space.k0.e.a(f)), 0.0f, 4, 1);
            com.gamericefishpro.space.d0.b0 b0VarA2 = com.gamericefishpro.space.d0.z.a(vVar, cVar, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarN, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            function2 = content;
            function2.invoke(rVar2, 6);
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 11, title, function2);
        }
    }

    public static final void h(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-1578195828);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-214732701);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            com.gamericefishpro.space.t0.s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(com.gamericefishpro.space.d0.g1.f(jVar, 56), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            float f = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, com.gamericefishpro.space.o1.s.c(j, 0.5f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", com.gamericefishpro.space.d0.g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 0);
        }
    }

    public static final void i(final List list, Collection collection, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(1537894851);
        if ((((rVar.h(list) ? 4 : 2) | i | (rVar.h(collection) ? 32 : 16)) & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            final boolean zBooleanValue = ((Boolean) rVar.j(com.gamericefishpro.space.i2.k1.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) it.next();
                com.gamericefishpro.space.z4.w wVar = kVar.A.j;
                boolean zG = rVar.g(zBooleanValue) | rVar.h(list) | rVar.h(kVar);
                Object objP = rVar.P();
                if (zG || objP == com.gamericefishpro.space.t0.n.a) {
                    objP = new Function1() { // from class: com.gamericefishpro.space.g5.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            final com.gamericefishpro.space.f5.k kVar2 = kVar;
                            final List list2 = list;
                            final boolean z = zBooleanValue;
                            com.gamericefishpro.space.z4.s sVar = new com.gamericefishpro.space.z4.s() { // from class: com.gamericefishpro.space.g5.l
                                @Override // com.gamericefishpro.space.z4.s
                                public final void j(com.gamericefishpro.space.z4.u uVar, com.gamericefishpro.space.z4.o oVar) {
                                    boolean z2 = z;
                                    List list3 = list2;
                                    com.gamericefishpro.space.f5.k kVar3 = kVar2;
                                    if (z2 && !list3.contains(kVar3)) {
                                        list3.add(kVar3);
                                    }
                                    if (oVar == com.gamericefishpro.space.z4.o.ON_START && !list3.contains(kVar3)) {
                                        list3.add(kVar3);
                                    }
                                    if (oVar == com.gamericefishpro.space.z4.o.ON_STOP) {
                                        list3.remove(kVar3);
                                    }
                                }
                            };
                            kVar2.A.j.a(sVar);
                            return new l1(3, kVar2, sVar);
                        }
                    };
                    rVar.k0(objP);
                }
                com.gamericefishpro.space.t0.i.d(wVar, (Function1) objP, rVar);
            }
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 3, list, collection);
        }
    }

    public static final long j(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final String k(Object[] objArr, int i, int i2, com.gamericefishpro.space.ph.k kVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == kVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void l(com.gamericefishpro.space.t.h0 h0Var, Object obj, Object obj2) {
        int iF = h0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : h0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof com.gamericefishpro.space.t.i0) {
                ((com.gamericefishpro.space.t.i0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                com.gamericefishpro.space.t.i0 i0Var = new com.gamericefishpro.space.t.i0();
                i0Var.a(obj3);
                i0Var.a(obj2);
                obj2 = i0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            h0Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        h0Var.b[i] = obj;
        h0Var.c[i] = obj2;
    }

    public static final boolean p(com.gamericefishpro.space.m1.u uVar, boolean z) {
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                com.gamericefishpro.space.m1.u uVarZ = a4.z(uVar);
                if (!(uVarZ != null ? p(uVarZ, z) : true)) {
                    return false;
                }
                uVar.B0(com.gamericefishpro.space.m1.s.e, com.gamericefishpro.space.m1.s.i);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                throw new com.gamericefishpro.space.oh.k();
            }
        }
        return true;
    }

    public static void q(com.gamericefishpro.space.ri.e eVar) {
        eVar.j(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(com.gamericefishpro.space.c6.c cVar, Throwable th) {
        boolean zIsTerminated;
        if (cVar != 0) {
            if (th != null) {
                try {
                    com.gamericefishpro.space.m5.a.p(cVar);
                    return;
                } catch (Throwable th2) {
                    com.gamericefishpro.space.oh.c.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (!(cVar instanceof ExecutorService)) {
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                } else if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else {
                    if (!(cVar instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) cVar).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) cVar;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final void s(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                com.gamericefishpro.space.oh.c.a(th, th2);
            }
        }
    }

    public static com.gamericefishpro.space.t.h0 t() {
        long[] jArr = com.gamericefishpro.space.t.p0.a;
        return new com.gamericefishpro.space.t.h0();
    }

    public static final Object u(com.gamericefishpro.space.l4.g gVar, Function2 function2, com.gamericefishpro.space.th.a aVar) {
        return gVar.m(new com.gamericefishpro.space.p4.c(function2, null, 1), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:41:0x0092 BREAK  A[LOOP:0: B:11:0x0016->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[SYNTHETIC] */
    public static final List v(com.gamericefishpro.space.c5.e eVar, int i, int i2) {
        TreeMap treeMap;
        Pair pair;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i == i2) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                if (z2) {
                    treeMap2 = (TreeMap) eVar.a.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) eVar.a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap, treeMap.keySet());
                    }
                }
                if (pair == null) {
                    Map map = (Map) pair.d;
                    it = ((Iterable) pair.e).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                if (z2) {
                    treeMap2 = (TreeMap) eVar.a.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) eVar.a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap, treeMap.keySet());
                    }
                }
                if (pair == null) {
                    Map map2 = (Map) pair.d;
                    it = ((Iterable) pair.e).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                Intrinsics.b(obj);
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            Intrinsics.b(obj2);
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    public static com.gamericefishpro.space.z.k w(com.gamericefishpro.space.t0.r rVar) {
        float f = com.gamericefishpro.space.v.q0.a;
        com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) rVar.j(com.gamericefishpro.space.i2.b1.h);
        boolean zC = rVar.c(cVar.b());
        Object objP = rVar.P();
        Object obj = com.gamericefishpro.space.t0.n.a;
        if (zC || objP == obj) {
            objP = new com.gamericefishpro.space.w.r(new com.gamericefishpro.space.tb.u(cVar));
            rVar.k0(objP);
        }
        com.gamericefishpro.space.w.r rVar2 = (com.gamericefishpro.space.w.r) objP;
        boolean zF = rVar.f(rVar2);
        Object objP2 = rVar.P();
        if (zF || objP2 == obj) {
            objP2 = new com.gamericefishpro.space.z.k(rVar2);
            rVar.k0(objP2);
        }
        return (com.gamericefishpro.space.z.k) objP2;
    }

    public static SharedPreferences x(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final boolean y(com.gamericefishpro.space.s5.a aVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (i > i2 && aVar.l) {
            return false;
        }
        Set set = aVar.m;
        return aVar.k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static void z(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract void A(int i);

    public abstract void B(Typeface typeface, boolean z);

    public abstract void G(com.gamericefishpro.space.h3.g gVar, com.gamericefishpro.space.h3.g gVar2);

    public abstract void H(com.gamericefishpro.space.h3.g gVar, Thread thread);

    public abstract boolean m(com.gamericefishpro.space.h3.h hVar, com.gamericefishpro.space.h3.d dVar, com.gamericefishpro.space.h3.d dVar2);

    public abstract boolean n(com.gamericefishpro.space.h3.h hVar, Object obj, Object obj2);

    public abstract boolean o(com.gamericefishpro.space.h3.h hVar, com.gamericefishpro.space.h3.g gVar, com.gamericefishpro.space.h3.g gVar2);
}
