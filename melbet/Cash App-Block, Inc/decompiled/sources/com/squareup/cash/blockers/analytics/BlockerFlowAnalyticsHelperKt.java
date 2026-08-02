package com.squareup.cash.blockers.analytics;

import com.squareup.cash.cdf.BlockerAction;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractCancelFlow;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractCompleteFlow;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractReceiveJourneyOutcome;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractTapBlockerAction;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public abstract class BlockerFlowAnalyticsHelperKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.ACTIVATE_PHYSICAL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.DEEP_LINK_ACTIVATE_PHYSICAL_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientScenario.ACTIVATE_PHYSICAL_CARD_FROM_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientScenario.DEPOSIT_CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientScenario.DDA_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BlockerExitStatus.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BlockerExitStatus blockerExitStatus = BlockerExitStatus.CANCELLED;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BlockerExitStatus blockerExitStatus2 = BlockerExitStatus.CANCELLED;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BlockerExitStatus blockerExitStatus3 = BlockerExitStatus.CANCELLED;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final String analyticsName(ClientScenario clientScenario, Flow$Type flow$Type) {
        clientScenario.getClass();
        if (clientScenario != ClientScenario.PLASMA || flow$Type == null) {
            return clientScenario.name();
        }
        return clientScenario.name() + "_" + flow$Type;
    }

    public static final void logEndBlockerFlowEvent(Analytics analytics, String str, BlockerExitStatus blockerExitStatus, List list, String str2, Long l, ClientScenario clientScenario, Flow$Type flow$Type, String str3, BlockerFlowReferrerType blockerFlowReferrerType) {
        list.getClass();
        str2.getClass();
        List list2 = list;
        String joinToString$default = CollectionsKt.joinToString$default(list2, "->", null, null, 0, null, null, 62);
        String joinToString$default2 = CollectionsKt.joinToString$default(CollectionsKt.toList(CollectionsKt.toMutableSet(list2)), "->", null, null, 0, null, null, 62);
        Integer valueOf = l != null ? Integer.valueOf((int) (System.currentTimeMillis() - l.longValue())) : null;
        String str4 = (String) CollectionsKt.lastOrNull(list);
        int ordinal = blockerExitStatus.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                analytics.track(new BlockerFlowInteractCompleteFlow(clientScenario != null ? analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, joinToString$default, valueOf, str2, str4, str, joinToString$default2, str3, blockerFlowReferrerType), null);
                return;
            } else if (ordinal != 2 && ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        analytics.track(new BlockerFlowInteractCancelFlow(clientScenario != null ? analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, valueOf, str2, str4, str, joinToString$default2, str3, blockerFlowReferrerType), null);
    }

    public static final void logReceiveJourneyOutcome(Analytics analytics, ClientScenario clientScenario, Flow$Type flow$Type, String str, List list, String str2, JourneyOutcome journeyOutcome, String str3, boolean z) {
        str.getClass();
        list.getClass();
        analytics.track(new BlockerFlowInteractReceiveJourneyOutcome(clientScenario != null ? analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, Boolean.valueOf(z), str, (String) CollectionsKt.lastOrNull(list), str2, journeyOutcome != null ? journeyOutcome.name() : null, str3), null);
    }

    public static final void trackTapBlockerAction(Analytics analytics, BlockerAction blockerAction, String str, ClientScenario clientScenario, Flow$Type flow$Type, String str2, String str3, String str4, String str5, String str6, BlockerFlowReferrerType blockerFlowReferrerType) {
        String str7;
        str.getClass();
        if (clientScenario == null || (str7 = analyticsName(clientScenario, flow$Type)) == null) {
            str7 = "";
        }
        analytics.track(new BlockerFlowInteractTapBlockerAction(str4, str5, blockerAction, str2, str3, str7, flow$Type != null ? flow$Type.name() : null, str, str6, blockerFlowReferrerType), null);
    }

    public static final FormBlocker.Element.UpsellElement upsellElement(FormBlocker.Element element) {
        FormBlocker.Element.AbstractC0072Element abstractC0072Element = element.element;
        FormBlocker.Element.AbstractC0072Element.UpsellElement upsellElement = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement ? (FormBlocker.Element.AbstractC0072Element.UpsellElement) abstractC0072Element : null;
        if (upsellElement != null) {
            return upsellElement.getValue();
        }
        return null;
    }
}
