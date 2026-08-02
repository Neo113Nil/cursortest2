package com.squareup.cash.overdraftly.api.v1_0.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ToggleOverdraftRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ToggleOverdraftRequest> CREATOR;
    public final zzafe action;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ToggleOverdraftRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                zzafe zzafeVar = null;
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ToggleOverdraftRequest(zzafeVar, (RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        zzafeVar = new ToggleOverdraftRequest$Action$Enable((ToggleOverdraftRequest.Enable) ToggleOverdraftRequest.Enable.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        zzafeVar = new ToggleOverdraftRequest$Action$Disable((ToggleOverdraftRequest.Disable) ToggleOverdraftRequest.Disable.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ToggleOverdraftRequest toggleOverdraftRequest = (ToggleOverdraftRequest) obj;
                reverseProtoWriter.getClass();
                toggleOverdraftRequest.getClass();
                reverseProtoWriter.writeBytes(toggleOverdraftRequest.unknownFields());
                zzafe zzafeVar = toggleOverdraftRequest.action;
                if (zzafeVar instanceof ToggleOverdraftRequest$Action$Enable) {
                    ToggleOverdraftRequest.Enable.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ToggleOverdraftRequest$Action$Enable) zzafeVar).value);
                } else if (zzafeVar instanceof ToggleOverdraftRequest$Action$Disable) {
                    ToggleOverdraftRequest.Disable.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ToggleOverdraftRequest$Action$Disable) zzafeVar).value);
                } else if (zzafeVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, toggleOverdraftRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                ToggleOverdraftRequest toggleOverdraftRequest = (ToggleOverdraftRequest) obj;
                toggleOverdraftRequest.getClass();
                int size$okio = toggleOverdraftRequest.unknownFields().getSize$okio();
                zzafe zzafeVar = toggleOverdraftRequest.action;
                if (zzafeVar instanceof ToggleOverdraftRequest$Action$Enable) {
                    encodedSizeWithTag = ToggleOverdraftRequest.Enable.ADAPTER.encodedSizeWithTag(1, ((ToggleOverdraftRequest$Action$Enable) zzafeVar).value);
                } else {
                    if (!(zzafeVar instanceof ToggleOverdraftRequest$Action$Disable)) {
                        if (zzafeVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return RequestContext.ADAPTER.encodedSizeWithTag(3, toggleOverdraftRequest.request_context) + size$okio;
                    }
                    encodedSizeWithTag = ToggleOverdraftRequest.Disable.ADAPTER.encodedSizeWithTag(2, ((ToggleOverdraftRequest$Action$Disable) zzafeVar).value);
                }
                size$okio += encodedSizeWithTag;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, toggleOverdraftRequest.request_context) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ToggleOverdraftRequest toggleOverdraftRequest = (ToggleOverdraftRequest) obj;
                toggleOverdraftRequest.getClass();
                RequestContext requestContext = toggleOverdraftRequest.request_context;
                return ToggleOverdraftRequest.copy$default(toggleOverdraftRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ToggleOverdraftRequest toggleOverdraftRequest = (ToggleOverdraftRequest) obj;
                toggleOverdraftRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, toggleOverdraftRequest.request_context);
                zzafe zzafeVar = toggleOverdraftRequest.action;
                if (zzafeVar instanceof ToggleOverdraftRequest$Action$Enable) {
                    ToggleOverdraftRequest.Enable.ADAPTER.encodeWithTag(protoWriter, 1, ((ToggleOverdraftRequest$Action$Enable) zzafeVar).value);
                } else if (zzafeVar instanceof ToggleOverdraftRequest$Action$Disable) {
                    ToggleOverdraftRequest.Disable.ADAPTER.encodeWithTag(protoWriter, 2, ((ToggleOverdraftRequest$Action$Disable) zzafeVar).value);
                } else if (zzafeVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(toggleOverdraftRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleOverdraftRequest(zzafe zzafeVar, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = zzafeVar;
        this.request_context = requestContext;
    }

    public static ToggleOverdraftRequest copy$default(ToggleOverdraftRequest toggleOverdraftRequest, RequestContext requestContext, ByteString byteString, int i) {
        zzafe zzafeVar = toggleOverdraftRequest.action;
        if ((i & 4) != 0) {
            byteString = toggleOverdraftRequest.unknownFields();
        }
        toggleOverdraftRequest.getClass();
        byteString.getClass();
        return new ToggleOverdraftRequest(zzafeVar, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ToggleOverdraftRequest)) {
            return false;
        }
        ToggleOverdraftRequest toggleOverdraftRequest = (ToggleOverdraftRequest) obj;
        return Intrinsics.areEqual(unknownFields(), toggleOverdraftRequest.unknownFields()) && Intrinsics.areEqual(this.action, toggleOverdraftRequest.action) && Intrinsics.areEqual(this.request_context, toggleOverdraftRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzafe zzafeVar = this.action;
        int hashCode2 = (hashCode + (zzafeVar != null ? zzafeVar.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(24);
        builder.customer_token = this.action;
        builder.sponsorship_tier = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzafe zzafeVar = this.action;
        if (zzafeVar != null) {
            arrayList.add("action=" + zzafeVar);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleOverdraftRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes6.dex */
    public final class Disable extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disable> CREATOR;

        static {
            ToggleOverdraftRequest$Disable$Companion$ADAPTER$1 toggleOverdraftRequest$Disable$Companion$ADAPTER$1 = new ToggleOverdraftRequest$Disable$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disable.class), "type.googleapis.com/squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest.Disable", Syntax.PROTO_2, null, "squareup/cash/overdraftly/api/v1_0/app/ToggleOverdraft.proto");
            ADAPTER = toggleOverdraftRequest$Disable$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleOverdraftRequest$Disable$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disable(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Disable) && Intrinsics.areEqual(unknownFields(), ((Disable) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(9);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Disable{}";
        }

        public /* synthetic */ Disable() {
            this(ByteString.EMPTY);
        }
    }

    /* loaded from: classes6.dex */
    public final class Enable extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Enable> CREATOR;

        static {
            ToggleOverdraftRequest$Enable$Companion$ADAPTER$1 toggleOverdraftRequest$Enable$Companion$ADAPTER$1 = new ToggleOverdraftRequest$Enable$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Enable.class), "type.googleapis.com/squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest.Enable", Syntax.PROTO_2, null, "squareup/cash/overdraftly/api/v1_0/app/ToggleOverdraft.proto");
            ADAPTER = toggleOverdraftRequest$Enable$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleOverdraftRequest$Enable$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enable(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Enable) && Intrinsics.areEqual(unknownFields(), ((Enable) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(10);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Enable{}";
        }

        public /* synthetic */ Enable() {
            this(ByteString.EMPTY);
        }
    }
}
