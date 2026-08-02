package com.squareup.cash.discover.promotiondetails.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface PromotionDetailsViewModel {

    /* loaded from: classes6.dex */
    public interface DetailsPageData {

        public final class DetailsPageV1 implements DetailsPageData {
            public final DetailsPage details;

            public DetailsPageV1(DetailsPage detailsPage) {
                detailsPage.getClass();
                this.details = detailsPage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DetailsPageV1) && Intrinsics.areEqual(this.details, ((DetailsPageV1) obj).details);
            }

            public final int hashCode() {
                return this.details.hashCode();
            }

            public final String toString() {
                return "DetailsPageV1(details=" + this.details + ")";
            }
        }

        public final class DetailsPageV2 implements DetailsPageData {
            public final DetailsPageView detailsPageView;

            public DetailsPageV2(DetailsPageView detailsPageView) {
                detailsPageView.getClass();
                this.detailsPageView = detailsPageView;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DetailsPageV2) && Intrinsics.areEqual(this.detailsPageView, ((DetailsPageV2) obj).detailsPageView);
            }

            public final int hashCode() {
                return this.detailsPageView.hashCode();
            }

            public final String toString() {
                return "DetailsPageV2(detailsPageView=" + this.detailsPageView + ")";
            }
        }

        public final class ShareSheetDetails {
            public final String message;
            public final String url;

            public ShareSheetDetails(String str, String str2) {
                this.message = str;
                this.url = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShareSheetDetails)) {
                    return false;
                }
                ShareSheetDetails shareSheetDetails = (ShareSheetDetails) obj;
                return Intrinsics.areEqual(this.message, shareSheetDetails.message) && Intrinsics.areEqual(this.url, shareSheetDetails.url);
            }

            public final int hashCode() {
                String str = this.message;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.url;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("ShareSheetDetails(message=", this.message, ", url=", this.url, ")");
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class Loaded implements PromotionDetailsViewModel {
        public final DetailsPageData details;
        public final boolean isBooklet;
        public final BetterNavigator.ScreenNavigator navigator;
        public final String sharedElementId;

        public Loaded(DetailsPageData detailsPageData, BetterNavigator.ScreenNavigator screenNavigator, String str, boolean z) {
            this.details = detailsPageData;
            this.navigator = screenNavigator;
            this.sharedElementId = str;
            this.isBooklet = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Loaded) {
                Loaded loaded = (Loaded) obj;
                if (this.details.equals(loaded.details) && this.navigator == loaded.navigator && Intrinsics.areEqual(this.sharedElementId, loaded.sharedElementId) && this.isBooklet == loaded.isBooklet) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel
        public final String getSharedElementId() {
            return this.sharedElementId;
        }

        public final int hashCode() {
            int hashCode = (this.navigator.hashCode() + (this.details.hashCode() * 31)) * 31;
            String str = this.sharedElementId;
            return Boolean.hashCode(this.isBooklet) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(details=");
            sb.append(this.details);
            sb.append(", navigator=");
            sb.append(this.navigator);
            sb.append(", sharedElementId=");
            return re$$ExternalSyntheticOutline0.m(sb, this.sharedElementId, ", isBooklet=", this.isBooklet, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements PromotionDetailsViewModel {
        public final String sharedElementId;

        public Loading(String str) {
            this.sharedElementId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.sharedElementId, ((Loading) obj).sharedElementId);
        }

        @Override // com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel
        public final String getSharedElementId() {
            return this.sharedElementId;
        }

        public final int hashCode() {
            String str = this.sharedElementId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(sharedElementId=", this.sharedElementId, ")");
        }
    }

    String getSharedElementId();
}
