package com.anythink.core.common.v;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATCustomContentInfo;
import com.anythink.core.api.ATCustomContentResult;
import com.anythink.core.c.b.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16873a = "r";

    public static class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        int f16874a;

        /* renamed from: b, reason: collision with root package name */
        ATCustomContentInfo f16875b;

        /* renamed from: c, reason: collision with root package name */
        double f16876c;

        /* renamed from: d, reason: collision with root package name */
        com.anythink.core.common.h.c f16877d;

        public a(int i, ATCustomContentInfo aTCustomContentInfo, double d2, com.anythink.core.common.h.c cVar) {
            this.f16874a = i;
            this.f16875b = aTCustomContentInfo;
            this.f16876c = d2;
            this.f16877d = cVar;
        }

        private int a(a aVar) {
            double d2 = this.f16876c;
            double d9 = aVar.f16876c;
            if (d2 > d9) {
                return -1;
            }
            return d2 < d9 ? 1 : 0;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
            double d2 = this.f16876c;
            double d9 = aVar.f16876c;
            if (d2 > d9) {
                return -1;
            }
            return d2 < d9 ? 1 : 0;
        }
    }

    public static ATCustomContentInfo a(List<ATCustomContentInfo> list) {
        try {
            ATCustomContentResult c9 = c(list);
            if (c9 != null) {
                return c9.getCustomContentInfoList().get(0);
            }
        } catch (Throwable unused) {
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public static ATCustomContentResult b(List<ATCustomContentInfo> list) {
        try {
            return c(list);
        } catch (Throwable unused) {
            return new ATCustomContentResult(list);
        }
    }

    private static ATCustomContentResult c(List<ATCustomContentInfo> list) {
        long j6;
        com.anythink.core.common.h.c cVar;
        com.anythink.core.d.l a9;
        com.anythink.core.common.h.c cVar2;
        int i;
        Objects.toString(list);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (list == null || list.size() == 0) {
            Log.e(f16873a, "List<ATCustomContentInfo> can not be empty");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (!com.anythink.core.common.d.t.b().V()) {
            return d(arrayList);
        }
        LinkedList<a> linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ATCustomContentInfo aTCustomContentInfo = (ATCustomContentInfo) it.next();
            if (aTCustomContentInfo != null) {
                try {
                    String customContentString = aTCustomContentInfo.getCustomContentString();
                    double customContentDouble = aTCustomContentInfo.getCustomContentDouble();
                    double d2 = 0.0d;
                    if (customContentDouble > 0.0d) {
                        d2 = customContentDouble;
                        i = 2;
                        cVar2 = null;
                    } else {
                        if (TextUtils.isEmpty(customContentString)) {
                            cVar = null;
                        } else {
                            try {
                                a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(customContentString);
                            } catch (Throwable th) {
                                th = th;
                                cVar = null;
                            }
                            if (a9 == null) {
                                throw new RuntimeException("placementId: " + customContentString + ", place strategy is null");
                            }
                            com.anythink.core.common.f a10 = com.anythink.core.common.u.a().a(customContentString, String.valueOf(a9.aq()));
                            if (a10 == null) {
                                throw new RuntimeException("The \" + placementId + \" object has not been created yet!");
                            }
                            cVar = a10.b(com.anythink.core.common.d.t.b().g(), false, false, new com.anythink.core.common.h.ae());
                            if (cVar == null) {
                                throw new RuntimeException("no cache, placementId: ".concat(String.valueOf(customContentString)));
                            }
                            try {
                                cVar.toString();
                                cVar2 = cVar;
                                d2 = cVar.e().getUnitGroupInfo().D();
                                i = 1;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            th = th2;
                            th.getMessage();
                        }
                        cVar2 = cVar;
                        i = 0;
                    }
                    linkedList.add(new a(i, aTCustomContentInfo, d2, cVar2));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        }
        if (linkedList.size() == 0) {
            return new ATCustomContentResult(arrayList);
        }
        Collections.sort(linkedList);
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = new ArrayList();
        double d9 = -1.0d;
        String str = "";
        int i6 = 0;
        ATCustomContentInfo aTCustomContentInfo2 = null;
        for (a aVar : linkedList) {
            if (aVar != null) {
                ATCustomContentInfo aTCustomContentInfo3 = aVar.f16875b;
                double d10 = d9;
                double d11 = aVar.f16876c;
                com.anythink.core.common.h.c cVar3 = aVar.f16877d;
                if (aTCustomContentInfo2 == null) {
                    i6 = aVar.f16874a;
                    d10 = d11;
                    str = aTCustomContentInfo3.getCustomContentString();
                    aTCustomContentInfo2 = aTCustomContentInfo3;
                }
                aTCustomContentInfo3.getCustomContentString();
                Objects.toString(aTCustomContentInfo3.getCustomContentObject());
                if (cVar3 != null) {
                    aTCustomContentInfo3.setATAdInfo(cVar3.p());
                }
                arrayList2.add(aTCustomContentInfo3);
                JSONObject jSONObject = new JSONObject();
                try {
                    if (aTCustomContentInfo3.getCustomContentObject() instanceof String) {
                        j6 = elapsedRealtime;
                        try {
                            jSONObject.put("custom_string", aTCustomContentInfo3.getCustomContentObject());
                        } catch (Throwable unused) {
                        }
                    } else {
                        j6 = elapsedRealtime;
                    }
                    jSONObject.put(e.a.f12068h, String.valueOf(d11));
                    if (aVar.f16874a != 2) {
                        jSONObject.put(com.anythink.core.common.m.e.bk, aTCustomContentInfo3.getCustomContentString());
                        com.anythink.core.common.h.n i9 = cVar3 != null ? cVar3.i() : null;
                        jSONObject.put("req_id", i9 != null ? i9.aJ() : "");
                        jSONObject.put("network_firm_id", i9 != null ? i9.Y() : 0);
                        jSONObject.put("adsource_id", i9 != null ? i9.M() : "");
                        jSONObject.put("adsource_isheaderbidding", (i9 == null || !i9.K()) ? 0 : 1);
                        jSONObject.put("network_placement_id", i9 != null ? i9.y() : "");
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused2) {
                    j6 = elapsedRealtime;
                }
                d9 = d10;
                elapsedRealtime = j6;
            }
        }
        com.anythink.core.common.h.e eVar = new com.anythink.core.common.h.e(jSONArray, i6, i6 == 2 ? String.valueOf(d9) : i6 == 1 ? str : null, SystemClock.elapsedRealtime() - elapsedRealtime);
        com.anythink.core.common.h.n nVar = new com.anythink.core.common.h.n();
        nVar.a(eVar);
        com.anythink.core.common.u.c.a(com.anythink.core.common.d.t.b().g()).a(26, nVar);
        return new ATCustomContentResult(arrayList2);
    }

    private static ATCustomContentResult d(List<ATCustomContentInfo> list) {
        Objects.toString(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ATCustomContentInfo aTCustomContentInfo : list) {
            if (aTCustomContentInfo != null) {
                if (TextUtils.isEmpty(aTCustomContentInfo.getCustomContentString())) {
                    arrayList.add(aTCustomContentInfo);
                } else {
                    arrayList2.add(aTCustomContentInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            Collections.sort(arrayList, new Comparator<ATCustomContentInfo>() { // from class: com.anythink.core.common.v.r.1
                private static int a(ATCustomContentInfo aTCustomContentInfo2, ATCustomContentInfo aTCustomContentInfo3) {
                    if (aTCustomContentInfo2.getCustomContentDouble() > aTCustomContentInfo3.getCustomContentDouble()) {
                        return -1;
                    }
                    return aTCustomContentInfo2.getCustomContentDouble() < aTCustomContentInfo3.getCustomContentDouble() ? 1 : 0;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(ATCustomContentInfo aTCustomContentInfo2, ATCustomContentInfo aTCustomContentInfo3) {
                    ATCustomContentInfo aTCustomContentInfo4 = aTCustomContentInfo2;
                    ATCustomContentInfo aTCustomContentInfo5 = aTCustomContentInfo3;
                    if (aTCustomContentInfo4.getCustomContentDouble() > aTCustomContentInfo5.getCustomContentDouble()) {
                        return -1;
                    }
                    return aTCustomContentInfo4.getCustomContentDouble() < aTCustomContentInfo5.getCustomContentDouble() ? 1 : 0;
                }
            });
        }
        arrayList.addAll(arrayList2);
        return new ATCustomContentResult(arrayList);
    }

    public static void a(ATCustomContentResult aTCustomContentResult, com.anythink.core.common.h.n nVar) {
        List<ATCustomContentInfo> customContentInfoList;
        ATAdInfo adInfo;
        if (aTCustomContentResult == null || nVar == null || (customContentInfoList = aTCustomContentResult.getCustomContentInfoList()) == null || customContentInfoList.size() == 0) {
            return;
        }
        nVar.a(aTCustomContentResult);
        String aJ = nVar.aJ();
        String M8 = nVar.M();
        customContentInfoList.toString();
        for (ATCustomContentInfo aTCustomContentInfo : customContentInfoList) {
            if (aTCustomContentInfo != null && (adInfo = aTCustomContentInfo.getAdInfo()) != null) {
                String requestId = adInfo.getRequestId();
                String adsourceId = adInfo.getAdsourceId();
                if (TextUtils.equals(aJ, requestId) && TextUtils.equals(M8, adsourceId)) {
                    double p9 = nVar.p();
                    double q8 = nVar.q();
                    aTCustomContentInfo.toString();
                    if (adInfo instanceof com.anythink.core.common.d.l) {
                        com.anythink.core.common.d.l lVar = (com.anythink.core.common.d.l) adInfo;
                        lVar.a(p9);
                        lVar.b(q8);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
