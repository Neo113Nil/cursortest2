package defpackage;

import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.phonoteka.synchronization.data.model.PhonotekaSyncException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.hmm;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nrk extends aur implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ ork B;
    public yqk j;
    public Object k;
    public List l;
    public Object m;
    public p73 n;
    public Object o;
    public cr p;
    public Object q;
    public xdr r;
    public fs7 s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrk(String str, ork orkVar, Continuation continuation) {
        super(2, continuation);
        this.A = str;
        this.B = orkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(ork orkVar, yqk yqkVar, wpk wpkVar, Throwable th, cg6 cg6Var) {
        lrk lrkVar;
        int i;
        xdr xdrVar;
        brk brkVar;
        if (cg6Var instanceof lrk) {
            lrkVar = (lrk) cg6Var;
            int i2 = lrkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lrkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lrkVar.l;
                Object obj2 = nm6.a;
                i = lrkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    orkVar.e.getClass();
                    if (th != null) {
                        ssg.a(5, "PhonotekaSynchronizer", "sync error " + wpkVar, th);
                    } else {
                        ssg.a(5, "PhonotekaSynchronizer", "sync error " + wpkVar, null);
                    }
                    xdr xdrVar2 = orkVar.m;
                    brk brkVar2 = new brk(wpkVar);
                    lrkVar.j = xdrVar2;
                    lrkVar.k = brkVar2;
                    lrkVar.m = 1;
                    obj = yqkVar.c(lrkVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    xdrVar = xdrVar2;
                    brkVar = brkVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    brkVar = lrkVar.k;
                    xdrVar = lrkVar.j;
                    qgg.h0(obj);
                }
                erk erkVar = new erk(brkVar, (Long) obj);
                xdrVar.getClass();
                xdrVar.m(null, erkVar);
                return Unit.a;
            }
        }
        lrkVar = new lrk(cg6Var);
        Object obj3 = lrkVar.l;
        Object obj22 = nm6.a;
        i = lrkVar.m;
        if (i != 0) {
        }
        erk erkVar2 = new erk(brkVar, (Long) obj3);
        xdrVar.getClass();
        xdrVar.m(null, erkVar2);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0761 A[LOOP:13: B:224:0x075b->B:226:0x0761, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(ork orkVar, long j, long j2, yqk yqkVar, irk irkVar, kba kbaVar, p73 p73Var, LinkedHashMap linkedHashMap, cok cokVar, wpk wpkVar, cg6 cg6Var) {
        mrk mrkVar;
        nm6 nm6Var;
        int i;
        irk irkVar2;
        p73 p73Var2;
        znk znkVar;
        Object obj;
        Object obj2;
        long j3;
        long j4;
        kba kbaVar2;
        cok cokVar2;
        long j5;
        wpk wpkVar2;
        cr crVar;
        LinkedHashSet linkedHashSet;
        Object c;
        Object obj3;
        irk irkVar3;
        cok cokVar3;
        znk znkVar2;
        kba kbaVar3;
        Long l;
        long j6;
        long j7;
        wpk wpkVar3;
        Long l2;
        boolean z;
        long j8;
        Integer num;
        Long l3;
        a53 a53Var;
        g63 g63Var;
        List list;
        jyr jyrVar;
        a53 a53Var2;
        Integer valueOf;
        g63 g63Var2;
        a53 a53Var3;
        Long l4;
        boolean z2;
        Integer num2;
        Integer num3;
        boolean z3;
        String str;
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        ArrayList arrayList;
        Pair pair5;
        Pair pair6;
        ArrayList arrayList2;
        c63 c63Var;
        Set set;
        Set set2;
        cr crVar2;
        LinkedHashSet linkedHashSet2;
        cr crVar3;
        cr crVar4;
        c63 c63Var2;
        c63 c63Var3;
        List list2;
        cr crVar5;
        fwr fwrVar;
        nwr nwrVar;
        long j9 = j;
        long j10 = j2;
        yqk yqkVar2 = yqkVar;
        if (cg6Var instanceof mrk) {
            mrkVar = (mrk) cg6Var;
            int i2 = mrkVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mrkVar.y = i2 - Integer.MIN_VALUE;
                Object obj4 = mrkVar.x;
                nm6Var = nm6.a;
                i = mrkVar.y;
                if (i != 0) {
                    qgg.h0(obj4);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    orkVar.e.getClass();
                    ssg.a(4, "PhonotekaSynchronizer", "all updated for " + (elapsedRealtime - j10) + "ms " + ((kbaVar == null || (crVar = kbaVar.b) == null || (linkedHashSet = (LinkedHashSet) crVar.i) == null || linkedHashSet.isEmpty()) ? "" : ", block with network errors " + linkedHashSet), null);
                    znk znkVar3 = orkVar.l;
                    long j11 = elapsedRealtime - j10;
                    mrkVar.j = yqkVar2;
                    irkVar2 = irkVar;
                    mrkVar.k = irkVar2;
                    mrkVar.l = kbaVar;
                    p73Var2 = p73Var;
                    mrkVar.m = p73Var2;
                    mrkVar.n = linkedHashMap;
                    mrkVar.o = cokVar;
                    mrkVar.p = wpkVar;
                    mrkVar.q = znkVar3;
                    mrkVar.s = j9;
                    mrkVar.t = j10;
                    mrkVar.u = elapsedRealtime;
                    mrkVar.v = j9;
                    mrkVar.w = j11;
                    mrkVar.y = 1;
                    Object a = yqkVar2.a(mrkVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    znkVar = znkVar3;
                    obj = linkedHashMap;
                    obj2 = a;
                    j3 = elapsedRealtime;
                    j4 = j11;
                    kbaVar2 = kbaVar;
                    cokVar2 = cokVar;
                    j5 = j9;
                    wpkVar2 = wpkVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j7 = mrkVar.w;
                        j6 = mrkVar.v;
                        l = mrkVar.r;
                        znkVar2 = mrkVar.q;
                        wpkVar3 = mrkVar.p;
                        cokVar3 = mrkVar.o;
                        Object obj5 = (Map) mrkVar.n;
                        p73 p73Var3 = mrkVar.m;
                        kbaVar3 = mrkVar.l;
                        irkVar3 = mrkVar.k;
                        qgg.h0(obj4);
                        p73Var2 = p73Var3;
                        obj3 = obj5;
                        l2 = (Long) obj4;
                        jyr jyrVar2 = ((bx5) znkVar2.b).a;
                        irkVar3.getClass();
                        z = irkVar3 != irk.a;
                        if (kbaVar3 != null || (nwrVar = kbaVar3.a) == null) {
                            j8 = j6;
                            num = null;
                        } else {
                            f9b f9bVar = nwrVar.a;
                            j8 = j6;
                            int size = f9bVar.f.size() + f9bVar.e.size() + f9bVar.d.size() + f9bVar.c.size() + f9bVar.b.size() + f9bVar.a.size();
                            f9b f9bVar2 = nwrVar.b;
                            num = Integer.valueOf(f9bVar2.f.size() + f9bVar2.e.size() + f9bVar2.d.size() + f9bVar2.c.size() + f9bVar2.b.size() + f9bVar2.a.size() + size);
                        }
                        if (p73Var2 == null) {
                            List list3 = p73Var2.a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj6 : list3) {
                                if (obj6 instanceof g63) {
                                    arrayList3.add(obj6);
                                }
                            }
                            k63 k63Var = (k63) CollectionsKt.firstOrNull(arrayList3);
                            List list4 = p73Var2.b;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj7 : list4) {
                                Long l5 = l;
                                if (obj7 instanceof fwr) {
                                    arrayList4.add(obj7);
                                }
                                l = l5;
                            }
                            l3 = l;
                            a53Var = new a53(k63Var, (jwr) CollectionsKt.firstOrNull(arrayList4));
                        } else {
                            l3 = l;
                            a53Var = null;
                        }
                        Integer valueOf2 = ((a53Var != null || (fwrVar = (fwr) a53Var.b) == null || (list = fwrVar.b) == null) && (a53Var == null || (g63Var = (g63) a53Var.a) == null || (list = g63Var.c.b) == null)) ? null : Integer.valueOf(list.size());
                        if (kbaVar3 != null || (crVar5 = kbaVar3.b) == null || (valueOf = (Integer) crVar5.h) == null) {
                            if (p73Var2 == null) {
                                List list5 = p73Var2.a;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj8 : list5) {
                                    if (obj8 instanceof g63) {
                                        arrayList5.add(obj8);
                                    }
                                }
                                k63 k63Var2 = (k63) CollectionsKt.firstOrNull(arrayList5);
                                List list6 = p73Var2.b;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj9 : list6) {
                                    jyr jyrVar3 = jyrVar2;
                                    if (obj9 instanceof fwr) {
                                        arrayList6.add(obj9);
                                    }
                                    jyrVar2 = jyrVar3;
                                }
                                jyrVar = jyrVar2;
                                a53Var2 = new a53(k63Var2, (jwr) CollectionsKt.firstOrNull(arrayList6));
                            } else {
                                jyrVar = jyrVar2;
                                a53Var2 = null;
                            }
                            valueOf = (a53Var2 != null || (g63Var2 = (g63) a53Var2.a) == null) ? null : Integer.valueOf(g63Var2.e);
                        } else {
                            jyrVar = jyrVar2;
                        }
                        if (p73Var2 == null) {
                            List list7 = p73Var2.a;
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj10 : list7) {
                                if (obj10 instanceof c63) {
                                    arrayList7.add(obj10);
                                }
                            }
                            k63 k63Var3 = (k63) CollectionsKt.firstOrNull(arrayList7);
                            List list8 = p73Var2.b;
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj11 : list8) {
                                if (obj11 instanceof awr) {
                                    arrayList8.add(obj11);
                                }
                            }
                            a53Var3 = new a53(k63Var3, (jwr) CollectionsKt.firstOrNull(arrayList8));
                        } else {
                            a53Var3 = null;
                        }
                        Integer valueOf3 = (a53Var3 != null || (c63Var3 = (c63) a53Var3.a) == null || (list2 = (List) c63Var3.f.getValue()) == null) ? null : Integer.valueOf(list2.size());
                        Integer valueOf4 = (a53Var3 != null || (c63Var2 = (c63) a53Var3.a) == null) ? null : Integer.valueOf(((List) c63Var2.h.getValue()).size() + ((List) c63Var2.g.getValue()).size() + ((List) c63Var2.f.getValue()).size());
                        if (kbaVar3 != null || (crVar4 = kbaVar3.b) == null) {
                            l4 = l2;
                            z2 = z;
                            num2 = null;
                        } else {
                            Collection values = ((LinkedHashMap) crVar4.b).values();
                            l4 = l2;
                            ArrayList arrayList9 = new ArrayList();
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                boolean z4 = z;
                                Object next = it.next();
                                Iterator it2 = it;
                                if (((m9b) next) instanceof i9b) {
                                    arrayList9.add(next);
                                }
                                z = z4;
                                it = it2;
                            }
                            z2 = z;
                            int size2 = arrayList9.size();
                            Collection values2 = ((LinkedHashMap) crVar4.c).values();
                            ArrayList arrayList10 = new ArrayList();
                            Iterator it3 = values2.iterator();
                            while (it3.hasNext()) {
                                int i3 = size2;
                                Object next2 = it3.next();
                                Iterator it4 = it3;
                                if (((m9b) next2) instanceof i9b) {
                                    arrayList10.add(next2);
                                }
                                size2 = i3;
                                it3 = it4;
                            }
                            int size3 = arrayList10.size() + size2;
                            Collection values3 = ((LinkedHashMap) crVar4.d).values();
                            ArrayList arrayList11 = new ArrayList();
                            Iterator it5 = values3.iterator();
                            while (it5.hasNext()) {
                                int i4 = size3;
                                Object next3 = it5.next();
                                Iterator it6 = it5;
                                if (((m9b) next3) instanceof i9b) {
                                    arrayList11.add(next3);
                                }
                                size3 = i4;
                                it5 = it6;
                            }
                            int size4 = arrayList11.size() + size3;
                            Collection values4 = ((LinkedHashMap) crVar4.e).values();
                            ArrayList arrayList12 = new ArrayList();
                            Iterator it7 = values4.iterator();
                            while (it7.hasNext()) {
                                int i5 = size4;
                                Object next4 = it7.next();
                                Iterator it8 = it7;
                                if (((m9b) next4) instanceof i9b) {
                                    arrayList12.add(next4);
                                }
                                size4 = i5;
                                it7 = it8;
                            }
                            int size5 = arrayList12.size() + size4;
                            Collection values5 = ((LinkedHashMap) crVar4.f).values();
                            ArrayList arrayList13 = new ArrayList();
                            Iterator it9 = values5.iterator();
                            while (it9.hasNext()) {
                                int i6 = size5;
                                Object next5 = it9.next();
                                Iterator it10 = it9;
                                if (((m9b) next5) instanceof i9b) {
                                    arrayList13.add(next5);
                                }
                                size5 = i6;
                                it9 = it10;
                            }
                            int size6 = arrayList13.size() + size5;
                            Collection values6 = ((LinkedHashMap) crVar4.g).values();
                            ArrayList arrayList14 = new ArrayList();
                            for (Object obj12 : values6) {
                                int i7 = size6;
                                if (((m9b) obj12) instanceof i9b) {
                                    arrayList14.add(obj12);
                                }
                                size6 = i7;
                            }
                            num2 = Integer.valueOf(arrayList14.size() + size6);
                        }
                        if (kbaVar3 != null || (crVar3 = kbaVar3.b) == null) {
                            num3 = null;
                        } else {
                            Collection values7 = ((LinkedHashMap) crVar3.b).values();
                            ArrayList arrayList15 = new ArrayList();
                            Iterator it11 = values7.iterator();
                            while (it11.hasNext()) {
                                Object next6 = it11.next();
                                Iterator it12 = it11;
                                if (((m9b) next6) instanceof k9b) {
                                    arrayList15.add(next6);
                                }
                                it11 = it12;
                            }
                            num3 = Integer.valueOf(arrayList15.size());
                        }
                        z3 = kbaVar3 == null && (crVar2 = kbaVar3.b) != null && (linkedHashSet2 = (LinkedHashSet) crVar2.i) != null && linkedHashSet2.isEmpty();
                        String str2 = !z3 ? null : kbaVar3 == null ? "requestingSync" : "applyingChanges";
                        if (z3 && wpkVar3 == null) {
                            wpk wpkVar4 = wpk.Network;
                            str = "Parse";
                        } else {
                            str = wpkVar3 == null ? wpkVar3.a : null;
                        }
                        bx5.a(znk.e, j7);
                        if (z2) {
                            bx5.a(znk.d, j7);
                        } else {
                            bx5.a(znk.c, j7);
                        }
                        String H = znk.H(Long.valueOf(j8));
                        wpk wpkVar5 = wpkVar3;
                        Integer num4 = num3;
                        Pair pair7 = new Pair("start", H);
                        Pair pair8 = new Pair("duration", Double.valueOf(j7 / 1000.0d));
                        Pair pair9 = new Pair("ignoresChecksums", cokVar3 == null ? Boolean.valueOf(!wop.h(cokVar3.b, cokVar3.c).isEmpty()) : null);
                        Pair pair10 = new Pair("isFullSync", Boolean.valueOf(z2));
                        Pair pair11 = new Pair("librarySize", num);
                        Pair pair12 = new Pair("prevFullSync", l3 == null ? znk.H(l3) : null);
                        pair = new Pair("prevSync", l4 == null ? znk.H(l4) : null);
                        pair2 = new Pair("lastState", str2);
                        if (cokVar3 != null || (set2 = cokVar3.a) == null) {
                            pair3 = pair2;
                            pair4 = pair;
                            arrayList = null;
                        } else {
                            Set set3 = set2;
                            pair3 = pair2;
                            pair4 = pair;
                            ArrayList arrayList16 = new ArrayList(v75.o(set3, 10));
                            Iterator it13 = set3.iterator();
                            while (it13.hasNext()) {
                                arrayList16.add(((n43) it13.next()).getKey());
                            }
                            arrayList = arrayList16;
                        }
                        Pair pair13 = new Pair("avrGroups", arrayList);
                        pair5 = new Pair("reloadingEntitiesCount", num2);
                        Pair pair14 = new Pair("updatedAvailabilities", Boolean.valueOf(num4 == null || num4.intValue() != 0));
                        Pair pair15 = new Pair("attempt", 1);
                        if (cokVar3 != null || (set = cokVar3.b) == null) {
                            pair6 = pair5;
                            arrayList2 = null;
                        } else {
                            Set set4 = set;
                            pair6 = pair5;
                            arrayList2 = new ArrayList(v75.o(set4, 10));
                            Iterator it14 = set4.iterator();
                            while (it14.hasNext()) {
                                arrayList2.add(((n43) it14.next()).getKey());
                            }
                        }
                        ot0.A((y60) jyrVar.getValue(), wpkVar5 == null ? "Sync.Success" : "Sync.Failed", uah.e(pair7, pair8, pair9, pair10, pair11, pair12, pair4, pair3, pair13, pair6, pair14, pair15, new Pair("mismatchedChecksumGroups", arrayList2), new Pair("error", str), new Pair("errorInfo", null), new Pair("groupErrors", obj3), new Pair("restarts", null), new Pair("likedTracksCount", valueOf2), new Pair("likedAvailableMusicTracksCount", valueOf), new Pair("downloadsCount", valueOf4), new Pair("downloadedTracksCount", valueOf3)));
                        if (((iok) iok.e.getValue()).h() && z2 && a53Var3 != null && (c63Var = (c63) a53Var3.a) != null) {
                            Pair pair16 = new Pair("autoDownloadTracks", znk.F(c63Var.a));
                            Pair pair17 = new Pair("smartDownloadTracks", znk.F(c63Var.b));
                            Pair pair18 = new Pair("manualDownloadTracks", znk.F(c63Var.c));
                            Pair pair19 = new Pair("albums", znk.F(c63Var.d));
                            ArrayList arrayList17 = c63Var.e;
                            qnk qnkVar = new qnk(19);
                            ArrayList<afa> arrayList18 = arrayList17;
                            ArrayList arrayList19 = new ArrayList(v75.o(arrayList18, 10));
                            for (afa afaVar : arrayList18) {
                                arrayList19.add(qnkVar.invoke(afaVar.a) + "::" + (afaVar.b / 1000));
                            }
                            ot0.A((y60) jyrVar.getValue(), "Sync.DownloadsReport", uah.e(pair16, pair17, pair18, pair19, new Pair("playlist", arrayList19)));
                        }
                        return Unit.a;
                    }
                    long j12 = mrkVar.w;
                    long j13 = mrkVar.v;
                    long j14 = mrkVar.u;
                    long j15 = mrkVar.t;
                    j5 = mrkVar.s;
                    znk znkVar4 = mrkVar.q;
                    wpk wpkVar6 = mrkVar.p;
                    cokVar2 = mrkVar.o;
                    Object obj13 = (Map) mrkVar.n;
                    p73 p73Var4 = mrkVar.m;
                    kba kbaVar4 = mrkVar.l;
                    irk irkVar4 = mrkVar.k;
                    yqk yqkVar3 = mrkVar.j;
                    qgg.h0(obj4);
                    j4 = j12;
                    obj = obj13;
                    j3 = j14;
                    obj2 = obj4;
                    irkVar2 = irkVar4;
                    yqkVar2 = yqkVar3;
                    kbaVar2 = kbaVar4;
                    p73Var2 = p73Var4;
                    j9 = j13;
                    wpkVar2 = wpkVar6;
                    j10 = j15;
                    znkVar = znkVar4;
                }
                Long l6 = (Long) obj2;
                mrkVar.j = null;
                mrkVar.k = irkVar2;
                mrkVar.l = kbaVar2;
                mrkVar.m = p73Var2;
                mrkVar.n = (Map) obj;
                mrkVar.o = cokVar2;
                mrkVar.p = wpkVar2;
                mrkVar.q = znkVar;
                mrkVar.r = l6;
                mrkVar.s = j5;
                mrkVar.t = j10;
                mrkVar.u = j3;
                mrkVar.v = j9;
                long j16 = j4;
                mrkVar.w = j16;
                mrkVar.y = 2;
                c = yqkVar2.c(mrkVar);
                if (c != nm6Var) {
                    return nm6Var;
                }
                obj3 = obj;
                irkVar3 = irkVar2;
                cokVar3 = cokVar2;
                obj4 = c;
                znkVar2 = znkVar;
                wpk wpkVar7 = wpkVar2;
                kbaVar3 = kbaVar2;
                l = l6;
                j6 = j9;
                j7 = j16;
                wpkVar3 = wpkVar7;
                l2 = (Long) obj4;
                jyr jyrVar22 = ((bx5) znkVar2.b).a;
                irkVar3.getClass();
                if (irkVar3 != irk.a) {
                }
                if (kbaVar3 != null) {
                }
                j8 = j6;
                num = null;
                if (p73Var2 == null) {
                }
                if (a53Var != null) {
                }
                if (kbaVar3 != null) {
                }
                if (p73Var2 == null) {
                }
                if (a53Var2 != null) {
                }
                if (p73Var2 == null) {
                }
                if (a53Var3 != null) {
                }
                if (a53Var3 != null) {
                }
                if (kbaVar3 != null) {
                }
                l4 = l2;
                z2 = z;
                num2 = null;
                if (kbaVar3 != null) {
                }
                num3 = null;
                if (kbaVar3 == null) {
                }
                if (!z3) {
                }
                if (z3) {
                }
                if (wpkVar3 == null) {
                }
                bx5.a(znk.e, j7);
                if (z2) {
                }
                String H2 = znk.H(Long.valueOf(j8));
                wpk wpkVar52 = wpkVar3;
                Integer num42 = num3;
                Pair pair72 = new Pair("start", H2);
                Pair pair82 = new Pair("duration", Double.valueOf(j7 / 1000.0d));
                Pair pair92 = new Pair("ignoresChecksums", cokVar3 == null ? Boolean.valueOf(!wop.h(cokVar3.b, cokVar3.c).isEmpty()) : null);
                Pair pair102 = new Pair("isFullSync", Boolean.valueOf(z2));
                Pair pair112 = new Pair("librarySize", num);
                Pair pair122 = new Pair("prevFullSync", l3 == null ? znk.H(l3) : null);
                pair = new Pair("prevSync", l4 == null ? znk.H(l4) : null);
                pair2 = new Pair("lastState", str2);
                if (cokVar3 != null) {
                }
                pair3 = pair2;
                pair4 = pair;
                arrayList = null;
                Pair pair132 = new Pair("avrGroups", arrayList);
                pair5 = new Pair("reloadingEntitiesCount", num2);
                if (num42 == null) {
                    Pair pair142 = new Pair("updatedAvailabilities", Boolean.valueOf(num42 == null || num42.intValue() != 0));
                    Pair pair152 = new Pair("attempt", 1);
                    if (cokVar3 != null) {
                    }
                    pair6 = pair5;
                    arrayList2 = null;
                    ot0.A((y60) jyrVar.getValue(), wpkVar52 == null ? "Sync.Success" : "Sync.Failed", uah.e(pair72, pair82, pair92, pair102, pair112, pair122, pair4, pair3, pair132, pair6, pair142, pair152, new Pair("mismatchedChecksumGroups", arrayList2), new Pair("error", str), new Pair("errorInfo", null), new Pair("groupErrors", obj3), new Pair("restarts", null), new Pair("likedTracksCount", valueOf2), new Pair("likedAvailableMusicTracksCount", valueOf), new Pair("downloadsCount", valueOf4), new Pair("downloadedTracksCount", valueOf3)));
                    if (((iok) iok.e.getValue()).h()) {
                        Pair pair162 = new Pair("autoDownloadTracks", znk.F(c63Var.a));
                        Pair pair172 = new Pair("smartDownloadTracks", znk.F(c63Var.b));
                        Pair pair182 = new Pair("manualDownloadTracks", znk.F(c63Var.c));
                        Pair pair192 = new Pair("albums", znk.F(c63Var.d));
                        ArrayList arrayList172 = c63Var.e;
                        qnk qnkVar2 = new qnk(19);
                        ArrayList<afa> arrayList182 = arrayList172;
                        ArrayList arrayList192 = new ArrayList(v75.o(arrayList182, 10));
                        while (r0.hasNext()) {
                        }
                        ot0.A((y60) jyrVar.getValue(), "Sync.DownloadsReport", uah.e(pair162, pair172, pair182, pair192, new Pair("playlist", arrayList192)));
                    }
                    return Unit.a;
                }
                Pair pair1422 = new Pair("updatedAvailabilities", Boolean.valueOf(num42 == null || num42.intValue() != 0));
                Pair pair1522 = new Pair("attempt", 1);
                if (cokVar3 != null) {
                }
                pair6 = pair5;
                arrayList2 = null;
                ot0.A((y60) jyrVar.getValue(), wpkVar52 == null ? "Sync.Success" : "Sync.Failed", uah.e(pair72, pair82, pair92, pair102, pair112, pair122, pair4, pair3, pair132, pair6, pair1422, pair1522, new Pair("mismatchedChecksumGroups", arrayList2), new Pair("error", str), new Pair("errorInfo", null), new Pair("groupErrors", obj3), new Pair("restarts", null), new Pair("likedTracksCount", valueOf2), new Pair("likedAvailableMusicTracksCount", valueOf), new Pair("downloadsCount", valueOf4), new Pair("downloadedTracksCount", valueOf3)));
                if (((iok) iok.e.getValue()).h()) {
                }
                return Unit.a;
            }
        }
        mrkVar = new mrk(cg6Var);
        Object obj42 = mrkVar.x;
        nm6Var = nm6.a;
        i = mrkVar.y;
        if (i != 0) {
        }
        Long l62 = (Long) obj2;
        mrkVar.j = null;
        mrkVar.k = irkVar2;
        mrkVar.l = kbaVar2;
        mrkVar.m = p73Var2;
        mrkVar.n = (Map) obj;
        mrkVar.o = cokVar2;
        mrkVar.p = wpkVar2;
        mrkVar.q = znkVar;
        mrkVar.r = l62;
        mrkVar.s = j5;
        mrkVar.t = j10;
        mrkVar.u = j3;
        mrkVar.v = j9;
        long j162 = j4;
        mrkVar.w = j162;
        mrkVar.y = 2;
        c = yqkVar2.c(mrkVar);
        if (c != nm6Var) {
        }
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new nrk(this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nrk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x06c8, code lost:
    
        if (r2.i(defpackage.k43.a, r0, r31) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x071e, code lost:
    
        if (r6 == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05f6, code lost:
    
        if (r2.i(r17, r0, r31) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x063c, code lost:
    
        if (r2.i(defpackage.g43.a, r0, r31) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0679, code lost:
    
        if (r2.i(defpackage.h43.a, r0, r31) == r1) goto L103;
     */
    /* JADX WARN: Path cross not found for [B:83:0x0601, B:76:0x05bf], limit reached: 225 */
    /* JADX WARN: Path cross not found for [B:89:0x0640, B:85:0x0607], limit reached: 225 */
    /* JADX WARN: Path cross not found for [B:95:0x067d, B:91:0x0644], limit reached: 225 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x089b A[LOOP:1: B:26:0x0895->B:28:0x089b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x059f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x05f6 -> B:59:0x06e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x06e2 -> B:59:0x06e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x063c -> B:59:0x06e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0679 -> B:59:0x06e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x06c8 -> B:59:0x06e4). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y9w y9wVar;
        Object c;
        yqk yqkVar;
        bqi bqiVar;
        Object g;
        yqk yqkVar2;
        Object a;
        Object b;
        long j;
        long j2;
        long j3;
        yqk yqkVar3;
        int i;
        hok hokVar;
        xdr xdrVar;
        Object a2;
        Object obj2;
        long j4;
        long j5;
        xdr xdrVar2;
        hok hokVar2;
        j43 j43Var;
        vpk vpkVar;
        yqk yqkVar4;
        irk irkVar;
        int i2;
        long j6;
        int i3;
        Object G;
        List list;
        String str;
        Object s;
        Throwable a3;
        wpk wpkVar;
        wpk wpkVar2;
        int i4;
        long j7;
        irk irkVar2;
        yqk yqkVar5;
        p73 p73Var;
        String str2;
        Object l;
        nm6 nm6Var;
        int i5;
        yqk yqkVar6;
        List list2;
        kba kbaVar;
        cr crVar;
        epk epkVar;
        int i6;
        String str3;
        yqk yqkVar7;
        nm6 nm6Var2;
        int i7;
        long j8;
        cr crVar2;
        kba kbaVar2;
        yqk yqkVar8;
        String str4;
        p73 p73Var2;
        cr crVar3;
        Iterator it;
        Object V;
        ork orkVar;
        nm6 nm6Var3;
        int i8;
        Iterator it2;
        ork orkVar2;
        yqk yqkVar9;
        cok cokVar;
        long j9;
        kba kbaVar3;
        List list3;
        yqk yqkVar10;
        Object a4;
        p73 p73Var3;
        int i9;
        long j10;
        cok cokVar2;
        long j11;
        p73 p73Var4;
        Object c2;
        int i10;
        fs7 fs7Var;
        xdr xdrVar3;
        yqk yqkVar11;
        kba kbaVar4;
        irk irkVar3;
        List list4;
        long j12;
        nm6 nm6Var4;
        irk irkVar4;
        LinkedHashMap linkedHashMap;
        Iterator it3;
        ork orkVar3 = this.B;
        hok hokVar3 = orkVar3.a;
        xdr xdrVar4 = orkVar3.m;
        y9w y9wVar2 = orkVar3.e;
        nm6 nm6Var5 = nm6.a;
        int i11 = this.z;
        j43 j43Var2 = j43.a;
        String str5 = this.A;
        switch (i11) {
            case 0:
                y9wVar = y9wVar2;
                qgg.h0(obj);
                if (Intrinsics.d(str5, CommonUrlParts.Values.FALSE_INTEGER)) {
                    y9wVar.getClass();
                    Assertions.throwOrSkip("PhonotekaSynchronizer", new FailedAssertionException("Can not run sync without user"));
                    return Unit.a;
                }
                if (!(xdrVar4.getValue() instanceof erk)) {
                    return Unit.a;
                }
                yqk p = bfg.p(orkVar3.b, str5);
                this.j = p;
                this.k = xdrVar4;
                this.z = 1;
                c = p.c(this);
                if (c == nm6Var5) {
                    return nm6Var5;
                }
                yqkVar = p;
                bqiVar = xdrVar4;
                frk frkVar = new frk((Long) c);
                xdr xdrVar5 = (xdr) bqiVar;
                xdrVar5.getClass();
                xdrVar5.m(null, frkVar);
                this.j = yqkVar;
                this.k = null;
                this.z = 2;
                g = yqkVar.g(this);
                if (g == nm6Var5) {
                    return nm6Var5;
                }
                if (((Boolean) g).booleanValue()) {
                    this.j = yqkVar;
                    this.z = 3;
                    if (yqkVar.i(j43Var2, -1, this) == nm6Var5) {
                        return nm6Var5;
                    }
                    yqkVar2 = yqkVar;
                    this.j = yqkVar2;
                    this.z = 4;
                    a = lmm.a(yqkVar2.a, new kqk(2, null), this);
                    if (a != nm6Var5) {
                        a = Unit.a;
                    }
                    if (a == nm6Var5) {
                        return nm6Var5;
                    }
                    yqkVar = yqkVar2;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long currentTimeMillis2 = System.currentTimeMillis();
                hokVar3.getClass();
                long j13 = currentTimeMillis2 - 1800000;
                this.j = yqkVar;
                this.t = currentTimeMillis;
                this.u = elapsedRealtime;
                this.v = j13;
                this.z = 5;
                b = yqkVar.b(this);
                if (b == nm6Var5) {
                    return nm6Var5;
                }
                j = currentTimeMillis;
                j2 = elapsedRealtime;
                j3 = j13;
                yqkVar3 = yqkVar;
                Long l2 = (Long) b;
                i = j3 <= (l2 == null ? l2.longValue() : 0L) ? 1 : 0;
                long currentTimeMillis3 = System.currentTimeMillis();
                hokVar3.getClass();
                hokVar = hokVar3;
                xdrVar = xdrVar4;
                long j14 = currentTimeMillis3 - 86400000;
                this.j = yqkVar3;
                this.t = j;
                this.u = j2;
                this.w = i;
                this.v = j14;
                this.z = 6;
                a2 = yqkVar3.a(this);
                if (a2 != nm6Var5) {
                    return nm6Var5;
                }
                obj2 = a2;
                j4 = j2;
                j5 = j14;
                Long l3 = (Long) obj2;
                int i12 = j5 <= (l3 == null ? l3.longValue() : 0L) ? 1 : 0;
                irk irkVar5 = i12 == 0 ? irk.a : i != 0 ? irk.b : irk.c;
                y9wVar.getClass();
                xdrVar2 = xdrVar;
                hokVar2 = hokVar;
                j43Var = j43Var2;
                ssg.a(4, "PhonotekaSynchronizer", "start " + irkVar5 + " sync for " + str5, null);
                vpkVar = orkVar3.h;
                this.j = yqkVar3;
                this.k = irkVar5;
                this.t = j;
                this.u = j4;
                this.w = i;
                this.x = i12;
                this.z = 7;
                if (vpkVar.h(str5, this) != nm6Var5) {
                    return nm6Var5;
                }
                yqkVar4 = yqkVar3;
                irkVar = irkVar5;
                i2 = i;
                j6 = j4;
                i3 = i12;
                t1f t1fVar = orkVar3.g;
                Set set = hokVar2.a;
                this.j = yqkVar4;
                this.k = irkVar;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 8;
                G = t1fVar.G(str5, set, this);
                if (G == nm6Var5) {
                    return nm6Var5;
                }
                list = (List) G;
                y9wVar.getClass();
                list.getClass();
                str = str5;
                ssg.a(4, "PhonotekaSynchronizer", "read local blocks\n".concat(CollectionsKt.X(list, StringUtil.LF, null, null, new qnk(23), 30)), null);
                g8c g8cVar = orkVar3.f;
                this.j = yqkVar4;
                this.k = irkVar;
                this.l = list;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 9;
                s = g8cVar.s(list, this);
                if (s == nm6Var5) {
                    return nm6Var5;
                }
                a3 = z7o.a(s);
                if (a3 == null) {
                    PhonotekaSyncException phonotekaSyncException = a3 instanceof PhonotekaSyncException ? (PhonotekaSyncException) a3 : null;
                    if (phonotekaSyncException == null || (wpkVar = phonotekaSyncException.a) == null) {
                        wpkVar = wpk.Unknown;
                    }
                    this.j = yqkVar4;
                    this.k = irkVar;
                    this.l = null;
                    this.m = orkVar3;
                    this.n = null;
                    this.o = wpkVar;
                    this.t = j;
                    this.u = j6;
                    this.w = i2;
                    this.x = i3;
                    this.y = 0;
                    this.z = 10;
                    if (k(orkVar3, yqkVar4, wpkVar, a3, this) == nm6Var5) {
                        return nm6Var5;
                    }
                    wpkVar2 = wpkVar;
                    i4 = 0;
                    j7 = j6;
                    irkVar2 = irkVar;
                    yqkVar5 = yqkVar4;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.t = j;
                    this.u = j7;
                    this.w = i2;
                    this.x = i3;
                    this.y = i4;
                    this.z = 11;
                    if (l(orkVar3, j, j7, yqkVar5, irkVar2, null, null, null, null, wpkVar2, this) == nm6Var5) {
                        return nm6Var5;
                    }
                    return Unit.a;
                }
                List list5 = (List) s;
                y9wVar.getClass();
                list5.getClass();
                ssg.a(4, "PhonotekaSynchronizer", "download sync blocks\n".concat(CollectionsKt.X(list5, StringUtil.LF, null, null, new qnk(24), 30)), null);
                p73Var = new p73(list, list5);
                m mVar = orkVar3.j;
                this.j = yqkVar4;
                this.k = irkVar;
                this.l = null;
                this.m = list5;
                this.n = p73Var;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 12;
                str2 = str;
                l = mVar.l(str2, p73Var, irkVar, this);
                nm6Var = nm6Var5;
                if (l == nm6Var) {
                    return nm6Var;
                }
                i5 = i3;
                yqkVar6 = yqkVar4;
                list2 = list5;
                kbaVar = (kba) l;
                nm6 nm6Var6 = nm6Var;
                crVar = kbaVar.b;
                String str6 = str2;
                int i13 = i5;
                d1j d1jVar = new d1j(12, crVar);
                y9wVar.getClass();
                int i14 = i2;
                ssg.a(4, "PhonotekaSynchronizer", (String) d1jVar.invoke(), null);
                epkVar = orkVar3.i;
                this.j = yqkVar6;
                this.k = irkVar;
                this.l = null;
                this.m = list2;
                this.n = p73Var;
                this.o = kbaVar;
                this.p = crVar;
                this.t = j;
                this.u = j6;
                this.w = i14;
                i6 = i13;
                this.x = i6;
                this.z = 13;
                str3 = str6;
                yqkVar7 = yqkVar6;
                nm6Var2 = nm6Var6;
                if (epkVar.g(str3, p73Var, crVar, this) != nm6Var2) {
                    i7 = i14;
                    j8 = j6;
                    crVar2 = crVar;
                    kbaVar2 = kbaVar;
                    yqkVar8 = yqkVar7;
                    str4 = str3;
                    p73Var2 = p73Var;
                    crVar3 = crVar2;
                    it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            nnd nndVar = orkVar3.k;
                            this.j = yqkVar8;
                            this.k = irkVar;
                            this.l = null;
                            this.m = list2;
                            this.n = p73Var2;
                            this.o = kbaVar2;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.t = j;
                            this.u = j8;
                            this.w = i7;
                            this.x = i6;
                            this.z = 18;
                            V = nndVar.V(str4, p73Var2, this);
                            break;
                        } else {
                            orkVar = orkVar3;
                            jwr jwrVar = (jwr) it.next();
                            nm6Var3 = nm6Var2;
                            i8 = i6;
                            if (((LinkedHashSet) crVar3.i).contains(jwrVar.getType())) {
                                i6 = i8;
                                orkVar3 = orkVar;
                                nm6Var2 = nm6Var3;
                            } else if (jwrVar instanceof fwr) {
                                Integer num = ((fwr) jwrVar).a.a;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    this.j = yqkVar8;
                                    this.k = irkVar;
                                    this.l = null;
                                    this.m = list2;
                                    this.n = p73Var2;
                                    this.o = kbaVar2;
                                    this.p = crVar3;
                                    this.q = it;
                                    this.r = null;
                                    this.t = j;
                                    this.u = j8;
                                    this.w = i7;
                                    i6 = i8;
                                    this.x = i6;
                                    this.y = intValue;
                                    this.z = 14;
                                    nm6Var2 = nm6Var3;
                                    break;
                                } else {
                                    i6 = i8;
                                    it2 = it;
                                    nm6Var2 = nm6Var3;
                                    it = it2;
                                }
                            } else {
                                i6 = i8;
                                if (jwrVar instanceof cwr) {
                                    Integer num2 = ((cwr) jwrVar).a.a;
                                    if (num2 != null) {
                                        int intValue2 = num2.intValue();
                                        this.j = yqkVar8;
                                        this.k = irkVar;
                                        this.l = null;
                                        this.m = list2;
                                        this.n = p73Var2;
                                        this.o = kbaVar2;
                                        this.p = crVar3;
                                        this.q = it;
                                        this.r = null;
                                        this.t = j;
                                        this.u = j8;
                                        this.w = i7;
                                        this.x = i6;
                                        this.y = intValue2;
                                        this.z = 15;
                                        nm6Var2 = nm6Var3;
                                        break;
                                    }
                                    it2 = it;
                                    nm6Var2 = nm6Var3;
                                    it = it2;
                                } else if (jwrVar instanceof dwr) {
                                    Integer num3 = ((dwr) jwrVar).a.a;
                                    if (num3 != null) {
                                        int intValue3 = num3.intValue();
                                        this.j = yqkVar8;
                                        this.k = irkVar;
                                        this.l = null;
                                        this.m = list2;
                                        this.n = p73Var2;
                                        this.o = kbaVar2;
                                        this.p = crVar3;
                                        this.q = it;
                                        this.r = null;
                                        this.t = j;
                                        this.u = j8;
                                        this.w = i7;
                                        this.x = i6;
                                        this.y = intValue3;
                                        this.z = 16;
                                        nm6Var2 = nm6Var3;
                                        break;
                                    }
                                    it2 = it;
                                    nm6Var2 = nm6Var3;
                                    it = it2;
                                } else {
                                    if (!(jwrVar instanceof ewr) && !(jwrVar instanceof hwr) && !(jwrVar instanceof iwr)) {
                                        if (jwrVar instanceof gwr) {
                                            Integer num4 = ((gwr) jwrVar).a.a;
                                            if (num4 != null) {
                                                int intValue4 = num4.intValue();
                                                this.j = yqkVar8;
                                                this.k = irkVar;
                                                this.l = null;
                                                this.m = list2;
                                                this.n = p73Var2;
                                                this.o = kbaVar2;
                                                this.p = crVar3;
                                                this.q = it;
                                                this.r = null;
                                                this.t = j;
                                                this.u = j8;
                                                this.w = i7;
                                                this.x = i6;
                                                this.y = intValue4;
                                                this.z = 17;
                                                nm6Var2 = nm6Var3;
                                                break;
                                            } else {
                                                nm6Var2 = nm6Var3;
                                                it2 = it;
                                            }
                                        } else {
                                            it2 = it;
                                            nm6Var2 = nm6Var3;
                                            if (!jwrVar.equals(awr.a) && !(jwrVar instanceof bwr)) {
                                                b6e.s();
                                                return null;
                                            }
                                        }
                                        it = it2;
                                        break;
                                    }
                                    it2 = it;
                                    nm6Var2 = nm6Var3;
                                    it = it2;
                                }
                            }
                        }
                    }
                    cok cokVar3 = (cok) V;
                    cokVar3.c.isEmpty();
                    if (i6 == 0) {
                        this.j = yqkVar8;
                        this.k = irkVar;
                        this.l = null;
                        this.m = list2;
                        this.n = p73Var2;
                        this.o = kbaVar2;
                        this.p = null;
                        this.q = cokVar3;
                        this.t = j;
                        this.u = j8;
                        this.w = i7;
                        this.x = i6;
                        this.z = 19;
                        hmm.a aVar = yqk.b;
                        int i15 = i7;
                        long j15 = j8;
                        orkVar2 = orkVar3;
                        yqkVar9 = yqkVar8;
                        Object a5 = lmm.a(yqkVar8.a, new sqk(System.currentTimeMillis(), null), this);
                        if (a5 != nm6.a) {
                            a5 = Unit.a;
                        }
                        if (a5 != nm6Var2) {
                            i7 = i15;
                            j8 = j15;
                        }
                    } else {
                        orkVar2 = orkVar3;
                        yqkVar9 = yqkVar8;
                    }
                    long j16 = j;
                    cokVar = cokVar3;
                    j9 = j16;
                    kbaVar3 = kbaVar2;
                    list3 = list2;
                    yqkVar10 = yqkVar9;
                    if (i7 != 0) {
                        this.j = yqkVar10;
                        this.k = irkVar;
                        this.l = null;
                        this.m = list3;
                        this.n = p73Var2;
                        this.o = kbaVar3;
                        this.p = null;
                        this.q = cokVar;
                        this.t = j9;
                        this.u = j8;
                        this.w = i7;
                        this.x = i6;
                        this.z = 20;
                        hmm.a aVar2 = yqk.b;
                        int i16 = i7;
                        long j17 = j8;
                        Object a6 = lmm.a(yqkVar10.a, new tqk(System.currentTimeMillis(), null), this);
                        if (a6 != nm6.a) {
                            a6 = Unit.a;
                        }
                        if (a6 != nm6Var2) {
                            i7 = i16;
                            j8 = j17;
                        }
                    }
                    this.j = yqkVar10;
                    this.k = irkVar;
                    this.l = null;
                    this.m = list3;
                    this.n = p73Var2;
                    this.o = kbaVar3;
                    this.p = null;
                    this.q = cokVar;
                    this.t = j9;
                    this.u = j8;
                    this.w = i7;
                    this.x = i6;
                    this.z = 21;
                    hmm.a aVar3 = yqk.b;
                    int i17 = i7;
                    long j18 = j8;
                    a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                    if (a4 != nm6.a) {
                        a4 = Unit.a;
                    }
                    if (a4 != nm6Var2) {
                        p73Var3 = p73Var2;
                        i9 = i17;
                        j10 = j18;
                        List list6 = list3;
                        cokVar2 = cokVar;
                        irk irkVar6 = irkVar;
                        j11 = j9;
                        fs7 fs7Var2 = fs7.g;
                        this.j = yqkVar10;
                        this.k = irkVar6;
                        this.l = null;
                        this.m = list6;
                        this.n = p73Var3;
                        this.o = kbaVar3;
                        this.p = null;
                        this.q = cokVar2;
                        xdr xdrVar6 = xdrVar2;
                        this.r = xdrVar6;
                        this.s = fs7Var2;
                        this.t = j11;
                        this.u = j10;
                        this.w = i9;
                        this.x = i6;
                        p73Var4 = p73Var3;
                        this.z = 22;
                        c2 = yqkVar10.c(this);
                        if (c2 != nm6Var2) {
                            long j19 = j10;
                            i10 = i9;
                            fs7Var = fs7Var2;
                            xdrVar3 = xdrVar6;
                            yqkVar11 = yqkVar10;
                            kbaVar4 = kbaVar3;
                            irkVar3 = irkVar6;
                            list4 = list6;
                            j12 = j19;
                            nm6Var4 = nm6Var2;
                            erk erkVar = new erk(fs7Var, (Long) c2);
                            xdrVar3.getClass();
                            xdrVar3.m(null, erkVar);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list4) {
                                if (obj3 instanceof bwr) {
                                    arrayList.add(obj3);
                                }
                            }
                            int a7 = tah.a(v75.o(arrayList, 10));
                            int i18 = a7 >= 16 ? 16 : a7;
                            irkVar4 = irkVar3;
                            linkedHashMap = new LinkedHashMap(i18);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                bwr bwrVar = (bwr) it3.next();
                                linkedHashMap.put(bwrVar.a.getKey(), bwrVar.b.b);
                            }
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.s = null;
                            this.t = j11;
                            this.u = j12;
                            this.w = i10;
                            this.x = i6;
                            this.z = 23;
                            if (l(orkVar2, j11, j12, yqkVar11, irkVar4, kbaVar4, p73Var4, linkedHashMap, cokVar2, null, this) == nm6Var4) {
                                return nm6Var4;
                            }
                            return Unit.a;
                        }
                    }
                }
                return nm6Var2;
            case 1:
                y9wVar = y9wVar2;
                bqiVar = (bqi) this.k;
                yqk yqkVar12 = this.j;
                qgg.h0(obj);
                yqkVar = yqkVar12;
                c = obj;
                frk frkVar2 = new frk((Long) c);
                xdr xdrVar52 = (xdr) bqiVar;
                xdrVar52.getClass();
                xdrVar52.m(null, frkVar2);
                this.j = yqkVar;
                this.k = null;
                this.z = 2;
                g = yqkVar.g(this);
                if (g == nm6Var5) {
                }
                if (((Boolean) g).booleanValue()) {
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long currentTimeMillis22 = System.currentTimeMillis();
                hokVar3.getClass();
                long j132 = currentTimeMillis22 - 1800000;
                this.j = yqkVar;
                this.t = currentTimeMillis4;
                this.u = elapsedRealtime2;
                this.v = j132;
                this.z = 5;
                b = yqkVar.b(this);
                if (b == nm6Var5) {
                }
                break;
            case 2:
                y9wVar = y9wVar2;
                yqk yqkVar13 = this.j;
                qgg.h0(obj);
                yqkVar = yqkVar13;
                g = obj;
                if (((Boolean) g).booleanValue()) {
                }
                long currentTimeMillis42 = System.currentTimeMillis();
                long elapsedRealtime22 = SystemClock.elapsedRealtime();
                long currentTimeMillis222 = System.currentTimeMillis();
                hokVar3.getClass();
                long j1322 = currentTimeMillis222 - 1800000;
                this.j = yqkVar;
                this.t = currentTimeMillis42;
                this.u = elapsedRealtime22;
                this.v = j1322;
                this.z = 5;
                b = yqkVar.b(this);
                if (b == nm6Var5) {
                }
                break;
            case 3:
                y9wVar = y9wVar2;
                yqkVar2 = this.j;
                qgg.h0(obj);
                this.j = yqkVar2;
                this.z = 4;
                a = lmm.a(yqkVar2.a, new kqk(2, null), this);
                if (a != nm6Var5) {
                }
                if (a == nm6Var5) {
                }
                yqkVar = yqkVar2;
                long currentTimeMillis422 = System.currentTimeMillis();
                long elapsedRealtime222 = SystemClock.elapsedRealtime();
                long currentTimeMillis2222 = System.currentTimeMillis();
                hokVar3.getClass();
                long j13222 = currentTimeMillis2222 - 1800000;
                this.j = yqkVar;
                this.t = currentTimeMillis422;
                this.u = elapsedRealtime222;
                this.v = j13222;
                this.z = 5;
                b = yqkVar.b(this);
                if (b == nm6Var5) {
                }
                break;
            case 4:
                y9wVar = y9wVar2;
                yqkVar2 = this.j;
                qgg.h0(obj);
                yqkVar = yqkVar2;
                long currentTimeMillis4222 = System.currentTimeMillis();
                long elapsedRealtime2222 = SystemClock.elapsedRealtime();
                long currentTimeMillis22222 = System.currentTimeMillis();
                hokVar3.getClass();
                long j132222 = currentTimeMillis22222 - 1800000;
                this.j = yqkVar;
                this.t = currentTimeMillis4222;
                this.u = elapsedRealtime2222;
                this.v = j132222;
                this.z = 5;
                b = yqkVar.b(this);
                if (b == nm6Var5) {
                }
                break;
            case 5:
                y9wVar = y9wVar2;
                long j20 = this.v;
                long j21 = this.u;
                j = this.t;
                yqkVar3 = this.j;
                qgg.h0(obj);
                j3 = j20;
                j2 = j21;
                b = obj;
                Long l22 = (Long) b;
                if (j3 <= (l22 == null ? l22.longValue() : 0L)) {
                }
                long currentTimeMillis32 = System.currentTimeMillis();
                hokVar3.getClass();
                hokVar = hokVar3;
                xdrVar = xdrVar4;
                long j142 = currentTimeMillis32 - 86400000;
                this.j = yqkVar3;
                this.t = j;
                this.u = j2;
                this.w = i;
                this.v = j142;
                this.z = 6;
                a2 = yqkVar3.a(this);
                if (a2 != nm6Var5) {
                }
                break;
            case 6:
                y9wVar = y9wVar2;
                long j22 = this.v;
                i = this.w;
                long j23 = this.u;
                long j24 = this.t;
                yqk yqkVar14 = this.j;
                qgg.h0(obj);
                hokVar = hokVar3;
                yqkVar3 = yqkVar14;
                xdrVar = xdrVar4;
                j4 = j23;
                j = j24;
                j5 = j22;
                obj2 = obj;
                Long l32 = (Long) obj2;
                if (j5 <= (l32 == null ? l32.longValue() : 0L)) {
                }
                if (i12 == 0) {
                }
                y9wVar.getClass();
                xdrVar2 = xdrVar;
                hokVar2 = hokVar;
                j43Var = j43Var2;
                ssg.a(4, "PhonotekaSynchronizer", "start " + irkVar5 + " sync for " + str5, null);
                vpkVar = orkVar3.h;
                this.j = yqkVar3;
                this.k = irkVar5;
                this.t = j;
                this.u = j4;
                this.w = i;
                this.x = i12;
                this.z = 7;
                if (vpkVar.h(str5, this) != nm6Var5) {
                }
                break;
            case 7:
                int i19 = this.x;
                int i20 = this.w;
                long j25 = this.u;
                long j26 = this.t;
                irk irkVar7 = (irk) this.k;
                y9wVar = y9wVar2;
                yqk yqkVar15 = this.j;
                qgg.h0(obj);
                hokVar2 = hokVar3;
                xdrVar2 = xdrVar4;
                i3 = i19;
                i2 = i20;
                j43Var = j43Var2;
                yqkVar4 = yqkVar15;
                irkVar = irkVar7;
                j6 = j25;
                j = j26;
                t1f t1fVar2 = orkVar3.g;
                Set set2 = hokVar2.a;
                this.j = yqkVar4;
                this.k = irkVar;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 8;
                G = t1fVar2.G(str5, set2, this);
                if (G == nm6Var5) {
                }
                list = (List) G;
                y9wVar.getClass();
                list.getClass();
                str = str5;
                ssg.a(4, "PhonotekaSynchronizer", "read local blocks\n".concat(CollectionsKt.X(list, StringUtil.LF, null, null, new qnk(23), 30)), null);
                g8c g8cVar2 = orkVar3.f;
                this.j = yqkVar4;
                this.k = irkVar;
                this.l = list;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 9;
                s = g8cVar2.s(list, this);
                if (s == nm6Var5) {
                }
                a3 = z7o.a(s);
                if (a3 == null) {
                }
                break;
            case 8:
                i3 = this.x;
                i2 = this.w;
                j6 = this.u;
                j = this.t;
                irkVar = (irk) this.k;
                yqkVar4 = this.j;
                qgg.h0(obj);
                G = obj;
                xdrVar2 = xdrVar4;
                y9wVar = y9wVar2;
                j43Var = j43Var2;
                list = (List) G;
                y9wVar.getClass();
                list.getClass();
                str = str5;
                ssg.a(4, "PhonotekaSynchronizer", "read local blocks\n".concat(CollectionsKt.X(list, StringUtil.LF, null, null, new qnk(23), 30)), null);
                g8c g8cVar22 = orkVar3.f;
                this.j = yqkVar4;
                this.k = irkVar;
                this.l = list;
                this.t = j;
                this.u = j6;
                this.w = i2;
                this.x = i3;
                this.z = 9;
                s = g8cVar22.s(list, this);
                if (s == nm6Var5) {
                }
                a3 = z7o.a(s);
                if (a3 == null) {
                }
                break;
            case 9:
                int i21 = this.x;
                i2 = this.w;
                j6 = this.u;
                j = this.t;
                List list7 = this.l;
                irk irkVar8 = (irk) this.k;
                yqk yqkVar16 = this.j;
                qgg.h0(obj);
                Object obj4 = ((z7o) obj).a;
                xdrVar2 = xdrVar4;
                y9wVar = y9wVar2;
                list = list7;
                irkVar = irkVar8;
                yqkVar4 = yqkVar16;
                s = obj4;
                j43Var = j43Var2;
                i3 = i21;
                str = str5;
                a3 = z7o.a(s);
                if (a3 == null) {
                }
                break;
            case 10:
                i4 = this.y;
                int i22 = this.x;
                int i23 = this.w;
                j7 = this.u;
                long j27 = this.t;
                wpk wpkVar3 = (wpk) this.o;
                ork orkVar4 = (ork) this.m;
                List list8 = this.l;
                irk irkVar9 = (irk) this.k;
                yqk yqkVar17 = this.j;
                qgg.h0(obj);
                wpkVar2 = wpkVar3;
                irkVar2 = irkVar9;
                i3 = i22;
                orkVar3 = orkVar4;
                j = j27;
                yqkVar5 = yqkVar17;
                i2 = i23;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.t = j;
                this.u = j7;
                this.w = i2;
                this.x = i3;
                this.y = i4;
                this.z = 11;
                if (l(orkVar3, j, j7, yqkVar5, irkVar2, null, null, null, null, wpkVar2, this) == nm6Var5) {
                }
                return Unit.a;
            case 11:
                List list9 = this.l;
                qgg.h0(obj);
                return Unit.a;
            case 12:
                int i24 = this.x;
                i2 = this.w;
                long j28 = this.u;
                long j29 = this.t;
                p73 p73Var5 = this.n;
                List list10 = (List) this.m;
                List list11 = this.l;
                irk irkVar10 = (irk) this.k;
                yqkVar6 = this.j;
                qgg.h0(obj);
                l = obj;
                xdrVar2 = xdrVar4;
                y9wVar = y9wVar2;
                i5 = i24;
                str2 = str5;
                p73Var = p73Var5;
                list2 = list10;
                j = j29;
                j6 = j28;
                irkVar = irkVar10;
                j43Var = j43Var2;
                nm6Var = nm6Var5;
                kbaVar = (kba) l;
                nm6 nm6Var62 = nm6Var;
                crVar = kbaVar.b;
                String str62 = str2;
                int i132 = i5;
                d1j d1jVar2 = new d1j(12, crVar);
                y9wVar.getClass();
                int i142 = i2;
                ssg.a(4, "PhonotekaSynchronizer", (String) d1jVar2.invoke(), null);
                epkVar = orkVar3.i;
                this.j = yqkVar6;
                this.k = irkVar;
                this.l = null;
                this.m = list2;
                this.n = p73Var;
                this.o = kbaVar;
                this.p = crVar;
                this.t = j;
                this.u = j6;
                this.w = i142;
                i6 = i132;
                this.x = i6;
                this.z = 13;
                str3 = str62;
                yqkVar7 = yqkVar6;
                nm6Var2 = nm6Var62;
                if (epkVar.g(str3, p73Var, crVar, this) != nm6Var2) {
                }
                return nm6Var2;
            case 13:
                int i25 = this.x;
                i7 = this.w;
                j8 = this.u;
                j = this.t;
                crVar2 = this.p;
                kba kbaVar5 = (kba) this.o;
                p73 p73Var6 = this.n;
                list2 = (List) this.m;
                List list12 = this.l;
                irk irkVar11 = (irk) this.k;
                yqk yqkVar18 = this.j;
                qgg.h0(obj);
                xdrVar2 = xdrVar4;
                kbaVar = kbaVar5;
                i6 = i25;
                yqkVar7 = yqkVar18;
                nm6Var2 = nm6Var5;
                str3 = str5;
                p73Var = p73Var6;
                irkVar = irkVar11;
                j43Var = j43Var2;
                kbaVar2 = kbaVar;
                yqkVar8 = yqkVar7;
                str4 = str3;
                p73Var2 = p73Var;
                crVar3 = crVar2;
                it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i6 = i8;
                    orkVar3 = orkVar;
                    nm6Var2 = nm6Var3;
                }
                cok cokVar32 = (cok) V;
                cokVar32.c.isEmpty();
                if (i6 == 0) {
                }
                long j162 = j;
                cokVar = cokVar32;
                j9 = j162;
                kbaVar3 = kbaVar2;
                list3 = list2;
                yqkVar10 = yqkVar9;
                if (i7 != 0) {
                }
                this.j = yqkVar10;
                this.k = irkVar;
                this.l = null;
                this.m = list3;
                this.n = p73Var2;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar;
                this.t = j9;
                this.u = j8;
                this.w = i7;
                this.x = i6;
                this.z = 21;
                hmm.a aVar32 = yqk.b;
                int i172 = i7;
                long j182 = j8;
                a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                if (a4 != nm6.a) {
                }
                if (a4 != nm6Var2) {
                }
                return nm6Var2;
            case 14:
            case 15:
            case 16:
            case 17:
                int i26 = this.x;
                i7 = this.w;
                j8 = this.u;
                j = this.t;
                it = (Iterator) this.q;
                cr crVar4 = this.p;
                kba kbaVar6 = (kba) this.o;
                p73 p73Var7 = this.n;
                List list13 = (List) this.m;
                List list14 = this.l;
                irk irkVar12 = (irk) this.k;
                yqk yqkVar19 = this.j;
                qgg.h0(obj);
                str4 = str5;
                crVar3 = crVar4;
                i6 = i26;
                orkVar = orkVar3;
                xdrVar2 = xdrVar4;
                yqkVar8 = yqkVar19;
                nm6Var2 = nm6Var5;
                p73Var2 = p73Var7;
                list2 = list13;
                j43Var = j43Var2;
                kbaVar2 = kbaVar6;
                irkVar = irkVar12;
                orkVar3 = orkVar;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i6 = i8;
                    orkVar3 = orkVar;
                    nm6Var2 = nm6Var3;
                }
                cok cokVar322 = (cok) V;
                cokVar322.c.isEmpty();
                if (i6 == 0) {
                }
                long j1622 = j;
                cokVar = cokVar322;
                j9 = j1622;
                kbaVar3 = kbaVar2;
                list3 = list2;
                yqkVar10 = yqkVar9;
                if (i7 != 0) {
                }
                this.j = yqkVar10;
                this.k = irkVar;
                this.l = null;
                this.m = list3;
                this.n = p73Var2;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar;
                this.t = j9;
                this.u = j8;
                this.w = i7;
                this.x = i6;
                this.z = 21;
                hmm.a aVar322 = yqk.b;
                int i1722 = i7;
                long j1822 = j8;
                a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                if (a4 != nm6.a) {
                }
                if (a4 != nm6Var2) {
                }
                return nm6Var2;
            case 18:
                int i27 = this.x;
                i7 = this.w;
                j8 = this.u;
                long j30 = this.t;
                kba kbaVar7 = (kba) this.o;
                p73 p73Var8 = this.n;
                List list15 = (List) this.m;
                List list16 = this.l;
                irk irkVar13 = (irk) this.k;
                yqk yqkVar20 = this.j;
                qgg.h0(obj);
                list2 = list15;
                i6 = i27;
                nm6Var2 = nm6Var5;
                p73Var2 = p73Var8;
                V = obj;
                xdrVar2 = xdrVar4;
                yqkVar8 = yqkVar20;
                irkVar = irkVar13;
                kbaVar2 = kbaVar7;
                j = j30;
                cok cokVar3222 = (cok) V;
                cokVar3222.c.isEmpty();
                if (i6 == 0) {
                }
                long j16222 = j;
                cokVar = cokVar3222;
                j9 = j16222;
                kbaVar3 = kbaVar2;
                list3 = list2;
                yqkVar10 = yqkVar9;
                if (i7 != 0) {
                }
                this.j = yqkVar10;
                this.k = irkVar;
                this.l = null;
                this.m = list3;
                this.n = p73Var2;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar;
                this.t = j9;
                this.u = j8;
                this.w = i7;
                this.x = i6;
                this.z = 21;
                hmm.a aVar3222 = yqk.b;
                int i17222 = i7;
                long j18222 = j8;
                a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                if (a4 != nm6.a) {
                }
                if (a4 != nm6Var2) {
                }
                return nm6Var2;
            case 19:
                int i28 = this.x;
                i7 = this.w;
                j8 = this.u;
                j9 = this.t;
                cokVar = (cok) this.q;
                kbaVar3 = (kba) this.o;
                p73 p73Var9 = this.n;
                list3 = (List) this.m;
                List list17 = this.l;
                irkVar = (irk) this.k;
                yqkVar10 = this.j;
                qgg.h0(obj);
                i6 = i28;
                nm6Var2 = nm6Var5;
                p73Var2 = p73Var9;
                orkVar2 = orkVar3;
                xdrVar2 = xdrVar4;
                if (i7 != 0) {
                }
                this.j = yqkVar10;
                this.k = irkVar;
                this.l = null;
                this.m = list3;
                this.n = p73Var2;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar;
                this.t = j9;
                this.u = j8;
                this.w = i7;
                this.x = i6;
                this.z = 21;
                hmm.a aVar32222 = yqk.b;
                int i172222 = i7;
                long j182222 = j8;
                a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                if (a4 != nm6.a) {
                }
                if (a4 != nm6Var2) {
                }
                return nm6Var2;
            case 20:
                int i29 = this.x;
                i7 = this.w;
                j8 = this.u;
                j9 = this.t;
                cokVar = (cok) this.q;
                kbaVar3 = (kba) this.o;
                p73 p73Var10 = this.n;
                list3 = (List) this.m;
                List list18 = this.l;
                irkVar = (irk) this.k;
                yqkVar10 = this.j;
                qgg.h0(obj);
                i6 = i29;
                nm6Var2 = nm6Var5;
                p73Var2 = p73Var10;
                orkVar2 = orkVar3;
                xdrVar2 = xdrVar4;
                this.j = yqkVar10;
                this.k = irkVar;
                this.l = null;
                this.m = list3;
                this.n = p73Var2;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar;
                this.t = j9;
                this.u = j8;
                this.w = i7;
                this.x = i6;
                this.z = 21;
                hmm.a aVar322222 = yqk.b;
                int i1722222 = i7;
                long j1822222 = j8;
                a4 = lmm.a(yqkVar10.a, new uqk(System.currentTimeMillis(), null), this);
                if (a4 != nm6.a) {
                }
                if (a4 != nm6Var2) {
                }
                return nm6Var2;
            case 21:
                int i30 = this.x;
                int i31 = this.w;
                long j31 = this.u;
                j9 = this.t;
                cokVar = (cok) this.q;
                kbaVar3 = (kba) this.o;
                p73 p73Var11 = this.n;
                list3 = (List) this.m;
                List list19 = this.l;
                irkVar = (irk) this.k;
                yqkVar10 = this.j;
                qgg.h0(obj);
                orkVar2 = orkVar3;
                xdrVar2 = xdrVar4;
                i9 = i31;
                j10 = j31;
                p73Var3 = p73Var11;
                i6 = i30;
                nm6Var2 = nm6Var5;
                List list62 = list3;
                cokVar2 = cokVar;
                irk irkVar62 = irkVar;
                j11 = j9;
                fs7 fs7Var22 = fs7.g;
                this.j = yqkVar10;
                this.k = irkVar62;
                this.l = null;
                this.m = list62;
                this.n = p73Var3;
                this.o = kbaVar3;
                this.p = null;
                this.q = cokVar2;
                xdr xdrVar62 = xdrVar2;
                this.r = xdrVar62;
                this.s = fs7Var22;
                this.t = j11;
                this.u = j10;
                this.w = i9;
                this.x = i6;
                p73Var4 = p73Var3;
                this.z = 22;
                c2 = yqkVar10.c(this);
                if (c2 != nm6Var2) {
                }
                return nm6Var2;
            case 22:
                int i32 = this.x;
                int i33 = this.w;
                long j32 = this.u;
                long j33 = this.t;
                fs7 fs7Var3 = this.s;
                xdr xdrVar7 = this.r;
                cokVar2 = (cok) this.q;
                kba kbaVar8 = (kba) this.o;
                p73 p73Var12 = this.n;
                List list20 = (List) this.m;
                List list21 = this.l;
                irk irkVar14 = (irk) this.k;
                yqk yqkVar21 = this.j;
                qgg.h0(obj);
                orkVar2 = orkVar3;
                c2 = obj;
                yqkVar11 = yqkVar21;
                nm6Var2 = nm6Var5;
                i10 = i33;
                fs7Var = fs7Var3;
                xdrVar3 = xdrVar7;
                list4 = list20;
                j12 = j32;
                irkVar3 = irkVar14;
                i6 = i32;
                p73Var4 = p73Var12;
                kbaVar4 = kbaVar8;
                j11 = j33;
                nm6Var4 = nm6Var2;
                erk erkVar2 = new erk(fs7Var, (Long) c2);
                xdrVar3.getClass();
                xdrVar3.m(null, erkVar2);
                ArrayList arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                }
                int a72 = tah.a(v75.o(arrayList2, 10));
                if (a72 >= 16) {
                }
                irkVar4 = irkVar3;
                linkedHashMap = new LinkedHashMap(i18);
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                }
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = j11;
                this.u = j12;
                this.w = i10;
                this.x = i6;
                this.z = 23;
                if (l(orkVar2, j11, j12, yqkVar11, irkVar4, kbaVar4, p73Var4, linkedHashMap, cokVar2, null, this) == nm6Var4) {
                }
                return Unit.a;
            case 23:
                List list22 = this.l;
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
