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
    WeakReference<d> f5832a;

    /* renamed from: b, reason: collision with root package name */
    CustomBannerAdapter f5833b;

    /* renamed from: c, reason: collision with root package name */
    boolean f5834c;

    public b(d dVar, CustomBannerAdapter customBannerAdapter, boolean z8) {
        this.f5834c = false;
        this.f5832a = new WeakReference<>(dVar);
        this.f5833b = customBannerAdapter;
        this.f5834c = z8;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.f5833b;
        if (customBannerAdapter != null) {
            n trackingInfo = customBannerAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            }
            com.anythink.core.common.v.c.a().b(this.f5833b);
            ab.a(trackingInfo, j.r.f12689d, j.r.f12697m, "");
            d dVar = this.f5832a.get();
            if (dVar != null) {
                dVar.onBannerClicked(this.f5833b);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.f5833b != null) {
            d dVar = this.f5832a.get();
            if (dVar != null) {
                dVar.onBannerClose(this.f5833b);
            }
            n trackingInfo = this.f5833b.getTrackingInfo();
            ab.a(trackingInfo, j.r.f12690e, j.r.f12697m, "");
            if (trackingInfo != null) {
                e.a(trackingInfo, false);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.f5833b != null) {
            com.anythink.core.common.v.c.a().a(this.f5833b);
            d dVar = this.f5832a.get();
            if (dVar != null) {
                dVar.onBannerShow(this.f5833b, this.f5834c);
            }
            n trackingInfo = this.f5833b.getTrackingInfo();
            trackingInfo.a(this.f5833b.getInternalNetworkInfoMap());
            ab.a(trackingInfo, j.r.f12688c, j.r.f12697m, "");
            com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, this.f5833b.getUnitGroupInfo());
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z8) {
        d dVar = this.f5832a.get();
        if (dVar != null) {
            dVar.onDeeplinkCallback(this.f5833b, z8);
        }
        CustomBannerAdapter customBannerAdapter = this.f5833b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f12694j, z8 ? j.r.f12697m : j.r.f12698n, "");
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        d dVar = this.f5832a.get();
        if (dVar != null) {
            dVar.onDownloadConfirm(context, this.f5833b, aTNetworkConfirmInfo);
        }
        CustomBannerAdapter customBannerAdapter = this.f5833b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f12695k, j.r.f12697m, "");
        }
    }
}
