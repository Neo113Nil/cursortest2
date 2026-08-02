package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class btl {
    public final jyr a;
    public final p2m b;
    public final rtl c;
    public final i2m d;
    public final jyr e;

    public btl() {
        l18 l18Var = l18.b;
        this.a = l18Var.b(hag.I(t3g.class), true);
        this.b = new p2m();
        bdt I = hag.I(rtl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.c = (rtl) qdcVar.C(I);
        bdt I2 = hag.I(i2m.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.d = (i2m) qdcVar2.C(I2);
        this.e = l18Var.b(hag.I(i5h.class), false);
    }

    public static final String a(btl btlVar, mqs mqsVar) {
        String str;
        i1m i1mVar = mqsVar.v;
        return (i1mVar == null || (str = i1mVar.d) == null) ? mqsVar.d.a : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r10 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(btl btlVar, String str, String str2, Integer num, List list, cg6 cg6Var) {
        rsl rslVar;
        int i;
        btlVar.getClass();
        if (cg6Var instanceof rsl) {
            rslVar = (rsl) cg6Var;
            int i2 = rslVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rslVar.o = i2 - Integer.MIN_VALUE;
                Object obj = rslVar.m;
                nm6 nm6Var = nm6.a;
                i = rslVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h e = btlVar.e();
                    rslVar.j = str2;
                    rslVar.k = num;
                    rslVar.l = list;
                    rslVar.o = 1;
                    obj = e.b(str, rslVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list2 = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ezf.W((qwl) it.next()));
                        }
                        return arrayList;
                    }
                    list = rslVar.l;
                    num = rslVar.k;
                    str2 = rslVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.b("uid", str2);
                um4Var.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
                if (list != null) {
                    um4Var.g("original_id", list);
                }
                tt0.K(ysrVar, um4Var);
                ysrVar.f = "original_id=3 DESC, position";
                if (num != null) {
                    ysrVar.b(String.valueOf(num.intValue()));
                }
                atn a = ysrVar.a();
                rslVar.j = null;
                rslVar.k = null;
                rslVar.l = null;
                rslVar.o = 2;
                obj = J.a(a, rslVar);
            }
        }
        rslVar = new rsl(btlVar, cg6Var);
        Object obj2 = rslVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rslVar.o;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.b("uid", str2);
        um4Var2.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
        if (list != null) {
        }
        tt0.K(ysrVar2, um4Var2);
        ysrVar2.f = "original_id=3 DESC, position";
        if (num != null) {
        }
        atn a2 = ysrVar2.a();
        rslVar.j = null;
        rslVar.k = null;
        rslVar.l = null;
        rslVar.o = 2;
        obj2 = J2.a(a2, rslVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(btl btlVar, String str, List list, cg6 cg6Var) {
        ysl yslVar;
        int i;
        btlVar.getClass();
        if (cg6Var instanceof ysl) {
            yslVar = (ysl) cg6Var;
            int i2 = yslVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yslVar.n = i2 - Integer.MIN_VALUE;
                Object obj = yslVar.l;
                nm6 nm6Var = nm6.a;
                i = yslVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h e = btlVar.e();
                    yslVar.j = str;
                    yslVar.k = list;
                    yslVar.n = 1;
                    obj = e.b(str, yslVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = yslVar.k;
                    str = yslVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                jbb jbbVar = new jbb(ueoVar, (Continuation) null, btlVar, str, list, 6);
                yslVar.j = null;
                yslVar.k = null;
                yslVar.n = 2;
                Object N = tyf.N(ueoVar, jbbVar, yslVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        yslVar = new ysl(btlVar, cg6Var);
        Object obj2 = yslVar.l;
        nm6 nm6Var2 = nm6.a;
        i = yslVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        jbb jbbVar2 = new jbb(ueoVar2, (Continuation) null, btlVar, str, list, 6);
        yslVar.j = null;
        yslVar.k = null;
        yslVar.n = 2;
        Object N2 = tyf.N(ueoVar2, jbbVar2, yslVar);
        if (N2 != nm6Var2) {
        }
    }

    public final eno d(String str, Integer num, List list) {
        str.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str2 = ((frt) qdcVar.C(I)).c().a;
        str2.getClass();
        return e().f(str2, new String[]{"playlist_mview"}, new vx4(this, str2, str, num, list, (Continuation) null));
    }

    public final i5h e() {
        return (i5h) this.e.getValue();
    }

    public final cvl f(long j) {
        Continuation continuation = null;
        if (j < 0) {
            dfi.r(dfi.d(j, "getPlaylistHeade(): nativeId = "), "PlaylistDataSource");
            return null;
        }
        return (cvl) x97.D(g.a, new ssl(this, j, continuation, 1));
    }

    public final cvl g(cvl cvlVar) {
        cvlVar.getClass();
        long j = cvlVar.k;
        return j >= 0 ? f(j) : i(cvlVar.c.a, cvlVar.a);
    }

    public final cvl h(String str, String str2) {
        str.getClass();
        str2.getClass();
        return (cvl) x97.D(g.a, new c5l(this, str, (Serializable) str2, (Continuation) null, 5));
    }

    public final cvl i(String str, String str2) {
        str.getClass();
        str2.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str3 = ((frt) qdcVar.C(I)).c().a;
        str3.getClass();
        return (cvl) x97.D(dm6.a, new rfg(this, str3, str, str2, null, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, long j, String str2, cg6 cg6Var) {
        tsl tslVar;
        int i;
        if (cg6Var instanceof tsl) {
            tslVar = (tsl) cg6Var;
            int i2 = tslVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tslVar.n = i2 - Integer.MIN_VALUE;
                Object obj = tslVar.l;
                nm6 nm6Var = nm6.a;
                i = tslVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j < 0) {
                        dfi.r(dfi.d(j, "isTrackAdded nativePlaylistId = "), "PlaylistDataSource");
                    }
                    i5h e = e();
                    tslVar.j = str2;
                    tslVar.k = j;
                    tslVar.n = 1;
                    obj = e.b(str, tslVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = tslVar.k;
                    str2 = tslVar.j;
                    qgg.h0(obj);
                }
                q1m K = ((MainDatabase) obj).K();
                tslVar.j = null;
                tslVar.k = j;
                tslVar.n = 2;
                Object G = up6.G(K.a, true, false, new l1m(str2, 2, j), tslVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        tslVar = new tsl(this, cg6Var);
        Object obj2 = tslVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tslVar.n;
        if (i != 0) {
        }
        q1m K2 = ((MainDatabase) obj2).K();
        tslVar.j = null;
        tslVar.k = j;
        tslVar.n = 2;
        Object G2 = up6.G(K2.a, true, false, new l1m(str2, 2, j), tslVar);
        if (G2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(cvl cvlVar, cg6 cg6Var) {
        usl uslVar;
        int i;
        btl btlVar;
        if (cg6Var instanceof usl) {
            uslVar = (usl) cg6Var;
            int i2 = uslVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uslVar.n = i2 - Integer.MIN_VALUE;
                Object obj = uslVar.l;
                nm6 nm6Var = nm6.a;
                i = uslVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    t3g t3gVar = (t3g) this.a.getValue();
                    uslVar.j = this;
                    uslVar.k = cvlVar;
                    uslVar.n = 1;
                    obj = t3gVar.h(cvlVar, uslVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    btlVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar = uslVar.k;
                    btl btlVar2 = uslVar.j;
                    qgg.h0(obj);
                    btlVar = btlVar2;
                }
                cvl cvlVar2 = cvlVar;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                btlVar.getClass();
                return (cvl) x97.D(g.a, new cg1(btlVar, cvlVar2, booleanValue, (Continuation) null, 14));
            }
        }
        uslVar = new usl(this, cg6Var);
        Object obj2 = uslVar.l;
        nm6 nm6Var2 = nm6.a;
        i = uslVar.n;
        if (i != 0) {
        }
        cvl cvlVar22 = cvlVar;
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        btlVar.getClass();
        return (cvl) x97.D(g.a, new cg1(btlVar, cvlVar22, booleanValue2, (Continuation) null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        if (r1.j(r2, r7, r3, r6) != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cvl cvlVar, ArrayList arrayList, cg6 cg6Var) {
        vsl vslVar;
        nm6 nm6Var;
        int i;
        rtl rtlVar;
        int i2;
        Object h;
        String str;
        String str2;
        int i3;
        Serializable d;
        List list;
        int i4;
        String str3;
        int i5;
        if (cg6Var instanceof vsl) {
            vslVar = (vsl) cg6Var;
            int i6 = vslVar.s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                vslVar.s = i6 - Integer.MIN_VALUE;
                vsl vslVar2 = vslVar;
                Object obj = vslVar2.q;
                nm6Var = nm6.a;
                i = vslVar2.s;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str4 = ((frt) qdcVar.C(I)).c().a;
                    str4.getClass();
                    rtlVar = this.c;
                    t3g t3gVar = (t3g) this.a.getValue();
                    vslVar2.j = arrayList;
                    vslVar2.k = str4;
                    vslVar2.l = cvlVar;
                    vslVar2.m = str4;
                    vslVar2.n = rtlVar;
                    i2 = 0;
                    vslVar2.o = 0;
                    vslVar2.p = 0;
                    vslVar2.s = 1;
                    h = t3gVar.h(cvlVar, vslVar2);
                    if (h != nm6Var) {
                        str = str4;
                        str2 = str;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    int i7 = vslVar2.p;
                    int i8 = vslVar2.o;
                    rtlVar = vslVar2.n;
                    String str5 = vslVar2.m;
                    cvl cvlVar2 = vslVar2.l;
                    String str6 = vslVar2.k;
                    List list2 = vslVar2.j;
                    qgg.h0(obj);
                    i2 = i7;
                    cvlVar = cvlVar2;
                    str = str6;
                    i3 = i8;
                    arrayList = list2;
                    str2 = str5;
                    h = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list3 = vslVar2.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    i5 = vslVar2.p;
                    i4 = vslVar2.o;
                    str3 = vslVar2.k;
                    list = vslVar2.j;
                    qgg.h0(obj);
                    String str7 = str3;
                    i2m i2mVar = this.d;
                    long j = ((cvl) obj).k;
                    vslVar2.j = null;
                    vslVar2.k = null;
                    vslVar2.l = null;
                    vslVar2.o = i4;
                    vslVar2.p = i5;
                    vslVar2.s = 3;
                }
                boolean booleanValue = ((Boolean) h).booleanValue();
                vslVar2.j = arrayList;
                vslVar2.k = str;
                vslVar2.l = null;
                vslVar2.m = null;
                vslVar2.n = null;
                vslVar2.o = i3;
                vslVar2.p = i2;
                vslVar2.s = 2;
                d = rtlVar.a.d(str2, cvlVar, booleanValue, vslVar2);
                if (d != nm6Var) {
                    list = arrayList;
                    i4 = i3;
                    str3 = str;
                    obj = d;
                    i5 = i2;
                    String str72 = str3;
                    i2m i2mVar2 = this.d;
                    long j2 = ((cvl) obj).k;
                    vslVar2.j = null;
                    vslVar2.k = null;
                    vslVar2.l = null;
                    vslVar2.o = i4;
                    vslVar2.p = i5;
                    vslVar2.s = 3;
                }
                return nm6Var;
            }
        }
        vslVar = new vsl(this, cg6Var);
        vsl vslVar22 = vslVar;
        Object obj2 = vslVar22.q;
        nm6Var = nm6.a;
        i = vslVar22.s;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) h).booleanValue();
        vslVar22.j = arrayList;
        vslVar22.k = str;
        vslVar22.l = null;
        vslVar22.m = null;
        vslVar22.n = null;
        vslVar22.o = i3;
        vslVar22.p = i2;
        vslVar22.s = 2;
        d = rtlVar.a.d(str2, cvlVar, booleanValue2, vslVar22);
        if (d != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r13 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, cg6 cg6Var) {
        xsl xslVar;
        int i;
        if (cg6Var instanceof xsl) {
            xslVar = (xsl) cg6Var;
            int i2 = xslVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xslVar.n = i2 - Integer.MIN_VALUE;
                Object obj = xslVar.l;
                nm6 nm6Var = nm6.a;
                i = xslVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h e = e();
                    xslVar.j = str;
                    xslVar.k = str2;
                    xslVar.n = 1;
                    obj = e.b(str, xslVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = xslVar.k;
                    str = xslVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                wx4 wx4Var = new wx4(ueoVar, (Continuation) null, str2, this, str);
                xslVar.j = null;
                xslVar.k = null;
                xslVar.n = 2;
            }
        }
        xslVar = new xsl(this, cg6Var);
        Object obj2 = xslVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xslVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        wx4 wx4Var2 = new wx4(ueoVar2, (Continuation) null, str2, this, str);
        xslVar.j = null;
        xslVar.k = null;
        xslVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (defpackage.tyf.N(r4, r3, r2) != r11) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j, b38 b38Var, cg6 cg6Var) {
        zsl zslVar;
        int i;
        long j2;
        int i2;
        String str;
        b38 b38Var2;
        int i3;
        l18 l18Var = l18.b;
        if (cg6Var instanceof zsl) {
            zslVar = (zsl) cg6Var;
            int i4 = zslVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zslVar.q = i4 - Integer.MIN_VALUE;
                Object obj = zslVar.o;
                nm6 nm6Var = nm6.a;
                i = zslVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str2 = ((frt) qdcVar.C(I)).c().a;
                    str2.getClass();
                    bdt I2 = hag.I(i5h.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    i5h i5hVar = (i5h) qdcVar2.C(I2);
                    zslVar.k = b38Var;
                    zslVar.l = str2;
                    j2 = j;
                    zslVar.j = j2;
                    zslVar.m = 0;
                    zslVar.n = 0;
                    zslVar.q = 1;
                    obj = i5hVar.b(str2, zslVar);
                    if (obj != nm6Var) {
                        i2 = 0;
                        str = str2;
                        b38Var2 = b38Var;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = zslVar.n;
                int i5 = zslVar.m;
                long j3 = zslVar.j;
                String str3 = zslVar.l;
                b38 b38Var3 = zslVar.k;
                qgg.h0(obj);
                i2 = i5;
                str = str3;
                b38Var2 = b38Var3;
                j2 = j3;
                ueo ueoVar = (ueo) obj;
                atl atlVar = new atl(ueoVar, null, b38Var2, j2, this, str);
                zslVar.k = null;
                zslVar.l = null;
                zslVar.j = j2;
                zslVar.m = i2;
                zslVar.n = i3;
                zslVar.q = 2;
            }
        }
        zslVar = new zsl(this, cg6Var);
        Object obj2 = zslVar.o;
        nm6 nm6Var2 = nm6.a;
        i = zslVar.q;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        atl atlVar2 = new atl(ueoVar2, null, b38Var2, j2, this, str);
        zslVar.k = null;
        zslVar.l = null;
        zslVar.j = j2;
        zslVar.m = i2;
        zslVar.n = i3;
        zslVar.q = 2;
    }
}
