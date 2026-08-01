package com.anythink.interstitial.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.i;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.d;
import com.anythink.interstitial.api.ATInterstitialExListener;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements CustomInterstitialEventListener {

    /* renamed from: a, reason: collision with root package name */
    ATInterstitialListener f22726a;

    /* renamed from: b, reason: collision with root package name */
    CustomInterstitialAdapter f22727b;

    /* renamed from: c, reason: collision with root package name */
    long f22728c;

    /* renamed from: d, reason: collision with root package name */
    long f22729d;

    /* renamed from: e, reason: collision with root package name */
    int f22730e = 0;

    /* renamed from: f, reason: collision with root package name */
    boolean f22731f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f22732g;

    /* renamed from: h, reason: collision with root package name */
    private final a f22733h;

    public f(CustomInterstitialAdapter customInterstitialAdapter, ATInterstitialListener aTInterstitialListener, a aVar) {
        this.f22726a = aTInterstitialListener;
        this.f22727b = customInterstitialAdapter;
        this.f22733h = aVar;
        if (aVar != null) {
            aVar.a(customInterstitialAdapter, this);
        }
    }

    private n a() {
        a aVar;
        n trackingInfo = this.f22727b.getTrackingInfo();
        if (trackingInfo != null && (aVar = this.f22733h) != null) {
            if (aVar.b() == 0) {
                trackingInfo.ai(0);
                trackingInfo.aj(-1);
                return trackingInfo;
            }
            trackingInfo.ai(this.f22733h.c());
            trackingInfo.aj(this.f22733h.d());
        }
        return trackingInfo;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z3) {
        ATInterstitialListener aTInterstitialListener = this.f22726a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(l.a(this.f22727b), z3);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            ab.a(customInterstitialAdapter.getTrackingInfo(), j.r.f12537j, z3 ? j.r.f12540m : j.r.f12541n, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATInterstitialListener aTInterstitialListener = this.f22726a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDownloadConfirm(context, l.a(this.f22727b), aTNetworkConfirmInfo);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            ab.a(customInterstitialAdapter.getTrackingInfo(), j.r.f12538k, j.r.f12540m, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        a aVar;
        if (this.f22727b != null) {
            n a9 = a();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, a9);
            if (a9 != null ? a9.aw() : false) {
                return;
            } else {
                ab.a(a9, j.r.f12532d, j.r.f12540m, "");
            }
        }
        com.anythink.core.common.v.c.a().b(this.f22727b);
        ATInterstitialListener aTInterstitialListener = this.f22726a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdClicked(l.a(this.f22727b));
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter == null || (aVar = this.f22733h) == null) {
            return;
        }
        aVar.b(customInterstitialAdapter);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            a aVar = this.f22733h;
            if (aVar != null) {
                aVar.c(customInterstitialAdapter);
            }
            n trackingInfo = this.f22727b.getTrackingInfo();
            int i = this.f22730e;
            if (i == 0) {
                i = this.f22727b.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.K(i);
            a aVar2 = this.f22733h;
            if (aVar2 != null) {
                trackingInfo.ai(aVar2.c());
                trackingInfo.ag(this.f22733h.f());
                trackingInfo.ah(this.f22733h.e());
            }
            ab.a(trackingInfo, j.r.f12533e, j.r.f12540m, "");
            long j6 = this.f22728c;
            if (j6 != 0) {
                com.anythink.core.common.u.e.a(trackingInfo, false, j6, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f22729d);
            }
            Map<String, Object> adExtraInfoMap = this.f22727b.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(b.C0074b.f12108a);
                if (obj instanceof Integer) {
                    trackingInfo.R(((Integer) obj).intValue());
                }
            }
            com.anythink.core.common.u.e.a(trackingInfo, false);
            try {
                com.anythink.core.common.v.d.a().d(this.f22727b);
                this.f22727b.clearImpressionListener();
                this.f22727b.internalDestory();
            } catch (Throwable unused) {
            }
            a aVar3 = this.f22733h;
            if (aVar3 == null) {
                ATInterstitialListener aTInterstitialListener = this.f22726a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdClose(l.a(trackingInfo, this.f22727b));
                }
            } else if (aVar3.b() != 1) {
                this.f22733h.a();
                ATInterstitialListener aTInterstitialListener2 = this.f22726a;
                if (aTInterstitialListener2 != null) {
                    aTInterstitialListener2.onInterstitialAdClose(l.a(trackingInfo, this.f22727b));
                }
            }
            a(trackingInfo.aI());
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        a aVar;
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null && (aVar = this.f22733h) != null) {
            aVar.a(customInterstitialAdapter);
        }
        if ((this.f22727b == null || (com.anythink.core.common.v.d.a().a(this.f22727b) && com.anythink.core.common.v.d.a().b(this.f22727b))) && !this.f22732g) {
            this.f22732g = true;
            com.anythink.core.common.v.c.a().a(this.f22727b);
            this.f22728c = System.currentTimeMillis();
            this.f22729d = SystemClock.elapsedRealtime();
            l a9 = l.a(this.f22727b);
            if (this.f22727b != null) {
                final n a10 = a();
                a10.a(this.f22727b.getInternalNetworkInfoMap());
                String ilrd = this.f22727b.getILRD();
                if (!TextUtils.isEmpty(ilrd)) {
                    a10.d(ilrd);
                }
                com.anythink.core.common.v.d.a().a(a10, this.f22727b.getUnitGroupInfo(), 6);
                ab.a(a10, j.r.f12531c, j.r.f12540m, "");
                com.anythink.core.common.v.d.a().a(this.f22727b, new d.a() { // from class: com.anythink.interstitial.a.f.1
                    @Override // com.anythink.core.common.v.d.a
                    public final void a() {
                        com.anythink.core.common.u.c.a(t.b().g()).a(4, a10, f.this.f22727b.getUnitGroupInfo());
                    }

                    @Override // com.anythink.core.common.v.d.a
                    public final void b() {
                    }
                });
                String aI = a10.aI();
                u.a().a(aI, a9);
                a(aI, 6);
            }
            if (this.f22726a != null) {
                if (a9.getNetworkFirmId() == -1) {
                    h.a("Interstitial", this.f22727b, null);
                }
                this.f22726a.onInterstitialAdShow(a9);
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.f22730e = 3;
            }
            n trackingInfo = this.f22727b.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(9, trackingInfo);
            ATInterstitialListener aTInterstitialListener = this.f22726a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoEnd(l.a(this.f22727b));
            }
            ab.a(trackingInfo, j.r.f12535g, j.r.f12540m, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        this.f22730e = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            n trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (trackingInfo.Y() == 66) {
                this.f22731f = false;
            }
            com.anythink.core.common.u.e.a(trackingInfo, errorCode, this.f22727b.getInternalNetworkInfoMap());
            String aI = trackingInfo.aI();
            a(trackingInfo.aI());
            a(aI, 7);
            ab.a(trackingInfo, j.r.f12536h, j.r.f12541n, str2);
        }
        ATInterstitialListener aTInterstitialListener = this.f22726a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f22727b;
        if (customInterstitialAdapter != null) {
            n trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (this.f22731f) {
                com.anythink.core.common.u.c.a(t.b().g()).a(8, trackingInfo);
                ATInterstitialListener aTInterstitialListener = this.f22726a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdVideoStart(l.a(this.f22727b));
                }
            }
        }
    }

    private static void a(String str) {
        i c9;
        if (TextUtils.isEmpty(str) || (c9 = u.a().c(str)) == null) {
            return;
        }
        u.a().d(str);
        com.anythink.core.common.f.a(t.b().g(), str, "3").c(u.a().b(str, c9.a()));
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().M(), str, "3");
        if (a9.a((ATAdStatusInfo) null, i)) {
            ar arVar = new ar();
            arVar.a(t.b().M());
            arVar.f13547c = i;
            if (a9.i() != null) {
                arVar.a(a9.i());
            }
            a9.b(t.b().M(), "3", str, arVar, null);
        }
    }
}
