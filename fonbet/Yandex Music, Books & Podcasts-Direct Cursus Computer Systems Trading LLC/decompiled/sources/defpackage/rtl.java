package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rtl {
    public final b4m a;
    public final i5h b;

    public rtl(b4m b4mVar, i5h i5hVar) {
        this.a = b4mVar;
        this.b = i5hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        if (r13 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[LOOP:1: B:27:0x009b->B:29:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, Boolean bool, Boolean bool2, Integer num, cg6 cg6Var) {
        ctl ctlVar;
        int i;
        Iterator it;
        if (cg6Var instanceof ctl) {
            ctlVar = (ctl) cg6Var;
            int i2 = ctlVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ctlVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ctlVar.m;
                nm6 nm6Var = nm6.a;
                i = ctlVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ctlVar.j = bool;
                    ctlVar.k = bool2;
                    ctlVar.l = num;
                    ctlVar.o = 1;
                    obj = this.b.b(str, ctlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(ezf.W((qwl) it2.next()));
                        }
                        return arrayList;
                    }
                    num = ctlVar.l;
                    bool2 = ctlVar.k;
                    bool = ctlVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                if (bool != null) {
                    um4Var.c("playlist_for_kids", bool.booleanValue());
                }
                if (bool2 != null) {
                    um4Var.c("liked", bool2.booleanValue());
                }
                List h = u75.h(xxr.b, yxr.b);
                ArrayList arrayList2 = new ArrayList(v75.o(h, 10));
                it = h.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((byr) it.next()).a));
                }
                um4Var.g("sync", arrayList2);
                tt0.K(ysrVar, um4Var);
                um4 um4Var2 = new um4(pgp.d);
                um4Var2.i("original_id = 3 DESC", xz0.X(new Object[0]));
                um4Var2.i("position ASC", xz0.X(new Object[0]));
                ysrVar.f = um4Var2.l();
                if (num != null) {
                    ysrVar.b(String.valueOf(num.intValue()));
                }
                atn a = ysrVar.a();
                ctlVar.j = null;
                ctlVar.k = null;
                ctlVar.l = null;
                ctlVar.o = 2;
                obj = J.a(a, ctlVar);
            }
        }
        ctlVar = new ctl(this, cg6Var);
        Object obj2 = ctlVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ctlVar.o;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        um4 um4Var3 = new um4(pgp.a);
        if (bool != null) {
        }
        if (bool2 != null) {
        }
        List h2 = u75.h(xxr.b, yxr.b);
        ArrayList arrayList22 = new ArrayList(v75.o(h2, 10));
        it = h2.iterator();
        while (it.hasNext()) {
        }
        um4Var3.g("sync", arrayList22);
        tt0.K(ysrVar2, um4Var3);
        um4 um4Var22 = new um4(pgp.d);
        um4Var22.i("original_id = 3 DESC", xz0.X(new Object[0]));
        um4Var22.i("position ASC", xz0.X(new Object[0]));
        ysrVar2.f = um4Var22.l();
        if (num != null) {
        }
        atn a2 = ysrVar2.a();
        ctlVar.j = null;
        ctlVar.k = null;
        ctlVar.l = null;
        ctlVar.o = 2;
        obj2 = J2.a(a2, ctlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, cg6 cg6Var) {
        dtl dtlVar;
        int i;
        if (cg6Var instanceof dtl) {
            dtlVar = (dtl) cg6Var;
            int i2 = dtlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dtlVar.k;
                nm6 nm6Var = nm6.a;
                i = dtlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dtlVar.j = str;
                    dtlVar.m = 1;
                    obj = this.b.b(str, dtlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ezf.V((ytl) it.next()));
                        }
                        return arrayList;
                    }
                    str = dtlVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                dtlVar.j = null;
                dtlVar.m = 2;
                obj = up6.G(I.a, true, true, new q1h(str, 17), dtlVar);
            }
        }
        dtlVar = new dtl(this, cg6Var);
        Object obj2 = dtlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dtlVar.m;
        if (i != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        dtlVar.j = null;
        dtlVar.m = 2;
        obj2 = up6.G(I2.a, true, true, new q1h(str, 17), dtlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(String str, cg6 cg6Var) {
        etl etlVar;
        int i;
        if (cg6Var instanceof etl) {
            etlVar = (etl) cg6Var;
            int i2 = etlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                etlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = etlVar.k;
                nm6 nm6Var = nm6.a;
                i = etlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    etlVar.j = str;
                    etlVar.m = 1;
                    obj = this.b.b(str, etlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<ovl> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (ovl ovlVar : iterable) {
                            arrayList.add(new nvl(ovlVar.a, ovlVar.b));
                        }
                        return arrayList;
                    }
                    str = etlVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                etlVar.j = null;
                etlVar.m = 2;
                obj = up6.G(I.a, true, true, new q1h(str, 16), etlVar);
            }
        }
        etlVar = new etl(this, cg6Var);
        Object obj2 = etlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = etlVar.m;
        if (i != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        etlVar.j = null;
        etlVar.m = 2;
        obj2 = up6.G(I2.a, true, true, new q1h(str, 16), etlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, nvl nvlVar, boolean z, cg6 cg6Var) {
        ftl ftlVar;
        int i;
        if (cg6Var instanceof ftl) {
            ftlVar = (ftl) cg6Var;
            int i2 = ftlVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ftlVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ftlVar.l;
                nm6 nm6Var = nm6.a;
                i = ftlVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ftlVar.j = nvlVar;
                    ftlVar.k = z;
                    ftlVar.n = 1;
                    obj = this.b.b(str, ftlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        qwl qwlVar = (qwl) CollectionsKt.firstOrNull((List) obj);
                        if (qwlVar != null) {
                            return ezf.W(qwlVar);
                        }
                        return null;
                    }
                    z = ftlVar.k;
                    nvlVar = ftlVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.b("uid", nvlVar.a);
                um4Var.b("original_id", nvlVar.b);
                if (z) {
                    um4Var.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
                }
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                ftlVar.j = null;
                ftlVar.k = z;
                ftlVar.n = 2;
                obj = J.a(a, ftlVar);
            }
        }
        ftlVar = new ftl(this, cg6Var);
        Object obj2 = ftlVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ftlVar.n;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.b("uid", nvlVar.a);
        um4Var2.b("original_id", nvlVar.b);
        if (z) {
        }
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        ftlVar.j = null;
        ftlVar.k = z;
        ftlVar.n = 2;
        obj2 = J2.a(a2, ftlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(String str, long j, cg6 cg6Var) {
        gtl gtlVar;
        int i;
        if (cg6Var instanceof gtl) {
            gtlVar = (gtl) cg6Var;
            int i2 = gtlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gtlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gtlVar.k;
                nm6 nm6Var = nm6.a;
                i = gtlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    gtlVar.j = j;
                    gtlVar.m = 1;
                    obj = this.b.b(str, gtlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        qwl qwlVar = (qwl) CollectionsKt.firstOrNull((List) obj);
                        if (qwlVar != null) {
                            return ezf.W(qwlVar);
                        }
                        return null;
                    }
                    j = gtlVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.b("_id", String.valueOf(j));
                um4Var.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                gtlVar.j = j;
                gtlVar.m = 2;
                obj = J.a(a, gtlVar);
            }
        }
        gtlVar = new gtl(this, cg6Var);
        Object obj2 = gtlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gtlVar.m;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.b("_id", String.valueOf(j));
        um4Var2.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        gtlVar.j = j;
        gtlVar.m = 2;
        obj2 = J2.a(a2, gtlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, int i, cg6 cg6Var) {
        htl htlVar;
        int i2;
        if (cg6Var instanceof htl) {
            htlVar = (htl) cg6Var;
            int i3 = htlVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                htlVar.n = i3 - Integer.MIN_VALUE;
                Object obj = htlVar.l;
                nm6 nm6Var = nm6.a;
                i2 = htlVar.n;
                if (i2 != 0) {
                    qgg.h0(obj);
                    htlVar.j = str;
                    htlVar.k = i;
                    htlVar.n = 1;
                    obj = this.b.b(str, htlVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ezf.V((ytl) it.next()));
                        }
                        return arrayList;
                    }
                    i = htlVar.k;
                    str = htlVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                htlVar.j = null;
                htlVar.k = i;
                htlVar.n = 2;
                obj = up6.G(I.a, true, true, new x20(str, i, 6), htlVar);
            }
        }
        htlVar = new htl(this, cg6Var);
        Object obj2 = htlVar.l;
        nm6 nm6Var2 = nm6.a;
        i2 = htlVar.n;
        if (i2 != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        htlVar.j = null;
        htlVar.k = i;
        htlVar.n = 2;
        obj2 = up6.G(I2.a, true, true, new x20(str, i, 6), htlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, nvl nvlVar, cg6 cg6Var) {
        itl itlVar;
        int i;
        if (cg6Var instanceof itl) {
            itlVar = (itl) cg6Var;
            int i2 = itlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                itlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = itlVar.k;
                nm6 nm6Var = nm6.a;
                i = itlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    itlVar.j = nvlVar;
                    itlVar.m = 1;
                    obj = this.b.b(str, itlVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = itlVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                String str2 = nvlVar.a;
                String str3 = nvlVar.b;
                itlVar.j = null;
                itlVar.m = 2;
                Object b = I.b(str2, str3, itlVar);
                return b != nm6Var ? nm6Var : b;
            }
        }
        itlVar = new itl(this, cg6Var);
        Object obj2 = itlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = itlVar.m;
        if (i != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        String str22 = nvlVar.a;
        String str32 = nvlVar.b;
        itlVar.j = null;
        itlVar.m = 2;
        Object b2 = I2.b(str22, str32, itlVar);
        if (b2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(String str, Iterable iterable, cg6 cg6Var) {
        jtl jtlVar;
        int i;
        if (cg6Var instanceof jtl) {
            jtlVar = (jtl) cg6Var;
            int i2 = jtlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jtlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jtlVar.k;
                nm6 nm6Var = nm6.a;
                i = jtlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jtlVar.j = iterable;
                    jtlVar.m = 1;
                    obj = this.b.b(str, jtlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Iterable iterable2 = jtlVar.j;
                        qgg.h0(obj);
                        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                        ArrayList arrayList = new ArrayList(v75.o(linkedHashSet, 10));
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ezf.W((qwl) it.next()));
                        }
                        return arrayList;
                    }
                    iterable = jtlVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                zs zsVar = new zs(ueoVar, null, iterable, 1);
                jtlVar.j = null;
                jtlVar.m = 2;
                obj = tyf.N(ueoVar, zsVar, jtlVar);
            }
        }
        jtlVar = new jtl(this, cg6Var);
        Object obj2 = jtlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jtlVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        zs zsVar2 = new zs(ueoVar2, null, iterable, 1);
        jtlVar.j = null;
        jtlVar.m = 2;
        obj2 = tyf.N(ueoVar2, zsVar2, jtlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r12 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var, String str, ArrayList arrayList) {
        ktl ktlVar;
        int i;
        if (cg6Var instanceof ktl) {
            ktlVar = (ktl) cg6Var;
            int i2 = ktlVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ktlVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ktlVar.l;
                nm6 nm6Var = nm6.a;
                i = ktlVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ktlVar.j = str;
                    ktlVar.k = arrayList;
                    ktlVar.n = 1;
                    obj = this.b.b(str, ktlVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = ktlVar.k;
                    str = ktlVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                ltl ltlVar = new ltl(mainDatabase, null, arrayList, this, str, mainDatabase.I());
                ktlVar.j = null;
                ktlVar.k = null;
                ktlVar.n = 2;
            }
        }
        ktlVar = new ktl(this, cg6Var);
        Object obj2 = ktlVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ktlVar.n;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        ltl ltlVar2 = new ltl(mainDatabase2, null, arrayList, this, str, mainDatabase2.I());
        ktlVar.j = null;
        ktlVar.k = null;
        ktlVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r14 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, nvl nvlVar, tn6 tn6Var, cg6 cg6Var) {
        mtl mtlVar;
        int i;
        if (cg6Var instanceof mtl) {
            mtlVar = (mtl) cg6Var;
            int i2 = mtlVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtlVar.n = i2 - Integer.MIN_VALUE;
                Object obj = mtlVar.l;
                nm6 nm6Var = nm6.a;
                i = mtlVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    mtlVar.j = nvlVar;
                    mtlVar.k = tn6Var;
                    mtlVar.n = 1;
                    obj = this.b.b(str, mtlVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tn6Var = mtlVar.k;
                    nvlVar = mtlVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                wx4 wx4Var = new wx4(ueoVar, (Continuation) null, nvlVar, tn6Var, 2);
                mtlVar.j = null;
                mtlVar.k = null;
                mtlVar.n = 2;
            }
        }
        mtlVar = new mtl(this, cg6Var);
        Object obj2 = mtlVar.l;
        nm6 nm6Var2 = nm6.a;
        i = mtlVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        wx4 wx4Var2 = new wx4(ueoVar2, (Continuation) null, nvlVar, tn6Var, 2);
        mtlVar.j = null;
        mtlVar.k = null;
        mtlVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (defpackage.tyf.N(r1, r0, r9) != r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, nvl nvlVar, boolean z, Long l, cg6 cg6Var) {
        ntl ntlVar;
        int i;
        Long l2;
        String str2;
        nvl nvlVar2;
        boolean z2;
        if (cg6Var instanceof ntl) {
            ntlVar = (ntl) cg6Var;
            int i2 = ntlVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ntlVar.p = i2 - Integer.MIN_VALUE;
                ntl ntlVar2 = ntlVar;
                Object obj = ntlVar2.n;
                nm6 nm6Var = nm6.a;
                i = ntlVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    ntlVar2.j = str;
                    ntlVar2.k = nvlVar;
                    l2 = l;
                    ntlVar2.l = l2;
                    ntlVar2.m = z;
                    ntlVar2.p = 1;
                    Object b = this.b.b(str, ntlVar2);
                    if (b != nm6Var) {
                        str2 = str;
                        nvlVar2 = nvlVar;
                        z2 = z;
                        obj = b;
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
                boolean z3 = ntlVar2.m;
                l2 = ntlVar2.l;
                nvl nvlVar3 = ntlVar2.k;
                String str3 = ntlVar2.j;
                qgg.h0(obj);
                z2 = z3;
                str2 = str3;
                nvlVar2 = nvlVar3;
                MainDatabase mainDatabase = (MainDatabase) obj;
                otl otlVar = new otl(mainDatabase, null, mainDatabase.I(), nvlVar2, z2, l2, this, str2);
                ntlVar2.j = null;
                ntlVar2.k = null;
                ntlVar2.l = null;
                ntlVar2.m = z2;
                ntlVar2.p = 2;
            }
        }
        ntlVar = new ntl(this, cg6Var);
        ntl ntlVar22 = ntlVar;
        Object obj2 = ntlVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = ntlVar22.p;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        otl otlVar2 = new otl(mainDatabase2, null, mainDatabase2.I(), nvlVar2, z2, l2, this, str2);
        ntlVar22.j = null;
        ntlVar22.k = null;
        ntlVar22.l = null;
        ntlVar22.m = z2;
        ntlVar22.p = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (defpackage.tyf.N(r1, r0, r9) != r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, long j, byr byrVar, cg6 cg6Var) {
        ptl ptlVar;
        int i;
        String str2;
        long j2;
        byr byrVar2;
        if (cg6Var instanceof ptl) {
            ptlVar = (ptl) cg6Var;
            int i2 = ptlVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ptlVar.o = i2 - Integer.MIN_VALUE;
                ptl ptlVar2 = ptlVar;
                Object obj = ptlVar2.m;
                nm6 nm6Var = nm6.a;
                i = ptlVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ptlVar2.j = str;
                    ptlVar2.k = byrVar;
                    ptlVar2.l = j;
                    ptlVar2.o = 1;
                    Object b = this.b.b(str, ptlVar2);
                    if (b != nm6Var) {
                        str2 = str;
                        j2 = j;
                        byrVar2 = byrVar;
                        obj = b;
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
                long j3 = ptlVar2.l;
                byr byrVar3 = ptlVar2.k;
                String str3 = ptlVar2.j;
                qgg.h0(obj);
                byrVar2 = byrVar3;
                str2 = str3;
                j2 = j3;
                MainDatabase mainDatabase = (MainDatabase) obj;
                qtl qtlVar = new qtl(mainDatabase, null, mainDatabase.I(), j2, byrVar2, this, str2);
                ptlVar2.j = null;
                ptlVar2.k = null;
                ptlVar2.l = j2;
                ptlVar2.o = 2;
            }
        }
        ptlVar = new ptl(this, cg6Var);
        ptl ptlVar22 = ptlVar;
        Object obj2 = ptlVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = ptlVar22.o;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        qtl qtlVar2 = new qtl(mainDatabase2, null, mainDatabase2.I(), j2, byrVar2, this, str2);
        ptlVar22.j = null;
        ptlVar22.k = null;
        ptlVar22.l = j2;
        ptlVar22.o = 2;
    }
}
