package com.anythink.core.common;

import D.y;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.br;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f12081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12082b = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, List<com.anythink.core.common.h.c>> f12083c = new ConcurrentHashMap<>(2);

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, bw> f12084d = new ConcurrentHashMap<>(2);

    private a() {
    }

    private static String a(String str, String str2) {
        return AbstractC4404f.f(str, str2);
    }

    public final void b(String str) {
        synchronized (u.a().a(str)) {
            try {
                List<com.anythink.core.common.h.c> list = this.f12083c.get(str);
                if (list != null) {
                    Collections.sort(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        a(str, -1, true, 2);
    }

    public final void b(com.anythink.core.common.h.c cVar) {
        if (cVar == null) {
            return;
        }
        String aI = cVar.i().aI();
        synchronized (u.a().a(aI)) {
            try {
                List<com.anythink.core.common.h.c> list = this.f12083c.get(aI);
                if (list != null) {
                    list.remove(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a a() {
        if (f12081a == null) {
            synchronized (a.class) {
                try {
                    if (f12081a == null) {
                        f12081a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12081a;
    }

    private static com.anythink.core.common.h.c a(ATBaseAdAdapter aTBaseAdAdapter, long j6) {
        com.anythink.core.common.h.c cVar = new com.anythink.core.common.h.c();
        cVar.a(aTBaseAdAdapter);
        cVar.c(System.currentTimeMillis());
        cVar.b(j6);
        cVar.a(aTBaseAdAdapter.getUnitGroupInfo().G());
        return cVar;
    }

    private static void b(String str, bv bvVar) {
        if (bvVar == null) {
            return;
        }
        bvVar.z();
        bvVar.q();
        bvVar.g();
        int q8 = bvVar.q();
        if (q8 != 3) {
            if (q8 == 4) {
                com.anythink.core.basead.b.a();
                Context g4 = com.anythink.core.common.d.t.b().g();
                com.anythink.core.basead.b.a();
                com.anythink.core.basead.b.b(g4, com.anythink.core.basead.b.a(str, bvVar.z(), bvVar.g()));
                return;
            }
            if (q8 != 7) {
                return;
            }
        }
        ad R8 = bvVar.R();
        com.anythink.core.common.a.c.a().a(str, bvVar.z());
        if (R8 == null || TextUtils.isEmpty(R8.token)) {
            return;
        }
        com.anythink.core.common.a.a.a().b(com.anythink.core.common.d.t.b().g(), R8.token);
    }

    private static boolean a(String str, int i, ATBaseAdAdapter aTBaseAdAdapter) {
        List<com.anythink.core.common.h.c> a9;
        int size;
        if (i == -1 || (a9 = a().a(str)) == null || a9.isEmpty() || (size = a9.size()) < i) {
            return true;
        }
        if (com.anythink.core.common.v.l.a(aTBaseAdAdapter.getUnitGroupInfo(), a9.get(size - 1).o()) != -1) {
            return false;
        }
        int i6 = i - 2;
        Math.max(i6, -1);
        a().a(str, Math.max(i6, -1), false, 11);
        return true;
    }

    private List<com.anythink.core.common.h.c> a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list, long j6) {
        bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        String a9 = a(str, aTBaseAdAdapter.getUnitGroupInfo().z());
        bw bwVar = this.f12084d.get(a9);
        if (bwVar == null) {
            bwVar = new bw(str, unitGroupInfo.z());
            this.f12084d.put(a9, bwVar);
        }
        bwVar.a(unitGroupInfo.ay());
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (BaseAd baseAd : list) {
                baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().af());
                com.anythink.core.common.h.c a10 = a(aTBaseAdAdapter, j6);
                a10.a(baseAd);
                arrayList.add(a10);
            }
            bwVar.a(trackingInfo.aJ(), new br(trackingInfo.aJ(), arrayList));
        } else {
            arrayList.add(a(aTBaseAdAdapter, j6));
            bwVar.a(trackingInfo.aJ(), new br(trackingInfo.aJ(), arrayList));
        }
        if (arrayList.size() == 0) {
            return arrayList;
        }
        a(str, arrayList);
        return arrayList;
    }

    private void a(String str, List<com.anythink.core.common.h.c> list) {
        synchronized (u.a().a(str)) {
            try {
                List<com.anythink.core.common.h.c> list2 = this.f12083c.get(str);
                if (list2 == null) {
                    list2 = Collections.synchronizedList(new ArrayList());
                    this.f12083c.put(str, list2);
                }
                if (list2.size() == 0) {
                    list2.addAll(list);
                } else {
                    int i = 0;
                    bv unitGroupInfo = list.get(0).e().getUnitGroupInfo();
                    while (true) {
                        if (i < list2.size()) {
                            bv unitGroupInfo2 = list2.get(i).e().getUnitGroupInfo();
                            int b9 = com.anythink.core.common.v.l.b(unitGroupInfo, unitGroupInfo2);
                            if (b9 < 0) {
                                list2.addAll(i, list);
                                break;
                            }
                            if (b9 == 0 && unitGroupInfo.aw() < unitGroupInfo2.aw()) {
                                list2.addAll(i, list);
                                break;
                            } else {
                                if (i == list2.size() - 1) {
                                    list2.addAll(list);
                                    break;
                                }
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<com.anythink.core.common.h.c> a(String str) {
        List<com.anythink.core.common.h.c> list = this.f12083c.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        Object a9 = u.a().a(str);
        ArrayList arrayList = new ArrayList();
        synchronized (a9) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final com.anythink.core.common.h.c a(Context context, String str) {
        synchronized (u.a().a(str)) {
            List<com.anythink.core.common.h.c> a9 = a(context, str, false, false, false, (ae) null);
            if (a9 == null || a9.size() <= 0) {
                return null;
            }
            return a9.get(0);
        }
    }

    public final com.anythink.core.common.h.c a(Context context, String str, boolean z3, boolean z6, ae aeVar) {
        synchronized (u.a().a(str)) {
            List<com.anythink.core.common.h.c> a9 = a(context, str, z3, z6, false, aeVar);
            if (a9 == null || a9.size() <= 0) {
                return null;
            }
            return a9.get(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e6 A[Catch: all -> 0x070e, TRY_LEAVE, TryCatch #6 {all -> 0x070e, blocks: (B:267:0x06a3, B:269:0x06ab, B:271:0x06af, B:273:0x06b8, B:275:0x06e6, B:280:0x06d8), top: B:266:0x06a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, all -> 0x03ba, blocks: (B:358:0x001b, B:9:0x0029, B:11:0x0034, B:12:0x003b, B:14:0x004d, B:17:0x004f, B:19:0x0076, B:21:0x007c, B:22:0x0089, B:24:0x008f, B:26:0x0097, B:29:0x0370, B:30:0x00a4, B:33:0x00c5, B:35:0x00ce, B:36:0x00e3, B:39:0x00f6, B:41:0x0101, B:43:0x0116, B:45:0x011c, B:47:0x012a, B:50:0x0142, B:52:0x0148, B:54:0x0156, B:56:0x016a, B:58:0x0174, B:60:0x017f, B:62:0x0185, B:64:0x018b, B:66:0x0199, B:67:0x01ab, B:68:0x01be, B:70:0x01d0, B:72:0x01d4, B:74:0x01dd, B:75:0x01ff, B:79:0x020d, B:80:0x025d, B:86:0x0287, B:88:0x029d, B:90:0x02b0, B:92:0x02bb, B:94:0x02c1, B:95:0x02cb, B:97:0x02ea, B:99:0x02b4, B:82:0x02ec, B:103:0x030d, B:104:0x0336, B:106:0x033f, B:107:0x0342, B:109:0x0348, B:110:0x0353, B:112:0x035a, B:113:0x0369, B:121:0x0384, B:139:0x03bf, B:146:0x03d8, B:149:0x040a, B:151:0x0412, B:152:0x03eb, B:154:0x03f3, B:157:0x0415, B:161:0x041a, B:163:0x042d, B:165:0x0432, B:166:0x045f, B:169:0x0470, B:172:0x0484, B:174:0x04a2, B:176:0x04a8, B:178:0x04b1, B:181:0x04b9, B:183:0x04c7, B:184:0x04cb, B:186:0x04d1, B:189:0x04dd, B:194:0x04eb, B:196:0x04f3, B:200:0x0529, B:201:0x052f, B:244:0x0713, B:246:0x071a, B:249:0x0747, B:253:0x076f, B:255:0x077d, B:278:0x06f6, B:338:0x0508, B:340:0x0510, B:349:0x0479, B:125:0x0398, B:127:0x039e, B:129:0x03ae, B:131:0x03b6), top: B:357:0x001b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.h.c> a(Context context, String str, boolean z3, boolean z6, boolean z9, ae aeVar) {
        Object a9;
        long elapsedRealtime;
        Map<String, Object> a10;
        ATAdInfo aTAdInfo;
        com.anythink.core.d.l lVar;
        List<String> list;
        List<String> list2;
        long j6;
        com.anythink.core.common.h.c cVar;
        boolean z10;
        com.anythink.core.common.h.c cVar2;
        ATAdInfo aTAdInfo2;
        List<String> list3;
        List<String> list4;
        boolean z11;
        com.anythink.core.d.l lVar2;
        f fVar;
        com.anythink.core.common.h.d dVar;
        int i;
        String str2;
        String str3;
        bv bvVar;
        bv bvVar2;
        bv bvVar3;
        String str4;
        ATBaseAdAdapter aTBaseAdAdapter;
        List<? extends BaseAd> list5;
        boolean internalIsAdReady;
        boolean z12;
        BaseAd baseAd;
        Object[] objArr;
        List<com.anythink.core.common.h.c> list6;
        com.anythink.core.common.h.c cVar3;
        com.anythink.core.d.l lVar3;
        int i6;
        int i9;
        ATAdInfo aTAdInfo3;
        List<String> list7;
        List<String> list8;
        long j9;
        com.anythink.core.common.h.c cVar4;
        int i10;
        ArrayList arrayList;
        int i11;
        com.anythink.core.common.h.c cVar5;
        com.anythink.core.common.h.c cVar6;
        com.anythink.core.common.h.n nVar;
        int i12;
        int i13;
        String str5 = str;
        ArrayList arrayList2 = new ArrayList();
        try {
            a9 = u.a().a(str5);
            elapsedRealtime = SystemClock.elapsedRealtime();
        } catch (Throwable th) {
            a("checkCache failed in method. size: " + arrayList2.size(), th);
        }
        synchronized (a9) {
            if (aeVar != null) {
                try {
                    a10 = aeVar.a();
                } catch (Throwable th2) {
                    a("checkCache failed in remove operate", th2);
                } finally {
                }
            } else {
                a10 = null;
            }
            com.anythink.core.common.h.d b9 = aeVar != null ? aeVar.b() : null;
            ATAdInfo c9 = aeVar != null ? aeVar.c() : null;
            com.anythink.core.d.l a11 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(str5);
            if (a11 == null) {
                return null;
            }
            List<String> o6 = com.anythink.core.common.d.t.b().o(str5);
            List<String> p9 = com.anythink.core.common.d.t.b().p(str5);
            com.anythink.core.common.h.c a12 = com.anythink.core.common.a.c.a().a(str5);
            List<com.anythink.core.common.h.c> list9 = this.f12083c.get(str5);
            JSONArray jSONArray = new JSONArray();
            if (list9 == null || list9.isEmpty()) {
                aTAdInfo = c9;
                lVar = a11;
                list = o6;
                list2 = p9;
                j6 = elapsedRealtime;
                cVar = a12;
                z10 = false;
                cVar2 = null;
            } else {
                ArrayList arrayList3 = new ArrayList(list9);
                ArrayList arrayList4 = new ArrayList();
                int i14 = 0;
                cVar2 = null;
                while (i14 < arrayList3.size()) {
                    com.anythink.core.common.h.c cVar7 = (com.anythink.core.common.h.c) arrayList3.get(i14);
                    if (cVar7 == null) {
                        arrayList4.add(Integer.valueOf(i14));
                        lVar3 = a11;
                        i6 = i14;
                    } else {
                        bv unitGroupInfo = cVar7.e().getUnitGroupInfo();
                        int ax = unitGroupInfo.ax();
                        bv a13 = a11.a(unitGroupInfo.z());
                        com.anythink.core.a.d.a();
                        lVar3 = a11;
                        int a14 = com.anythink.core.a.d.a(str5, a13 != null ? a13 : unitGroupInfo);
                        i6 = i14;
                        if (a14 != -1) {
                            a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, a14);
                        } else {
                            com.anythink.core.a.a a15 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g());
                            if (a13 == null) {
                                a13 = unitGroupInfo;
                            }
                            int a16 = a15.a(str5, a13, lVar3.aq());
                            if (a16 != -1) {
                                a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, a16);
                            } else {
                                if (o6 == null || o6.size() <= 0) {
                                    i9 = 0;
                                } else if (o6.contains(String.valueOf(unitGroupInfo.g()))) {
                                    i9 = 1;
                                } else {
                                    a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, 5);
                                }
                                if (p9 != null && p9.size() > 0) {
                                    if (p9.contains(String.valueOf(unitGroupInfo.g()))) {
                                        a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, 6);
                                    } else {
                                        i9 = 2;
                                    }
                                }
                                Pair<Integer, List<String>> I8 = com.anythink.core.common.d.t.b().I();
                                if (I8 != null && ((Integer) I8.first).intValue() == 1) {
                                    List list10 = (List) I8.second;
                                    if (list10 != null && !list10.isEmpty()) {
                                        if (list10.contains(String.valueOf(unitGroupInfo.g()))) {
                                            a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, 28);
                                        }
                                    } else {
                                        a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, 27);
                                    }
                                }
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                boolean g4 = cVar7.g();
                                boolean j10 = cVar7.j();
                                com.anythink.core.common.h.n i15 = cVar7.i();
                                if (c9 != null && (c9 instanceof com.anythink.core.common.d.l)) {
                                    if (!a((com.anythink.core.common.d.l) c9, cVar7)) {
                                        a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), "", false, 7);
                                    } else {
                                        i15.ao();
                                        cVar7.toString();
                                        cVar2 = cVar7;
                                    }
                                }
                                if (g4 && j10) {
                                    if (z3) {
                                        arrayList = arrayList3;
                                        i10 = i6;
                                        aTAdInfo3 = c9;
                                        list7 = o6;
                                        j9 = elapsedRealtime;
                                        i13 = i9;
                                        list8 = p9;
                                        cVar6 = cVar7;
                                        i12 = 0;
                                        com.anythink.core.common.u.e.a(com.anythink.core.common.o.c.f15949b, i15, i15.aJ(), str, i15.M(), i15.Y(), lVar3.aq(), SystemClock.elapsedRealtime() - elapsedRealtime2);
                                        nVar = i15;
                                    } else {
                                        aTAdInfo3 = c9;
                                        list7 = o6;
                                        list8 = p9;
                                        cVar6 = cVar7;
                                        j9 = elapsedRealtime;
                                        nVar = i15;
                                        i10 = i6;
                                        i12 = 0;
                                        i13 = i9;
                                        arrayList = arrayList3;
                                    }
                                    a(jSONArray, ax, unitGroupInfo.z(), unitGroupInfo.g(), cVar6.e().getInternalNetworkSDKVersion(), true, -1);
                                    nVar.w(jSONArray.toString());
                                    nVar.y(ax);
                                    nVar.V(i13);
                                    if (!z9) {
                                        if (a12 != null && com.anythink.core.common.v.l.a(a12.e().getUnitGroupInfo(), cVar6.e().getUnitGroupInfo()) < 0) {
                                            com.anythink.core.common.h.c cVar8 = a12;
                                            if (a(cVar8, jSONArray, list7, list8, cVar2, aTAdInfo3)) {
                                                arrayList2.add(cVar8);
                                                if (z3) {
                                                    com.anythink.core.common.u.e.a(nVar.aJ(), str, true, -1, lVar3, arrayList2.size() > 0 ? (com.anythink.core.common.h.c) arrayList2.get(i12) : null, jSONArray.toString(), "", a10, b9, SystemClock.elapsedRealtime() - j9, aeVar);
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        arrayList2.add(cVar6);
                                        if (z3) {
                                        }
                                        return arrayList2;
                                    }
                                    cVar4 = a12;
                                    arrayList2.add(cVar6);
                                } else {
                                    aTAdInfo3 = c9;
                                    list7 = o6;
                                    list8 = p9;
                                    j9 = elapsedRealtime;
                                    cVar4 = a12;
                                    i10 = i6;
                                    arrayList = arrayList3;
                                    if (z3) {
                                        i11 = ax;
                                        cVar5 = cVar7;
                                        com.anythink.core.common.u.e.a(com.anythink.core.common.o.c.f15950c, i15, i15.aJ(), str, i15.M(), i15.Y(), lVar3.aq(), SystemClock.elapsedRealtime() - elapsedRealtime2);
                                    } else {
                                        i11 = ax;
                                        cVar5 = cVar7;
                                    }
                                    int c10 = cVar5.c();
                                    cVar5.h();
                                    if (c10 <= 0) {
                                        com.anythink.core.b.d.c.a(cVar5);
                                    }
                                    if (cVar5.e() != null) {
                                        com.anythink.core.common.v.d.a().d(cVar5.e());
                                    }
                                    a(cVar5);
                                    if (c10 == 0) {
                                        a(jSONArray, i11, unitGroupInfo.z(), unitGroupInfo.g(), "", false, g4 ? 1 : 0);
                                    }
                                    arrayList4.add(Integer.valueOf(i10));
                                }
                                i14 = i10 + 1;
                                str5 = str;
                                a12 = cVar4;
                                c9 = aTAdInfo3;
                                o6 = list7;
                                p9 = list8;
                                a11 = lVar3;
                                arrayList3 = arrayList;
                                elapsedRealtime = j9;
                            }
                        }
                    }
                    aTAdInfo3 = c9;
                    list7 = o6;
                    list8 = p9;
                    j9 = elapsedRealtime;
                    cVar4 = a12;
                    i10 = i6;
                    arrayList = arrayList3;
                    i14 = i10 + 1;
                    str5 = str;
                    a12 = cVar4;
                    c9 = aTAdInfo3;
                    o6 = list7;
                    p9 = list8;
                    a11 = lVar3;
                    arrayList3 = arrayList;
                    elapsedRealtime = j9;
                }
                aTAdInfo = c9;
                lVar = a11;
                list = o6;
                list2 = p9;
                j6 = elapsedRealtime;
                cVar = a12;
                z10 = false;
                z10 = false;
                z10 = false;
                if (!arrayList4.isEmpty()) {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        int intValue = ((Integer) arrayList4.get(i16)).intValue();
                        if (list9.size() > intValue && (cVar3 = list9.get(intValue)) != null) {
                            list9.remove(cVar3);
                        }
                    }
                }
            }
            if (!z9) {
                if (cVar != null) {
                    ATAdInfo aTAdInfo4 = aTAdInfo;
                    List<String> list11 = list;
                    List<String> list12 = list2;
                    boolean a17 = a(cVar, jSONArray, list11, list12, (com.anythink.core.common.h.c) null, aTAdInfo4);
                    list3 = list11;
                    list4 = list12;
                    aTAdInfo2 = aTAdInfo4;
                    if (a17) {
                        arrayList2.add(cVar);
                        if (z3) {
                            com.anythink.core.common.u.e.a(cVar.e().getTrackingInfo().aJ(), str, true, -1, lVar, cVar, jSONArray.toString(), "", a10, b9, SystemClock.elapsedRealtime() - j6, aeVar);
                        }
                    }
                } else {
                    aTAdInfo2 = aTAdInfo;
                    list3 = list;
                    list4 = list2;
                }
                String str6 = str;
                Map<String, Object> map = a10;
                com.anythink.core.d.l lVar4 = lVar;
                if (lVar4.ak() == 1) {
                    z11 = true;
                } else {
                    z11 = lVar4.ak() == 2 ? z6 : z10 ? 1 : 0;
                }
                List<bv> x9 = lVar4.x();
                u a18 = u.a();
                StringBuilder sb = new StringBuilder();
                sb.append(lVar4.aq());
                f a19 = a18.a(str6, sb.toString());
                String h9 = (a19 == null || a19.h() == null) ? "" : a19.h();
                if (x9 != null && x9.size() > 0 && z11) {
                    String a20 = r.a().a(context, str6);
                    if (!TextUtils.isEmpty(a20)) {
                        Iterator<bv> it = x9.iterator();
                        while (it.hasNext()) {
                            bvVar = it.next();
                            if (bvVar.k() != null && bvVar.k().contains(a20)) {
                                break;
                            }
                        }
                    }
                    bvVar = null;
                    if (bvVar != null) {
                        if (!com.anythink.core.common.v.p.a(list3, "35")) {
                            a(jSONArray, -1, bvVar.z(), bvVar.g(), "", false, 5);
                        } else if (com.anythink.core.common.v.p.b(list4, "35")) {
                            a(jSONArray, -1, bvVar.z(), bvVar.g(), "", false, 6);
                        }
                        bvVar2 = null;
                        if (bvVar2 != null) {
                            Map<String, Object> a21 = lVar4.a(str6, h9, bvVar2, aeVar != null ? aeVar.d() : null);
                            a21.put(r.f16038b, Boolean.TRUE);
                            try {
                                com.anythink.core.common.h.p a22 = com.anythink.core.common.v.u.a(bvVar2);
                                ATBaseAdAdapter aTBaseAdAdapter2 = a22 != null ? a22.f14035a : null;
                                boolean internalInitNetworkObjectByPlacementId = aTBaseAdAdapter2.internalInitNetworkObjectByPlacementId(context, a21, u.a().b(str6));
                                if (internalInitNetworkObjectByPlacementId) {
                                    try {
                                        Map<String, Object> b10 = u.a().b(str6);
                                        try {
                                            int[] iArr = new int[1];
                                            iArr[z10 ? 1 : 0] = z10 ? 1 : 0;
                                            if (b10.containsKey(bu.f13759S)) {
                                                try {
                                                    iArr[z10 ? 1 : 0] = ((Integer) b10.get(bu.f13759S)).intValue();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            String str7 = h9;
                                            lVar2 = lVar4;
                                            ATBaseAdAdapter aTBaseAdAdapter3 = aTBaseAdAdapter2;
                                            fVar = a19;
                                            bvVar3 = bvVar2;
                                            try {
                                                com.anythink.core.common.h.n a23 = aj.a(str7, str, lVar2, 0, iArr[z10 ? 1 : 0], map, null, 0, aeVar != null ? aeVar.d() : null);
                                                str4 = str7;
                                                map = map;
                                                try {
                                                    aj.a(a23, bvVar3, z10 ? 1 : 0, true);
                                                    aTBaseAdAdapter = aTBaseAdAdapter3;
                                                    try {
                                                        aj.a(aTBaseAdAdapter, a23, bvVar3);
                                                        a23.f14025t = 3;
                                                        list5 = null;
                                                        a23.m(ak.a(bvVar3, (ATBaseAdAdapter) null));
                                                        aTBaseAdAdapter.setRefresh(z10);
                                                    } catch (Throwable unused2) {
                                                    }
                                                } catch (Throwable unused3) {
                                                    str6 = str;
                                                    i = 1;
                                                    dVar = b9;
                                                    str2 = str4;
                                                    if (z3) {
                                                    }
                                                    if (z6) {
                                                    }
                                                    return arrayList2;
                                                }
                                            } catch (Throwable unused4) {
                                                lVar2 = lVar2;
                                                map = map;
                                                dVar = b9;
                                                i = 1;
                                                str2 = str7;
                                                str6 = str;
                                            }
                                        } catch (Throwable unused5) {
                                            fVar = a19;
                                            str6 = str;
                                            lVar2 = lVar4;
                                            i = 1;
                                            dVar = b9;
                                        }
                                    } catch (Throwable unused6) {
                                        fVar = a19;
                                        str6 = str;
                                        lVar2 = lVar4;
                                    }
                                } else {
                                    aTBaseAdAdapter = aTBaseAdAdapter2;
                                    lVar2 = lVar4;
                                    str4 = h9;
                                    fVar = a19;
                                    bvVar3 = bvVar2;
                                    list5 = null;
                                }
                                if (TextUtils.equals(String.valueOf(lVar2.aq()), "0")) {
                                    if (internalInitNetworkObjectByPlacementId) {
                                        baseAd = aTBaseAdAdapter.getBaseAdObject(context);
                                        if (baseAd != null) {
                                            z12 = true;
                                        }
                                        z12 = z10 ? 1 : 0;
                                    }
                                    baseAd = list5;
                                    z12 = z10 ? 1 : 0;
                                } else {
                                    if (internalInitNetworkObjectByPlacementId) {
                                        try {
                                            internalIsAdReady = aTBaseAdAdapter.internalIsAdReady();
                                        } catch (Throwable th3) {
                                            a("checkCache failed in network is ready", th3);
                                        }
                                    } else {
                                        internalIsAdReady = z10 ? 1 : 0;
                                    }
                                    z12 = internalIsAdReady;
                                    baseAd = list5;
                                }
                            } catch (Throwable unused7) {
                            }
                            if (z12) {
                                if (baseAd != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().af());
                                    arrayList5.add(baseAd);
                                    list5 = arrayList5;
                                }
                                try {
                                    List<com.anythink.core.common.h.c> a24 = a(str, aTBaseAdAdapter, list5, bvVar3.u());
                                    if (a24.size() > 0) {
                                        for (com.anythink.core.common.h.c cVar9 : a24) {
                                            com.anythink.core.common.h.n i17 = cVar9.i();
                                            try {
                                                i17.f14008C = 1;
                                                i17.y(z10 ? 1 : 0);
                                                i17.w(jSONArray.toString());
                                                if (z3) {
                                                    i = 1;
                                                    Map<String, Object> map2 = map;
                                                    dVar = b9;
                                                    com.anythink.core.d.l lVar5 = lVar2;
                                                    str2 = str4;
                                                    list6 = a24;
                                                    try {
                                                        com.anythink.core.common.u.e.a(i17.aJ(), str, true, -1, lVar5, cVar9, jSONArray.toString(), bvVar3.k(), map2, dVar, aeVar);
                                                        map = map2;
                                                    } catch (Throwable unused8) {
                                                        str6 = str;
                                                        lVar2 = lVar5;
                                                        map = map2;
                                                    }
                                                } else {
                                                    dVar = b9;
                                                    str2 = str4;
                                                    list6 = a24;
                                                }
                                                a24 = list6;
                                                str4 = str2;
                                                b9 = dVar;
                                            } catch (Throwable unused9) {
                                                str6 = str;
                                                i = 1;
                                                dVar = b9;
                                                str2 = str4;
                                                if (z3) {
                                                }
                                                if (z6) {
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        str6 = str;
                                        dVar = b9;
                                        i = 1;
                                        str2 = str4;
                                        try {
                                            com.anythink.core.common.h.c cVar10 = a24.get(z10 ? 1 : 0);
                                            if (aTAdInfo2 != null && (aTAdInfo2 instanceof com.anythink.core.common.d.l)) {
                                                if (!a((com.anythink.core.common.d.l) aTAdInfo2, cVar10)) {
                                                    a(jSONArray, -1, cVar10.i().M(), cVar10.i().Y(), "", false, 7);
                                                    cVar10.toString();
                                                    objArr = z10 ? 1 : 0;
                                                    if (objArr != false) {
                                                        arrayList2.add(cVar10);
                                                    }
                                                } else {
                                                    cVar10.i().ao();
                                                    cVar10.toString();
                                                }
                                            }
                                            objArr = true;
                                            if (objArr != false) {
                                            }
                                        } catch (Throwable unused10) {
                                        }
                                    } else {
                                        str6 = str;
                                        dVar = b9;
                                        i = 1;
                                        str2 = str4;
                                        objArr = true;
                                    }
                                    if (objArr != false) {
                                    }
                                } catch (Throwable unused11) {
                                    str6 = str;
                                }
                                if (z3) {
                                    if (fVar != null) {
                                        z10 = fVar.g();
                                    }
                                    if (fVar == null) {
                                        com.anythink.core.common.u.e.b("AdManage is null--isReady", "Id:" + str6 + "--format:" + lVar2.aq(), com.anythink.core.common.d.t.b().r());
                                    }
                                    Map<String, Object> map3 = map;
                                    str3 = str2;
                                    com.anythink.core.common.u.e.a(str3, str, false, z10 ? 5 : i, lVar2, (com.anythink.core.common.h.c) null, jSONArray.toString(), "", map3, dVar, SystemClock.elapsedRealtime() - j6, aeVar);
                                    map = map3;
                                } else {
                                    str3 = str2;
                                }
                                if (z6) {
                                    com.anythink.core.common.u.e.a(str3, str, lVar2, aTAdInfo2 != null ? 5 : i, jSONArray.toString(), map, aeVar);
                                }
                            }
                            str6 = str;
                            dVar = b9;
                            i = 1;
                            str2 = str4;
                            if (z3) {
                            }
                            if (z6) {
                            }
                        }
                    }
                    bvVar2 = bvVar;
                    if (bvVar2 != null) {
                    }
                }
                lVar2 = lVar4;
                fVar = a19;
                dVar = b9;
                i = 1;
                str2 = h9;
                if (z3) {
                }
                if (z6) {
                }
            } else if (cVar != null) {
                if (arrayList2.size() != 0) {
                    com.anythink.core.common.h.c cVar11 = (com.anythink.core.common.h.c) arrayList2.get(z10 ? 1 : 0);
                    if (cVar11 != null && com.anythink.core.common.v.l.a(cVar.e().getUnitGroupInfo(), cVar11.e().getUnitGroupInfo()) < 0) {
                    }
                }
                com.anythink.core.common.h.c cVar12 = cVar;
                if (a(cVar12, jSONArray, list, list2, cVar2, aTAdInfo)) {
                    arrayList2.add(cVar12);
                }
            }
            return arrayList2;
        }
    }

    private static boolean a(JSONArray jSONArray, ATAdInfo aTAdInfo, com.anythink.core.common.h.c cVar) {
        if (aTAdInfo != null && (aTAdInfo instanceof com.anythink.core.common.d.l)) {
            if (!a((com.anythink.core.common.d.l) aTAdInfo, cVar)) {
                a(jSONArray, -1, cVar.i().M(), cVar.i().Y(), "", false, 7);
                cVar.toString();
                return false;
            }
            cVar.i().ao();
            cVar.toString();
        }
        return true;
    }

    private static boolean a(com.anythink.core.common.h.c cVar, JSONArray jSONArray, List<String> list, List<String> list2, com.anythink.core.common.h.c cVar2, ATAdInfo aTAdInfo) {
        com.anythink.core.common.h.n i = cVar.i();
        if (!com.anythink.core.common.v.p.a(list, "66")) {
            a(jSONArray, -1, i.M(), i.Y(), "", false, 5);
            return false;
        }
        if (com.anythink.core.common.v.p.b(list2, "66")) {
            a(jSONArray, -1, i.M(), i.Y(), "", false, 6);
            return false;
        }
        if (cVar2 != null) {
            if (TextUtils.equals(cVar2.i().aJ(), i.aJ()) && TextUtils.equals(cVar2.i().M(), i.M())) {
                i.ao();
                cVar.toString();
                return true;
            }
            a(jSONArray, -1, i.M(), i.Y(), "", false, 7);
            cVar.toString();
            cVar2.toString();
            return false;
        }
        if (cVar2 != null || aTAdInfo == null || !(aTAdInfo instanceof com.anythink.core.common.d.l)) {
            return true;
        }
        if (a((com.anythink.core.common.d.l) aTAdInfo, cVar)) {
            i.ao();
            aTAdInfo.toString();
            return true;
        }
        a(jSONArray, -1, i.M(), i.Y(), "", false, 7);
        cVar.toString();
        aTAdInfo.toString();
        return false;
    }

    private static boolean a(com.anythink.core.common.d.l lVar, com.anythink.core.common.h.c cVar) {
        if (lVar != null && cVar != null) {
            String requestId = lVar.getRequestId();
            String adsourceId = lVar.getAdsourceId();
            com.anythink.core.common.h.n i = cVar.i();
            if (TextUtils.equals(requestId, i.aJ()) && TextUtils.equals(adsourceId, i.M())) {
                return true;
            }
        }
        return false;
    }

    private static void a(ATBaseAdAdapter aTBaseAdAdapter, String str, String str2, com.anythink.core.d.l lVar, bv bvVar, Map<String, Object> map, ae aeVar) {
        Map<String, Object> b9 = u.a().b(str2);
        int[] iArr = {0};
        if (b9.containsKey(bu.f13759S)) {
            try {
                iArr[0] = ((Integer) b9.get(bu.f13759S)).intValue();
            } catch (Throwable unused) {
            }
        }
        com.anythink.core.common.h.n a9 = aj.a(str, str2, lVar, 0, iArr[0], map, null, 0, aeVar != null ? aeVar.d() : null);
        aj.a(a9, bvVar, 0, true);
        aj.a(aTBaseAdAdapter, a9, bvVar);
        a9.f14025t = 3;
        a9.m(ak.a(bvVar, (ATBaseAdAdapter) null));
        aTBaseAdAdapter.setRefresh(false);
    }

    private static void a(JSONArray jSONArray, int i, String str, int i6, String str2, boolean z3, int i9) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("priority", i);
            jSONObject.put("unit_id", str);
            jSONObject.put("nw_firm_id", i6);
            jSONObject.put("nw_ver", str2);
            jSONObject.put("result", z3 ? 1 : 0);
            if (i9 != -1) {
                jSONObject.put("reason", i9);
            }
        } catch (Throwable th) {
            a("checkCache failed in addCheckObjectInfo.", th);
        }
        jSONArray.put(jSONObject);
    }

    public final void a(com.anythink.core.common.h.c cVar) {
        if (cVar == null) {
            return;
        }
        com.anythink.core.common.h.n i = cVar.i();
        b(i.aI(), cVar.e().getUnitGroupInfo());
        bw bwVar = this.f12084d.get(a(i.aI(), i.M()));
        if (bwVar == null) {
            return;
        }
        bwVar.a(cVar);
    }

    public final void a(String str, bv bvVar, String str2) {
        synchronized (u.a().a(str)) {
            List<com.anythink.core.common.h.c> list = this.f12083c.get(str);
            if (list != null) {
                for (com.anythink.core.common.h.c cVar : list) {
                    if (TextUtils.equals(cVar.i().M(), bvVar.z()) && TextUtils.equals(cVar.i().aJ(), str2)) {
                        a(cVar);
                        b(cVar);
                        cVar.m();
                        return;
                    }
                }
            }
        }
    }

    private void a(String str, int i) {
        a(str, i, true, 7);
    }

    public final void a(String str, List<ATAdInfo> list, boolean z3, int i) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return;
        }
        list.toString();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str2 = null;
        for (ATAdInfo aTAdInfo : list) {
            if (aTAdInfo != null) {
                if (aTAdInfo.getPlacementType() == 2) {
                    if (str2 == null) {
                        str2 = aTAdInfo.getSharedPlacementId();
                    }
                    if (z3) {
                        arrayList.add(aTAdInfo);
                    }
                } else {
                    arrayList2.add(aTAdInfo);
                }
            }
        }
        if (arrayList2.size() > 0) {
            a(str, arrayList2, i);
        }
        if (arrayList.size() > 0) {
            a(str2, arrayList, i);
        }
    }

    private void a(String str, List<ATAdInfo> list, int i) {
        synchronized (u.a().a(str)) {
            try {
                List<com.anythink.core.common.h.c> list2 = this.f12083c.get(str);
                if (list2 == null) {
                    return;
                }
                com.anythink.core.common.h.n nVar = null;
                for (int size = list.size() - 1; size >= 0; size--) {
                    ATAdInfo aTAdInfo = list.get(size);
                    if (aTAdInfo instanceof com.anythink.core.common.d.l) {
                        com.anythink.core.common.d.l lVar = (com.anythink.core.common.d.l) aTAdInfo;
                        String requestId = lVar.getRequestId();
                        String adsourceId = lVar.getAdsourceId();
                        if (!TextUtils.isEmpty(requestId) && !TextUtils.isEmpty(adsourceId)) {
                            int size2 = list2.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    com.anythink.core.common.h.c cVar = list2.get(size2);
                                    com.anythink.core.common.h.n i6 = cVar.i();
                                    if (nVar == null) {
                                        nVar = i6;
                                    }
                                    if (TextUtils.equals(adsourceId, i6.M()) && TextUtils.equals(requestId, i6.aJ())) {
                                        cVar.toString();
                                        list2.remove(size2);
                                        com.anythink.core.b.d.c.a(cVar, i);
                                        a(cVar);
                                        cVar.m();
                                        break;
                                    }
                                    size2--;
                                }
                            }
                        }
                    }
                }
                com.anythink.core.common.u.e.a(nVar, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(final Context context, final com.anythink.core.common.h.c cVar) {
        final ATBaseAdAdapter e9 = cVar.e();
        final com.anythink.core.common.h.n i = cVar.i();
        bv unitGroupInfo = e9 != null ? e9.getUnitGroupInfo() : null;
        if (i != null) {
            String aI = i.aI();
            String aJ = i.aJ();
            f a9 = u.a().a(aI, i.aK());
            if (a9 != null) {
                a9.a(aJ, unitGroupInfo != null ? com.anythink.core.common.v.p.a(unitGroupInfo) : 0.0d, unitGroupInfo);
            } else {
                StringBuilder j6 = AbstractC4404f.j("Id:", aI, "--format:");
                j6.append(i.aK());
                j6.append("--adsource:");
                j6.append(i.M());
                y.w("AdManage is null--Show", j6.toString());
            }
            u.a().a(aI, aJ, a(aI));
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.a.a.a(context);
                    com.anythink.core.common.h.n nVar = i;
                    com.anythink.core.a.a.a(nVar, nVar.aK(), i.aI(), i.M());
                    com.anythink.core.a.d.a();
                    i.aI();
                    com.anythink.core.a.d.a();
                    i.aI();
                    i.M();
                    a.this.a(cVar);
                    a.this.b(cVar);
                    MediationBidManager b9 = com.anythink.core.b.f.a().b();
                    if (b9 != null) {
                        b9.notifyWinnerDisplay(i.aI(), e9.getUnitGroupInfo());
                    }
                }
            }, 2);
        }
    }

    public final bw a(String str, bv bvVar) {
        return this.f12084d.get(a(str, bvVar.z()));
    }

    private static void a(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString() + "\n");
            }
        }
        y.w(str, sb.toString());
    }

    public final void a(String str, int i, boolean z3, int i6) {
        List<ATAdInfo> a9;
        if (TextUtils.isEmpty(str) || com.anythink.core.common.d.t.b().g() == null) {
            return;
        }
        com.anythink.core.d.l a10 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(str);
        String valueOf = a10 != null ? String.valueOf(a10.aq()) : null;
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        synchronized (u.a().a(str)) {
            try {
                if (this.f12083c.get(str) == null) {
                    return;
                }
                f a11 = f.a(com.anythink.core.common.d.t.b().g(), str, valueOf);
                if (a11 != null) {
                    if (z3) {
                        a9 = a11.a(com.anythink.core.common.d.t.b().g());
                    } else {
                        a9 = a11.a(com.anythink.core.common.d.t.b().g(), (ae) null);
                    }
                    if (a9 != null && a9.size() != 0) {
                        if (i >= a9.size() - 1) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (i >= 0) {
                            while (true) {
                                i++;
                                if (i >= a9.size()) {
                                    break;
                                } else {
                                    arrayList.add(a9.get(i));
                                }
                            }
                        } else {
                            arrayList.addAll(a9);
                        }
                        a(str, arrayList, z3, i6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<com.anythink.core.common.h.c> a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list, long j6, int i) {
        List<com.anythink.core.common.h.c> a9;
        int size;
        if (i != -1 && (a9 = a().a(str)) != null && !a9.isEmpty() && (size = a9.size()) >= i) {
            if (com.anythink.core.common.v.l.a(aTBaseAdAdapter.getUnitGroupInfo(), a9.get(size - 1).o()) == -1) {
                int i6 = i - 2;
                Math.max(i6, -1);
                a().a(str, Math.max(i6, -1), false, 11);
            } else {
                com.anythink.core.common.h.c a10 = a(aTBaseAdAdapter, j6);
                a10.m();
                com.anythink.core.b.d.c.a(a10, 11);
                com.anythink.core.common.u.e.b(a10.i(), "2");
                return new ArrayList();
            }
        }
        return a(str, aTBaseAdAdapter, list, j6);
    }
}
