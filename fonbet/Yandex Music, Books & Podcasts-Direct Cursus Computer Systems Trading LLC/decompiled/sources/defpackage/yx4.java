package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class yx4 {
    public final uaa a;
    public final aaa b;
    public final cba c;
    public final i5h d;
    public final frt e;

    public yx4(uaa uaaVar, aaa aaaVar, cba cbaVar, i5h i5hVar, frt frtVar) {
        uaaVar.getClass();
        aaaVar.getClass();
        cbaVar.getClass();
        this.a = uaaVar;
        this.b = aaaVar;
        this.c = cbaVar;
        this.d = i5hVar;
        this.e = frtVar;
    }

    public static /* synthetic */ Serializable m(yx4 yx4Var, uhn uhnVar, Boolean bool, Integer num, Boolean bool2, cg6 cg6Var, int i) {
        if ((i & 1) != 0) {
            uhnVar = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return yx4Var.l(uhnVar, bool, num, bool2, false, cg6Var);
    }

    public static pjc y(pjc[] pjcVarArr, Function1 function1) {
        pjc[] pjcVarArr2 = (pjc[]) Arrays.copyOf(pjcVarArr, pjcVarArr.length);
        return zsd.k0(zsd.s0(ox6.L(zsd.u0((pjc[]) Arrays.copyOf(pjcVarArr2, pjcVarArr2.length)), 1000L), new g68(new tx4(function1, null, 0), null, 16)), dm6.a);
    }

    public final pjc A(String str, Integer num, String str2, Boolean bool) {
        xdr xdrVar = this.c.e;
        String str3 = this.e.c().a;
        str3.getClass();
        MainDatabase mainDatabase = (MainDatabase) this.d.c(str3);
        mainDatabase.getClass();
        return y(new pjc[]{xdrVar, mainDatabase.G((String[]) Arrays.copyOf(new String[]{"playlist_mview", "playlist_track"}, 2), new ikc(1, 3, null))}, new vx4(this, str, str2, bool, num, null, 0));
    }

    public final pjc B(Integer num) {
        return y(new pjc[]{this.b.e}, new vw4(this, num, null, 6));
    }

    public final Serializable C(Integer num, cg6 cg6Var) {
        Boolean bool = Boolean.TRUE;
        List list = gys.MyMusicPodcastEpisodes.a;
        return m(this, vz1.k(list, list), Boolean.FALSE, num, bool, cg6Var, 16);
    }

    public final pjc D(Integer num) {
        return y(new pjc[]{((e6q) this.a).e}, new vw4(this, num, null, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(cg6 cg6Var) {
        xx4 xx4Var;
        int i;
        um4 um4Var;
        if (cg6Var instanceof xx4) {
            xx4Var = (xx4) cg6Var;
            int i2 = xx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = xx4Var.k;
                nm6 nm6Var = nm6.a;
                i = xx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Set keySet = ((lja) ((e6q) this.a).e.getValue()).b.keySet();
                    um4Var = new um4(pgp.a);
                    um4Var.e("track_mview.original_id", keySet);
                    String str = this.e.c().a;
                    str.getClass();
                    xx4Var.j = um4Var;
                    xx4Var.m = 1;
                    obj = this.d.b(str, xx4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    um4Var = xx4Var.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                wx4 wx4Var = new wx4(mainDatabase, (Continuation) null, um4Var, this, 0);
                xx4Var.j = null;
                xx4Var.m = 2;
                Object N = tyf.N(mainDatabase, wx4Var, xx4Var);
                return N != nm6Var ? nm6Var : N;
            }
        }
        xx4Var = new xx4(this, cg6Var);
        Object obj2 = xx4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = xx4Var.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        wx4 wx4Var2 = new wx4(mainDatabase2, (Continuation) null, um4Var, this, 0);
        xx4Var.j = null;
        xx4Var.m = 2;
        Object N2 = tyf.N(mainDatabase2, wx4Var2, xx4Var);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163 A[LOOP:4: B:98:0x015d->B:100:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0182 A[LOOP:5: B:103:0x017c->B:105:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a1 A[LOOP:6: B:108:0x019b->B:110:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106 A[LOOP:1: B:83:0x0100->B:85:0x0106, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125 A[LOOP:2: B:88:0x011f->B:90:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0144 A[LOOP:3: B:93:0x013e->B:95:0x0144, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ww4 ww4Var;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        if (cg6Var instanceof ww4) {
            ww4Var = (ww4) cg6Var;
            int i2 = ww4Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ww4Var.r = i2 - Integer.MIN_VALUE;
                Object obj = ww4Var.p;
                Object obj2 = nm6.a;
                i = ww4Var.r;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    arrayList4 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ww4Var.j = q;
                    ww4Var.k = arrayList;
                    ww4Var.l = arrayList2;
                    ww4Var.m = arrayList3;
                    ww4Var.n = arrayList4;
                    ww4Var.o = arrayList7;
                    ww4Var.r = 1;
                    Object E = E(ww4Var);
                    if (E == obj2) {
                        return obj2;
                    }
                    arrayList5 = q;
                    obj = E;
                    arrayList6 = arrayList7;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList6 = ww4Var.o;
                    arrayList4 = ww4Var.n;
                    arrayList3 = ww4Var.m;
                    arrayList2 = ww4Var.l;
                    arrayList = ww4Var.k;
                    arrayList5 = ww4Var.j;
                    qgg.h0(obj);
                }
                for (y1t y1tVar : (Iterable) obj) {
                    v1t v1tVar = y1tVar.c;
                    boolean z = y1tVar.h;
                    boolean z2 = y1tVar.e;
                    boolean z3 = y1tVar.f;
                    boolean z4 = y1tVar.g;
                    int ordinal = v1tVar.ordinal();
                    if (ordinal == 0) {
                        arrayList5.add(y1tVar);
                        if (z4) {
                            arrayList.add(y1tVar);
                        }
                        if (z3) {
                            arrayList2.add(y1tVar);
                        }
                        if (z) {
                            arrayList6.add(y1tVar);
                        }
                    } else if (ordinal == 1) {
                        if (z4) {
                            arrayList.add(y1tVar);
                            if (z2 || z3) {
                                arrayList3.add(y1tVar);
                            }
                        } else {
                            arrayList3.add(y1tVar);
                        }
                        if (z) {
                            arrayList6.add(y1tVar);
                        }
                    } else if (ordinal == 2) {
                        if (z4) {
                            arrayList.add(y1tVar);
                            if (z2 || z3) {
                                arrayList4.add(y1tVar);
                            }
                        } else {
                            arrayList4.add(y1tVar);
                        }
                        if (z) {
                            arrayList6.add(y1tVar);
                        }
                    } else if (ordinal != 3) {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                    } else if (z4) {
                        arrayList.add(y1tVar);
                        if (z2 || z3) {
                            arrayList6.add(y1tVar);
                        }
                    } else {
                        arrayList6.add(y1tVar);
                    }
                }
                int size = arrayList5.size();
                it = arrayList5.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((y1t) it.next()).d;
                }
                k4t k4tVar = new k4t(size, j);
                int size2 = arrayList.size();
                it2 = arrayList.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += ((y1t) it2.next()).d;
                }
                k4t k4tVar2 = new k4t(size2, j2);
                int size3 = arrayList2.size();
                it3 = arrayList2.iterator();
                long j3 = 0;
                while (it3.hasNext()) {
                    j3 += ((y1t) it3.next()).d;
                }
                k4t k4tVar3 = new k4t(size3, j3);
                int size4 = arrayList3.size();
                it4 = arrayList3.iterator();
                long j4 = 0;
                while (it4.hasNext()) {
                    j4 += ((y1t) it4.next()).d;
                }
                k4t k4tVar4 = new k4t(size4, j4);
                int size5 = arrayList4.size();
                it5 = arrayList4.iterator();
                long j5 = 0;
                while (it5.hasNext()) {
                    j5 += ((y1t) it5.next()).d;
                }
                k4t k4tVar5 = new k4t(size5, j5);
                int size6 = arrayList6.size();
                it6 = arrayList6.iterator();
                long j6 = 0;
                while (it6.hasNext()) {
                    j6 += ((y1t) it6.next()).d;
                }
                return new l4t(k4tVar, k4tVar2, k4tVar3, k4tVar4, k4tVar5, new k4t(size6, j6));
            }
        }
        ww4Var = new ww4(this, cg6Var);
        Object obj3 = ww4Var.p;
        Object obj22 = nm6.a;
        i = ww4Var.r;
        if (i != 0) {
        }
        while (r1.hasNext()) {
        }
        int size7 = arrayList5.size();
        it = arrayList5.iterator();
        long j7 = 0;
        while (it.hasNext()) {
        }
        k4t k4tVar6 = new k4t(size7, j7);
        int size22 = arrayList.size();
        it2 = arrayList.iterator();
        long j22 = 0;
        while (it2.hasNext()) {
        }
        k4t k4tVar22 = new k4t(size22, j22);
        int size32 = arrayList2.size();
        it3 = arrayList2.iterator();
        long j32 = 0;
        while (it3.hasNext()) {
        }
        k4t k4tVar32 = new k4t(size32, j32);
        int size42 = arrayList3.size();
        it4 = arrayList3.iterator();
        long j42 = 0;
        while (it4.hasNext()) {
        }
        k4t k4tVar42 = new k4t(size42, j42);
        int size52 = arrayList4.size();
        it5 = arrayList4.iterator();
        long j52 = 0;
        while (it5.hasNext()) {
        }
        k4t k4tVar52 = new k4t(size52, j52);
        int size62 = arrayList6.size();
        it6 = arrayList6.iterator();
        long j62 = 0;
        while (it6.hasNext()) {
        }
        return new l4t(k4tVar6, k4tVar22, k4tVar32, k4tVar42, k4tVar52, new k4t(size62, j62));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011e A[LOOP:0: B:12:0x0118->B:14:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v17, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Integer num, cg6 cg6Var) {
        xw4 xw4Var;
        Object obj;
        nm6 nm6Var;
        int i;
        Set keySet;
        lja ljaVar;
        Integer num2;
        atn atnVar;
        Set<String> set;
        lja ljaVar2;
        Integer num3;
        Iterator it;
        Iterator it2;
        Iterator it3;
        ?? r6;
        if (cg6Var instanceof xw4) {
            xw4Var = (xw4) cg6Var;
            int i2 = xw4Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xw4Var.p = i2 - Integer.MIN_VALUE;
                obj = xw4Var.n;
                nm6Var = nm6.a;
                i = xw4Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    lja ljaVar3 = (lja) ((e6q) this.a).e.getValue();
                    keySet = ljaVar3.b.keySet();
                    um4 um4Var = new um4(pgp.a);
                    um4Var.i(hrg.q("artist_track.track_id IN (", CollectionsKt.X(keySet, StringUtils.COMMA, null, null, new sm4(23), 30), ")"), xz0.X(new Object[0]));
                    um4Var.g("track_type", gys.MyMusicWithKids.a);
                    um4Var.c("track_for_kids", false);
                    atn atnVar2 = new atn(hlr.e("|SELECT * FROM artist_mview\n                           |JOIN (\n                           |   SELECT\n                           |      DISTINCT(artist_track.artist_id) as downloaded_artist_id,\n                           |      track_id,\n                           |      track_type,\n                           |      track_for_kids\n                           |   FROM artist_track\n                           |   JOIN track_mview ON track_mview.original_id = artist_track.track_id\n                           |   WHERE " + um4Var.l() + "\n                           |) as downloaded_artists\n                           |ON downloaded_artists.downloaded_artist_id = artist_mview.original_id"), um4Var.j());
                    String str = this.e.c().a;
                    str.getClass();
                    xw4Var.j = num;
                    xw4Var.k = ljaVar3;
                    xw4Var.l = keySet;
                    xw4Var.m = atnVar2;
                    xw4Var.p = 1;
                    Object b = this.d.b(str, xw4Var);
                    if (b != nm6Var) {
                        ljaVar = ljaVar3;
                        obj = b;
                        num2 = num;
                        atnVar = atnVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = xw4Var.l;
                    ljaVar2 = xw4Var.k;
                    num3 = xw4Var.j;
                    qgg.h0(obj);
                    List<de1> list = (List) obj;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    for (de1 de1Var : list) {
                        arrayList.add(new Pair(de1Var.a, tt0.M(de1Var.b)));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str2 = (String) pair.a;
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str2, obj2);
                        }
                        ((List) obj2).add((c01) pair.b);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : set) {
                        List list2 = (List) linkedHashMap.get(str3);
                        if (list2 != null) {
                            List<c01> list3 = list2;
                            r6 = new ArrayList(v75.o(list3, 10));
                            for (c01 c01Var : list3) {
                                nq3 nq3Var = (nq3) ljaVar2.b.get(str3);
                                r6.add(new pda(c01Var, nq3Var != null ? nq3Var.b : 0L));
                            }
                        } else {
                            r6 = c5b.a;
                        }
                        z75.t(arrayList2, (Iterable) r6);
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(((pda) next).a.a)) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        c01 c01Var2 = ((pda) next2).a;
                        c01Var2.getClass();
                        if (xv7.C(c01Var2.a)) {
                            arrayList4.add(next2);
                        }
                    }
                    return num3 == null ? CollectionsKt.q0(arrayList4, num3.intValue()) : arrayList4;
                }
                atnVar = xw4Var.m;
                keySet = xw4Var.l;
                ljaVar = xw4Var.k;
                num2 = xw4Var.j;
                qgg.h0(obj);
                ce1 z = ((MainDatabase) obj).z();
                xw4Var.j = num2;
                xw4Var.k = ljaVar;
                xw4Var.l = keySet;
                xw4Var.m = null;
                xw4Var.p = 2;
                obj = z.b(atnVar, xw4Var);
                if (obj != nm6Var) {
                    set = keySet;
                    ljaVar2 = ljaVar;
                    num3 = num2;
                    List<de1> list4 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(v75.o(list4, 10));
                    while (r15.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    it = arrayList5.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    while (r14.hasNext()) {
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList32 = new ArrayList();
                    it2 = arrayList22.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    it3 = arrayList32.iterator();
                    while (it3.hasNext()) {
                    }
                    if (num3 == null) {
                    }
                }
                return nm6Var;
            }
        }
        xw4Var = new xw4(this, cg6Var);
        obj = xw4Var.n;
        nm6Var = nm6.a;
        i = xw4Var.p;
        if (i != 0) {
        }
        ce1 z2 = ((MainDatabase) obj).z();
        xw4Var.j = num2;
        xw4Var.k = ljaVar;
        xw4Var.l = keySet;
        xw4Var.m = null;
        xw4Var.p = 2;
        obj = z2.b(atnVar, xw4Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public final pjc c(Integer num) {
        return y(new pjc[]{this.b.e}, new vw4(this, num, null, 2));
    }

    public final Serializable d(Integer num, cg6 cg6Var) {
        Boolean bool = Boolean.TRUE;
        List list = dw.MyMusicBooks.a;
        return m(this, vz1.k(list, list), Boolean.FALSE, num, bool, cg6Var, 16);
    }

    public final pjc e(Integer num) {
        return y(new pjc[]{((e6q) this.a).e}, new vw4(this, num, null, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        zw4 zw4Var;
        int i;
        Set keySet;
        if (cg6Var instanceof zw4) {
            zw4Var = (zw4) cg6Var;
            int i2 = zw4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zw4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = zw4Var.k;
                nm6 nm6Var = nm6.a;
                i = zw4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    keySet = ((lja) ((e6q) this.a).e.getValue()).b.keySet();
                    String str = this.e.c().a;
                    str.getClass();
                    zw4Var.j = keySet;
                    zw4Var.m = 1;
                    obj = this.d.b(str, zw4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set = zw4Var.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    keySet = zw4Var.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                yw4 yw4Var = new yw4(mainDatabase, (Continuation) null, keySet, 0);
                zw4Var.j = null;
                zw4Var.m = 2;
                Object N = tyf.N(mainDatabase, yw4Var, zw4Var);
                return N != nm6Var ? nm6Var : N;
            }
        }
        zw4Var = new zw4(this, cg6Var);
        Object obj2 = zw4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = zw4Var.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        yw4 yw4Var2 = new yw4(mainDatabase2, (Continuation) null, keySet, 0);
        zw4Var.j = null;
        zw4Var.m = 2;
        Object N2 = tyf.N(mainDatabase2, yw4Var2, zw4Var);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        if (r13 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        ax4 ax4Var;
        int i;
        int i2;
        int i3;
        atn atnVar;
        if (cg6Var instanceof ax4) {
            ax4Var = (ax4) cg6Var;
            int i4 = ax4Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ax4Var.o = i4 - Integer.MIN_VALUE;
                Object obj = ax4Var.m;
                nm6 nm6Var = nm6.a;
                i = ax4Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    Set keySet = ((lja) ((e6q) this.a).e.getValue()).b.keySet();
                    um4 um4Var = new um4(pgp.a);
                    um4Var.i(hrg.q("artist_track.track_id IN (", CollectionsKt.X(keySet, StringUtils.COMMA, null, null, new sm4(24), 30), ")"), xz0.X(new Object[0]));
                    um4Var.g("track_type", gys.MyMusicWithKids.a);
                    um4Var.c("track_for_kids", false);
                    um4Var.f("artist_track.artist_id", CommonUrlParts.Values.FALSE_INTEGER);
                    atn atnVar2 = new atn(hlr.e("\n            SELECT\n                COUNT(DISTINCT artist_track.artist_id) as downloaded_artists_count\n            FROM artist_track JOIN track_mview ON track_mview.original_id = artist_track.track_id\n            WHERE " + um4Var.l() + "\n        "), um4Var.j());
                    String str = this.e.c().a;
                    str.getClass();
                    ax4Var.j = atnVar2;
                    ax4Var.k = 0;
                    ax4Var.l = 0;
                    ax4Var.o = 1;
                    obj = this.d.b(str, ax4Var);
                    if (obj != nm6Var) {
                        i2 = 0;
                        i3 = 0;
                        atnVar = atnVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return new Integer(((Number) obj).intValue());
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = ax4Var.l;
                i3 = ax4Var.k;
                atnVar = ax4Var.j;
                qgg.h0(obj);
                hjn P = ((MainDatabase) obj).P();
                ax4Var.j = null;
                ax4Var.k = i3;
                ax4Var.l = i2;
                ax4Var.o = 2;
                obj = P.a(atnVar, ax4Var);
            }
        }
        ax4Var = new ax4(this, cg6Var);
        Object obj2 = ax4Var.m;
        nm6 nm6Var2 = nm6.a;
        i = ax4Var.o;
        if (i != 0) {
        }
        hjn P2 = ((MainDatabase) obj2).P();
        ax4Var.j = null;
        ax4Var.k = i3;
        ax4Var.l = i2;
        ax4Var.o = 2;
        obj2 = P2.a(atnVar, ax4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r13 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r13 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(Set set, cg6 cg6Var) {
        bx4 bx4Var;
        int i;
        int i2;
        int i3;
        int i4;
        if (cg6Var instanceof bx4) {
            bx4Var = (bx4) cg6Var;
            int i5 = bx4Var.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bx4Var.o = i5 - Integer.MIN_VALUE;
                Object obj = bx4Var.m;
                nm6 nm6Var = nm6.a;
                i = bx4Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.e.c().a;
                    str.getClass();
                    int size = set.size();
                    i2 = 0;
                    i5h i5hVar = this.d;
                    if (size > 950) {
                        bx4Var.j = set;
                        bx4Var.k = 0;
                        bx4Var.l = 0;
                        bx4Var.o = 1;
                        obj = i5hVar.b(str, bx4Var);
                        if (obj != nm6Var) {
                            i4 = 0;
                            ueo ueoVar = (ueo) obj;
                            ct ctVar = new ct(ueoVar, null, set);
                            bx4Var.j = null;
                            bx4Var.k = i4;
                            bx4Var.l = i2;
                            bx4Var.o = 2;
                            obj = tyf.N(ueoVar, ctVar, bx4Var);
                        }
                    } else {
                        bx4Var.j = set;
                        bx4Var.k = 0;
                        bx4Var.l = 0;
                        bx4Var.o = 3;
                        obj = i5hVar.b(str, bx4Var);
                        if (obj != nm6Var) {
                            i3 = 0;
                            bx4Var.j = null;
                            bx4Var.k = i3;
                            bx4Var.l = i2;
                            bx4Var.o = 4;
                            obj = ((MainDatabase) obj).x().b(set, bx4Var);
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    int i6 = bx4Var.l;
                    i4 = bx4Var.k;
                    Set set2 = bx4Var.j;
                    qgg.h0(obj);
                    i2 = i6;
                    set = set2;
                    ueo ueoVar2 = (ueo) obj;
                    ct ctVar2 = new ct(ueoVar2, null, set);
                    bx4Var.j = null;
                    bx4Var.k = i4;
                    bx4Var.l = i2;
                    bx4Var.o = 2;
                    obj = tyf.N(ueoVar2, ctVar2, bx4Var);
                } else {
                    if (i == 2) {
                        Set set3 = bx4Var.j;
                        qgg.h0(obj);
                        return (HashSet) obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set4 = bx4Var.j;
                        qgg.h0(obj);
                        HashSet hashSet = new HashSet();
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            hashSet.add(((l10) it.next()).a);
                        }
                        return hashSet;
                    }
                    int i7 = bx4Var.l;
                    i3 = bx4Var.k;
                    Set set5 = bx4Var.j;
                    qgg.h0(obj);
                    i2 = i7;
                    set = set5;
                    bx4Var.j = null;
                    bx4Var.k = i3;
                    bx4Var.l = i2;
                    bx4Var.o = 4;
                    obj = ((MainDatabase) obj).x().b(set, bx4Var);
                }
            }
        }
        bx4Var = new bx4(this, cg6Var);
        Object obj2 = bx4Var.m;
        nm6 nm6Var2 = nm6.a;
        i = bx4Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(uhn uhnVar, cg6 cg6Var) {
        dx4 dx4Var;
        int i;
        if (cg6Var instanceof dx4) {
            dx4Var = (dx4) cg6Var;
            int i2 = dx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = dx4Var.k;
                nm6 nm6Var = nm6.a;
                i = dx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.e.c().a;
                    str.getClass();
                    dx4Var.j = uhnVar;
                    dx4Var.m = 1;
                    obj = this.d.b(str, dx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<l10> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (l10 l10Var : iterable) {
                            arrayList.add(new tw4(l10Var.a, l10Var.c));
                        }
                        return CollectionsKt.A0(arrayList);
                    }
                    uhnVar = dx4Var.j;
                    qgg.h0(obj);
                }
                j20 x = ((MainDatabase) obj).x();
                ysr ysrVar = new ysr("album_track");
                ysrVar.b = true;
                um4 um4Var = new um4(pgp.c);
                um4Var.h("album_id", uhnVar);
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                dx4Var.j = null;
                dx4Var.m = 2;
                x.getClass();
                TreeMap treeMap = afo.h;
                j6e a2 = wyf.x(a).a();
                obj = up6.G(x.a, true, false, new g20((String) a2.a, a2, x, 0), dx4Var);
            }
        }
        dx4Var = new dx4(this, cg6Var);
        Object obj2 = dx4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = dx4Var.m;
        if (i != 0) {
        }
        j20 x2 = ((MainDatabase) obj2).x();
        ysr ysrVar2 = new ysr("album_track");
        ysrVar2.b = true;
        um4 um4Var2 = new um4(pgp.c);
        um4Var2.h("album_id", uhnVar);
        tt0.K(ysrVar2, um4Var2);
        atn a3 = ysrVar2.a();
        dx4Var.j = null;
        dx4Var.m = 2;
        x2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a22 = wyf.x(a3).a();
        obj2 = up6.G(x2.a, true, false, new g20((String) a22.a, a22, x2, 0), dx4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[LOOP:1: B:21:0x0080->B:23:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Set set, cg6 cg6Var) {
        cx4 cx4Var;
        int i;
        if (cg6Var instanceof cx4) {
            cx4Var = (cx4) cg6Var;
            int i2 = cx4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cx4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = cx4Var.j;
                Object obj2 = nm6.a;
                i = cx4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Set set2 = set;
                    uhn k = vz1.k(set2, set2);
                    cx4Var.l = 1;
                    obj = i(k, cx4Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (tw4 tw4Var : (Iterable) obj) {
                    String str = tw4Var.a;
                    String str2 = tw4Var.b;
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        obj3 = new HashSet();
                        linkedHashMap.put(str, obj3);
                    }
                    ((Set) obj3).add(str2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new qw4((String) entry.getKey(), (Set) entry.getValue()));
                }
                return CollectionsKt.A0(arrayList);
            }
        }
        cx4Var = new cx4(this, cg6Var);
        Object obj4 = cx4Var.j;
        Object obj22 = nm6.a;
        i = cx4Var.l;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r6.hasNext()) {
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        while (r5.hasNext()) {
        }
        return CollectionsKt.A0(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r2 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(uhn uhnVar, Boolean bool, Integer num, cg6 cg6Var) {
        fx4 fx4Var;
        nm6 nm6Var;
        int i;
        Map map;
        Object b;
        Object b2;
        Map map2;
        Integer num2;
        if (cg6Var instanceof fx4) {
            fx4Var = (fx4) cg6Var;
            int i2 = fx4Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fx4Var.p = i2 - Integer.MIN_VALUE;
                Object obj = fx4Var.n;
                nm6Var = nm6.a;
                i = fx4Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    map = ((yca) this.b.e.getValue()).a;
                    String str = this.e.c().a;
                    str.getClass();
                    fx4Var.j = uhnVar;
                    fx4Var.k = bool;
                    fx4Var.l = num;
                    fx4Var.m = map;
                    fx4Var.p = 1;
                    b = this.d.b(str, fx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map2 = fx4Var.m;
                        num2 = fx4Var.l;
                        qgg.h0(obj);
                        List o0 = CollectionsKt.o0((List) obj, new ex4(0, map2));
                        if (num2 != null) {
                            o0 = CollectionsKt.q0(o0, num2.intValue());
                        }
                        List<zv> list = o0;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (zv zvVar : list) {
                            oq X = h4a.X(zvVar);
                            Long l = (Long) map2.get(zvVar.c);
                            arrayList.add(new kca(X, l != null ? l.longValue() : 0L));
                        }
                        return arrayList;
                    }
                    Map map3 = fx4Var.m;
                    num = fx4Var.l;
                    bool = fx4Var.k;
                    uhn uhnVar2 = fx4Var.j;
                    qgg.h0(obj);
                    map = map3;
                    uhnVar = uhnVar2;
                    b = obj;
                }
                cw w = ((MainDatabase) b).w();
                ysr ysrVar = new ysr("album_mview");
                um4 um4Var = new um4(pgp.a);
                if (uhnVar != null) {
                    um4Var.h("album_type", uhnVar);
                }
                if (bool != null) {
                    um4Var.c("album_for_kids", bool.booleanValue());
                }
                um4Var.e("original_id", map.keySet());
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                fx4Var.j = null;
                fx4Var.k = null;
                fx4Var.l = num;
                fx4Var.m = map;
                fx4Var.p = 2;
                b2 = w.b(a, fx4Var);
                if (b2 != nm6Var) {
                    Map map4 = map;
                    obj = b2;
                    map2 = map4;
                    num2 = num;
                    List o02 = CollectionsKt.o0((List) obj, new ex4(0, map2));
                    if (num2 != null) {
                    }
                    List<zv> list2 = o02;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    while (r11.hasNext()) {
                    }
                    return arrayList2;
                }
                return nm6Var;
            }
        }
        fx4Var = new fx4(this, cg6Var);
        Object obj2 = fx4Var.n;
        nm6Var = nm6.a;
        i = fx4Var.p;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) b).w();
        ysr ysrVar2 = new ysr("album_mview");
        um4 um4Var2 = new um4(pgp.a);
        if (uhnVar != null) {
        }
        if (bool != null) {
        }
        um4Var2.e("original_id", map.keySet());
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        fx4Var.j = null;
        fx4Var.k = null;
        fx4Var.l = num;
        fx4Var.m = map;
        fx4Var.p = 2;
        b2 = w2.b(a2, fx4Var);
        if (b2 != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable l(vhn vhnVar, Boolean bool, Integer num, Boolean bool2, boolean z, cg6 cg6Var) {
        hx4 hx4Var;
        Object obj;
        nm6 nm6Var;
        int i;
        LinkedHashMap linkedHashMap;
        Map map;
        Boolean bool3;
        Set set;
        Integer num2;
        Map map2;
        boolean z2;
        vhn vhnVar2;
        Integer num3;
        Map map3;
        Map map4;
        css cssVar;
        if (cg6Var instanceof hx4) {
            hx4Var = (hx4) cg6Var;
            int i2 = hx4Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hx4Var.s = i2 - Integer.MIN_VALUE;
                obj = hx4Var.q;
                nm6Var = nm6.a;
                i = hx4Var.s;
                if (i != 0) {
                    qgg.h0(obj);
                    Map map5 = ((lja) ((e6q) this.a).e.getValue()).b;
                    linkedHashMap = new LinkedHashMap(tah.a(map5.size()));
                    for (Map.Entry entry : map5.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new Long(((nq3) entry.getValue()).b));
                    }
                    if (bool2 != null) {
                        map = new LinkedHashMap();
                        for (Map.Entry entry2 : map5.entrySet()) {
                            if (Boolean.valueOf(((nq3) entry2.getValue()).c.a()).equals(bool2)) {
                                map.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                    } else {
                        map = map5;
                    }
                    Set keySet = map.keySet();
                    String str = this.e.c().a;
                    str.getClass();
                    hx4Var.j = vhnVar;
                    bool3 = bool;
                    hx4Var.k = bool3;
                    hx4Var.l = num;
                    hx4Var.m = map5;
                    hx4Var.n = linkedHashMap;
                    hx4Var.o = keySet;
                    hx4Var.p = z;
                    hx4Var.s = 1;
                    Object b = this.d.b(str, hx4Var);
                    if (b != nm6Var) {
                        set = keySet;
                        num2 = num;
                        map2 = map5;
                        obj = b;
                        z2 = z;
                        vhnVar2 = vhnVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set2 = hx4Var.o;
                    map3 = hx4Var.n;
                    map4 = hx4Var.m;
                    num3 = hx4Var.l;
                    qgg.h0(obj);
                    List o0 = CollectionsKt.o0((List) obj, new ex4(1, map3));
                    if (num3 != null) {
                        o0 = CollectionsKt.q0(o0, num3.intValue());
                    }
                    List<rxs> list = o0;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    for (rxs rxsVar : list) {
                        mqs M = ngg.M(rxsVar);
                        String str2 = rxsVar.a.a;
                        Long l = (Long) map3.get(str2);
                        long longValue = l != null ? l.longValue() : 0L;
                        nq3 nq3Var = (nq3) map4.get(str2);
                        arrayList.add(new jja(M, longValue, (nq3Var == null || (cssVar = nq3Var.c) == null) ? hja.a : dag.E(cssVar)));
                    }
                    return arrayList;
                }
                boolean z3 = hx4Var.p;
                Set set3 = hx4Var.o;
                Map map6 = hx4Var.n;
                Map map7 = hx4Var.m;
                Integer num4 = hx4Var.l;
                bool3 = hx4Var.k;
                vhn vhnVar3 = hx4Var.j;
                qgg.h0(obj);
                z2 = z3;
                num2 = num4;
                vhnVar2 = vhnVar3;
                set = set3;
                linkedHashMap = map6;
                map2 = map7;
                MainDatabase mainDatabase = (MainDatabase) obj;
                gx4 gx4Var = new gx4(mainDatabase, null, set, vhnVar2, bool3, z2, 0);
                hx4Var.j = null;
                hx4Var.k = null;
                hx4Var.l = num2;
                hx4Var.m = map2;
                hx4Var.n = linkedHashMap;
                hx4Var.o = null;
                hx4Var.p = z2;
                hx4Var.s = 2;
                obj = tyf.N(mainDatabase, gx4Var, hx4Var);
                if (obj != nm6Var) {
                    num3 = num2;
                    map3 = linkedHashMap;
                    map4 = map2;
                    List o02 = CollectionsKt.o0((List) obj, new ex4(1, map3));
                    if (num3 != null) {
                    }
                    List<rxs> list2 = o02;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    while (r2.hasNext()) {
                    }
                    return arrayList2;
                }
                return nm6Var;
            }
        }
        hx4Var = new hx4(this, cg6Var);
        obj = hx4Var.q;
        nm6Var = nm6.a;
        i = hx4Var.s;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj;
        gx4 gx4Var2 = new gx4(mainDatabase2, null, set, vhnVar2, bool3, z2, 0);
        hx4Var.j = null;
        hx4Var.k = null;
        hx4Var.l = num2;
        hx4Var.m = map2;
        hx4Var.n = linkedHashMap;
        hx4Var.o = null;
        hx4Var.p = z2;
        hx4Var.s = 2;
        obj = tyf.N(mainDatabase2, gx4Var2, hx4Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable n(uhn uhnVar, boolean z, cg6 cg6Var) {
        ix4 ix4Var;
        int i;
        if (cg6Var instanceof ix4) {
            ix4Var = (ix4) cg6Var;
            int i2 = ix4Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ix4Var.n = i2 - Integer.MIN_VALUE;
                Object obj = ix4Var.l;
                nm6 nm6Var = nm6.a;
                i = ix4Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.e.c().a;
                    str.getClass();
                    ix4Var.j = uhnVar;
                    ix4Var.k = z;
                    ix4Var.n = 1;
                    obj = this.d.b(str, ix4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        HashSet hashSet = new HashSet();
                        for (ytl ytlVar : (List) obj) {
                            hashSet.add(new twl(ytlVar.a, new rw4(new uga(ytlVar.d, ytlVar.e, ytlVar.f), ytlVar.c)));
                        }
                        return hashSet;
                    }
                    z = ix4Var.k;
                    uhnVar = ix4Var.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                ysr ysrVar = new ysr("playlist");
                um4 um4Var = new um4(pgp.a);
                um4Var.h("_id", uhnVar);
                if (z) {
                    um4Var.g("sync", xz0.Y(new String[]{String.valueOf(4), String.valueOf(2)}));
                }
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                ix4Var.j = null;
                ix4Var.k = z;
                ix4Var.n = 2;
                I.getClass();
                TreeMap treeMap = afo.h;
                j6e a2 = wyf.x(a).a();
                obj = up6.G(I.a, true, false, new g20((String) a2.a, a2, I, 10), ix4Var);
            }
        }
        ix4Var = new ix4(this, cg6Var);
        Object obj2 = ix4Var.l;
        nm6 nm6Var2 = nm6.a;
        i = ix4Var.n;
        if (i != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        ysr ysrVar2 = new ysr("playlist");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.h("_id", uhnVar);
        if (z) {
        }
        tt0.K(ysrVar2, um4Var2);
        atn a3 = ysrVar2.a();
        ix4Var.j = null;
        ix4Var.k = z;
        ix4Var.n = 2;
        I2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a22 = wyf.x(a3).a();
        obj2 = up6.G(I2.a, true, false, new g20((String) a22.a, a22, I2, 10), ix4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Set set, cg6 cg6Var) {
        jx4 jx4Var;
        int i;
        if (cg6Var instanceof jx4) {
            jx4Var = (jx4) cg6Var;
            int i2 = jx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = jx4Var.k;
                nm6 nm6Var = nm6.a;
                i = jx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.e.c().a;
                    str.getClass();
                    jx4Var.j = set;
                    jx4Var.m = 1;
                    obj = this.d.b(str, jx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = jx4Var.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    set = jx4Var.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                ct ctVar = new ct(mainDatabase, (Continuation) null, set, 3);
                jx4Var.j = null;
                jx4Var.m = 2;
                Object N = tyf.N(mainDatabase, ctVar, jx4Var);
                return N != nm6Var ? nm6Var : N;
            }
        }
        jx4Var = new jx4(this, cg6Var);
        Object obj2 = jx4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = jx4Var.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        ct ctVar2 = new ct(mainDatabase2, (Continuation) null, set, 3);
        jx4Var.j = null;
        jx4Var.m = 2;
        Object N2 = tyf.N(mainDatabase2, ctVar2, jx4Var);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0073, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096 A[LOOP:2: B:44:0x0090->B:46:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc A[LOOP:3: B:49:0x00b6->B:51:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable p(Set set, boolean z, cg6 cg6Var) {
        kx4 kx4Var;
        Object obj;
        nm6 nm6Var;
        int i;
        int a;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (cg6Var instanceof kx4) {
            kx4Var = (kx4) cg6Var;
            int i2 = kx4Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kx4Var.n = i2 - Integer.MIN_VALUE;
                obj = kx4Var.l;
                nm6Var = nm6.a;
                i = kx4Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(v75.o(set2, 10));
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
                    }
                    uhn uhnVar = new uhn(arrayList);
                    kx4Var.k = z;
                    kx4Var.n = 1;
                    obj = n(uhnVar, z, kx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        linkedHashMap = kx4Var.j;
                        qgg.h0(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (uw4 uw4Var : (Iterable) obj) {
                            long j = uw4Var.a;
                            String str = uw4Var.b;
                            Long l = new Long(j);
                            Object obj2 = linkedHashMap2.get(l);
                            if (obj2 == null) {
                                obj2 = new HashSet();
                                linkedHashMap2.put(l, obj2);
                            }
                            ((Set) obj2).add(str);
                        }
                        HashSet hashSet = new HashSet();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            long longValue = ((Number) entry.getKey()).longValue();
                            Set set3 = (Set) entry.getValue();
                            rw4 rw4Var = (rw4) linkedHashMap.get(new Long(longValue));
                            sw4 sw4Var = rw4Var != null ? new sw4(rw4Var, set3) : null;
                            if (sw4Var != null) {
                                hashSet.add(sw4Var);
                            }
                        }
                        return hashSet;
                    }
                    z = kx4Var.k;
                    qgg.h0(obj);
                }
                Set<twl> set4 = (Set) obj;
                a = tah.a(v75.o(set4, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(a);
                for (twl twlVar : set4) {
                    linkedHashMap3.put(new Long(twlVar.a), twlVar.b);
                }
                ArrayList arrayList2 = new ArrayList(v75.o(set4, 10));
                it = set4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((twl) it.next()).a));
                }
                uhn uhnVar2 = new uhn(arrayList2);
                kx4Var.j = linkedHashMap3;
                kx4Var.k = z;
                kx4Var.n = 2;
                obj = q(uhnVar2, false, kx4Var);
                if (obj != nm6Var) {
                    linkedHashMap = linkedHashMap3;
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    while (r12.hasNext()) {
                    }
                    HashSet hashSet2 = new HashSet();
                    while (r11.hasNext()) {
                    }
                    return hashSet2;
                }
                return nm6Var;
            }
        }
        kx4Var = new kx4(this, cg6Var);
        obj = kx4Var.l;
        nm6Var = nm6.a;
        i = kx4Var.n;
        if (i != 0) {
        }
        Set<twl> set42 = (Set) obj;
        a = tah.a(v75.o(set42, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap(a);
        while (r10.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(v75.o(set42, 10));
        it = set42.iterator();
        while (it.hasNext()) {
        }
        uhn uhnVar22 = new uhn(arrayList22);
        kx4Var.j = linkedHashMap32;
        kx4Var.k = z;
        kx4Var.n = 2;
        obj = q(uhnVar22, false, kx4Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r13 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable q(uhn uhnVar, boolean z, cg6 cg6Var) {
        mx4 mx4Var;
        int i;
        uhn uhnVar2;
        Set set;
        if (cg6Var instanceof mx4) {
            mx4Var = (mx4) cg6Var;
            int i2 = mx4Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mx4Var.o = i2 - Integer.MIN_VALUE;
                Object obj = mx4Var.m;
                nm6 nm6Var = nm6.a;
                i = mx4Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    Set keySet = ((lja) ((e6q) this.a).e.getValue()).b.keySet();
                    String str = this.e.c().a;
                    str.getClass();
                    mx4Var.j = uhnVar;
                    mx4Var.k = keySet;
                    mx4Var.l = z;
                    mx4Var.o = 1;
                    Object b = this.d.b(str, mx4Var);
                    if (b != nm6Var) {
                        uhnVar2 = uhnVar;
                        set = keySet;
                        obj = b;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set2 = mx4Var.k;
                    qgg.h0(obj);
                    HashSet hashSet = new HashSet();
                    for (j2m j2mVar : (List) obj) {
                        hashSet.add(new uw4(j2mVar.b, j2mVar.c));
                    }
                    return hashSet;
                }
                z = mx4Var.l;
                Set set3 = mx4Var.k;
                uhn uhnVar3 = mx4Var.j;
                qgg.h0(obj);
                set = set3;
                uhnVar2 = uhnVar3;
                boolean z2 = z;
                MainDatabase mainDatabase = (MainDatabase) obj;
                lx4 lx4Var = new lx4(mainDatabase, (Continuation) null, z2, set, uhnVar2);
                mx4Var.j = null;
                mx4Var.k = null;
                mx4Var.l = z2;
                mx4Var.o = 2;
                obj = tyf.N(mainDatabase, lx4Var, mx4Var);
            }
        }
        mx4Var = new mx4(this, cg6Var);
        Object obj2 = mx4Var.m;
        nm6 nm6Var2 = nm6.a;
        i = mx4Var.o;
        if (i != 0) {
        }
        boolean z22 = z;
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        lx4 lx4Var2 = new lx4(mainDatabase2, (Continuation) null, z22, set, uhnVar2);
        mx4Var.j = null;
        mx4Var.k = null;
        mx4Var.l = z22;
        mx4Var.o = 2;
        obj2 = tyf.N(mainDatabase2, lx4Var2, mx4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r(Collection collection, cg6 cg6Var) {
        nx4 nx4Var;
        int i;
        if (cg6Var instanceof nx4) {
            nx4Var = (nx4) cg6Var;
            int i2 = nx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = nx4Var.k;
                nm6 nm6Var = nm6.a;
                i = nx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.e.c().a;
                    str.getClass();
                    nx4Var.j = collection;
                    nx4Var.m = 1;
                    obj = this.d.b(str, nx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = nx4Var.j;
                        qgg.h0(obj);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (List) obj) {
                            ig5 ig5Var = ((rxs) obj2).a;
                            if (hashSet.add(new vat(ig5Var.a, ig5Var.n, Boolean.valueOf(ig5Var.z)))) {
                                arrayList.add(obj2);
                            }
                        }
                        int a = tah.a(v75.o(arrayList, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ig5 ig5Var2 = ((rxs) it.next()).a;
                            String str2 = ig5Var2.a;
                            l3l l3lVar = v1t.a;
                            String str3 = ig5Var2.n;
                            boolean z = ig5Var2.z;
                            l3lVar.getClass();
                            linkedHashMap.put(str2, l3l.c(str3, z));
                        }
                        return linkedHashMap;
                    }
                    collection = nx4Var.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                um4 um4Var = new um4(pgp.c);
                um4Var.e("original_id", collection);
                tt0.K(ysrVar, um4Var);
                atn a2 = ysrVar.a();
                nx4Var.j = null;
                nx4Var.m = 2;
                obj = Q.b(a2, nx4Var);
            }
        }
        nx4Var = new nx4(this, cg6Var);
        Object obj3 = nx4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = nx4Var.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj3).Q();
        ysr ysrVar2 = new ysr("track_mview");
        um4 um4Var2 = new um4(pgp.c);
        um4Var2.e("original_id", collection);
        tt0.K(ysrVar2, um4Var2);
        atn a22 = ysrVar2.a();
        nx4Var.j = null;
        nx4Var.m = 2;
        obj3 = Q2.b(a22, nx4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Set set, cg6 cg6Var) {
        ox4 ox4Var;
        int i;
        if (cg6Var instanceof ox4) {
            ox4Var = (ox4) cg6Var;
            int i2 = ox4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ox4Var.j;
                Object obj2 = nm6.a;
                i = ox4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ox4Var.l = 1;
                    obj = h(set, ox4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ox4Var.l = 2;
                Object j = j((Set) obj, ox4Var);
                return j != obj2 ? obj2 : j;
            }
        }
        ox4Var = new ox4(this, cg6Var);
        Object obj3 = ox4Var.j;
        Object obj22 = nm6.a;
        i = ox4Var.l;
        if (i != 0) {
        }
        ox4Var.l = 2;
        Object j2 = j((Set) obj3, ox4Var);
        if (j2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable t(long j, boolean z, cg6 cg6Var) {
        px4 px4Var;
        int i;
        Iterator it;
        if (cg6Var instanceof px4) {
            px4Var = (px4) cg6Var;
            int i2 = px4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                px4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = px4Var.j;
                nm6 nm6Var = nm6.a;
                i = px4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Set b = uop.b(String.valueOf(j));
                    uhn k = vz1.k(b, b);
                    px4Var.l = 1;
                    obj = q(k, z, px4Var);
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
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((uw4) it.next()).b);
                }
                return linkedHashSet;
            }
        }
        px4Var = new px4(this, cg6Var);
        Object obj2 = px4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = px4Var.l;
        if (i != 0) {
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        it = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
        }
        return linkedHashSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0042, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[LOOP:1: B:22:0x0058->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable u(Set set, boolean z, cg6 cg6Var) {
        qx4 qx4Var;
        int i;
        Iterator it;
        if (cg6Var instanceof qx4) {
            qx4Var = (qx4) cg6Var;
            int i2 = qx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = qx4Var.k;
                nm6 nm6Var = nm6.a;
                i = qx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    qx4Var.j = z;
                    qx4Var.m = 1;
                    obj = o(set, qx4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        HashSet hashSet = new HashSet();
                        Iterator it2 = ((Set) obj).iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((twl) it2.next()).b);
                        }
                        return hashSet;
                    }
                    z = qx4Var.j;
                    qgg.h0(obj);
                }
                Set set2 = (Set) obj;
                ArrayList arrayList = new ArrayList(v75.o(set2, 10));
                it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                }
                uhn uhnVar = new uhn(arrayList);
                qx4Var.j = z;
                qx4Var.m = 2;
                obj = n(uhnVar, z, qx4Var);
            }
        }
        qx4Var = new qx4(this, cg6Var);
        Object obj2 = qx4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = qx4Var.m;
        if (i != 0) {
        }
        Set set22 = (Set) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(set22, 10));
        it = set22.iterator();
        while (it.hasNext()) {
        }
        uhn uhnVar2 = new uhn(arrayList2);
        qx4Var.j = z;
        qx4Var.m = 2;
        obj2 = n(uhnVar2, z, qx4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Set set, boolean z, cg6 cg6Var) {
        rx4 rx4Var;
        int i;
        if (cg6Var instanceof rx4) {
            rx4Var = (rx4) cg6Var;
            int i2 = rx4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rx4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = rx4Var.k;
                Object obj2 = nm6.a;
                i = rx4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    rx4Var.j = z;
                    rx4Var.m = 1;
                    obj = o(set, rx4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = rx4Var.j;
                    qgg.h0(obj);
                }
                rx4Var.j = z;
                rx4Var.m = 2;
                Object p = p((Set) obj, z, rx4Var);
                return p != obj2 ? obj2 : p;
            }
        }
        rx4Var = new rx4(this, cg6Var);
        Object obj3 = rx4Var.k;
        Object obj22 = nm6.a;
        i = rx4Var.m;
        if (i != 0) {
        }
        rx4Var.j = z;
        rx4Var.m = 2;
        Object p2 = p((Set) obj3, z, rx4Var);
        if (p2 != obj22) {
        }
    }

    public final pjc w(Integer num) {
        return y(new pjc[]{this.b.e}, new vw4(this, num, null, 4));
    }

    public final pjc x(Integer num) {
        return y(new pjc[]{((e6q) this.a).e}, new vw4(this, num, null, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[LOOP:1: B:39:0x0118->B:41:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable z(String str, String str2, Boolean bool, Integer num, cg6 cg6Var) {
        ux4 ux4Var;
        Object obj;
        nm6 nm6Var;
        int i;
        Map linkedHashMap;
        String str3;
        String str4;
        Boolean bool2;
        Integer num2;
        Iterator it;
        Map map;
        Integer num3;
        if (cg6Var instanceof ux4) {
            ux4Var = (ux4) cg6Var;
            int i2 = ux4Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ux4Var.q = i2 - Integer.MIN_VALUE;
                obj = ux4Var.o;
                nm6Var = nm6.a;
                i = ux4Var.q;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    Map map2 = ((vga) this.c.e.getValue()).a;
                    linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        ega egaVar = (ega) entry.getKey();
                        linkedHashMap.put(ouj.o(egaVar.a.a, StringUtils.PROCESS_POSTFIX_DELIMITER, egaVar.b), entry.getValue());
                    }
                    String str5 = this.e.c().a;
                    str5.getClass();
                    str3 = str;
                    ux4Var.j = str3;
                    str4 = str2;
                    ux4Var.k = str4;
                    bool2 = bool;
                    ux4Var.l = bool2;
                    num2 = num;
                    ux4Var.m = num2;
                    ux4Var.n = linkedHashMap;
                    ux4Var.q = 1;
                    obj = this.d.b(str5, ux4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = ux4Var.n;
                        num3 = ux4Var.m;
                        qgg.h0(obj);
                        List o0 = CollectionsKt.o0((List) obj, new ex4(i3, map));
                        if (num3 != null) {
                            o0 = CollectionsKt.q0(o0, num3.intValue());
                        }
                        List<qwl> list = o0;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (qwl qwlVar : list) {
                            String o = ouj.o(qwlVar.c, StringUtils.PROCESS_POSTFIX_DELIMITER, qwlVar.b);
                            cvl W = ezf.W(qwlVar);
                            Long l = (Long) map.get(o);
                            arrayList.add(new gga(W, l != null ? l.longValue() : 0L));
                        }
                        return arrayList;
                    }
                    linkedHashMap = ux4Var.n;
                    Integer num4 = ux4Var.m;
                    Boolean bool3 = ux4Var.l;
                    String str6 = ux4Var.k;
                    String str7 = ux4Var.j;
                    qgg.h0(obj);
                    num2 = num4;
                    str3 = str7;
                    bool2 = bool3;
                    str4 = str6;
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                if (bool2 != null) {
                    um4Var.c("playlist_for_kids", bool2.booleanValue());
                }
                if (str3 != null) {
                    um4Var.b("uid", str3);
                }
                if (str4 != null) {
                    um4Var.f("uid", str4);
                }
                List h = u75.h(xxr.b, yxr.b);
                ArrayList arrayList2 = new ArrayList(v75.o(h, 10));
                it = h.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((byr) it.next()).a));
                }
                um4Var.g("sync", arrayList2);
                um4Var.e("(uid || ':' || original_id)", linkedHashMap.keySet());
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                ux4Var.j = null;
                ux4Var.k = null;
                ux4Var.l = null;
                ux4Var.m = num2;
                ux4Var.n = linkedHashMap;
                ux4Var.q = 2;
                obj = J.a(a, ux4Var);
                if (obj != nm6Var) {
                    map = linkedHashMap;
                    num3 = num2;
                    List o02 = CollectionsKt.o0((List) obj, new ex4(i3, map));
                    if (num3 != null) {
                    }
                    List<qwl> list2 = o02;
                    ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                    while (r1.hasNext()) {
                    }
                    return arrayList3;
                }
                return nm6Var;
            }
        }
        ux4Var = new ux4(this, cg6Var);
        obj = ux4Var.o;
        nm6Var = nm6.a;
        i = ux4Var.q;
        int i32 = 2;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        um4 um4Var2 = new um4(pgp.a);
        if (bool2 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        List h2 = u75.h(xxr.b, yxr.b);
        ArrayList arrayList22 = new ArrayList(v75.o(h2, 10));
        it = h2.iterator();
        while (it.hasNext()) {
        }
        um4Var2.g("sync", arrayList22);
        um4Var2.e("(uid || ':' || original_id)", linkedHashMap.keySet());
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        ux4Var.j = null;
        ux4Var.k = null;
        ux4Var.l = null;
        ux4Var.m = num2;
        ux4Var.n = linkedHashMap;
        ux4Var.q = 2;
        obj = J2.a(a2, ux4Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }
}
