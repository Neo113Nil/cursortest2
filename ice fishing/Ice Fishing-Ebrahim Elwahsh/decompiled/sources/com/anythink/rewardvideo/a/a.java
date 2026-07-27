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
    public static final String f23382a = "a";

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, a> f23383e = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private Context f23384b;

    /* renamed from: c, reason: collision with root package name */
    private String f23385c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.f f23386d;

    /* renamed from: com.anythink.rewardvideo.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0083a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomRewardVideoAdapter f23398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ATRewardVideoListener f23399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f23400c;

        public AnonymousClass2(CustomRewardVideoAdapter customRewardVideoAdapter, ATRewardVideoListener aTRewardVideoListener, Activity activity) {
            this.f23398a = customRewardVideoAdapter;
            this.f23399b = aTRewardVideoListener;
            this.f23400c = activity;
        }

        @Override // com.anythink.core.common.l.f.a.a.InterfaceC0083a
        public final void a(final Activity activity, ViewGroup viewGroup) {
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f23398a;
            t.b();
            customRewardVideoAdapter.internalShow(activity, viewGroup, new e(new f(customRewardVideoAdapter, t.G(), this.f23399b), this.f23398a.isMixFormatAd(), this.f23398a.getAdRewardCallbackType()) { // from class: com.anythink.rewardvideo.a.a.2.1
                @Override // com.anythink.rewardvideo.a.d, com.anythink.core.api.ATCommonImpressionListener
                public final void onAdDismiss() {
                    t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.2.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (AnonymousClass2.this.f23400c.isFinishing()) {
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
        this.f23384b = context.getApplicationContext();
        this.f23385c = str;
        this.f23386d = com.anythink.core.common.f.a(context, str, "1");
    }

    public static a a(Context context, String str) {
        a aVar = f23383e.get(str);
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            if (aVar == null) {
                try {
                    aVar = new a(context, str);
                    f23383e.put(str, aVar);
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
            com.anythink.core.common.f fVar = this.f23386d;
            if (fVar != null) {
                aeVar.a(fVar.i());
            }
            final com.anythink.core.common.h.c b9 = this.f23386d.b((Context) activity, false, true, aeVar);
            if (b9 != null && (b9.e() instanceof CustomRewardVideoAdapter)) {
                this.f23386d.a(b9);
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
                            trackingInfo.f14168F = str;
                            trackingInfo.z(str2);
                            trackingInfo.n(p.a(trackingInfo.aJ(), trackingInfo.M(), currentTimeMillis));
                            aj.a(a.this.f23384b, trackingInfo);
                            aj.a((Map<String, Object>) map, trackingInfo);
                            aj.a(a.this.f23385c, trackingInfo);
                        }
                        com.anythink.core.common.a.a().a(a.this.f23384b, b9);
                        com.anythink.core.common.u.c.a(a.this.f23384b).a(13, trackingInfo, b9.e().getUnitGroupInfo(), currentTimeMillis);
                        com.anythink.core.common.v.d.a().a(trackingInfo, b9.e().getUnitGroupInfo(), com.anythink.core.common.v.d.f16887b);
                        final CustomRewardVideoAdapter customRewardVideoAdapter = (CustomRewardVideoAdapter) b9.e();
                        Activity activity2 = activity;
                        if (activity2 != null) {
                            customRewardVideoAdapter.refreshActivityContext(activity2);
                        }
                        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                customRewardVideoAdapter.setScenario(str);
                                s c4 = t.b().c();
                                if (c4 != null) {
                                    CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                                    customRewardVideoAdapter2.setAdDownloadListener(c4.createDataFetchListener(customRewardVideoAdapter2, null, aTEventInterface));
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
                if (this.f23386d.a((ATAdStatusInfo) null, 7)) {
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
        com.anythink.core.common.f fVar = this.f23386d;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        return aeVar;
    }

    public final void a(Context context, int i, com.anythink.core.common.d.a aVar, com.anythink.core.common.d.c cVar, ATAdMultipleLoadedListener aTAdMultipleLoadedListener, Map<String, Object> map, ATAdRequest aTAdRequest) {
        ar arVar = new ar();
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f13704c = i;
        arVar.f13705d = cVar;
        arVar.f13707f = aTAdMultipleLoadedListener;
        if (map != null) {
            try {
                arVar.f13708g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (aTAdRequest != null) {
            arVar.f13712l = aTAdRequest.getATAdxBidFloorInfo();
        }
        this.f23386d.b(this.f23384b, "1", this.f23385c, arVar, aVar);
    }

    public final List<ATAdInfo> a(Context context) {
        com.anythink.core.common.f fVar = this.f23386d;
        if (fVar != null) {
            return fVar.a(context);
        }
        return null;
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        com.anythink.core.common.f fVar = this.f23386d;
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
        cVar.f12077d = com.anythink.core.common.f.a(this.f23385c, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
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
            cVar.f12077d = com.anythink.core.common.f.a(aVar.f23385c, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
            ((com.anythink.core.common.l.c.a.e) a9).a(activity, cVar, aVar.new AnonymousClass2(customRewardVideoAdapter, aTRewardVideoListener, activity));
        }
    }
}
