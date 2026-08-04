package com.gamericefishpro.space.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.SQLException;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.BackEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.MainActivity;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.c6.c;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.u0;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f5.q0;
import com.gamericefishpro.space.fa.m;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.j;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h4.i;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.g;
import com.gamericefishpro.space.i9.n;
import com.gamericefishpro.space.i9.o;
import com.gamericefishpro.space.i9.q;
import com.gamericefishpro.space.i9.v3;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.m1.s;
import com.gamericefishpro.space.m1.u;
import com.gamericefishpro.space.m1.v;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.q0.e0;
import com.gamericefishpro.space.q0.m0;
import com.gamericefishpro.space.q0.p0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.qh.d;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.t2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.ta.b;
import com.gamericefishpro.space.u0.l0;
import com.gamericefishpro.space.u1.f;
import com.gamericefishpro.space.v0.e;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.y5.h;
import com.gamericefishpro.space.z4.s0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static volatile b b;
    public static f c;
    public static f d;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static final r A(int i) {
        if (i == 0) {
            return r.d;
        }
        if (i == 1) {
            return r.e;
        }
        if (i == 2) {
            return r.i;
        }
        if (i == 3) {
            return r.v;
        }
        if (i == 4) {
            return r.w;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(y0.f(i, "Could not convert ", " to NetworkType"));
        }
        return r.y;
    }

    public static final x B(int i) {
        if (i == 0) {
            return x.d;
        }
        if (i == 1) {
            return x.e;
        }
        throw new IllegalArgumentException(y0.f(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final y C(int i) {
        if (i == 0) {
            return y.d;
        }
        if (i == 1) {
            return y.e;
        }
        if (i == 2) {
            return y.i;
        }
        if (i == 3) {
            return y.v;
        }
        if (i == 4) {
            return y.w;
        }
        if (i == 5) {
            return y.y;
        }
        throw new IllegalArgumentException(y0.f(i, "Could not convert ", " to State"));
    }

    public static final boolean E(u uVar, com.gamericefishpro.space.f3.f fVar) {
        Object[] objArr = new u[16];
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new l[16]);
        l lVar = uVar.d;
        l lVar2 = lVar.y;
        if (lVar2 == null) {
            k.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i = 0;
        while (true) {
            int i2 = eVar.i;
            if (i2 == 0) {
                break;
            }
            l lVarE = (l) eVar.l(i2 - 1);
            if ((lVarE.v & 1024) == 0) {
                k.b(eVar, lVarE);
            } else {
                while (lVarE != null) {
                    if ((lVarE.i & 1024) != 0) {
                        e eVar2 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof u) {
                                u uVar2 = (u) lVarE;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = uVar2;
                                i = i3;
                            } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof j)) {
                                int i4 = 0;
                                for (l lVar3 = ((j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                    if ((lVar3.i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVarE = k.e(eVar2);
                        }
                        break;
                    }
                    lVarE = lVarE.y;
                }
            }
        }
        com.gamericefishpro.space.ph.u.m(objArr, v.a, 0, i);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                u uVar3 = (u) objArr[i5];
                if (a4.E(uVar3) && l(uVar3, fVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean F(u uVar, com.gamericefishpro.space.f3.f fVar) {
        Object[] objArr = new u[16];
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
        }
        e eVar = new e(new l[16]);
        l lVar = uVar.d;
        l lVar2 = lVar.y;
        if (lVar2 == null) {
            k.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i = 0;
        while (true) {
            int i2 = eVar.i;
            if (i2 == 0) {
                break;
            }
            l lVarE = (l) eVar.l(i2 - 1);
            if ((lVarE.v & 1024) == 0) {
                k.b(eVar, lVarE);
            } else {
                while (lVarE != null) {
                    if ((lVarE.i & 1024) != 0) {
                        e eVar2 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof u) {
                                u uVar2 = (u) lVarE;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = uVar2;
                                i = i3;
                            } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof j)) {
                                int i4 = 0;
                                for (l lVar3 = ((j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                    if ((lVar3.i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new e(new l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVarE = k.e(eVar2);
                        }
                        break;
                    }
                    lVarE = lVarE.y;
                }
            }
        }
        com.gamericefishpro.space.ph.u.m(objArr, v.a, 0, i);
        for (int i5 = 0; i5 < i; i5++) {
            u uVar3 = (u) objArr[i5];
            if (a4.E(uVar3) && s(uVar3, fVar)) {
                return true;
            }
        }
        return false;
    }

    public static final List G(c cVar) {
        int iQ = a4.q(cVar, "id");
        int iQ2 = a4.q(cVar, "seq");
        int iQ3 = a4.q(cVar, "from");
        int iQ4 = a4.q(cVar, "to");
        d dVarB = w.b();
        while (cVar.H()) {
            dVarB.add(new com.gamericefishpro.space.y5.e((int) cVar.getLong(iQ), (int) cVar.getLong(iQ2), cVar.g(iQ3), cVar.g(iQ4)));
        }
        return CollectionsKt.H(w.a(dVarB));
    }

    public static final h H(com.gamericefishpro.space.c6.a aVar, String str, boolean z) {
        c cVarO = aVar.O("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iQ = a4.q(cVarO, "seqno");
            int iQ2 = a4.q(cVarO, "cid");
            int iQ3 = a4.q(cVarO, "name");
            int iQ4 = a4.q(cVarO, "desc");
            if (iQ != -1 && iQ2 != -1 && iQ3 != -1 && iQ4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarO.H()) {
                    if (((int) cVarO.getLong(iQ2)) >= 0) {
                        int i = (int) cVarO.getLong(iQ);
                        String strG = cVarO.g(iQ3);
                        String str2 = cVarO.getLong(iQ4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strG);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listI = CollectionsKt.I(linkedHashMap.entrySet(), new m(5));
                ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(listI, 10));
                Iterator it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listL = CollectionsKt.L(arrayList);
                List listI2 = CollectionsKt.I(linkedHashMap2.entrySet(), new m(6));
                ArrayList arrayList2 = new ArrayList(com.gamericefishpro.space.ph.y.j(listI2, 10));
                Iterator it2 = listI2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                h hVar = new h(str, z, listL, CollectionsKt.L(arrayList2));
                y3.r(cVarO, null);
                return hVar;
            }
            y3.r(cVarO, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
      0x0138: PHI (r13v14 com.gamericefishpro.space.h1.l) = (r13v9 com.gamericefishpro.space.h1.l), (r13v15 com.gamericefishpro.space.h1.l) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean I(u uVar, u uVar2, int i, com.gamericefishpro.space.f3.f fVar) {
        l lVar;
        l lVar2;
        f0 f0VarS;
        a1 a1Var;
        l lVarE;
        e eVar;
        if (uVar.F0() != s.e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new u[16];
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
        }
        e eVar2 = new e(new l[16]);
        l lVar3 = uVar.d;
        l lVar4 = lVar3.y;
        if (lVar4 == null) {
            k.b(eVar2, lVar3);
        } else {
            eVar2.b(lVar4);
        }
        int i2 = 0;
        while (true) {
            int i3 = eVar2.i;
            lVar = null;
            if (i3 == 0) {
                break;
            }
            l lVarE2 = (l) eVar2.l(i3 - 1);
            if ((lVarE2.v & 1024) == 0) {
                k.b(eVar2, lVarE2);
            } else {
                while (lVarE2 != null) {
                    if ((lVarE2.i & 1024) != 0) {
                        e eVar3 = null;
                        while (lVarE2 != null) {
                            if (lVarE2 instanceof u) {
                                u uVar3 = (u) lVarE2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = uVar3;
                                i2 = i4;
                            } else if ((lVarE2.i & 1024) != 0 && (lVarE2 instanceof j)) {
                                int i5 = 0;
                                for (l lVar5 = ((j) lVarE2).I; lVar5 != null; lVar5 = lVar5.y) {
                                    if ((lVar5.i & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lVarE2 = lVar5;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new e(new l[16]);
                                            }
                                            if (lVarE2 != null) {
                                                eVar3.b(lVarE2);
                                                lVarE2 = null;
                                            }
                                            eVar3.b(lVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            lVarE2 = k.e(eVar3);
                        }
                        break;
                    }
                    lVarE2 = lVarE2.y;
                }
            }
        }
        com.gamericefishpro.space.ph.u.m(objArr, v.a, 0, i2);
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, i2);
            int i6 = intRangeF.d;
            int i7 = intRangeF.e;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        u uVar4 = (u) objArr[i7];
                        if (a4.E(uVar4) && l(uVar4, fVar)) {
                            return true;
                        }
                    }
                    if (Intrinsics.a(objArr[i7], uVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!uVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                lVar2 = uVar.d.w;
                f0VarS = k.s(uVar);
                loop5: while (f0VarS != null) {
                    if ((f0VarS.Z.f.v & 1024) != 0) {
                        while (lVar2 != null) {
                            if ((lVar2.i & 1024) != 0) {
                                lVarE = lVar2;
                                eVar = null;
                                while (lVarE != null) {
                                    if (lVarE instanceof u) {
                                        lVar = lVarE;
                                        break loop5;
                                    }
                                    if ((lVarE.i & 1024) == 0) {
                                    }
                                    lVarE = k.e(eVar);
                                }
                            }
                            lVar2 = lVar2.w;
                        }
                    }
                    f0VarS = f0VarS.v();
                    if (f0VarS != null) {
                    }
                }
                if (lVar != null) {
                    return ((Boolean) fVar.invoke(uVar)).booleanValue();
                }
            }
            return false;
        }
        IntRange intRangeF2 = com.gamericefishpro.space.ji.f.f(0, i2);
        int i8 = intRangeF2.d;
        int i9 = intRangeF2.e;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    u uVar5 = (u) objArr[i8];
                    if (a4.E(uVar5) && s(uVar5, fVar)) {
                        return true;
                    }
                }
                if (Intrinsics.a(objArr[i8], uVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && uVar.C0().a) {
            if (!uVar.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            lVar2 = uVar.d.w;
            f0VarS = k.s(uVar);
            loop5: while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 1024) != 0) {
                    while (lVar2 != null) {
                        if ((lVar2.i & 1024) != 0) {
                            lVarE = lVar2;
                            eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof u) {
                                    lVar = lVarE;
                                    break loop5;
                                }
                                if ((lVarE.i & 1024) == 0 && (lVarE instanceof j)) {
                                    int i10 = 0;
                                    for (l lVar6 = ((j) lVarE).I; lVar6 != null; lVar6 = lVar6.y) {
                                        if ((lVar6.i & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lVarE = lVar6;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lVarE = k.e(eVar);
                            }
                        }
                        lVar2 = lVar2.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar2 = (f0VarS != null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
            }
            if (lVar != null) {
                return ((Boolean) fVar.invoke(uVar)).booleanValue();
            }
        }
        return false;
    }

    public static void J(TextView textView, int i) {
        a4.o(i);
        if (Build.VERSION.SDK_INT >= 28) {
            com.gamericefishpro.space.d4.h.o(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void K(TextView textView, int i) {
        a4.o(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void L(TextView textView, int i) {
        a4.o(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final void M(l0 l0Var, int i, Object obj) {
        l0Var.g[(l0Var.h - l0Var.c[l0Var.d - 1].b) + i] = obj;
    }

    public static final void N(l0 l0Var, int i, Object obj, int i2, Object obj2) {
        int i3 = l0Var.h - l0Var.c[l0Var.d - 1].b;
        Object[] objArr = l0Var.g;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static void O(View view, com.gamericefishpro.space.ka.j jVar) {
        com.gamericefishpro.space.ea.a aVar = jVar.e.c;
        if (aVar == null || !aVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        com.gamericefishpro.space.ka.h hVar = jVar.e;
        if (hVar.m != elevation) {
            hVar.m = elevation;
            jVar.s();
        }
    }

    public static final int P(y state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new com.gamericefishpro.space.oh.k();
                    }
                }
            }
        }
        return i;
    }

    public static final void Q(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final String R(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final void S(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static ActionMode.Callback T(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof i) || callback == null) ? callback : new i(callback, textView);
    }

    public static n U(Object obj) {
        if (obj == null) {
            return n.k;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.gamericefishpro.space.i9.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.gamericefishpro.space.i9.d dVar = new com.gamericefishpro.space.i9.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.t(dVar.r(), U(it.next()));
            }
            return dVar;
        }
        com.gamericefishpro.space.i9.k kVar = new com.gamericefishpro.space.i9.k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            n nVarU = U(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                kVar.n((String) string, nVarU);
            }
        }
        return kVar;
    }

    public static n V(v3 v3Var) {
        if (v3Var == null) {
            return n.j;
        }
        int iX = v3Var.x() - 1;
        if (iX == 1) {
            return v3Var.r() ? new q(v3Var.s()) : n.q;
        }
        if (iX == 2) {
            return v3Var.v() ? new g(Double.valueOf(v3Var.w())) : new g(null);
        }
        if (iX == 3) {
            return v3Var.t() ? new com.gamericefishpro.space.i9.e(Boolean.valueOf(v3Var.u())) : new com.gamericefishpro.space.i9.e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = v3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(V((v3) it.next()));
        }
        return new o(v3Var.q(), arrayList);
    }

    public static final com.gamericefishpro.space.c3.e a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        com.gamericefishpro.space.d3.a aVarA = com.gamericefishpro.space.d3.b.a(f);
        if (aVarA == null) {
            aVarA = new com.gamericefishpro.space.c3.m(f);
        }
        return new com.gamericefishpro.space.c3.e(f2, f, aVarA);
    }

    public static final void b(Function0 onBack, com.gamericefishpro.space.o7.e eVar, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.o7.e eVar2;
        com.gamericefishpro.space.h2.y yVar;
        com.gamericefishpro.space.o7.e eVar3;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        com.gamericefishpro.space.h1.e eVar4 = com.gamericefishpro.space.h1.b.w;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar2.b0(640971696);
        int i3 = i | (rVar2.h(onBack) ? 4 : 2) | 16;
        if ((i3 & 19) == 18 && rVar2.E()) {
            rVar2.V();
            eVar3 = eVar;
        } else {
            rVar2.X();
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                com.gamericefishpro.space.z4.y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(com.gamericefishpro.space.o7.e.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                i2 = i3 & (-113);
                eVar2 = (com.gamericefishpro.space.o7.e) s0VarK;
            } else {
                rVar2.V();
                i2 = i3 & (-113);
                eVar2 = eVar;
            }
            int i4 = i2;
            rVar2.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(eVar2.c, rVar2);
            h0 h0Var = g1.c;
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar5);
            com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar7);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar8 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar8);
            com.gamericefishpro.space.o7.e eVar9 = eVar2;
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = com.gamericefishpro.space.o1.s.b;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.5f))), new Pair(Float.valueOf(0.4f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.2f))), new Pair(Float.valueOf(1.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.85f)))}), null, 6), rVar2, 6);
            a4.f(rVar2, 0);
            float f = 20;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(h0Var, f, 48);
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarM, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                yVar = yVar2;
                rVar2.k(yVar);
            } else {
                yVar = yVar2;
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar5);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar6);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar7, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = g1.b(jVar, 1.0f);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarB, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar5);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL3, eVar6);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar7, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar8);
            d5.e(onBack, rVar2, i4 & 14);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, 16), rVar2);
            long j2 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h2.y yVar3 = yVar;
            r0.a("HISTORY", null, j2, com.gamericefishpro.space.hj.c.C(28), com.gamericefishpro.space.u2.k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new j0(com.gamericefishpro.space.o1.s.c(j, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 24), rVar2);
            if (((com.gamericefishpro.space.o7.d) v0VarL.getValue()).b) {
                rVar2.a0(-758706364);
                com.gamericefishpro.space.h1.m mVarA = c0.a(g1.b(jVar, 1.0f));
                com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar4, false);
                int iHashCode4 = Long.hashCode(rVar2.T);
                l1 l1VarL4 = rVar2.l();
                com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarA, rVar2);
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar3);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar5);
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarL4, eVar6);
                com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar7, rVar2, dVar);
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF4, eVar8);
                r0.a("Loading...", null, com.gamericefishpro.space.o1.s.c(j2, 0.6f), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 390, 0, 262138);
                rVar2 = rVar;
                rVar2.p(true);
                rVar2.p(false);
            } else if (((com.gamericefishpro.space.o7.d) v0VarL.getValue()).a.isEmpty()) {
                rVar2.a0(-758454613);
                com.gamericefishpro.space.h1.m mVarA2 = c0.a(g1.b(jVar, 1.0f));
                com.gamericefishpro.space.f2.l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar4, false);
                int iHashCode5 = Long.hashCode(rVar2.T);
                l1 l1VarL5 = rVar2.l();
                com.gamericefishpro.space.h1.m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarA2, rVar2);
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar3);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, l0VarD3, eVar5);
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarL5, eVar6);
                com.gamericefishpro.space.m5.a.o(iHashCode5, rVar2, eVar7, rVar2, dVar);
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF5, eVar8);
                y3.c(rVar2, 0);
                rVar2.p(true);
                rVar2.p(false);
            } else {
                rVar2.a0(-758257701);
                com.gamericefishpro.space.d0.e eVarG = com.gamericefishpro.space.d0.h.g(14);
                com.gamericefishpro.space.h1.m mVarA3 = c0.a(jVar);
                w0 w0VarB = com.gamericefishpro.space.d0.j.b(f);
                rVar2.a0(945379848);
                boolean zF = rVar2.f(v0VarL);
                Object objP = rVar2.P();
                if (zF || objP == com.gamericefishpro.space.t0.n.a) {
                    objP = new com.gamericefishpro.space.o7.c(v0VarL, 0);
                    rVar2.k0(objP);
                }
                rVar2.p(false);
                com.gamericefishpro.space.d9.h.f(mVarA3, null, w0VarB, eVarG, null, null, false, null, (Function1) objP, rVar, 24960);
                rVar2 = rVar;
                rVar2.p(false);
            }
            rVar2.p(true);
            rVar2.p(true);
            eVar3 = eVar9;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 10, onBack, eVar3);
        }
    }

    public static final void c(final String label, final boolean z, final f iconVector, final Function0 onToggle, com.gamericefishpro.space.t0.r rVar, final int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(iconVector, "iconVector");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        rVar.b0(-1763353750);
        int i2 = i | (rVar.g(z) ? 32 : 16) | (rVar.f(iconVector) ? 256 : 128) | (rVar.h(onToggle) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = g1.b(jVar, 1.0f);
            rVar.a0(-795216182);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (objP == fVar) {
                objP = y0.d(rVar);
            }
            rVar.p(false);
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(mVarB, (com.gamericefishpro.space.b0.i) objP, false, onToggle, 28);
            float f = 20;
            float f2 = 12;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(mVarI, f, f2);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar, 48);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarM, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar4);
            com.gamericefishpro.space.h1.m mVarB2 = com.gamericefishpro.space.l1.h.b(g1.f(jVar, 40), com.gamericefishpro.space.k0.e.a(f2));
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarB2, com.gamericefishpro.space.o1.s.c(j, 0.1f), com.gamericefishpro.space.o1.o.b), 1, com.gamericefishpro.space.o1.s.c(j, 0.2f), com.gamericefishpro.space.k0.e.a(f2));
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar4);
            com.gamericefishpro.space.q0.j.b(iconVector, label, g1.f(jVar, f), j, rVar, ((i2 >> 6) & 14) | 3504);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, 16), rVar);
            r0.a(label, e1.a(), j, com.gamericefishpro.space.hj.c.C(16), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597830, 0, 262056);
            rVar.a0(-1718807664);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP2 = rVar.P();
            if (z2 || objP2 == fVar) {
                objP2 = new com.gamericefishpro.space.a7.c(24, onToggle);
                rVar.k0(objP2);
            }
            rVar.p(false);
            long j2 = com.gamericefishpro.space.l7.c.b;
            long jC = com.gamericefishpro.space.o1.s.c(j, 0.7f);
            long jC2 = com.gamericefishpro.space.o1.s.c(j, 0.2f);
            long j3 = com.gamericefishpro.space.o1.s.f;
            long jA = com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.p, rVar);
            long jA2 = com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.w, rVar);
            long jC3 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.a, rVar), com.gamericefishpro.space.s0.h.b);
            t2 t2Var = com.gamericefishpro.space.q0.b.a;
            long jH = com.gamericefishpro.space.o1.o.h(jC3, ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p);
            long jA3 = com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.e, rVar);
            float f3 = com.gamericefishpro.space.s0.h.f;
            p0.a(z, (Function1) objP2, null, false, new m0(j, j2, j3, jA, jC, jC2, j3, jA2, jH, com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(jA3, f3), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p), j3, com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.c, rVar), com.gamericefishpro.space.s0.h.d), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p), com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.g, rVar), com.gamericefishpro.space.s0.h.h), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p), com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.k, rVar), f3), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p), com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.l, rVar), f3), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p), com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.q0.b.a(com.gamericefishpro.space.s0.h.i, rVar), com.gamericefishpro.space.s0.h.j), ((com.gamericefishpro.space.q0.a) rVar.j(t2Var)).p)), rVar, (i2 >> 3) & 14);
            rVar.p(true);
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(label, z, iconVector, onToggle, i) { // from class: com.gamericefishpro.space.s7.a
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ com.gamericefishpro.space.u1.f i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(7);
                    com.gamericefishpro.space.i.a.c(this.d, this.e, this.i, this.v, (com.gamericefishpro.space.t0.r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-2033600446);
        if ((((rVar2.h(onClick) ? 4 : 2) | i) & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-1215232359);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.f(jVar, 56), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
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
            h0 h0Var = g1.c;
            float f = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, com.gamericefishpro.space.o1.s.c(j, 0.5f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
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
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.n7.z(onClick, i, 1);
        }
    }

    public static final void e(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(722387824);
        if (((i | (rVar2.h(onClick) ? 4 : 2)) & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(1090670426);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, null, "press", rVar2, 384, 10);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.f(jVar, 56), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
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
            h0 h0Var = g1.c;
            float f = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long j = com.gamericefishpro.space.o1.s.b;
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, j, dVar2), rVar2, 0);
            long j2 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.o1.o.c(4278202455L), dVar2), 2, com.gamericefishpro.space.o1.s.c(j2, 0.6f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
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
            f fVarB = com.gamericefishpro.space.hj.c.b;
            if (fVarB == null) {
                com.gamericefishpro.space.u1.e eVar5 = new com.gamericefishpro.space.u1.e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                com.gamericefishpro.space.o1.m0 m0Var = new com.gamericefishpro.space.o1.m0(j);
                com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
                uVar.B(6.0f, 19.0f);
                uVar.y(4.0f);
                uVar.z(10.0f, 5.0f);
                uVar.z(6.0f, 5.0f);
                uVar.G(14.0f);
                uVar.s();
                uVar.B(14.0f, 5.0f);
                uVar.G(14.0f);
                uVar.y(4.0f);
                uVar.z(18.0f, 5.0f);
                uVar.y(-4.0f);
                uVar.s();
                com.gamericefishpro.space.u1.e.a(eVar5, (ArrayList) uVar.e, m0Var);
                fVarB = eVar5.b();
                com.gamericefishpro.space.hj.c.b = fVarB;
            }
            com.gamericefishpro.space.q0.j.b(fVarB, "Pause", g1.f(jVar, 32), j2, rVar, 3504);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.n7.z(onClick, i, 0);
        }
    }

    public static final void f(com.gamericefishpro.space.h1.m mVar, Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-902648221);
        if ((i & 6) == 0) {
            i2 = i | (rVar2.f(mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(onClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-87536928);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) n(iVar, rVar2).getValue()).booleanValue() ? 6 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "button_press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.d(g1.g(mVar, 240), 86), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
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
            h0 h0Var = g1.c;
            float f = 6;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long j = com.gamericefishpro.space.l7.c.d;
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, j, dVar2), rVar2, 0);
            long j2 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.c(4294922834L)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.l7.c.c)), 0.0f, 14), dVar2, 4), 1, com.gamericefishpro.space.o1.s.c(j2, 0.5f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
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
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j2, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            r0.a("PLAY", null, j2, com.gamericefishpro.space.hj.c.C(36), com.gamericefishpro.space.u2.k.y, com.gamericefishpro.space.hj.c.C(2), null, 0L, 0, false, 0, 0, new i0(new j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.b1.f(i, 5, mVar, onClick);
        }
    }

    public static final void g(String url, Function0 onUserValidated, com.gamericefishpro.space.v7.i iVar, com.gamericefishpro.space.x7.f fVar, com.gamericefishpro.space.x7.c cVar, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.v7.i iVar2;
        Object obj;
        com.gamericefishpro.space.x7.f fVar2;
        com.gamericefishpro.space.v7.i iVar3;
        v0 v0Var;
        Object obj2;
        com.gamericefishpro.space.v7.i iVar4;
        com.gamericefishpro.space.x7.f fVar3;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onUserValidated, "onUserValidated");
        rVar.b0(-626723567);
        if (((i | (rVar.f(url) ? 4 : 2) | (rVar.h(onUserValidated) ? 32 : 16) | 9344) & 9363) == 9362 && rVar.E()) {
            rVar.V();
            iVar4 = iVar;
            fVar3 = fVar;
            obj2 = cVar;
        } else {
            rVar.X();
            int i2 = i & 1;
            Object obj3 = com.gamericefishpro.space.t0.n.a;
            com.gamericefishpro.space.th.a aVar = null;
            if (i2 == 0 || rVar.B()) {
                rVar.a0(-1614864554);
                com.gamericefishpro.space.z4.y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(com.gamericefishpro.space.v7.i.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar), null);
                rVar.p(false);
                iVar2 = (com.gamericefishpro.space.v7.i) s0VarK;
                rVar.a0(-1168520582);
                com.gamericefishpro.space.pj.a aVarA = com.gamericefishpro.space.cj.b.a(rVar);
                rVar.a0(-1633490746);
                boolean zF = rVar.f(null) | rVar.f(aVarA);
                Object objP = rVar.P();
                if (zF || objP == obj3) {
                    objP = aVarA.a(b0.a(com.gamericefishpro.space.x7.f.class));
                    rVar.k0(objP);
                }
                rVar.p(false);
                rVar.p(false);
                com.gamericefishpro.space.x7.f fVar4 = (com.gamericefishpro.space.x7.f) objP;
                rVar.a0(-1168520582);
                com.gamericefishpro.space.pj.a aVarA2 = com.gamericefishpro.space.cj.b.a(rVar);
                rVar.a0(-1633490746);
                boolean zF2 = rVar.f(null) | rVar.f(aVarA2);
                Object objP2 = rVar.P();
                if (zF2 || objP2 == obj3) {
                    objP2 = aVarA2.a(b0.a(com.gamericefishpro.space.x7.c.class));
                    rVar.k0(objP2);
                }
                rVar.p(false);
                rVar.p(false);
                obj = (com.gamericefishpro.space.x7.c) objP2;
                fVar2 = fVar4;
            } else {
                rVar.V();
                iVar2 = iVar;
                fVar2 = fVar;
                obj = cVar;
            }
            rVar.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(iVar2.c, rVar);
            Context context = (Context) rVar.j(com.gamericefishpro.space.i2.j0.b);
            Object obj4 = (com.gamericefishpro.space.z4.u) rVar.j(com.gamericefishpro.space.a5.i.a);
            rVar.a0(-752410791);
            Object objP3 = rVar.P();
            if (objP3 == obj3) {
                objP3 = new com.gamericefishpro.space.f1.u();
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.f1.u uVar = (com.gamericefishpro.space.f1.u) objP3;
            rVar.p(false);
            rVar.a0(-752408252);
            Object objP4 = rVar.P();
            if (objP4 == obj3) {
                objP4 = com.gamericefishpro.space.t0.i.v(null);
                rVar.k0(objP4);
            }
            rVar.p(false);
            rVar.a0(-752405524);
            Object objP5 = rVar.P();
            if (objP5 == obj3) {
                objP5 = com.gamericefishpro.space.t0.i.v(null);
                rVar.k0(objP5);
            }
            v0 v0Var2 = (v0) objP5;
            rVar.p(false);
            Object objJ = rVar.j(com.gamericefishpro.space.e.n.a);
            MainActivity mainActivity = objJ instanceof MainActivity ? (MainActivity) objJ : null;
            Unit unit = Unit.a;
            rVar.a0(-752400880);
            boolean zH = rVar.h(mainActivity);
            Object objP6 = rVar.P();
            if (zH || objP6 == obj3) {
                objP6 = new com.gamericefishpro.space.l7.b(mainActivity, aVar, 2);
                rVar.k0(objP6);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, unit, (Function2) objP6);
            a aVar2 = new a(0);
            rVar.a0(-752396493);
            boolean zH2 = rVar.h(iVar2);
            Object objP7 = rVar.P();
            if (zH2 || objP7 == obj3) {
                objP7 = new com.gamericefishpro.space.v7.c(iVar2, 0);
                rVar.k0(objP7);
            }
            rVar.p(false);
            com.gamericefishpro.space.e.q qVarR = com.gamericefishpro.space.hj.c.R(aVar2, (Function1) objP7, rVar, 0);
            a aVar3 = new a(1);
            rVar.a0(-752390666);
            Object objP8 = rVar.P();
            if (objP8 == obj3) {
                objP8 = new com.gamericefishpro.space.o7.c(v0Var2, 1);
                rVar.k0(objP8);
            }
            rVar.p(false);
            com.gamericefishpro.space.e.q qVarR2 = com.gamericefishpro.space.hj.c.R(aVar3, (Function1) objP8, rVar, 48);
            Boolean boolValueOf = Boolean.valueOf(((com.gamericefishpro.space.v7.g) v0VarL.getValue()).b);
            rVar.a0(-752381369);
            boolean zF3 = rVar.f(v0VarL) | rVar.h(context) | rVar.h(iVar2) | rVar.h(qVarR);
            Object objP9 = rVar.P();
            if (zF3 || objP9 == obj3) {
                iVar3 = iVar2;
                v0Var = v0VarL;
                objP9 = new com.gamericefishpro.space.v7.d(context, iVar3, qVarR, v0Var, null);
                rVar.k0(objP9);
            } else {
                iVar3 = iVar2;
                v0Var = v0VarL;
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, boolValueOf, (Function2) objP9);
            boolean z = !uVar.isEmpty();
            rVar.a0(-752366757);
            Object objP10 = rVar.P();
            if (objP10 == obj3) {
                objP10 = new com.gamericefishpro.space.a3.b(18, uVar);
                rVar.k0(objP10);
            }
            rVar.p(false);
            y3.a(z, (Function0) objP10, rVar, 48);
            h0 h0Var = g1.c;
            long j = com.gamericefishpro.space.o1.s.b;
            com.gamericefishpro.space.x7.f fVar5 = fVar2;
            com.gamericefishpro.space.b1.h hVarC = com.gamericefishpro.space.b1.n.c(1929367328, new com.gamericefishpro.space.v7.e(fVar2, iVar3, qVarR2, onUserValidated, url, uVar, v0Var2, v0Var), rVar);
            Object obj5 = obj;
            e0.a(h0Var, null, null, null, null, 0, j, 0L, null, hVarC, rVar, 806879238, 446);
            rVar.a0(-752286022);
            boolean zF4 = rVar.f(obj5) | rVar.h(obj4);
            Object objP11 = rVar.P();
            if (zF4 || objP11 == obj3) {
                objP11 = new com.gamericefishpro.space.a5.b(obj4, obj5, uVar, 3);
                rVar.k0(objP11);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.d(obj4, (Function1) objP11, rVar);
            obj2 = obj5;
            iVar4 = iVar3;
            fVar3 = fVar5;
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.n7.s(url, onUserValidated, iVar4, fVar3, obj2, i, 2);
        }
    }

    public static final long h(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = com.gamericefishpro.space.z1.a.p;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0276  */
    public static final void i(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.g0.v vVar, com.gamericefishpro.space.g0.c cVar, u0 u0Var, com.gamericefishpro.space.z.k kVar, boolean z, com.gamericefishpro.space.y.l lVar, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.d0.d dVar, Function1 function1, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        int i3;
        int i4;
        com.gamericefishpro.space.g0.v vVar2;
        boolean z2;
        com.gamericefishpro.space.g0.v vVar3;
        boolean z3;
        boolean z4;
        com.gamericefishpro.space.ei.q qVar;
        com.gamericefishpro.space.h1.m mVarM;
        rVar.b0(708740370);
        if ((i & 6) == 0) {
            i3 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.f(vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? rVar.f(cVar) : rVar.h(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= rVar.f(u0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar.g(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= rVar.g(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= rVar.f(kVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rVar.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rVar.f(lVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rVar.f(gVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar.f(dVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar.h(function1) ? 32 : 16;
        }
        if (rVar.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            rVar.X();
            if ((i & 1) != 0 && !rVar.B()) {
                rVar.V();
            }
            rVar.q();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            v0 v0VarZ = com.gamericefishpro.space.t0.i.z(function1, rVar);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && rVar.f(vVar)) || (i7 & 6) == 4;
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (z5 || objP == obj) {
                com.gamericefishpro.space.f0.k kVar2 = new com.gamericefishpro.space.f0.k(v0VarZ, 1);
                com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.f.w;
                com.gamericefishpro.space.a8.c cVar2 = n2.a;
                objP = new com.gamericefishpro.space.f0.l(0, 1, s2.class, new d0(new com.gamericefishpro.space.e.e(2, new d0(kVar2, fVar), vVar), fVar), "value", "getValue()Ljava/lang/Object;");
                rVar.k0(objP);
            }
            com.gamericefishpro.space.ei.q qVar2 = (com.gamericefishpro.space.ei.q) objP;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 112) ^ 48) > 32 && rVar.g(false)) || (i9 & 48) == 32) | ((((i9 & 14) ^ 6) > 4 && rVar.f(vVar)) || (i9 & 6) == 4);
            Object objP2 = rVar.P();
            if (z6 || objP2 == obj) {
                objP2 = new com.gamericefishpro.space.g0.x(vVar);
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.g0.x xVar = (com.gamericefishpro.space.g0.x) objP2;
            Object objP3 = rVar.P();
            if (objP3 == obj) {
                objP3 = com.gamericefishpro.space.t0.i.n(kotlin.coroutines.g.d, rVar);
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.pi.x xVar2 = (com.gamericefishpro.space.pi.x) objP3;
            com.gamericefishpro.space.o1.v vVar4 = (com.gamericefishpro.space.o1.v) rVar.j(com.gamericefishpro.space.i2.b1.g);
            com.gamericefishpro.space.h0.f0 f0Var = !((Boolean) rVar.j(com.gamericefishpro.space.i2.b1.v)).booleanValue() ? com.gamericefishpro.space.h0.e1.a : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && rVar.f(cVar)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && rVar.f(vVar)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && rVar.f(u0Var)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) > 16384 && rVar.g(false)) {
                z2 = true;
            } else if ((i10 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zF = z7 | z2 | ((((458752 & i10) ^ 196608) > 131072 && rVar.g(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) > 1048576 && rVar.f(dVar)) || (i10 & 1572864) == 1048576) | ((((i10 & 29360128) ^ 12582912) > 8388608 && rVar.f(gVar)) || (i10 & 12582912) == 8388608) | rVar.f(vVar4);
            Object objP4 = rVar.P();
            if (zF || objP4 == obj) {
                vVar3 = vVar;
                z3 = false;
                z4 = true;
                Object oVar = new com.gamericefishpro.space.f0.o(vVar3, u0Var, qVar2, cVar, gVar, dVar, xVar2, vVar4, f0Var);
                qVar = qVar2;
                rVar.k0(oVar);
                objP4 = oVar;
            } else {
                vVar3 = vVar;
                qVar = qVar2;
                z3 = false;
                z4 = true;
            }
            com.gamericefishpro.space.f0.o oVar2 = (com.gamericefishpro.space.f0.o) objP4;
            com.gamericefishpro.space.z.v0 v0Var = com.gamericefishpro.space.z.v0.d;
            if (z) {
                rVar.a0(27281635);
                if (((i6 ^ 6) <= 4 || !rVar.f(vVar3)) && (i5 & 6) != 4) {
                    z4 = z3;
                }
                Object objP5 = rVar.P();
                if (z4 || objP5 == obj) {
                    objP5 = new com.gamericefishpro.space.g0.d(vVar3);
                    rVar.k0(objP5);
                }
                mVarM = com.gamericefishpro.space.h0.n.m((com.gamericefishpro.space.g0.d) objP5, vVar3.n, v0Var);
                rVar.p(z3);
            } else {
                rVar.a0(27577840);
                rVar.p(z3);
                mVarM = com.gamericefishpro.space.h1.j.a;
            }
            vVar2 = vVar3;
            com.gamericefishpro.space.h0.n.a(qVar, com.gamericefishpro.space.y.q.l(com.gamericefishpro.space.h0.n.n(mVar.c(vVar3.k).c(vVar3.l), qVar, xVar, v0Var, z).c(mVarM).c(vVar3.m.i), vVar3, v0Var, lVar, z, kVar, vVar3.f), vVar2.o, oVar2, rVar, 0);
        } else {
            vVar2 = vVar;
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g0.e(mVar, vVar2, cVar, u0Var, kVar, z, lVar, gVar, dVar, function1, i, i2);
        }
    }

    public static final com.gamericefishpro.space.j5.b j(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new com.gamericefishpro.space.j5.b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void k(final int i, final float f, final float f2, final float f3, final int i2, float f4, final float f5, boolean z, com.gamericefishpro.space.t0.r rVar, final int i3, final int i4) {
        boolean z2;
        boolean z3;
        float f6;
        boolean z4;
        Object objP;
        final boolean z5;
        p1 p1VarT;
        rVar.b0(-1549877015);
        int i5 = i3 | (rVar.d(i) ? 4 : 2) | (rVar.c(f) ? 32 : 16) | (rVar.c(f2) ? 256 : 128);
        if ((i3 & 1572864) == 0) {
            i5 |= rVar.c(f5) ? 1048576 : 524288;
        }
        int i6 = i4 & 128;
        if (i6 == 0) {
            if ((i3 & 12582912) == 0) {
                z2 = z;
                i5 |= rVar.g(z2) ? 8388608 : 4194304;
            }
            if ((4793491 & i5) == 4793490 || !rVar.E()) {
                if (i6 != 0) {
                    z2 = false;
                }
                com.gamericefishpro.space.w.b0 b0VarM = com.gamericefishpro.space.w.c.m("fish_swim_" + i, rVar);
                com.gamericefishpro.space.w.z zVarE = com.gamericefishpro.space.w.c.e(b0VarM, f, f2, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(i2, 2, t.b), com.gamericefishpro.space.w.j0.d), "x_pos", rVar, (i5 & 112) | 24584 | (i5 & 896) | 4096);
                z3 = z2;
                com.gamericefishpro.space.w.z zVarE2 = com.gamericefishpro.space.w.c.e(b0VarM, -f5, f5, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1200, 2, t.a), com.gamericefishpro.space.w.j0.e), "y_offset", rVar, ((i5 >> 12) & 896) | 28680);
                com.gamericefishpro.space.t1.b bVarI = com.gamericefishpro.space.u6.f.I(i, rVar, i5 & 14);
                f6 = f4;
                com.gamericefishpro.space.h1.m mVarF = g1.f(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.h1.j.a, ((Number) zVarE.v.getValue()).floatValue(), ((Number) zVarE2.v.getValue()).floatValue() + f3), f6);
                rVar.a0(176423436);
                if ((i5 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP = rVar.P();
                if (z4 || objP == com.gamericefishpro.space.t0.n.a) {
                    objP = new com.gamericefishpro.space.l7.g(1, z3);
                    rVar.k0(objP);
                }
                rVar.p(false);
                com.gamericefishpro.space.y.q.b(bVarI, "Animated Fish", com.gamericefishpro.space.o1.o.m(mVarF, (Function1) objP), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 24632, 104);
                z5 = z3;
            } else {
                rVar.V();
                f6 = f4;
                z5 = z2;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                final float f7 = f6;
                p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.t7.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        com.gamericefishpro.space.i.a.k(i, f, f2, f3, i2, f7, f5, z5, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 12582912;
        z2 = z;
        if ((4793491 & i5) == 4793490) {
            if (i6 != 0) {
                z2 = false;
            }
            com.gamericefishpro.space.w.b0 b0VarM2 = com.gamericefishpro.space.w.c.m("fish_swim_" + i, rVar);
            com.gamericefishpro.space.w.z zVarE3 = com.gamericefishpro.space.w.c.e(b0VarM2, f, f2, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(i2, 2, t.b), com.gamericefishpro.space.w.j0.d), "x_pos", rVar, (i5 & 112) | 24584 | (i5 & 896) | 4096);
            z3 = z2;
            com.gamericefishpro.space.w.z zVarE4 = com.gamericefishpro.space.w.c.e(b0VarM2, -f5, f5, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1200, 2, t.a), com.gamericefishpro.space.w.j0.e), "y_offset", rVar, ((i5 >> 12) & 896) | 28680);
            com.gamericefishpro.space.t1.b bVarI2 = com.gamericefishpro.space.u6.f.I(i, rVar, i5 & 14);
            f6 = f4;
            com.gamericefishpro.space.h1.m mVarF2 = g1.f(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.h1.j.a, ((Number) zVarE3.v.getValue()).floatValue(), ((Number) zVarE4.v.getValue()).floatValue() + f3), f6);
            rVar.a0(176423436);
            if ((i5 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP = rVar.P();
            if (z4) {
                objP = new com.gamericefishpro.space.l7.g(1, z3);
                rVar.k0(objP);
            } else {
                objP = new com.gamericefishpro.space.l7.g(1, z3);
                rVar.k0(objP);
            }
            rVar.p(false);
            com.gamericefishpro.space.y.q.b(bVarI2, "Animated Fish", com.gamericefishpro.space.o1.o.m(mVarF2, (Function1) objP), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 24632, 104);
            z5 = z3;
        } else {
            if (i6 != 0) {
                z2 = false;
            }
            com.gamericefishpro.space.w.b0 b0VarM3 = com.gamericefishpro.space.w.c.m("fish_swim_" + i, rVar);
            com.gamericefishpro.space.w.z zVarE5 = com.gamericefishpro.space.w.c.e(b0VarM3, f, f2, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(i2, 2, t.b), com.gamericefishpro.space.w.j0.d), "x_pos", rVar, (i5 & 112) | 24584 | (i5 & 896) | 4096);
            z3 = z2;
            com.gamericefishpro.space.w.z zVarE6 = com.gamericefishpro.space.w.c.e(b0VarM3, -f5, f5, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1200, 2, t.a), com.gamericefishpro.space.w.j0.e), "y_offset", rVar, ((i5 >> 12) & 896) | 28680);
            com.gamericefishpro.space.t1.b bVarI3 = com.gamericefishpro.space.u6.f.I(i, rVar, i5 & 14);
            f6 = f4;
            com.gamericefishpro.space.h1.m mVarF3 = g1.f(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.h1.j.a, ((Number) zVarE5.v.getValue()).floatValue(), ((Number) zVarE6.v.getValue()).floatValue() + f3), f6);
            rVar.a0(176423436);
            if ((i5 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP = rVar.P();
            if (z4) {
                objP = new com.gamericefishpro.space.l7.g(1, z3);
                rVar.k0(objP);
            } else {
                objP = new com.gamericefishpro.space.l7.g(1, z3);
                rVar.k0(objP);
            }
            rVar.p(false);
            com.gamericefishpro.space.y.q.b(bVarI3, "Animated Fish", com.gamericefishpro.space.o1.o.m(mVarF3, (Function1) objP), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 24632, 104);
            z5 = z3;
        }
        p1VarT = rVar.t();
        if (p1VarT != null) {
            final float f8 = f6;
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.t7.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.gamericefishpro.space.i.a.k(i, f, f2, f3, i2, f8, f5, z5, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[RETURN] */
    public static final boolean l(u uVar, com.gamericefishpro.space.f3.f fVar) {
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarZ = a4.z(uVar);
                if (uVarZ == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = uVarZ.F0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (l(uVarZ, fVar) || t(uVar, uVarZ, 2, fVar) || (uVarZ.C0().a && ((Boolean) fVar.invoke(uVarZ)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return t(uVar, uVarZ, 2, fVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (!E(uVar, fVar)) {
                    if (!(uVar.C0().a ? ((Boolean) fVar.invoke(uVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return E(uVar, fVar);
    }

    public static final LinkedHashSet m(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new com.gamericefishpro.space.l6.d(z, uri));
                    }
                    Unit unit = Unit.a;
                    objectInputStream.close();
                    Unit unit2 = Unit.a;
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        y3.s(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                y3.s(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final v0 n(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.t0.r rVar) {
        Object objP = rVar.P();
        com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
        if (objP == fVar) {
            objP = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
            rVar.k0(objP);
        }
        v0 v0Var = (v0) objP;
        Object objP2 = rVar.P();
        if (objP2 == fVar) {
            objP2 = new com.gamericefishpro.space.b0.o(iVar, v0Var, null, 0);
            rVar.k0(objP2);
        }
        com.gamericefishpro.space.t0.i.e(rVar, iVar, (Function2) objP2);
        return v0Var;
    }

    public static void o(com.gamericefishpro.space.f5.a0 a0Var, String str, List list, com.gamericefishpro.space.b1.h hVar, int i) {
        if ((i & 2) != 0) {
            list = g0.d;
        }
        g0 g0Var = g0.d;
        q0 q0Var = a0Var.f;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(com.gamericefishpro.space.g5.i.class, "navigatorClass");
        com.gamericefishpro.space.g5.j navDestination = new com.gamericefishpro.space.g5.j((com.gamericefishpro.space.g5.i) q0Var.b(com.gamericefishpro.space.f5.h.d(com.gamericefishpro.space.g5.i.class)), str, hVar);
        for (com.gamericefishpro.space.f5.g gVar : list) {
            String name = gVar.a;
            com.gamericefishpro.space.f5.i argument = gVar.b;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(argument, "argument");
            ((LinkedHashMap) navDestination.c).put(name, argument);
        }
        g0Var.getClass();
        com.gamericefishpro.space.ph.f0.d.getClass();
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        a0Var.h.add(navDestination.a());
    }

    public static com.gamericefishpro.space.s4.r p(Context context) {
        ProviderInfo providerInfo;
        com.gamericefishpro.space.z3.c cVar;
        ApplicationInfo applicationInfo;
        com.gamericefishpro.space.n9.y bVar = Build.VERSION.SDK_INT >= 28 ? new com.gamericefishpro.space.s4.b(25) : new com.gamericefishpro.space.n9.y(25);
        PackageManager packageManager = context.getPackageManager();
        a4.p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrB = bVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new com.gamericefishpro.space.z3.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                cVar = null;
            }
        }
        if (cVar == null) {
            return null;
        }
        return new com.gamericefishpro.space.s4.r(new com.gamericefishpro.space.s4.q(context, cVar));
    }

    public static a4 q(int i) {
        if (i != 0) {
            return i != 1 ? new com.gamericefishpro.space.ka.l() : new com.gamericefishpro.space.ka.e();
        }
        return new com.gamericefishpro.space.ka.l();
    }

    public static final void r(com.gamericefishpro.space.c6.a aVar, String sql) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(sql, "sql");
        c cVarO = aVar.O(sql);
        try {
            cVarO.H();
            y3.r(cVarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }

    public static final boolean s(u uVar, com.gamericefishpro.space.f3.f fVar) {
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                u uVarZ = a4.z(uVar);
                if (uVarZ != null) {
                    return s(uVarZ, fVar) || t(uVar, uVarZ, 1, fVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return uVar.C0().a ? ((Boolean) fVar.invoke(uVar)).booleanValue() : F(uVar, fVar);
                }
                throw new com.gamericefishpro.space.oh.k();
            }
        }
        return F(uVar, fVar);
    }

    public static final boolean t(u uVar, u uVar2, int i, com.gamericefishpro.space.f3.f fVar) {
        if (I(uVar, uVar2, i, fVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.gamericefishpro.space.hj.c.S(uVar, i, new com.gamericefishpro.space.m1.w(((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) k.t(uVar)).getFocusOwner()).f(), uVar, uVar2, i, fVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final f u() {
        f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.EmojiEvents", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        com.gamericefishpro.space.o1.m0 m0Var = new com.gamericefishpro.space.o1.m0(com.gamericefishpro.space.o1.s.b);
        com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
        uVar.B(19.0f, 5.0f);
        uVar.y(-2.0f);
        uVar.F(3.0f);
        uVar.x(7.0f);
        uVar.G(2.0f);
        uVar.x(5.0f);
        uVar.t(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        uVar.G(1.0f);
        uVar.u(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        uVar.u(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        uVar.F(19.0f);
        uVar.x(7.0f);
        uVar.G(2.0f);
        uVar.y(10.0f);
        uVar.G(-2.0f);
        uVar.y(-4.0f);
        uVar.G(-3.1f);
        uVar.u(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        uVar.t(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        uVar.F(7.0f);
        uVar.t(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        uVar.s();
        uVar.B(5.0f, 8.0f);
        uVar.F(7.0f);
        uVar.y(2.0f);
        uVar.G(3.82f);
        uVar.t(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        uVar.s();
        uVar.B(19.0f, 8.0f);
        uVar.u(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        uVar.F(7.0f);
        uVar.y(2.0f);
        uVar.F(8.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static Intent v(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strW = w(context, componentName);
        if (strW == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strW);
        return w(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String w(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static com.gamericefishpro.space.b4.c x(com.gamericefishpro.space.n.i0 i0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new com.gamericefishpro.space.b4.c(com.gamericefishpro.space.d4.h.l(i0Var));
        }
        TextPaint textPaint = new TextPaint(i0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = i0Var.getBreakStrategy();
        int hyphenationFrequency = i0Var.getHyphenationFrequency();
        if (i0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (i0Var.getInputType() & 15) != 3) {
            boolean z = i0Var.getLayoutDirection() == 1;
            switch (i0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(com.gamericefishpro.space.d4.h.e(DecimalFormatSymbols.getInstance(i0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new com.gamericefishpro.space.b4.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final int y(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final com.gamericefishpro.space.l6.a z(int i) {
        if (i == 0) {
            return com.gamericefishpro.space.l6.a.d;
        }
        if (i == 1) {
            return com.gamericefishpro.space.l6.a.e;
        }
        throw new IllegalArgumentException(y0.f(i, "Could not convert ", " to BackoffPolicy"));
    }

    public final Object D(int i, Intent intent) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    for (int i2 : intArrayExtra) {
                        if (i2 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new com.gamericefishpro.space.h.b(i, intent);
        }
    }
}
