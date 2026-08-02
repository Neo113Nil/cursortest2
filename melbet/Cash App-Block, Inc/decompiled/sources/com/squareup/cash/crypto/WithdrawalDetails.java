package com.squareup.cash.crypto;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.trifle.protos.api.alpha.SignedData;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction$Action_$ClientRoute;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow;
import com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.ScheduledReload;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.cash.crypto.amount.CryptoCurrency;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.cash.devicegrip.service.UpdateDeviceDetailsRequest;
import com.squareup.cash.lynx.api.v1_0.model.FailedVerificationReason;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.lynx.api.v1_0.model.NotVerifiableReason;
import com.squareup.cash.lynx.api.v1_0.model.VerifyResponse;
import com.squareup.cash.lynx.api.v1_0.model.VerifyResult;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.mosaic.personalization.api.v1.Entity$SpecificEntity$Payment;
import com.squareup.cash.out.api.v1_0.ExecuteCashOutResponse;
import com.squareup.cash.out.api.v1_0.ExecuteCashOutStatus;
import com.squareup.cash.out.core.models.FailureReason;
import com.squareup.cash.out.sync_entity.BankAccountQualifier;
import com.squareup.cash.out.sync_entity.DebitCardQualifier;
import com.squareup.cash.out.sync_entity.PreselectionPriorityItem;
import com.squareup.cash.out.sync_entity.QualifiedCapability;
import com.squareup.cash.out.sync_entity.SupportedFlows;
import com.squareup.cash.out.sync_entity.UnsupportedSpeedAction;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.devicegrip.api.DeviceSyncValue$DeviceType;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class WithdrawalDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WithdrawalDetails> CREATOR;
    public final CryptoAmount customer_supplied_amount;
    public final String customer_token;
    public final BackPressHandlerKt withdrawalType;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object customer_supplied_amount;
        public Object customer_token;
        public Object withdrawalType;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new WithdrawalDetails((BackPressHandlerKt) this.withdrawalType, (CryptoAmount) this.customer_supplied_amount, (String) this.customer_token, buildUnknownFields());
                case 1:
                    return new SignedData.EnvelopedData((Integer) this.withdrawalType, (SignedData.Algorithm) this.customer_supplied_amount, (ByteString) this.customer_token, buildUnknownFields());
                case 2:
                    return new BenefitsHub((String) this.customer_token, (TextRow) this.withdrawalType, (List) this.customer_supplied_amount, buildUnknownFields());
                case 3:
                    return new ButtonRow((String) this.customer_token, (ButtonRow.Prominence) this.withdrawalType, (RowAction) this.customer_supplied_amount, buildUnknownFields());
                case 4:
                    return new RowAction((String) this.customer_token, (RowAction$Action_$ClientRoute) this.withdrawalType, (RowAction.ID) this.customer_supplied_amount, buildUnknownFields());
                case 5:
                    return new BankingBenefitsConfig.ActivitySection((List) this.withdrawalType, (List) this.customer_supplied_amount, (Integer) this.customer_token, buildUnknownFields());
                case 6:
                    return new SelectInstrumentRequest((RequestContext) this.withdrawalType, (ByteString) this.customer_supplied_amount, (ByteString) this.customer_token, buildUnknownFields());
                case 7:
                    return new CashOClockPreference((ScheduledReload) this.withdrawalType, (LocalizedString) this.customer_supplied_amount, (LocalizedString) this.customer_token, buildUnknownFields());
                case 8:
                    return new RecurringSchedule((RecurringSchedule.Frequency) this.withdrawalType, (List) this.customer_supplied_amount, (String) this.customer_token, buildUnknownFields());
                case 9:
                    return new GetNewLineActivationStatusResponse((ResponseContext) this.withdrawalType, (GetNewLineActivationStatusResponse.ActivationStatus) this.customer_supplied_amount, (Integer) this.customer_token, buildUnknownFields());
                case 10:
                    return new MobilePlanHome.Action((String) this.customer_token, (String) this.withdrawalType, (MobilePlanHome.CtaStyle) this.customer_supplied_amount, buildUnknownFields());
                case 11:
                    return new MobilePlanHome((MobilePlanHome.Header) this.withdrawalType, (MobilePlanHome.InfoCards) this.customer_supplied_amount, (List) this.customer_token, buildUnknownFields());
                case 12:
                    Long l = (Long) this.withdrawalType;
                    if (l == null) {
                        TransactorKt.missingRequiredFields(l, "units");
                        throw null;
                    }
                    long longValue = l.longValue();
                    CryptoCurrency cryptoCurrency = (CryptoCurrency) this.customer_supplied_amount;
                    if (cryptoCurrency != null) {
                        return new CryptoAmount(longValue, cryptoCurrency, (Integer) this.customer_token, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(cryptoCurrency, "currency");
                    throw null;
                case 13:
                    return new CryptoExchangeCustomerControl.CryptoExchangeLimit((CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency) this.withdrawalType, (Money) this.customer_supplied_amount, (Money) this.customer_token, buildUnknownFields());
                case 14:
                    return new RemoveDevicesResponse((ResponseContext) this.withdrawalType, (List) this.customer_supplied_amount, (RemoveDevicesResponse.ErrorReason) this.customer_token, buildUnknownFields());
                case 15:
                    return new UpdateDeviceDetailsRequest((String) this.customer_token, (DeviceSyncValue$DeviceType) this.withdrawalType, (String) this.customer_supplied_amount, buildUnknownFields());
                case 16:
                    return new VerifyResponse((VerifyResult) this.withdrawalType, (NotVerifiableReason) this.customer_supplied_amount, (FailedVerificationReason) this.customer_token, buildUnknownFields());
                case 17:
                    Expression expression = (Expression) this.withdrawalType;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, AnnotatedPrivateKey.LABEL);
                        throw null;
                    }
                    List list = (List) this.customer_supplied_amount;
                    Binding binding = (Binding) this.customer_token;
                    if (binding != null) {
                        return new ComposePlatform.DropdownMenu(expression, list, binding, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(binding, "binding");
                    throw null;
                case 18:
                    ComposePlatform.Color color = (ComposePlatform.Color) this.withdrawalType;
                    if (color != null) {
                        return new ComposePlatform.Modifier.Border(color, (Expression) this.customer_supplied_amount, (Expression) this.customer_token, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(color, "color");
                    throw null;
                case 19:
                    Expression expression2 = (Expression) this.withdrawalType;
                    if (expression2 == null) {
                        TransactorKt.missingRequiredFields(expression2, AnnotatedPrivateKey.LABEL);
                        throw null;
                    }
                    Binding binding2 = (Binding) this.customer_supplied_amount;
                    if (binding2 != null) {
                        return new ComposePlatform.TextField(expression2, binding2, (Expression) this.customer_token, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(binding2, "binding");
                    throw null;
                case 20:
                    MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) this.withdrawalType;
                    if (answer == null) {
                        TransactorKt.missingRequiredFields(answer, "answer");
                        throw null;
                    }
                    MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) this.customer_supplied_amount;
                    if (evidence == null) {
                        TransactorKt.missingRequiredFields(evidence, "evidence");
                        throw null;
                    }
                    MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) this.customer_token;
                    if (meaning != null) {
                        return new MoneybotScaffold(answer, evidence, meaning, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(meaning, "meaning");
                    throw null;
                case 21:
                    return new Node.Motion((Expression) this.withdrawalType, (Node.Motion.Transition) this.customer_supplied_amount, (Node.Motion.Transition) this.customer_token, buildUnknownFields());
                case 22:
                    return new Entity((String) this.customer_token, (Entity.Type) this.withdrawalType, (Entity$SpecificEntity$Payment) this.customer_supplied_amount, buildUnknownFields());
                case 23:
                    return new ExecuteCashOutResponse((String) this.customer_token, (ExecuteCashOutStatus) this.withdrawalType, (FailureReason) this.customer_supplied_amount, buildUnknownFields());
                case 24:
                    return new PreselectionPriorityItem((InstrumentType) this.withdrawalType, (DebitCardQualifier) this.customer_supplied_amount, (BankAccountQualifier) this.customer_token, buildUnknownFields());
                case 25:
                    return new QualifiedCapability((List) this.withdrawalType, (DebitCardQualifier) this.customer_supplied_amount, (BankAccountQualifier) this.customer_token, buildUnknownFields());
                case 26:
                    return new UnsupportedSpeedAction((SupportedFlows) this.withdrawalType, (InstrumentType) this.customer_supplied_amount, (String) this.customer_token, buildUnknownFields());
                case 27:
                    return new CashCreditScoreHomeData.Action((String) this.customer_token, (CashCreditScoreHomeData.ScoreSummaryOverlayData) this.withdrawalType, (CashCreditScoreHomeData.RecommendationOverlayData) this.customer_supplied_amount, buildUnknownFields());
                case 28:
                    return new CashCreditScoreHomeData.InfoSection.Callout((CashCreditScoreHomeData.Action) this.withdrawalType, (CashCreditScoreHomeData.Graphic) this.customer_supplied_amount, (LocalizedString) this.customer_token, buildUnknownFields());
                default:
                    return new CashCreditScoreHomeData.InfoSection.InfoItem((CashCreditScoreHomeData.InfoSection.CollapsingItem) this.withdrawalType, (CashCreditScoreHomeData.InfoSection.Row) this.customer_supplied_amount, (CashCreditScoreHomeData.InfoSection.Callout) this.customer_token, buildUnknownFields());
            }
        }
    }

    static {
        WithdrawalDetails$Companion$ADAPTER$1 withdrawalDetails$Companion$ADAPTER$1 = new WithdrawalDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WithdrawalDetails.class), "type.googleapis.com/squareup.cash.crypto.WithdrawalDetails", Syntax.PROTO_2, null, "squareup/cash/crypto/withdrawaldetails.proto");
        ADAPTER = withdrawalDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(withdrawalDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawalDetails(BackPressHandlerKt backPressHandlerKt, CryptoAmount cryptoAmount, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.withdrawalType = backPressHandlerKt;
        this.customer_supplied_amount = cryptoAmount;
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawalDetails)) {
            return false;
        }
        WithdrawalDetails withdrawalDetails = (WithdrawalDetails) obj;
        return Intrinsics.areEqual(unknownFields(), withdrawalDetails.unknownFields()) && Intrinsics.areEqual(this.withdrawalType, withdrawalDetails.withdrawalType) && Intrinsics.areEqual(this.customer_supplied_amount, withdrawalDetails.customer_supplied_amount) && Intrinsics.areEqual(this.customer_token, withdrawalDetails.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BackPressHandlerKt backPressHandlerKt = this.withdrawalType;
        int hashCode2 = (hashCode + (backPressHandlerKt != null ? backPressHandlerKt.hashCode() : 0)) * 37;
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        int hashCode3 = (hashCode2 + (cryptoAmount != null ? cryptoAmount.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.withdrawalType = this.withdrawalType;
        builder.customer_supplied_amount = this.customer_supplied_amount;
        builder.customer_token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BackPressHandlerKt backPressHandlerKt = this.withdrawalType;
        if (backPressHandlerKt != null) {
            arrayList.add("withdrawalType=" + backPressHandlerKt);
        }
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        if (cryptoAmount != null) {
            arrayList.add("customer_supplied_amount=" + cryptoAmount);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WithdrawalDetails{", "}", 0, null, null, 56);
    }
}
