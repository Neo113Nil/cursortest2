package app.cash.local.presenters.wallet;

import app.cash.local.presenters.RealBrandFollowPresenter;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final class BrandCollectionBrandFollowPresenter {
    public final SharedFlowImpl events;
    public final RealBrandFollowPresenter presenter;

    public BrandCollectionBrandFollowPresenter(RealBrandFollowPresenter realBrandFollowPresenter, SharedFlowImpl sharedFlowImpl) {
        this.presenter = realBrandFollowPresenter;
        this.events = sharedFlowImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandCollectionBrandFollowPresenter)) {
            return false;
        }
        BrandCollectionBrandFollowPresenter brandCollectionBrandFollowPresenter = (BrandCollectionBrandFollowPresenter) obj;
        return this.presenter == brandCollectionBrandFollowPresenter.presenter && this.events == brandCollectionBrandFollowPresenter.events;
    }

    public final int hashCode() {
        return this.events.hashCode() + (this.presenter.hashCode() * 31);
    }

    public final String toString() {
        return "BrandCollectionBrandFollowPresenter(presenter=" + this.presenter + ", events=" + this.events + ")";
    }
}
