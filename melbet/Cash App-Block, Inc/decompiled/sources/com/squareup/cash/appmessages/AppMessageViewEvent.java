package com.squareup.cash.appmessages;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AppMessageViewEvent {

    public final class AppMessageImageFailedToRender extends AppMessageViewEvent {
        public static final AppMessageImageFailedToRender INSTANCE = new AppMessageImageFailedToRender();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppMessageImageFailedToRender);
        }

        public final int hashCode() {
            return 418414481;
        }

        public final String toString() {
            return "AppMessageImageFailedToRender";
        }
    }

    public final class AppMessageTemporarilyDismiss extends AppMessageViewEvent {
        public final CardAppMessageViewModel.Ready cardMessage;
        public final InlineAppMessageV2ViewModel.Ready inlineMessage;

        public AppMessageTemporarilyDismiss(InlineAppMessageV2ViewModel.Ready ready, CardAppMessageViewModel.Ready ready2, int i) {
            ready = (i & 1) != 0 ? null : ready;
            ready2 = (i & 2) != 0 ? null : ready2;
            this.inlineMessage = ready;
            this.cardMessage = ready2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppMessageTemporarilyDismiss)) {
                return false;
            }
            AppMessageTemporarilyDismiss appMessageTemporarilyDismiss = (AppMessageTemporarilyDismiss) obj;
            return Intrinsics.areEqual(this.inlineMessage, appMessageTemporarilyDismiss.inlineMessage) && Intrinsics.areEqual(this.cardMessage, appMessageTemporarilyDismiss.cardMessage);
        }

        public final int hashCode() {
            InlineAppMessageV2ViewModel.Ready ready = this.inlineMessage;
            int hashCode = (ready == null ? 0 : ready.hashCode()) * 31;
            CardAppMessageViewModel.Ready ready2 = this.cardMessage;
            return hashCode + (ready2 != null ? ready2.hashCode() : 0);
        }

        public final String toString() {
            return "AppMessageTemporarilyDismiss(inlineMessage=" + this.inlineMessage + ", cardMessage=" + this.cardMessage + ")";
        }
    }

    public final class AppMessageUndoDismiss extends AppMessageViewEvent {
        public final String messageToken;

        public AppMessageUndoDismiss(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppMessageUndoDismiss) && Intrinsics.areEqual(this.messageToken, ((AppMessageUndoDismiss) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppMessageUndoDismiss(messageToken=", this.messageToken, ")");
        }
    }

    public final class AppMessageViewed extends AppMessageViewEvent {
        public final String messageToken;

        public AppMessageViewed(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppMessageViewed) && Intrinsics.areEqual(this.messageToken, ((AppMessageViewed) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppMessageViewed(messageToken=", this.messageToken, ")");
        }
    }

    public final class AppMessageActionTaken extends AppMessageViewEvent {
        public final Screen exitScreen;
        public final String messageToken;
        public final boolean shouldDismissMessage;
        public final String url;

        public AppMessageActionTaken(String str, String str2, boolean z, Screen screen) {
            str.getClass();
            this.messageToken = str;
            this.url = str2;
            this.shouldDismissMessage = z;
            this.exitScreen = screen;
        }

        public static AppMessageActionTaken copy$default(AppMessageActionTaken appMessageActionTaken, Screen screen) {
            String str = appMessageActionTaken.messageToken;
            String str2 = appMessageActionTaken.url;
            boolean z = appMessageActionTaken.shouldDismissMessage;
            appMessageActionTaken.getClass();
            str.getClass();
            return new AppMessageActionTaken(str, str2, z, screen);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppMessageActionTaken)) {
                return false;
            }
            AppMessageActionTaken appMessageActionTaken = (AppMessageActionTaken) obj;
            return Intrinsics.areEqual(this.messageToken, appMessageActionTaken.messageToken) && Intrinsics.areEqual(this.url, appMessageActionTaken.url) && this.shouldDismissMessage == appMessageActionTaken.shouldDismissMessage && Intrinsics.areEqual(this.exitScreen, appMessageActionTaken.exitScreen);
        }

        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final String getMessageToken() {
            return this.messageToken;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode = this.messageToken.hashCode() * 31;
            String str = this.url;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.shouldDismissMessage);
            Screen screen = this.exitScreen;
            return m + (screen != null ? screen.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppMessageActionTaken(messageToken=", this.messageToken, ", url=", this.url, ", shouldDismissMessage=");
            m.append(this.shouldDismissMessage);
            m.append(", exitScreen=");
            m.append(this.exitScreen);
            m.append(")");
            return m.toString();
        }

        public /* synthetic */ AppMessageActionTaken(String str, String str2, boolean z, Screen screen, int i) {
            this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : screen);
        }
    }
}
