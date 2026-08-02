package app.cash.local.viewmodels;

import app.cash.local.viewmodels.LocalBrandBannerModel;

/* loaded from: classes3.dex */
public final class LocalBrandBannerEvent$Dismissed implements LocalBrandLocationCartViewEvent, LocalBrandProfileViewEvent, LocalBrandLocationCheckoutViewEvent {

    /* renamed from: type, reason: collision with root package name */
    public final LocalBrandBannerModel.Type f915type;

    public LocalBrandBannerEvent$Dismissed(LocalBrandBannerModel.Type type2) {
        type2.getClass();
        this.f915type = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrandBannerEvent$Dismissed) && this.f915type == ((LocalBrandBannerEvent$Dismissed) obj).f915type;
    }

    public final int hashCode() {
        return this.f915type.hashCode();
    }

    public final String toString() {
        return "Dismissed(type=" + this.f915type + ")";
    }
}
