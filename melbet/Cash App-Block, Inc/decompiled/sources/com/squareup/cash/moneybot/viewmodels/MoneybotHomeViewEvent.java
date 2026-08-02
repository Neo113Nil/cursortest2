package com.squareup.cash.moneybot.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotHomeViewEvent {

    public final class ChatInputTapped implements MoneybotHomeViewEvent {
        public static final ChatInputTapped INSTANCE = new ChatInputTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatInputTapped);
        }

        public final int hashCode() {
            return -455803435;
        }

        public final String toString() {
            return "ChatInputTapped";
        }
    }

    public final class DeleteWidget implements MoneybotHomeViewEvent {
        public final String widgetId;

        public DeleteWidget(String str) {
            str.getClass();
            this.widgetId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteWidget) && Intrinsics.areEqual(this.widgetId, ((DeleteWidget) obj).widgetId);
        }

        public final int hashCode() {
            return this.widgetId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeleteWidget(widgetId=", this.widgetId, ")");
        }
    }

    public final class LaunchNextBestAction implements MoneybotHomeViewEvent {
        public final String category;
        public final String clientRoute;
        public final String nextBestActionId;

        public LaunchNextBestAction(String str, String str2, String str3) {
            this.nextBestActionId = str;
            this.clientRoute = str2;
            this.category = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchNextBestAction)) {
                return false;
            }
            LaunchNextBestAction launchNextBestAction = (LaunchNextBestAction) obj;
            return this.nextBestActionId.equals(launchNextBestAction.nextBestActionId) && this.clientRoute.equals(launchNextBestAction.clientRoute) && Intrinsics.areEqual(this.category, launchNextBestAction.category);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nextBestActionId.hashCode() * 31, 31, this.clientRoute);
            String str = this.category;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LaunchNextBestAction(nextBestActionId=", this.nextBestActionId, ", clientRoute=", this.clientRoute, ", category="), this.category, ")");
        }
    }

    public final class NbaViewed implements MoneybotHomeViewEvent {
        public final String category;
        public final String nextBestActionId;

        public NbaViewed(String str, String str2) {
            this.nextBestActionId = str;
            this.category = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NbaViewed)) {
                return false;
            }
            NbaViewed nbaViewed = (NbaViewed) obj;
            return this.nextBestActionId.equals(nbaViewed.nextBestActionId) && Intrinsics.areEqual(this.category, nbaViewed.category);
        }

        public final int hashCode() {
            int hashCode = this.nextBestActionId.hashCode() * 31;
            String str = this.category;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("NbaViewed(nextBestActionId=", this.nextBestActionId, ", category=", this.category, ")");
        }
    }

    public final class ReloadHome implements MoneybotHomeViewEvent {
        public static final ReloadHome INSTANCE = new ReloadHome();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReloadHome);
        }

        public final int hashCode() {
            return -709543327;
        }

        public final String toString() {
            return "ReloadHome";
        }
    }

    public final class SkipNextBestAction implements MoneybotHomeViewEvent {
        public final String category;
        public final String nextBestActionId;

        public SkipNextBestAction(String str, String str2) {
            this.nextBestActionId = str;
            this.category = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkipNextBestAction)) {
                return false;
            }
            SkipNextBestAction skipNextBestAction = (SkipNextBestAction) obj;
            return this.nextBestActionId.equals(skipNextBestAction.nextBestActionId) && Intrinsics.areEqual(this.category, skipNextBestAction.category);
        }

        public final int hashCode() {
            int hashCode = this.nextBestActionId.hashCode() * 31;
            String str = this.category;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SkipNextBestAction(nextBestActionId=", this.nextBestActionId, ", category=", this.category, ")");
        }
    }

    public final class TabToolbarEvent implements MoneybotHomeViewEvent {
        public final TabToolbarInternalViewEvent tabToolbarEvent;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.tabToolbarEvent = tabToolbarInternalViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.tabToolbarEvent, ((TabToolbarEvent) obj).tabToolbarEvent);
        }

        public final int hashCode() {
            return this.tabToolbarEvent.hashCode();
        }

        public final String toString() {
            return "TabToolbarEvent(tabToolbarEvent=" + this.tabToolbarEvent + ")";
        }
    }

    public interface WidgetTapAction {

        public final class ChatKickoff implements WidgetTapAction {
            public final ChatKickoffParams chatKickoffParams;

            public ChatKickoff(ChatKickoffParams chatKickoffParams) {
                this.chatKickoffParams = chatKickoffParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChatKickoff) && Intrinsics.areEqual(this.chatKickoffParams, ((ChatKickoff) obj).chatKickoffParams);
            }

            public final int hashCode() {
                ChatKickoffParams chatKickoffParams = this.chatKickoffParams;
                if (chatKickoffParams == null) {
                    return 0;
                }
                return chatKickoffParams.hashCode();
            }

            public final String toString() {
                return "ChatKickoff(chatKickoffParams=" + this.chatKickoffParams + ")";
            }
        }

        public final class ClientRoute implements WidgetTapAction {
            public final String clientRoute;

            public ClientRoute(String str) {
                this.clientRoute = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRoute) && this.clientRoute.equals(((ClientRoute) obj).clientRoute);
            }

            public final int hashCode() {
                return this.clientRoute.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(clientRoute=", this.clientRoute, ")");
            }
        }
    }

    public final class WidgetTapped implements MoneybotHomeViewEvent {
        public final WidgetTapAction action;
        public final String widgetId;

        public WidgetTapped(WidgetTapAction widgetTapAction, String str) {
            str.getClass();
            this.action = widgetTapAction;
            this.widgetId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetTapped)) {
                return false;
            }
            WidgetTapped widgetTapped = (WidgetTapped) obj;
            return this.action.equals(widgetTapped.action) && Intrinsics.areEqual(this.widgetId, widgetTapped.widgetId);
        }

        public final int hashCode() {
            return this.widgetId.hashCode() + (this.action.hashCode() * 31);
        }

        public final String toString() {
            return "WidgetTapped(action=" + this.action + ", widgetId=" + this.widgetId + ")";
        }
    }

    public final class WidgetViewed implements MoneybotHomeViewEvent {
        public final String widgetId;

        public WidgetViewed(String str) {
            str.getClass();
            this.widgetId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WidgetViewed) && Intrinsics.areEqual(this.widgetId, ((WidgetViewed) obj).widgetId);
        }

        public final int hashCode() {
            return this.widgetId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WidgetViewed(widgetId=", this.widgetId, ")");
        }
    }
}
