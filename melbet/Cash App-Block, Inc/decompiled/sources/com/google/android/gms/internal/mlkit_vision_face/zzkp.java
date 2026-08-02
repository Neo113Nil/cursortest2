package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.intent.Source;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class zzkp {
    public static ViewEvent.ContainerView fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new ViewEvent.ContainerView(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ContainerView", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ContainerView", e3);
            return null;
        }
    }

    public static final BlockersData.MoneybotContext moneybotContext(RoutingParams routingParams) {
        routingParams.getClass();
        FeatureContext featureContext = routingParams.featureContext;
        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
        if (moneybotChatContext != null) {
            return new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId);
        }
        return null;
    }

    public static final ScenarioInitiatorType scenarioInitiatorType(RoutingParams routingParams) {
        String str;
        ScenarioInitiatorType scenarioInitiatorType;
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata != null && (str = deepLinkMetadata.deepLinkSource) != null) {
            int ordinal = Source.valueOf(str).ordinal();
            if (ordinal == 0) {
                scenarioInitiatorType = ScenarioInitiatorType.IN_APP_SCANNER;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                scenarioInitiatorType = ScenarioInitiatorType.EXTERNAL;
            }
            if (scenarioInitiatorType != null) {
                return scenarioInitiatorType;
            }
        }
        return ScenarioInitiatorType.EXTERNAL;
    }
}
