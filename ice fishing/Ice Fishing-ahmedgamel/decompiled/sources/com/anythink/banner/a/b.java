package com.anythink.banner.a;

import android.content.Context;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.ab;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b implements CustomBannerEventListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<d> f6461a;

    /* renamed from: b, reason: collision with root package name */
    CustomBannerAdapter f6462b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6463c;

    public b(d dVar, CustomBannerAdapter customBannerAdapter, boolean z6) {
        this.f6463c = false;
        this.f6461a = new WeakReference<>(dVar);
        this.f6462b = customBannerAdapter;
        this.f6463c = z6;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.f6462b;
        if (customBannerAdapter != null) {
            n trackingInfo = customBannerAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            }
            com.anythink.core.common.v.c.a().b(this.f6462b);
            ab.a(trackingInfo, j.r.f13318d, j.r.f13326m, "");
            d dVar = this.f6461a.get();
            if (dVar != null) {
                dVar.onBannerClicked(this.f6462b);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.f6462b != null) {
            d dVar = this.f6461a.get();
            if (dVar != null) {
                dVar.onBannerClose(this.f6462b);
            }
            n trackingInfo = this.f6462b.getTrackingInfo();
            ab.a(trackingInfo, j.r.f13319e, j.r.f13326m, "");
            if (trackingInfo != null) {
                e.a(trackingInfo, false);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.f6462b != null) {
            com.anythink.core.common.v.c.a().a(this.f6462b);
            d dVar = this.f6461a.get();
            if (dVar != null) {
                dVar.onBannerShow(this.f6462b, this.f6463c);
            }
            n trackingInfo = this.f6462b.getTrackingInfo();
            trackingInfo.a(this.f6462b.getInternalNetworkInfoMap());
            ab.a(trackingInfo, j.r.f13317c, j.r.f13326m, "");
            com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, this.f6462b.getUnitGroupInfo());
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z6) {
        d dVar = this.f6461a.get();
        if (dVar != null) {
            dVar.onDeeplinkCallback(this.f6462b, z6);
        }
        CustomBannerAdapter customBannerAdapter = this.f6462b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f13323j, z6 ? j.r.f13326m : j.r.f13327n, "");
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        d dVar = this.f6461a.get();
        if (dVar != null) {
            dVar.onDownloadConfirm(context, this.f6462b, aTNetworkConfirmInfo);
        }
        CustomBannerAdapter customBannerAdapter = this.f6462b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f13324k, j.r.f13326m, "");
        }
    }
}
