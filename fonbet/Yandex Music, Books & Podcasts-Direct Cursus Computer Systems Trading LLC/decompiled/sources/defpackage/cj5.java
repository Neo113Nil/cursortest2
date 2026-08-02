package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes3.dex */
public final class cj5 {
    public final zv8 a;
    public final qi5 b;
    public final mm6 c;
    public final qqi d;
    public final LinkedHashMap e;
    public final LinkedHashSet f;

    public cj5(zv8 zv8Var, qi5 qi5Var) {
        tf6 e = gld.e(e.c(a4g.n(), dm6.b));
        this.a = zv8Var;
        this.b = qi5Var;
        this.c = e;
        this.d = rqi.a();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(1:(1:(1:(1:(6:12|13|14|15|16|17)(2:23|24))(5:25|26|27|28|29))(13:34|35|36|37|38|39|(1:41)|43|44|(6:48|49|50|51|52|53)(1:46)|47|16|17))(4:88|89|90|91))(10:106|107|108|109|110|111|112|113|114|(1:117)(1:116))|92|93|(1:96)(10:95|38|39|(0)|43|44|(0)(0)|47|16|17)))|129|6|(0)(0)|92|93|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x012b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #17 {all -> 0x00db, blocks: (B:39:0x00ce, B:41:0x00d5), top: B:38:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cj5 cj5Var, String str, String str2, rv8 rv8Var, gm5 gm5Var, cg6 cg6Var) {
        bj5 bj5Var;
        Object obj;
        nm6 nm6Var;
        int i;
        String str3;
        gm5 gm5Var2;
        String str4;
        zv8 zv8Var;
        xyo xyoVar;
        String str5;
        qqi qqiVar;
        String str6;
        String str7;
        gm5 gm5Var3;
        String str8;
        gm5 gm5Var4;
        String str9;
        String str10;
        String str11 = str2;
        qi5 qi5Var = cj5Var.b;
        LinkedHashMap linkedHashMap = cj5Var.e;
        qqi qqiVar2 = cj5Var.d;
        if (cg6Var instanceof bj5) {
            bj5Var = (bj5) cg6Var;
            int i2 = bj5Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bj5Var.q = i2 - Integer.MIN_VALUE;
                obj = bj5Var.o;
                nm6Var = nm6.a;
                i = bj5Var.q;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        try {
                            zv8Var = cj5Var.a;
                            str3 = str;
                        } catch (CancellationException e) {
                            e = e;
                            gm5Var2 = gm5Var;
                            bj5Var.j = null;
                            bj5Var.k = str11;
                            bj5Var.l = gm5Var2;
                            bj5Var.m = e;
                            bj5Var.n = qqiVar2;
                            bj5Var.q = 3;
                            if (qqiVar2.a(bj5Var) == nm6Var) {
                                return nm6Var;
                            }
                            str8 = str11;
                            gm5Var4 = gm5Var2;
                            qqiVar2.b(null);
                            gm5Var4.U(new vyo(null, e));
                            throw e;
                        }
                        try {
                            bj5Var.j = str3;
                            bj5Var.k = str11;
                            gm5Var2 = gm5Var;
                            try {
                                try {
                                    bj5Var.l = gm5Var2;
                                    bj5Var.q = 1;
                                    obj = zv8Var.a(str11, rv8Var, bj5Var);
                                    if (obj == nm6Var) {
                                        return nm6Var;
                                    }
                                    str4 = str3;
                                } catch (Exception e2) {
                                    e = e2;
                                    obj = qi5Var;
                                    str4 = str3;
                                    bj5Var.j = str4;
                                    bj5Var.k = str11;
                                    bj5Var.l = gm5Var2;
                                    bj5Var.m = e;
                                    bj5Var.n = qqiVar2;
                                    bj5Var.q = 4;
                                    if (qqiVar2.a(bj5Var) == nm6Var) {
                                        return nm6Var;
                                    }
                                    str6 = str11;
                                    str7 = str4;
                                    gm5Var3 = gm5Var2;
                                    qqiVar2.b(null);
                                    obj.getClass();
                                    str7.getClass();
                                    str6.getClass();
                                    qi5.c(obj, "div_preload", "div_preload_failed", str7, str6, 8);
                                    gm5Var3.U(new vyo(null, e));
                                    return Unit.a;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                bj5Var.j = null;
                                bj5Var.k = str11;
                                bj5Var.l = gm5Var2;
                                bj5Var.m = e;
                                bj5Var.n = qqiVar2;
                                bj5Var.q = 3;
                                if (qqiVar2.a(bj5Var) == nm6Var) {
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            gm5Var2 = gm5Var;
                            obj = qi5Var;
                            str4 = str3;
                            bj5Var.j = str4;
                            bj5Var.k = str11;
                            bj5Var.l = gm5Var2;
                            bj5Var.m = e;
                            bj5Var.n = qqiVar2;
                            bj5Var.q = 4;
                            if (qqiVar2.a(bj5Var) == nm6Var) {
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str3 = str;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qqiVar2 = bj5Var.n;
                                e = (CancellationException) bj5Var.m;
                                gm5Var4 = bj5Var.l;
                                str8 = bj5Var.k;
                                qgg.h0(obj);
                                try {
                                    qqiVar2.b(null);
                                    gm5Var4.U(new vyo(null, e));
                                    throw e;
                                } finally {
                                }
                            }
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qqiVar2 = bj5Var.n;
                            e = (Exception) bj5Var.m;
                            gm5Var3 = bj5Var.l;
                            str6 = bj5Var.k;
                            str7 = bj5Var.j;
                            qgg.h0(obj);
                            obj = qi5Var;
                            try {
                                qqiVar2.b(null);
                                obj.getClass();
                                str7.getClass();
                                str6.getClass();
                                qi5.c(obj, "div_preload", "div_preload_failed", str7, str6, 8);
                                gm5Var3.U(new vyo(null, e));
                                return Unit.a;
                            } finally {
                            }
                        }
                        qqiVar = bj5Var.n;
                        xyoVar = (xyo) bj5Var.m;
                        gm5 gm5Var5 = bj5Var.l;
                        str5 = bj5Var.k;
                        String str12 = bj5Var.j;
                        try {
                            qgg.h0(obj);
                            gm5Var2 = gm5Var5;
                            str4 = str12;
                            try {
                                try {
                                    try {
                                        linkedHashMap.remove(str5);
                                        if (xyoVar instanceof wyo) {
                                            cj5Var.f.add(str5);
                                        }
                                        try {
                                            qqiVar2.b(null);
                                            if (!(xyoVar instanceof vyo)) {
                                                try {
                                                    qi5Var.getClass();
                                                    str4.getClass();
                                                    str5.getClass();
                                                    str9 = str4;
                                                    str10 = str5;
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    obj = qi5Var;
                                                    str11 = str5;
                                                    bj5Var.j = str4;
                                                    bj5Var.k = str11;
                                                    bj5Var.l = gm5Var2;
                                                    bj5Var.m = e;
                                                    bj5Var.n = qqiVar2;
                                                    bj5Var.q = 4;
                                                    if (qqiVar2.a(bj5Var) == nm6Var) {
                                                    }
                                                }
                                                try {
                                                    qi5.c(qi5Var, "div_preload", "div_preload_failed", str9, str10, 8);
                                                } catch (CancellationException e7) {
                                                    e = e7;
                                                    str5 = str10;
                                                    str11 = str5;
                                                    bj5Var.j = null;
                                                    bj5Var.k = str11;
                                                    bj5Var.l = gm5Var2;
                                                    bj5Var.m = e;
                                                    bj5Var.n = qqiVar2;
                                                    bj5Var.q = 3;
                                                    if (qqiVar2.a(bj5Var) == nm6Var) {
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    obj = qi5Var;
                                                    str4 = str9;
                                                    str5 = str10;
                                                    str11 = str5;
                                                    bj5Var.j = str4;
                                                    bj5Var.k = str11;
                                                    bj5Var.l = gm5Var2;
                                                    bj5Var.m = e;
                                                    bj5Var.n = qqiVar2;
                                                    bj5Var.q = 4;
                                                    if (qqiVar2.a(bj5Var) == nm6Var) {
                                                    }
                                                }
                                            }
                                            gm5Var2.U(xyoVar);
                                        } catch (Exception e9) {
                                            e = e9;
                                        }
                                    } catch (CancellationException e10) {
                                        e = e10;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            } finally {
                            }
                        } catch (CancellationException e12) {
                            e = e12;
                            gm5Var2 = gm5Var5;
                            str11 = str5;
                            bj5Var.j = null;
                            bj5Var.k = str11;
                            bj5Var.l = gm5Var2;
                            bj5Var.m = e;
                            bj5Var.n = qqiVar2;
                            bj5Var.q = 3;
                            if (qqiVar2.a(bj5Var) == nm6Var) {
                            }
                        } catch (Exception e13) {
                            e = e13;
                            gm5Var2 = gm5Var5;
                            str4 = str12;
                            obj = qi5Var;
                            str11 = str5;
                            bj5Var.j = str4;
                            bj5Var.k = str11;
                            bj5Var.l = gm5Var2;
                            bj5Var.m = e;
                            bj5Var.n = qqiVar2;
                            bj5Var.q = 4;
                            if (qqiVar2.a(bj5Var) == nm6Var) {
                            }
                        }
                        return Unit.a;
                    }
                    gm5 gm5Var6 = bj5Var.l;
                    String str13 = bj5Var.k;
                    str4 = bj5Var.j;
                    try {
                        qgg.h0(obj);
                        gm5Var2 = gm5Var6;
                        str11 = str13;
                    } catch (CancellationException e14) {
                        e = e14;
                        gm5Var2 = gm5Var6;
                        str11 = str13;
                        bj5Var.j = null;
                        bj5Var.k = str11;
                        bj5Var.l = gm5Var2;
                        bj5Var.m = e;
                        bj5Var.n = qqiVar2;
                        bj5Var.q = 3;
                        if (qqiVar2.a(bj5Var) == nm6Var) {
                        }
                    } catch (Exception e15) {
                        e = e15;
                        gm5Var2 = gm5Var6;
                        obj = qi5Var;
                        str11 = str13;
                        bj5Var.j = str4;
                        bj5Var.k = str11;
                        bj5Var.l = gm5Var2;
                        bj5Var.m = e;
                        bj5Var.n = qqiVar2;
                        bj5Var.q = 4;
                        if (qqiVar2.a(bj5Var) == nm6Var) {
                        }
                    }
                }
                xyoVar = (xyo) obj;
                bj5Var.j = str4;
                bj5Var.k = str11;
                bj5Var.l = gm5Var2;
                bj5Var.m = xyoVar;
                bj5Var.n = qqiVar2;
                bj5Var.q = 2;
                obj = qqiVar2.a(bj5Var);
                if (obj != nm6Var) {
                    return nm6Var;
                }
                str5 = str11;
                qqiVar = qqiVar2;
                linkedHashMap.remove(str5);
                if (xyoVar instanceof wyo) {
                }
                qqiVar2.b(null);
                if (!(xyoVar instanceof vyo)) {
                }
                gm5Var2.U(xyoVar);
                return Unit.a;
            }
        }
        bj5Var = new bj5(cj5Var, cg6Var);
        obj = bj5Var.o;
        nm6Var = nm6.a;
        i = bj5Var.q;
        if (i != 0) {
        }
        xyoVar = (xyo) obj;
        bj5Var.j = str4;
        bj5Var.k = str11;
        bj5Var.l = gm5Var2;
        bj5Var.m = xyoVar;
        bj5Var.n = qqiVar2;
        bj5Var.q = 2;
        obj = qqiVar2.a(bj5Var);
        if (obj != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:19:0x0067, B:21:0x006f, B:24:0x007c, B:31:0x0085), top: B:18:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {all -> 0x007a, blocks: (B:19:0x0067, B:21:0x006f, B:24:0x007c, B:31:0x0085), top: B:18:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, rv8 rv8Var, cg6 cg6Var) {
        zi5 zi5Var;
        int i;
        rv8 rv8Var2;
        String str3;
        String str4;
        qqi qqiVar;
        LinkedHashMap linkedHashMap = this.e;
        try {
            if (cg6Var instanceof zi5) {
                zi5Var = (zi5) cg6Var;
                int i2 = zi5Var.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zi5Var.p = i2 - Integer.MIN_VALUE;
                    Object obj = zi5Var.n;
                    nm6 nm6Var = nm6.a;
                    i = zi5Var.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        zi5Var.j = str;
                        zi5Var.k = str2;
                        rv8Var2 = rv8Var;
                        zi5Var.l = rv8Var2;
                        qqi qqiVar2 = this.d;
                        zi5Var.m = qqiVar2;
                        zi5Var.p = 1;
                        if (qqiVar2.a(zi5Var) != nm6Var) {
                            str3 = str;
                            str4 = str2;
                            qqiVar = qqiVar2;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return obj;
                    }
                    qqiVar = zi5Var.m;
                    rv8Var2 = zi5Var.l;
                    String str5 = zi5Var.k;
                    String str6 = zi5Var.j;
                    qgg.h0(obj);
                    str4 = str5;
                    str3 = str6;
                    rv8 rv8Var3 = rv8Var2;
                    if (!this.f.contains(str4)) {
                        return new wyo(Unit.a);
                    }
                    gm5 gm5Var = (gm5) linkedHashMap.get(str4);
                    if (gm5Var == null) {
                        gm5 j = hld.j();
                        linkedHashMap.put(str4, j);
                        x97.y(this.c, null, null, new ov(this, str3, str4, rv8Var3, j, (Continuation) null, 10), 3);
                        gm5Var = j;
                    }
                    qqiVar.b(null);
                    zi5Var.j = null;
                    zi5Var.k = null;
                    zi5Var.l = null;
                    zi5Var.m = null;
                    zi5Var.p = 2;
                    Object s = gm5Var.s(zi5Var);
                    return s == nm6Var ? nm6Var : s;
                }
            }
            if (!this.f.contains(str4)) {
            }
        } finally {
            qqiVar.b(null);
        }
        zi5Var = new zi5(this, cg6Var);
        Object obj2 = zi5Var.n;
        nm6 nm6Var2 = nm6.a;
        i = zi5Var.p;
        if (i != 0) {
        }
        rv8 rv8Var32 = rv8Var2;
    }
}
