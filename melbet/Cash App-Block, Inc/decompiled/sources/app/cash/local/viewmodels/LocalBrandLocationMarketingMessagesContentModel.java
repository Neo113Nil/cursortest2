package app.cash.local.viewmodels;

import app.cash.local.primitives.MessageToken;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMarketingMessagesContentModel implements LocalBrandProfileSectionContent {
    public final ArrayList entries;
    public final boolean showAllVisible;

    public final class Entry {
        public final MarketingMessageBadge badge;
        public final LocalColor brandColor;
        public final LocalImage image;
        public final String message;
        public final String token;

        public Entry(String str, LocalImage localImage, String str2, MarketingMessageBadge marketingMessageBadge, LocalColor localColor) {
            str.getClass();
            localColor.getClass();
            this.token = str;
            this.image = localImage;
            this.message = str2;
            this.badge = marketingMessageBadge;
            this.brandColor = localColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.token, entry.token) && Intrinsics.areEqual(this.image, entry.image) && Intrinsics.areEqual(this.message, entry.message) && Intrinsics.areEqual(this.badge, entry.badge) && Intrinsics.areEqual(this.brandColor, entry.brandColor);
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode() * 31;
            LocalImage localImage = this.image;
            int hashCode2 = (hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31;
            String str = this.message;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            MarketingMessageBadge marketingMessageBadge = this.badge;
            return this.brandColor.hashCode() + ((hashCode3 + (marketingMessageBadge != null ? marketingMessageBadge.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Entry(token=" + MessageToken.m1273toStringimpl(this.token) + ", image=" + this.image + ", message=" + this.message + ", badge=" + this.badge + ", brandColor=" + this.brandColor + ")";
        }
    }

    public LocalBrandLocationMarketingMessagesContentModel(ArrayList arrayList, boolean z) {
        this.entries = arrayList;
        this.showAllVisible = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationMarketingMessagesContentModel)) {
            return false;
        }
        LocalBrandLocationMarketingMessagesContentModel localBrandLocationMarketingMessagesContentModel = (LocalBrandLocationMarketingMessagesContentModel) obj;
        return this.entries.equals(localBrandLocationMarketingMessagesContentModel.entries) && this.showAllVisible == localBrandLocationMarketingMessagesContentModel.showAllVisible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showAllVisible) + (this.entries.hashCode() * 31);
    }

    public final String toString() {
        return "LocalBrandLocationMarketingMessagesContentModel(entries=" + this.entries + ", showAllVisible=" + this.showAllVisible + ")";
    }
}
