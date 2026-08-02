package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/cryptonauts/api/GetCryptoControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Member$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetCryptoControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCryptoControlsResponse> CREATOR;
    public final CryptoExchangeCustomerControl crypto_exchange_customer_control;
    public final String prerequisite_link;

    static {
        GetCryptoControlsResponse$Companion$ADAPTER$1 getCryptoControlsResponse$Companion$ADAPTER$1 = new GetCryptoControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCryptoControlsResponse.class), "type.googleapis.com/squareup.cash.cryptonauts.api.GetCryptoControlsResponse", Syntax.PROTO_2, null, "squareup/cash/cryptonauts/api/controls.proto");
        ADAPTER = getCryptoControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCryptoControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoControlsResponse(String str, CryptoExchangeCustomerControl cryptoExchangeCustomerControl, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prerequisite_link = str;
        this.crypto_exchange_customer_control = cryptoExchangeCustomerControl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCryptoControlsResponse)) {
            return false;
        }
        GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCryptoControlsResponse.unknownFields()) && Intrinsics.areEqual(this.prerequisite_link, getCryptoControlsResponse.prerequisite_link) && Intrinsics.areEqual(this.crypto_exchange_customer_control, getCryptoControlsResponse.crypto_exchange_customer_control);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prerequisite_link;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = this.crypto_exchange_customer_control;
        int hashCode3 = hashCode2 + (cryptoExchangeCustomerControl != null ? cryptoExchangeCustomerControl.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(12);
        builder.customer_token = this.prerequisite_link;
        builder.sponsorship_tier = this.crypto_exchange_customer_control;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prerequisite_link;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prerequisite_link=", arrayList);
        }
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = this.crypto_exchange_customer_control;
        if (cryptoExchangeCustomerControl != null) {
            arrayList.add("crypto_exchange_customer_control=" + cryptoExchangeCustomerControl);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoControlsResponse{", "}", 0, null, null, 56);
    }
}
