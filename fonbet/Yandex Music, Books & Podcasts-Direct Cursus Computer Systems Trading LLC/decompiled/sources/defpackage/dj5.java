package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class dj5 {
    public final zv8 a;
    public final ri5 b;
    public final qqi c = rqi.a();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();

    public dj5(zv8 zv8Var, ri5 ri5Var) {
        this.a = zv8Var;
        this.b = ri5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x013e A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #1 {all -> 0x0142, blocks: (B:15:0x0137, B:17:0x013e), top: B:14:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b9 A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #3 {all -> 0x00c7, blocks: (B:62:0x00af, B:86:0x00b9, B:88:0x00c1, B:89:0x00ca), top: B:61:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, rv8 rv8Var, cg6 cg6Var) {
        aj5 aj5Var;
        int i;
        String str3;
        rv8 rv8Var2;
        String str4;
        oqi oqiVar;
        boolean contains;
        vi5 vi5Var;
        yi5 xi5Var;
        yi5 yi5Var;
        String str5;
        CancellationException cancellationException;
        String str6;
        xyo xyoVar;
        String str7;
        try {
            if (cg6Var instanceof aj5) {
                aj5Var = (aj5) cg6Var;
                int i2 = aj5Var.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aj5Var.r = i2 - Integer.MIN_VALUE;
                    Object obj = aj5Var.p;
                    nm6 nm6Var = nm6.a;
                    i = aj5Var.r;
                    LinkedHashSet linkedHashSet = this.e;
                    oqi oqiVar2 = this.c;
                    LinkedHashMap linkedHashMap = this.d;
                    if (i != 0) {
                        qgg.h0(obj);
                        aj5Var.j = str;
                        aj5Var.k = str2;
                        aj5Var.l = rv8Var;
                        aj5Var.m = oqiVar2;
                        aj5Var.r = 1;
                        if (oqiVar2.a(aj5Var) != nm6Var) {
                            str3 = str;
                            rv8Var2 = rv8Var;
                            str4 = str2;
                            oqiVar = oqiVar2;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                oqiVar2 = aj5Var.o;
                                cancellationException = (CancellationException) aj5Var.n;
                                yi5Var = (yi5) aj5Var.m;
                                str6 = aj5Var.k;
                                qgg.h0(obj);
                                try {
                                    oqiVar2.b(null);
                                    ((xi5) yi5Var).a.g(cancellationException);
                                    throw cancellationException;
                                } finally {
                                }
                            }
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar2 = aj5Var.o;
                            xyoVar = (xyo) aj5Var.n;
                            yi5Var = (yi5) aj5Var.m;
                            str5 = aj5Var.k;
                            String str8 = aj5Var.j;
                            qgg.h0(obj);
                            str7 = str8;
                            try {
                                linkedHashMap.remove(str5);
                                if (xyoVar instanceof wyo) {
                                    linkedHashSet.add(str5);
                                }
                                oqiVar2.b(null);
                                if (xyoVar instanceof vyo) {
                                    str7.getClass();
                                    str5.getClass();
                                    ri5.c(this.b, "div_preload", "div_preload_failed", str7, str5, 8);
                                }
                                ((xi5) yi5Var).a.U(xyoVar);
                                return xyoVar;
                            } finally {
                            }
                        }
                        yi5Var = (yi5) aj5Var.m;
                        String str9 = aj5Var.k;
                        String str10 = aj5Var.j;
                        try {
                            qgg.h0(obj);
                            str5 = str9;
                            str3 = str10;
                            try {
                                xyo xyoVar2 = (xyo) obj;
                                aj5Var.j = str3;
                                aj5Var.k = str5;
                                aj5Var.l = null;
                                aj5Var.m = yi5Var;
                                aj5Var.n = xyoVar2;
                                aj5Var.o = oqiVar2;
                                aj5Var.r = 5;
                                if (oqiVar2.a(aj5Var) != nm6Var) {
                                    xyoVar = xyoVar2;
                                    str7 = str3;
                                    linkedHashMap.remove(str5);
                                    if (xyoVar instanceof wyo) {
                                    }
                                    oqiVar2.b(null);
                                    if (xyoVar instanceof vyo) {
                                    }
                                    ((xi5) yi5Var).a.U(xyoVar);
                                    return xyoVar;
                                }
                            } catch (CancellationException e) {
                                e = e;
                                str4 = str5;
                                aj5Var.j = null;
                                aj5Var.k = str4;
                                aj5Var.l = null;
                                aj5Var.m = yi5Var;
                                aj5Var.n = e;
                                aj5Var.o = oqiVar2;
                                aj5Var.r = 4;
                                if (oqiVar2.a(aj5Var) != nm6Var) {
                                }
                                return nm6Var;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            str4 = str9;
                            aj5Var.j = null;
                            aj5Var.k = str4;
                            aj5Var.l = null;
                            aj5Var.m = yi5Var;
                            aj5Var.n = e;
                            aj5Var.o = oqiVar2;
                            aj5Var.r = 4;
                            if (oqiVar2.a(aj5Var) != nm6Var) {
                            }
                            return nm6Var;
                        }
                        return nm6Var;
                    }
                    oqiVar = (oqi) aj5Var.m;
                    rv8Var2 = aj5Var.l;
                    str4 = aj5Var.k;
                    str3 = aj5Var.j;
                    qgg.h0(obj);
                    contains = linkedHashSet.contains(str4);
                    vi5Var = vi5.a;
                    if (contains) {
                        gm5 gm5Var = (gm5) linkedHashMap.get(str4);
                        if (gm5Var != null) {
                            xi5Var = new wi5(gm5Var);
                        } else {
                            gm5 j = hld.j();
                            linkedHashMap.put(str4, j);
                            xi5Var = new xi5(j);
                        }
                    } else {
                        xi5Var = vi5Var;
                    }
                    oqiVar2.b(null);
                    if (!xi5Var.equals(vi5Var)) {
                        return new wyo(Unit.a);
                    }
                    if (xi5Var instanceof wi5) {
                        gm5 gm5Var2 = ((wi5) xi5Var).a;
                        aj5Var.j = null;
                        aj5Var.k = null;
                        aj5Var.l = null;
                        aj5Var.m = null;
                        aj5Var.r = 2;
                        Object s = gm5Var2.s(aj5Var);
                        if (s != nm6Var) {
                            return s;
                        }
                    } else {
                        if (!(xi5Var instanceof xi5)) {
                            b6e.s();
                            return null;
                        }
                        try {
                            zv8 zv8Var = this.a;
                            aj5Var.j = str3;
                            aj5Var.k = str4;
                            aj5Var.l = null;
                            aj5Var.m = xi5Var;
                            aj5Var.r = 3;
                            obj = zv8Var.a(str4, rv8Var2, aj5Var);
                            if (obj != nm6Var) {
                                yi5Var = xi5Var;
                                str5 = str4;
                                xyo xyoVar22 = (xyo) obj;
                                aj5Var.j = str3;
                                aj5Var.k = str5;
                                aj5Var.l = null;
                                aj5Var.m = yi5Var;
                                aj5Var.n = xyoVar22;
                                aj5Var.o = oqiVar2;
                                aj5Var.r = 5;
                                if (oqiVar2.a(aj5Var) != nm6Var) {
                                }
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            yi5Var = xi5Var;
                            aj5Var.j = null;
                            aj5Var.k = str4;
                            aj5Var.l = null;
                            aj5Var.m = yi5Var;
                            aj5Var.n = e;
                            aj5Var.o = oqiVar2;
                            aj5Var.r = 4;
                            if (oqiVar2.a(aj5Var) != nm6Var) {
                                cancellationException = e;
                                str6 = str4;
                                oqiVar2.b(null);
                                ((xi5) yi5Var).a.g(cancellationException);
                                throw cancellationException;
                            }
                            return nm6Var;
                        }
                    }
                    return nm6Var;
                }
            }
            contains = linkedHashSet.contains(str4);
            vi5Var = vi5.a;
            if (contains) {
            }
            oqiVar2.b(null);
            if (!xi5Var.equals(vi5Var)) {
            }
        } catch (Throwable th) {
            throw th;
        }
        aj5Var = new aj5(this, cg6Var);
        Object obj2 = aj5Var.p;
        nm6 nm6Var2 = nm6.a;
        i = aj5Var.r;
        LinkedHashSet linkedHashSet2 = this.e;
        oqi oqiVar22 = this.c;
        LinkedHashMap linkedHashMap2 = this.d;
        if (i != 0) {
        }
    }
}
