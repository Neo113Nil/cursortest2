package com.squareup.cash.devicegrip.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.InviteContactsRequest;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RemoveDevicesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveDevicesRequest> CREATOR;
    public final List hashed_app_tokens;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RemoveDevicesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.devicegrip.service.RemoveDevicesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RemoveDevicesRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RemoveDevicesRequest removeDevicesRequest = (RemoveDevicesRequest) obj;
                reverseProtoWriter.getClass();
                removeDevicesRequest.getClass();
                reverseProtoWriter.writeBytes(removeDevicesRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, removeDevicesRequest.request_context);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, removeDevicesRequest.hashed_app_tokens);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RemoveDevicesRequest removeDevicesRequest = (RemoveDevicesRequest) obj;
                removeDevicesRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, removeDevicesRequest.request_context) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, removeDevicesRequest.hashed_app_tokens) + removeDevicesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RemoveDevicesRequest removeDevicesRequest = (RemoveDevicesRequest) obj;
                removeDevicesRequest.getClass();
                RequestContext requestContext = removeDevicesRequest.request_context;
                return RemoveDevicesRequest.copy$default(removeDevicesRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RemoveDevicesRequest removeDevicesRequest = (RemoveDevicesRequest) obj;
                removeDevicesRequest.getClass();
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, removeDevicesRequest.hashed_app_tokens);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, removeDevicesRequest.request_context);
                protoWriter.writeBytes(removeDevicesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveDevicesRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.hashed_app_tokens = TransactorKt.immutableCopyOf("hashed_app_tokens", list);
    }

    public static RemoveDevicesRequest copy$default(RemoveDevicesRequest removeDevicesRequest, RequestContext requestContext, ByteString byteString, int i) {
        List list = removeDevicesRequest.hashed_app_tokens;
        if ((i & 4) != 0) {
            byteString = removeDevicesRequest.unknownFields();
        }
        removeDevicesRequest.getClass();
        list.getClass();
        byteString.getClass();
        return new RemoveDevicesRequest(requestContext, list, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveDevicesRequest)) {
            return false;
        }
        RemoveDevicesRequest removeDevicesRequest = (RemoveDevicesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), removeDevicesRequest.unknownFields()) && Intrinsics.areEqual(this.hashed_app_tokens, removeDevicesRequest.hashed_app_tokens) && Intrinsics.areEqual(this.request_context, removeDevicesRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.hashed_app_tokens);
        RequestContext requestContext = this.request_context;
        int hashCode = m + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(2);
        builder.email_addresses = this.hashed_app_tokens;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.hashed_app_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hashed_app_tokens=", arrayList, list);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveDevicesRequest{", "}", 0, null, null, 56);
    }

    public RemoveDevicesRequest(List list) {
        this(null, list, ByteString.EMPTY);
    }
}
