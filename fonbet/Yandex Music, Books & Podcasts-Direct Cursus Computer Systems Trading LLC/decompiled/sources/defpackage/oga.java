package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.user.UserDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class oga {
    public final dst a;
    public final i5h b;

    public oga(dst dstVar, i5h i5hVar) {
        this.a = dstVar;
        this.b = i5hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        hga hgaVar;
        int i;
        if (cg6Var instanceof hga) {
            hgaVar = (hga) cg6Var;
            int i2 = hgaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hgaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hgaVar.j;
                nm6 nm6Var = nm6.a;
                i = hgaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    hgaVar.l = 1;
                    obj = this.a.b(str, hgaVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((UserDatabase) obj).y();
            }
        }
        hgaVar = new hga(this, cg6Var);
        Object obj2 = hgaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hgaVar.l;
        if (i != 0) {
        }
        return ((UserDatabase) obj2).y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, cg6 cg6Var) {
        iga igaVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof iga) {
            igaVar = (iga) cg6Var;
            int i2 = igaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                igaVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = igaVar.l;
                obj = nm6.a;
                i = igaVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    igaVar.j = str2;
                    igaVar.k = str3;
                    igaVar.n = 1;
                    obj2 = a(str, igaVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = igaVar.k;
                    str2 = igaVar.j;
                    qgg.h0(obj2);
                }
                igaVar.j = null;
                igaVar.k = null;
                igaVar.n = 2;
                G = up6.G(((yga) obj2).a, false, true, new cb(str2, str3, 4), igaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        igaVar = new iga(this, cg6Var);
        Object obj22 = igaVar.l;
        obj = nm6.a;
        i = igaVar.n;
        if (i != 0) {
        }
        igaVar.j = null;
        igaVar.k = null;
        igaVar.n = 2;
        G = up6.G(((yga) obj22).a, false, true, new cb(str2, str3, 4), igaVar);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        jga jgaVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof jga) {
            jgaVar = (jga) cg6Var;
            int i2 = jgaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jgaVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = jgaVar.j;
                obj = nm6.a;
                i = jgaVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    jgaVar.l = 1;
                    obj2 = a(str, jgaVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                jgaVar.l = 2;
                G = up6.G(((yga) obj2).a, false, true, new c68(29), jgaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        jgaVar = new jga(this, cg6Var);
        Object obj22 = jgaVar.j;
        obj = nm6.a;
        i = jgaVar.l;
        if (i != 0) {
        }
        jgaVar.l = 2;
        G = up6.G(((yga) obj22).a, false, true, new c68(29), jgaVar);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, cg6 cg6Var) {
        kga kgaVar;
        int i;
        if (cg6Var instanceof kga) {
            kgaVar = (kga) cg6Var;
            int i2 = kgaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kgaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kgaVar.j;
                nm6 nm6Var = nm6.a;
                i = kgaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kgaVar.l = 1;
                    obj = a(str, kgaVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<dga> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (dga dgaVar : iterable) {
                            arrayList.add(new fga(new uga(dgaVar.a, dgaVar.b, dgaVar.c), dgaVar.d, dgaVar.e));
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                kgaVar.l = 2;
                obj = up6.G(((yga) obj).a, true, false, new xga(0), kgaVar);
            }
        }
        kgaVar = new kga(this, cg6Var);
        Object obj2 = kgaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kgaVar.l;
        if (i != 0) {
        }
        kgaVar.l = 2;
        obj2 = up6.G(((yga) obj2).a, true, false, new xga(0), kgaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012c, code lost:
    
        if (r2 != r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[LOOP:1: B:28:0x00a1->B:30:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, Boolean bool, Integer num, cg6 cg6Var) {
        lga lgaVar;
        nm6 nm6Var;
        int i;
        Boolean bool2;
        Object d;
        String str2;
        Integer num2;
        String str3;
        String str4;
        Object b;
        Integer num3;
        Boolean bool3;
        String str5;
        String str6;
        ArrayList arrayList;
        if (cg6Var instanceof lga) {
            lgaVar = (lga) cg6Var;
            int i2 = lgaVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lgaVar.s = i2 - Integer.MIN_VALUE;
                Object obj = lgaVar.q;
                nm6Var = nm6.a;
                i = lgaVar.s;
                if (i != 0) {
                    qgg.h0(obj);
                    lgaVar.j = str;
                    lgaVar.k = null;
                    lgaVar.l = null;
                    bool2 = bool;
                    lgaVar.m = bool2;
                    lgaVar.n = num;
                    lgaVar.s = 1;
                    d = d(str, lgaVar);
                    if (d != nm6Var) {
                        str2 = str;
                        num2 = num;
                        str3 = null;
                        str4 = null;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    num2 = lgaVar.n;
                    Boolean bool4 = lgaVar.m;
                    String str7 = lgaVar.l;
                    String str8 = lgaVar.k;
                    str2 = lgaVar.j;
                    qgg.h0(obj);
                    d = obj;
                    bool2 = bool4;
                    str3 = str8;
                    str4 = str7;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(ezf.W((qwl) it.next()));
                        }
                        return arrayList2;
                    }
                    String str9 = lgaVar.p;
                    ArrayList arrayList3 = lgaVar.o;
                    Integer num4 = lgaVar.n;
                    Boolean bool5 = lgaVar.m;
                    str4 = lgaVar.l;
                    String str10 = lgaVar.k;
                    qgg.h0(obj);
                    str6 = str9;
                    arrayList = arrayList3;
                    num3 = num4;
                    bool3 = bool5;
                    str5 = str10;
                    ueo ueoVar = (ueo) obj;
                    mga mgaVar = new mga(ueoVar, null, str6, num3, bool3, str5, str4, arrayList);
                    lgaVar.j = null;
                    lgaVar.k = null;
                    lgaVar.l = null;
                    lgaVar.m = null;
                    lgaVar.n = null;
                    lgaVar.o = null;
                    lgaVar.p = null;
                    lgaVar.s = 3;
                    obj = tyf.N(ueoVar, mgaVar, lgaVar);
                }
                List<fga> list2 = (List) d;
                ArrayList arrayList4 = new ArrayList(v75.o(list2, 10));
                for (fga fgaVar : list2) {
                    arrayList4.add(fgaVar.a.a + StringUtils.PROCESS_POSTFIX_DELIMITER + fgaVar.b);
                }
                String X = CollectionsKt.X(list2, StringUtil.SPACE, null, null, new c68(28), 30);
                lgaVar.j = null;
                lgaVar.k = str3;
                lgaVar.l = str4;
                lgaVar.m = bool2;
                lgaVar.n = num2;
                lgaVar.o = arrayList4;
                lgaVar.p = X;
                lgaVar.s = 2;
                b = this.b.b(str2, lgaVar);
                if (b != nm6Var) {
                    num3 = num2;
                    bool3 = bool2;
                    str5 = str3;
                    str6 = X;
                    obj = b;
                    arrayList = arrayList4;
                    ueo ueoVar2 = (ueo) obj;
                    mga mgaVar2 = new mga(ueoVar2, null, str6, num3, bool3, str5, str4, arrayList);
                    lgaVar.j = null;
                    lgaVar.k = null;
                    lgaVar.l = null;
                    lgaVar.m = null;
                    lgaVar.n = null;
                    lgaVar.o = null;
                    lgaVar.p = null;
                    lgaVar.s = 3;
                    obj = tyf.N(ueoVar2, mgaVar2, lgaVar);
                }
                return nm6Var;
            }
        }
        lgaVar = new lga(this, cg6Var);
        Object obj2 = lgaVar.q;
        nm6Var = nm6.a;
        i = lgaVar.s;
        if (i != 0) {
        }
        List<fga> list22 = (List) d;
        ArrayList arrayList42 = new ArrayList(v75.o(list22, 10));
        while (r14.hasNext()) {
        }
        String X2 = CollectionsKt.X(list22, StringUtil.SPACE, null, null, new c68(28), 30);
        lgaVar.j = null;
        lgaVar.k = str3;
        lgaVar.l = str4;
        lgaVar.m = bool2;
        lgaVar.n = num2;
        lgaVar.o = arrayList42;
        lgaVar.p = X2;
        lgaVar.s = 2;
        b = this.b.b(str2, lgaVar);
        if (b != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r13 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, fga fgaVar, cg6 cg6Var) {
        nga ngaVar;
        Object obj;
        int i;
        dga dgaVar;
        Object G;
        if (cg6Var instanceof nga) {
            ngaVar = (nga) cg6Var;
            int i2 = ngaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ngaVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = ngaVar.k;
                obj = nm6.a;
                i = ngaVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    uga ugaVar = fgaVar.a;
                    dga dgaVar2 = new dga(ugaVar.a, ugaVar.b, ugaVar.c, fgaVar.b, fgaVar.c);
                    ngaVar.j = dgaVar2;
                    ngaVar.m = 1;
                    obj2 = a(str, ngaVar);
                    if (obj2 != obj) {
                        dgaVar = dgaVar2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dgaVar = ngaVar.j;
                qgg.h0(obj2);
                yga ygaVar = (yga) obj2;
                ngaVar.j = null;
                ngaVar.m = 2;
                G = up6.G(ygaVar.a, false, true, new ny2(22, ygaVar, dgaVar), ngaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        ngaVar = new nga(this, cg6Var);
        Object obj22 = ngaVar.k;
        obj = nm6.a;
        i = ngaVar.m;
        if (i != 0) {
        }
        yga ygaVar2 = (yga) obj22;
        ngaVar.j = null;
        ngaVar.m = 2;
        G = up6.G(ygaVar2.a, false, true, new ny2(22, ygaVar2, dgaVar), ngaVar);
        if (G != obj) {
        }
    }
}
