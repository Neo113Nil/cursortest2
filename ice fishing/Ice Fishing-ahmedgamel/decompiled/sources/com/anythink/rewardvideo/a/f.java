package com.anythink.rewardvideo.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bc;
import com.anythink.core.common.h.n;
import com.anythink.core.common.i;
import com.anythink.core.common.u;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.d;
import com.anythink.core.common.v.p;
import com.anythink.rewardvideo.api.ATRewardVideoExListener;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements CustomRewardedVideoEventListener {

    /* renamed from: b, reason: collision with root package name */
    long f24087b;

    /* renamed from: c, reason: collision with root package name */
    boolean f24088c;

    /* renamed from: d, reason: collision with root package name */
    boolean f24089d;

    /* renamed from: e, reason: collision with root package name */
    n f24090e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24091f;

    /* renamed from: g, reason: collision with root package name */
    long f24092g;

    /* renamed from: h, reason: collision with root package name */
    long f24093h;
    boolean i;

    /* renamed from: l, reason: collision with root package name */
    boolean f24096l;

    /* renamed from: m, reason: collision with root package name */
    boolean f24097m;

    /* renamed from: n, reason: collision with root package name */
    private ATRewardVideoListener f24098n;

    /* renamed from: o, reason: collision with root package name */
    private CustomRewardVideoAdapter f24099o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.k.e f24100p;

    /* renamed from: q, reason: collision with root package name */
    private long f24101q;

    /* renamed from: r, reason: collision with root package name */
    private long f24102r;

    /* renamed from: j, reason: collision with root package name */
    int f24094j = 0;

    /* renamed from: a, reason: collision with root package name */
    long f24086a = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f24095k = true;

    public f(CustomRewardVideoAdapter customRewardVideoAdapter, com.anythink.core.common.k.e eVar, ATRewardVideoListener aTRewardVideoListener) {
        this.f24098n = aTRewardVideoListener;
        this.f24099o = customRewardVideoAdapter;
        this.f24100p = eVar;
    }

    private static void b(n nVar) {
        ab.a(nVar, j.r.f13321g, j.r.f13326m, "");
        com.anythink.core.common.u.c.a(t.b().g()).a(9, nVar);
    }

    private boolean c(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(6, nVar);
        if (nVar != null ? nVar.aw() : false) {
            return false;
        }
        com.anythink.core.common.v.c.a().b(this.f24099o);
        ab.a(nVar, j.r.f13318d, j.r.f13326m, "");
        return true;
    }

    private void d(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(13, nVar, this.f24099o.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, this.f24099o.getUnitGroupInfo(), com.anythink.core.common.v.d.f17516b);
        a(nVar);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        com.anythink.core.common.k.e eVar;
        if (this.f24099o == null || com.anythink.core.common.v.d.a().c(this.f24099o)) {
            n a9 = a();
            if (!this.f24091f && (eVar = this.f24100p) != null) {
                a(eVar, a9, true, true);
                this.f24100p.a(this.f24092g, this.f24093h, this.f24099o, a9);
            }
            this.f24091f = true;
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(l.a(a9, this.f24099o));
            }
            if (this.f24099o != null) {
                ab.a(a9, j.r.i, j.r.f13326m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainRewardFailed() {
        try {
            if (this.f24091f) {
                return;
            }
            this.f24091f = true;
            n a9 = a();
            a(this.f24100p, a9, false, true);
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainRewardFailed(l.a(a9, this.f24099o));
            }
            if (this.f24099o != null) {
                ab.a(a9, j.r.i, j.r.f13327n, "");
            }
        } catch (Throwable th) {
            k.x("onAgainRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z6) {
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(l.a(this.f24099o), z6);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f13323j, z6 ? j.r.f13326m : j.r.f13327n, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDownloadConfirm(context, l.a(this.f24099o), aTNetworkConfirmInfo);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f13324k, j.r.f13326m, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        if ((this.f24099o == null || com.anythink.core.common.v.d.a().c(this.f24099o)) && !this.f24089d) {
            this.f24089d = true;
            if (!this.f24088c && this.f24100p != null) {
                n trackingInfo = this.f24099o.getTrackingInfo();
                a(this.f24100p, trackingInfo, true, false);
                this.f24100p.a(this.f24101q, this.f24102r, this.f24099o, trackingInfo);
            }
            this.f24088c = true;
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onReward(l.a(this.f24099o));
            }
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
            if (customRewardVideoAdapter != null) {
                ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.i, j.r.f13326m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardFailed() {
        try {
            if (this.f24089d) {
                return;
            }
            this.f24089d = true;
            n trackingInfo = this.f24099o.getTrackingInfo();
            a(this.f24100p, trackingInfo, false, false);
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onRewardFailed(l.a(this.f24099o));
            }
            if (this.f24099o != null) {
                ab.a(trackingInfo, j.r.i, j.r.f13327n, "");
            }
        } catch (Throwable th) {
            k.x("onRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        n a9 = a();
        if (((this.f24099o == null || a9 == null) ? true : c(a9)) && (aTRewardVideoListener = this.f24098n) != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(l.a(a9, this.f24099o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (this.f24093h == 0) {
            this.f24093h = SystemClock.elapsedRealtime();
        }
        n a9 = a();
        if (this.f24099o != null && a9 != null) {
            b(a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(l.a(a9, this.f24099o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.f24094j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        n a9 = a();
        if (this.f24099o != null && a9 != null) {
            a(errorCode, a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, l.a(a9, this.f24099o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        if (this.f24099o == null || (com.anythink.core.common.v.d.a().a(this.f24099o) && com.anythink.core.common.v.d.a().b(this.f24099o))) {
            this.f24094j = 0;
            if (this.f24092g == 0) {
                this.f24092g = SystemClock.elapsedRealtime();
            }
            this.f24093h = 0L;
            n a9 = a();
            if (this.f24099o != null && a9 != null) {
                com.anythink.core.common.v.d.a().a(a9, this.f24099o.getUnitGroupInfo(), 6);
                com.anythink.core.common.u.c.a(t.b().g()).a(13, a9, this.f24099o.getUnitGroupInfo());
                com.anythink.core.common.v.d.a().a(a9, this.f24099o.getUnitGroupInfo(), com.anythink.core.common.v.d.f17516b);
                a(a9);
                com.anythink.core.common.k.e eVar = this.f24100p;
                if (eVar != null) {
                    eVar.a(this.f24087b, this.f24099o, a9);
                }
            }
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                return;
            }
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(l.a(a9, this.f24099o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int i = this.f24094j;
            if (i == 0) {
                i = this.f24099o.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.K(i);
            ab.a(trackingInfo, j.r.f13319e, j.r.f13326m, this.f24088c ? "" : "onReward() is not fired");
            long j6 = this.f24086a;
            if (j6 != 0) {
                com.anythink.core.common.u.e.a(trackingInfo, this.f24088c, j6, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f24087b);
            }
            Map<String, Object> adExtraInfoMap = this.f24099o.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(b.C0074b.f12894a);
                if (obj instanceof Integer) {
                    trackingInfo.R(((Integer) obj).intValue());
                }
            }
            com.anythink.core.common.u.e.a(trackingInfo, this.f24088c);
            if (this.f24089d) {
                try {
                    com.anythink.core.common.v.d.a().d(this.f24099o);
                    this.f24099o.clearImpressionListener();
                    this.f24099o.internalDestory();
                } catch (Throwable unused) {
                }
            } else {
                t.b().a(new Runnable() { // from class: com.anythink.rewardvideo.a.f.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.anythink.core.common.v.d.a().d(f.this.f24099o);
                            f.this.f24099o.clearImpressionListener();
                            f.this.f24099o.internalDestory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, com.anythink.basead.exoplayer.f.f7973a);
            }
            a(trackingInfo.aI());
            ATRewardVideoListener aTRewardVideoListener = this.f24098n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdClosed(l.a(trackingInfo, this.f24099o));
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (!(customRewardVideoAdapter != null ? c(customRewardVideoAdapter.getTrackingInfo()) : true) || (aTRewardVideoListener = this.f24098n) == null) {
            return;
        }
        aTRewardVideoListener.onRewardedVideoAdPlayClicked(l.a(this.f24099o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.f24097m) {
            return;
        }
        this.f24097m = true;
        if (this.f24102r == 0) {
            this.f24102r = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.f24094j = 3;
            }
            b(this.f24099o.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayEnd(l.a(this.f24099o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.f24094j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            if (trackingInfo.Y() == 66) {
                this.f24095k = false;
            }
            String aI = trackingInfo.aI();
            a(errorCode, trackingInfo);
            a(trackingInfo.aI());
            a(aI, 7);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f24098n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a(this.f24099o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        if ((this.f24099o == null || (com.anythink.core.common.v.d.a().a(this.f24099o) && com.anythink.core.common.v.d.a().b(this.f24099o))) && !this.f24096l) {
            this.f24096l = true;
            this.f24086a = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f24087b = elapsedRealtime;
            if (this.f24101q == 0) {
                this.f24101q = elapsedRealtime;
            }
            l a9 = l.a(this.f24099o);
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
            if (customRewardVideoAdapter != null) {
                n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
                trackingInfo.a(this.f24099o.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f24099o.getUnitGroupInfo(), 6);
                a(trackingInfo);
                com.anythink.core.common.k.e eVar = this.f24100p;
                if (eVar != null) {
                    eVar.a(this.f24087b, this.f24099o, trackingInfo);
                }
                String aI = trackingInfo.aI();
                u.a().a(aI, a9);
                a(aI, 6);
            }
            if (!this.f24095k || this.f24098n == null) {
                return;
            }
            if (a9.getNetworkFirmId() == -1) {
                h.a(j.n.f13292b, this.f24099o, null);
            }
            this.f24098n.onRewardedVideoAdPlayStart(a9);
        }
    }

    private n a() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.f24090e == null && (customRewardVideoAdapter = this.f24099o) != null) {
            n af = customRewardVideoAdapter.getTrackingInfo().af();
            this.f24090e = af;
            af.f14811t = 6;
            this.f24090e.n(p.b(af.aJ(), this.f24090e.M(), System.currentTimeMillis()));
        }
        return this.f24090e;
    }

    private void a(final n nVar) {
        com.anythink.core.common.v.c.a().a(this.f24099o);
        String ilrd = this.f24099o.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            nVar.d(ilrd);
        }
        com.anythink.core.common.v.d.a().a(this.f24099o, new d.a() { // from class: com.anythink.rewardvideo.a.f.2
            @Override // com.anythink.core.common.v.d.a
            public final void a() {
                com.anythink.core.common.u.c.a(t.b().g()).a(4, nVar, f.this.f24099o.getUnitGroupInfo());
            }

            @Override // com.anythink.core.common.v.d.a
            public final void b() {
            }
        });
        if (this.f24095k) {
            com.anythink.core.common.u.c.a(t.b().g()).a(8, nVar);
        }
        ab.a(nVar, j.r.f13317c, j.r.f13326m, "");
    }

    private void a(AdError adError, n nVar) {
        ab.a(nVar, j.r.f13317c, j.r.f13327n, adError.printStackTrace());
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f24099o;
        com.anythink.core.common.u.e.a(nVar, adError, customRewardVideoAdapter != null ? customRewardVideoAdapter.getInternalNetworkInfoMap() : null);
    }

    private void a(com.anythink.core.common.k.e eVar, n nVar, boolean z6, boolean z9) {
        long elapsedRealtime;
        long j6;
        boolean z10 = z9 ? this.i : this.f24097m;
        i.a();
        String g9 = i.g();
        nVar.a(bc.a(z10, g9, z6));
        com.anythink.core.common.u.c.a(t.b().g()).a(25, nVar);
        if (z9) {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j6 = this.f24092g;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j6 = this.f24101q;
        }
        com.anythink.core.common.u.e.a(eVar, z6, nVar, elapsedRealtime - j6, z10, g9, this.f24099o);
    }

    private static void a(String str) {
        com.anythink.core.common.h.i c9;
        if (TextUtils.isEmpty(str) || (c9 = u.a().c(str)) == null) {
            return;
        }
        u.a().d(str);
        com.anythink.core.common.f.a(t.b().g(), str, "1").c(u.a().b(str, c9.a()));
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().M(), str, "1");
        if (a9.a((ATAdStatusInfo) null, i)) {
            ar arVar = new ar();
            arVar.a(t.b().M());
            arVar.f14333c = i;
            if (a9.i() != null) {
                arVar.a(a9.i());
            }
            a9.b(t.b().M(), "1", str, arVar, null);
        }
    }
}
