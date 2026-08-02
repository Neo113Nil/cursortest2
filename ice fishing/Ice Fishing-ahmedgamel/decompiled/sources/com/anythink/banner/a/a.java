package com.anythink.banner.a;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.f;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.l.d.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6454a = "Bannera";

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, a> f6455e = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private final Context f6456b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6457c;

    /* renamed from: d, reason: collision with root package name */
    private final f f6458d;

    private a(Context context, String str) {
        this.f6456b = context.getApplicationContext();
        this.f6457c = str;
        this.f6458d = f.a(context, str, "2");
    }

    public static a a(Context context, String str) {
        Map<String, a> map = f6455e;
        a aVar = map.get(str);
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            if (aVar == null) {
                try {
                    aVar = new a(context, str);
                    map.put(str, aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar;
    }

    public final void a(Context context, int i, com.anythink.core.common.d.a aVar, com.anythink.core.common.d.c cVar, ATAdMultipleLoadedListener aTAdMultipleLoadedListener, Map<String, Object> map, ATAdRequest aTAdRequest) {
        ar arVar = new ar();
        arVar.f14334d = cVar;
        arVar.f14336f = aTAdMultipleLoadedListener;
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f14333c = i;
        if (map != null) {
            try {
                arVar.f14337g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (aTAdRequest != null) {
            arVar.f14341l = aTAdRequest.getATAdxBidFloorInfo();
        }
        this.f6458d.b(this.f6456b, "2", this.f6457c, arVar, aVar);
    }

    public final List<ATAdInfo> a(Context context) {
        return this.f6458d.a(context);
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        return this.f6458d.a(context, map);
    }

    public final com.anythink.core.common.h.c a(Context context, boolean z6, ae aeVar) {
        return this.f6458d.b(context, false, z6, aeVar);
    }

    public final void a(com.anythink.core.common.h.c cVar) {
        this.f6458d.a(cVar);
    }

    public final boolean a() {
        return this.f6458d.g();
    }

    public final View a(Context context, com.anythink.core.common.h.c cVar, CustomBannerAdapter customBannerAdapter, final b bVar, ATNativeAdCustomRender aTNativeAdCustomRender) {
        if (customBannerAdapter != null && cVar != null) {
            if (!customBannerAdapter.isMixNative()) {
                customBannerAdapter.setAdEventListener(bVar);
                return customBannerAdapter.getBannerView();
            }
            if (cVar.f() == null) {
                return null;
            }
            com.anythink.core.common.l.c.a.a a9 = com.anythink.basead.mixad.b.b.a(customBannerAdapter, new a.C0082a().a(context).a(customBannerAdapter.getTrackingInfo()).a(cVar.f()).a(aTNativeAdCustomRender).a(new com.anythink.core.common.l.e.a(cVar) { // from class: com.anythink.banner.a.a.1
                @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                public final void onAdClicked(View view) {
                    super.onAdClicked(view);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onBannerAdClicked();
                    }
                }

                @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                public final void onAdImpressed() {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onBannerAdShow();
                    }
                }

                @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                public final void onClose() {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onBannerAdClose();
                    }
                }

                @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                public final void onDeeplinkCallback(boolean z6) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onDeeplinkCallback(z6);
                    }
                }

                @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.onDownloadConfirm(context2, aTNetworkConfirmInfo);
                    }
                }
            }).a());
            if (a9 instanceof com.anythink.core.common.l.c.a.b) {
                return ((com.anythink.core.common.l.c.a.b) a9).a();
            }
        }
        return null;
    }

    public static void a(String str) {
        f6455e.remove(str);
    }
}
