package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public s(int i) {
        this.b = i;
    }

    public static m c(com.gamericefishpro.space.u6.n nVar, List list) {
        w wVar = w.ADD;
        a4.L("FN", list, 2);
        n nVarC = ((t) nVar.e).c(nVar, (n) list.get(0));
        n nVarC2 = ((t) nVar.e).c(nVar, (n) list.get(1));
        if (!(nVarC2 instanceof d)) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("FN requires an ArrayValue of parameter names found ", nVarC2.getClass().getCanonicalName()));
        }
        List listP = ((d) nVarC2).p();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(nVarC.m(), (ArrayList) listP, arrayList, nVar);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.m());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.m());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).d.compareTo(((q) nVar2).d) < 0;
        }
        double dDoubleValue = nVar.c().doubleValue();
        double dDoubleValue2 = nVar2.c().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            if (nVar instanceof g) {
                return (Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue()) || nVar.c().doubleValue() != nVar2.c().doubleValue()) ? false : true;
            }
            if (nVar instanceof q) {
                return nVar.m().equals(nVar2.m());
            }
            if (nVar instanceof e) {
                return nVar.b().equals(nVar2.b());
            }
            return nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z = nVar instanceof g;
        if (z && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.c()));
        }
        boolean z2 = nVar instanceof q;
        if (z2 && (nVar2 instanceof g)) {
            return f(new g(nVar.c()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.c()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.c()));
        }
        if ((z2 || z) && (nVar2 instanceof j)) {
            return f(nVar, new q(nVar2.m()));
        }
        if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
            return f(new q(nVar.m()), nVar2);
        }
        return false;
    }

    public static n g(v vVar, Iterator it, n nVar) {
        com.gamericefishpro.space.u6.n nVarE;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.a) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        nVarE = vVar.b.e();
                        String str = vVar.c;
                        nVarE.i(str, nVar2);
                        ((HashMap) nVarE.v).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        nVarE = vVar.b.e();
                        nVarE.i(vVar.c, nVar2);
                        break;
                    default:
                        nVarE = vVar.b;
                        nVarE.i(vVar.c, nVar2);
                        break;
                }
                n nVarD = nVarE.d((d) nVar);
                if (nVarD instanceof f) {
                    f fVar = (f) nVarD;
                    String str2 = fVar.e;
                    if ("break".equals(str2)) {
                        return n.j;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.j;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.m());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.m());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Code duplicated, block: B:304:0x092a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0935  */
    /* JADX WARN: Code duplicated, block: B:309:0x0942  */
    /* JADX WARN: Code duplicated, block: B:499:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x091a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:? A[SYNTHETIC] */
    public final n a(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        n nVarD;
        f fVar;
        String str2;
        n qVar;
        n nVarC;
        n nVarC2;
        String str3;
        int i = 0;
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w wVar = w.ADD;
                switch (a4.O(str).ordinal()) {
                    case 4:
                        a4.K("BITWISE_AND", arrayList, 2);
                        return new g(Double.valueOf(a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) & a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())));
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        a4.K("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf(a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) << ((int) (((long) a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())) & 31))));
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        a4.K("BITWISE_NOT", arrayList, 1);
                        return new g(Double.valueOf(~a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue())));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        a4.K("BITWISE_OR", arrayList, 2);
                        return new g(Double.valueOf(a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) | a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())));
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        a4.K("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf(a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) >> ((int) (((long) a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())) & 31))));
                    case 9:
                        a4.K("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf((((long) a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue())) & 4294967295L) >>> ((int) (((long) a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())) & 31))));
                    case 10:
                        a4.K("BITWISE_XOR", arrayList, 2);
                        return new g(Double.valueOf(a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) ^ a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                a4.K(a4.O(str).name(), arrayList, 2);
                n nVarC3 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                n nVarC4 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                int iOrdinal = a4.O(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(nVarC3, nVarC4);
                    } else if (iOrdinal == 42) {
                        zF = d(nVarC3, nVarC4);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(nVarC4, nVarC3);
                                break;
                            case 38:
                                zF = h(nVarC4, nVarC3);
                                break;
                            case 39:
                                zF = a4.P(nVarC3, nVarC4);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                zF2 = a4.P(nVarC3, nVarC4);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(nVarC3, nVarC4);
                    }
                    zF = !zF2;
                } else {
                    zF = f(nVarC3, nVarC4);
                }
                return zF ? n.o : n.p;
            case 2:
                w wVar2 = w.ADD;
                int iOrdinal2 = a4.O(str).ordinal();
                if (iOrdinal2 == 2) {
                    a4.K("APPLY", arrayList, 3);
                    n nVar2 = (n) arrayList.get(0);
                    t tVar = (t) nVar.e;
                    t tVar2 = (t) nVar.e;
                    n nVarC5 = tVar.c(nVar, nVar2);
                    String strM = tVar2.c(nVar, (n) arrayList.get(1)).m();
                    n nVarC6 = tVar2.c(nVar, (n) arrayList.get(2));
                    if (!(nVarC6 instanceof d)) {
                        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Function arguments for Apply are not a list found ", nVarC6.getClass().getCanonicalName()));
                    }
                    if (strM.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return nVarC5.l(strM, nVar, (ArrayList) ((d) nVarC6).p());
                }
                if (iOrdinal2 == 15) {
                    a4.K("BREAK", arrayList, 0);
                    return n.l;
                }
                if (iOrdinal2 == 25) {
                    return c(nVar, arrayList);
                }
                if (iOrdinal2 == 41) {
                    a4.L("IF", arrayList, 2);
                    n nVar3 = (n) arrayList.get(0);
                    t tVar3 = (t) nVar.e;
                    t tVar4 = (t) nVar.e;
                    n nVarC7 = tVar3.c(nVar, nVar3);
                    n nVarC8 = tVar4.c(nVar, (n) arrayList.get(1));
                    n nVarC9 = arrayList.size() > 2 ? tVar4.c(nVar, (n) arrayList.get(2)) : null;
                    n nVar4 = n.j;
                    n nVarD2 = nVarC7.b().booleanValue() ? nVar.d((d) nVarC8) : nVarC9 != null ? nVar.d((d) nVarC9) : nVar4;
                    return true != (nVarD2 instanceof f) ? nVar4 : nVarD2;
                }
                if (iOrdinal2 == 54) {
                    return new d(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return n.n;
                    }
                    a4.K("RETURN", arrayList, 1);
                    return new f("return", ((t) nVar.e).c(nVar, (n) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        a4.L("DEFINE_FUNCTION", arrayList, 2);
                        m mVarC = c(nVar, arrayList);
                        String str4 = mVarC.d;
                        if (str4 == null) {
                            nVar.h("", mVarC);
                            return mVarC;
                        }
                        nVar.h(str4, mVarC);
                        return mVarC;
                    }
                    if (iOrdinal2 == 60) {
                        a4.K("SWITCH", arrayList, 3);
                        n nVar5 = (n) arrayList.get(0);
                        t tVar5 = (t) nVar.e;
                        t tVar6 = (t) nVar.e;
                        n nVarC10 = tVar5.c(nVar, nVar5);
                        n nVarC11 = tVar6.c(nVar, (n) arrayList.get(1));
                        n nVarC12 = tVar6.c(nVar, (n) arrayList.get(2));
                        if (!(nVarC11 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(nVarC12 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        d dVar = (d) nVarC11;
                        d dVar2 = (d) nVarC12;
                        boolean z = false;
                        for (int i2 = 0; i2 < dVar.r(); i2++) {
                            if (z || nVarC10.equals(tVar6.c(nVar, dVar.s(i2)))) {
                                n nVarC13 = tVar6.c(nVar, dVar2.s(i2));
                                if (nVarC13 instanceof f) {
                                    return ((f) nVarC13).e.equals("break") ? n.j : nVarC13;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (dVar.r() + 1 == dVar2.r()) {
                            n nVarC14 = tVar6.c(nVar, dVar2.s(dVar.r()));
                            if (nVarC14 instanceof f) {
                                String str5 = ((f) nVarC14).e;
                                if (str5.equals("return") || str5.equals("continue")) {
                                    return nVarC14;
                                }
                            }
                        }
                        return n.j;
                    }
                    if (iOrdinal2 == 61) {
                        a4.K("TERNARY", arrayList, 3);
                        n nVar6 = (n) arrayList.get(0);
                        t tVar7 = (t) nVar.e;
                        t tVar8 = (t) nVar.e;
                        return tVar7.c(nVar, nVar6).b().booleanValue() ? tVar8.c(nVar, (n) arrayList.get(1)) : tVar8.c(nVar, (n) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case RequestError.STOP_TRACKING /* 11 */:
                            return nVar.e().d(new d(arrayList));
                        case 12:
                            a4.K("BREAK", arrayList, 0);
                            return n.m;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return n.j;
                }
                n nVarC15 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                return nVarC15 instanceof d ? nVar.d((d) nVarC15) : n.j;
            case 3:
                w wVar3 = w.ADD;
                int iOrdinal3 = a4.O(str).ordinal();
                if (iOrdinal3 == 1) {
                    a4.K("AND", arrayList, 2);
                    n nVarC16 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (nVarC16.b().booleanValue()) {
                        return ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                    }
                    return nVarC16;
                }
                if (iOrdinal3 == 47) {
                    a4.K("NOT", arrayList, 1);
                    return new e(Boolean.valueOf(!((t) nVar.e).c(nVar, (n) arrayList.get(0)).b().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                a4.K("OR", arrayList, 2);
                n nVarC17 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                if (nVarC17.b().booleanValue()) {
                    return nVarC17;
                }
                return ((t) nVar.e).c(nVar, (n) arrayList.get(1));
            case 4:
                w wVar4 = w.ADD;
                int iOrdinal4 = a4.O(str).ordinal();
                if (iOrdinal4 != 65) {
                    switch (iOrdinal4) {
                        case 26:
                            a4.K("FOR_IN", arrayList, 3);
                            if (!(arrayList.get(0) instanceof q)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                            }
                            String strM2 = ((n) arrayList.get(0)).m();
                            n nVarC18 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                            n nVarC19 = ((t) nVar.e).c(nVar, (n) arrayList.get(2));
                            Iterator itH = nVarC18.h();
                            if (itH != null) {
                                while (itH.hasNext()) {
                                    nVar.i(strM2, (n) itH.next());
                                    n nVarD3 = nVar.d((d) nVarC19);
                                    if (nVarD3 instanceof f) {
                                        fVar = (f) nVarD3;
                                        String str6 = fVar.e;
                                        if ("break".equals(str6)) {
                                            return n.j;
                                        }
                                        if ("return".equals(str6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return n.j;
                        case 27:
                            a4.K("FOR_IN_CONST", arrayList, 3);
                            if (arrayList.get(0) instanceof q) {
                                return g(new v(nVar, ((n) arrayList.get(0)).m(), 0), ((t) nVar.e).c(nVar, (n) arrayList.get(1)).h(), ((t) nVar.e).c(nVar, (n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        case 28:
                            a4.K("FOR_IN_LET", arrayList, 3);
                            if (!(arrayList.get(0) instanceof q)) {
                                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                            }
                            String strM3 = ((n) arrayList.get(0)).m();
                            n nVarC20 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                            n nVarC21 = ((t) nVar.e).c(nVar, (n) arrayList.get(2));
                            Iterator itH2 = nVarC20.h();
                            if (itH2 != null) {
                                while (itH2.hasNext()) {
                                    n nVar7 = (n) itH2.next();
                                    com.gamericefishpro.space.u6.n nVarE = nVar.e();
                                    nVarE.i(strM3, nVar7);
                                    n nVarD4 = nVarE.d((d) nVarC21);
                                    if (nVarD4 instanceof f) {
                                        fVar = (f) nVarD4;
                                        String str7 = fVar.e;
                                        if ("break".equals(str7)) {
                                            return n.j;
                                        }
                                        if ("return".equals(str7)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return n.j;
                        case 29:
                            a4.K("FOR_LET", arrayList, 4);
                            n nVar8 = (n) arrayList.get(0);
                            t tVar9 = (t) nVar.e;
                            t tVar10 = (t) nVar.e;
                            n nVarC22 = tVar9.c(nVar, nVar8);
                            if (!(nVarC22 instanceof d)) {
                                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                            }
                            d dVar3 = (d) nVarC22;
                            n nVar9 = (n) arrayList.get(1);
                            n nVar10 = (n) arrayList.get(2);
                            n nVarC23 = tVar10.c(nVar, (n) arrayList.get(3));
                            com.gamericefishpro.space.u6.n nVarE2 = nVar.e();
                            for (int i3 = 0; i3 < dVar3.r(); i3++) {
                                String strM4 = dVar3.s(i3).m();
                                nVarE2.h(strM4, nVar.j(strM4));
                            }
                            while (tVar10.c(nVar, nVar9).b().booleanValue()) {
                                n nVarD5 = nVar.d((d) nVarC23);
                                if (nVarD5 instanceof f) {
                                    f fVar2 = (f) nVarD5;
                                    String str8 = fVar2.e;
                                    if ("break".equals(str8)) {
                                        return n.j;
                                    }
                                    if ("return".equals(str8)) {
                                        return fVar2;
                                    }
                                }
                                com.gamericefishpro.space.u6.n nVarE3 = nVar.e();
                                for (int i4 = 0; i4 < dVar3.r(); i4++) {
                                    String strM5 = dVar3.s(i4).m();
                                    nVarE3.h(strM5, nVarE2.j(strM5));
                                }
                                nVarE3.c(nVar10);
                                nVarE2 = nVarE3;
                            }
                            return n.j;
                        case 30:
                            a4.K("FOR_OF", arrayList, 3);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(nVar, ((n) arrayList.get(0)).m(), 2), ((t) nVar.e).c(nVar, (n) arrayList.get(1)), ((t) nVar.e).c(nVar, (n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        case 31:
                            a4.K("FOR_OF_CONST", arrayList, 3);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(nVar, ((n) arrayList.get(0)).m(), 0), ((t) nVar.e).c(nVar, (n) arrayList.get(1)), ((t) nVar.e).c(nVar, (n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        case 32:
                            a4.K("FOR_OF_LET", arrayList, 3);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(nVar, ((n) arrayList.get(0)).m(), 1), ((t) nVar.e).c(nVar, (n) arrayList.get(1)), ((t) nVar.e).c(nVar, (n) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        default:
                            b(str);
                            throw null;
                    }
                }
                a4.K("WHILE", arrayList, 4);
                n nVar11 = (n) arrayList.get(0);
                n nVar12 = (n) arrayList.get(1);
                n nVar13 = (n) arrayList.get(2);
                n nVar14 = (n) arrayList.get(3);
                t tVar11 = (t) nVar.e;
                t tVar12 = (t) nVar.e;
                n nVarC24 = tVar11.c(nVar, nVar14);
                if (!tVar12.c(nVar, nVar13).b().booleanValue()) {
                    while (tVar12.c(nVar, nVar11).b().booleanValue()) {
                        nVarD = nVar.d((d) nVarC24);
                        if (nVarD instanceof f) {
                            fVar = (f) nVarD;
                            str2 = fVar.e;
                            if ("break".equals(str2)) {
                                return n.j;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        nVar.c(nVar12);
                    }
                    return n.j;
                }
                n nVarD6 = nVar.d((d) nVarC24);
                if (!(nVarD6 instanceof f)) {
                    while (tVar12.c(nVar, nVar11).b().booleanValue()) {
                        nVarD = nVar.d((d) nVarC24);
                        if (nVarD instanceof f) {
                            fVar = (f) nVarD;
                            str2 = fVar.e;
                            if ("break".equals(str2)) {
                                return n.j;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        nVar.c(nVar12);
                    }
                    return n.j;
                }
                fVar = (f) nVarD6;
                String str9 = fVar.e;
                if ("break".equals(str9)) {
                    return n.j;
                }
                if (!"return".equals(str9)) {
                    while (tVar12.c(nVar, nVar11).b().booleanValue()) {
                        nVarD = nVar.d((d) nVarC24);
                        if (nVarD instanceof f) {
                            fVar = (f) nVarD;
                            str2 = fVar.e;
                            if ("break".equals(str2)) {
                                return n.j;
                            }
                            if ("return".equals(str2)) {
                            }
                        }
                        nVar.c(nVar12);
                    }
                    return n.j;
                }
                return fVar;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                w wVar5 = w.ADD;
                int iOrdinal5 = a4.O(str).ordinal();
                if (iOrdinal5 == 0) {
                    a4.K("ADD", arrayList, 2);
                    n nVarC25 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    n nVarC26 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                    qVar = ((nVarC25 instanceof j) || (nVarC25 instanceof q) || (nVarC26 instanceof j) || (nVarC26 instanceof q)) ? new q(String.valueOf(nVarC25.m()).concat(String.valueOf(nVarC26.m()))) : new g(Double.valueOf(nVarC26.c().doubleValue() + nVarC25.c().doubleValue()));
                } else {
                    if (iOrdinal5 == 21) {
                        a4.K("DIVIDE", arrayList, 2);
                        return new g(Double.valueOf(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue() / ((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue()));
                    }
                    if (iOrdinal5 == 59) {
                        a4.K("SUBTRACT", arrayList, 2);
                        return new g(Double.valueOf(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue() + (-((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        a4.K(str, arrayList, 2);
                        n nVarC27 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        nVar.c((n) arrayList.get(1));
                        return nVarC27;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        a4.K(str, arrayList, 1);
                        return ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            a4.K("MODULUS", arrayList, 2);
                            return new g(Double.valueOf(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue() % ((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue()));
                        case 45:
                            a4.K("MULTIPLY", arrayList, 2);
                            qVar = new g(Double.valueOf(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue() * ((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()));
                            break;
                        case 46:
                            a4.K("NEGATE", arrayList, 1);
                            return new g(Double.valueOf(-((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return qVar;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str == null || str.isEmpty() || !nVar.g(str)) {
                    throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Command not found: ", str));
                }
                n nVarJ = nVar.j(str);
                if (nVarJ instanceof h) {
                    return ((h) nVarJ).a(nVar, arrayList);
                }
                throw new IllegalArgumentException(com.gamericefishpro.space.t0.y0.g("Function ", str, " is not defined"));
            default:
                w wVar6 = w.ADD;
                int iOrdinal6 = a4.O(str).ordinal();
                if (iOrdinal6 != 3) {
                    if (iOrdinal6 == 14) {
                        a4.L("CONST", arrayList, 2);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(arrayList.size(), "CONST requires an even number of arguments, found "));
                        }
                        while (i < arrayList.size() - 1) {
                            n nVarC28 = ((t) nVar.e).c(nVar, (n) arrayList.get(i));
                            if (!(nVarC28 instanceof q)) {
                                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Expected string for const name. got ", nVarC28.getClass().getCanonicalName()));
                            }
                            String str10 = ((q) nVarC28).d;
                            nVar.i(str10, ((t) nVar.e).c(nVar, (n) arrayList.get(i + 1)));
                            ((HashMap) nVar.v).put(str10, Boolean.TRUE);
                            i += 2;
                        }
                        return n.j;
                    }
                    if (iOrdinal6 == 24) {
                        a4.L("EXPRESSION_LIST", arrayList, 1);
                        n nVarC29 = n.j;
                        while (i < arrayList.size()) {
                            nVarC29 = ((t) nVar.e).c(nVar, (n) arrayList.get(i));
                            if (nVarC29 instanceof f) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i++;
                        }
                        return nVarC29;
                    }
                    if (iOrdinal6 == 33) {
                        a4.K("GET", arrayList, 1);
                        n nVarC30 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                        if (nVarC30 instanceof q) {
                            return nVar.j(((q) nVarC30).d);
                        }
                        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Expected string for get var. got ", nVarC30.getClass().getCanonicalName()));
                    }
                    if (iOrdinal6 == 49) {
                        a4.K("NULL", arrayList, 0);
                        return n.k;
                    }
                    if (iOrdinal6 == 58) {
                        a4.K("SET_PROPERTY", arrayList, 3);
                        n nVar15 = (n) arrayList.get(0);
                        t tVar13 = (t) nVar.e;
                        t tVar14 = (t) nVar.e;
                        n nVarC31 = tVar13.c(nVar, nVar15);
                        n nVarC32 = tVar14.c(nVar, (n) arrayList.get(1));
                        nVarC2 = tVar14.c(nVar, (n) arrayList.get(2));
                        if (nVarC31 == n.j || nVarC31 == n.k) {
                            throw new IllegalStateException("Can't set property " + nVarC32.m() + " of " + nVarC31.m());
                        }
                        if ((nVarC31 instanceof d) && (nVarC32 instanceof g)) {
                            ((d) nVarC31).t(((g) nVarC32).d.intValue(), nVarC2);
                        } else if (nVarC31 instanceof j) {
                            ((j) nVarC31).n(nVarC32.m(), nVarC2);
                        }
                    } else {
                        if (iOrdinal6 == 17) {
                            if (arrayList.isEmpty()) {
                                return new d();
                            }
                            d dVar4 = new d();
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayList.get(i5);
                                i5++;
                                n nVarC33 = ((t) nVar.e).c(nVar, (n) obj);
                                if (nVarC33 instanceof f) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                dVar4.t(i, nVarC33);
                                i++;
                            }
                            return dVar4;
                        }
                        if (iOrdinal6 == 18) {
                            if (arrayList.isEmpty()) {
                                return new k();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            }
                            k kVar = new k();
                            while (i < arrayList.size() - 1) {
                                n nVarC34 = ((t) nVar.e).c(nVar, (n) arrayList.get(i));
                                n nVarC35 = ((t) nVar.e).c(nVar, (n) arrayList.get(i + 1));
                                if ((nVarC34 instanceof f) || (nVarC35 instanceof f)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                kVar.n(nVarC34.m(), nVarC35);
                                i += 2;
                            }
                            return kVar;
                        }
                        if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                            a4.K("GET_PROPERTY", arrayList, 2);
                            n nVarC36 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                            n nVarC37 = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                            if ((nVarC36 instanceof d) && a4.N(nVarC37)) {
                                return ((d) nVarC36).s(nVarC37.c().intValue());
                            }
                            if (nVarC36 instanceof j) {
                                return ((j) nVarC36).f(nVarC37.m());
                            }
                            if (nVarC36 instanceof q) {
                                if ("length".equals(nVarC37.m())) {
                                    nVarC2 = new g(Double.valueOf(((q) nVarC36).d.length()));
                                } else if (a4.N(nVarC37)) {
                                    double dDoubleValue = nVarC37.c().doubleValue();
                                    String str11 = ((q) nVarC36).d;
                                    if (dDoubleValue < str11.length()) {
                                        nVarC = new q(String.valueOf(str11.charAt(nVarC37.c().intValue())));
                                    }
                                }
                            }
                            return n.j;
                        }
                        switch (iOrdinal6) {
                            case 62:
                                a4.K("TYPEOF", arrayList, 1);
                                n nVarC38 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                                if (nVarC38 instanceof r) {
                                    str3 = "undefined";
                                } else if (nVarC38 instanceof e) {
                                    str3 = "boolean";
                                } else if (nVarC38 instanceof g) {
                                    str3 = "number";
                                } else if (nVarC38 instanceof q) {
                                    str3 = "string";
                                } else if (nVarC38 instanceof m) {
                                    str3 = "function";
                                } else {
                                    if ((nVarC38 instanceof o) || (nVarC38 instanceof f)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", nVarC38));
                                    }
                                    str3 = "object";
                                }
                                nVarC2 = new q(str3);
                                break;
                            case 63:
                                a4.K("UNDEFINED", arrayList, 0);
                                return n.j;
                            case 64:
                                a4.L("VAR", arrayList, 1);
                                int size2 = arrayList.size();
                                while (i < size2) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    n nVarC39 = ((t) nVar.e).c(nVar, (n) obj2);
                                    if (!(nVarC39 instanceof q)) {
                                        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Expected string for var name. got ", nVarC39.getClass().getCanonicalName()));
                                    }
                                    nVar.i(((q) nVarC39).d, n.j);
                                }
                                return n.j;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    return nVarC2;
                }
                a4.K("ASSIGN", arrayList, 2);
                n nVarC40 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                if (!(nVarC40 instanceof q)) {
                    throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Expected string for assign var. got ", nVarC40.getClass().getCanonicalName()));
                }
                String str12 = ((q) nVarC40).d;
                if (!nVar.g(str12)) {
                    throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Attempting to assign undefined value ", str12));
                }
                nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                nVar.h(str12, nVarC);
                return nVarC;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(a4.O(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
