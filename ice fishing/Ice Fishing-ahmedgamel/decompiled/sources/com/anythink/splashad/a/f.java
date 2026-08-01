package com.anythink.splashad.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.i;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.d;
import com.anythink.splashad.api.ATSplashAdExtraInfo;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.api.IATSplashEyeAd;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class f implements CustomSplashEventListener {

    /* renamed from: a, reason: collision with root package name */
    CustomSplashAdapter f23347a;

    /* renamed from: b, reason: collision with root package name */
    a f23348b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23349c;

    /* renamed from: d, reason: collision with root package name */
    long f23350d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f23351e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23352f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f23353g = 0;

    /* renamed from: com.anythink.splashad.a.f$2, reason: invalid class name */
    public class AnonymousClass2 extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f23357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f23358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f23359d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f23360e;

        public AnonymousClass2(ViewGroup viewGroup, f.b bVar, ATSplashSkipAdListener aTSplashSkipAdListener, long j6, long j9) {
            this.f23356a = viewGroup;
            this.f23357b = bVar;
            this.f23358c = aTSplashSkipAdListener;
            this.f23359d = j6;
            this.f23360e = j9;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup = this.f23356a;
            if (viewGroup == null || am.a(viewGroup, this.f23357b)) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.a.f.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        f fVar = f.this;
                        long j6 = fVar.f23350d;
                        if (j6 <= 0) {
                            fVar.a(3);
                            f.this.onSplashAdDismiss();
                        } else {
                            ATSplashSkipAdListener aTSplashSkipAdListener = anonymousClass2.f23358c;
                            if (aTSplashSkipAdListener != null) {
                                aTSplashSkipAdListener.onAdTick(anonymousClass2.f23359d, j6);
                            }
                        }
                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                        f.this.f23350d -= anonymousClass22.f23360e;
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.splashad.a.f$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f23363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f23364b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23365c;

        public AnonymousClass3(ATSplashSkipAdListener aTSplashSkipAdListener, long j6, long j9) {
            this.f23363a = aTSplashSkipAdListener;
            this.f23364b = j6;
            this.f23365c = j9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATSplashSkipAdListener aTSplashSkipAdListener = this.f23363a;
            if (aTSplashSkipAdListener != null) {
                aTSplashSkipAdListener.onAdTick(this.f23364b, f.this.f23350d);
                f.this.f23350d -= this.f23365c;
            }
        }
    }

    public f(CustomSplashAdapter customSplashAdapter, a aVar) {
        this.f23347a = customSplashAdapter;
        this.f23348b = aVar;
    }

    private void a(ATSplashSkipInfo aTSplashSkipInfo) {
        if (this.f23351e == null) {
            long callbackInterval = aTSplashSkipInfo.getCallbackInterval();
            long countDownDuration = aTSplashSkipInfo.getCountDownDuration();
            ViewGroup container = aTSplashSkipInfo.getContainer();
            f.b bVar = new f.b(1);
            ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
            this.f23350d = countDownDuration;
            Timer timer = new Timer();
            this.f23351e = timer;
            timer.schedule(new AnonymousClass2(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
            t.b().b(new AnonymousClass3(aTSplashSkipAdListener, countDownDuration, callbackInterval));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z3) {
        a aVar = this.f23348b;
        if (aVar != null) {
            aVar.onDeeplinkCallback(l.a(this.f23347a), z3);
        }
        CustomSplashAdapter customSplashAdapter = this.f23347a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f12537j, z3 ? j.r.f12540m : j.r.f12541n, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar = this.f23348b;
        if (aVar != null) {
            aVar.onDownloadConfirm(context, l.a(this.f23347a), aTNetworkConfirmInfo);
        }
        CustomSplashAdapter customSplashAdapter = this.f23347a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f12538k, j.r.f12540m, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.f23347a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            } else {
                ab.a(trackingInfo, j.r.f12532d, j.r.f12540m, "");
            }
        }
        com.anythink.core.common.v.c.a().b(this.f23347a);
        a aVar = this.f23348b;
        if (aVar != null) {
            aVar.onAdClick(l.a(this.f23347a));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdDismiss() {
        boolean z3;
        Timer timer = this.f23351e;
        if (timer != null) {
            timer.cancel();
        }
        CustomSplashAdapter customSplashAdapter = this.f23347a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            int i = this.f23353g;
            if (i != 0) {
                trackingInfo.K(i);
            } else {
                i = this.f23347a.getDismissType();
                if (i == 0) {
                    i = 1;
                }
                trackingInfo.K(i);
            }
            Map<String, Object> adExtraInfoMap = this.f23347a.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object remove = adExtraInfoMap.remove(b.C0074b.f12108a);
                Object remove2 = adExtraInfoMap.remove(b.C0074b.f12109b);
                if (remove instanceof Integer) {
                    trackingInfo.R(((Integer) remove).intValue());
                }
                z3 = remove2 instanceof Boolean ? ((Boolean) remove2).booleanValue() : true;
                Object remove3 = adExtraInfoMap.remove(b.C0074b.f12110c);
                Object remove4 = adExtraInfoMap.remove(b.C0074b.f12111d);
                if (remove3 instanceof Integer) {
                    trackingInfo.S(((Integer) remove3).intValue());
                } else {
                    trackingInfo.S(2);
                }
                if (remove4 instanceof Integer) {
                    trackingInfo.T(((Integer) remove4).intValue());
                } else {
                    trackingInfo.T(2);
                }
            } else {
                z3 = true;
            }
            com.anythink.core.common.u.e.a(trackingInfo, false);
            ATSplashSkipInfo splashSkipInfo = this.f23347a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView()) {
                this.f23347a.startSplashCustomSkipViewClickEye();
                Timer timer2 = this.f23351e;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f23351e = null;
                }
                splashSkipInfo.destroy();
                this.f23347a.setSplashSkipInfo(null);
            }
            ab.a(trackingInfo, j.r.f12533e, j.r.f12540m, "");
            a(trackingInfo.aI());
            IATSplashEyeAd splashEyeAd = this.f23347a != null ? this.f23347a.getSplashEyeAd() : null;
            if (this.f23348b != null && !this.f23352f) {
                this.f23352f = true;
                if (trackingInfo.Y() != 66) {
                    this.f23348b.onCallbackAdDismiss(l.a(trackingInfo, this.f23347a), new ATSplashAdExtraInfo(i, splashEyeAd));
                } else if (z3) {
                    this.f23348b.onCallbackAdDismiss(l.a(trackingInfo, this.f23347a), new ATSplashAdExtraInfo(i, splashEyeAd));
                }
            }
            if (splashEyeAd == null) {
                CustomSplashAdapter customSplashAdapter2 = this.f23347a;
                if (customSplashAdapter2 != null) {
                    customSplashAdapter2.cleanImpressionListener();
                }
                if (this.f23347a != null) {
                    com.anythink.core.common.v.d.a().d(this.f23347a);
                    this.f23347a.internalDestory();
                }
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        f fVar;
        if ((this.f23347a == null || (com.anythink.core.common.v.d.a().a(this.f23347a) && com.anythink.core.common.v.d.a().b(this.f23347a))) && !this.f23349c) {
            this.f23349c = true;
            com.anythink.core.common.v.c.a().a(this.f23347a);
            l a9 = l.a(this.f23347a);
            CustomSplashAdapter customSplashAdapter = this.f23347a;
            if (customSplashAdapter != null) {
                final n trackingInfo = customSplashAdapter.getTrackingInfo();
                trackingInfo.a(this.f23347a.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f23347a.getUnitGroupInfo(), 6);
                com.anythink.core.common.v.d.a().a(this.f23347a, new d.a() { // from class: com.anythink.splashad.a.f.1
                    @Override // com.anythink.core.common.v.d.a
                    public final void a() {
                        com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, f.this.f23347a.getUnitGroupInfo());
                    }

                    @Override // com.anythink.core.common.v.d.a
                    public final void b() {
                    }
                });
                ab.a(trackingInfo, j.r.f12531c, j.r.f12540m, "");
                ATSplashSkipInfo splashSkipInfo = this.f23347a.getSplashSkipInfo();
                if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && this.f23347a.isSupportCustomSkipView() && this.f23351e == null) {
                    long callbackInterval = splashSkipInfo.getCallbackInterval();
                    long countDownDuration = splashSkipInfo.getCountDownDuration();
                    ViewGroup container = splashSkipInfo.getContainer();
                    f.b bVar = new f.b(1);
                    ATSplashSkipAdListener aTSplashSkipAdListener = splashSkipInfo.getATSplashSkipAdListener();
                    this.f23350d = countDownDuration;
                    Timer timer = new Timer();
                    this.f23351e = timer;
                    timer.schedule(new AnonymousClass2(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
                    fVar = this;
                    t.b().b(fVar.new AnonymousClass3(aTSplashSkipAdListener, countDownDuration, callbackInterval));
                } else {
                    fVar = this;
                }
                u.a().a(trackingInfo.aI(), a9);
                a(trackingInfo.aI(), 6);
            } else {
                fVar = this;
            }
            if (fVar.f23348b != null) {
                if (a9.getNetworkFirmId() == -1) {
                    h.a(j.n.f12509e, fVar.f23347a, null);
                }
                fVar.f23348b.onAdShow(a9);
            }
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShowFail(AdError adError) {
        String str;
        CustomSplashAdapter customSplashAdapter = this.f23347a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.e.a(trackingInfo, adError, this.f23347a.getInternalNetworkInfoMap());
            if (trackingInfo != null) {
                str = trackingInfo.aI();
                a(trackingInfo.aI());
            } else {
                str = "";
            }
            a(str, 7);
            ab.a(trackingInfo, j.r.f12539l, j.r.f12541n, adError != null ? adError.getFullErrorInfo() : "");
        }
    }

    private void a() {
        Timer timer = this.f23351e;
        if (timer != null) {
            timer.cancel();
            this.f23351e = null;
        }
    }

    public final void a(int i) {
        this.f23353g = i;
    }

    private static void a(String str) {
        i c9;
        if (TextUtils.isEmpty(str) || (c9 = u.a().c(str)) == null) {
            return;
        }
        u.a().d(str);
        com.anythink.core.common.f.a(t.b().g(), str, "4").c(u.a().b(str, c9.a()));
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().M(), str, "4");
        if (a9.a((ATAdStatusInfo) null, i)) {
            ar arVar = new ar();
            arVar.a(t.b().M());
            arVar.f13547c = i;
            a9.b(t.b().M(), "4", str, arVar, null);
        }
    }
}
