package com.squareup.cash.merchant.backend.api;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfig;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public abstract class BlockedBusinessesUiConfigMappersKt {
    public static final void isValid(ProtoValidationScope protoValidationScope, UiAvatar uiAvatar) {
        Color color;
        uiAvatar.getClass();
        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(uiAvatar, merchantProtoParsingExceptionFactory, protoValidationScope);
            if (uiAvatar.image != null) {
                if (!Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE) || (color = (Color) protoValidationScope2.reportIfNullAndContinue("background_color", (String) null, uiAvatar.background_color)) == null) {
                    return;
                }
                ProtoValidationScope.required(color.light, "background_color.light");
                protoValidationScope2.reportIfNullAndContinue("background_color.dark", (String) null, color.dark);
                return;
            }
            ProtoValidationScope.required(uiAvatar.monogram_text, "monogram_text");
            Color color2 = (Color) protoValidationScope2.reportIfNullAndContinue("background_color", (String) null, uiAvatar.background_color);
            if (color2 != null) {
                ProtoValidationScope.required(color2.light, "background_color.light");
                protoValidationScope2.reportIfNullAndContinue("background_color.dark", (String) null, color2.dark);
            }
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UiAvatar.class), merchantProtoParsingExceptionFactory, null);
        }
    }

    public static final BlockedBusinessesUiConfig.ErrorMessage toErrorMessage(ProtoValidationScope protoValidationScope, CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog) {
        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(errorMessageDialog, merchantProtoParsingExceptionFactory, protoValidationScope);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(errorMessageDialog.title, "title", (String) null);
            String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(errorMessageDialog.subtitle, "subtitle", (String) null);
            if (reportIfNullAndContinue2 == null) {
                return null;
            }
            return new BlockedBusinessesUiConfig.ErrorMessage(reportIfNullAndContinue, reportIfNullAndContinue2, protoValidationScope2.reportIfNullAndContinue(errorMessageDialog.button_title, "button_title", (String) null));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, errorMessageDialog != null ? Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.ErrorMessageDialog.class) : null, merchantProtoParsingExceptionFactory, null);
        }
    }

    public static final BlockedBusinessesUiConfig.SectionConfig.MerchantRow toMerchantRow(ProtoValidationScope protoValidationScope, CardBlockedBusinessesUIConfig.MerchantRow merchantRow) {
        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(merchantRow, merchantProtoParsingExceptionFactory, protoValidationScope);
            String str = merchantRow.merchant_token;
            ProtoValidationScope.required(str, "merchant_token");
            String str2 = merchantRow.merchant_name;
            ProtoValidationScope.required(str2, "merchant_name");
            UiAvatar uiAvatar = merchantRow.ui_avatar;
            ProtoValidationScope.required(uiAvatar, "ui_avatar");
            isValid(protoValidationScope2, uiAvatar);
            String str3 = merchantRow.row_tap_action_client_route;
            ProtoValidationScope.required(str3, "row_tap_action_client_route");
            String required = ProtoValidationScope.required(merchantRow.button_action_title, "button_action_title");
            Color color = (Color) protoValidationScope2.reportIfNullAndContinue("button_action_title_color", (String) null, merchantRow.button_action_title_color);
            String str4 = merchantRow.button_action_client_route;
            ProtoValidationScope.required(str4, "button_action_client_route");
            return new BlockedBusinessesUiConfig.SectionConfig.MerchantRow(str, str2, uiAvatar, str3, required, color, str4, (CdfEvent) protoValidationScope2.reportIfNullAndContinue("button_action_event", (String) null, merchantRow.button_action_event));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, merchantRow != null ? Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.MerchantRow.class) : null, merchantProtoParsingExceptionFactory, null);
        }
    }

    public static final BlockedBusinessesUiConfig.HelpButton toNavigationItem(ProtoValidationScope protoValidationScope, CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem) {
        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
        try {
            String str = navigationHelpItem.navigation_item_action_client_route;
            ProtoValidationScope.required(str, "navigation_item_action_client_route");
            String required = ProtoValidationScope.required(navigationHelpItem.navigation_item_accessibility_text, "navigation_item_accessibility_text");
            CdfEvent cdfEvent = navigationHelpItem.navigation_item_action_event;
            try {
                ProtoValidationScope.required(cdfEvent, "navigation_item_action_event");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, navigationHelpItem != null ? Reflection.factory.getOrCreateKotlinClass(navigationHelpItem.getClass()) : null, merchantProtoParsingExceptionFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                cdfEvent = null;
            }
            return new BlockedBusinessesUiConfig.HelpButton(str, required, cdfEvent);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, navigationHelpItem != null ? Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.NavigationHelpItem.class) : null, merchantProtoParsingExceptionFactory, null);
        }
    }

    public static final BlockedBusinessesUiConfig.SectionConfig toSection(ProtoValidationScope protoValidationScope, CardBlockedBusinessesUIConfig.SectionConfig sectionConfig) {
        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(sectionConfig, merchantProtoParsingExceptionFactory, protoValidationScope);
            String required = ProtoValidationScope.required(sectionConfig.section_title, "section_title");
            List list = sectionConfig.merchant_rows;
            ProtoValidationScope.required(list, "merchant_rows");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toMerchantRow(protoValidationScope2, (CardBlockedBusinessesUIConfig.MerchantRow) it.next()));
            }
            return new BlockedBusinessesUiConfig.SectionConfig(required, arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, sectionConfig != null ? Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.SectionConfig.class) : null, merchantProtoParsingExceptionFactory, null);
        }
    }
}
