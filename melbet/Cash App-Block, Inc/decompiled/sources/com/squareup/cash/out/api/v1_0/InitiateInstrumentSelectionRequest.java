package com.squareup.cash.out.api.v1_0;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateInstrumentSelectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateInstrumentSelectionRequest> CREATOR;
    public final Money amount;
    public final DepositPreference deposit_preference;
    public final String preselected_instrument_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateInstrumentSelectionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateInstrumentSelectionRequest((String) obj, (DepositPreference) obj2, (RequestContext) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            obj2 = DepositPreference.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                reverseProtoWriter.getClass();
                initiateInstrumentSelectionRequest.getClass();
                reverseProtoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, initiateInstrumentSelectionRequest.amount);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, initiateInstrumentSelectionRequest.request_context);
                DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiateInstrumentSelectionRequest.deposit_preference);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, initiateInstrumentSelectionRequest.preselected_instrument_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                return Money.ADAPTER.encodedSizeWithTag(5, initiateInstrumentSelectionRequest.amount) + RequestContext.ADAPTER.encodedSizeWithTag(4, initiateInstrumentSelectionRequest.request_context) + DepositPreference.ADAPTER.encodedSizeWithTag(3, initiateInstrumentSelectionRequest.deposit_preference) + ProtoAdapter.STRING.encodedSizeWithTag(2, initiateInstrumentSelectionRequest.preselected_instrument_token) + initiateInstrumentSelectionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                RequestContext requestContext = initiateInstrumentSelectionRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = initiateInstrumentSelectionRequest.amount;
                return InitiateInstrumentSelectionRequest.copy$default(initiateInstrumentSelectionRequest, requestContext2, money != null ? (Money) Money.ADAPTER.redact(money) : null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initiateInstrumentSelectionRequest.preselected_instrument_token);
                DepositPreference.ADAPTER.encodeWithTag(protoWriter, 3, initiateInstrumentSelectionRequest.deposit_preference);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, initiateInstrumentSelectionRequest.request_context);
                Money.ADAPTER.encodeWithTag(protoWriter, 5, initiateInstrumentSelectionRequest.amount);
                protoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInstrumentSelectionRequest(String str, DepositPreference depositPreference, RequestContext requestContext, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preselected_instrument_token = str;
        this.deposit_preference = depositPreference;
        this.request_context = requestContext;
        this.amount = money;
    }

    public static InitiateInstrumentSelectionRequest copy$default(InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, RequestContext requestContext, Money money, ByteString byteString, int i) {
        String str = initiateInstrumentSelectionRequest.preselected_instrument_token;
        DepositPreference depositPreference = initiateInstrumentSelectionRequest.deposit_preference;
        if ((i & 8) != 0) {
            money = initiateInstrumentSelectionRequest.amount;
        }
        Money money2 = money;
        if ((i & 16) != 0) {
            byteString = initiateInstrumentSelectionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateInstrumentSelectionRequest.getClass();
        byteString2.getClass();
        return new InitiateInstrumentSelectionRequest(str, depositPreference, requestContext, money2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateInstrumentSelectionRequest)) {
            return false;
        }
        InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateInstrumentSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.preselected_instrument_token, initiateInstrumentSelectionRequest.preselected_instrument_token) && this.deposit_preference == initiateInstrumentSelectionRequest.deposit_preference && Intrinsics.areEqual(this.request_context, initiateInstrumentSelectionRequest.request_context) && Intrinsics.areEqual(this.amount, initiateInstrumentSelectionRequest.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.preselected_instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode3 = (hashCode2 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = (hashCode3 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(10);
        builder.item_variable = this.preselected_instrument_token;
        builder.collection = this.deposit_preference;
        builder.template = this.request_context;
        builder.source = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.preselected_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "preselected_instrument_token=", arrayList);
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateInstrumentSelectionRequest{", "}", 0, null, null, 56);
    }
}
