package com.anythink.core.b;

import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.p;
import com.anythink.core.common.h.z;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    private String f12004a;

    /* renamed from: b, reason: collision with root package name */
    private long f12005b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.b.b.b f12006c;

    public h(com.anythink.core.common.h.a aVar) {
        super(aVar);
        this.f12004a = "IH Bidding";
    }

    private static void b(bv bvVar, String str, long j9, int i) {
        d.a(bvVar, str, j9, i);
    }

    @Override // com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j9) {
    }

    private void b(bv bvVar) {
        ad adVar = new ad(true, bvVar.D(), bvVar.E(), "", "", "", "");
        adVar.f13581f = System.currentTimeMillis() + bvVar.s();
        adVar.f13580e = bvVar.s();
        a(bvVar, adVar);
    }

    @Override // com.anythink.core.b.d
    public final void a(final com.anythink.core.b.b.b bVar) {
        this.f12006c = bVar;
        this.f12005b = SystemClock.elapsedRealtime();
        List<bv> list = this.f11893f.f13491j;
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Start IH Bidding List", d.a(list));
            } catch (Exception unused) {
            }
            ab.a(ab.f16779a, jSONObject.toString(), false);
        }
        if (f.a().b() == null) {
            Iterator<bv> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p a9 = u.a(it.next());
                ATBaseAdAdapter aTBaseAdAdapter = a9 != null ? a9.f14192a : null;
                if (aTBaseAdAdapter != null) {
                    MediationBidManager bidManager = aTBaseAdAdapter.getBidManager();
                    if (bidManager != null) {
                        f.a().a(bidManager);
                    }
                }
            }
        }
        MediationBidManager b9 = f.a().b();
        if (b9 == null) {
            Log.i(ab.f16779a, "No BidManager.");
            a((List<bv>) null, -9);
        } else {
            b9.setBidRequestUrl(this.f11893f.f13496o);
            b9.startBid(this.f11893f, new MediationBidManager.BidListener() { // from class: com.anythink.core.b.h.1
                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidFail(String str) {
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidStart(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter2) {
                    com.anythink.core.b.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(bvVar, aTBaseAdAdapter2);
                    }
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidSuccess(List<bv> list2) {
                    h.this.a(list2, -1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<bv> list, int i) {
        try {
            if (this.f11895h.get()) {
                return;
            }
            this.f11895h.set(true);
            List<bv> arrayList = list == null ? new ArrayList<>() : list;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12005b;
            ArrayList arrayList2 = new ArrayList();
            for (bv bvVar : this.f11893f.f13491j) {
                Iterator<bv> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        bv next = it.next();
                        if (bvVar.z().equals(next.z())) {
                            next.c(elapsedRealtime);
                            next.g(0);
                            ad adVar = new ad(true, next.D(), next.E(), "", "", "", "");
                            adVar.f13581f = next.s() + System.currentTimeMillis();
                            adVar.f13580e = next.s();
                            a(next, adVar);
                            break;
                        }
                    } else {
                        if (MediationBidManager.NO_BID_TOKEN_ERROR.equals(bvVar.F())) {
                            b(bvVar, "No Bid Info.", 0L, -2);
                        } else {
                            b(bvVar, "No Bid Info.", elapsedRealtime, i);
                        }
                        if (a(bvVar, "No Bid Info.", i)) {
                            arrayList.add(bvVar);
                        } else {
                            arrayList2.add(bvVar);
                        }
                    }
                }
            }
            if (ATSDK.isNetworkLogDebug()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("IH Bidding Success List", d.a(arrayList));
                    jSONObject.put("IH Bidding Fail List", d.a(arrayList2));
                } catch (Exception unused) {
                }
                ab.a(this.f12004a, jSONObject.toString(), false);
            }
            this.f11895h.set(true);
            com.anythink.core.b.b.b bVar = this.f12006c;
            if (bVar != null) {
                bVar.a(arrayList, arrayList2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        a((List<bv>) null, -3);
    }
}
