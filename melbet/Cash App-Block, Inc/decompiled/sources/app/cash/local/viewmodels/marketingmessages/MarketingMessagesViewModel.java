package app.cash.local.viewmodels.marketingmessages;

import app.cash.local.primitives.MarketingMessageData;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public final class MarketingMessagesViewModel {
    public final boolean isLoading;
    public final List messages;
    public final MessageFilter selectedFilter;
    public final boolean showFilterBar;

    public final class MessageTile {
        public final LocalColor backgroundColor;
        public final MarketingMessageBadge badge;
        public final LocalColor foregroundColor;
        public final LocalImage image;
        public final LocalImage logo;
        public final String logoFallbackLetter;
        public final MarketingMessageData marketingMessage;
        public final String messageText;
        public final String timestampText;
        public final String username;

        public MessageTile(LocalImage localImage, String str, String str2, LocalImage localImage2, LocalColor localColor, LocalColor localColor2, String str3, MarketingMessageData marketingMessageData, MarketingMessageBadge marketingMessageBadge) {
            str.getClass();
            localColor.getClass();
            localColor2.getClass();
            this.image = localImage;
            this.username = str;
            this.messageText = str2;
            this.logo = localImage2;
            this.backgroundColor = localColor;
            this.foregroundColor = localColor2;
            this.timestampText = str3;
            this.marketingMessage = marketingMessageData;
            this.badge = marketingMessageBadge;
            Character firstOrNull = StringsKt___StringsKt.firstOrNull(StringsKt.trimStart(str, '$'));
            String valueOf = firstOrNull != null ? String.valueOf(Character.toUpperCase(firstOrNull.charValue())) : null;
            this.logoFallbackLetter = valueOf == null ? "" : valueOf;
        }

        public static MessageTile copy$default(MessageTile messageTile, MarketingMessageData marketingMessageData, int i) {
            LocalImage localImage = messageTile.image;
            String str = messageTile.username;
            String str2 = (i & 4) != 0 ? messageTile.messageText : "Welcome to the neighborhood! Celebrate with 20% off brunch all weekend long when you show this message at checkout.";
            LocalImage localImage2 = messageTile.logo;
            LocalColor localColor = messageTile.backgroundColor;
            LocalColor localColor2 = messageTile.foregroundColor;
            String str3 = messageTile.timestampText;
            if ((i & 128) != 0) {
                marketingMessageData = messageTile.marketingMessage;
            }
            MarketingMessageData marketingMessageData2 = marketingMessageData;
            MarketingMessageBadge marketingMessageBadge = messageTile.badge;
            messageTile.getClass();
            str.getClass();
            localColor.getClass();
            localColor2.getClass();
            marketingMessageData2.getClass();
            return new MessageTile(localImage, str, str2, localImage2, localColor, localColor2, str3, marketingMessageData2, marketingMessageBadge);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageTile)) {
                return false;
            }
            MessageTile messageTile = (MessageTile) obj;
            return Intrinsics.areEqual(this.image, messageTile.image) && Intrinsics.areEqual(this.username, messageTile.username) && Intrinsics.areEqual(this.messageText, messageTile.messageText) && Intrinsics.areEqual(this.logo, messageTile.logo) && Intrinsics.areEqual(this.backgroundColor, messageTile.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, messageTile.foregroundColor) && Intrinsics.areEqual(this.timestampText, messageTile.timestampText) && this.marketingMessage.equals(messageTile.marketingMessage) && Intrinsics.areEqual(this.badge, messageTile.badge);
        }

        public final int hashCode() {
            LocalImage localImage = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.username);
            String str = this.messageText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            LocalImage localImage2 = this.logo;
            int hashCode2 = (this.foregroundColor.hashCode() + ((this.backgroundColor.hashCode() + ((hashCode + (localImage2 == null ? 0 : localImage2.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.timestampText;
            int hashCode3 = (this.marketingMessage.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            MarketingMessageBadge marketingMessageBadge = this.badge;
            return hashCode3 + (marketingMessageBadge != null ? marketingMessageBadge.hashCode() : 0);
        }

        public final String toString() {
            return "MessageTile(image=" + this.image + ", username=" + this.username + ", messageText=" + this.messageText + ", logo=" + this.logo + ", backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", timestampText=" + this.timestampText + ", marketingMessage=" + this.marketingMessage + ", badge=" + this.badge + ")";
        }
    }

    public MarketingMessagesViewModel(List list, boolean z, MessageFilter messageFilter, boolean z2) {
        list.getClass();
        messageFilter.getClass();
        this.messages = list;
        this.isLoading = z;
        this.selectedFilter = messageFilter;
        this.showFilterBar = z2;
    }

    public static MarketingMessagesViewModel copy$default(MarketingMessagesViewModel marketingMessagesViewModel, ArrayList arrayList, int i) {
        MessageFilter messageFilter = MessageFilter.COUPONS;
        boolean z = marketingMessagesViewModel.isLoading;
        if ((i & 4) != 0) {
            messageFilter = marketingMessagesViewModel.selectedFilter;
        }
        boolean z2 = (i & 8) != 0 ? marketingMessagesViewModel.showFilterBar : true;
        marketingMessagesViewModel.getClass();
        messageFilter.getClass();
        return new MarketingMessagesViewModel(arrayList, z, messageFilter, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingMessagesViewModel)) {
            return false;
        }
        MarketingMessagesViewModel marketingMessagesViewModel = (MarketingMessagesViewModel) obj;
        return Intrinsics.areEqual(this.messages, marketingMessagesViewModel.messages) && this.isLoading == marketingMessagesViewModel.isLoading && this.selectedFilter == marketingMessagesViewModel.selectedFilter && this.showFilterBar == marketingMessagesViewModel.showFilterBar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showFilterBar) + ((this.selectedFilter.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messages.hashCode() * 31, 31, this.isLoading)) * 31);
    }

    public final String toString() {
        return "MarketingMessagesViewModel(messages=" + this.messages + ", isLoading=" + this.isLoading + ", selectedFilter=" + this.selectedFilter + ", showFilterBar=" + this.showFilterBar + ")";
    }

    public /* synthetic */ MarketingMessagesViewModel(List list, int i) {
        this(list, (i & 2) == 0, MessageFilter.ALL, false);
    }
}
