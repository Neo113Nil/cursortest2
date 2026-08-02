package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountPlaidFlowParameters;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.ScheduledReload;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.AuthResultCode;
import com.squareup.cash.lynx.api.v1_0.model.AvsResultCode;
import com.squareup.cash.lynx.api.v1_0.model.CvcResultCode;
import com.squareup.cash.lynx.api.v1_0.model.FailedVerificationReason;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionRequest;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.mosaic.resources.api.v2.GetPersonalizationResourcesResponse;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsResponse;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentRequest;
import com.squareup.protos.cash.aegis.core.ContentSection;
import com.squareup.protos.cash.aegis.core.LinkElement;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.protos.cash.aegis.sync_values.SponsorTileContent;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.blockly.api.AllowlistAction;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.blockstable.api.v1.GetDepositAddressResponse;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Action;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes6.dex */
public final class ForEach extends Message {
    public static final ProtoAdapter ADAPTER = new ForEach$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ForEach.class), "type.googleapis.com/xyz.block.genie.v1.ForEach", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
    public final Expression collection;
    public final String item_variable;
    public final KeyPath source;
    public final Node template;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object collection;
        public Object item_variable;
        public Object source;
        public Object template;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    Expression expression = (Expression) this.collection;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, "collection");
                        throw null;
                    }
                    Node node = (Node) this.template;
                    if (node == null) {
                        TransactorKt.missingRequiredFields(node, "template");
                        throw null;
                    }
                    String str = (String) this.item_variable;
                    if (str != null) {
                        return new ForEach(expression, node, str, (KeyPath) this.source, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "item_variable");
                    throw null;
                case 1:
                    return new BenefitsHub.Insights.Insight.Tooltip((UiAvatar) this.collection, (String) this.item_variable, (List) this.template, (List) this.source, buildUnknownFields());
                case 2:
                    return new LinkBankAccountPlaidFlowParameters((Boolean) this.collection, (Boolean) this.template, (List) this.source, (String) this.item_variable, buildUnknownFields());
                case 3:
                    return new ScheduledReload((Boolean) this.collection, (Money) this.template, (RecurringSchedule) this.item_variable, (Instant) this.source, buildUnknownFields());
                case 4:
                    return new FailedVerificationReason((String) this.item_variable, (AuthResultCode) this.collection, (AvsResultCode) this.template, (CvcResultCode) this.source, buildUnknownFields());
                case 5:
                    return new InitiateInstrumentSelectionRequest((String) this.item_variable, (Long) this.collection, (RequestContext) this.template, (Boolean) this.source, buildUnknownFields());
                case 6:
                    return new ComposePlatform.Button((Expression) this.collection, (Node) this.template, (Action) this.item_variable, (Expression) this.source, buildUnknownFields());
                case 7:
                    Expression expression2 = (Expression) this.collection;
                    Expression expression3 = (Expression) this.template;
                    Expression expression4 = (Expression) this.item_variable;
                    Binding binding = (Binding) this.source;
                    if (binding != null) {
                        return new ComposePlatform.Slider(expression2, expression3, expression4, binding, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(binding, "binding");
                    throw null;
                case 8:
                    Expression expression5 = (Expression) this.collection;
                    if (expression5 == null) {
                        TransactorKt.missingRequiredFields(expression5, "total_label");
                        throw null;
                    }
                    Expression expression6 = (Expression) this.template;
                    if (expression6 == null) {
                        TransactorKt.missingRequiredFields(expression6, "total");
                        throw null;
                    }
                    MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) this.item_variable;
                    if (flow == null) {
                        TransactorKt.missingRequiredFields(flow, "received");
                        throw null;
                    }
                    MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow2 = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) this.source;
                    if (flow2 != null) {
                        return new MoneybotScaffold.Evidence.MerchantCard.Summary(expression5, expression6, flow, flow2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(flow2, "sent");
                    throw null;
                case 9:
                    return new GetPersonalizationResourcesResponse((List) this.collection, (List) this.template, (Music) this.item_variable, (List) this.source, buildUnknownFields());
                case 10:
                    return new com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionRequest((String) this.item_variable, (DepositPreference) this.collection, (RequestContext) this.template, (Money) this.source, buildUnknownFields());
                case 11:
                    return new CashOutInstrumentCapabilityConfig((Long) this.collection, (List) this.template, (List) this.item_variable, (List) this.source, buildUnknownFields());
                case 12:
                    return new CashCreditScoreEntryPointData((List) this.collection, (CashCreditScoreEntryPointData.UninstalledState) this.template, (CashCreditScoreEntryPointData.InstalledState) this.item_variable, (CashCreditScoreEntryPointData.Action) this.source, buildUnknownFields());
                case 13:
                    return new CashCreditScoreHomeData.InfoSection((Boolean) this.collection, (LocalizedString) this.template, (LocalizedString) this.item_variable, (List) this.source, buildUnknownFields());
                case 14:
                    return new CashCreditScoreHomeData.InfoSection.Row((CashCreditScoreHomeData.Action) this.collection, (Icon) this.template, (LocalizedString) this.item_variable, (LocalizedString) this.source, buildUnknownFields());
                case 15:
                    return new CashCreditScoreHomeData.Visualization((Float) this.collection, (Float) this.template, (List) this.item_variable, (CashCreditScoreHomeData.Visualization.ScoreLock) this.source, buildUnknownFields());
                case 16:
                    return new ToggleEntryPointData.CardHeader((LocalizedString) this.collection, (LocalizedString) this.template, (LocalizedString) this.source, (String) this.item_variable, buildUnknownFields());
                case 17:
                    return new FeatureEligibilityRefreshPolicy((Long) this.collection, (Long) this.template, (Long) this.source, (String) this.item_variable, buildUnknownFields());
                case 18:
                    return new AddOrWithdrawMoneyForManagedAccountRequest((String) this.item_variable, (Money) this.collection, (String) this.template, (AddOrWithdrawMoneyForManagedAccountRequest.Action) this.source, buildUnknownFields());
                case 19:
                    return new GetCustomLimitsResponse((String) this.item_variable, (List) this.collection, (List) this.template, (Long) this.source, buildUnknownFields());
                case 20:
                    return new ModifyAllowlistForDependentRequest((String) this.item_variable, (String) this.collection, (AllowlistAction) this.template, (RequestContext) this.source, buildUnknownFields());
                case 21:
                    return new ContentSection((LocalizedString) this.collection, (List) this.template, (Image) this.item_variable, (List) this.source, buildUnknownFields());
                case 22:
                    String str2 = (String) this.item_variable;
                    return new LinkElement((Image) this.source, (LocalizedString) this.collection, str2, (LocalizedString) this.template, buildUnknownFields());
                case 23:
                    return new SafetyEducationHub((LocalizedString) this.collection, (List) this.template, (List) this.item_variable, (List) this.source, buildUnknownFields());
                case 24:
                    return new SponsorTileContent((List) this.collection, (LocalizedString) this.template, (LocalizedString) this.item_variable, (Long) this.source, buildUnknownFields());
                case 25:
                    return new BlocklyCustomerMetadata((String) this.item_variable, (String) this.collection, (String) this.template, (Cashtag) this.source, buildUnknownFields());
                case 26:
                    return new CardBlockedBusinessesUIConfig((String) this.item_variable, (List) this.collection, (CardBlockedBusinessesUIConfig.NavigationHelpItem) this.template, (CardBlockedBusinessesUIConfig.ErrorMessageDialog) this.source, buildUnknownFields());
                case 27:
                    return new GetDepositAddressResponse((String) this.item_variable, (String) this.collection, (String) this.template, (ResponseContext) this.source, buildUnknownFields());
                case 28:
                    return new CardSpendingInsightsConfig.ActivitySection((LocalizedString) this.collection, (List) this.template, (List) this.item_variable, (Integer) this.source, buildUnknownFields());
                default:
                    return new CardSpendingInsightsHome((CardSpendingInsightsHome.EntryPoint) this.collection, (CardSpendingInsightsHome.OverviewSection) this.template, (CardSpendingInsightsHome.InsightsSection) this.item_variable, (CardSpendingInsightsHome.ActivitySection) this.source, buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEach(Expression expression, Node node, String str, KeyPath keyPath, ByteString byteString) {
        super(ADAPTER, byteString);
        expression.getClass();
        node.getClass();
        str.getClass();
        byteString.getClass();
        this.collection = expression;
        this.template = node;
        this.item_variable = str;
        this.source = keyPath;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ForEach)) {
            return false;
        }
        ForEach forEach = (ForEach) obj;
        return Intrinsics.areEqual(unknownFields(), forEach.unknownFields()) && Intrinsics.areEqual(this.collection, forEach.collection) && Intrinsics.areEqual(this.template, forEach.template) && Intrinsics.areEqual(this.item_variable, forEach.item_variable) && Intrinsics.areEqual(this.source, forEach.source);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.template.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.collection, unknownFields().hashCode() * 37, 37)) * 37, 37, this.item_variable);
        KeyPath keyPath = this.source;
        int hashCode = m + (keyPath != null ? keyPath.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.collection = this.collection;
        builder.template = this.template;
        builder.item_variable = this.item_variable;
        builder.source = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Matcher$$ExternalSyntheticOutline0.m("collection=", this.collection, arrayList);
        arrayList.add("template=" + this.template);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.item_variable, "item_variable=", arrayList);
        KeyPath keyPath = this.source;
        if (keyPath != null) {
            arrayList.add("source=" + keyPath);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ForEach{", "}", 0, null, null, 56);
    }
}
