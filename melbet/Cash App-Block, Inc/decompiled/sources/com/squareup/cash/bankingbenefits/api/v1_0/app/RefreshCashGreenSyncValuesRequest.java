package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
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
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RefreshCashGreenSyncValuesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshCashGreenSyncValuesRequest> CREATOR;
    public final RequestContext request_context;
    public final List targets;

    /* loaded from: classes5.dex */
    public enum RefreshTarget implements WireEnum {
        UNSPECIFIED(0),
        CASH_GREEN(1),
        GREEN_BENEFITS(2),
        GREEN_BOOKLET(3);

        public static final RefreshCashGreenSyncValuesRequest$RefreshTarget$Companion$ADAPTER$1 ADAPTER;
        public static final zzb Companion;
        public final int value;

        static {
            RefreshTarget refreshTarget = UNSPECIFIED;
            Companion = new zzb(16);
            ADAPTER = new RefreshCashGreenSyncValuesRequest$RefreshTarget$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RefreshTarget.class), Syntax.PROTO_2, refreshTarget);
        }

        RefreshTarget(int i) {
            this.value = i;
        }

        public static final RefreshTarget fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return CASH_GREEN;
            }
            if (i == 2) {
                return GREEN_BENEFITS;
            }
            if (i != 3) {
                return null;
            }
            return GREEN_BOOKLET;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshCashGreenSyncValuesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest$Companion$ADAPTER$1
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
                        return new RefreshCashGreenSyncValuesRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            RefreshCashGreenSyncValuesRequest.RefreshTarget.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = (RefreshCashGreenSyncValuesRequest) obj;
                reverseProtoWriter.getClass();
                refreshCashGreenSyncValuesRequest.getClass();
                reverseProtoWriter.writeBytes(refreshCashGreenSyncValuesRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, refreshCashGreenSyncValuesRequest.request_context);
                RefreshCashGreenSyncValuesRequest.RefreshTarget.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, refreshCashGreenSyncValuesRequest.targets);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = (RefreshCashGreenSyncValuesRequest) obj;
                refreshCashGreenSyncValuesRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, refreshCashGreenSyncValuesRequest.request_context) + RefreshCashGreenSyncValuesRequest.RefreshTarget.ADAPTER.asRepeated().encodedSizeWithTag(1, refreshCashGreenSyncValuesRequest.targets) + refreshCashGreenSyncValuesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = (RefreshCashGreenSyncValuesRequest) obj;
                refreshCashGreenSyncValuesRequest.getClass();
                RequestContext requestContext = refreshCashGreenSyncValuesRequest.request_context;
                return RefreshCashGreenSyncValuesRequest.copy$default(refreshCashGreenSyncValuesRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = (RefreshCashGreenSyncValuesRequest) obj;
                refreshCashGreenSyncValuesRequest.getClass();
                RefreshCashGreenSyncValuesRequest.RefreshTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, refreshCashGreenSyncValuesRequest.targets);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, refreshCashGreenSyncValuesRequest.request_context);
                protoWriter.writeBytes(refreshCashGreenSyncValuesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCashGreenSyncValuesRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.targets = TransactorKt.immutableCopyOf("targets", list);
    }

    public static RefreshCashGreenSyncValuesRequest copy$default(RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest, RequestContext requestContext, ByteString byteString, int i) {
        List list = refreshCashGreenSyncValuesRequest.targets;
        if ((i & 4) != 0) {
            byteString = refreshCashGreenSyncValuesRequest.unknownFields();
        }
        refreshCashGreenSyncValuesRequest.getClass();
        list.getClass();
        byteString.getClass();
        return new RefreshCashGreenSyncValuesRequest(requestContext, list, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshCashGreenSyncValuesRequest)) {
            return false;
        }
        RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = (RefreshCashGreenSyncValuesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), refreshCashGreenSyncValuesRequest.unknownFields()) && Intrinsics.areEqual(this.targets, refreshCashGreenSyncValuesRequest.targets) && Intrinsics.areEqual(this.request_context, refreshCashGreenSyncValuesRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.targets);
        RequestContext requestContext = this.request_context;
        int hashCode = m + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(1);
        builder.email_addresses = this.targets;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.targets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("targets=", arrayList, list);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshCashGreenSyncValuesRequest{", "}", 0, null, null, 56);
    }

    public RefreshCashGreenSyncValuesRequest(int i, RequestContext requestContext, List list) {
        this((i & 2) != 0 ? null : requestContext, list, ByteString.EMPTY);
    }
}
