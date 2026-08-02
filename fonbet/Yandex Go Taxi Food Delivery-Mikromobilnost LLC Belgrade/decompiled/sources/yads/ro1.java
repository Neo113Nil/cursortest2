package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import defpackage.ag81;
import defpackage.ow71;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ro1 extends MediatedBannerAdapter {
    public final MediatedNativeAdapter a;
    public final ag81 b;
    public final Object c = new Object();
    public MediatedBannerAdapter.MediatedBannerAdapterListener d;
    public volatile boolean e;

    public ro1(MediatedNativeAdapter mediatedNativeAdapter, ag81 ag81Var) {
        this.a = mediatedNativeAdapter;
        this.b = ag81Var;
    }

    @Override // com.monetization.ads.mediation.base.a
    public final MediatedAdObject getAdObject() {
        this.a.getAdObject();
        return null;
    }

    @Override // com.monetization.ads.mediation.base.a
    public final MediatedAdapterInfo getAdapterInfo() {
        return this.a.getAdapterInfo();
    }

    @Override // com.monetization.ads.mediation.base.a
    public final boolean getShouldTrackImpressionAutomatically() {
        return this.a.getShouldTrackImpressionAutomatically();
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter
    public final void loadBanner(Context context, MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener, Map map, Map map2) {
        if (this.e) {
            mediatedBannerAdapterListener.onAdFailedToLoad(new MediatedAdRequestError(1, "Load already in progress"));
            return;
        }
        synchronized (this.c) {
            if (this.e) {
                mediatedBannerAdapterListener.onAdFailedToLoad(new MediatedAdRequestError(1, "Load already in progress"));
                return;
            }
            this.e = true;
            this.d = mediatedBannerAdapterListener;
            context.getApplicationContext();
            this.a.loadAd(context, new ow71(this.c), map, map2);
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter
    public final void onInvalidate() {
        synchronized (this.c) {
            this.d = null;
            this.e = false;
        }
    }
}
