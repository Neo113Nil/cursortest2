package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ChatCardViewEvent {

    public final class LaunchClientRoute implements ChatCardViewEvent {
        public final String clientRoute;
        public final String requestId;

        public LaunchClientRoute(String str, String str2) {
            this.requestId = str;
            this.clientRoute = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchClientRoute)) {
                return false;
            }
            LaunchClientRoute launchClientRoute = (LaunchClientRoute) obj;
            return Intrinsics.areEqual(this.requestId, launchClientRoute.requestId) && this.clientRoute.equals(launchClientRoute.clientRoute);
        }

        public final int hashCode() {
            String str = this.requestId;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 961, this.clientRoute);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LaunchClientRoute(requestId=", this.requestId, ", clientRoute=", this.clientRoute, ", hiddenMessage=null, cdfEvent=null)");
        }
    }

    public final class ViewAllActivity implements ChatCardViewEvent {
        public static final ViewAllActivity INSTANCE = new ViewAllActivity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewAllActivity);
        }

        public final int hashCode() {
            return 1379091518;
        }

        public final String toString() {
            return "ViewAllActivity";
        }
    }
}
