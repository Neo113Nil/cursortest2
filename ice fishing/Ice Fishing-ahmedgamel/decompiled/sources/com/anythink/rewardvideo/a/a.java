package com.anythink.rewardvideo.a;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.l.f.a.a;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.r;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24011a = "a";

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, a> f24012e = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private Context f24013b;

    /* renamed from: c, reason: collision with root package name */
    private String f24014c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.f f24015d;

    /* renamed from: com.anythink.rewardvideo.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0084a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomRewardVideoAdapter f24027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ATRewardVideoListener f24028b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f24029c;

        public AnonymousClass2(CustomRewardVideoAdapter customRewardVideoAdapter, ATRewardVideoListener aTRewardVideoListener, Activity activity) {
            this.f24027a = customRewardVideoAdapter;
            this.f24028b = aTRewardVideoListener;
            this.f24029c = activity;
        }

        @Override // com.anythink.core.common.l.f.a.a.InterfaceC0084a
        public final void a(final Activity activity, ViewGroup viewGroup) {
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f24027a;
            t.b();
            customRewardVideoAdapter.internalShow(activity, viewGroup, new e(new f(customRewardVideoAdapter, t.G(), this.f24028b), this.f24027a.isMixFormatAd(), this.f24027a.getAdRewardCallbackType()) { // from class: com.anythink.rewardvideo.a.a.2.1
                @Override // com.anythink.rewardvideo.a.d, com.anythink.core.api.ATCommonImpressionListener
                public final void onAdDismiss() {
                    t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.2.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (AnonymousClass2.this.f24029c.isFinishing()) {
                                return;
                            }
                            activity.finish();
                        }
                    });
                    super.onAdDismiss();
                }
            });
        }
    }

    private a(Context context, String str) {
        this.f24013b = context.getApplicationContext();
        this.f24014c = str;
        this.f24015d = com.anythink.core.common.f.a(context, str, "1");
    }

    public static a a(Context context, String str) {
        a aVar = f24012e.get(str);
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            if (aVar == null) {
                try {
                    aVar = new a(context, str);
                    f24012e.put(str, aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    public final synchronized void a(final Activity activity, final ATShowConfig aTShowConfig, final ATRewardVideoListener aTRewardVideoListener, final ATEventInterface aTEventInterface, final Map<String, Object> map) {
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            ae aeVar = new ae();
            aeVar.a(map);
            if (aTShowConfig != null) {
                aeVar.a(aTShowConfig.getATAdInfo());
            }
            com.anythink.core.common.f fVar = this.f24015d;
            if (fVar != null) {
                aeVar.a(fVar.i());
            }
            final com.anythink.core.common.h.c b9 = this.f24015d.b((Context) activity, false, true, aeVar);
            if (b9 != null && (b9.e() instanceof CustomRewardVideoAdapter)) {
                this.f24015d.a(b9);
                b9.a(b9.c() + 1);
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final String str;
                        String str2;
                        n trackingInfo = b9.e().getTrackingInfo();
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
                            aj.a(a.this.f24013b, trackingInfo);
                            aj.a((Map<String, Object>) map, trackingInfo);
                            aj.a(a.this.f24014c, trackingInfo);
                        }
                        com.anythink.core.common.a.a().a(a.this.f24013b, b9);
                        com.anythink.core.common.u.c.a(a.this.f24013b).a(13, trackingInfo, b9.e().getUnitGroupInfo(), currentTimeMillis);
                        com.anythink.core.common.v.d.a().a(trackingInfo, b9.e().getUnitGroupInfo(), com.anythink.core.common.v.d.f17516b);
                        final CustomRewardVideoAdapter customRewardVideoAdapter = (CustomRewardVideoAdapter) b9.e();
                        Activity activity2 = activity;
                        if (activity2 != null) {
                            customRewardVideoAdapter.refreshActivityContext(activity2);
                        }
                        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                customRewardVideoAdapter.setScenario(str);
                                s c9 = t.b().c();
                                if (c9 != null) {
                                    CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                                    customRewardVideoAdapter2.setAdDownloadListener(c9.createDataFetchListener(customRewardVideoAdapter2, null, aTEventInterface));
                                }
                                if (customRewardVideoAdapter.isMixSplash()) {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    a.a(a.this, activity, customRewardVideoAdapter, aTRewardVideoListener);
                                } else {
                                    CustomRewardVideoAdapter customRewardVideoAdapter3 = customRewardVideoAdapter;
                                    Activity activity3 = activity;
                                    t.b();
                                    customRewardVideoAdapter3.internalShow(activity3, null, new e(new f(customRewardVideoAdapter3, t.G(), aTRewardVideoListener), customRewardVideoAdapter.isMixFormatAd(), customRewardVideoAdapter.getAdRewardCallbackType()));
                                }
                                n trackingInfo2 = customRewardVideoAdapter.getTrackingInfo();
                                com.anythink.core.common.u.e.a("4", trackingInfo2, trackingInfo2.aJ(), trackingInfo2.aI(), trackingInfo2.M(), trackingInfo2.Y(), 4, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                        });
                    }
                });
            } else {
                if (this.f24015d.a((ATAdStatusInfo) null, 7)) {
                    a(t.b().M(), 7, null, null, null, map, null);
                }
                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "No Cache.");
                if (aTRewardVideoListener != null) {
                    aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a((com.anythink.core.common.d.f) null));
                }
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
        com.anythink.core.common.f fVar = this.f24015d;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        return aeVar;
    }

    public final void a(Context context, int i, com.anythink.core.common.d.a aVar, com.anythink.core.common.d.c cVar, ATAdMultipleLoadedListener aTAdMultipleLoadedListener, Map<String, Object> map, ATAdRequest aTAdRequest) {
        ar arVar = new ar();
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f14333c = i;
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
        this.f24015d.b(this.f24013b, "1", this.f24014c, arVar, aVar);
    }

    public final List<ATAdInfo> a(Context context) {
        com.anythink.core.common.f fVar = this.f24015d;
        if (fVar != null) {
            return fVar.a(context);
        }
        return null;
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        com.anythink.core.common.f fVar = this.f24015d;
        if (fVar != null) {
            return fVar.a(context, map);
        }
        return null;
    }

    private void a(Activity activity, CustomRewardVideoAdapter customRewardVideoAdapter, ATRewardVideoListener aTRewardVideoListener) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        bv unitGroupInfo = customRewardVideoAdapter.getUnitGroupInfo();
        if (unitGroupInfo == null) {
            return;
        }
        com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customRewardVideoAdapter, null);
        if (!(a9 instanceof com.anythink.core.common.l.c.a.e)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "create reward video bridge with unknow error.");
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a((com.anythink.core.common.d.f) null));
                return;
            }
            return;
        }
        cVar.f12706d = com.anythink.core.common.f.a(this.f24014c, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
        ((com.anythink.core.common.l.c.a.e) a9).a(activity, cVar, new AnonymousClass2(customRewardVideoAdapter, aTRewardVideoListener, activity));
    }

    public static /* synthetic */ void a(a aVar, Activity activity, CustomRewardVideoAdapter customRewardVideoAdapter, ATRewardVideoListener aTRewardVideoListener) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        bv unitGroupInfo = customRewardVideoAdapter.getUnitGroupInfo();
        if (unitGroupInfo != null) {
            com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customRewardVideoAdapter, null);
            if (!(a9 instanceof com.anythink.core.common.l.c.a.e)) {
                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "create reward video bridge with unknow error.");
                if (aTRewardVideoListener != null) {
                    aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a((com.anythink.core.common.d.f) null));
                    return;
                }
                return;
            }
            cVar.f12706d = com.anythink.core.common.f.a(aVar.f24014c, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
            ((com.anythink.core.common.l.c.a.e) a9).a(activity, cVar, aVar.new AnonymousClass2(customRewardVideoAdapter, aTRewardVideoListener, activity));
        }
    }
}
