package com.anythink.core.b;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.p;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.u;
import com.anythink.core.d.l;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static String f12638a = "i";

    /* renamed from: b, reason: collision with root package name */
    com.anythink.core.common.h.a f12639b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12640c;

    /* renamed from: d, reason: collision with root package name */
    a f12641d;

    /* renamed from: com.anythink.core.b.i$2, reason: invalid class name */
    public class AnonymousClass2 implements ATBidRequestInfoListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f12645a;

        public AnonymousClass2(bv bvVar) {
            this.f12645a = bvVar;
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onFailed(String str) {
            a aVar = i.this.f12641d;
            if (aVar != null) {
                aVar.onBidTokenObtainFail(str, this.f12645a);
            }
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onSuccess(ATBidRequestInfo aTBidRequestInfo) {
            i.a(i.this, this.f12645a, aTBidRequestInfo);
        }
    }

    /* renamed from: com.anythink.core.b.i$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBidRequestInfo f12647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f12648b;

        public AnonymousClass3(ATBidRequestInfo aTBidRequestInfo, bv bvVar) {
            this.f12647a = aTBidRequestInfo;
            this.f12648b = bvVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[Catch: all -> 0x005e, TryCatch #2 {all -> 0x005e, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000c, B:18:0x004e, B:20:0x0057, B:21:0x0061, B:23:0x006d, B:25:0x0075, B:27:0x007f, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:33:0x00a3, B:35:0x00aa, B:37:0x00b4, B:59:0x0113, B:61:0x0118, B:62:0x009b, B:64:0x009f, B:10:0x011d, B:12:0x0128, B:67:0x004b, B:68:0x012e, B:70:0x0134, B:43:0x00c1, B:45:0x00dc, B:46:0x00e2, B:48:0x00e8, B:50:0x00f8, B:52:0x00fc, B:53:0x0103, B:55:0x0107, B:17:0x0031), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0118 A[Catch: all -> 0x005e, TryCatch #2 {all -> 0x005e, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000c, B:18:0x004e, B:20:0x0057, B:21:0x0061, B:23:0x006d, B:25:0x0075, B:27:0x007f, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:33:0x00a3, B:35:0x00aa, B:37:0x00b4, B:59:0x0113, B:61:0x0118, B:62:0x009b, B:64:0x009f, B:10:0x011d, B:12:0x0128, B:67:0x004b, B:68:0x012e, B:70:0x0134, B:43:0x00c1, B:45:0x00dc, B:46:0x00e2, B:48:0x00e8, B:50:0x00f8, B:52:0x00fc, B:53:0x0103, B:55:0x0107, B:17:0x0031), top: B:1:0x0000, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            JSONObject requestJSONObject;
            ATAdxBidFloorInfo aTAdxBidFloorInfo;
            Map<String, Object> extraMap;
            boolean z6;
            try {
                ATBidRequestInfo aTBidRequestInfo = this.f12647a;
                if (aTBidRequestInfo != null && (requestJSONObject = aTBidRequestInfo.toRequestJSONObject()) != null) {
                    String valueOf = String.valueOf(i.this.f12639b.f14117f);
                    i.this.f12639b.f14124n.a();
                    com.anythink.core.b.d.b.a(requestJSONObject, valueOf, this.f12648b, i.this.f12639b);
                    if (this.f12648b.q() == 3) {
                        try {
                            requestJSONObject.put("unit_id", this.f12648b.z());
                            requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, t.b().l());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (i.this.f12639b.f14136z == 1) {
                            requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                        }
                        if (i.this.f12639b.f14129s.ah() && (aTAdxBidFloorInfo = i.this.f12639b.f14107A) != null) {
                            double bidFloor = aTAdxBidFloorInfo.getBidFloor();
                            if (bidFloor > 0.0d) {
                                ATAdConst.CURRENCY currency = aTAdxBidFloorInfo.getCurrency();
                                if (currency == null) {
                                    currency = ATAdConst.CURRENCY.USD;
                                }
                                double L2 = i.this.f12639b.f14124n.a().L();
                                if (currency != ATAdConst.CURRENCY.RMB) {
                                    if (currency == ATAdConst.CURRENCY.RMB_CENT) {
                                        bidFloor /= 100.0d;
                                    }
                                    extraMap = aTAdxBidFloorInfo.getExtraMap();
                                    z6 = false;
                                    if (extraMap != null) {
                                        Object obj = extraMap.get(ATAdxBidFloorInfo.EXTRA_TYPE);
                                        if (obj instanceof Integer) {
                                            z6 = ((Integer) obj).intValue() == 1;
                                        }
                                        if (z6) {
                                            try {
                                                requestJSONObject.put(b.c.f12899b, bidFloor);
                                                Object obj2 = extraMap.get(ATAdxBidFloorInfo.EXTRA_M_INFO);
                                                Object obj3 = extraMap.get(ATAdxBidFloorInfo.EXTRA_TP_M_INFO);
                                                Object obj4 = extraMap.get(ATAdxBidFloorInfo.EXTRA_L_S_P);
                                                if (obj2 instanceof JSONObject) {
                                                    JSONObject jSONObject = (JSONObject) obj2;
                                                    Iterator<String> keys = jSONObject.keys();
                                                    while (keys.hasNext()) {
                                                        String next = keys.next();
                                                        requestJSONObject.put(next, jSONObject.opt(next));
                                                    }
                                                }
                                                if (obj3 instanceof JSONArray) {
                                                    requestJSONObject.put(b.c.f12900c, (JSONArray) obj3);
                                                }
                                                if (obj4 instanceof Double) {
                                                    requestJSONObject.put(b.c.f12901d, ((Double) obj4).doubleValue());
                                                }
                                            } catch (Throwable th2) {
                                                th2.printStackTrace();
                                            }
                                        }
                                    }
                                    if (!z6) {
                                        requestJSONObject.put("c_bidfloor", bidFloor);
                                    }
                                }
                                bidFloor *= L2;
                                extraMap = aTAdxBidFloorInfo.getExtraMap();
                                z6 = false;
                                if (extraMap != null) {
                                }
                                if (!z6) {
                                }
                            }
                        }
                    }
                    i.a(requestJSONObject, this.f12648b);
                    a aVar = i.this.f12641d;
                    if (aVar != null) {
                        aVar.onBidTokenObtainSuccess(this.f12648b, requestJSONObject);
                        return;
                    }
                    return;
                }
                a aVar2 = i.this.f12641d;
                if (aVar2 != null) {
                    aVar2.onBidTokenObtainFail(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE, this.f12648b);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
                a aVar3 = i.this.f12641d;
                if (aVar3 != null) {
                    aVar3.onBidTokenObtainFail(th3.getMessage(), this.f12648b);
                }
            }
        }
    }

    public interface a {
        void onBidTokenObtainFail(String str, bv bvVar);

        void onBidTokenObtainStart(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter);

        void onBidTokenObtainSuccess(bv bvVar, JSONObject jSONObject);
    }

    public i(com.anythink.core.common.h.a aVar) {
        this.f12639b = aVar;
        this.f12640c = aVar.f14127q;
    }

    private static void b(JSONObject jSONObject, bv bvVar) {
        if (bvVar == null || jSONObject == null || bvVar.g() != 2) {
            return;
        }
        try {
            jSONObject.put("admob_bid_type", bvVar.aM());
            jSONObject.put("network_id", bvVar.aL());
        } catch (Throwable unused) {
        }
    }

    public final void a(final bv bvVar, a aVar) {
        this.f12641d = aVar;
        p a9 = u.a(bvVar);
        final ATBaseAdAdapter aTBaseAdAdapter = a9 != null ? a9.f14821a : null;
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    i.a(i.this, aTBaseAdAdapter, bvVar);
                }
            });
            return;
        }
        String str = ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE;
        if (a9 != null) {
            str = a9.a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE);
        }
        aVar.onBidTokenObtainFail(str, bvVar);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar) {
        try {
            ar arVar = this.f12639b.f14114c;
            ATAdRequest b9 = arVar != null ? arVar.b() : null;
            l a9 = this.f12639b.f14124n.a();
            com.anythink.core.common.h.a aVar = this.f12639b;
            Map<String, Object> a10 = a9.a(aVar.f14116e, aVar.f14115d, bvVar, b9);
            n af = this.f12639b.f14129s.af();
            aj.a(af, bvVar, 0, false);
            com.anythink.core.common.v.p.a(a10, af);
            aTBaseAdAdapter.internalGetBidRequestInfo(this.f12639b.f14113b, a10, this.f12640c, new AnonymousClass2(bvVar));
            a aVar2 = this.f12641d;
            if (aVar2 != null) {
                aVar2.onBidTokenObtainStart(bvVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = this.f12641d;
            if (aVar3 != null) {
                aVar3.onBidTokenObtainFail(th.getMessage(), bvVar);
            }
        }
    }

    private void a(bv bvVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass3(aTBidRequestInfo, bvVar));
    }

    public static /* synthetic */ void a(i iVar, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar) {
        try {
            ar arVar = iVar.f12639b.f14114c;
            ATAdRequest b9 = arVar != null ? arVar.b() : null;
            l a9 = iVar.f12639b.f14124n.a();
            com.anythink.core.common.h.a aVar = iVar.f12639b;
            Map<String, Object> a10 = a9.a(aVar.f14116e, aVar.f14115d, bvVar, b9);
            n af = iVar.f12639b.f14129s.af();
            aj.a(af, bvVar, 0, false);
            com.anythink.core.common.v.p.a(a10, af);
            aTBaseAdAdapter.internalGetBidRequestInfo(iVar.f12639b.f14113b, a10, iVar.f12640c, iVar.new AnonymousClass2(bvVar));
            a aVar2 = iVar.f12641d;
            if (aVar2 != null) {
                aVar2.onBidTokenObtainStart(bvVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = iVar.f12641d;
            if (aVar3 != null) {
                aVar3.onBidTokenObtainFail(th.getMessage(), bvVar);
            }
        }
    }

    public static /* synthetic */ void a(i iVar, bv bvVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.v.b.b.a().a(iVar.new AnonymousClass3(aTBidRequestInfo, bvVar));
    }

    public static /* synthetic */ void a(JSONObject jSONObject, bv bvVar) {
        if (bvVar == null || jSONObject == null || bvVar.g() != 2) {
            return;
        }
        try {
            jSONObject.put("admob_bid_type", bvVar.aM());
            jSONObject.put("network_id", bvVar.aL());
        } catch (Throwable unused) {
        }
    }
}
