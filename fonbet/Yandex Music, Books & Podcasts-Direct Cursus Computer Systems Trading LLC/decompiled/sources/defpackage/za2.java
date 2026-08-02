package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class za2 {
    public final c62 a;
    public final xb0 b;
    public final bb2 c;
    public final md0 d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j = btf.b(new ri1(19, this));

    public za2(c62 c62Var, xb0 xb0Var, bb2 bb2Var, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, md0 md0Var) {
        this.a = c62Var;
        this.b = xb0Var;
        this.c = bb2Var;
        this.d = md0Var;
        this.e = jyrVar;
        this.f = jyrVar2;
        this.g = jyrVar3;
        this.h = jyrVar4;
        this.i = jyrVar5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b1, code lost:
    
        if (r7 != r13) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0640, code lost:
    
        if (r7 == r4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06a9, code lost:
    
        if (r7 == r4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0855, code lost:
    
        if (r7 == r4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x060d, code lost:
    
        if (r7 == r4) goto L239;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Type inference failed for: r0v27, types: [m82] */
    /* JADX WARN: Type inference failed for: r14v23, types: [drf, java.lang.Object, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r15v17, types: [drf, java.lang.Object, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [drf, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v104, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v69, types: [drf, java.lang.Object, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0512 -> B:71:0x0513). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(za2 za2Var, drf drfVar, cg6 cg6Var) {
        sa2 sa2Var;
        sa2 sa2Var2;
        jyr jyrVar;
        int i;
        List list;
        String str;
        za2 za2Var2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        nm6 nm6Var;
        Object obj;
        String str7;
        boolean z;
        gmu gmuVar;
        gmu gmuVar2;
        String str8;
        int i2;
        za2 za2Var3;
        String str9;
        String str10;
        String str11;
        Object obj2;
        String str12;
        String str13;
        jcv jcvVar;
        String str14;
        List list2;
        int i3;
        int i4;
        Object obj3;
        String str15;
        za2 za2Var4;
        boolean z2;
        List list3;
        String str16;
        List list4;
        String str17;
        int i5;
        Object obj4;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Object obj5;
        za2 za2Var5;
        String str23;
        String str24;
        Object obj6;
        String str25;
        String str26;
        rj6 rj6Var;
        ?? r1;
        ?? r7;
        Object obj7;
        rj6 rj6Var2;
        rj6 rj6Var3;
        String str27;
        Collection collection;
        String str28;
        Iterator it;
        int i6;
        List list5;
        int i7;
        List list6;
        rj6 rj6Var4;
        List list7;
        ?? r14;
        Collection collection2;
        boolean z3;
        rj6 rj6Var5;
        gmu gmuVar3;
        ?? r15;
        u35 u35Var;
        u35 u35Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        za2 za2Var6 = za2Var;
        drf drfVar2 = drfVar;
        c62 c62Var = za2Var6.a;
        jyr jyrVar2 = za2Var6.e;
        xb0 xb0Var = za2Var6.b;
        fkn fknVar = xb0Var.g;
        ConcurrentHashMap concurrentHashMap = xb0Var.k;
        bb2 bb2Var = za2Var6.c;
        ac0 ac0Var = bb2Var.a;
        if (cg6Var instanceof sa2) {
            sa2Var = (sa2) cg6Var;
            int i8 = sa2Var.x;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sa2Var.x = i8 - Integer.MIN_VALUE;
                sa2Var2 = sa2Var;
                Object obj8 = sa2Var2.v;
                nm6 nm6Var2 = nm6.a;
                switch (sa2Var2.x) {
                    case 0:
                        qgg.h0(obj8);
                        drfVar2.getClass();
                        String title = drfVar2 instanceof r04 ? ((r04) drfVar2).getTitle() : drfVar2 instanceof gav ? ((gav) drfVar2).d : drfVar2 instanceof c2b ? ((c2b) drfVar2).d : drfVar2 instanceof vjg ? ((vjg) drfVar2).c : drfVar2 instanceof m4j ? ((m4j) drfVar2).d : null;
                        String str29 = drfVar2 instanceof c2b ? ((c2b) drfVar2).e : drfVar2 instanceof vjg ? ((vjg) drfVar2).d : null;
                        String str30 = drfVar2 instanceof vjg ? ((vjg) drfVar2).e : null;
                        String str31 = drfVar2.a().b;
                        e72[] e72VarArr = e72.a;
                        jyrVar = jyrVar2;
                        if (!Intrinsics.d(str31, "PERSONAL_PLAYLISTS") && !Intrinsics.d(str31, "RECENTLY_PLAYED") && !Intrinsics.d(str31, "EDITORIAL_COMPILATION")) {
                            t82[] t82VarArr = t82.a;
                            if (!Intrinsics.d(str31, "CHART_ALBUMS") && !Intrinsics.d(str31, "NON_MUSIC_EDITORIAL_COMPILATION")) {
                                bd0[] bd0VarArr = bd0.a;
                                if (!Intrinsics.d(str31, "NEW_RELEASES")) {
                                    String str32 = title;
                                    if (Intrinsics.d(str31, "WAVES")) {
                                        Set set = c62Var.b;
                                        set.getClass();
                                        if ((!set.isEmpty() ? set : null) != null) {
                                            uvn w = q5g.w(drfVar2);
                                            if (w != null) {
                                                cs1 cs1Var = new cs1(za2Var6, (Continuation) null, 3);
                                                String str33 = w.a().a;
                                                r2f r2fVar = (r2f) concurrentHashMap.get(str33);
                                                if (r2fVar == null || !r2fVar.b()) {
                                                    r2f r2fVar2 = (r2f) concurrentHashMap.get(str33);
                                                    Continuation continuation = null;
                                                    if (r2fVar2 != null) {
                                                        r2fVar2.g(null);
                                                    }
                                                    tf6 tf6Var = xb0Var.d;
                                                    if (tf6Var != null) {
                                                        str19 = str32;
                                                        concurrentHashMap.put(str33, x97.y(tf6Var, null, null, new k3(cs1Var, w, xb0Var, continuation, 11), 3));
                                                        str20 = str19;
                                                        e12 e12Var = (e12) jyrVar.getValue();
                                                        e72[] e72VarArr2 = e72.a;
                                                        return t75.c(e12.a(e12Var, "WAVES_FOR_YOU_SECTION", str20 != null ? "" : str20, y02.a, y02.b, null, null, 352));
                                                    }
                                                }
                                            }
                                            str19 = str32;
                                            str20 = str19;
                                            e12 e12Var2 = (e12) jyrVar.getValue();
                                            e72[] e72VarArr22 = e72.a;
                                            return t75.c(e12.a(e12Var2, "WAVES_FOR_YOU_SECTION", str20 != null ? "" : str20, y02.a, y02.b, null, null, 352));
                                        }
                                        obj4 = null;
                                        uvn w2 = q5g.w(drfVar2);
                                        if (w2 != null) {
                                            sa2Var2.j = null;
                                            sa2Var2.k = str32;
                                            sa2Var2.l = null;
                                            sa2Var2.m = null;
                                            sa2Var2.n = za2Var6;
                                            sa2Var2.t = 0;
                                            sa2Var2.x = 4;
                                            obj8 = ((mav) ac0Var.d.getValue()).a(w2, true, sa2Var2);
                                            if (obj8 != nm6Var2) {
                                                str18 = str32;
                                                rj6Var3 = (rj6) obj8;
                                                if (!(rj6Var3 instanceof qj6)) {
                                                    c62 c62Var2 = za2Var6.a;
                                                    ArrayList arrayList4 = ((rav) ((qj6) rj6Var3).a).a;
                                                    Set set2 = c62Var2.b;
                                                    set2.clear();
                                                    set2.addAll(arrayList4);
                                                } else if (!(rj6Var3 instanceof pj6)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                str20 = str18;
                                                e12 e12Var22 = (e12) jyrVar.getValue();
                                                e72[] e72VarArr222 = e72.a;
                                                return t75.c(e12.a(e12Var22, "WAVES_FOR_YOU_SECTION", str20 != null ? "" : str20, y02.a, y02.b, null, null, 352));
                                            }
                                        }
                                        return obj4;
                                    }
                                    if (!Intrinsics.d(str31, "EDITORIAL_WAVES")) {
                                        String str34 = str29;
                                        String str35 = str30;
                                        if (Intrinsics.d(str31, "COLLECTION_WAVE")) {
                                            String o = ouj.o(str31, StringUtil.SPACE, drfVar2.a().a);
                                            gmuVar = (gmu) c62Var.f.get(o);
                                            if (gmuVar != null) {
                                                nm6Var = nm6Var2;
                                                m5 m5Var = new m5(1, bb2Var, bb2.class, "loadCollectionWave", "loadCollectionWave(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21);
                                                r2f r2fVar3 = (r2f) concurrentHashMap.get(o);
                                                if (r2fVar3 == null || !r2fVar3.b()) {
                                                    r2f r2fVar4 = (r2f) concurrentHashMap.get(o);
                                                    if (r2fVar4 != null) {
                                                        r2fVar4.g(null);
                                                    }
                                                    tf6 tf6Var2 = xb0Var.d;
                                                    if (tf6Var2 != null) {
                                                        obj2 = null;
                                                        concurrentHashMap.put(o, x97.y(tf6Var2, null, null, new v3(4, m5Var, xb0Var, str35, o, (Continuation) null), 3));
                                                        str12 = str32;
                                                        str13 = str34;
                                                        i2 = 0;
                                                        obj = obj2;
                                                        if (gmuVar != null) {
                                                            m82 e = za2Var6.e();
                                                            sa2Var2.j = obj;
                                                            sa2Var2.k = obj;
                                                            sa2Var2.l = obj;
                                                            sa2Var2.m = obj;
                                                            sa2Var2.n = obj;
                                                            sa2Var2.o = obj;
                                                            sa2Var2.p = obj;
                                                            sa2Var2.t = i2;
                                                            sa2Var2.x = 8;
                                                            obj8 = e.g(gmuVar, str12, str13, sa2Var2);
                                                            break;
                                                        }
                                                        return obj;
                                                    }
                                                }
                                                obj2 = null;
                                                str12 = str32;
                                                str13 = str34;
                                                i2 = 0;
                                                obj = obj2;
                                                if (gmuVar != null) {
                                                }
                                                return obj;
                                            }
                                            nm6Var = nm6Var2;
                                            gmuVar2 = null;
                                            str8 = str35;
                                            sa2Var2.j = null;
                                            sa2Var2.k = str32;
                                            sa2Var2.l = str34;
                                            sa2Var2.m = str8;
                                            sa2Var2.n = o;
                                            sa2Var2.o = za2Var6;
                                            i2 = 0;
                                            sa2Var2.t = 0;
                                            sa2Var2.x = 7;
                                            obj8 = ((gnu) ac0Var.b.getValue()).a(sa2Var2);
                                            if (obj8 != nm6Var) {
                                                za2Var3 = za2Var6;
                                                str9 = o;
                                                str10 = str34;
                                                str11 = str32;
                                                rj6Var5 = (rj6) obj8;
                                                if (!(rj6Var5 instanceof qj6)) {
                                                    gmuVar3 = gmu.a((gmu) ((qj6) rj6Var5).a, str8);
                                                    c62 c62Var3 = za2Var3.a;
                                                    str9.getClass();
                                                    c62Var3.f.put(str9, gmuVar3);
                                                } else {
                                                    if (!(rj6Var5 instanceof pj6)) {
                                                        b6e.s();
                                                        return null;
                                                    }
                                                    gmuVar3 = gmuVar2;
                                                }
                                                str13 = str10;
                                                str12 = str11;
                                                gmuVar = gmuVar3;
                                                obj = gmuVar2;
                                                if (gmuVar != null) {
                                                }
                                                return obj;
                                            }
                                        } else {
                                            nm6Var = nm6Var2;
                                            obj = 0;
                                            str7 = str32;
                                            z = false;
                                            if (Intrinsics.d(str31, "COLLECTION_FAVOURITE_PLAYLIST")) {
                                                bca bcaVar = new bca(fknVar, 18);
                                                sa2Var2.j = null;
                                                sa2Var2.k = null;
                                                sa2Var2.l = null;
                                                sa2Var2.m = null;
                                                sa2Var2.x = 9;
                                                obj8 = zsd.g0(bcaVar, sa2Var2);
                                                obj = obj;
                                                break;
                                            } else {
                                                if (!Intrinsics.d(str31, "COLLECTION_SECTIONS")) {
                                                    o42[] o42VarArr = o42.a;
                                                    if (Intrinsics.d(str31, "COLLECTION_FAVOURITE_ARTISTS")) {
                                                        bca bcaVar2 = new bca(fknVar, 18);
                                                        sa2Var2.j = drfVar2;
                                                        sa2Var2.k = str7;
                                                        sa2Var2.l = null;
                                                        sa2Var2.m = null;
                                                        sa2Var2.x = 12;
                                                        obj8 = zsd.g0(bcaVar2, sa2Var2);
                                                        obj = obj;
                                                        break;
                                                    }
                                                    return obj;
                                                }
                                                bca bcaVar3 = new bca(fknVar, 18);
                                                sa2Var2.j = null;
                                                sa2Var2.k = null;
                                                sa2Var2.l = null;
                                                sa2Var2.m = null;
                                                sa2Var2.x = 10;
                                                obj8 = zsd.g0(bcaVar3, sa2Var2);
                                                r15 = obj;
                                                break;
                                            }
                                        }
                                        return nm6Var;
                                    }
                                    jcvVar = str30 != null ? new jcv(str30, WebPath$Storage.AVATARS_NO_CROP) : null;
                                    String str36 = drfVar2.a().a;
                                    str36.getClass();
                                    g2b g2bVar = (g2b) c62Var.e.get(str36);
                                    List list8 = g2bVar != null ? g2bVar.a : null;
                                    g2b g2bVar2 = (list8 == null || list8.isEmpty()) ? null : g2bVar;
                                    if (g2bVar2 == null) {
                                        str14 = str29;
                                        list2 = null;
                                        list6 = null;
                                        uvn w3 = q5g.w(drfVar2);
                                        if (w3 != null) {
                                            sa2Var2.j = drfVar2;
                                            sa2Var2.k = str32;
                                            sa2Var2.l = str14;
                                            sa2Var2.m = null;
                                            sa2Var2.n = jcvVar;
                                            sa2Var2.o = za2Var6;
                                            i3 = 0;
                                            sa2Var2.t = 0;
                                            sa2Var2.x = 5;
                                            i4 = 1;
                                            Object a = ((i2b) ac0Var.e.getValue()).a(w3, true, sa2Var2);
                                            if (a != nm6Var2) {
                                                obj3 = a;
                                                str15 = str32;
                                                za2Var4 = za2Var6;
                                                rj6Var4 = (rj6) obj3;
                                                if (rj6Var4 instanceof qj6) {
                                                    i5 = 10;
                                                    if (!(rj6Var4 instanceof pj6)) {
                                                        b6e.s();
                                                        return null;
                                                    }
                                                    list7 = list6;
                                                } else {
                                                    c62 c62Var4 = za2Var4.a;
                                                    String str37 = drfVar2.a().a;
                                                    g2b g2bVar3 = (g2b) ((qj6) rj6Var4).a;
                                                    str37.getClass();
                                                    g2bVar3.getClass();
                                                    c62Var4.e.put(str37, g2bVar3);
                                                    list7 = g2bVar3.a;
                                                    if (jcvVar != null) {
                                                        List list9 = list7;
                                                        i5 = 10;
                                                        ArrayList arrayList5 = new ArrayList(v75.o(list9, 10));
                                                        Iterator it2 = list9.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList5.add(zsu.a((zsu) it2.next(), jcvVar));
                                                        }
                                                        list7 = arrayList5;
                                                    } else {
                                                        i5 = 10;
                                                    }
                                                }
                                                str17 = str15;
                                                list4 = list7;
                                                list2 = list6;
                                                if (list4 != null) {
                                                }
                                            }
                                        }
                                        return list2;
                                    }
                                    String str38 = drfVar2.a().a;
                                    ua2 ua2Var = new ua2(za2Var6, drfVar2, null, 2);
                                    str38.getClass();
                                    r2f r2fVar5 = (r2f) concurrentHashMap.get(str38);
                                    if (r2fVar5 != null) {
                                        z2 = true;
                                        if (r2fVar5.b()) {
                                            str16 = str32;
                                            str14 = str29;
                                            list3 = null;
                                            list4 = g2bVar2.a;
                                            str17 = str16;
                                            i3 = 0;
                                            i4 = 1;
                                            i5 = 10;
                                            list2 = list3;
                                            if (list4 != null) {
                                                List list10 = list4;
                                                ArrayList arrayList6 = new ArrayList(v75.o(list10, i5));
                                                str27 = str14;
                                                collection = arrayList6;
                                                str28 = str17;
                                                it = list10.iterator();
                                                i6 = i3;
                                                list5 = list4;
                                                i7 = i6;
                                                r14 = list2;
                                                if (it.hasNext()) {
                                                    zsu zsuVar = (zsu) it.next();
                                                    m82 e2 = za2Var6.e();
                                                    String str39 = list5.size() > i4 ? str28 : r14;
                                                    sa2Var2.j = r14;
                                                    sa2Var2.k = str28;
                                                    sa2Var2.l = str27;
                                                    sa2Var2.m = r14;
                                                    sa2Var2.n = r14;
                                                    sa2Var2.o = list5;
                                                    sa2Var2.p = r14;
                                                    Collection collection3 = collection;
                                                    sa2Var2.q = collection3;
                                                    sa2Var2.r = it;
                                                    sa2Var2.s = collection3;
                                                    sa2Var2.t = i7;
                                                    sa2Var2.u = i6;
                                                    sa2Var2.x = 6;
                                                    obj8 = e2.c(str39, str27, zsuVar, sa2Var2);
                                                    if (obj8 != nm6Var2) {
                                                        collection2 = collection;
                                                        z3 = r14;
                                                        collection.add((MediaBrowserCompat$MediaItem) obj8);
                                                        collection = collection2;
                                                        r14 = z3;
                                                        if (it.hasNext()) {
                                                            return (List) collection;
                                                        }
                                                    }
                                                }
                                            }
                                            return list2;
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                    r2f r2fVar6 = (r2f) concurrentHashMap.get(str38);
                                    if (r2fVar6 != null) {
                                        r2fVar6.g(null);
                                    }
                                    tf6 tf6Var3 = xb0Var.d;
                                    if (tf6Var3 != null) {
                                        list3 = null;
                                        str14 = str29;
                                        str16 = str32;
                                        concurrentHashMap.put(str38, x97.y(tf6Var3, null, null, new v3((Object) ua2Var, (Parcelable) jcvVar, (Object) xb0Var, str38, (Continuation) null, 3), 3));
                                    } else {
                                        list3 = null;
                                        str16 = str32;
                                        str14 = str29;
                                    }
                                    list4 = g2bVar2.a;
                                    str17 = str16;
                                    i3 = 0;
                                    i4 = 1;
                                    i5 = 10;
                                    list2 = list3;
                                    if (list4 != null) {
                                    }
                                    return list2;
                                    return nm6Var2;
                                }
                                String o2 = ouj.o(str31, StringUtil.SPACE, drfVar2.a().a);
                                List list11 = (List) c62Var.d.get(o2);
                                List list12 = list11;
                                if (list12 == null || list12.isEmpty()) {
                                    list11 = null;
                                }
                                if (list11 == null) {
                                    String str40 = title;
                                    obj4 = null;
                                    obj7 = null;
                                    uvn w4 = q5g.w(drfVar2);
                                    if (w4 != null) {
                                        sa2Var2.j = null;
                                        sa2Var2.k = str40;
                                        sa2Var2.l = null;
                                        sa2Var2.m = null;
                                        sa2Var2.n = o2;
                                        sa2Var2.o = za2Var6;
                                        sa2Var2.t = 0;
                                        sa2Var2.x = 2;
                                        Object a2 = ((p4j) ac0Var.a.getValue()).a(w4, true, sa2Var2);
                                        if (a2 != nm6Var2) {
                                            str21 = str40;
                                            str22 = o2;
                                            obj5 = a2;
                                            za2Var5 = za2Var6;
                                            rj6Var2 = (rj6) obj5;
                                            if (rj6Var2 instanceof qj6) {
                                                obj4 = obj7;
                                                if (!(rj6Var2 instanceof pj6)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                            } else {
                                                c62 c62Var5 = za2Var5.a;
                                                b5j b5jVar = (b5j) ((qj6) rj6Var2).a;
                                                ArrayList arrayList7 = b5jVar.a;
                                                str22.getClass();
                                                c62Var5.d.put(str22, arrayList7);
                                                ArrayList arrayList8 = b5jVar.a;
                                                str25 = str22;
                                                list11 = arrayList8;
                                                r7 = obj7;
                                                e12 e12Var3 = (e12) jyrVar.getValue();
                                                if (str21 != null) {
                                                }
                                                y02 y02Var = y02.b;
                                                ta2 ta2Var = new ta2(list11, r7, 0);
                                                v42 v42Var = new v42(za2Var6, r7, 2);
                                                sa2Var2.j = r7;
                                                sa2Var2.k = r7;
                                                sa2Var2.l = r7;
                                                sa2Var2.m = r7;
                                                sa2Var2.n = r7;
                                                sa2Var2.o = r7;
                                                sa2Var2.x = 3;
                                                obj8 = e12Var3.b(r17, str25, null, y02Var, y02Var, 3, ta2Var, v42Var, sa2Var2);
                                            }
                                        }
                                        return nm6Var2;
                                    }
                                    return obj4;
                                }
                                ua2 ua2Var2 = new ua2(za2Var6, drfVar2, null, 1);
                                r2f r2fVar7 = (r2f) concurrentHashMap.get(o2);
                                if (r2fVar7 == null || !r2fVar7.b()) {
                                    r2f r2fVar8 = (r2f) concurrentHashMap.get(o2);
                                    Continuation continuation2 = null;
                                    if (r2fVar8 != null) {
                                        r2fVar8.g(null);
                                    }
                                    tf6 tf6Var4 = xb0Var.d;
                                    if (tf6Var4 != null) {
                                        str23 = o2;
                                        str24 = title;
                                        obj6 = null;
                                        concurrentHashMap.put(str23, x97.y(tf6Var4, null, null, new k3(ua2Var2, xb0Var, str23, continuation2, 10), 3));
                                    } else {
                                        str23 = o2;
                                        str24 = title;
                                        obj6 = null;
                                    }
                                } else {
                                    str23 = o2;
                                    str24 = title;
                                    obj6 = null;
                                }
                                str21 = str24;
                                str25 = str23;
                                r7 = obj6;
                                e12 e12Var32 = (e12) jyrVar.getValue();
                                String str41 = str21 != null ? "" : str21;
                                y02 y02Var2 = y02.b;
                                ta2 ta2Var2 = new ta2(list11, r7, 0);
                                v42 v42Var2 = new v42(za2Var6, r7, 2);
                                sa2Var2.j = r7;
                                sa2Var2.k = r7;
                                sa2Var2.l = r7;
                                sa2Var2.m = r7;
                                sa2Var2.n = r7;
                                sa2Var2.o = r7;
                                sa2Var2.x = 3;
                                obj8 = e12Var32.b(str41, str25, null, y02Var2, y02Var2, 3, ta2Var2, v42Var2, sa2Var2);
                                break;
                            }
                        }
                        String str42 = title;
                        int i9 = 0;
                        i = 3;
                        Continuation continuation3 = null;
                        String o3 = ouj.o(str31, StringUtil.SPACE, drfVar2.a().a);
                        List list13 = (List) c62Var.c.get(o3);
                        List list14 = list13;
                        list = (list14 == null || list14.isEmpty()) ? null : list13;
                        if (list != null) {
                            ua2 ua2Var3 = new ua2(za2Var6, drfVar2, continuation3, i9);
                            r2f r2fVar9 = (r2f) concurrentHashMap.get(o3);
                            if (r2fVar9 == null || !r2fVar9.b()) {
                                r2f r2fVar10 = (r2f) concurrentHashMap.get(o3);
                                if (r2fVar10 != null) {
                                    r2fVar10.g(null);
                                }
                                tf6 tf6Var5 = xb0Var.d;
                                if (tf6Var5 != null) {
                                    ?? r9 = 0;
                                    concurrentHashMap.put(o3, x97.y(tf6Var5, null, null, new k3(ua2Var3, xb0Var, o3, (Continuation) r9, 9), 3));
                                    str4 = r9;
                                    str5 = o3;
                                    str6 = str42;
                                    str26 = str4;
                                    if (list != null) {
                                        return str26;
                                    }
                                    if (list.size() <= i) {
                                        List list15 = list;
                                        ArrayList arrayList9 = new ArrayList(v75.o(list15, 10));
                                        Iterator it3 = list15.iterator();
                                        while (it3.hasNext()) {
                                            arrayList9.add(za2Var6.e().f((yit) it3.next(), str6, y02.b));
                                        }
                                        return arrayList9;
                                    }
                                    n8g b = t75.b();
                                    e12 e12Var4 = (e12) jyrVar.getValue();
                                    String str43 = str6 == null ? "" : str6;
                                    y02 y02Var3 = y02.b;
                                    b.add(e12.a(e12Var4, str5, str43, y02Var3, y02Var3, null, null, 480));
                                    List q0 = CollectionsKt.q0(list, i);
                                    ArrayList arrayList10 = new ArrayList(v75.o(q0, 10));
                                    Iterator it4 = q0.iterator();
                                    while (it4.hasNext()) {
                                        arrayList10.add(za2Var6.e().f((yit) it4.next(), str26, y02.b));
                                    }
                                    b.addAll(arrayList10);
                                    return t75.a(b);
                                }
                            }
                            str4 = null;
                            str5 = o3;
                            str6 = str42;
                            str26 = str4;
                            if (list != null) {
                            }
                        } else {
                            str = null;
                            uvn w5 = q5g.w(drfVar2);
                            if (w5 == null) {
                                return null;
                            }
                            sa2Var2.j = null;
                            sa2Var2.k = str42;
                            sa2Var2.l = null;
                            sa2Var2.m = null;
                            sa2Var2.n = o3;
                            sa2Var2.o = za2Var6;
                            sa2Var2.t = 0;
                            sa2Var2.x = 1;
                            obj8 = ((j14) ac0Var.c.getValue()).a(w5, true, sa2Var2);
                            if (obj8 == nm6Var2) {
                                return nm6Var2;
                            }
                            za2Var2 = za2Var6;
                            str2 = o3;
                            str3 = str42;
                            rj6Var = (rj6) obj8;
                            if (!(rj6Var instanceof qj6)) {
                                c62 c62Var6 = za2Var2.a;
                                Object obj9 = ((qj6) rj6Var).a;
                                ArrayList arrayList11 = ((r14) obj9).a;
                                str2.getClass();
                                c62Var6.c.put(str2, arrayList11);
                                r1 = ((r14) obj9).a;
                            } else {
                                if (!(rj6Var instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                r1 = str;
                            }
                            str6 = str3;
                            str5 = str2;
                            list = r1;
                            str26 = str;
                            if (list != null) {
                            }
                        }
                        break;
                    case 1:
                        za2Var2 = (za2) sa2Var2.o;
                        str2 = (String) sa2Var2.n;
                        str3 = sa2Var2.k;
                        qgg.h0(obj8);
                        jyrVar = jyrVar2;
                        str = null;
                        i = 3;
                        rj6Var = (rj6) obj8;
                        if (!(rj6Var instanceof qj6)) {
                        }
                        str6 = str3;
                        str5 = str2;
                        list = r1;
                        str26 = str;
                        if (list != null) {
                        }
                        break;
                    case 2:
                        za2Var5 = (za2) sa2Var2.o;
                        str22 = (String) sa2Var2.n;
                        str21 = sa2Var2.k;
                        qgg.h0(obj8);
                        jyrVar = jyrVar2;
                        obj5 = obj8;
                        obj7 = null;
                        rj6Var2 = (rj6) obj5;
                        if (rj6Var2 instanceof qj6) {
                        }
                        break;
                    case 3:
                        qgg.h0(obj8);
                        return (List) obj8;
                    case 4:
                        za2Var6 = (za2) sa2Var2.n;
                        str18 = sa2Var2.k;
                        qgg.h0(obj8);
                        jyrVar = jyrVar2;
                        rj6Var3 = (rj6) obj8;
                        if (!(rj6Var3 instanceof qj6)) {
                        }
                        str20 = str18;
                        e12 e12Var222 = (e12) jyrVar.getValue();
                        e72[] e72VarArr2222 = e72.a;
                        return t75.c(e12.a(e12Var222, "WAVES_FOR_YOU_SECTION", str20 != null ? "" : str20, y02.a, y02.b, null, null, 352));
                    case 5:
                        za2 za2Var7 = (za2) sa2Var2.o;
                        jcv jcvVar2 = (jcv) sa2Var2.n;
                        str14 = sa2Var2.l;
                        str15 = sa2Var2.k;
                        drf drfVar3 = sa2Var2.j;
                        qgg.h0(obj8);
                        za2Var4 = za2Var7;
                        drfVar2 = drfVar3;
                        obj3 = obj8;
                        jcvVar = jcvVar2;
                        i3 = 0;
                        i4 = 1;
                        list6 = null;
                        rj6Var4 = (rj6) obj3;
                        if (rj6Var4 instanceof qj6) {
                        }
                        str17 = str15;
                        list4 = list7;
                        list2 = list6;
                        if (list4 != null) {
                        }
                        return list2;
                    case 6:
                        int i10 = sa2Var2.u;
                        int i11 = sa2Var2.t;
                        collection = sa2Var2.s;
                        it = sa2Var2.r;
                        collection2 = sa2Var2.q;
                        list5 = (List) sa2Var2.o;
                        str27 = sa2Var2.l;
                        String str44 = sa2Var2.k;
                        qgg.h0(obj8);
                        i6 = i10;
                        i7 = i11;
                        str28 = str44;
                        i4 = 1;
                        z3 = false;
                        collection.add((MediaBrowserCompat$MediaItem) obj8);
                        collection = collection2;
                        r14 = z3;
                        if (it.hasNext()) {
                        }
                        break;
                    case 7:
                        za2Var3 = (za2) sa2Var2.o;
                        str9 = (String) sa2Var2.n;
                        String str45 = sa2Var2.m;
                        str10 = sa2Var2.l;
                        str11 = sa2Var2.k;
                        qgg.h0(obj8);
                        str8 = str45;
                        nm6Var = nm6Var2;
                        i2 = 0;
                        gmuVar2 = null;
                        rj6Var5 = (rj6) obj8;
                        if (!(rj6Var5 instanceof qj6)) {
                        }
                        str13 = str10;
                        str12 = str11;
                        gmuVar = gmuVar3;
                        obj = gmuVar2;
                        if (gmuVar != null) {
                        }
                        return obj;
                    case 8:
                        qgg.h0(obj8);
                        return t75.c(obj8);
                    case 9:
                        qgg.h0(obj8);
                        z = false;
                        obj = 0;
                        cvl cvlVar = ((u35) obj8).a;
                        if (cvlVar != null) {
                            ((dd0) za2Var6.j.getValue()).getClass();
                            String str46 = cvlVar.b;
                            ?? e3 = za2Var6.e();
                            cvl a3 = cvl.a(cvlVar, str46, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, 134217725);
                            o42[] o42VarArr2 = o42.a;
                            return t75.c(e3.d(a3, "COLLECTION_FAVOURITE_PLAYLIST_PLAYABLE_MEDIA_ID", obj, z));
                        }
                        return obj;
                    case 10:
                        qgg.h0(obj8);
                        nm6Var = nm6Var2;
                        r15 = 0;
                        u35Var = (u35) obj8;
                        ArrayList arrayList12 = new ArrayList();
                        if (u35Var.c) {
                            m42 c = za2Var6.c();
                            o42[] o42VarArr3 = o42.a;
                            c.getClass();
                            e12 e12Var5 = c.a;
                            String string = c.c().a.getString(R.string.android_auto_collection_albums);
                            string.getClass();
                            Uri a4 = dc0.a(c.b().a, R.drawable.ic_car_albums_200);
                            a4.getClass();
                            arrayList12.add(e12.a(e12Var5, "COLLECTION_SECTIONS_ALBUMS_MEDIA_ID", string, y02.a, y02.b, new d62(a4), null, 352));
                        }
                        if (u35Var.b) {
                            m42 c2 = za2Var6.c();
                            o42[] o42VarArr4 = o42.a;
                            c2.getClass();
                            e12 e12Var6 = c2.a;
                            String string2 = c2.c().a.getString(R.string.android_auto_collection_playlists);
                            string2.getClass();
                            Uri a5 = dc0.a(c2.b().a, R.drawable.ic_car_playlists_200);
                            a5.getClass();
                            arrayList12.add(e12.a(e12Var6, "COLLECTION_SECTIONS_PLAYLISTS_MEDIA_ID", string2, y02.a, y02.b, new d62(a5), null, 352));
                        }
                        if (u35Var.e) {
                            m42 c3 = za2Var6.c();
                            o42[] o42VarArr5 = o42.a;
                            c3.getClass();
                            e12 e12Var7 = c3.a;
                            String string3 = c3.c().a.getString(R.string.android_auto_collection_podcasts);
                            string3.getClass();
                            Uri a6 = dc0.a(c3.b().a, R.drawable.ic_car_podcasts_200);
                            a6.getClass();
                            arrayList12.add(e12.a(e12Var7, "COLLECTION_SECTIONS_PODCASTS_MEDIA_ID", string3, y02.a, y02.b, new d62(a6), null, 352));
                        }
                        if (u35Var.d) {
                            m42 c4 = za2Var6.c();
                            o42[] o42VarArr6 = o42.a;
                            c4.getClass();
                            e12 e12Var8 = c4.a;
                            String string4 = c4.c().a.getString(R.string.android_auto_collection_books);
                            string4.getClass();
                            Uri a7 = dc0.a(c4.b().a, R.drawable.ic_car_books_200);
                            a7.getClass();
                            arrayList12.add(e12.a(e12Var8, "COLLECTION_SECTIONS_BOOKS_MEDIA_ID", string4, y02.a, y02.b, new d62(a7), null, 352));
                        }
                        arrayList2 = arrayList12;
                        if (u35Var.g) {
                            m42 c5 = za2Var6.c();
                            o42[] o42VarArr7 = o42.a;
                            sa2Var2.j = r15;
                            sa2Var2.k = r15;
                            sa2Var2.l = r15;
                            sa2Var2.m = r15;
                            sa2Var2.n = u35Var;
                            sa2Var2.o = arrayList12;
                            sa2Var2.p = arrayList12;
                            sa2Var2.x = 11;
                            obj8 = c5.a("COLLECTION_SECTIONS_DOWNLOADED_MEDIA_ID", sa2Var2);
                            if (obj8 != nm6Var) {
                                u35Var2 = u35Var;
                                arrayList = arrayList12;
                                arrayList3 = arrayList12;
                                arrayList.add(obj8);
                                u35Var = u35Var2;
                                arrayList2 = arrayList3;
                            }
                            return nm6Var;
                        }
                        if (u35Var.f) {
                            m42 c6 = za2Var6.c();
                            o42[] o42VarArr8 = o42.a;
                            e12 e12Var9 = c6.a;
                            String string5 = c6.c().a.getString(R.string.android_auto_collection_kids);
                            string5.getClass();
                            Uri a8 = dc0.a(c6.b().a, R.drawable.ic_car_kids_200);
                            a8.getClass();
                            arrayList2.add(e12.a(e12Var9, "COLLECTION_SECTIONS_KIDS_MEDIA_ID", string5, y02.a, y02.b, new d62(a8), null, 352));
                        }
                        return arrayList2;
                    case 11:
                        arrayList = sa2Var2.p;
                        ?? r3 = (List) sa2Var2.o;
                        u35Var2 = (u35) sa2Var2.n;
                        qgg.h0(obj8);
                        arrayList3 = r3;
                        arrayList.add(obj8);
                        u35Var = u35Var2;
                        arrayList2 = arrayList3;
                        if (u35Var.f) {
                        }
                        return arrayList2;
                    case 12:
                        String str47 = sa2Var2.k;
                        drf drfVar4 = sa2Var2.j;
                        qgg.h0(obj8);
                        str7 = str47;
                        drfVar2 = drfVar4;
                        obj = 0;
                        if (((u35) obj8).h) {
                            m42 c7 = za2Var6.c();
                            String str48 = drfVar2.a().b;
                            String str49 = str7 == null ? "" : str7;
                            c7.getClass();
                            str48.getClass();
                            e12 e12Var10 = c7.a;
                            Uri a9 = dc0.a(c7.b().a, R.drawable.ic_carplay_artists_200);
                            a9.getClass();
                            return t75.c(e12.a(e12Var10, str48, str49, y02.a, y02.b, new d62(a9), null, 352));
                        }
                        return obj;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        sa2Var = new sa2(za2Var6, cg6Var);
        sa2Var2 = sa2Var;
        Object obj82 = sa2Var2.v;
        nm6 nm6Var22 = nm6.a;
        switch (sa2Var2.x) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(za2 za2Var, drf drfVar, cg6 cg6Var) {
        va2 va2Var;
        int i;
        drf drfVar2;
        String str;
        za2Var.getClass();
        if (cg6Var instanceof va2) {
            va2Var = (va2) cg6Var;
            int i2 = va2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = va2Var.k;
                nm6 nm6Var = nm6.a;
                i = va2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(za2Var.b.j, 18);
                    va2Var.j = drfVar;
                    va2Var.m = 1;
                    obj = zsd.g0(bcaVar, va2Var);
                    if (obj != nm6Var) {
                        drfVar2 = drfVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return t75.c(obj);
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return t75.c(obj);
                    }
                    if (i == 4) {
                        qgg.h0(obj);
                        return t75.c(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                drfVar2 = va2Var.j;
                qgg.h0(obj);
                eia eiaVar = (eia) obj;
                str = drfVar2.a().a;
                b72 b72Var = b72.b;
                if (!Intrinsics.d(str, "DOWNLOADED_TRACKS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.a != null) {
                        z72 d = za2Var.d();
                        String str2 = eiaVar.a;
                        va2Var.j = null;
                        va2Var.m = 2;
                        obj = d.c(str2, str, va2Var);
                    }
                    return null;
                }
                if (Intrinsics.d(str, "DOWNLOADED_PLAYLISTS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.b) {
                        z72 d2 = za2Var.d();
                        va2Var.j = null;
                        va2Var.m = 3;
                        obj = d2.b(str, va2Var);
                    }
                    return null;
                }
                if (Intrinsics.d(str, "DOWNLOADED_ALBUMS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.c) {
                        z72 d3 = za2Var.d();
                        va2Var.j = null;
                        va2Var.m = 4;
                        obj = d3.a(str, va2Var);
                    }
                } else if (Intrinsics.d(str, "DOWNLOADED_PODCASTS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.e) {
                        z72 d4 = za2Var.d();
                        d4.getClass();
                        str.getClass();
                        e12 e12Var = d4.a;
                        String string = d4.e().a.getString(R.string.android_auto_downloaded_podcasts);
                        string.getClass();
                        Uri a = dc0.a(d4.d().a, R.drawable.ic_car_podcasts_200);
                        a.getClass();
                        return t75.c(e12.a(e12Var, str, string, y02.a, y02.b, new d62(a), null, 96));
                    }
                } else if (Intrinsics.d(str, "DOWNLOADED_AUDIOBOOKS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.d) {
                        z72 d5 = za2Var.d();
                        d5.getClass();
                        str.getClass();
                        e12 e12Var2 = d5.a;
                        String string2 = d5.e().a.getString(R.string.android_auto_downloaded_books);
                        string2.getClass();
                        Uri a2 = dc0.a(d5.d().a, R.drawable.ic_car_books_200);
                        a2.getClass();
                        return t75.c(e12.a(e12Var2, str, string2, y02.a, y02.b, new d62(a2), null, 96));
                    }
                } else if (Intrinsics.d(str, "DOWNLOADED_ARTISTS_BLOCK_MEDIA_ID")) {
                    if (eiaVar.g) {
                        z72 d6 = za2Var.d();
                        d6.getClass();
                        str.getClass();
                        e12 e12Var3 = d6.a;
                        String string3 = d6.e().a.getString(R.string.android_auto_downloaded_artists);
                        string3.getClass();
                        Uri a3 = dc0.a(d6.d().a, R.drawable.ic_carplay_artists_200);
                        a3.getClass();
                        return t75.c(e12.a(e12Var3, str, string3, y02.a, y02.b, new d62(a3), null, 96));
                    }
                } else if (Intrinsics.d(str, "DOWNLOADED_KIDS_BLOCK_MEDIA_ID") && eiaVar.f) {
                    z72 d7 = za2Var.d();
                    d7.getClass();
                    str.getClass();
                    e12 e12Var4 = d7.a;
                    String string4 = d7.e().a.getString(R.string.android_auto_downloaded_kids);
                    string4.getClass();
                    Uri a4 = dc0.a(d7.d().a, R.drawable.ic_car_kids_200);
                    a4.getClass();
                    return t75.c(e12.a(e12Var4, str, string4, y02.a, y02.b, new d62(a4), null, 96));
                }
                return null;
            }
        }
        va2Var = new va2(za2Var, cg6Var);
        Object obj2 = va2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = va2Var.m;
        if (i != 0) {
        }
        eia eiaVar2 = (eia) obj2;
        str = drfVar2.a().a;
        b72 b72Var2 = b72.b;
        if (!Intrinsics.d(str, "DOWNLOADED_TRACKS_BLOCK_MEDIA_ID")) {
        }
    }

    public final m42 c() {
        return (m42) this.h.getValue();
    }

    public final z72 d() {
        return (z72) this.g.getValue();
    }

    public final m82 e() {
        return (m82) this.f.getValue();
    }
}
