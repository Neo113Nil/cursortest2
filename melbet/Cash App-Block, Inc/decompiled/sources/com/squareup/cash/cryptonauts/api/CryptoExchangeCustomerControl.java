package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAppMesssages;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CryptoExchangeCustomerControl extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoExchangeCustomerControl> CREATOR;
    public final Boolean is_enabled;
    public final List limits;

    public final class CryptoExchangeLimit extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CryptoExchangeLimit> CREATOR;
        public final Frequency frequency;
        public final Money max;
        public final Money remaining_usage;

        public enum Frequency implements WireEnum {
            UNSPECIFIED(0),
            WEEKLY(1),
            MONTHLY(2);

            public static final CryptoExchangeCustomerControl$CryptoExchangeLimit$Frequency$Companion$ADAPTER$1 ADAPTER;
            public static final zzb Companion;
            public final int value;

            static {
                Frequency frequency = UNSPECIFIED;
                Companion = new zzb(22);
                ADAPTER = new CryptoExchangeCustomerControl$CryptoExchangeLimit$Frequency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Frequency.class), Syntax.PROTO_2, frequency);
            }

            Frequency(int i) {
                this.value = i;
            }

            public static final Frequency fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return WEEKLY;
                }
                if (i != 2) {
                    return null;
                }
                return MONTHLY;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1 cryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1 = new CryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoExchangeLimit.class), "type.googleapis.com/squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl.CryptoExchangeLimit", Syntax.PROTO_2, null, "squareup/cash/cryptonauts/api/controls.proto");
            ADAPTER = cryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoExchangeLimit(Frequency frequency, Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.frequency = frequency;
            this.max = money;
            this.remaining_usage = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CryptoExchangeLimit)) {
                return false;
            }
            CryptoExchangeLimit cryptoExchangeLimit = (CryptoExchangeLimit) obj;
            return Intrinsics.areEqual(unknownFields(), cryptoExchangeLimit.unknownFields()) && this.frequency == cryptoExchangeLimit.frequency && Intrinsics.areEqual(this.max, cryptoExchangeLimit.max) && Intrinsics.areEqual(this.remaining_usage, cryptoExchangeLimit.remaining_usage);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Frequency frequency = this.frequency;
            int hashCode2 = (hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37;
            Money money = this.max;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.remaining_usage;
            int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(13);
            builder.withdrawalType = this.frequency;
            builder.customer_supplied_amount = this.max;
            builder.customer_token = this.remaining_usage;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Frequency frequency = this.frequency;
            if (frequency != null) {
                arrayList.add("frequency=" + frequency);
            }
            Money money = this.max;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("max=", money, arrayList);
            }
            Money money2 = this.remaining_usage;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("remaining_usage=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoExchangeLimit{", "}", 0, null, null, 56);
        }
    }

    static {
        CryptoExchangeCustomerControl$Companion$ADAPTER$1 cryptoExchangeCustomerControl$Companion$ADAPTER$1 = new CryptoExchangeCustomerControl$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoExchangeCustomerControl.class), "type.googleapis.com/squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl", Syntax.PROTO_2, null, "squareup/cash/cryptonauts/api/controls.proto");
        ADAPTER = cryptoExchangeCustomerControl$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoExchangeCustomerControl$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoExchangeCustomerControl(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.is_enabled = bool;
        this.limits = TransactorKt.immutableCopyOf("limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoExchangeCustomerControl)) {
            return false;
        }
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = (CryptoExchangeCustomerControl) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoExchangeCustomerControl.unknownFields()) && Intrinsics.areEqual(this.is_enabled, cryptoExchangeCustomerControl.is_enabled) && Intrinsics.areEqual(this.limits, cryptoExchangeCustomerControl.limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_enabled;
        int hashCode2 = this.limits.hashCode() + ((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppMesssages.Builder builder = new UiAppMesssages.Builder(1);
        builder.app_message_notifications_enabled = this.is_enabled;
        builder.app_message_tokens = this.limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_enabled=", bool, arrayList);
        }
        List list = this.limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoExchangeCustomerControl{", "}", 0, null, null, 56);
    }
}
