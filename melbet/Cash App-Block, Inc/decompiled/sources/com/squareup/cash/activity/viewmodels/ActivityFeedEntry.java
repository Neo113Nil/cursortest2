package com.squareup.cash.activity.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.backend.ActivityGrouping;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ActivityFeedEntry {

    public final class CardAppMessage implements ActivityFeedEntry {
        public final CardAppMessageViewModel.Ready appMessage;
        public final String key;

        public CardAppMessage(CardAppMessageViewModel.Ready ready) {
            this.appMessage = ready;
            this.key = ready.messageToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardAppMessage) && this.appMessage.equals(((CardAppMessage) obj).appMessage);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            return this.appMessage.hashCode();
        }

        public final String toString() {
            return "CardAppMessage(appMessage=" + this.appMessage + ")";
        }
    }

    public final class EmbeddedFooter implements ActivityFeedEntry {
        public static final EmbeddedFooter INSTANCE = new EmbeddedFooter();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmbeddedFooter);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "embedded footer";
        }

        public final int hashCode() {
            return -1685490496;
        }

        public final String toString() {
            return "EmbeddedFooter";
        }
    }

    public final class EmbeddedHeader implements ActivityFeedEntry {
        public final boolean hasMore;

        public EmbeddedHeader(boolean z) {
            this.hasMore = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmbeddedHeader) && this.hasMore == ((EmbeddedHeader) obj).hasMore;
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "embedded header";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasMore);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("EmbeddedHeader(hasMore=", ")", this.hasMore);
        }
    }

    public final class EmptyItem implements ActivityFeedEntry {
        public final String message;

        public EmptyItem(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmptyItem) && Intrinsics.areEqual(this.message, ((EmptyItem) obj).message);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "empty item";
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmptyItem(message=", this.message, ")");
        }
    }

    public final class ErrorItem implements ActivityFeedEntry {
        public final FormattingFailedActivityItem activityItem;
        public final String key;

        public ErrorItem(FormattingFailedActivityItem formattingFailedActivityItem) {
            this.activityItem = formattingFailedActivityItem;
            this.key = formattingFailedActivityItem.getRowId();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorItem) && this.activityItem.equals(((ErrorItem) obj).activityItem);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            return this.activityItem.hashCode();
        }

        public final String toString() {
            return "ErrorItem(activityItem=" + this.activityItem + ")";
        }
    }

    public final class Header implements ActivityFeedEntry {
        public final Object aggregation;
        public final ActivityGrouping grouping;
        public final String key;
        public final String title;

        public Header(ActivityGrouping activityGrouping, String str, Object obj) {
            activityGrouping.getClass();
            this.grouping = activityGrouping;
            this.title = str;
            this.aggregation = obj;
            this.key = activityGrouping.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(this.grouping, header.grouping) && this.title.equals(header.title) && Intrinsics.areEqual(this.aggregation, header.aggregation);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.grouping.hashCode() * 31, 31, this.title);
            Object obj = this.aggregation;
            return m + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(grouping=");
            sb.append(this.grouping);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", aggregation=");
            return Recorder$$ExternalSyntheticOutline1.m(sb, this.aggregation, ")");
        }
    }

    public final class InlineAppMessage implements ActivityFeedEntry {
        public final InlineAppMessageViewModel.Ready appMessage;
        public final String key;

        public InlineAppMessage(InlineAppMessageViewModel.Ready ready) {
            this.appMessage = ready;
            this.key = ready.messageToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InlineAppMessage) && this.appMessage.equals(((InlineAppMessage) obj).appMessage);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            return this.appMessage.hashCode();
        }

        public final String toString() {
            return "InlineAppMessage(appMessage=" + this.appMessage + ")";
        }
    }

    public final class InlineAppMessageV2 implements ActivityFeedEntry {
        public final InlineAppMessageV2ViewModel.Ready appMessage;
        public final String key;

        public InlineAppMessageV2(InlineAppMessageV2ViewModel.Ready ready) {
            this.appMessage = ready;
            this.key = ready.messageToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InlineAppMessageV2) && this.appMessage.equals(((InlineAppMessageV2) obj).appMessage);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            return this.appMessage.hashCode();
        }

        public final String toString() {
            return "InlineAppMessageV2(appMessage=" + this.appMessage + ")";
        }
    }

    public final class InviteFriendsItem implements ActivityFeedEntry {
        public final String inviteSubtitle;
        public final String inviteTitle;

        public InviteFriendsItem(String str, String str2) {
            str.getClass();
            this.inviteTitle = str;
            this.inviteSubtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteFriendsItem)) {
                return false;
            }
            InviteFriendsItem inviteFriendsItem = (InviteFriendsItem) obj;
            return Intrinsics.areEqual(this.inviteTitle, inviteFriendsItem.inviteTitle) && Intrinsics.areEqual(this.inviteSubtitle, inviteFriendsItem.inviteSubtitle);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "invite friends";
        }

        public final int hashCode() {
            int hashCode = this.inviteTitle.hashCode() * 31;
            String str = this.inviteSubtitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InviteFriendsItem(inviteTitle=", this.inviteTitle, ", inviteSubtitle=", this.inviteSubtitle, ")");
        }
    }

    public final class Item implements ActivityFeedEntry {
        public final UiCallbackModel activityItem;
        public final String key;

        public Item(UiCallbackModel uiCallbackModel) {
            uiCallbackModel.getClass();
            this.activityItem = uiCallbackModel;
            this.key = ((ActivityItemViewModel) uiCallbackModel.model).rowId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && Intrinsics.areEqual(this.activityItem, ((Item) obj).activityItem);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return this.key;
        }

        public final int hashCode() {
            return this.activityItem.hashCode();
        }

        public final String toString() {
            return "Item(activityItem=" + this.activityItem + ")";
        }
    }

    public final class NewUserExperience implements ActivityFeedEntry {
        public final String inviteFriendsText;

        public NewUserExperience(String str) {
            this.inviteFriendsText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewUserExperience) && Intrinsics.areEqual(this.inviteFriendsText, ((NewUserExperience) obj).inviteFriendsText);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "nux";
        }

        public final int hashCode() {
            String str = this.inviteFriendsText;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NewUserExperience(inviteFriendsText=", this.inviteFriendsText, ")");
        }
    }

    public final class QuickAccessBar implements ActivityFeedEntry {
        public final ContactHeaderViewModel viewModel;

        public QuickAccessBar(ContactHeaderViewModel contactHeaderViewModel) {
            this.viewModel = contactHeaderViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickAccessBar) && this.viewModel.equals(((QuickAccessBar) obj).viewModel);
        }

        @Override // com.squareup.cash.activity.viewmodels.ActivityFeedEntry
        public final String getKey() {
            return "quick access bar";
        }

        public final int hashCode() {
            return this.viewModel.hashCode();
        }

        public final String toString() {
            return "QuickAccessBar(viewModel=" + this.viewModel + ")";
        }
    }

    String getKey();
}
