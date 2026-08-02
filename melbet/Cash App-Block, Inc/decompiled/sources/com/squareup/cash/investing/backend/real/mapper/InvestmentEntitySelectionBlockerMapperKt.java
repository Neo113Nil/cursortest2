package com.squareup.cash.investing.backend.real.mapper;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class InvestmentEntitySelectionBlockerMapperKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.values().length];
            try {
                iArr[InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.SHOW_CONFIRM_CTA_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.SHOW_CANCEL_CTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EntitySelectionBlocker.MultiSelectData.MultiSelectConfig toMultiSelectConfig(ProtoValidationScope protoValidationScope, InvestmentEntitySelectionBlocker.MultiSelectionParameters multiSelectionParameters) {
        EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior zeroSelectionBehavior;
        if (multiSelectionParameters == null) {
            return null;
        }
        Integer num = multiSelectionParameters.max_selections;
        ProtoValidationScope.required(num, "max_selections");
        int intValue = num.intValue();
        List<String> list = multiSelectionParameters.selected_investment_entity_tokens;
        ProtoValidationScope.required(list, "selected_investment_entity_tokens");
        List<String> list2 = list;
        String required = ProtoValidationScope.required(multiSelectionParameters.localized_confirm_cta_text, "localized_confirm_cta_text");
        String required2 = ProtoValidationScope.required(multiSelectionParameters.localized_cancel_cta_text, "localized_cancel_cta_text");
        LocalizedString localizedString = multiSelectionParameters.localized_info_text;
        String str = localizedString != null ? localizedString.translated_value : null;
        InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior zeroSelectionBehavior2 = multiSelectionParameters.zero_selection_behavior;
        ProtoValidationScope.required(zeroSelectionBehavior2, "zero_selection_behavior");
        int i = WhenMappings.$EnumSwitchMapping$0[zeroSelectionBehavior2.ordinal()];
        if (i == 1) {
            zeroSelectionBehavior = EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior.ShowConfirmCtaDisabled.INSTANCE;
        } else {
            if (i != 2) {
                throw new ProtoParsingError("ZeroAllocationBehavior", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "zero_selection_behavior", null, null, null, null, 120);
            }
            zeroSelectionBehavior = EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior.ShowCancelCta.INSTANCE;
        }
        return new EntitySelectionBlocker.MultiSelectData.MultiSelectConfig(intValue, list2, required, required2, str, zeroSelectionBehavior);
    }
}
