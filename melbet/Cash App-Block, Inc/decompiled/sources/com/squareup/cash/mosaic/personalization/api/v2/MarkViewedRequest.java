package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
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
public final class MarkViewedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarkViewedRequest> CREATOR;
    public final Entity entity;

    /* loaded from: classes6.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Entity entity;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new MarkViewedRequest(this.entity, buildUnknownFields());
                default:
                    return new GetEntityActivityItemRequest(this.entity, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MarkViewedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.mosaic.personalization.api.v2.MarkViewedRequest$Companion$ADAPTER$1
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
                        return new MarkViewedRequest((Entity) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                MarkViewedRequest markViewedRequest = (MarkViewedRequest) obj;
                reverseProtoWriter.getClass();
                markViewedRequest.getClass();
                reverseProtoWriter.writeBytes(markViewedRequest.unknownFields());
                Entity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, markViewedRequest.entity);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                MarkViewedRequest markViewedRequest = (MarkViewedRequest) obj;
                markViewedRequest.getClass();
                return Entity.ADAPTER.encodedSizeWithTag(1, markViewedRequest.entity) + markViewedRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                MarkViewedRequest markViewedRequest = (MarkViewedRequest) obj;
                markViewedRequest.getClass();
                Entity entity = markViewedRequest.entity;
                Entity entity2 = entity != null ? (Entity) Entity.ADAPTER.redact(entity) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new MarkViewedRequest(entity2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                MarkViewedRequest markViewedRequest = (MarkViewedRequest) obj;
                markViewedRequest.getClass();
                Entity.ADAPTER.encodeWithTag(protoWriter, 1, markViewedRequest.entity);
                protoWriter.writeBytes(markViewedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkViewedRequest(Entity entity, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity = entity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarkViewedRequest)) {
            return false;
        }
        MarkViewedRequest markViewedRequest = (MarkViewedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), markViewedRequest.unknownFields()) && Intrinsics.areEqual(this.entity, markViewedRequest.entity);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarkViewedRequest{", "}", 0, null, null, 56);
    }
}
