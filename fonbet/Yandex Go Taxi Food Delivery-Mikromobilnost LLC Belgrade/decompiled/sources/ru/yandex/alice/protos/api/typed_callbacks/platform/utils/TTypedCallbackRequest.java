package ru.yandex.alice.protos.api.typed_callbacks.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TOrigin;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams;
import ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016JL\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest;", "Lcom/squareup/wire/Message;", "", "TypedCallbackSerialized", "Lokio/ByteString;", "TypedCallbackStruct", "Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest$TStructSerialization;", "Analytics", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;", "Origin", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;", "RequestParams", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;", "unknownFields", "<init>", "(Lokio/ByteString;Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest$TStructSerialization;Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;Lokio/ByteString;)V", "getTypedCallbackSerialized$annotations", "()V", "getTypedCallbackSerialized", "()Lokio/ByteString;", "getTypedCallbackStruct$annotations", "getTypedCallbackStruct", "()Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest$TStructSerialization;", "getAnalytics$annotations", "getAnalytics", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;", "getOrigin$annotations", "getOrigin", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;", "getRequestParams$annotations", "getRequestParams", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TStructSerialization", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TTypedCallbackRequest extends Message {
    public static final ProtoAdapter<TTypedCallbackRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule#ADAPTER", jsonName = "analytics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final TAnalyticsTrackingModule Analytics;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TOrigin#ADAPTER", jsonName = "origin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final TOrigin Origin;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams#ADAPTER", jsonName = "request_params", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final TRequestParams RequestParams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "typed_callback_serialized", oneofName = "CallbackPayload", schemaIndex = 0, tag = 1)
    private final ByteString TypedCallbackSerialized;

    @WireField(adapter = "ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest$TStructSerialization#ADAPTER", jsonName = "typed_callback_struct", oneofName = "CallbackPayload", schemaIndex = 1, tag = 6)
    private final TStructSerialization TypedCallbackStruct;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TTypedCallbackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TTypedCallbackRequest>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TTypedCallbackRequest decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                ByteString byteString = null;
                TTypedCallbackRequest.TStructSerialization tStructSerialization = null;
                TAnalyticsTrackingModule tAnalyticsTrackingModule = null;
                TOrigin tOrigin = null;
                TRequestParams tRequestParams = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TTypedCallbackRequest(byteString, tStructSerialization, tAnalyticsTrackingModule, tOrigin, tRequestParams, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        byteString = ProtoAdapter.BYTES.decode(reader);
                    } else if (nextTag == 2) {
                        tAnalyticsTrackingModule = TAnalyticsTrackingModule.ADAPTER.decode(reader);
                    } else if (nextTag == 3) {
                        tOrigin = TOrigin.ADAPTER.decode(reader);
                    } else if (nextTag == 4) {
                        tRequestParams = TRequestParams.ADAPTER.decode(reader);
                    } else if (nextTag != 6) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tStructSerialization = TTypedCallbackRequest.TStructSerialization.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TTypedCallbackRequest value) {
                if (value.getAnalytics() != null) {
                    TAnalyticsTrackingModule.ADAPTER.encodeWithTag(writer, 2, (int) value.getAnalytics());
                }
                if (value.getOrigin() != null) {
                    TOrigin.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrigin());
                }
                if (value.getRequestParams() != null) {
                    TRequestParams.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequestParams());
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTypedCallbackSerialized());
                TTypedCallbackRequest.TStructSerialization.ADAPTER.encodeWithTag(writer, 6, (int) value.getTypedCallbackStruct());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TTypedCallbackRequest value) {
                int encodedSizeWithTag = TTypedCallbackRequest.TStructSerialization.ADAPTER.encodedSizeWithTag(6, value.getTypedCallbackStruct()) + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getTypedCallbackSerialized()) + value.unknownFields().h();
                if (value.getAnalytics() != null) {
                    encodedSizeWithTag += TAnalyticsTrackingModule.ADAPTER.encodedSizeWithTag(2, value.getAnalytics());
                }
                if (value.getOrigin() != null) {
                    encodedSizeWithTag += TOrigin.ADAPTER.encodedSizeWithTag(3, value.getOrigin());
                }
                return value.getRequestParams() != null ? TRequestParams.ADAPTER.encodedSizeWithTag(4, value.getRequestParams()) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TTypedCallbackRequest redact(TTypedCallbackRequest value) {
                TTypedCallbackRequest.TStructSerialization typedCallbackStruct = value.getTypedCallbackStruct();
                TTypedCallbackRequest.TStructSerialization redact = typedCallbackStruct != null ? TTypedCallbackRequest.TStructSerialization.ADAPTER.redact(typedCallbackStruct) : null;
                TAnalyticsTrackingModule analytics = value.getAnalytics();
                TAnalyticsTrackingModule redact2 = analytics != null ? TAnalyticsTrackingModule.ADAPTER.redact(analytics) : null;
                TOrigin origin = value.getOrigin();
                TOrigin redact3 = origin != null ? TOrigin.ADAPTER.redact(origin) : null;
                TRequestParams requestParams = value.getRequestParams();
                return TTypedCallbackRequest.copy$default(value, null, redact, redact2, redact3, requestParams != null ? TRequestParams.ADAPTER.redact(requestParams) : null, ByteString.c, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TTypedCallbackRequest value) {
                writer.writeBytes(value.unknownFields());
                TTypedCallbackRequest.TStructSerialization.ADAPTER.encodeWithTag(writer, 6, (int) value.getTypedCallbackStruct());
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTypedCallbackSerialized());
                if (value.getRequestParams() != null) {
                    TRequestParams.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequestParams());
                }
                if (value.getOrigin() != null) {
                    TOrigin.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrigin());
                }
                if (value.getAnalytics() != null) {
                    TAnalyticsTrackingModule.ADAPTER.encodeWithTag(writer, 2, (int) value.getAnalytics());
                }
            }
        };
    }

    public /* synthetic */ TTypedCallbackRequest(ByteString byteString, TStructSerialization tStructSerialization, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : byteString, (i & 2) != 0 ? null : tStructSerialization, (i & 4) != 0 ? null : tAnalyticsTrackingModule, (i & 8) != 0 ? null : tOrigin, (i & 16) != 0 ? null : tRequestParams, (i & 32) != 0 ? ByteString.c : byteString2);
    }

    public static /* synthetic */ TTypedCallbackRequest copy$default(TTypedCallbackRequest tTypedCallbackRequest, ByteString byteString, TStructSerialization tStructSerialization, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tTypedCallbackRequest.TypedCallbackSerialized;
        }
        if ((i & 2) != 0) {
            tStructSerialization = tTypedCallbackRequest.TypedCallbackStruct;
        }
        if ((i & 4) != 0) {
            tAnalyticsTrackingModule = tTypedCallbackRequest.Analytics;
        }
        if ((i & 8) != 0) {
            tOrigin = tTypedCallbackRequest.Origin;
        }
        if ((i & 16) != 0) {
            tRequestParams = tTypedCallbackRequest.RequestParams;
        }
        if ((i & 32) != 0) {
            byteString2 = tTypedCallbackRequest.unknownFields();
        }
        TRequestParams tRequestParams2 = tRequestParams;
        ByteString byteString3 = byteString2;
        return tTypedCallbackRequest.copy(byteString, tStructSerialization, tAnalyticsTrackingModule, tOrigin, tRequestParams2, byteString3);
    }

    @ColumnNameOption("analytics")
    public static /* synthetic */ void getAnalytics$annotations() {
    }

    @ColumnNameOption("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @ColumnNameOption("request_params")
    public static /* synthetic */ void getRequestParams$annotations() {
    }

    @ColumnNameOption("typed_callback_serialized")
    public static /* synthetic */ void getTypedCallbackSerialized$annotations() {
    }

    @jxi
    @ColumnNameOption("typed_callback_struct")
    public static /* synthetic */ void getTypedCallbackStruct$annotations() {
    }

    public final TTypedCallbackRequest copy(ByteString TypedCallbackSerialized, TStructSerialization TypedCallbackStruct, TAnalyticsTrackingModule Analytics, TOrigin Origin, TRequestParams RequestParams, ByteString unknownFields) {
        return new TTypedCallbackRequest(TypedCallbackSerialized, TypedCallbackStruct, Analytics, Origin, RequestParams, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TTypedCallbackRequest)) {
            return false;
        }
        TTypedCallbackRequest tTypedCallbackRequest = (TTypedCallbackRequest) other;
        return jl40.l(unknownFields(), tTypedCallbackRequest.unknownFields()) && jl40.l(this.TypedCallbackSerialized, tTypedCallbackRequest.TypedCallbackSerialized) && jl40.l(this.TypedCallbackStruct, tTypedCallbackRequest.TypedCallbackStruct) && jl40.l(this.Analytics, tTypedCallbackRequest.Analytics) && jl40.l(this.Origin, tTypedCallbackRequest.Origin) && jl40.l(this.RequestParams, tTypedCallbackRequest.RequestParams);
    }

    public final TAnalyticsTrackingModule getAnalytics() {
        return this.Analytics;
    }

    public final TOrigin getOrigin() {
        return this.Origin;
    }

    public final TRequestParams getRequestParams() {
        return this.RequestParams;
    }

    public final ByteString getTypedCallbackSerialized() {
        return this.TypedCallbackSerialized;
    }

    public final TStructSerialization getTypedCallbackStruct() {
        return this.TypedCallbackStruct;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.TypedCallbackSerialized;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        TStructSerialization tStructSerialization = this.TypedCallbackStruct;
        int hashCode3 = (hashCode2 + (tStructSerialization != null ? tStructSerialization.hashCode() : 0)) * 37;
        TAnalyticsTrackingModule tAnalyticsTrackingModule = this.Analytics;
        int hashCode4 = (hashCode3 + (tAnalyticsTrackingModule != null ? tAnalyticsTrackingModule.hashCode() : 0)) * 37;
        TOrigin tOrigin = this.Origin;
        int hashCode5 = (hashCode4 + (tOrigin != null ? tOrigin.hashCode() : 0)) * 37;
        TRequestParams tRequestParams = this.RequestParams;
        int hashCode6 = hashCode5 + (tRequestParams != null ? tRequestParams.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m515newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.TypedCallbackSerialized;
        if (byteString != null) {
            arrayList.add("TypedCallbackSerialized=" + byteString);
        }
        TStructSerialization tStructSerialization = this.TypedCallbackStruct;
        if (tStructSerialization != null) {
            arrayList.add("TypedCallbackStruct=" + tStructSerialization);
        }
        TAnalyticsTrackingModule tAnalyticsTrackingModule = this.Analytics;
        if (tAnalyticsTrackingModule != null) {
            arrayList.add("Analytics=" + tAnalyticsTrackingModule);
        }
        TOrigin tOrigin = this.Origin;
        if (tOrigin != null) {
            arrayList.add("Origin=" + tOrigin);
        }
        TRequestParams tRequestParams = this.RequestParams;
        if (tRequestParams != null) {
            arrayList.add("RequestParams=" + tRequestParams);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TTypedCallbackRequest{", "}", null, 56);
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest$TStructSerialization;", "Lcom/squareup/wire/Message;", "", "TypedCallbackName", "", "Payload", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getTypedCallbackName$annotations", "()V", "getTypedCallbackName", "()Ljava/lang/String;", "getPayload$annotations", "getPayload", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TStructSerialization extends Message {
        public static final ProtoAdapter<TStructSerialization> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "payload", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Map<String, ?> Payload;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "typed_callback_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String TypedCallbackName;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TStructSerialization.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TStructSerialization>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest$TStructSerialization$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TTypedCallbackRequest.TStructSerialization decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    Map<String, ?> map = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TTypedCallbackRequest.TStructSerialization(str, map, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            map = ProtoAdapter.STRUCT_MAP.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TTypedCallbackRequest.TStructSerialization value) {
                    if (!jl40.l(value.getTypedCallbackName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypedCallbackName());
                    }
                    if (value.getPayload() != null) {
                        ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getPayload());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TTypedCallbackRequest.TStructSerialization value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getTypedCallbackName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTypedCallbackName());
                    }
                    return value.getPayload() != null ? ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(2, value.getPayload()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TTypedCallbackRequest.TStructSerialization redact(TTypedCallbackRequest.TStructSerialization value) {
                    Map<String, ?> payload = value.getPayload();
                    return TTypedCallbackRequest.TStructSerialization.copy$default(value, null, payload != null ? ProtoAdapter.STRUCT_MAP.redact(payload) : null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TTypedCallbackRequest.TStructSerialization value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getPayload() != null) {
                        ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getPayload());
                    }
                    if (jl40.l(value.getTypedCallbackName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypedCallbackName());
                }
            };
        }

        public /* synthetic */ TStructSerialization(String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TStructSerialization copy$default(TStructSerialization tStructSerialization, String str, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tStructSerialization.TypedCallbackName;
            }
            if ((i & 2) != 0) {
                map = tStructSerialization.Payload;
            }
            if ((i & 4) != 0) {
                byteString = tStructSerialization.unknownFields();
            }
            return tStructSerialization.copy(str, map, byteString);
        }

        @ColumnNameOption("payload")
        public static /* synthetic */ void getPayload$annotations() {
        }

        @ColumnNameOption("typed_callback_name")
        public static /* synthetic */ void getTypedCallbackName$annotations() {
        }

        public final TStructSerialization copy(String TypedCallbackName, Map<String, ?> Payload, ByteString unknownFields) {
            return new TStructSerialization(TypedCallbackName, Payload, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TStructSerialization)) {
                return false;
            }
            TStructSerialization tStructSerialization = (TStructSerialization) other;
            return jl40.l(unknownFields(), tStructSerialization.unknownFields()) && jl40.l(this.TypedCallbackName, tStructSerialization.TypedCallbackName) && jl40.l(this.Payload, tStructSerialization.Payload);
        }

        public final Map<String, ?> getPayload() {
            return this.Payload;
        }

        public final String getTypedCallbackName() {
            return this.TypedCallbackName;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unknownFields().hashCode() * 37, 37, this.TypedCallbackName);
            Map<String, ?> map = this.Payload;
            int hashCode = b + (map != null ? map.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m516newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("TypedCallbackName=", Internal.sanitize(this.TypedCallbackName), arrayList);
            Map<String, ?> map = this.Payload;
            if (map != null) {
                arrayList.add("Payload=" + map);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TStructSerialization{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m516newBuilder();
        }

        public TStructSerialization() {
            this(null, null, null, 7, null);
        }

        public TStructSerialization(String str, Map<String, ?> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.TypedCallbackName = str;
            this.Payload = (Map) Internal.immutableCopyOfStruct("Payload", map);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m515newBuilder();
    }

    public TTypedCallbackRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TTypedCallbackRequest(ByteString byteString, TStructSerialization tStructSerialization, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.TypedCallbackSerialized = byteString;
        this.TypedCallbackStruct = tStructSerialization;
        this.Analytics = tAnalyticsTrackingModule;
        this.Origin = tOrigin;
        this.RequestParams = tRequestParams;
        if (Internal.countNonNull(byteString, tStructSerialization) <= 1) {
            return;
        }
        ny61.g("At most one of TypedCallbackSerialized, TypedCallbackStruct may be non-null");
        throw null;
    }
}
