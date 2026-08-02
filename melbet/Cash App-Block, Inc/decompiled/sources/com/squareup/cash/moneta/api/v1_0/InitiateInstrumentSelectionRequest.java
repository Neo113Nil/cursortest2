package com.squareup.cash.moneta.api.v1_0;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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
    public final String preselected_instrument_token;
    public final RequestContext request_context;
    public final Boolean start_in_keypad;
    public final Long transfer_amount;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateInstrumentSelectionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionRequest$Companion$ADAPTER$1
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
                        return new InitiateInstrumentSelectionRequest((String) obj, (Long) obj2, (RequestContext) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                reverseProtoWriter.getClass();
                initiateInstrumentSelectionRequest.getClass();
                reverseProtoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, initiateInstrumentSelectionRequest.start_in_keypad);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, initiateInstrumentSelectionRequest.request_context);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, initiateInstrumentSelectionRequest.transfer_amount);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, initiateInstrumentSelectionRequest.preselected_instrument_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(5, initiateInstrumentSelectionRequest.start_in_keypad) + RequestContext.ADAPTER.encodedSizeWithTag(4, initiateInstrumentSelectionRequest.request_context) + ProtoAdapter.INT64.encodedSizeWithTag(3, initiateInstrumentSelectionRequest.transfer_amount) + ProtoAdapter.STRING.encodedSizeWithTag(2, initiateInstrumentSelectionRequest.preselected_instrument_token) + initiateInstrumentSelectionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                RequestContext requestContext = initiateInstrumentSelectionRequest.request_context;
                return InitiateInstrumentSelectionRequest.copy$default(initiateInstrumentSelectionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 11);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initiateInstrumentSelectionRequest.preselected_instrument_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, initiateInstrumentSelectionRequest.transfer_amount);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, initiateInstrumentSelectionRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, initiateInstrumentSelectionRequest.start_in_keypad);
                protoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInstrumentSelectionRequest(String str, Long l, RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preselected_instrument_token = str;
        this.transfer_amount = l;
        this.request_context = requestContext;
        this.start_in_keypad = bool;
    }

    public static InitiateInstrumentSelectionRequest copy$default(InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = initiateInstrumentSelectionRequest.preselected_instrument_token;
        Long l = initiateInstrumentSelectionRequest.transfer_amount;
        Boolean bool = initiateInstrumentSelectionRequest.start_in_keypad;
        if ((i & 16) != 0) {
            byteString = initiateInstrumentSelectionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateInstrumentSelectionRequest.getClass();
        byteString2.getClass();
        return new InitiateInstrumentSelectionRequest(str, l, requestContext, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateInstrumentSelectionRequest)) {
            return false;
        }
        InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateInstrumentSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.preselected_instrument_token, initiateInstrumentSelectionRequest.preselected_instrument_token) && Intrinsics.areEqual(this.transfer_amount, initiateInstrumentSelectionRequest.transfer_amount) && Intrinsics.areEqual(this.request_context, initiateInstrumentSelectionRequest.request_context) && Intrinsics.areEqual(this.start_in_keypad, initiateInstrumentSelectionRequest.start_in_keypad);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.preselected_instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.transfer_amount;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = (hashCode3 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.start_in_keypad;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(5);
        builder.item_variable = this.preselected_instrument_token;
        builder.collection = this.transfer_amount;
        builder.template = this.request_context;
        builder.source = this.start_in_keypad;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.preselected_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "preselected_instrument_token=", arrayList);
        }
        Long l = this.transfer_amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transfer_amount=", l, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.start_in_keypad;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_in_keypad=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateInstrumentSelectionRequest{", "}", 0, null, null, 56);
    }
}
