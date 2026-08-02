package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CellActionCardViewEvent {

    public final class LaunchClientRoute implements CellActionCardViewEvent {
        public final String clientRoute;
        public final String hiddenMessage;
        public final String requestId;

        public LaunchClientRoute(String str, String str2, String str3) {
            this.requestId = str;
            this.clientRoute = str2;
            this.hiddenMessage = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchClientRoute)) {
                return false;
            }
            LaunchClientRoute launchClientRoute = (LaunchClientRoute) obj;
            return Intrinsics.areEqual(this.requestId, launchClientRoute.requestId) && this.clientRoute.equals(launchClientRoute.clientRoute) && Intrinsics.areEqual(this.hiddenMessage, launchClientRoute.hiddenMessage);
        }

        public final int hashCode() {
            String str = this.requestId;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.clientRoute);
            String str2 = this.hiddenMessage;
            return (m + (str2 != null ? str2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LaunchClientRoute(requestId=", this.requestId, ", clientRoute=", this.clientRoute, ", hiddenMessage="), this.hiddenMessage, ", cdfEvent=null)");
        }
    }

    public final class SendHiddenMessage implements CellActionCardViewEvent {
        public final String hiddenMessage;
        public final String requestId;

        public SendHiddenMessage(String str, String str2) {
            str2.getClass();
            this.requestId = str;
            this.hiddenMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendHiddenMessage)) {
                return false;
            }
            SendHiddenMessage sendHiddenMessage = (SendHiddenMessage) obj;
            return Intrinsics.areEqual(this.requestId, sendHiddenMessage.requestId) && Intrinsics.areEqual(this.hiddenMessage, sendHiddenMessage.hiddenMessage);
        }

        public final int hashCode() {
            String str = this.requestId;
            return this.hiddenMessage.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SendHiddenMessage(requestId=", this.requestId, ", hiddenMessage=", this.hiddenMessage, ")");
        }
    }
}
