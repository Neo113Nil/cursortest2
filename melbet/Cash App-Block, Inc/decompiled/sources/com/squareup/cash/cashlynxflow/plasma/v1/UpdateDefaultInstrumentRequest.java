package com.squareup.cash.cashlynxflow.plasma.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetDateRequest;
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
public final class UpdateDefaultInstrumentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDefaultInstrumentRequest> CREATOR;
    public final Boolean card_art_enabled;
    public final String instrument_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateDefaultInstrumentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentRequest$Companion$ADAPTER$1
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
                        return new UpdateDefaultInstrumentRequest((RequestContext) obj, (Boolean) obj3, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = (UpdateDefaultInstrumentRequest) obj;
                reverseProtoWriter.getClass();
                updateDefaultInstrumentRequest.getClass();
                reverseProtoWriter.writeBytes(updateDefaultInstrumentRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, updateDefaultInstrumentRequest.card_art_enabled);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, updateDefaultInstrumentRequest.instrument_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateDefaultInstrumentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = (UpdateDefaultInstrumentRequest) obj;
                updateDefaultInstrumentRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, updateDefaultInstrumentRequest.card_art_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateDefaultInstrumentRequest.instrument_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, updateDefaultInstrumentRequest.request_context) + updateDefaultInstrumentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = (UpdateDefaultInstrumentRequest) obj;
                updateDefaultInstrumentRequest.getClass();
                RequestContext requestContext = updateDefaultInstrumentRequest.request_context;
                return UpdateDefaultInstrumentRequest.copy$default(updateDefaultInstrumentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = (UpdateDefaultInstrumentRequest) obj;
                updateDefaultInstrumentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, updateDefaultInstrumentRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateDefaultInstrumentRequest.instrument_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateDefaultInstrumentRequest.card_art_enabled);
                protoWriter.writeBytes(updateDefaultInstrumentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDefaultInstrumentRequest(RequestContext requestContext, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.instrument_token = str;
        this.card_art_enabled = bool;
    }

    public static UpdateDefaultInstrumentRequest copy$default(UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = updateDefaultInstrumentRequest.instrument_token;
        Boolean bool = updateDefaultInstrumentRequest.card_art_enabled;
        if ((i & 8) != 0) {
            byteString = updateDefaultInstrumentRequest.unknownFields();
        }
        updateDefaultInstrumentRequest.getClass();
        byteString.getClass();
        return new UpdateDefaultInstrumentRequest(requestContext, bool, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateDefaultInstrumentRequest)) {
            return false;
        }
        UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = (UpdateDefaultInstrumentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateDefaultInstrumentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, updateDefaultInstrumentRequest.request_context) && Intrinsics.areEqual(this.instrument_token, updateDefaultInstrumentRequest.instrument_token) && Intrinsics.areEqual(this.card_art_enabled, updateDefaultInstrumentRequest.card_art_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.card_art_enabled;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetDateRequest.Builder builder = new SetDateRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.date = this.instrument_token;
        builder.disabling_toggle_enabled = this.card_art_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        Boolean bool = this.card_art_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("card_art_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDefaultInstrumentRequest{", "}", 0, null, null, 56);
    }
}
