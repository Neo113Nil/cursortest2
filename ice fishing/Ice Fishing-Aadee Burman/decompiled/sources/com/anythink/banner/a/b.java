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
    WeakReference<d> f5675a;

    /* renamed from: b, reason: collision with root package name */
    CustomBannerAdapter f5676b;

    /* renamed from: c, reason: collision with root package name */
    boolean f5677c;

    public b(d dVar, CustomBannerAdapter customBannerAdapter, boolean z3) {
        this.f5677c = false;
        this.f5675a = new WeakReference<>(dVar);
        this.f5676b = customBannerAdapter;
        this.f5677c = z3;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.f5676b;
        if (customBannerAdapter != null) {
            n trackingInfo = customBannerAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            }
            com.anythink.core.common.v.c.a().b(this.f5676b);
            ab.a(trackingInfo, j.r.f12532d, j.r.f12540m, "");
            d dVar = this.f5675a.get();
            if (dVar != null) {
                dVar.onBannerClicked(this.f5676b);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.f5676b != null) {
            d dVar = this.f5675a.get();
            if (dVar != null) {
                dVar.onBannerClose(this.f5676b);
            }
            n trackingInfo = this.f5676b.getTrackingInfo();
            ab.a(trackingInfo, j.r.f12533e, j.r.f12540m, "");
            if (trackingInfo != null) {
                e.a(trackingInfo, false);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.f5676b != null) {
            com.anythink.core.common.v.c.a().a(this.f5676b);
            d dVar = this.f5675a.get();
            if (dVar != null) {
                dVar.onBannerShow(this.f5676b, this.f5677c);
            }
            n trackingInfo = this.f5676b.getTrackingInfo();
            trackingInfo.a(this.f5676b.getInternalNetworkInfoMap());
            ab.a(trackingInfo, j.r.f12531c, j.r.f12540m, "");
            com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, this.f5676b.getUnitGroupInfo());
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z3) {
        d dVar = this.f5675a.get();
        if (dVar != null) {
            dVar.onDeeplinkCallback(this.f5676b, z3);
        }
        CustomBannerAdapter customBannerAdapter = this.f5676b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f12537j, z3 ? j.r.f12540m : j.r.f12541n, "");
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        d dVar = this.f5675a.get();
        if (dVar != null) {
            dVar.onDownloadConfirm(context, this.f5676b, aTNetworkConfirmInfo);
        }
        CustomBannerAdapter customBannerAdapter = this.f5676b;
        if (customBannerAdapter != null) {
            ab.a(customBannerAdapter.getTrackingInfo(), j.r.f12538k, j.r.f12540m, "");
        }
    }
}
