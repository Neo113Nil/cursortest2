package com.anythink.splashad.a;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.g;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.n;
import com.anythink.core.common.l.d.a;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.r;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, c> f24107d = new ConcurrentHashMap(3);

    /* renamed from: a, reason: collision with root package name */
    private Context f24108a;

    /* renamed from: b, reason: collision with root package name */
    private String f24109b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.f f24110c;

    /* renamed from: com.anythink.splashad.a.c$2, reason: invalid class name */
    public class AnonymousClass2 extends com.anythink.core.common.l.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f24127b;

        public AnonymousClass2(f fVar, boolean[] zArr) {
            this.f24126a = fVar;
            this.f24127b = zArr;
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdClicked(View view) {
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.onSplashAdClicked();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdImpressed() {
            boolean[] zArr = this.f24127b;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.onSplashAdShow();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdVideoEnd() {
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdVideoStart() {
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onClose() {
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onDeeplinkCallback(boolean z6) {
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.onDeeplinkCallback(z6);
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.onDownloadConfirm(context, aTNetworkConfirmInfo);
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onVideoError(String str, String str2) {
            f fVar = this.f24126a;
            if (fVar != null) {
                fVar.a(99);
                this.f24126a.onSplashAdShowFail(ErrorCode.getErrorCode("", str, str2));
                this.f24126a.onSplashAdDismiss();
            }
        }
    }

    /* renamed from: com.anythink.splashad.a.c$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.l.b.a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f24129a;

        public AnonymousClass3(e eVar) {
            this.f24129a = eVar;
        }

        @Override // com.anythink.core.common.l.b.a.b
        public final void a(int i) {
            this.f24129a.a(i);
            this.f24129a.onAdDismiss();
        }
    }

    /* renamed from: com.anythink.splashad.a.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f24131a;

        public AnonymousClass4(e eVar) {
            this.f24131a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24131a.onAdImpression();
        }
    }

    private c(Context context, String str) {
        this.f24108a = context.getApplicationContext();
        this.f24109b = str;
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(context, str, "4");
        this.f24110c = a9;
        a9.a(new d());
    }

    public static c a(Context context, String str) {
        c cVar = f24107d.get(str);
        if (cVar != null) {
            return cVar;
        }
        synchronized (c.class) {
            if (cVar == null) {
                try {
                    cVar = new c(context, str);
                    f24107d.put(str, cVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cVar;
    }

    public final void a(Context context, b bVar, ATAdMultipleLoadedListener aTAdMultipleLoadedListener, int i, boolean z6, int i4, com.anythink.core.common.d.c cVar, Map<String, Object> map, ATAdRequest aTAdRequest, long j6, long j9) {
        ar arVar = new ar();
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f14343n = j6;
        arVar.f14344o = j9;
        arVar.f14338h = i;
        arVar.f14339j = z6;
        arVar.f14333c = i4;
        arVar.f14334d = cVar;
        arVar.f14336f = aTAdMultipleLoadedListener;
        if (map != null) {
            try {
                arVar.f14337g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (aTAdRequest != null) {
            arVar.f14341l = aTAdRequest.getATAdxBidFloorInfo();
        }
        com.anythink.core.common.f fVar = this.f24110c;
        if (fVar != null) {
            fVar.b(this.f24108a, "4", this.f24109b, arVar, bVar);
        }
    }

    public final void a() {
        com.anythink.core.common.f fVar = this.f24110c;
        if (fVar != null) {
            fVar.j();
        }
    }

    public final synchronized void a(final Activity activity, final ViewGroup viewGroup, final a aVar, final ATEventInterface aTEventInterface, final ATSplashSkipInfo aTSplashSkipInfo, final ATShowConfig aTShowConfig, final Map<String, Object> map, final ATNativeAdCustomRender aTNativeAdCustomRender) {
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            ae aeVar = new ae();
            aeVar.a(map);
            if (aTShowConfig != null) {
                aeVar.a(aTShowConfig.getATAdInfo());
            }
            com.anythink.core.common.f fVar = this.f24110c;
            if (fVar != null) {
                aeVar.a(fVar.i());
            }
            final com.anythink.core.common.h.c b9 = this.f24110c.b((Context) activity, false, true, aeVar);
            if (b9 == null) {
                Log.e("anythink", "Splash No Cache.");
                return;
            }
            if (b9.e() instanceof CustomSplashAdapter) {
                this.f24110c.a(b9);
                b9.a(b9.c() + 1);
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.splashad.a.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        String str2;
                        final CustomSplashAdapter customSplashAdapter = (CustomSplashAdapter) b9.e();
                        Activity activity2 = activity;
                        if (activity2 != null) {
                            customSplashAdapter.refreshActivityContext(activity2);
                        }
                        final n trackingInfo = b9.e().getTrackingInfo();
                        long currentTimeMillis = System.currentTimeMillis();
                        ATShowConfig aTShowConfig2 = aTShowConfig;
                        if (aTShowConfig2 != null) {
                            str = aTShowConfig2.getScenarioId();
                            str2 = aTShowConfig.getShowCustomExt();
                            r.a(aTShowConfig.getATCustomContentResult(), trackingInfo);
                        } else {
                            str = "";
                            str2 = "";
                        }
                        if (trackingInfo != null) {
                            trackingInfo.f14797F = str;
                            trackingInfo.z(str2);
                            trackingInfo.n(p.a(trackingInfo.aJ(), trackingInfo.M(), currentTimeMillis));
                            aj.a(c.this.f24108a, trackingInfo);
                            aj.a((Map<String, Object>) map, trackingInfo);
                            aj.a(c.this.f24109b, trackingInfo);
                        }
                        com.anythink.core.common.a.a().a(c.this.f24108a, b9);
                        com.anythink.core.common.u.c.a(c.this.f24108a).a(13, trackingInfo, customSplashAdapter.getUnitGroupInfo(), currentTimeMillis);
                        com.anythink.core.common.v.d.a().a(trackingInfo, customSplashAdapter.getUnitGroupInfo(), com.anythink.core.common.v.d.f17516b);
                        t.b().b(new Runnable() { // from class: com.anythink.splashad.a.c.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                s c9 = t.b().c();
                                if (c9 != null) {
                                    CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                                    customSplashAdapter2.setAdDownloadListener(c9.createDataFetchListener(customSplashAdapter2, null, aTEventInterface));
                                }
                                ATSplashSkipInfo aTSplashSkipInfo2 = aTSplashSkipInfo;
                                boolean z6 = aTSplashSkipInfo2 != null && aTSplashSkipInfo2.canUseCustomSkipView();
                                boolean isSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                                if (z6 && isSupportCustomSkipView) {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    aTSplashSkipInfo.setContainer(viewGroup);
                                    customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                                }
                                final f fVar2 = new f(customSplashAdapter, aVar);
                                if (customSplashAdapter.isMixNative()) {
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    c.a(c.this, customSplashAdapter, activity, viewGroup, fVar2, z6, b9, trackingInfo, aTNativeAdCustomRender);
                                } else if (customSplashAdapter.isMixBanner()) {
                                    AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                    c.a(c.this, customSplashAdapter, activity, viewGroup, fVar2, z6, trackingInfo);
                                } else {
                                    CustomSplashAdapter customSplashAdapter3 = customSplashAdapter;
                                    AnonymousClass1 anonymousClass14 = AnonymousClass1.this;
                                    customSplashAdapter3.internalShow(activity, viewGroup, new e(fVar2));
                                }
                                n trackingInfo2 = customSplashAdapter.getTrackingInfo();
                                com.anythink.core.common.u.e.a("4", trackingInfo2, trackingInfo2.aJ(), trackingInfo2.aI(), trackingInfo2.M(), trackingInfo2.Y(), 4, SystemClock.elapsedRealtime() - elapsedRealtime);
                                if (!z6) {
                                    if (aTSplashSkipInfo != null) {
                                        Log.e("anythink", "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                                    }
                                } else {
                                    ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                                    if (aTSplashSkipAdListener != null) {
                                        aTSplashSkipAdListener.isSupportCustomSkipView(isSupportCustomSkipView);
                                    }
                                    if (isSupportCustomSkipView) {
                                        aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                f fVar3 = fVar2;
                                                if (fVar3 != null) {
                                                    fVar3.a(2);
                                                    fVar2.onSplashAdDismiss();
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        });
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private ae a(ATShowConfig aTShowConfig, Map<String, Object> map) {
        ae aeVar = new ae();
        aeVar.a(map);
        if (aTShowConfig != null) {
            aeVar.a(aTShowConfig.getATAdInfo());
        }
        com.anythink.core.common.f fVar = this.f24110c;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        return aeVar;
    }

    public final List<ATAdInfo> a(Context context) {
        return this.f24110c.a(context);
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        return this.f24110c.a(context, map);
    }

    private boolean a(ATAdStatusInfo aTAdStatusInfo, int i) {
        return this.f24110c.a(aTAdStatusInfo, i);
    }

    public final g a(String str) {
        return this.f24110c.b(str);
    }

    public final com.anythink.core.common.h.c a(Context context, ae aeVar) {
        return this.f24110c.b(context, false, false, aeVar);
    }

    private void a(CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, f fVar, boolean z6, com.anythink.core.common.h.c cVar, n nVar, ATNativeAdCustomRender aTNativeAdCustomRender) {
        BaseAd f2 = cVar.f();
        if (f2 == null) {
            if (fVar != null) {
                fVar.a(99);
                fVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail, no ad cache."));
                fVar.onSplashAdDismiss();
                return;
            }
            return;
        }
        try {
            com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customSplashAdapter, new a.C0082a().a(activity).a(nVar).a(f2).a(z6).a(aTNativeAdCustomRender).a(new AnonymousClass2(fVar, new boolean[]{false})).a());
            if (!(a9 instanceof com.anythink.core.common.l.c.a.f)) {
                a(fVar, null, "", "Failed to show mixed native splash ad：create splash bridge with an unknown error.");
                return;
            }
            Object a10 = ((com.anythink.core.common.l.c.a.f) a9).a();
            if (!(a10 instanceof View)) {
                a(fVar, null, "", "Failed to show mixed native splash ad: failed to create splash view.");
                return;
            }
            View view = (View) a10;
            am.a(view);
            ViewGroup customAdContainer = f2.getCustomAdContainer();
            if (customAdContainer != null) {
                am.a(customAdContainer);
                customAdContainer.addView(view);
                view = customAdContainer;
            }
            viewGroup.addView(view);
            if (a10 instanceof com.anythink.core.common.l.e.a.f) {
                ((com.anythink.core.common.l.e.a.f) a10).registerNativeAdContainer(viewGroup);
                ((com.anythink.core.common.l.e.a.f) a10).handleFullScreenClick(customAdContainer);
            }
        } catch (Throwable th) {
            a(fVar, null, "", "Failed to show mixed native splash ad： ".concat(String.valueOf(th)));
        }
    }

    private void a(CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, f fVar, boolean z6, n nVar) {
        e eVar = new e(fVar);
        try {
            customSplashAdapter.internalShow(activity, viewGroup, eVar);
            com.anythink.core.common.l.d.a a9 = new a.C0082a().a(activity.getApplicationContext()).a(nVar).a(z6).a(new AnonymousClass3(eVar)).a();
            com.anythink.core.common.l.c.a.a a10 = com.anythink.basead.mixad.b.b.a(customSplashAdapter, a9);
            if (!(a10 instanceof com.anythink.core.common.l.c.a.f)) {
                a(null, eVar, "", "Failed to show mixed banner splash ad: create splash bridge with unknow error.");
                return;
            }
            Object b9 = ((com.anythink.core.common.l.c.a.f) a10).b();
            if (!(b9 instanceof View)) {
                a(null, eVar, "", "Failed to show mixed banner splash ad: failed to get banner view.");
                return;
            }
            View view = (View) b9;
            am.a(view);
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
            IATBaseAdAdapter f2 = a9.f();
            if (f2 == null || f2.supportImpressionCallback()) {
                return;
            }
            view.post(new AnonymousClass4(eVar));
        } catch (Throwable th) {
            a(null, eVar, "", "Failed to show mixed banner splash ad: ".concat(String.valueOf(th)));
        }
    }

    private static void a(f fVar, e eVar, String str, String str2) {
        if (fVar != null) {
            fVar.a(99);
            fVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2));
            fVar.onSplashAdDismiss();
        }
        if (eVar != null) {
            eVar.a(99);
            eVar.onAdShowFail(str, str2);
            eVar.onAdDismiss();
        }
    }

    public static /* synthetic */ void a(c cVar, CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, f fVar, boolean z6, com.anythink.core.common.h.c cVar2, n nVar, ATNativeAdCustomRender aTNativeAdCustomRender) {
        BaseAd f2 = cVar2.f();
        if (f2 == null) {
            fVar.a(99);
            fVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail, no ad cache."));
            fVar.onSplashAdDismiss();
            return;
        }
        try {
            com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customSplashAdapter, new a.C0082a().a(activity).a(nVar).a(f2).a(z6).a(aTNativeAdCustomRender).a(cVar.new AnonymousClass2(fVar, new boolean[]{false})).a());
            if (!(a9 instanceof com.anythink.core.common.l.c.a.f)) {
                a(fVar, null, "", "Failed to show mixed native splash ad：create splash bridge with an unknown error.");
                return;
            }
            Object a10 = ((com.anythink.core.common.l.c.a.f) a9).a();
            if (!(a10 instanceof View)) {
                a(fVar, null, "", "Failed to show mixed native splash ad: failed to create splash view.");
                return;
            }
            View view = (View) a10;
            am.a(view);
            ViewGroup customAdContainer = f2.getCustomAdContainer();
            if (customAdContainer != null) {
                am.a(customAdContainer);
                customAdContainer.addView(view);
                view = customAdContainer;
            }
            viewGroup.addView(view);
            if (a10 instanceof com.anythink.core.common.l.e.a.f) {
                ((com.anythink.core.common.l.e.a.f) a10).registerNativeAdContainer(viewGroup);
                ((com.anythink.core.common.l.e.a.f) a10).handleFullScreenClick(customAdContainer);
            }
        } catch (Throwable th) {
            a(fVar, null, "", "Failed to show mixed native splash ad： ".concat(String.valueOf(th)));
        }
    }

    public static /* synthetic */ void a(c cVar, CustomSplashAdapter customSplashAdapter, Activity activity, ViewGroup viewGroup, f fVar, boolean z6, n nVar) {
        e eVar = new e(fVar);
        try {
            customSplashAdapter.internalShow(activity, viewGroup, eVar);
            com.anythink.core.common.l.d.a a9 = new a.C0082a().a(activity.getApplicationContext()).a(nVar).a(z6).a(cVar.new AnonymousClass3(eVar)).a();
            com.anythink.core.common.l.c.a.a a10 = com.anythink.basead.mixad.b.b.a(customSplashAdapter, a9);
            if (!(a10 instanceof com.anythink.core.common.l.c.a.f)) {
                a(null, eVar, "", "Failed to show mixed banner splash ad: create splash bridge with unknow error.");
                return;
            }
            Object b9 = ((com.anythink.core.common.l.c.a.f) a10).b();
            if (!(b9 instanceof View)) {
                a(null, eVar, "", "Failed to show mixed banner splash ad: failed to get banner view.");
                return;
            }
            View view = (View) b9;
            am.a(view);
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
            IATBaseAdAdapter f2 = a9.f();
            if (f2 == null || f2.supportImpressionCallback()) {
                return;
            }
            view.post(cVar.new AnonymousClass4(eVar));
        } catch (Throwable th) {
            a(null, eVar, "", "Failed to show mixed banner splash ad: ".concat(String.valueOf(th)));
        }
    }
}
