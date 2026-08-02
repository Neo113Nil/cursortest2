package com.squareup.cash.moneybot.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.moneybot.backend.api.MoneybotParsingErrorFactory;
import com.squareup.cash.moneybot.backend.api.model.chat.PromptSuggestion;
import com.squareup.cash.moneybot.components.plugins.SuggestionListPlugin;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.Suggestion;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public abstract class PromptSuggestionMappersKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PromptSuggestion toPromptSuggestion(SuggestionListPlugin suggestionListPlugin, Suggestion suggestion) {
        PromptSuggestion.Icon icon;
        PromptSuggestion.Icon image;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        suggestion.getClass();
        MoneybotParsingErrorFactory moneybotParsingErrorFactory = MoneybotParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(suggestion, moneybotParsingErrorFactory, suggestionListPlugin);
            Suggestion.Icon icon2 = suggestion.icon;
            if (icon2 instanceof Suggestion.Icon.Avatar) {
                image = new PromptSuggestion.Icon.Avatar(((Suggestion.Icon.Avatar) icon2).getValue());
            } else {
                if (!(icon2 instanceof Suggestion.Icon.Image)) {
                    if (icon2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    icon = null;
                    str = (String) protoValidationScope.reportIfNullAndContinue("label_text", (String) null, suggestion.label_text);
                    if (str != null && (str2 = (String) protoValidationScope.reportIfNullAndContinue("body_text", (String) null, suggestion.body_text)) != null && (str3 = (String) protoValidationScope.reportIfNullAndContinue("prompt", (String) null, suggestion.prompt)) != null) {
                        str4 = suggestion.campaign_category;
                        if (str4 == null) {
                            str4 = "CAMPAIGN_CATEGORY_UNKNOWN";
                        }
                        String str6 = str4;
                        str5 = suggestion.id;
                        if (str5 == null) {
                            str5 = "";
                        }
                        UUID fromString = UUID.fromString(str5);
                        fromString.getClass();
                        return new PromptSuggestion(str, str2, icon, str3, str6, fromString, suggestion.view_cdf_events, suggestion.tap_cdf_events);
                    }
                    return null;
                }
                image = new PromptSuggestion.Icon.Image(((Suggestion.Icon.Image) icon2).getValue());
            }
            icon = image;
            str = (String) protoValidationScope.reportIfNullAndContinue("label_text", (String) null, suggestion.label_text);
            if (str != null) {
                str4 = suggestion.campaign_category;
                if (str4 == null) {
                }
                String str62 = str4;
                str5 = suggestion.id;
                if (str5 == null) {
                }
                UUID fromString2 = UUID.fromString(str5);
                fromString2.getClass();
                return new PromptSuggestion(str, str2, icon, str3, str62, fromString2, suggestion.view_cdf_events, suggestion.tap_cdf_events);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Suggestion.class), moneybotParsingErrorFactory, null);
        }
    }
}
