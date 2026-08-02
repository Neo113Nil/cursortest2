package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/cryptonauts/api/SetCryptoControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "CryptoExchangeCustomerControl", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetCryptoControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCryptoControlsResponse> CREATOR;
    public final SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl customer_control;

    static {
        SetCryptoControlsResponse$Companion$ADAPTER$1 setCryptoControlsResponse$Companion$ADAPTER$1 = new SetCryptoControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetCryptoControlsResponse.class), "type.googleapis.com/squareup.cash.cryptonauts.api.SetCryptoControlsResponse", Syntax.PROTO_2, null, "squareup/cash/cryptonauts/api/controls.proto");
        ADAPTER = setCryptoControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setCryptoControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCryptoControlsResponse(SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_control = setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCryptoControlsResponse)) {
            return false;
        }
        SetCryptoControlsResponse setCryptoControlsResponse = (SetCryptoControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setCryptoControlsResponse.unknownFields()) && Intrinsics.areEqual(this.customer_control, setCryptoControlsResponse.customer_control);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = this.customer_control;
        int hashCode2 = hashCode + (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null ? setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(7);
        builder.f1245type = this.customer_control;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = this.customer_control;
        if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null) {
            arrayList.add("customer_control=" + setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCryptoControlsResponse{", "}", 0, null, null, 56);
    }
}
