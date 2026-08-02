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
    ATInterstitialListener f23513a;

    /* renamed from: b, reason: collision with root package name */
    CustomInterstitialAdapter f23514b;

    /* renamed from: c, reason: collision with root package name */
    long f23515c;

    /* renamed from: d, reason: collision with root package name */
    long f23516d;

    /* renamed from: e, reason: collision with root package name */
    int f23517e = 0;

    /* renamed from: f, reason: collision with root package name */
    boolean f23518f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f23519g;

    /* renamed from: h, reason: collision with root package name */
    private final a f23520h;

    public f(CustomInterstitialAdapter customInterstitialAdapter, ATInterstitialListener aTInterstitialListener, a aVar) {
        this.f23513a = aTInterstitialListener;
        this.f23514b = customInterstitialAdapter;
        this.f23520h = aVar;
        if (aVar != null) {
            aVar.a(customInterstitialAdapter, this);
        }
    }

    private n a() {
        a aVar;
        n trackingInfo = this.f23514b.getTrackingInfo();
        if (trackingInfo != null && (aVar = this.f23520h) != null) {
            if (aVar.b() == 0) {
                trackingInfo.ai(0);
                trackingInfo.aj(-1);
                return trackingInfo;
            }
            trackingInfo.ai(this.f23520h.c());
            trackingInfo.aj(this.f23520h.d());
        }
        return trackingInfo;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z6) {
        ATInterstitialListener aTInterstitialListener = this.f23513a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(l.a(this.f23514b), z6);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            ab.a(customInterstitialAdapter.getTrackingInfo(), j.r.f13323j, z6 ? j.r.f13326m : j.r.f13327n, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATInterstitialListener aTInterstitialListener = this.f23513a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDownloadConfirm(context, l.a(this.f23514b), aTNetworkConfirmInfo);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            ab.a(customInterstitialAdapter.getTrackingInfo(), j.r.f13324k, j.r.f13326m, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        a aVar;
        if (this.f23514b != null) {
            n a9 = a();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, a9);
            if (a9 != null ? a9.aw() : false) {
                return;
            } else {
                ab.a(a9, j.r.f13318d, j.r.f13326m, "");
            }
        }
        com.anythink.core.common.v.c.a().b(this.f23514b);
        ATInterstitialListener aTInterstitialListener = this.f23513a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdClicked(l.a(this.f23514b));
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter == null || (aVar = this.f23520h) == null) {
            return;
        }
        aVar.b(customInterstitialAdapter);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            a aVar = this.f23520h;
            if (aVar != null) {
                aVar.c(customInterstitialAdapter);
            }
            n trackingInfo = this.f23514b.getTrackingInfo();
            int i = this.f23517e;
            if (i == 0) {
                i = this.f23514b.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.K(i);
            a aVar2 = this.f23520h;
            if (aVar2 != null) {
                trackingInfo.ai(aVar2.c());
                trackingInfo.ag(this.f23520h.f());
                trackingInfo.ah(this.f23520h.e());
            }
            ab.a(trackingInfo, j.r.f13319e, j.r.f13326m, "");
            long j6 = this.f23515c;
            if (j6 != 0) {
                com.anythink.core.common.u.e.a(trackingInfo, false, j6, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f23516d);
            }
            Map<String, Object> adExtraInfoMap = this.f23514b.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(b.C0074b.f12894a);
                if (obj instanceof Integer) {
                    trackingInfo.R(((Integer) obj).intValue());
                }
            }
            com.anythink.core.common.u.e.a(trackingInfo, false);
            try {
                com.anythink.core.common.v.d.a().d(this.f23514b);
                this.f23514b.clearImpressionListener();
                this.f23514b.internalDestory();
            } catch (Throwable unused) {
            }
            a aVar3 = this.f23520h;
            if (aVar3 == null) {
                ATInterstitialListener aTInterstitialListener = this.f23513a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdClose(l.a(trackingInfo, this.f23514b));
                }
            } else if (aVar3.b() != 1) {
                this.f23520h.a();
                ATInterstitialListener aTInterstitialListener2 = this.f23513a;
                if (aTInterstitialListener2 != null) {
                    aTInterstitialListener2.onInterstitialAdClose(l.a(trackingInfo, this.f23514b));
                }
            }
            a(trackingInfo.aI());
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        a aVar;
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null && (aVar = this.f23520h) != null) {
            aVar.a(customInterstitialAdapter);
        }
        if ((this.f23514b == null || (com.anythink.core.common.v.d.a().a(this.f23514b) && com.anythink.core.common.v.d.a().b(this.f23514b))) && !this.f23519g) {
            this.f23519g = true;
            com.anythink.core.common.v.c.a().a(this.f23514b);
            this.f23515c = System.currentTimeMillis();
            this.f23516d = SystemClock.elapsedRealtime();
            l a9 = l.a(this.f23514b);
            if (this.f23514b != null) {
                final n a10 = a();
                a10.a(this.f23514b.getInternalNetworkInfoMap());
                String ilrd = this.f23514b.getILRD();
                if (!TextUtils.isEmpty(ilrd)) {
                    a10.d(ilrd);
                }
                com.anythink.core.common.v.d.a().a(a10, this.f23514b.getUnitGroupInfo(), 6);
                ab.a(a10, j.r.f13317c, j.r.f13326m, "");
                com.anythink.core.common.v.d.a().a(this.f23514b, new d.a() { // from class: com.anythink.interstitial.a.f.1
                    @Override // com.anythink.core.common.v.d.a
                    public final void a() {
                        com.anythink.core.common.u.c.a(t.b().g()).a(4, a10, f.this.f23514b.getUnitGroupInfo());
                    }

                    @Override // com.anythink.core.common.v.d.a
                    public final void b() {
                    }
                });
                String aI = a10.aI();
                u.a().a(aI, a9);
                a(aI, 6);
            }
            if (this.f23513a != null) {
                if (a9.getNetworkFirmId() == -1) {
                    h.a("Interstitial", this.f23514b, null);
                }
                this.f23513a.onInterstitialAdShow(a9);
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.f23517e = 3;
            }
            n trackingInfo = this.f23514b.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(9, trackingInfo);
            ATInterstitialListener aTInterstitialListener = this.f23513a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoEnd(l.a(this.f23514b));
            }
            ab.a(trackingInfo, j.r.f13321g, j.r.f13326m, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        this.f23517e = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            n trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (trackingInfo.Y() == 66) {
                this.f23518f = false;
            }
            com.anythink.core.common.u.e.a(trackingInfo, errorCode, this.f23514b.getInternalNetworkInfoMap());
            String aI = trackingInfo.aI();
            a(trackingInfo.aI());
            a(aI, 7);
            ab.a(trackingInfo, j.r.f13322h, j.r.f13327n, str2);
        }
        ATInterstitialListener aTInterstitialListener = this.f23513a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f23514b;
        if (customInterstitialAdapter != null) {
            n trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (this.f23518f) {
                com.anythink.core.common.u.c.a(t.b().g()).a(8, trackingInfo);
                ATInterstitialListener aTInterstitialListener = this.f23513a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdVideoStart(l.a(this.f23514b));
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
            arVar.f14333c = i;
            if (a9.i() != null) {
                arVar.a(a9.i());
            }
            a9.b(t.b().M(), "3", str, arVar, null);
        }
    }
}
