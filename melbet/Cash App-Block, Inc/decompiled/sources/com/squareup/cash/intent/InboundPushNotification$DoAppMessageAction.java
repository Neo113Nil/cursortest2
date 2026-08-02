package com.squareup.cash.intent;

import com.google.maps.android.compose.MapEffectKt;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InboundPushNotification$DoAppMessageAction extends MapEffectKt {
    public final AppMessageAction action;
    public final String analyticsKey;

    public InboundPushNotification$DoAppMessageAction(AppMessageAction appMessageAction, String str) {
        MapsKt__MapsKt.mapOf(new Pair("action_token", appMessageAction.action_identifier), new Pair("analytics_key", str));
        this.action = appMessageAction;
        this.analyticsKey = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundPushNotification$DoAppMessageAction)) {
            return false;
        }
        InboundPushNotification$DoAppMessageAction inboundPushNotification$DoAppMessageAction = (InboundPushNotification$DoAppMessageAction) obj;
        return Intrinsics.areEqual(this.action, inboundPushNotification$DoAppMessageAction.action) && Intrinsics.areEqual(this.analyticsKey, inboundPushNotification$DoAppMessageAction.analyticsKey);
    }

    public final AppMessageAction getAction() {
        return this.action;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.analyticsKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DoAppMessageAction(action=" + this.action + ", analyticsKey=" + this.analyticsKey + ")";
    }
}
