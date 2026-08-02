package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.metric.NoValueReason;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzic {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewMoneybotResumeChat.deepLinkSpecs;
    }

    public static String toAttributeValue$dd_sdk_android_rum_release(NoValueReason noValueReason) {
        if (noValueReason == null) {
            return "unknown";
        }
        if (noValueReason instanceof NoValueReason.InteractionToNextView) {
            int ordinal = ((NoValueReason.InteractionToNextView) noValueReason).ordinal();
            if (ordinal == 0) {
                return "disabled";
            }
            if (ordinal == 1) {
                return "no_action";
            }
            if (ordinal == 2) {
                return "no_eligible_action";
            }
            if (ordinal == 3) {
                return "no_previous_view";
            }
            if (ordinal == 4) {
                return "unknown";
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!(noValueReason instanceof NoValueReason.TimeToNetworkSettle)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal2 = ((NoValueReason.TimeToNetworkSettle) noValueReason).ordinal();
        if (ordinal2 == 0) {
            return "no_resources";
        }
        if (ordinal2 == 1) {
            return "no_initial_resources";
        }
        if (ordinal2 == 2) {
            return "not_settled_yet";
        }
        if (ordinal2 == 3) {
            return "unknown";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String toAttributeValue$dd_sdk_android_rum_release(int i) {
        if (i != 0) {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
            if (ordinal == 0) {
                return "disabled";
            }
            if (ordinal == 1) {
                return "time_based_default";
            }
            if (ordinal == 2) {
                return "time_based_custom";
            }
            if (ordinal == 3) {
                return "custom";
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        throw null;
    }
}
