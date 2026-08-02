package com.squareup.cash.mosaic.personalization.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.lynx.api.v1_0.model.StoredValueBalanceDetails;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashstorefronts.api.RewardConstantAmount;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes6.dex */
public final class Entity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Entity> CREATOR;
    public final String entity_token;
    public final Type entity_type;
    public final Entity$SpecificEntity$Payment specific_entity;

    public final class Payment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Payment> CREATOR;
        public final Money amount;

        /* loaded from: classes8.dex */
        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Money amount;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Payment(this.amount, buildUnknownFields());
                    case 1:
                        return new StoredValueBalanceDetails(this.amount, buildUnknownFields());
                    case 2:
                        return new RewardConstantAmount(this.amount, buildUnknownFields());
                    case 3:
                        return new Automation.AllocationStrategy.Fixed(this.amount, buildUnknownFields());
                    case 4:
                        return new SetAmountRequest.AmountResult(this.amount, buildUnknownFields());
                    case 5:
                        return new SubmitFormRequest.ElementResult.MoneyInputResult(this.amount, buildUnknownFields());
                    case 6:
                        return new LoanTransaction.LoanAdjustment(this.amount, buildUnknownFields());
                    case 7:
                        return new LoanTransaction.LoanDrawdown(this.amount, buildUnknownFields());
                    case 8:
                        return new LoanTransaction.LoanRefund(this.amount, buildUnknownFields());
                    case 9:
                        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft(this.amount, buildUnknownFields());
                    case 10:
                        return new GreenBenefitsV1.Benefit.ATMBenefit(this.amount, buildUnknownFields());
                    case 11:
                        return new GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit(this.amount, buildUnknownFields());
                    default:
                        return new SavingsHome.TransfersSection.TransferOutConfig(this.amount, buildUnknownFields());
                }
            }
        }

        static {
            Entity$Payment$Companion$ADAPTER$1 entity$Payment$Companion$ADAPTER$1 = new Entity$Payment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Payment.class), "type.googleapis.com/squareup.cash.mosaic.personalization.api.v1.Entity.Payment", Syntax.PROTO_2, null, "squareup/cash/mosaic/personalization/api/v1/entity.proto");
            ADAPTER = entity$Payment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(entity$Payment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return Intrinsics.areEqual(unknownFields(), payment.unknownFields()) && Intrinsics.areEqual(this.amount, payment.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Payment{", "}", 0, null, null, 56);
        }
    }

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_PAYMENT(1);

        public static final Entity$Type$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new Edge.Companion(4);
            ADAPTER = new Entity$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return TYPE_PAYMENT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Entity$Companion$ADAPTER$1 entity$Companion$ADAPTER$1 = new Entity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Entity.class), "type.googleapis.com/squareup.cash.mosaic.personalization.api.v1.Entity", Syntax.PROTO_2, null, "squareup/cash/mosaic/personalization/api/v1/entity.proto");
        ADAPTER = entity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(entity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Entity(String str, Type type2, Entity$SpecificEntity$Payment entity$SpecificEntity$Payment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_token = str;
        this.entity_type = type2;
        this.specific_entity = entity$SpecificEntity$Payment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entity)) {
            return false;
        }
        Entity entity = (Entity) obj;
        return Intrinsics.areEqual(unknownFields(), entity.unknownFields()) && Intrinsics.areEqual(this.entity_token, entity.entity_token) && this.entity_type == entity.entity_type && Intrinsics.areEqual(this.specific_entity, entity.specific_entity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Type type2 = this.entity_type;
        int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = this.specific_entity;
        int hashCode4 = hashCode3 + (entity$SpecificEntity$Payment != null ? entity$SpecificEntity$Payment.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(22);
        builder.customer_token = this.entity_token;
        builder.withdrawalType = this.entity_type;
        builder.customer_supplied_amount = this.specific_entity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_token=", arrayList);
        }
        Type type2 = this.entity_type;
        if (type2 != null) {
            arrayList.add("entity_type=" + type2);
        }
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = this.specific_entity;
        if (entity$SpecificEntity$Payment != null) {
            arrayList.add("specific_entity=" + entity$SpecificEntity$Payment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Entity{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Entity(String str, Type type2) {
        this(str, type2, null, ByteString.EMPTY);
    }
}
