package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.ui.draw.RotateKt;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsHome;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightRow;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.InvestmentEntityData;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public abstract class zzahi {
    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }

    public static final PaymentRecipient forPayment(Recipient recipient) {
        recipient.getClass();
        return new PaymentRecipient(recipient.toSendableUiCustomer(), new RedactedString(recipient.displayName), CreditcardTypeValidator.getPaymentInfo(recipient), recipient.customerId != null ? RecipientType.CUSTOMER : recipient.email != null ? RecipientType.EMAIL : recipient.sms != null ? RecipientType.PHONE : RecipientType.UNKNOWN, null);
    }

    public static final SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar toBar(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph.Bar bar) {
        bar.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(bar, spendingInsightsParsingErrorFactory, protoValidationScope);
            String required = ProtoValidationScope.required(bar.header_text, "header_text");
            String required2 = ProtoValidationScope.required(bar.subtitle_text, "subtitle_text");
            String required3 = ProtoValidationScope.required(bar.category_text, "category_text");
            String required4 = ProtoValidationScope.required(bar.category_value, "category_value");
            LocalizedString localizedString = bar.accessibility_text;
            String str = localizedString != null ? localizedString.translated_value : null;
            List list = bar.bar_items;
            ProtoValidationScope.required(list, "bar_items");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toBarItem(protoValidationScope2, (VerticalStackedBarGraph.Bar.BarItem) it.next()));
            }
            return new SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar(required, required2, required3, required4, str, arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.Bar.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar.BarItem toBarItem(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph.Bar.BarItem barItem) {
        barItem.getClass();
        try {
            Color color = barItem.color;
            if (color == null) {
                throw new IllegalArgumentException("color");
            }
            Long l = barItem.value;
            if (l != null) {
                return new SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar.BarItem(color, l.longValue());
            }
            throw new IllegalArgumentException("value");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.Bar.BarItem.class), SpendingInsightsParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final SpendingInsightsHome.EntryPoint toEntryPoint(HasObservability hasObservability, CardSpendingInsightsHome.EntryPoint entryPoint) {
        entryPoint.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(entryPoint, spendingInsightsParsingErrorFactory, hasObservability);
            Boolean bool = (Boolean) protoValidationScope.reportIfNullAndContinue("visible", (String) null, entryPoint.visible);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            LocalizedString localizedString = entryPoint.preview_text;
            String reportIfNullAndContinue = !booleanValue ? localizedString != null ? localizedString.translated_value : null : protoValidationScope.reportIfNullAndContinue(localizedString, "preview_text", (String) null);
            Object obj = entryPoint.client_route;
            if (booleanValue) {
                obj = protoValidationScope.reportIfNullAndContinue("client_route", (String) null, obj);
            }
            return new SpendingInsightsHome.EntryPoint(reportIfNullAndContinue, (String) obj, booleanValue);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.EntryPoint.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsightsHome.InsightsSection.InsightsRow toInsightsRow(ProtoValidationScope protoValidationScope, CardSpendingInsightRow cardSpendingInsightRow) {
        cardSpendingInsightRow.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(cardSpendingInsightRow, spendingInsightsParsingErrorFactory, protoValidationScope);
            CardSpendingInsightRow.RowImage rowImage = (CardSpendingInsightRow.RowImage) protoValidationScope2.reportIfNullAndContinue("image", (String) null, cardSpendingInsightRow.image);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(cardSpendingInsightRow.title, "title", (String) null);
            LocalizedString localizedString = cardSpendingInsightRow.subtitle;
            String str = localizedString != null ? localizedString.translated_value : null;
            String str2 = (String) protoValidationScope2.reportIfNullAndContinue("client_route", (String) null, cardSpendingInsightRow.client_route);
            CdfEvent cdfEvent = (CdfEvent) protoValidationScope2.reportIfNullAndContinue("cdfEvent", (String) null, cardSpendingInsightRow.cdfEvent);
            if (rowImage != null && reportIfNullAndContinue != null && str2 != null) {
                return new SpendingInsightsHome.InsightsSection.InsightsRow(rowImage, reportIfNullAndContinue, str, str2, cdfEvent);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightRow.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsightsHome.InsightsSection toInsightsSection(ProtoValidationScope protoValidationScope, CardSpendingInsightsHome.InsightsSection insightsSection) {
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(insightsSection, spendingInsightsParsingErrorFactory, protoValidationScope);
            List list = insightsSection.spending_insight_rows;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SpendingInsightsHome.InsightsSection.InsightsRow insightsRow = toInsightsRow(protoValidationScope2, (CardSpendingInsightRow) it.next());
                if (insightsRow != null) {
                    arrayList.add(insightsRow);
                }
            }
            return new SpendingInsightsHome.InsightsSection(arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.InsightsSection.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Legend toLegend(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph.GraphLegend graphLegend) {
        graphLegend.getClass();
        List list = graphLegend.categories;
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(graphLegend, spendingInsightsParsingErrorFactory, protoValidationScope);
            if (list.isEmpty()) {
                return null;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(zzahg.toColoredText(protoValidationScope2, (ColoredString) it.next()));
            }
            return new SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Legend(arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.GraphLegend.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final Recipient toRecipient(PaymentRecipient paymentRecipient) {
        paymentRecipient.getClass();
        UiCustomer uiCustomer = paymentRecipient.sendableUiCustomer;
        String str = uiCustomer.full_name;
        Region region = uiCustomer.region;
        Image image = uiCustomer.photo;
        String str2 = uiCustomer.email_address;
        String str3 = uiCustomer.sms_number;
        String str4 = uiCustomer.cashtag;
        String str5 = uiCustomer.id;
        InvestmentEntityData investmentEntityData = uiCustomer.investment_entity_data;
        String str6 = investmentEntityData != null ? investmentEntityData.investment_entity_token : null;
        MerchantData merchantData = uiCustomer.merchant_data;
        RecipientPaymentInfo recipientPaymentInfo = paymentRecipient.paymentInfo;
        return new Recipient(null, false, false, str5, null, str4, Intrinsics.areEqual(uiCustomer.is_cash_customer, Boolean.TRUE), false, recipientPaymentInfo.isBusinessCustomer, str2, str3, image, null, null, false, recipientPaymentInfo.creditCardFeeBps, null, merchantData, false, null, null, region, null, null, str, null, str6, null, false, null, false, false, null, null, -86151017, 63);
    }

    public static final SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph toVerticalStackedBarGraph(ProtoValidationScope protoValidationScope, VerticalStackedBarGraph verticalStackedBarGraph) {
        verticalStackedBarGraph.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(verticalStackedBarGraph, spendingInsightsParsingErrorFactory, protoValidationScope);
            List list = verticalStackedBarGraph.bars;
            ProtoValidationScope.required(list, "bars");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toBar(protoValidationScope2, (VerticalStackedBarGraph.Bar) it.next()));
            }
            VerticalStackedBarGraph.GraphLegend graphLegend = verticalStackedBarGraph.legend;
            ProtoValidationScope.required(graphLegend, "legend");
            return new SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph(arrayList, toLegend(protoValidationScope2, graphLegend));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.class), spendingInsightsParsingErrorFactory, null);
        }
    }
}
