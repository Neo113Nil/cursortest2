package com.squareup.cash.moneybot.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.model.chat.NextBestAction;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.NextBestAction;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public abstract class NextBestActionMappersKt {
    public static final NextBestAction.Cta toCta(ProtoValidationScope protoValidationScope, NextBestAction.CtaTapAction ctaTapAction, PatternRedaction patternRedaction, String str) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            if (str != null) {
                String str2 = ctaTapAction.client_route_url;
                if (str2 == null) {
                    try {
                        throw new IllegalArgumentException("client_route_url");
                    } catch (Exception e) {
                        hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(NextBestAction.CtaTapAction.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    return new NextBestAction.Cta(str, str2);
                }
            }
            return null;
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(NextBestAction.CtaTapAction.class), patternRedaction, null);
        }
    }
}
