package com.squareup.cash.moneta.plasma;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidThenRedirectFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkBankAccountPlaidThenRedirectFlowParameters> CREATOR;
    public final BitcoinBuyClientRouteContext bitcoin_buy_client_route_context;

    public final class BitcoinBuyClientRouteContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BitcoinBuyClientRouteContext> CREATOR;
        public final Money amount;
        public final String previous_instrument_token;

        static {
            LinkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1 linkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1 = new LinkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinBuyClientRouteContext.class), "type.googleapis.com/squareup.cash.moneta.service.LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext", Syntax.PROTO_2, null, "squareup/cash/moneta/plasma/plasma.proto");
            ADAPTER = linkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(linkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BitcoinBuyClientRouteContext(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
            this.previous_instrument_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BitcoinBuyClientRouteContext)) {
                return false;
            }
            BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = (BitcoinBuyClientRouteContext) obj;
            return Intrinsics.areEqual(unknownFields(), bitcoinBuyClientRouteContext.unknownFields()) && Intrinsics.areEqual(this.amount, bitcoinBuyClientRouteContext.amount) && Intrinsics.areEqual(this.previous_instrument_token, bitcoinBuyClientRouteContext.previous_instrument_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.previous_instrument_token;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceImpact.Builder builder = new BalanceImpact.Builder(1);
            builder.amount = this.amount;
            builder.balance_name = this.previous_instrument_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            String str = this.previous_instrument_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "previous_instrument_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinBuyClientRouteContext{", "}", 0, null, null, 56);
        }
    }

    static {
        LinkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1 linkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1 = new LinkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkBankAccountPlaidThenRedirectFlowParameters.class), "type.googleapis.com/squareup.cash.moneta.service.LinkBankAccountPlaidThenRedirectFlowParameters", Syntax.PROTO_2, null, "squareup/cash/moneta/plasma/plasma.proto");
        ADAPTER = linkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBankAccountPlaidThenRedirectFlowParameters(BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bitcoin_buy_client_route_context = bitcoinBuyClientRouteContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkBankAccountPlaidThenRedirectFlowParameters)) {
            return false;
        }
        LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = (LinkBankAccountPlaidThenRedirectFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), linkBankAccountPlaidThenRedirectFlowParameters.unknownFields()) && Intrinsics.areEqual(this.bitcoin_buy_client_route_context, linkBankAccountPlaidThenRedirectFlowParameters.bitcoin_buy_client_route_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = this.bitcoin_buy_client_route_context;
        int hashCode2 = hashCode + (bitcoinBuyClientRouteContext != null ? bitcoinBuyClientRouteContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(10);
        builder.f1245type = this.bitcoin_buy_client_route_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = this.bitcoin_buy_client_route_context;
        if (bitcoinBuyClientRouteContext != null) {
            arrayList.add("bitcoin_buy_client_route_context=" + bitcoinBuyClientRouteContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkBankAccountPlaidThenRedirectFlowParameters{", "}", 0, null, null, 56);
    }
}
