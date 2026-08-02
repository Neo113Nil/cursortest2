package app.cash.local.viewmodels;

import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandBannerEvent$Clicked implements LocalBrandLocationCartViewEvent, LocalBrandProfileViewEvent, LocalBrandLocationCheckoutViewEvent {
    public final LocalBrandBanner.Action action;

    /* renamed from: type, reason: collision with root package name */
    public final LocalBrandBannerModel.Type f914type;

    public LocalBrandBannerEvent$Clicked(LocalBrandBannerModel.Type type2, LocalBrandBanner.Action action) {
        type2.getClass();
        action.getClass();
        this.f914type = type2;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandBannerEvent$Clicked)) {
            return false;
        }
        LocalBrandBannerEvent$Clicked localBrandBannerEvent$Clicked = (LocalBrandBannerEvent$Clicked) obj;
        return this.f914type == localBrandBannerEvent$Clicked.f914type && Intrinsics.areEqual(this.action, localBrandBannerEvent$Clicked.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.f914type.hashCode() * 31);
    }

    public final String toString() {
        return "Clicked(type=" + this.f914type + ", action=" + this.action + ")";
    }
}
