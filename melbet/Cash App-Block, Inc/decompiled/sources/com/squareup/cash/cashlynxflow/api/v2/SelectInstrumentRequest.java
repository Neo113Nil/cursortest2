package com.squareup.cash.cashlynxflow.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
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
public final class SelectInstrumentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectInstrumentRequest> CREATOR;
    public final ByteString encoded_secondary_selected_option;
    public final ByteString encoded_selected_option;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectInstrumentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectInstrumentRequest((RequestContext) obj, (ByteString) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
                reverseProtoWriter.getClass();
                selectInstrumentRequest.getClass();
                reverseProtoWriter.writeBytes(selectInstrumentRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, selectInstrumentRequest.encoded_secondary_selected_option);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, selectInstrumentRequest.encoded_selected_option);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectInstrumentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
                selectInstrumentRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, selectInstrumentRequest.request_context) + selectInstrumentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                return protoAdapter2.encodedSizeWithTag(3, selectInstrumentRequest.encoded_secondary_selected_option) + protoAdapter2.encodedSizeWithTag(2, selectInstrumentRequest.encoded_selected_option) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
                selectInstrumentRequest.getClass();
                RequestContext requestContext = selectInstrumentRequest.request_context;
                return SelectInstrumentRequest.copy$default(selectInstrumentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
                selectInstrumentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectInstrumentRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(protoWriter, 2, selectInstrumentRequest.encoded_selected_option);
                protoAdapter2.encodeWithTag(protoWriter, 3, selectInstrumentRequest.encoded_secondary_selected_option);
                protoWriter.writeBytes(selectInstrumentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectInstrumentRequest(RequestContext requestContext, ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.request_context = requestContext;
        this.encoded_selected_option = byteString;
        this.encoded_secondary_selected_option = byteString2;
    }

    public static SelectInstrumentRequest copy$default(SelectInstrumentRequest selectInstrumentRequest, RequestContext requestContext, ByteString byteString, int i) {
        ByteString byteString2 = selectInstrumentRequest.encoded_selected_option;
        ByteString byteString3 = selectInstrumentRequest.encoded_secondary_selected_option;
        if ((i & 8) != 0) {
            byteString = selectInstrumentRequest.unknownFields();
        }
        selectInstrumentRequest.getClass();
        byteString.getClass();
        return new SelectInstrumentRequest(requestContext, byteString2, byteString3, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectInstrumentRequest)) {
            return false;
        }
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectInstrumentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectInstrumentRequest.request_context) && Intrinsics.areEqual(this.encoded_selected_option, selectInstrumentRequest.encoded_selected_option) && Intrinsics.areEqual(this.encoded_secondary_selected_option, selectInstrumentRequest.encoded_secondary_selected_option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString = this.encoded_selected_option;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.encoded_secondary_selected_option;
        int hashCode4 = hashCode3 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(6);
        builder.withdrawalType = this.request_context;
        builder.customer_supplied_amount = this.encoded_selected_option;
        builder.customer_token = this.encoded_secondary_selected_option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        ByteString byteString = this.encoded_selected_option;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encoded_selected_option=", byteString, arrayList);
        }
        ByteString byteString2 = this.encoded_secondary_selected_option;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encoded_secondary_selected_option=", byteString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectInstrumentRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SelectInstrumentRequest(RequestContext requestContext, ByteString byteString, ByteString byteString2, int i) {
        this(requestContext, byteString, (i & 4) != 0 ? null : byteString2, ByteString.EMPTY);
    }
}
