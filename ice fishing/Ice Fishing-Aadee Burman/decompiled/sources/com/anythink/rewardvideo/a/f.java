package com.anythink.rewardvideo.a;

import D.y;
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
    long f23300b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23301c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23302d;

    /* renamed from: e, reason: collision with root package name */
    n f23303e;

    /* renamed from: f, reason: collision with root package name */
    boolean f23304f;

    /* renamed from: g, reason: collision with root package name */
    long f23305g;

    /* renamed from: h, reason: collision with root package name */
    long f23306h;
    boolean i;

    /* renamed from: l, reason: collision with root package name */
    boolean f23309l;

    /* renamed from: m, reason: collision with root package name */
    boolean f23310m;

    /* renamed from: n, reason: collision with root package name */
    private ATRewardVideoListener f23311n;

    /* renamed from: o, reason: collision with root package name */
    private CustomRewardVideoAdapter f23312o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.k.e f23313p;

    /* renamed from: q, reason: collision with root package name */
    private long f23314q;

    /* renamed from: r, reason: collision with root package name */
    private long f23315r;

    /* renamed from: j, reason: collision with root package name */
    int f23307j = 0;

    /* renamed from: a, reason: collision with root package name */
    long f23299a = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f23308k = true;

    public f(CustomRewardVideoAdapter customRewardVideoAdapter, com.anythink.core.common.k.e eVar, ATRewardVideoListener aTRewardVideoListener) {
        this.f23311n = aTRewardVideoListener;
        this.f23312o = customRewardVideoAdapter;
        this.f23313p = eVar;
    }

    private static void b(n nVar) {
        ab.a(nVar, j.r.f12535g, j.r.f12540m, "");
        com.anythink.core.common.u.c.a(t.b().g()).a(9, nVar);
    }

    private boolean c(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(6, nVar);
        if (nVar != null ? nVar.aw() : false) {
            return false;
        }
        com.anythink.core.common.v.c.a().b(this.f23312o);
        ab.a(nVar, j.r.f12532d, j.r.f12540m, "");
        return true;
    }

    private void d(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(13, nVar, this.f23312o.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, this.f23312o.getUnitGroupInfo(), com.anythink.core.common.v.d.f16729b);
        a(nVar);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        com.anythink.core.common.k.e eVar;
        if (this.f23312o == null || com.anythink.core.common.v.d.a().c(this.f23312o)) {
            n a9 = a();
            if (!this.f23304f && (eVar = this.f23313p) != null) {
                a(eVar, a9, true, true);
                this.f23313p.a(this.f23305g, this.f23306h, this.f23312o, a9);
            }
            this.f23304f = true;
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(l.a(a9, this.f23312o));
            }
            if (this.f23312o != null) {
                ab.a(a9, j.r.i, j.r.f12540m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainRewardFailed() {
        try {
            if (this.f23304f) {
                return;
            }
            this.f23304f = true;
            n a9 = a();
            a(this.f23313p, a9, false, true);
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainRewardFailed(l.a(a9, this.f23312o));
            }
            if (this.f23312o != null) {
                ab.a(a9, j.r.i, j.r.f12541n, "");
            }
        } catch (Throwable th) {
            y.w("onAgainRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z3) {
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(l.a(this.f23312o), z3);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f12537j, z3 ? j.r.f12540m : j.r.f12541n, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDownloadConfirm(context, l.a(this.f23312o), aTNetworkConfirmInfo);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f12538k, j.r.f12540m, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        if ((this.f23312o == null || com.anythink.core.common.v.d.a().c(this.f23312o)) && !this.f23302d) {
            this.f23302d = true;
            if (!this.f23301c && this.f23313p != null) {
                n trackingInfo = this.f23312o.getTrackingInfo();
                a(this.f23313p, trackingInfo, true, false);
                this.f23313p.a(this.f23314q, this.f23315r, this.f23312o, trackingInfo);
            }
            this.f23301c = true;
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onReward(l.a(this.f23312o));
            }
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
            if (customRewardVideoAdapter != null) {
                ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.i, j.r.f12540m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardFailed() {
        try {
            if (this.f23302d) {
                return;
            }
            this.f23302d = true;
            n trackingInfo = this.f23312o.getTrackingInfo();
            a(this.f23313p, trackingInfo, false, false);
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onRewardFailed(l.a(this.f23312o));
            }
            if (this.f23312o != null) {
                ab.a(trackingInfo, j.r.i, j.r.f12541n, "");
            }
        } catch (Throwable th) {
            y.w("onRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        n a9 = a();
        if (((this.f23312o == null || a9 == null) ? true : c(a9)) && (aTRewardVideoListener = this.f23311n) != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(l.a(a9, this.f23312o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (this.f23306h == 0) {
            this.f23306h = SystemClock.elapsedRealtime();
        }
        n a9 = a();
        if (this.f23312o != null && a9 != null) {
            b(a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(l.a(a9, this.f23312o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.f23307j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        n a9 = a();
        if (this.f23312o != null && a9 != null) {
            a(errorCode, a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, l.a(a9, this.f23312o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        if (this.f23312o == null || (com.anythink.core.common.v.d.a().a(this.f23312o) && com.anythink.core.common.v.d.a().b(this.f23312o))) {
            this.f23307j = 0;
            if (this.f23305g == 0) {
                this.f23305g = SystemClock.elapsedRealtime();
            }
            this.f23306h = 0L;
            n a9 = a();
            if (this.f23312o != null && a9 != null) {
                com.anythink.core.common.v.d.a().a(a9, this.f23312o.getUnitGroupInfo(), 6);
                com.anythink.core.common.u.c.a(t.b().g()).a(13, a9, this.f23312o.getUnitGroupInfo());
                com.anythink.core.common.v.d.a().a(a9, this.f23312o.getUnitGroupInfo(), com.anythink.core.common.v.d.f16729b);
                a(a9);
                com.anythink.core.common.k.e eVar = this.f23313p;
                if (eVar != null) {
                    eVar.a(this.f23300b, this.f23312o, a9);
                }
            }
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                return;
            }
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(l.a(a9, this.f23312o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int i = this.f23307j;
            if (i == 0) {
                i = this.f23312o.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.K(i);
            ab.a(trackingInfo, j.r.f12533e, j.r.f12540m, this.f23301c ? "" : "onReward() is not fired");
            long j6 = this.f23299a;
            if (j6 != 0) {
                com.anythink.core.common.u.e.a(trackingInfo, this.f23301c, j6, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f23300b);
            }
            Map<String, Object> adExtraInfoMap = this.f23312o.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(b.C0074b.f12108a);
                if (obj instanceof Integer) {
                    trackingInfo.R(((Integer) obj).intValue());
                }
            }
            com.anythink.core.common.u.e.a(trackingInfo, this.f23301c);
            if (this.f23302d) {
                try {
                    com.anythink.core.common.v.d.a().d(this.f23312o);
                    this.f23312o.clearImpressionListener();
                    this.f23312o.internalDestory();
                } catch (Throwable unused) {
                }
            } else {
                t.b().a(new Runnable() { // from class: com.anythink.rewardvideo.a.f.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.anythink.core.common.v.d.a().d(f.this.f23312o);
                            f.this.f23312o.clearImpressionListener();
                            f.this.f23312o.internalDestory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, com.anythink.basead.exoplayer.f.f7187a);
            }
            a(trackingInfo.aI());
            ATRewardVideoListener aTRewardVideoListener = this.f23311n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdClosed(l.a(trackingInfo, this.f23312o));
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (!(customRewardVideoAdapter != null ? c(customRewardVideoAdapter.getTrackingInfo()) : true) || (aTRewardVideoListener = this.f23311n) == null) {
            return;
        }
        aTRewardVideoListener.onRewardedVideoAdPlayClicked(l.a(this.f23312o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.f23310m) {
            return;
        }
        this.f23310m = true;
        if (this.f23315r == 0) {
            this.f23315r = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.f23307j = 3;
            }
            b(this.f23312o.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayEnd(l.a(this.f23312o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.f23307j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            if (trackingInfo.Y() == 66) {
                this.f23308k = false;
            }
            String aI = trackingInfo.aI();
            a(errorCode, trackingInfo);
            a(trackingInfo.aI());
            a(aI, 7);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23311n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a(this.f23312o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        if ((this.f23312o == null || (com.anythink.core.common.v.d.a().a(this.f23312o) && com.anythink.core.common.v.d.a().b(this.f23312o))) && !this.f23309l) {
            this.f23309l = true;
            this.f23299a = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23300b = elapsedRealtime;
            if (this.f23314q == 0) {
                this.f23314q = elapsedRealtime;
            }
            l a9 = l.a(this.f23312o);
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
            if (customRewardVideoAdapter != null) {
                n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
                trackingInfo.a(this.f23312o.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f23312o.getUnitGroupInfo(), 6);
                a(trackingInfo);
                com.anythink.core.common.k.e eVar = this.f23313p;
                if (eVar != null) {
                    eVar.a(this.f23300b, this.f23312o, trackingInfo);
                }
                String aI = trackingInfo.aI();
                u.a().a(aI, a9);
                a(aI, 6);
            }
            if (!this.f23308k || this.f23311n == null) {
                return;
            }
            if (a9.getNetworkFirmId() == -1) {
                h.a(j.n.f12506b, this.f23312o, null);
            }
            this.f23311n.onRewardedVideoAdPlayStart(a9);
        }
    }

    private n a() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.f23303e == null && (customRewardVideoAdapter = this.f23312o) != null) {
            n af = customRewardVideoAdapter.getTrackingInfo().af();
            this.f23303e = af;
            af.f14025t = 6;
            this.f23303e.n(p.b(af.aJ(), this.f23303e.M(), System.currentTimeMillis()));
        }
        return this.f23303e;
    }

    private void a(final n nVar) {
        com.anythink.core.common.v.c.a().a(this.f23312o);
        String ilrd = this.f23312o.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            nVar.d(ilrd);
        }
        com.anythink.core.common.v.d.a().a(this.f23312o, new d.a() { // from class: com.anythink.rewardvideo.a.f.2
            @Override // com.anythink.core.common.v.d.a
            public final void a() {
                com.anythink.core.common.u.c.a(t.b().g()).a(4, nVar, f.this.f23312o.getUnitGroupInfo());
            }

            @Override // com.anythink.core.common.v.d.a
            public final void b() {
            }
        });
        if (this.f23308k) {
            com.anythink.core.common.u.c.a(t.b().g()).a(8, nVar);
        }
        ab.a(nVar, j.r.f12531c, j.r.f12540m, "");
    }

    private void a(AdError adError, n nVar) {
        ab.a(nVar, j.r.f12531c, j.r.f12541n, adError.printStackTrace());
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23312o;
        com.anythink.core.common.u.e.a(nVar, adError, customRewardVideoAdapter != null ? customRewardVideoAdapter.getInternalNetworkInfoMap() : null);
    }

    private void a(com.anythink.core.common.k.e eVar, n nVar, boolean z3, boolean z6) {
        long elapsedRealtime;
        long j6;
        boolean z9 = z6 ? this.i : this.f23310m;
        i.a();
        String g4 = i.g();
        nVar.a(bc.a(z9, g4, z3));
        com.anythink.core.common.u.c.a(t.b().g()).a(25, nVar);
        if (z6) {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j6 = this.f23305g;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j6 = this.f23314q;
        }
        com.anythink.core.common.u.e.a(eVar, z3, nVar, elapsedRealtime - j6, z9, g4, this.f23312o);
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
            arVar.f13547c = i;
            if (a9.i() != null) {
                arVar.a(a9.i());
            }
            a9.b(t.b().M(), "1", str, arVar, null);
        }
    }
}
