package com.squareup.cash.moneta.api.v1_0;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.DigitalWalletType;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.cashsuggest.api.Section;
import com.squareup.protos.cash.cashsuggest.api.TapAction;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.protos.cash.deviceintegritly.api.ValidateAttestationResponse;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.local.client.v1.FeatureSet;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.common.ProductType;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HorizontalAlignment;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplate;
import com.squareup.protos.cash.paymenttemplate.v1.TransactionCategory;
import com.squareup.protos.cash.piggybank.api.v2.BackupWithholdingStatus;
import com.squareup.protos.cash.piggybank.api.v2.GetInterestSettingsResponse;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.piggybank.api.v2.ResolveBNoticeSubmissionStatus;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoalEmoji;
import com.squareup.protos.cash.plasma.callcontext.ForwardedCallContext;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.protos.cash.pools.EnhancedContributionRecord;
import com.squareup.protos.cash.pools.PoolContributionStatus;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.portfolios.HoldingBalanceTick;
import com.squareup.protos.cash.portfolios.model.UnitType;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCryptoCurrency;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes.dex */
public final class CashInRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashInRequest> CREATOR;
    public final Money amount;
    public final CallContext call_context;
    public final DigitalWalletType client_verified_digital_wallet;
    public final String external_client_transfer_token;
    public final String external_id;
    public final ForwardedCallContext forwarded_call_context;
    public final String passcode_token;
    public final RequestContext request_context;
    public final Instrument source;
    public final Instrument target;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable amount;
        public Serializable call_context;
        public Object client_verified_digital_wallet;
        public Object external_client_transfer_token;
        public Serializable external_id;
        public Object forwarded_call_context;
        public Serializable passcode_token;
        public Object request_context;
        public Object source;
        public Object target;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CashInRequest((RequestContext) this.request_context, (String) this.external_id, (Instrument) this.source, (Instrument) this.target, (Money) this.amount, (String) this.passcode_token, (CallContext) this.call_context, (ForwardedCallContext) this.forwarded_call_context, (DigitalWalletType) this.client_verified_digital_wallet, (String) this.external_client_transfer_token, buildUnknownFields());
                case 1:
                    return new CardBlockedBusinessesUIConfig.MerchantRow((String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (CdfEvent) this.request_context, (String) this.source, (CdfEvent) this.target, (LocalizedString) this.amount, (Color) this.call_context, (Avatar) this.forwarded_call_context, (UiAvatar) this.client_verified_digital_wallet, buildUnknownFields());
                case 2:
                    return new Section((String) this.external_id, (Section.Content) this.request_context, (Integer) this.external_client_transfer_token, (Text) this.source, (Text) this.target, (Button) this.amount, (Text) this.call_context, (TapAction) this.forwarded_call_context, (Section.Layout) this.client_verified_digital_wallet, (String) this.passcode_token, buildUnknownFields());
                case 3:
                    return new RecipientSelectorCustomer.Metadata((String) this.external_id, (Integer) this.request_context, (Boolean) this.external_client_transfer_token, (List) this.source, (String) this.passcode_token, (Boolean) this.target, (Boolean) this.amount, (Boolean) this.call_context, (Boolean) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                case 4:
                    return new ValidateAttestationResponse((Long) this.request_context, (Long) this.external_client_transfer_token, (String) this.external_id, (Boolean) this.source, (Boolean) this.target, (Boolean) this.amount, (Boolean) this.call_context, (Boolean) this.forwarded_call_context, (String) this.passcode_token, (PlayIntegrityVerdict) this.client_verified_digital_wallet, buildUnknownFields());
                case 5:
                    return new Automation.AutomationTarget((Automation.AutomationTarget.Type) this.request_context, (String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (String) this.source, (String) this.target, (Color) this.amount, (Color) this.call_context, (String) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
                case 6:
                    return new FullAccount((String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (Avatar) this.request_context, (Boolean) this.source, (String) this.target, (Long) this.amount, (String) this.call_context, (String) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                case 7:
                    return new GetEditorialResponse.EditorialContent.BrandCarousel((LocalBrand) this.request_context, (String) this.external_id, (List) this.source, (String) this.passcode_token, (LocalLocationSummary) this.target, (String) this.external_client_transfer_token, (String) this.amount, (String) this.call_context, (String) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
                case 8:
                    return new GetSuggestedReordersResponse.Reorder((String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (String) this.request_context, (String) this.source, (String) this.target, (LocalImage) this.amount, (String) this.call_context, (LocalActionOrdering.PastOrder) this.forwarded_call_context, (LocalFulfillment) this.client_verified_digital_wallet, buildUnknownFields());
                case 9:
                    return new LocalCheckoutBrandSummary((String) this.external_id, (Boolean) this.request_context, (LocalImage) this.source, (String) this.passcode_token, (LocalColor) this.target, (FeatureSet) this.amount, (String) this.external_client_transfer_token, (LocalColor) this.call_context, (String) this.forwarded_call_context, (LocalCheckoutBrandSummary.AfterPayConfiguration) this.client_verified_digital_wallet, buildUnknownFields());
                case 10:
                    return new InAppMessage((Placement) this.request_context, (zzjx) this.source, (Boolean) this.target, (String) this.external_id, (String) this.passcode_token, (Long) this.amount, (String) this.external_client_transfer_token, (ProductType) this.call_context, (List) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
                case 11:
                    return new ShopInfoHalfSheet((zzkd) this.request_context, (Integer) this.external_id, (HorizontalAlignment) this.passcode_token, (Text) this.external_client_transfer_token, (Text) this.source, (List) this.target, (Button) this.amount, (Text) this.call_context, (ShopInfoHalfSheet.DisplayCriteria) this.forwarded_call_context, (AppLinks) this.client_verified_digital_wallet, buildUnknownFields());
                case 12:
                    return new CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations((Money) this.amount, (Money) this.request_context, (Money) this.external_id, (Money) this.passcode_token, (Money) this.external_client_transfer_token, (Money) this.source, (Money) this.target, (Money) this.call_context, (Money) this.forwarded_call_context, (Money) this.client_verified_digital_wallet, buildUnknownFields());
                case 13:
                    return new PaymentTemplate((String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (String) this.request_context, (String) this.source, (Money) this.amount, (String) this.target, (TransactionCategory) this.call_context, (CreationChannel) this.forwarded_call_context, (Long) this.client_verified_digital_wallet, buildUnknownFields());
                case 14:
                    return new GetInterestSettingsResponse((InterestYieldStatus) this.request_context, (Integer) this.passcode_token, (Integer) this.external_client_transfer_token, (YearMonthDay) this.source, (Boolean) this.target, (GetInterestSettingsResponse.AdditionalEnablementScope) this.amount, (String) this.external_id, (BackupWithholdingStatus) this.call_context, (ResolveBNoticeSubmissionStatus) this.forwarded_call_context, (List) this.client_verified_digital_wallet, buildUnknownFields());
                case 15:
                    return new SavingsGoal((String) this.external_id, (String) this.passcode_token, (Money) this.amount, (SavingsGoal.GoalState) this.request_context, (SavingsGoalEmoji) this.source, (String) this.external_client_transfer_token, (SavingsGoal.GoalSchemaVersion) this.target, (Boolean) this.call_context, (Money) this.forwarded_call_context, (Long) this.client_verified_digital_wallet, buildUnknownFields());
                case 16:
                    return new EnhancedContributionRecord((String) this.external_id, (Long) this.request_context, (Long) this.source, (String) this.passcode_token, (TransactionType) this.target, (PoolContributionStatus) this.amount, (String) this.external_client_transfer_token, (String) this.call_context, (String) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
                case 17:
                    return new HoldingBalanceTick((Long) this.request_context, (Money) this.amount, (Long) this.external_id, (UnitType) this.passcode_token, (Money) this.external_client_transfer_token, (Money) this.source, (Long) this.target, (Money) this.call_context, (Money) this.forwarded_call_context, (Long) this.client_verified_digital_wallet, buildUnknownFields());
                case 18:
                    return new CardModule.UpsellElement((String) this.external_id, (CardModule.InformationSource) this.request_context, (LocalizedString) this.passcode_token, (LocalizedString) this.external_client_transfer_token, (Icon) this.source, (Image) this.target, (CardModule.Button) this.amount, (LocalizedString) this.call_context, (Boolean) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                case 19:
                    return new DisputedTransactionRenderData((DisputedTransactionRenderData.DisputeStatus) this.request_context, (Money) this.amount, (List) this.external_client_transfer_token, (Long) this.source, (Long) this.target, (String) this.external_id, (Boolean) this.call_context, (String) this.passcode_token, (Boolean) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                case 20:
                    return new LendingRenderData.RetroFinancingData((String) this.external_id, (Integer) this.request_context, (Integer) this.passcode_token, (Long) this.external_client_transfer_token, (Long) this.source, (Long) this.target, (Long) this.amount, (Boolean) this.call_context, (Long) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                case 21:
                    return new InitiateInvestmentOrderRequest((RequestContext) this.request_context, (String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (zzea) this.source, (OrderType) this.target, (OrderSide) this.amount, (RecurringSchedule) this.call_context, (CustomOrder) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
                case 22:
                    return new CreditLine.FirstTimeBorrowData((String) this.external_id, (String) this.passcode_token, (String) this.external_client_transfer_token, (List) this.request_context, (String) this.source, (String) this.target, (CreditLine.FirstTimeBorrowData.PromoContent) this.amount, (String) this.call_context, (String) this.forwarded_call_context, (LocalizableString) this.client_verified_digital_wallet, buildUnknownFields());
                case 23:
                    return new UiCryptoCurrency((BitcoinDisplayUnits) this.request_context, (Boolean) this.external_client_transfer_token, (Boolean) this.source, (EnableCryptocurrencyTransferOutStatus) this.target, (String) this.external_id, (EnableCryptocurrencyTransferInStatus) this.amount, (String) this.passcode_token, (Boolean) this.call_context, (Long) this.forwarded_call_context, (Boolean) this.client_verified_digital_wallet, buildUnknownFields());
                default:
                    return new SavingsHome.SavingsOptionsSection.SavingsOptionRow((SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage) this.request_context, (String) this.external_id, (LocalizableString) this.source, (String) this.passcode_token, (LocalizableString) this.target, (SavingsAction) this.amount, (String) this.external_client_transfer_token, (LocalizableString) this.call_context, (CdfEvent) this.forwarded_call_context, (String) this.client_verified_digital_wallet, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashInRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.moneta.api.v1_0.CashInRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CashInRequest((RequestContext) obj3, (String) obj4, (Instrument) obj5, (Instrument) obj6, (Money) obj7, (String) obj8, (CallContext) obj9, (ForwardedCallContext) obj10, (DigitalWalletType) obj11, (String) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                            continue;
                        case 2:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj5);
                            continue;
                        case 4:
                            obj6 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj6);
                            continue;
                        case 5:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                            continue;
                        case 6:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            obj9 = TransactorKt.decodeMessageOrMerge(CallContext.ADAPTER, protoReader, obj9);
                            continue;
                        case 8:
                            obj10 = TransactorKt.decodeMessageOrMerge(ForwardedCallContext.ADAPTER, protoReader, obj10);
                            continue;
                        case 9:
                            try {
                                obj11 = DigitalWalletType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj11;
                                obj2 = obj12;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 10:
                            obj12 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj11;
                            obj2 = obj12;
                            break;
                    }
                    obj12 = obj2;
                    obj11 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                reverseProtoWriter.getClass();
                cashInRequest.getClass();
                reverseProtoWriter.writeBytes(cashInRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, cashInRequest.external_client_transfer_token);
                DigitalWalletType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, cashInRequest.client_verified_digital_wallet);
                ForwardedCallContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, cashInRequest.forwarded_call_context);
                CallContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cashInRequest.call_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashInRequest.passcode_token);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashInRequest.amount);
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, cashInRequest.target);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, cashInRequest.source);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cashInRequest.external_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashInRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, cashInRequest.request_context) + cashInRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, cashInRequest.external_id) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(10, cashInRequest.external_client_transfer_token) + DigitalWalletType.ADAPTER.encodedSizeWithTag(9, cashInRequest.client_verified_digital_wallet) + ForwardedCallContext.ADAPTER.encodedSizeWithTag(8, cashInRequest.forwarded_call_context) + CallContext.ADAPTER.encodedSizeWithTag(7, cashInRequest.call_context) + protoAdapter2.encodedSizeWithTag(6, cashInRequest.passcode_token) + Money.ADAPTER.encodedSizeWithTag(5, cashInRequest.amount) + protoAdapter3.encodedSizeWithTag(4, cashInRequest.target) + protoAdapter3.encodedSizeWithTag(3, cashInRequest.source) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                RequestContext requestContext = cashInRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Instrument instrument = cashInRequest.source;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                Instrument instrument3 = cashInRequest.target;
                Instrument instrument4 = instrument3 != null ? (Instrument) Instrument.ADAPTER.redact(instrument3) : null;
                Money money = cashInRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                CallContext callContext = cashInRequest.call_context;
                CallContext callContext2 = callContext != null ? (CallContext) CallContext.ADAPTER.redact(callContext) : null;
                ForwardedCallContext forwardedCallContext = cashInRequest.forwarded_call_context;
                return CashInRequest.copy$default(cashInRequest, requestContext2, instrument2, instrument4, money2, callContext2, forwardedCallContext != null ? (ForwardedCallContext) ForwardedCallContext.ADAPTER.redact(forwardedCallContext) : null, ByteString.EMPTY, 770);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, cashInRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, cashInRequest.external_id);
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 3, cashInRequest.source);
                protoAdapter3.encodeWithTag(protoWriter, 4, cashInRequest.target);
                Money.ADAPTER.encodeWithTag(protoWriter, 5, cashInRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 6, cashInRequest.passcode_token);
                CallContext.ADAPTER.encodeWithTag(protoWriter, 7, cashInRequest.call_context);
                ForwardedCallContext.ADAPTER.encodeWithTag(protoWriter, 8, cashInRequest.forwarded_call_context);
                DigitalWalletType.ADAPTER.encodeWithTag(protoWriter, 9, cashInRequest.client_verified_digital_wallet);
                protoAdapter2.encodeWithTag(protoWriter, 10, cashInRequest.external_client_transfer_token);
                protoWriter.writeBytes(cashInRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashInRequest(RequestContext requestContext, String str, Instrument instrument, Instrument instrument2, Money money, String str2, CallContext callContext, ForwardedCallContext forwardedCallContext, DigitalWalletType digitalWalletType, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.source = instrument;
        this.target = instrument2;
        this.amount = money;
        this.passcode_token = str2;
        this.call_context = callContext;
        this.forwarded_call_context = forwardedCallContext;
        this.client_verified_digital_wallet = digitalWalletType;
        this.external_client_transfer_token = str3;
    }

    public static CashInRequest copy$default(CashInRequest cashInRequest, RequestContext requestContext, Instrument instrument, Instrument instrument2, Money money, CallContext callContext, ForwardedCallContext forwardedCallContext, ByteString byteString, int i) {
        String str = cashInRequest.external_id;
        if ((i & 4) != 0) {
            instrument = cashInRequest.source;
        }
        Instrument instrument3 = instrument;
        if ((i & 8) != 0) {
            instrument2 = cashInRequest.target;
        }
        Instrument instrument4 = instrument2;
        Money money2 = (i & 16) != 0 ? cashInRequest.amount : money;
        String str2 = (i & 32) != 0 ? cashInRequest.passcode_token : null;
        CallContext callContext2 = (i & 64) != 0 ? cashInRequest.call_context : callContext;
        ForwardedCallContext forwardedCallContext2 = (i & 128) != 0 ? cashInRequest.forwarded_call_context : forwardedCallContext;
        DigitalWalletType digitalWalletType = cashInRequest.client_verified_digital_wallet;
        String str3 = cashInRequest.external_client_transfer_token;
        ByteString unknownFields = (i & 1024) != 0 ? cashInRequest.unknownFields() : byteString;
        cashInRequest.getClass();
        unknownFields.getClass();
        return new CashInRequest(requestContext, str, instrument3, instrument4, money2, str2, callContext2, forwardedCallContext2, digitalWalletType, str3, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashInRequest)) {
            return false;
        }
        CashInRequest cashInRequest = (CashInRequest) obj;
        return Intrinsics.areEqual(unknownFields(), cashInRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, cashInRequest.request_context) && Intrinsics.areEqual(this.external_id, cashInRequest.external_id) && Intrinsics.areEqual(this.source, cashInRequest.source) && Intrinsics.areEqual(this.target, cashInRequest.target) && Intrinsics.areEqual(this.amount, cashInRequest.amount) && Intrinsics.areEqual(this.passcode_token, cashInRequest.passcode_token) && Intrinsics.areEqual(this.call_context, cashInRequest.call_context) && Intrinsics.areEqual(this.forwarded_call_context, cashInRequest.forwarded_call_context) && this.client_verified_digital_wallet == cashInRequest.client_verified_digital_wallet && Intrinsics.areEqual(this.external_client_transfer_token, cashInRequest.external_client_transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.external_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Instrument instrument = this.source;
        int hashCode4 = (hashCode3 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Instrument instrument2 = this.target;
        int hashCode5 = (hashCode4 + (instrument2 != null ? instrument2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CallContext callContext = this.call_context;
        int hashCode8 = (hashCode7 + (callContext != null ? callContext.hashCode() : 0)) * 37;
        ForwardedCallContext forwardedCallContext = this.forwarded_call_context;
        int hashCode9 = (hashCode8 + (forwardedCallContext != null ? forwardedCallContext.hashCode() : 0)) * 37;
        DigitalWalletType digitalWalletType = this.client_verified_digital_wallet;
        int hashCode10 = (hashCode9 + (digitalWalletType != null ? digitalWalletType.hashCode() : 0)) * 37;
        String str3 = this.external_client_transfer_token;
        int hashCode11 = hashCode10 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.external_id = this.external_id;
        builder.source = this.source;
        builder.target = this.target;
        builder.amount = this.amount;
        builder.passcode_token = this.passcode_token;
        builder.call_context = this.call_context;
        builder.forwarded_call_context = this.forwarded_call_context;
        builder.client_verified_digital_wallet = this.client_verified_digital_wallet;
        builder.external_client_transfer_token = this.external_client_transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        Instrument instrument = this.source;
        if (instrument != null) {
            arrayList.add("source=" + instrument);
        }
        Instrument instrument2 = this.target;
        if (instrument2 != null) {
            arrayList.add("target=" + instrument2);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        CallContext callContext = this.call_context;
        if (callContext != null) {
            arrayList.add("call_context=" + callContext);
        }
        ForwardedCallContext forwardedCallContext = this.forwarded_call_context;
        if (forwardedCallContext != null) {
            arrayList.add("forwarded_call_context=" + forwardedCallContext);
        }
        DigitalWalletType digitalWalletType = this.client_verified_digital_wallet;
        if (digitalWalletType != null) {
            arrayList.add("client_verified_digital_wallet=" + digitalWalletType);
        }
        String str2 = this.external_client_transfer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "external_client_transfer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashInRequest{", "}", 0, null, null, 56);
    }
}
