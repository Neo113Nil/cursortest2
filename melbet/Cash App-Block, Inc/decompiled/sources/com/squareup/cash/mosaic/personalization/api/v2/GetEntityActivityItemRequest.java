package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.mosaic.personalization.api.v2.MarkViewedRequest;
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
public final class GetEntityActivityItemRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEntityActivityItemRequest> CREATOR;
    public final Entity entity;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetEntityActivityItemRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.mosaic.personalization.api.v2.GetEntityActivityItemRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetEntityActivityItemRequest((Entity) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Entity.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetEntityActivityItemRequest getEntityActivityItemRequest = (GetEntityActivityItemRequest) obj;
                reverseProtoWriter.getClass();
                getEntityActivityItemRequest.getClass();
                reverseProtoWriter.writeBytes(getEntityActivityItemRequest.unknownFields());
                Entity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getEntityActivityItemRequest.entity);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetEntityActivityItemRequest getEntityActivityItemRequest = (GetEntityActivityItemRequest) obj;
                getEntityActivityItemRequest.getClass();
                return Entity.ADAPTER.encodedSizeWithTag(1, getEntityActivityItemRequest.entity) + getEntityActivityItemRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetEntityActivityItemRequest getEntityActivityItemRequest = (GetEntityActivityItemRequest) obj;
                getEntityActivityItemRequest.getClass();
                Entity entity = getEntityActivityItemRequest.entity;
                Entity entity2 = entity != null ? (Entity) Entity.ADAPTER.redact(entity) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetEntityActivityItemRequest(entity2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetEntityActivityItemRequest getEntityActivityItemRequest = (GetEntityActivityItemRequest) obj;
                getEntityActivityItemRequest.getClass();
                Entity.ADAPTER.encodeWithTag(protoWriter, 1, getEntityActivityItemRequest.entity);
                protoWriter.writeBytes(getEntityActivityItemRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEntityActivityItemRequest(Entity entity, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity = entity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEntityActivityItemRequest)) {
            return false;
        }
        GetEntityActivityItemRequest getEntityActivityItemRequest = (GetEntityActivityItemRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEntityActivityItemRequest.unknownFields()) && Intrinsics.areEqual(this.entity, getEntityActivityItemRequest.entity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Entity entity = this.entity;
        int hashCode2 = hashCode + (entity != null ? entity.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MarkViewedRequest.Builder builder = new MarkViewedRequest.Builder(1);
        builder.entity = this.entity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Entity entity = this.entity;
        if (entity != null) {
            arrayList.add("entity=" + entity);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEntityActivityItemRequest{", "}", 0, null, null, 56);
    }
}
