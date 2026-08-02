package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.l.d.a;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.r;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23443a = "b";

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, b> f23444g = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private View f23445b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f23446c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private Context f23447d;

    /* renamed from: e, reason: collision with root package name */
    private String f23448e;

    /* renamed from: f, reason: collision with root package name */
    private final com.anythink.core.common.f f23449f;

    /* renamed from: h, reason: collision with root package name */
    private a f23450h;

    /* renamed from: com.anythink.interstitial.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnTouchListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.anythink.interstitial.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f23452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23454c;

        public AnonymousClass2(WeakReference weakReference, String str, int i) {
            this.f23452a = weakReference;
            this.f23453b = str;
            this.f23454c = i;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            Log.e(b.f23443a, "load: image load fail:".concat(String.valueOf(str2)));
            ImageView imageView = (ImageView) this.f23452a.get();
            if (!TextUtils.equals(this.f23453b, str) || imageView == null) {
                return;
            }
            imageView.setImageResource(this.f23454c);
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f23452a.get();
            if (!TextUtils.equals(this.f23453b, str) || imageView == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.anythink.interstitial.a.b$4, reason: invalid class name */
    public class AnonymousClass4 extends com.anythink.core.common.l.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f23470a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(com.anythink.core.common.h.c cVar, f fVar) {
            super(cVar);
            this.f23470a = fVar;
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdClicked(View view) {
            super.onAdClicked(view);
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdClicked();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdImpressed() {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdShow();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdVideoEnd() {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdVideoEnd();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onAdVideoStart() {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdVideoStart();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onClose() {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdClose();
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onDeeplinkCallback(boolean z6) {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onDeeplinkCallback(z6);
            }
        }

        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
        public final void onVideoError(String str, String str2) {
            f fVar = this.f23470a;
            if (fVar != null) {
                fVar.onInterstitialAdVideoError(str, str2);
            }
        }
    }

    /* renamed from: com.anythink.interstitial.a.b$5, reason: invalid class name */
    public class AnonymousClass5 implements a.InterfaceC0083a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomInterstitialAdapter f23472a;

        public AnonymousClass5(CustomInterstitialAdapter customInterstitialAdapter) {
            this.f23472a = customInterstitialAdapter;
        }

        @Override // com.anythink.core.common.l.e.a.a.InterfaceC0083a
        public final void a(Activity activity) {
            if (b.this.f23450h != null) {
                b.this.f23450h.a(this.f23472a, activity);
            }
        }
    }

    /* renamed from: com.anythink.interstitial.a.b$6, reason: invalid class name */
    public class AnonymousClass6 implements a.InterfaceC0084a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomInterstitialAdapter f23474a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f23475b;

        public AnonymousClass6(CustomInterstitialAdapter customInterstitialAdapter, f fVar) {
            this.f23474a = customInterstitialAdapter;
            this.f23475b = fVar;
        }

        @Override // com.anythink.core.common.l.f.a.a.InterfaceC0084a
        public final void a(final Activity activity, ViewGroup viewGroup) {
            if (b.this.f23450h != null) {
                b.this.f23450h.a(this.f23474a, activity);
            }
            this.f23474a.internalShow(activity, viewGroup, new c(this.f23475b) { // from class: com.anythink.interstitial.a.b.6.1
                @Override // com.anythink.interstitial.a.c, com.anythink.core.api.ATCommonImpressionListener
                public final void onAdDismiss() {
                    t.b().b(new Runnable() { // from class: com.anythink.interstitial.a.b.6.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (activity.isFinishing()) {
                                return;
                            }
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                        }
                    });
                    super.onAdDismiss();
                }
            });
        }
    }

    private b(Context context, String str) {
        this.f23447d = context.getApplicationContext();
        this.f23448e = str;
        this.f23449f = com.anythink.core.common.f.a(context, str, "3");
    }

    private static void b() {
    }

    private static void c() {
    }

    private static void d() {
    }

    public static b a(Context context, String str) {
        b bVar = f23444g.get(str);
        if (bVar != null) {
            return bVar;
        }
        synchronized (b.class) {
            if (bVar == null) {
                try {
                    bVar = new b(context, str);
                    f23444g.put(str, bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bVar;
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        com.anythink.core.d.b k9 = k.k(com.anythink.core.d.d.a(this.f23447d));
        String z6 = k9.z();
        String y7 = k9.y();
        if (this.f23445b == null) {
            this.f23445b = LayoutInflater.from(activity.getApplicationContext()).inflate(q.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
        }
        this.f23445b.setOnTouchListener(new AnonymousClass1());
        ImageView imageView = (ImageView) this.f23445b.findViewById(q.a(activity, "interstitial_iv_loading", "id"));
        TextView textView = (TextView) this.f23445b.findViewById(q.a(activity, "interstitial_tv_loading", "id"));
        int a9 = q.a((Context) activity, 30.0f);
        imageView.setMinimumWidth(a9);
        imageView.setMinimumHeight(a9);
        int a10 = q.a((Context) activity, 90.0f);
        imageView.setMaxWidth(a10);
        imageView.setMaxHeight(a10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int a11 = q.a(activity, "interstitial_loading_default", com.anythink.expressad.foundation.h.k.f20419c);
        if (TextUtils.isEmpty(z6)) {
            imageView.setImageResource(a11);
        } else {
            com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, z6), new AnonymousClass2(new WeakReference(imageView), z6, a11));
        }
        if (!TextUtils.isEmpty(y7)) {
            textView.setText(y7);
        } else {
            textView.setText(q.a(activity, "interstitial_text_loading_default", com.anythink.expressad.foundation.h.k.f20423g));
        }
        View view = this.f23445b;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.f23445b.getParent()).removeView(this.f23445b);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.f23445b, new FrameLayout.LayoutParams(-1, -1));
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
        this.f23449f.b(this.f23447d, "3", this.f23448e, arVar, aVar);
    }

    public final List<ATAdInfo> a(Context context) {
        return this.f23449f.a(context);
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        return this.f23449f.a(context, map);
    }

    private com.anythink.core.common.h.c a(Context context, ae aeVar) {
        return this.f23449f.b(context, false, true, aeVar);
    }

    public final synchronized void a(Activity activity, ATShowConfig aTShowConfig, ATInterstitialListener aTInterstitialListener, ATEventInterface aTEventInterface, Map<String, Object> map, ATNativeAdCustomRender aTNativeAdCustomRender) {
        try {
            if (this.f23446c.get()) {
                return;
            }
            a aVar = this.f23450h;
            if (aVar != null) {
                aVar.a();
                this.f23450h = null;
            }
            this.f23450h = new a(activity, aTShowConfig, aTInterstitialListener, aTEventInterface, map, aTNativeAdCustomRender, this.f23448e, this);
            ae aeVar = new ae();
            aeVar.a(map);
            com.anythink.core.common.f fVar = this.f23449f;
            if (fVar != null) {
                aeVar.a(fVar.i());
            }
            if (aTShowConfig != null) {
                aeVar.a(aTShowConfig.getATAdInfo());
            }
            a(activity, this.f23449f.b((Context) activity, false, true, aeVar), aTShowConfig, aTInterstitialListener, aTEventInterface, map, aTNativeAdCustomRender);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final com.anythink.core.common.f a() {
        return this.f23449f;
    }

    public final void a(final Activity activity, final com.anythink.core.common.h.c cVar, final ATShowConfig aTShowConfig, final ATInterstitialListener aTInterstitialListener, final ATEventInterface aTEventInterface, final Map<String, Object> map, final ATNativeAdCustomRender aTNativeAdCustomRender) {
        if (cVar != null && (cVar.e() instanceof CustomInterstitialAdapter)) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23449f.a(cVar);
            cVar.a(cVar.c() + 1);
            final int aq = cVar.e().getUnitGroupInfo().aq();
            if (aq > 0) {
                this.f23446c.set(true);
            }
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.interstitial.a.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    final String str;
                    String str2;
                    final CustomInterstitialAdapter customInterstitialAdapter = (CustomInterstitialAdapter) cVar.e();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customInterstitialAdapter.refreshActivityContext(activity2);
                    }
                    final n trackingInfo = cVar.e().getTrackingInfo();
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
                        aj.a(b.this.f23447d, trackingInfo);
                        aj.a((Map<String, Object>) map, trackingInfo);
                        aj.a(b.this.f23448e, trackingInfo);
                    }
                    com.anythink.core.common.a.a().a(b.this.f23447d, cVar);
                    com.anythink.core.common.u.c.a(b.this.f23447d).a(13, trackingInfo, cVar.e().getUnitGroupInfo(), currentTimeMillis);
                    com.anythink.core.common.v.d.a().a(trackingInfo, cVar.e().getUnitGroupInfo(), com.anythink.core.common.v.d.f17516b);
                    if (aq > 0) {
                        t.b().b(new Runnable() { // from class: com.anythink.interstitial.a.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                b.a(b.this, activity);
                            }
                        });
                    }
                    t.b().a(new Runnable() { // from class: com.anythink.interstitial.a.b.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            customInterstitialAdapter.setScenario(str);
                            s c9 = t.b().c();
                            if (c9 != null) {
                                CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                                customInterstitialAdapter2.setAdDownloadListener(c9.createDataFetchListener(customInterstitialAdapter2, null, aTEventInterface));
                            }
                            CustomInterstitialAdapter customInterstitialAdapter3 = customInterstitialAdapter;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            f fVar = new f(customInterstitialAdapter3, aTInterstitialListener, b.this.f23450h);
                            if (customInterstitialAdapter.isMixNative()) {
                                AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                b.a(b.this, customInterstitialAdapter, activity, fVar, cVar, trackingInfo, str, aTNativeAdCustomRender);
                            } else if (customInterstitialAdapter.isMixSplash()) {
                                AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                b.a(b.this, activity, customInterstitialAdapter, fVar);
                            } else {
                                customInterstitialAdapter.internalShow(activity, null, new c(fVar));
                            }
                            n trackingInfo2 = customInterstitialAdapter.getTrackingInfo();
                            com.anythink.core.common.u.e.a("4", trackingInfo2, trackingInfo2.aJ(), trackingInfo2.aI(), trackingInfo2.M(), trackingInfo2.Y(), 4, SystemClock.elapsedRealtime() - elapsedRealtime);
                            AnonymousClass3 anonymousClass34 = AnonymousClass3.this;
                            if (aq <= 0 || !b.this.f23446c.get()) {
                                return;
                            }
                            if (b.this.f23445b != null) {
                                ((ViewGroup) b.this.f23445b.getParent()).removeView(b.this.f23445b);
                            }
                            b.this.f23446c.set(false);
                        }
                    }, aq);
                }
            });
            return;
        }
        if (this.f23449f.a((ATAdStatusInfo) null, 7)) {
            a(t.b().M(), 7, (com.anythink.core.common.d.a) null, (com.anythink.core.common.d.c) null, (ATAdMultipleLoadedListener) null, map, (ATAdRequest) null);
        }
    }

    private ae a(ATShowConfig aTShowConfig, Map<String, Object> map) {
        ae aeVar = new ae();
        aeVar.a(map);
        com.anythink.core.common.f fVar = this.f23449f;
        if (fVar != null) {
            aeVar.a(fVar.i());
        }
        if (aTShowConfig != null) {
            aeVar.a(aTShowConfig.getATAdInfo());
        }
        return aeVar;
    }

    private void a(CustomInterstitialAdapter customInterstitialAdapter, Activity activity, f fVar, com.anythink.core.common.h.c cVar, n nVar, String str, ATNativeAdCustomRender aTNativeAdCustomRender) {
        String str2;
        BaseAd f2 = cVar.f();
        if (f2 == null) {
            if (fVar != null) {
                fVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail, no ad cache.");
                return;
            }
            return;
        }
        com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customInterstitialAdapter, new a.C0082a().a(activity).a(f2).a(nVar).a(aTNativeAdCustomRender).a(new AnonymousClass4(cVar, fVar)).a());
        if (!(a9 instanceof com.anythink.core.common.l.c.a.c)) {
            if (fVar != null) {
                fVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
                return;
            }
            return;
        }
        com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
        if (nVar == null || this.f23449f == null) {
            str2 = "";
        } else {
            str2 = com.anythink.core.common.f.a(nVar.aI(), nVar.M(), String.valueOf(nVar.Y()));
        }
        if (TextUtils.isEmpty(str2)) {
            if (fVar != null) {
                fVar.onInterstitialAdVideoError("", "create interstitial bridge with error: eventId is empty.");
            }
        } else {
            cVar2.f12706d = str2;
            cVar2.f12707e = m.f(activity);
            cVar2.f12704b = str;
            cVar2.f12703a = Integer.parseInt("3");
            ((com.anythink.core.common.l.c.a.c) a9).a(activity, cVar2, new AnonymousClass5(customInterstitialAdapter));
        }
    }

    private void a(Activity activity, CustomInterstitialAdapter customInterstitialAdapter, f fVar) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        bv unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo();
        if (unitGroupInfo == null) {
            return;
        }
        com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customInterstitialAdapter, null);
        if (a9 instanceof com.anythink.core.common.l.c.a.c) {
            cVar.f12706d = com.anythink.core.common.f.a(this.f23448e, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
            ((com.anythink.core.common.l.c.a.c) a9).a(activity, cVar, new AnonymousClass6(customInterstitialAdapter, fVar));
        } else if (fVar != null) {
            fVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
        }
    }

    public static /* synthetic */ void a(b bVar, Activity activity) {
        if (activity != null) {
            com.anythink.core.d.b k9 = k.k(com.anythink.core.d.d.a(bVar.f23447d));
            String z6 = k9.z();
            String y7 = k9.y();
            if (bVar.f23445b == null) {
                bVar.f23445b = LayoutInflater.from(activity.getApplicationContext()).inflate(q.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
            }
            bVar.f23445b.setOnTouchListener(bVar.new AnonymousClass1());
            ImageView imageView = (ImageView) bVar.f23445b.findViewById(q.a(activity, "interstitial_iv_loading", "id"));
            TextView textView = (TextView) bVar.f23445b.findViewById(q.a(activity, "interstitial_tv_loading", "id"));
            int a9 = q.a((Context) activity, 30.0f);
            imageView.setMinimumWidth(a9);
            imageView.setMinimumHeight(a9);
            int a10 = q.a((Context) activity, 90.0f);
            imageView.setMaxWidth(a10);
            imageView.setMaxHeight(a10);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int a11 = q.a(activity, "interstitial_loading_default", com.anythink.expressad.foundation.h.k.f20419c);
            if (TextUtils.isEmpty(z6)) {
                imageView.setImageResource(a11);
            } else {
                com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, z6), bVar.new AnonymousClass2(new WeakReference(imageView), z6, a11));
            }
            if (!TextUtils.isEmpty(y7)) {
                textView.setText(y7);
            } else {
                textView.setText(q.a(activity, "interstitial_text_loading_default", com.anythink.expressad.foundation.h.k.f20423g));
            }
            View view = bVar.f23445b;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) bVar.f23445b.getParent()).removeView(bVar.f23445b);
            }
            ((ViewGroup) activity.getWindow().getDecorView()).addView(bVar.f23445b, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public static /* synthetic */ void a(b bVar, CustomInterstitialAdapter customInterstitialAdapter, Activity activity, f fVar, com.anythink.core.common.h.c cVar, n nVar, String str, ATNativeAdCustomRender aTNativeAdCustomRender) {
        String str2;
        BaseAd f2 = cVar.f();
        if (f2 == null) {
            fVar.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail, no ad cache.");
            return;
        }
        com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customInterstitialAdapter, new a.C0082a().a(activity).a(f2).a(nVar).a(aTNativeAdCustomRender).a(bVar.new AnonymousClass4(cVar, fVar)).a());
        if (!(a9 instanceof com.anythink.core.common.l.c.a.c)) {
            fVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
            return;
        }
        com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
        if (nVar == null || bVar.f23449f == null) {
            str2 = "";
        } else {
            str2 = com.anythink.core.common.f.a(nVar.aI(), nVar.M(), String.valueOf(nVar.Y()));
        }
        if (TextUtils.isEmpty(str2)) {
            fVar.onInterstitialAdVideoError("", "create interstitial bridge with error: eventId is empty.");
            return;
        }
        cVar2.f12706d = str2;
        cVar2.f12707e = m.f(activity);
        cVar2.f12704b = str;
        cVar2.f12703a = Integer.parseInt("3");
        ((com.anythink.core.common.l.c.a.c) a9).a(activity, cVar2, bVar.new AnonymousClass5(customInterstitialAdapter));
    }

    public static /* synthetic */ void a(b bVar, Activity activity, CustomInterstitialAdapter customInterstitialAdapter, f fVar) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        bv unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo();
        if (unitGroupInfo != null) {
            com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customInterstitialAdapter, null);
            if (!(a9 instanceof com.anythink.core.common.l.c.a.c)) {
                fVar.onInterstitialAdVideoError("", "create interstitial bridge with unknow error.");
            } else {
                cVar.f12706d = com.anythink.core.common.f.a(bVar.f23448e, unitGroupInfo.z(), String.valueOf(unitGroupInfo.g()));
                ((com.anythink.core.common.l.c.a.c) a9).a(activity, cVar, bVar.new AnonymousClass6(customInterstitialAdapter, fVar));
            }
        }
    }
}
