package com.squareup.cash.cryptowallet.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
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
public final class ConfirmBitcoinDepositIntentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmBitcoinDepositIntentRequest> CREATOR;
    public final RequestContext request_context;
    public final String token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmBitcoinDepositIntentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ConfirmBitcoinDepositIntentRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = (ConfirmBitcoinDepositIntentRequest) obj;
                reverseProtoWriter.getClass();
                confirmBitcoinDepositIntentRequest.getClass();
                reverseProtoWriter.writeBytes(confirmBitcoinDepositIntentRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, confirmBitcoinDepositIntentRequest.token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, confirmBitcoinDepositIntentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = (ConfirmBitcoinDepositIntentRequest) obj;
                confirmBitcoinDepositIntentRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, confirmBitcoinDepositIntentRequest.token) + RequestContext.ADAPTER.encodedSizeWithTag(1, confirmBitcoinDepositIntentRequest.request_context) + confirmBitcoinDepositIntentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = (ConfirmBitcoinDepositIntentRequest) obj;
                confirmBitcoinDepositIntentRequest.getClass();
                RequestContext requestContext = confirmBitcoinDepositIntentRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ConfirmBitcoinDepositIntentRequest(requestContext2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = (ConfirmBitcoinDepositIntentRequest) obj;
                confirmBitcoinDepositIntentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, confirmBitcoinDepositIntentRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, confirmBitcoinDepositIntentRequest.token);
                protoWriter.writeBytes(confirmBitcoinDepositIntentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmBitcoinDepositIntentRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmBitcoinDepositIntentRequest)) {
            return false;
        }
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = (ConfirmBitcoinDepositIntentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), confirmBitcoinDepositIntentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, confirmBitcoinDepositIntentRequest.request_context) && Intrinsics.areEqual(this.token, confirmBitcoinDepositIntentRequest.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.action_id = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.token != null) {
            arrayList.add("token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmBitcoinDepositIntentRequest{", "}", 0, null, null, 56);
    }
}
