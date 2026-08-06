package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class b80 {
    public static java.lang.String BHfvd2J71qpO(defpackage.r1 r1Var, int i) {
        r1Var.getClass();
        if (i <= 16777215) {
            return java.lang.String.valueOf(i);
        }
        try {
            android.content.Context context = r1Var.ZpBGe2uQfcn8;
            context.getClass();
            java.lang.String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(i);
        }
    }

    public static final long BXaznwstz2U0(long j) {
        return defpackage.nk.ZpBGe2uQfcn8(defpackage.mk.GE9mJIPrb8gP(j), defpackage.mk.P05cfTpS5W5L(j), defpackage.mk.e6mdH7fiFuta(j), defpackage.mk.QiMR8OkAhezm(j));
    }

    public static final boolean GE9mJIPrb8gP(defpackage.s31 s31Var, float f, float f2) {
        float f3 = s31Var.ZpBGe2uQfcn8;
        if (f > s31Var.fWTAfUmVKrZq || f3 > f) {
            return false;
        }
        return f2 <= s31Var.JhCgjQRTAOCT && s31Var.giKS3J6vZuNy <= f2;
    }

    public static final java.lang.String GcLuU6pT9wO9(defpackage.hc1 hc1Var) {
        return defpackage.hf.m6iZQUu7XjoL(defpackage.j80.OVwOqzUGHcCU(0, hc1Var.fWTAfUmVKrZq()), ", ", hc1Var.ZpBGe2uQfcn8() + '(', ")", new defpackage.fNwYGHIYeJcR(20, hc1Var), 24);
    }

    public static final void IBvW5fLsPuHy(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new android.database.SQLException(sb.toString());
    }

    public static final java.lang.String IJ0hOnjhPOri(int i, defpackage.e30 e30Var) {
        e30Var.GE9mJIPrb8gP(defpackage.j0.ZpBGe2uQfcn8);
        return ((android.content.Context) e30Var.GE9mJIPrb8gP(defpackage.j0.giKS3J6vZuNy)).getResources().getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object JhCgjQRTAOCT(defpackage.ri1 ri1Var, defpackage.m9 m9Var) {
        defpackage.ra1 ra1Var;
        int i;
        defpackage.tm tmVar;
        int size;
        int i2;
        if (m9Var instanceof defpackage.ra1) {
            ra1Var = (defpackage.ra1) m9Var;
            int i3 = ra1Var.GE9mJIPrb8gP;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ra1Var.GE9mJIPrb8gP = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = ra1Var.e6mdH7fiFuta;
                i = ra1Var.GE9mJIPrb8gP;
                if (i != 0) {
                    KrtOTfE6jiS2(obj);
                    ra1Var.P05cfTpS5W5L = ri1Var;
                    ra1Var.GE9mJIPrb8gP = 1;
                    obj = ri1Var.ZpBGe2uQfcn8(defpackage.wz0.oh71FJcDz6S2, ra1Var);
                    tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (obj == tmVar) {
                    }
                    defpackage.vz0 vz0Var = (defpackage.vz0) obj;
                    java.util.List list = vz0Var.ZpBGe2uQfcn8;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return vz0Var;
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ri1Var = ra1Var.P05cfTpS5W5L;
                KrtOTfE6jiS2(obj);
                defpackage.vz0 vz0Var2 = (defpackage.vz0) obj;
                java.util.List list2 = vz0Var2.ZpBGe2uQfcn8;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (defpackage.j80.e6mdH7fiFuta((defpackage.c01) list2.get(i2))) {
                        i2++;
                    } else {
                        ra1Var.P05cfTpS5W5L = ri1Var;
                        ra1Var.GE9mJIPrb8gP = 1;
                        obj = ri1Var.ZpBGe2uQfcn8(defpackage.wz0.oh71FJcDz6S2, ra1Var);
                        tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (obj == tmVar) {
                            return tmVar;
                        }
                        defpackage.vz0 vz0Var22 = (defpackage.vz0) obj;
                        java.util.List list22 = vz0Var22.ZpBGe2uQfcn8;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return vz0Var22;
            }
        }
        ra1Var = new defpackage.ra1(m9Var);
        java.lang.Object obj2 = ra1Var.e6mdH7fiFuta;
        i = ra1Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
    }

    public static final void KrtOTfE6jiS2(java.lang.Object obj) {
        if (obj instanceof defpackage.g51) {
            throw ((defpackage.g51) obj).WDYagTQQm9ns;
        }
    }

    public static final defpackage.aj1 Mearx7yMn90V(defpackage.y61 y61Var, java.lang.String str, boolean z) {
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int s0TASMVLSWD5 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "seqno");
            int s0TASMVLSWD52 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "cid");
            int s0TASMVLSWD53 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "name");
            int s0TASMVLSWD54 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "desc");
            if (s0TASMVLSWD5 != -1 && s0TASMVLSWD52 != -1 && s0TASMVLSWD53 != -1 && s0TASMVLSWD54 != -1) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                while (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                    if (((int) UmgHb6n58gfG.getLong(s0TASMVLSWD52)) >= 0) {
                        int i = (int) UmgHb6n58gfG.getLong(s0TASMVLSWD5);
                        java.lang.String oh71FJcDz6S2 = UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD53);
                        java.lang.String str2 = UmgHb6n58gfG.getLong(s0TASMVLSWD54) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(java.lang.Integer.valueOf(i), oh71FJcDz6S2);
                        linkedHashMap2.put(java.lang.Integer.valueOf(i), str2);
                    }
                }
                java.util.List mnkwqFSfsWTC = defpackage.hf.mnkwqFSfsWTC(linkedHashMap.entrySet(), new defpackage.oz(8));
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(mnkwqFSfsWTC, 10));
                java.util.Iterator it = mnkwqFSfsWTC.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                }
                java.util.List a6r05ZxsOP0A = defpackage.hf.a6r05ZxsOP0A(arrayList);
                java.util.List mnkwqFSfsWTC2 = defpackage.hf.mnkwqFSfsWTC(linkedHashMap2.entrySet(), new defpackage.oz(9));
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(mnkwqFSfsWTC2, 10));
                java.util.Iterator it2 = mnkwqFSfsWTC2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
                }
                defpackage.aj1 aj1Var = new defpackage.aj1(str, z, a6r05ZxsOP0A, defpackage.hf.a6r05ZxsOP0A(arrayList2));
                defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                return aj1Var;
            }
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            return null;
        } finally {
        }
    }

    public static long Ns0WNyEWdPsk(int i, long j) {
        return defpackage.nk.ZpBGe2uQfcn8(0, defpackage.mk.P05cfTpS5W5L(j), (i & 4) != 0 ? defpackage.mk.e6mdH7fiFuta(j) : 0, defpackage.mk.QiMR8OkAhezm(j));
    }

    public static final boolean OcTWLQzke1i2(defpackage.jm jmVar) {
        defpackage.cb0 cb0Var = (defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null) {
            return cb0Var.giKS3J6vZuNy();
        }
        return true;
    }

    public static final void P05cfTpS5W5L(defpackage.jm jmVar, java.util.concurrent.CancellationException cancellationException) {
        defpackage.cb0 cb0Var = (defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null) {
            cb0Var.JhCgjQRTAOCT(cancellationException);
        }
    }

    public static final defpackage.kc1 QiMR8OkAhezm(java.lang.String str, defpackage.j80 j80Var, defpackage.hc1[] hc1VarArr, defpackage.y10 y10Var) {
        if (defpackage.tg1.PS16moFv2oLu(str)) {
            defpackage.h7.w7APNrr0aGRc("Blank serial names are prohibited");
            return null;
        }
        if (j80Var.equals(defpackage.ch1.fWTAfUmVKrZq)) {
            defpackage.h7.w7APNrr0aGRc("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        defpackage.oe oeVar = new defpackage.oe(str);
        y10Var.P05cfTpS5W5L(oeVar);
        return new defpackage.kc1(str, j80Var, oeVar.giKS3J6vZuNy.size(), defpackage.y7.a6r05ZxsOP0A(hc1VarArr), oeVar);
    }

    public static final void T1fB7bDYiVJQ(defpackage.y61 y61Var, java.lang.String str) {
        y61Var.getClass();
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG(str);
        try {
            UmgHb6n58gfG.oCu53ZX2v4Ju();
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:36:0x004f, B:37:0x00b5, B:39:0x00bd, B:41:0x00c9, B:43:0x00d5, B:63:0x009b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object UmgHb6n58gfG(defpackage.ri1 ri1Var, defpackage.yd1 yd1Var, defpackage.x1 x1Var, defpackage.vz0 vz0Var, defpackage.m9 m9Var) {
        defpackage.ta1 ta1Var;
        int i;
        defpackage.p81 p81Var;
        boolean z;
        defpackage.v31 v31Var;
        defpackage.hg0 hg0Var;
        boolean z2;
        defpackage.ri1 ri1Var2 = ri1Var;
        defpackage.yd1 yd1Var2 = yd1Var;
        defpackage.p81 p81Var2 = defpackage.pa1.QiMR8OkAhezm;
        try {
            try {
                if (m9Var instanceof defpackage.ta1) {
                    ta1Var = (defpackage.ta1) m9Var;
                    int i2 = ta1Var.fNwYGHIYeJcR;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ta1Var.fNwYGHIYeJcR = i2 - Integer.MIN_VALUE;
                        defpackage.ta1 ta1Var2 = ta1Var;
                        java.lang.Object obj = ta1Var2.Ns0WNyEWdPsk;
                        i = ta1Var2.fNwYGHIYeJcR;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                yd1Var2 = ta1Var2.e6mdH7fiFuta;
                                ri1Var2 = ta1Var2.P05cfTpS5W5L;
                                KrtOTfE6jiS2(obj);
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    java.util.List list = ri1Var2.GE9mJIPrb8gP.IJ0hOnjhPOri.ZpBGe2uQfcn8;
                                    int size = list.size();
                                    while (i3 < size) {
                                        defpackage.c01 c01Var = (defpackage.c01) list.get(i3);
                                        if (defpackage.j80.Ns0WNyEWdPsk(c01Var)) {
                                            c01Var.ZpBGe2uQfcn8();
                                        }
                                        i3++;
                                    }
                                }
                                return defpackage.gs1.ZpBGe2uQfcn8;
                            }
                            if (i != 2) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.v31 v31Var2 = ta1Var2.GE9mJIPrb8gP;
                            yd1Var2 = ta1Var2.e6mdH7fiFuta;
                            defpackage.ri1 ri1Var3 = ta1Var2.P05cfTpS5W5L;
                            KrtOTfE6jiS2(obj);
                            v31Var = v31Var2;
                            ri1Var2 = ri1Var3;
                            if (((java.lang.Boolean) obj).booleanValue() && v31Var.WDYagTQQm9ns) {
                                java.util.List list2 = ri1Var2.GE9mJIPrb8gP.IJ0hOnjhPOri.ZpBGe2uQfcn8;
                                int size2 = list2.size();
                                while (i3 < size2) {
                                    defpackage.c01 c01Var2 = (defpackage.c01) list2.get(i3);
                                    if (defpackage.j80.Ns0WNyEWdPsk(c01Var2)) {
                                        c01Var2.ZpBGe2uQfcn8();
                                    }
                                    i3++;
                                }
                            }
                            yd1Var2.giKS3J6vZuNy();
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                        KrtOTfE6jiS2(obj);
                        defpackage.c01 c01Var3 = (defpackage.c01) vz0Var.ZpBGe2uQfcn8.get(0);
                        int i4 = vz0Var.WDYagTQQm9ns & 1;
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (i4 != 0) {
                            long j = c01Var3.fWTAfUmVKrZq;
                            defpackage.em1 em1Var = (defpackage.em1) yd1Var2.JhCgjQRTAOCT;
                            defpackage.hg0 hg0Var2 = em1Var.JhCgjQRTAOCT;
                            if (hg0Var2 == null || hg0Var2.JhCgjQRTAOCT() == null || !em1Var.Ns0WNyEWdPsk()) {
                                z2 = false;
                            } else {
                                em1Var.BHfvd2J71qpO = -1;
                                defpackage.iz izVar = em1Var.Ns0WNyEWdPsk;
                                if (izVar != null) {
                                    defpackage.iz.ZpBGe2uQfcn8(izVar);
                                }
                                yd1Var2.fWTAfUmVKrZq(em1Var.gUjdnLbkVAaA(), j, false, defpackage.pa1.QiMR8OkAhezm);
                                z2 = true;
                            }
                            if (z2) {
                                c01Var3.ZpBGe2uQfcn8();
                                long j2 = c01Var3.ZpBGe2uQfcn8;
                                defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(29, yd1Var2);
                                ta1Var2.P05cfTpS5W5L = ri1Var2;
                                ta1Var2.e6mdH7fiFuta = yd1Var2;
                                ta1Var2.fNwYGHIYeJcR = 1;
                                obj = defpackage.ns.JhCgjQRTAOCT(ri1Var2, j2, fnwyghiyejcr, ta1Var2);
                                if (obj == tmVar) {
                                    return tmVar;
                                }
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                }
                            }
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                        int i5 = x1Var.ZpBGe2uQfcn8;
                        if (i5 != 1) {
                            p81Var = i5 != 2 ? defpackage.pa1.e6mdH7fiFuta : defpackage.pa1.P05cfTpS5W5L;
                        } else {
                            p81Var = p81Var2;
                        }
                        long j3 = c01Var3.fWTAfUmVKrZq;
                        defpackage.em1 em1Var2 = (defpackage.em1) yd1Var2.JhCgjQRTAOCT;
                        if (!em1Var2.Ns0WNyEWdPsk() || em1Var2.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length() == 0 || (hg0Var = em1Var2.JhCgjQRTAOCT) == null || hg0Var.JhCgjQRTAOCT() == null) {
                            z = false;
                        } else {
                            defpackage.iz izVar2 = em1Var2.Ns0WNyEWdPsk;
                            if (izVar2 != null) {
                                defpackage.iz.ZpBGe2uQfcn8(izVar2);
                            }
                            em1Var2.gUjdnLbkVAaA = j3;
                            em1Var2.BHfvd2J71qpO = -1;
                            em1Var2.P05cfTpS5W5L(true);
                            long fWTAfUmVKrZq = yd1Var2.fWTAfUmVKrZq(em1Var2.gUjdnLbkVAaA(), em1Var2.gUjdnLbkVAaA, true, p81Var);
                            if (i5 >= 2) {
                                yd1Var2.giKS3J6vZuNy = true;
                                yd1Var2.fWTAfUmVKrZq = new defpackage.in1(fWTAfUmVKrZq);
                            }
                            z = true;
                        }
                        if (z) {
                            v31Var = new defpackage.v31();
                            v31Var.WDYagTQQm9ns = !p81Var.equals(p81Var2);
                            long j4 = c01Var3.ZpBGe2uQfcn8;
                            defpackage.eSwlWMUpitz8 eswlwmupitz8 = new defpackage.eSwlWMUpitz8(yd1Var2, p81Var, v31Var, 9);
                            ta1Var2.P05cfTpS5W5L = ri1Var2;
                            ta1Var2.e6mdH7fiFuta = yd1Var2;
                            ta1Var2.GE9mJIPrb8gP = v31Var;
                            ta1Var2.fNwYGHIYeJcR = 2;
                            obj = defpackage.ns.JhCgjQRTAOCT(ri1Var2, j4, eswlwmupitz8, ta1Var2);
                        }
                        return defpackage.gs1.ZpBGe2uQfcn8;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        ta1Var = new defpackage.ta1(m9Var);
        defpackage.ta1 ta1Var22 = ta1Var;
        java.lang.Object obj2 = ta1Var22.Ns0WNyEWdPsk;
        i = ta1Var22.fNwYGHIYeJcR;
        int i32 = 0;
    }

    public static boolean VFeft99leXEK(defpackage.np0 np0Var, defpackage.ne neVar) {
        np0Var.getClass();
        return defpackage.w60.oCu53ZX2v4Ju(defpackage.t80.BXaznwstz2U0(neVar)) == np0Var.oh71FJcDz6S2.ZpBGe2uQfcn8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object WDYagTQQm9ns(defpackage.ri1 ri1Var, defpackage.uk1 uk1Var, defpackage.vz0 vz0Var, int i, defpackage.m9 m9Var) {
        defpackage.va1 va1Var;
        int i2;
        long j;
        defpackage.y31 y31Var;
        defpackage.mr mrVar;
        try {
            if (m9Var instanceof defpackage.va1) {
                va1Var = (defpackage.va1) m9Var;
                int i3 = va1Var.h3m55N1URyyK;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    va1Var.h3m55N1URyyK = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = va1Var.fNwYGHIYeJcR;
                    i2 = va1Var.h3m55N1URyyK;
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    int i4 = 2;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (i2 != 0) {
                        KrtOTfE6jiS2(obj);
                        defpackage.c01 c01Var = (defpackage.c01) defpackage.hf.fhbmYuu9J3cT(vz0Var.ZpBGe2uQfcn8);
                        j = c01Var.ZpBGe2uQfcn8;
                        uk1Var.JhCgjQRTAOCT(c01Var.fWTAfUmVKrZq, i > 2 ? defpackage.pa1.e6mdH7fiFuta : defpackage.pa1.P05cfTpS5W5L);
                        y31Var = new defpackage.y31();
                        y31Var.WDYagTQQm9ns = 9205357640488583168L;
                        long fWTAfUmVKrZq = ri1Var.WDYagTQQm9ns().fWTAfUmVKrZq();
                        defpackage.wa1 wa1Var = new defpackage.wa1(j, y31Var, null);
                        va1Var.P05cfTpS5W5L = ri1Var;
                        va1Var.e6mdH7fiFuta = uk1Var;
                        va1Var.GE9mJIPrb8gP = y31Var;
                        va1Var.Ns0WNyEWdPsk = j;
                        va1Var.h3m55N1URyyK = 1;
                        obj = ri1Var.Ns0WNyEWdPsk(fWTAfUmVKrZq, wa1Var, va1Var);
                        if (obj == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uk1Var = va1Var.e6mdH7fiFuta;
                            ri1Var = va1Var.P05cfTpS5W5L;
                            KrtOTfE6jiS2(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                uk1Var.onCancel();
                                return gs1Var;
                            }
                            java.util.List list = ri1Var.GE9mJIPrb8gP.IJ0hOnjhPOri.ZpBGe2uQfcn8;
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                defpackage.c01 c01Var2 = (defpackage.c01) list.get(i5);
                                if (defpackage.j80.Ns0WNyEWdPsk(c01Var2)) {
                                    c01Var2.ZpBGe2uQfcn8();
                                }
                            }
                            uk1Var.ZpBGe2uQfcn8();
                            return gs1Var;
                        }
                        long j2 = va1Var.Ns0WNyEWdPsk;
                        y31Var = va1Var.GE9mJIPrb8gP;
                        defpackage.uk1 uk1Var2 = va1Var.e6mdH7fiFuta;
                        defpackage.ri1 ri1Var2 = va1Var.P05cfTpS5W5L;
                        try {
                            KrtOTfE6jiS2(obj);
                            j = j2;
                            uk1Var = uk1Var2;
                            ri1Var = ri1Var2;
                        } catch (java.util.concurrent.CancellationException e) {
                            e = e;
                            uk1Var = uk1Var2;
                            uk1Var.onCancel();
                            throw e;
                        }
                    }
                    mrVar = (defpackage.mr) obj;
                    if (mrVar == null) {
                        mrVar = defpackage.mr.QiMR8OkAhezm;
                    }
                    if (mrVar != defpackage.mr.P05cfTpS5W5L) {
                        uk1Var.onCancel();
                        return gs1Var;
                    }
                    if (mrVar == defpackage.mr.WDYagTQQm9ns) {
                        uk1Var.ZpBGe2uQfcn8();
                        return gs1Var;
                    }
                    if (mrVar == defpackage.mr.oh71FJcDz6S2) {
                        uk1Var.WDYagTQQm9ns(y31Var.WDYagTQQm9ns);
                    }
                    defpackage.cj0 cj0Var = new defpackage.cj0(uk1Var, i4);
                    va1Var.P05cfTpS5W5L = ri1Var;
                    va1Var.e6mdH7fiFuta = uk1Var;
                    va1Var.GE9mJIPrb8gP = null;
                    va1Var.h3m55N1URyyK = 2;
                    obj = defpackage.ns.JhCgjQRTAOCT(ri1Var, j, cj0Var, va1Var);
                }
            }
            if (i2 != 0) {
            }
            mrVar = (defpackage.mr) obj;
            if (mrVar == null) {
            }
            if (mrVar != defpackage.mr.P05cfTpS5W5L) {
            }
        } catch (java.util.concurrent.CancellationException e2) {
            e = e2;
        }
        va1Var = new defpackage.va1(m9Var);
        java.lang.Object obj2 = va1Var.fNwYGHIYeJcR;
        i2 = va1Var.h3m55N1URyyK;
        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
        int i42 = 2;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
    }

    public static defpackage.LCK4GGEwbWAr WmetiUbpKU9I(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return new defpackage.LCK4GGEwbWAr(defpackage.zf.giKS3J6vZuNy(view));
        }
        return null;
    }

    public static final long XntWc4eZSQ8j(long j, boolean z, int i, float f) {
        int P05cfTpS5W5L = ((z || i == 2 || i == 4 || i == 5) && defpackage.mk.JhCgjQRTAOCT(j)) ? defpackage.mk.P05cfTpS5W5L(j) : Integer.MAX_VALUE;
        if (defpackage.mk.GE9mJIPrb8gP(j) != P05cfTpS5W5L) {
            P05cfTpS5W5L = defpackage.j80.T1fB7bDYiVJQ(defpackage.v70.fNwYGHIYeJcR(f), defpackage.mk.GE9mJIPrb8gP(j), P05cfTpS5W5L);
        }
        return defpackage.nn.WmetiUbpKU9I(0, P05cfTpS5W5L, 0, defpackage.mk.QiMR8OkAhezm(j));
    }

    public static defpackage.dc1 ZVVdXbWmyCSK(defpackage.np0 np0Var) {
        np0Var.getClass();
        return defpackage.fc1.GcLuU6pT9wO9(np0Var, new defpackage.lp0(0));
    }

    public static final defpackage.z70 ZpBGe2uQfcn8(java.lang.String str, defpackage.rb0 rb0Var) {
        return new defpackage.z70(str, new defpackage.a80(rb0Var));
    }

    public static final long blKFvluuDQOf(long j, float f) {
        return (java.lang.Float.isNaN(f) || f >= 1.0f) ? j : defpackage.pf.giKS3J6vZuNy(j, defpackage.pf.JhCgjQRTAOCT(j) * f);
    }

    public static final defpackage.cr dG7RjM6DqYVL(defpackage.cb0 cb0Var, boolean z, defpackage.fb0 fb0Var) {
        if (cb0Var instanceof defpackage.jb0) {
            return ((defpackage.jb0) cb0Var).CZa7MwI9IzLd(z, fb0Var);
        }
        return cb0Var.blKFvluuDQOf(fb0Var.s0TASMVLSWD5(), z, new defpackage.WDYagTQQm9ns(1, fb0Var, defpackage.fb0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 3));
    }

    public static long e6mdH7fiFuta(long j, defpackage.yd0 yd0Var) {
        defpackage.yd0 yd0Var2 = defpackage.yd0.WDYagTQQm9ns;
        return defpackage.nk.ZpBGe2uQfcn8(yd0Var == yd0Var2 ? defpackage.mk.GE9mJIPrb8gP(j) : defpackage.mk.e6mdH7fiFuta(j), yd0Var == yd0Var2 ? defpackage.mk.P05cfTpS5W5L(j) : defpackage.mk.QiMR8OkAhezm(j), yd0Var == yd0Var2 ? defpackage.mk.e6mdH7fiFuta(j) : defpackage.mk.GE9mJIPrb8gP(j), yd0Var == yd0Var2 ? defpackage.mk.QiMR8OkAhezm(j) : defpackage.mk.P05cfTpS5W5L(j));
    }

    public static final defpackage.g51 fNwYGHIYeJcR(java.lang.Throwable th) {
        th.getClass();
        return new defpackage.g51(th);
    }

    public static final void fWTAfUmVKrZq(defpackage.e30 e30Var, defpackage.vl0 vl0Var) {
        defpackage.d1 d1Var = defpackage.d1.P05cfTpS5W5L;
        int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
        defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, vl0Var);
        defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
        defpackage.wi.fWTAfUmVKrZq.getClass();
        defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
        e30Var.fhbmYuu9J3cT();
        if (e30Var.Fu5WBEia9jBo) {
            e30Var.Ns0WNyEWdPsk(pjVar);
        } else {
            e30Var.lXYSMswtzmix();
        }
        defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, d1Var);
        defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR);
        defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
        defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
        defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
        e30Var.XntWc4eZSQ8j(true);
    }

    public static final java.lang.Object frSwwKIlbUhK(defpackage.r81 r81Var, defpackage.r81 r81Var2, defpackage.c20 c20Var) {
        java.lang.Object ugVar;
        java.lang.Object z16KqenTjq8o;
        try {
            defpackage.nq1.IJ0hOnjhPOri(2, c20Var);
            ugVar = c20Var.QiMR8OkAhezm(r81Var2, r81Var);
        } catch (java.lang.Throwable th) {
            ugVar = new defpackage.ug(th, false);
        }
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (ugVar == tmVar || (z16KqenTjq8o = r81Var.z16KqenTjq8o(ugVar)) == defpackage.jr0.JhCgjQRTAOCT) {
            return tmVar;
        }
        if (z16KqenTjq8o instanceof defpackage.ug) {
            throw ((defpackage.ug) z16KqenTjq8o).ZpBGe2uQfcn8;
        }
        return defpackage.jr0.z16KqenTjq8o(z16KqenTjq8o);
    }

    public static final java.lang.Object gUjdnLbkVAaA(defpackage.p01 p01Var, java.lang.String str, defpackage.ll llVar) {
        java.lang.Object JhCgjQRTAOCT = p01Var.JhCgjQRTAOCT(str, new defpackage.ui1(9), llVar);
        return JhCgjQRTAOCT == defpackage.tm.WDYagTQQm9ns ? JhCgjQRTAOCT : defpackage.gs1.ZpBGe2uQfcn8;
    }

    public static final void giKS3J6vZuNy(long j, defpackage.pn1 pn1Var, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-684938728);
        int i2 = (e30Var.WDYagTQQm9ns(j) ? 4 : 2) | i | (e30Var.oh71FJcDz6S2(pn1Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            defpackage.sj sjVar = defpackage.ym1.ZpBGe2uQfcn8;
            defpackage.vx1.JhCgjQRTAOCT(new defpackage.v21[]{defpackage.sk.ZpBGe2uQfcn8.ZpBGe2uQfcn8(new defpackage.pf(j)), sjVar.ZpBGe2uQfcn8(((defpackage.pn1) e30Var.GE9mJIPrb8gP(sjVar)).JhCgjQRTAOCT(pn1Var))}, c20Var, e30Var, ((i2 >> 3) & 112) | 8);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.u21(j, pn1Var, c20Var, i, 0);
        }
    }

    public static final void h3m55N1URyyK(defpackage.jm jmVar) {
        defpackage.cb0 cb0Var = (defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null && !cb0Var.giKS3J6vZuNy()) {
            throw cb0Var.s0TASMVLSWD5();
        }
    }

    public static final defpackage.y80 hH0RRJrNssvh(defpackage.v80 v80Var) {
        return new defpackage.y80(v80Var.ZpBGe2uQfcn8, v80Var.giKS3J6vZuNy, v80Var.fWTAfUmVKrZq, v80Var.JhCgjQRTAOCT);
    }

    public static final java.util.List jjTN4uUnoyEn(defpackage.a71 a71Var) {
        int s0TASMVLSWD5 = defpackage.j80.s0TASMVLSWD5(a71Var, "id");
        int s0TASMVLSWD52 = defpackage.j80.s0TASMVLSWD5(a71Var, "seq");
        int s0TASMVLSWD53 = defpackage.j80.s0TASMVLSWD5(a71Var, "from");
        int s0TASMVLSWD54 = defpackage.j80.s0TASMVLSWD5(a71Var, "to");
        defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
        while (a71Var.oCu53ZX2v4Ju()) {
            XntWc4eZSQ8j.add(new defpackage.b10((int) a71Var.getLong(s0TASMVLSWD5), (int) a71Var.getLong(s0TASMVLSWD52), a71Var.oh71FJcDz6S2(s0TASMVLSWD53), a71Var.oh71FJcDz6S2(s0TASMVLSWD54)));
        }
        return defpackage.hf.eSwlWMUpitz8(defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j));
    }

    public static final int maCixPsq4ml2(defpackage.zm1 zm1Var, android.text.Layout layout, defpackage.x8 x8Var, int i, android.graphics.RectF rectF, defpackage.la1 la1Var, defpackage.l2 l2Var, boolean z) {
        defpackage.uc0[] uc0VarArr;
        defpackage.uc0[] uc0VarArr2;
        int i2;
        int giKS3J6vZuNy;
        int i3;
        int i4;
        int ZpBGe2uQfcn8;
        java.text.Bidi createLineBidi;
        boolean z2;
        float ZpBGe2uQfcn82;
        float ZpBGe2uQfcn83;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        android.text.Layout layout2 = zm1Var.oh71FJcDz6S2;
        int lineStart2 = layout2.getLineStart(i);
        int oh71FJcDz6S2 = zm1Var.oh71FJcDz6S2(i);
        if (i5 < (oh71FJcDz6S2 - lineStart2) * 2) {
            defpackage.f80.ZpBGe2uQfcn8("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        defpackage.m50 m50Var = new defpackage.m50(zm1Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < oh71FJcDz6S2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(lineStart2, z3, z3, true);
                f = m50Var.ZpBGe2uQfcn8(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = m50Var.ZpBGe2uQfcn8(lineStart2, false, false, false);
                ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    ZpBGe2uQfcn83 = m50Var.ZpBGe2uQfcn8(lineStart2, false, false, true);
                    ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(lineStart2 + 1, true, true, true);
                } else {
                    ZpBGe2uQfcn82 = m50Var.ZpBGe2uQfcn8(lineStart2, false, false, false);
                    ZpBGe2uQfcn83 = m50Var.ZpBGe2uQfcn8(lineStart2 + 1, true, true, false);
                }
                f = ZpBGe2uQfcn83;
            }
            fArr[i6] = ZpBGe2uQfcn82;
            fArr[i6 + 1] = f;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        android.text.Layout layout3 = (android.text.Layout) x8Var.ZpBGe2uQfcn8;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int GE9mJIPrb8gP = x8Var.GE9mJIPrb8gP(lineStart3, false);
        int Ns0WNyEWdPsk = x8Var.Ns0WNyEWdPsk(GE9mJIPrb8gP);
        int i7 = lineStart3 - Ns0WNyEWdPsk;
        int i8 = lineEnd2 - Ns0WNyEWdPsk;
        java.text.Bidi WDYagTQQm9ns = x8Var.WDYagTQQm9ns(GE9mJIPrb8gP);
        if (WDYagTQQm9ns == null || (createLineBidi = WDYagTQQm9ns.createLineBidi(i7, i8)) == null) {
            uc0VarArr = new defpackage.uc0[]{new defpackage.uc0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            uc0VarArr = new defpackage.uc0[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                uc0VarArr[i9] = new defpackage.uc0(createLineBidi.getRunStart(i9) + lineStart3, createLineBidi.getRunLimit(i9) + lineStart3, createLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        defpackage.n90 p90Var = z ? new defpackage.p90(0, uc0VarArr.length - 1, 1) : new defpackage.n90(uc0VarArr.length - 1, 0, -1);
        int i11 = p90Var.WDYagTQQm9ns;
        int i12 = p90Var.oh71FJcDz6S2;
        int i13 = p90Var.QiMR8OkAhezm;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            defpackage.uc0 uc0Var = uc0VarArr[i11];
            boolean z5 = uc0Var.fWTAfUmVKrZq;
            int i14 = uc0Var.ZpBGe2uQfcn8;
            int i15 = uc0Var.giKS3J6vZuNy;
            float f2 = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
            float s0TASMVLSWD5 = z5 ? s0TASMVLSWD5(i14, lineStart, fArr) : s0TASMVLSWD5(i15 - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i16 = i13;
            if (z) {
                if (s0TASMVLSWD5 >= f3) {
                    float f4 = rectF.right;
                    if (f2 <= f4) {
                        if ((z5 || f3 > f2) && (!z5 || f4 < s0TASMVLSWD5)) {
                            int i17 = i15;
                            int i18 = i14;
                            while (true) {
                                i3 = i17;
                                if (i17 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i3 + i18) / 2;
                                float f5 = fArr[(i19 - lineStart) * 2];
                                if ((z5 || f5 <= rectF.left) && (!z5 || f5 >= rectF.right)) {
                                    i17 = i3;
                                    i18 = i19;
                                } else {
                                    i17 = i19;
                                }
                            }
                            i4 = z5 ? i3 : i18;
                        } else {
                            i4 = i14;
                        }
                        int giKS3J6vZuNy2 = la1Var.giKS3J6vZuNy(i4);
                        if (giKS3J6vZuNy2 != -1 && (ZpBGe2uQfcn8 = la1Var.ZpBGe2uQfcn8(giKS3J6vZuNy2)) < i15) {
                            if (ZpBGe2uQfcn8 >= i14) {
                                i14 = ZpBGe2uQfcn8;
                            }
                            if (giKS3J6vZuNy2 > i15) {
                                giKS3J6vZuNy2 = i15;
                            }
                            uc0VarArr2 = uc0VarArr;
                            android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = giKS3J6vZuNy2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
                                rectF2.right = z5 ? s0TASMVLSWD5(i14, lineStart, fArr) : s0TASMVLSWD5(i20 - 1, lineStart, fArr);
                                if (!((java.lang.Boolean) l2Var.QiMR8OkAhezm(rectF2, rectF)).booleanValue()) {
                                    i14 = la1Var.fWTAfUmVKrZq(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = la1Var.giKS3J6vZuNy(i14);
                                    if (i20 > i15) {
                                        i20 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i14 = -1;
                        }
                    }
                }
                uc0VarArr2 = uc0VarArr;
                i14 = -1;
            } else {
                uc0VarArr2 = uc0VarArr;
                if (s0TASMVLSWD5 >= f3) {
                    float f6 = rectF.right;
                    if (f2 <= f6) {
                        if ((z5 || f6 < s0TASMVLSWD5) && (!z5 || f3 > f2)) {
                            int i21 = i15;
                            int i22 = i14;
                            while (i21 - i22 > 1) {
                                int i23 = (i21 + i22) / 2;
                                float f7 = fArr[(i23 - lineStart) * 2];
                                int i24 = i21;
                                if ((z5 || f7 <= rectF.right) && (!z5 || f7 >= rectF.left)) {
                                    i21 = i24;
                                    i22 = i23;
                                } else {
                                    i21 = i23;
                                }
                            }
                            i2 = z5 ? i21 : i22;
                        } else {
                            i2 = i15 - 1;
                        }
                        int ZpBGe2uQfcn84 = la1Var.ZpBGe2uQfcn8(i2 + 1);
                        if (ZpBGe2uQfcn84 != -1 && (giKS3J6vZuNy = la1Var.giKS3J6vZuNy(ZpBGe2uQfcn84)) > i14) {
                            if (ZpBGe2uQfcn84 < i14) {
                                ZpBGe2uQfcn84 = i14;
                            }
                            if (giKS3J6vZuNy <= i15) {
                                i15 = giKS3J6vZuNy;
                            }
                            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = ZpBGe2uQfcn84;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z5 ? s0TASMVLSWD5(i25, lineStart, fArr) : s0TASMVLSWD5(i15 - 1, lineStart, fArr);
                                if (!((java.lang.Boolean) l2Var.QiMR8OkAhezm(rectF3, rectF)).booleanValue()) {
                                    i15 = la1Var.JhCgjQRTAOCT(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i25 = la1Var.ZpBGe2uQfcn8(i15);
                                    if (i25 < i14) {
                                        i25 = i14;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i14 = i15;
            }
            if (i14 >= 0) {
                return i14;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i16;
            i13 = i16;
            uc0VarArr = uc0VarArr2;
        }
    }

    public static final int oCu53ZX2v4Ju(defpackage.hc1 hc1Var, defpackage.hc1[] hc1VarArr) {
        hc1VarArr.getClass();
        int hashCode = (hc1Var.ZpBGe2uQfcn8().hashCode() * 31) + java.util.Arrays.hashCode(hc1VarArr);
        int fWTAfUmVKrZq = hc1Var.fWTAfUmVKrZq();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(fWTAfUmVKrZq > 0)) {
                break;
            }
            int i3 = fWTAfUmVKrZq - 1;
            int i4 = i * 31;
            java.lang.String ZpBGe2uQfcn8 = hc1Var.QiMR8OkAhezm(hc1Var.fWTAfUmVKrZq() - fWTAfUmVKrZq).ZpBGe2uQfcn8();
            if (ZpBGe2uQfcn8 != null) {
                i2 = ZpBGe2uQfcn8.hashCode();
            }
            i = i4 + i2;
            fWTAfUmVKrZq = i3;
        }
        int fWTAfUmVKrZq2 = hc1Var.fWTAfUmVKrZq();
        int i5 = 1;
        while (true) {
            if (!(fWTAfUmVKrZq2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = fWTAfUmVKrZq2 - 1;
            int i7 = i5 * 31;
            defpackage.j80 giKS3J6vZuNy = hc1Var.QiMR8OkAhezm(hc1Var.fWTAfUmVKrZq() - fWTAfUmVKrZq2).giKS3J6vZuNy();
            i5 = i7 + (giKS3J6vZuNy != null ? giKS3J6vZuNy.hashCode() : 0);
            fWTAfUmVKrZq2 = i6;
        }
    }

    public static final defpackage.kc1 oh71FJcDz6S2(java.lang.String str, defpackage.hc1[] hc1VarArr, defpackage.y10 y10Var) {
        if (defpackage.tg1.PS16moFv2oLu(str)) {
            defpackage.h7.w7APNrr0aGRc("Blank serial names are prohibited");
            return null;
        }
        defpackage.oe oeVar = new defpackage.oe(str);
        y10Var.P05cfTpS5W5L(oeVar);
        return new defpackage.kc1(str, defpackage.ch1.fWTAfUmVKrZq, oeVar.giKS3J6vZuNy.size(), defpackage.y7.a6r05ZxsOP0A(hc1VarArr), oeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List qjMheFZ0l9kA(defpackage.je1 je1Var, int i, defpackage.je1 je1Var2, boolean z, boolean z2, boolean z3) {
        defpackage.av avVar;
        boolean z4;
        int i2;
        int i3;
        int w7APNrr0aGRc = je1Var.w7APNrr0aGRc(i);
        int i4 = i + w7APNrr0aGRc;
        int oh71FJcDz6S2 = je1Var.oh71FJcDz6S2(i);
        int oh71FJcDz6S22 = je1Var.oh71FJcDz6S2(i4);
        int i5 = oh71FJcDz6S22 - oh71FJcDz6S2;
        boolean z5 = i >= 0 && (je1Var.giKS3J6vZuNy[(je1Var.s0TASMVLSWD5(i) * 5) + 1] & 201326592) != 0;
        je1Var2.IJ0hOnjhPOri(w7APNrr0aGRc);
        je1Var2.VFeft99leXEK(i5, je1Var2.ZVVdXbWmyCSK);
        if (je1Var.QiMR8OkAhezm < i4) {
            je1Var.blKFvluuDQOf(i4);
        }
        if (je1Var.Ns0WNyEWdPsk < oh71FJcDz6S22) {
            je1Var.UmgHb6n58gfG(oh71FJcDz6S22, i4);
        }
        int[] iArr = je1Var2.giKS3J6vZuNy;
        int i6 = je1Var2.ZVVdXbWmyCSK;
        int i7 = i6 * 5;
        defpackage.y7.cCeDCHgnx5OL(je1Var.giKS3J6vZuNy, iArr, i7, i * 5, i4 * 5);
        java.lang.Object[] objArr = je1Var2.fWTAfUmVKrZq;
        int i8 = je1Var2.e6mdH7fiFuta;
        java.lang.System.arraycopy(je1Var.fWTAfUmVKrZq, oh71FJcDz6S2, objArr, i8, i5);
        int i9 = je1Var2.maCixPsq4ml2;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + w7APNrr0aGRc;
        int QiMR8OkAhezm = i8 - je1Var2.QiMR8OkAhezm(iArr, i6);
        int i12 = je1Var2.h3m55N1URyyK;
        int i13 = je1Var2.fNwYGHIYeJcR;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int QiMR8OkAhezm2 = je1Var2.QiMR8OkAhezm(iArr, i15) + QiMR8OkAhezm;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = je1Var2.Ns0WNyEWdPsk;
            }
            iArr2[(i15 * 5) + 4] = defpackage.je1.e6mdH7fiFuta(QiMR8OkAhezm2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        je1Var2.h3m55N1URyyK = i14;
        int ZpBGe2uQfcn8 = defpackage.ie1.ZpBGe2uQfcn8(je1Var.JhCgjQRTAOCT, i, je1Var.XntWc4eZSQ8j());
        int ZpBGe2uQfcn82 = defpackage.ie1.ZpBGe2uQfcn8(je1Var.JhCgjQRTAOCT, i4, je1Var.XntWc4eZSQ8j());
        if (ZpBGe2uQfcn8 < ZpBGe2uQfcn82) {
            java.util.ArrayList arrayList = je1Var.JhCgjQRTAOCT;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ZpBGe2uQfcn82 - ZpBGe2uQfcn8);
            for (int i17 = ZpBGe2uQfcn8; i17 < ZpBGe2uQfcn82; i17++) {
                defpackage.y20 y20Var = (defpackage.y20) arrayList.get(i17);
                y20Var.ZpBGe2uQfcn8 += i10;
                arrayList2.add(y20Var);
            }
            je1Var2.JhCgjQRTAOCT.addAll(defpackage.ie1.ZpBGe2uQfcn8(je1Var2.JhCgjQRTAOCT, je1Var2.ZVVdXbWmyCSK, je1Var2.XntWc4eZSQ8j()), arrayList2);
            arrayList.subList(ZpBGe2uQfcn8, ZpBGe2uQfcn82).clear();
            avVar = arrayList2;
        } else {
            avVar = defpackage.av.WDYagTQQm9ns;
        }
        if (!avVar.isEmpty()) {
            java.util.HashMap hashMap = je1Var.WDYagTQQm9ns;
            java.util.HashMap hashMap2 = je1Var2.WDYagTQQm9ns;
            if (hashMap != null && hashMap2 != null) {
                int size = avVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = je1Var2.maCixPsq4ml2;
        je1Var2.zJPqDeoF0Os1(i9);
        int jjTN4uUnoyEn = je1Var.jjTN4uUnoyEn(je1Var.giKS3J6vZuNy, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = jjTN4uUnoyEn >= 0;
            if (z7) {
                je1Var.Wc0TdmRSwbbi();
                je1Var.ZpBGe2uQfcn8(jjTN4uUnoyEn - je1Var.ZVVdXbWmyCSK);
                je1Var.Wc0TdmRSwbbi();
            }
            je1Var.ZpBGe2uQfcn8(i - je1Var.ZVVdXbWmyCSK);
            boolean KrtOTfE6jiS2 = je1Var.KrtOTfE6jiS2();
            if (z7) {
                je1Var.xahdJg25P1Bv();
                je1Var.GE9mJIPrb8gP();
                je1Var.xahdJg25P1Bv();
                je1Var.GE9mJIPrb8gP();
            }
            z4 = KrtOTfE6jiS2;
        } else {
            boolean IBvW5fLsPuHy = je1Var.IBvW5fLsPuHy(i, w7APNrr0aGRc);
            je1Var.BXaznwstz2U0(oh71FJcDz6S2, i5, i - 1);
            z4 = IBvW5fLsPuHy;
        }
        if (z4) {
            defpackage.ej.ZpBGe2uQfcn8("Unexpectedly removed anchors");
        }
        int i20 = je1Var2.T1fB7bDYiVJQ;
        int i21 = iArr3[i7 + 1];
        je1Var2.T1fB7bDYiVJQ = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            je1Var2.ZVVdXbWmyCSK = i11;
            je1Var2.e6mdH7fiFuta = i8 + i5;
        }
        if (z6) {
            je1Var2.CZa7MwI9IzLd(i9);
        }
        return avVar;
    }

    public static final float s0TASMVLSWD5(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final defpackage.cb0 w7APNrr0aGRc(defpackage.jm jmVar) {
        defpackage.cb0 cb0Var = (defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null) {
            return cb0Var;
        }
        defpackage.h7.QiMR8OkAhezm(jmVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object xahdJg25P1Bv(defpackage.ri1 ri1Var, defpackage.uk1 uk1Var, defpackage.vz0 vz0Var, defpackage.m9 m9Var) {
        defpackage.ua1 ua1Var;
        int i;
        defpackage.c01 c01Var;
        defpackage.c01 c01Var2;
        try {
            if (m9Var instanceof defpackage.ua1) {
                ua1Var = (defpackage.ua1) m9Var;
                int i2 = ua1Var.fNwYGHIYeJcR;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ua1Var.fNwYGHIYeJcR = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = ua1Var.Ns0WNyEWdPsk;
                    i = ua1Var.fNwYGHIYeJcR;
                    int i3 = 1;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (i != 0) {
                        KrtOTfE6jiS2(obj);
                        c01Var = (defpackage.c01) defpackage.hf.fhbmYuu9J3cT(vz0Var.ZpBGe2uQfcn8);
                        long j = c01Var.ZpBGe2uQfcn8;
                        ua1Var.P05cfTpS5W5L = ri1Var;
                        ua1Var.e6mdH7fiFuta = uk1Var;
                        ua1Var.GE9mJIPrb8gP = c01Var;
                        ua1Var.fNwYGHIYeJcR = 1;
                        obj = defpackage.ns.giKS3J6vZuNy(ri1Var, j, ua1Var);
                        if (obj == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uk1Var = ua1Var.e6mdH7fiFuta;
                            ri1Var = ua1Var.P05cfTpS5W5L;
                            KrtOTfE6jiS2(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.util.List list = ri1Var.GE9mJIPrb8gP.IJ0hOnjhPOri.ZpBGe2uQfcn8;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    defpackage.c01 c01Var3 = (defpackage.c01) list.get(i4);
                                    if (defpackage.j80.Ns0WNyEWdPsk(c01Var3)) {
                                        c01Var3.ZpBGe2uQfcn8();
                                    }
                                }
                                uk1Var.ZpBGe2uQfcn8();
                            } else {
                                uk1Var.onCancel();
                            }
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                        defpackage.c01 c01Var4 = ua1Var.GE9mJIPrb8gP;
                        uk1Var = ua1Var.e6mdH7fiFuta;
                        defpackage.ri1 ri1Var2 = ua1Var.P05cfTpS5W5L;
                        KrtOTfE6jiS2(obj);
                        c01Var = c01Var4;
                        ri1Var = ri1Var2;
                    }
                    c01Var2 = (defpackage.c01) obj;
                    if (c01Var2 != null) {
                        long j2 = c01Var2.fWTAfUmVKrZq;
                        if (defpackage.ws0.fWTAfUmVKrZq(defpackage.ws0.JhCgjQRTAOCT(c01Var.fWTAfUmVKrZq, j2)) < defpackage.ns.oh71FJcDz6S2(ri1Var.WDYagTQQm9ns(), c01Var.e6mdH7fiFuta)) {
                            uk1Var.JhCgjQRTAOCT(j2, defpackage.xa1.ZpBGe2uQfcn8);
                            long j3 = c01Var2.ZpBGe2uQfcn8;
                            defpackage.cj0 cj0Var = new defpackage.cj0(uk1Var, i3);
                            ua1Var.P05cfTpS5W5L = ri1Var;
                            ua1Var.e6mdH7fiFuta = uk1Var;
                            ua1Var.GE9mJIPrb8gP = null;
                            ua1Var.fNwYGHIYeJcR = 2;
                            obj = defpackage.ns.JhCgjQRTAOCT(ri1Var, j3, cj0Var, ua1Var);
                        }
                    }
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            }
            if (i != 0) {
            }
            c01Var2 = (defpackage.c01) obj;
            if (c01Var2 != null) {
            }
            return defpackage.gs1.ZpBGe2uQfcn8;
        } catch (java.util.concurrent.CancellationException e) {
            uk1Var.onCancel();
            throw e;
        }
        ua1Var = new defpackage.ua1(m9Var);
        java.lang.Object obj2 = ua1Var.Ns0WNyEWdPsk;
        i = ua1Var.fNwYGHIYeJcR;
        int i32 = 1;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
    }
}
