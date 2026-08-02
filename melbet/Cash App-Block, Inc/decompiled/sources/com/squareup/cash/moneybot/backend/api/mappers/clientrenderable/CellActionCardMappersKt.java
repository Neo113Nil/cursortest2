package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.CellActionCard;
import com.squareup.cash.moneybot.components.plugins.CellActionCardPlugin;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import kotlin.jvm.internal.Reflection;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes7.dex */
public abstract class CellActionCardMappersKt {
    public static CellActionCard toCellActionCard$default(CellActionCardPlugin cellActionCardPlugin, com.squareup.protos.cash.kgoose.api.v3.CellActionCard cellActionCard, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(cellActionCard, patternRedaction, cellActionCardPlugin);
            CellDefault cellDefault = cellActionCard.cell;
            ProtoValidationScope.required(cellDefault, "cell");
            ActionCard.CardButtons cardButtons = cellActionCard.card_buttons;
            return new CellActionCard(str, cellDefault, cardButtons != null ? CommonMappersKt.toButtons(protoValidationScope, cardButtons, patternRedaction) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.CellActionCard.class), patternRedaction, null);
        }
    }
}
