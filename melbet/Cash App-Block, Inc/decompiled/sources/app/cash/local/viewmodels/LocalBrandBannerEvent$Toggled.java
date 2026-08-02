package app.cash.local.viewmodels;

import app.cash.local.viewmodels.LocalBrandBannerModel;

/* loaded from: classes3.dex */
public final class LocalBrandBannerEvent$Toggled implements LocalBrandLocationCartViewEvent, LocalBrandProfileViewEvent, LocalBrandLocationCheckoutViewEvent {
    public final boolean isApplied;

    /* renamed from: type, reason: collision with root package name */
    public final LocalBrandBannerModel.Type f916type;

    public LocalBrandBannerEvent$Toggled(LocalBrandBannerModel.Type type2, boolean z) {
        type2.getClass();
        this.f916type = type2;
        this.isApplied = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandBannerEvent$Toggled)) {
            return false;
        }
        LocalBrandBannerEvent$Toggled localBrandBannerEvent$Toggled = (LocalBrandBannerEvent$Toggled) obj;
        return this.f916type == localBrandBannerEvent$Toggled.f916type && this.isApplied == localBrandBannerEvent$Toggled.isApplied;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isApplied) + (this.f916type.hashCode() * 31);
    }

    public final String toString() {
        return "Toggled(type=" + this.f916type + ", isApplied=" + this.isApplied + ")";
    }
}
