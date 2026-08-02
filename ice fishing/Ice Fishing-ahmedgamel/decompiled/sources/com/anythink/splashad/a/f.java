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
    CustomSplashAdapter f24134a;

    /* renamed from: b, reason: collision with root package name */
    a f24135b;

    /* renamed from: c, reason: collision with root package name */
    boolean f24136c;

    /* renamed from: d, reason: collision with root package name */
    long f24137d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f24138e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24139f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f24140g = 0;

    /* renamed from: com.anythink.splashad.a.f$2, reason: invalid class name */
    public class AnonymousClass2 extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f24143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f24144b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f24145c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f24146d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f24147e;

        public AnonymousClass2(ViewGroup viewGroup, f.b bVar, ATSplashSkipAdListener aTSplashSkipAdListener, long j6, long j9) {
            this.f24143a = viewGroup;
            this.f24144b = bVar;
            this.f24145c = aTSplashSkipAdListener;
            this.f24146d = j6;
            this.f24147e = j9;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup = this.f24143a;
            if (viewGroup == null || am.a(viewGroup, this.f24144b)) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.a.f.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        f fVar = f.this;
                        long j6 = fVar.f24137d;
                        if (j6 <= 0) {
                            fVar.a(3);
                            f.this.onSplashAdDismiss();
                        } else {
                            ATSplashSkipAdListener aTSplashSkipAdListener = anonymousClass2.f24145c;
                            if (aTSplashSkipAdListener != null) {
                                aTSplashSkipAdListener.onAdTick(anonymousClass2.f24146d, j6);
                            }
                        }
                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                        f.this.f24137d -= anonymousClass22.f24147e;
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.splashad.a.f$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f24150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f24151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f24152c;

        public AnonymousClass3(ATSplashSkipAdListener aTSplashSkipAdListener, long j6, long j9) {
            this.f24150a = aTSplashSkipAdListener;
            this.f24151b = j6;
            this.f24152c = j9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATSplashSkipAdListener aTSplashSkipAdListener = this.f24150a;
            if (aTSplashSkipAdListener != null) {
                aTSplashSkipAdListener.onAdTick(this.f24151b, f.this.f24137d);
                f.this.f24137d -= this.f24152c;
            }
        }
    }

    public f(CustomSplashAdapter customSplashAdapter, a aVar) {
        this.f24134a = customSplashAdapter;
        this.f24135b = aVar;
    }

    private void a(ATSplashSkipInfo aTSplashSkipInfo) {
        if (this.f24138e == null) {
            long callbackInterval = aTSplashSkipInfo.getCallbackInterval();
            long countDownDuration = aTSplashSkipInfo.getCountDownDuration();
            ViewGroup container = aTSplashSkipInfo.getContainer();
            f.b bVar = new f.b(1);
            ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
            this.f24137d = countDownDuration;
            Timer timer = new Timer();
            this.f24138e = timer;
            timer.schedule(new AnonymousClass2(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
            t.b().b(new AnonymousClass3(aTSplashSkipAdListener, countDownDuration, callbackInterval));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z6) {
        a aVar = this.f24135b;
        if (aVar != null) {
            aVar.onDeeplinkCallback(l.a(this.f24134a), z6);
        }
        CustomSplashAdapter customSplashAdapter = this.f24134a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f13323j, z6 ? j.r.f13326m : j.r.f13327n, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar = this.f24135b;
        if (aVar != null) {
            aVar.onDownloadConfirm(context, l.a(this.f24134a), aTNetworkConfirmInfo);
        }
        CustomSplashAdapter customSplashAdapter = this.f24134a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f13324k, j.r.f13326m, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.f24134a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            } else {
                ab.a(trackingInfo, j.r.f13318d, j.r.f13326m, "");
            }
        }
        com.anythink.core.common.v.c.a().b(this.f24134a);
        a aVar = this.f24135b;
        if (aVar != null) {
            aVar.onAdClick(l.a(this.f24134a));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdDismiss() {
        boolean z6;
        Timer timer = this.f24138e;
        if (timer != null) {
            timer.cancel();
        }
        CustomSplashAdapter customSplashAdapter = this.f24134a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            int i = this.f24140g;
            if (i != 0) {
                trackingInfo.K(i);
            } else {
                i = this.f24134a.getDismissType();
                if (i == 0) {
                    i = 1;
                }
                trackingInfo.K(i);
            }
            Map<String, Object> adExtraInfoMap = this.f24134a.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object remove = adExtraInfoMap.remove(b.C0074b.f12894a);
                Object remove2 = adExtraInfoMap.remove(b.C0074b.f12895b);
                if (remove instanceof Integer) {
                    trackingInfo.R(((Integer) remove).intValue());
                }
                z6 = remove2 instanceof Boolean ? ((Boolean) remove2).booleanValue() : true;
                Object remove3 = adExtraInfoMap.remove(b.C0074b.f12896c);
                Object remove4 = adExtraInfoMap.remove(b.C0074b.f12897d);
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
                z6 = true;
            }
            com.anythink.core.common.u.e.a(trackingInfo, false);
            ATSplashSkipInfo splashSkipInfo = this.f24134a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView()) {
                this.f24134a.startSplashCustomSkipViewClickEye();
                Timer timer2 = this.f24138e;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f24138e = null;
                }
                splashSkipInfo.destroy();
                this.f24134a.setSplashSkipInfo(null);
            }
            ab.a(trackingInfo, j.r.f13319e, j.r.f13326m, "");
            a(trackingInfo.aI());
            IATSplashEyeAd splashEyeAd = this.f24134a != null ? this.f24134a.getSplashEyeAd() : null;
            if (this.f24135b != null && !this.f24139f) {
                this.f24139f = true;
                if (trackingInfo.Y() != 66) {
                    this.f24135b.onCallbackAdDismiss(l.a(trackingInfo, this.f24134a), new ATSplashAdExtraInfo(i, splashEyeAd));
                } else if (z6) {
                    this.f24135b.onCallbackAdDismiss(l.a(trackingInfo, this.f24134a), new ATSplashAdExtraInfo(i, splashEyeAd));
                }
            }
            if (splashEyeAd == null) {
                CustomSplashAdapter customSplashAdapter2 = this.f24134a;
                if (customSplashAdapter2 != null) {
                    customSplashAdapter2.cleanImpressionListener();
                }
                if (this.f24134a != null) {
                    com.anythink.core.common.v.d.a().d(this.f24134a);
                    this.f24134a.internalDestory();
                }
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        f fVar;
        if ((this.f24134a == null || (com.anythink.core.common.v.d.a().a(this.f24134a) && com.anythink.core.common.v.d.a().b(this.f24134a))) && !this.f24136c) {
            this.f24136c = true;
            com.anythink.core.common.v.c.a().a(this.f24134a);
            l a9 = l.a(this.f24134a);
            CustomSplashAdapter customSplashAdapter = this.f24134a;
            if (customSplashAdapter != null) {
                final n trackingInfo = customSplashAdapter.getTrackingInfo();
                trackingInfo.a(this.f24134a.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f24134a.getUnitGroupInfo(), 6);
                com.anythink.core.common.v.d.a().a(this.f24134a, new d.a() { // from class: com.anythink.splashad.a.f.1
                    @Override // com.anythink.core.common.v.d.a
                    public final void a() {
                        com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, f.this.f24134a.getUnitGroupInfo());
                    }

                    @Override // com.anythink.core.common.v.d.a
                    public final void b() {
                    }
                });
                ab.a(trackingInfo, j.r.f13317c, j.r.f13326m, "");
                ATSplashSkipInfo splashSkipInfo = this.f24134a.getSplashSkipInfo();
                if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && this.f24134a.isSupportCustomSkipView() && this.f24138e == null) {
                    long callbackInterval = splashSkipInfo.getCallbackInterval();
                    long countDownDuration = splashSkipInfo.getCountDownDuration();
                    ViewGroup container = splashSkipInfo.getContainer();
                    f.b bVar = new f.b(1);
                    ATSplashSkipAdListener aTSplashSkipAdListener = splashSkipInfo.getATSplashSkipAdListener();
                    this.f24137d = countDownDuration;
                    Timer timer = new Timer();
                    this.f24138e = timer;
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
            if (fVar.f24135b != null) {
                if (a9.getNetworkFirmId() == -1) {
                    h.a(j.n.f13295e, fVar.f24134a, null);
                }
                fVar.f24135b.onAdShow(a9);
            }
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShowFail(AdError adError) {
        String str;
        CustomSplashAdapter customSplashAdapter = this.f24134a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.e.a(trackingInfo, adError, this.f24134a.getInternalNetworkInfoMap());
            if (trackingInfo != null) {
                str = trackingInfo.aI();
                a(trackingInfo.aI());
            } else {
                str = "";
            }
            a(str, 7);
            ab.a(trackingInfo, j.r.f13325l, j.r.f13327n, adError != null ? adError.getFullErrorInfo() : "");
        }
    }

    private void a() {
        Timer timer = this.f24138e;
        if (timer != null) {
            timer.cancel();
            this.f24138e = null;
        }
    }

    public final void a(int i) {
        this.f24140g = i;
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
            arVar.f14333c = i;
            a9.b(t.b().M(), "4", str, arVar, null);
        }
    }
}
