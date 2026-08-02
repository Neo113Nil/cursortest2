package ru.yandex.alice.megamind.protos.common.platform.utils;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.megamind.protos.common.platform.utils.TSemanticFrameRequestData;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TOrigin;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams;
import ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/yandex/alice/megamind/protos/common/platform/utils/TSemanticFrameRequestData;", "Lcom/squareup/wire/Message;", "", "TypedSemanticFrame", "Lru/yandex/alice/megamind/protos/common/platform/utils/TTypedSemanticFrame;", "Analytics", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;", "Origin", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;", "RequestParams", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;", "OnChainFinish", "Lru/yandex/alice/megamind/protos/common/platform/utils/TSemanticFrameRequestData$TOnChainFinishEvent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/megamind/protos/common/platform/utils/TTypedSemanticFrame;Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;Lru/yandex/alice/megamind/protos/common/platform/utils/TSemanticFrameRequestData$TOnChainFinishEvent;Lokio/ByteString;)V", "getTypedSemanticFrame", "()Lru/yandex/alice/megamind/protos/common/platform/utils/TTypedSemanticFrame;", "getAnalytics", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;", "getOrigin", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;", "getRequestParams", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;", "getOnChainFinish", "()Lru/yandex/alice/megamind/protos/common/platform/utils/TSemanticFrameRequestData$TOnChainFinishEvent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TOnChainFinishEvent", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TSemanticFrameRequestData extends Message {
    public static final ProtoAdapter<TSemanticFrameRequestData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule#ADAPTER", jsonName = "analytics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TAnalyticsTrackingModule Analytics;

    @WireField(adapter = "ru.yandex.alice.megamind.protos.common.platform.utils.TSemanticFrameRequestData$TOnChainFinishEvent#ADAPTER", jsonName = "on_chain_finish", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final TOnChainFinishEvent OnChainFinish;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TOrigin#ADAPTER", jsonName = "origin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TOrigin Origin;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams#ADAPTER", jsonName = "request_params", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final TRequestParams RequestParams;

    @WireField(adapter = "ru.yandex.alice.megamind.protos.common.platform.utils.TTypedSemanticFrame#ADAPTER", jsonName = "typed_semantic_frame", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TTypedSemanticFrame TypedSemanticFrame;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TSemanticFrameRequestData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TSemanticFrameRequestData>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.common.platform.utils.TSemanticFrameRequestData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TSemanticFrameRequestData decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TTypedSemanticFrame tTypedSemanticFrame = null;
                TAnalyticsTrackingModule tAnalyticsTrackingModule = null;
                TOrigin tOrigin = null;
                TRequestParams tRequestParams = null;
                TSemanticFrameRequestData.TOnChainFinishEvent tOnChainFinishEvent = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TSemanticFrameRequestData(tTypedSemanticFrame, tAnalyticsTrackingModule, tOrigin, tRequestParams, tOnChainFinishEvent, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tTypedSemanticFrame = TTypedSemanticFrame.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tAnalyticsTrackingModule = TAnalyticsTrackingModule.ADAPTER.decode(reader);
                    } else if (nextTag == 3) {
                        tOrigin = TOrigin.ADAPTER.decode(reader);
                    } else if (nextTag == 5) {
                        tRequestParams = TRequestParams.ADAPTER.decode(reader);
                    } else if (nextTag != 6) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tOnChainFinishEvent = TSemanticFrameRequestData.TOnChainFinishEvent.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TSemanticFrameRequestData value) {
                if (value.getTypedSemanticFrame() != null) {
                    TTypedSemanticFrame.ADAPTER.encodeWithTag(writer, 1, (int) value.getTypedSemanticFrame());
                }
                if (value.getAnalytics() != null) {
                    TAnalyticsTrackingModule.ADAPTER.encodeWithTag(writer, 2, (int) value.getAnalytics());
                }
                if (value.getOrigin() != null) {
                    TOrigin.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrigin());
                }
                if (value.getRequestParams() != null) {
                    TRequestParams.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequestParams());
                }
                if (value.getOnChainFinish() != null) {
                    TSemanticFrameRequestData.TOnChainFinishEvent.ADAPTER.encodeWithTag(writer, 6, (int) value.getOnChainFinish());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TSemanticFrameRequestData value) {
                int h = value.unknownFields().h();
                if (value.getTypedSemanticFrame() != null) {
                    h += TTypedSemanticFrame.ADAPTER.encodedSizeWithTag(1, value.getTypedSemanticFrame());
                }
                if (value.getAnalytics() != null) {
                    h += TAnalyticsTrackingModule.ADAPTER.encodedSizeWithTag(2, value.getAnalytics());
                }
                if (value.getOrigin() != null) {
                    h += TOrigin.ADAPTER.encodedSizeWithTag(3, value.getOrigin());
                }
                if (value.getRequestParams() != null) {
                    h += TRequestParams.ADAPTER.encodedSizeWithTag(5, value.getRequestParams());
                }
                return value.getOnChainFinish() != null ? TSemanticFrameRequestData.TOnChainFinishEvent.ADAPTER.encodedSizeWithTag(6, value.getOnChainFinish()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TSemanticFrameRequestData redact(TSemanticFrameRequestData value) {
                TTypedSemanticFrame typedSemanticFrame = value.getTypedSemanticFrame();
                TTypedSemanticFrame redact = typedSemanticFrame != null ? TTypedSemanticFrame.ADAPTER.redact(typedSemanticFrame) : null;
                TAnalyticsTrackingModule analytics = value.getAnalytics();
                TAnalyticsTrackingModule redact2 = analytics != null ? TAnalyticsTrackingModule.ADAPTER.redact(analytics) : null;
                TOrigin origin = value.getOrigin();
                TOrigin redact3 = origin != null ? TOrigin.ADAPTER.redact(origin) : null;
                TRequestParams requestParams = value.getRequestParams();
                TRequestParams redact4 = requestParams != null ? TRequestParams.ADAPTER.redact(requestParams) : null;
                TSemanticFrameRequestData.TOnChainFinishEvent onChainFinish = value.getOnChainFinish();
                return value.copy(redact, redact2, redact3, redact4, onChainFinish != null ? TSemanticFrameRequestData.TOnChainFinishEvent.ADAPTER.redact(onChainFinish) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TSemanticFrameRequestData value) {
                writer.writeBytes(value.unknownFields());
                if (value.getOnChainFinish() != null) {
                    TSemanticFrameRequestData.TOnChainFinishEvent.ADAPTER.encodeWithTag(writer, 6, (int) value.getOnChainFinish());
                }
                if (value.getRequestParams() != null) {
                    TRequestParams.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequestParams());
                }
                if (value.getOrigin() != null) {
                    TOrigin.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrigin());
                }
                if (value.getAnalytics() != null) {
                    TAnalyticsTrackingModule.ADAPTER.encodeWithTag(writer, 2, (int) value.getAnalytics());
                }
                if (value.getTypedSemanticFrame() != null) {
                    TTypedSemanticFrame.ADAPTER.encodeWithTag(writer, 1, (int) value.getTypedSemanticFrame());
                }
            }
        };
    }

    public /* synthetic */ TSemanticFrameRequestData(TTypedSemanticFrame tTypedSemanticFrame, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, TOnChainFinishEvent tOnChainFinishEvent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tTypedSemanticFrame, (i & 2) != 0 ? null : tAnalyticsTrackingModule, (i & 4) != 0 ? null : tOrigin, (i & 8) != 0 ? null : tRequestParams, (i & 16) != 0 ? null : tOnChainFinishEvent, (i & 32) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TSemanticFrameRequestData copy$default(TSemanticFrameRequestData tSemanticFrameRequestData, TTypedSemanticFrame tTypedSemanticFrame, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, TOnChainFinishEvent tOnChainFinishEvent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tTypedSemanticFrame = tSemanticFrameRequestData.TypedSemanticFrame;
        }
        if ((i & 2) != 0) {
            tAnalyticsTrackingModule = tSemanticFrameRequestData.Analytics;
        }
        if ((i & 4) != 0) {
            tOrigin = tSemanticFrameRequestData.Origin;
        }
        if ((i & 8) != 0) {
            tRequestParams = tSemanticFrameRequestData.RequestParams;
        }
        if ((i & 16) != 0) {
            tOnChainFinishEvent = tSemanticFrameRequestData.OnChainFinish;
        }
        if ((i & 32) != 0) {
            byteString = tSemanticFrameRequestData.unknownFields();
        }
        TOnChainFinishEvent tOnChainFinishEvent2 = tOnChainFinishEvent;
        ByteString byteString2 = byteString;
        return tSemanticFrameRequestData.copy(tTypedSemanticFrame, tAnalyticsTrackingModule, tOrigin, tRequestParams, tOnChainFinishEvent2, byteString2);
    }

    public final TSemanticFrameRequestData copy(TTypedSemanticFrame TypedSemanticFrame, TAnalyticsTrackingModule Analytics, TOrigin Origin, TRequestParams RequestParams, TOnChainFinishEvent OnChainFinish, ByteString unknownFields) {
        return new TSemanticFrameRequestData(TypedSemanticFrame, Analytics, Origin, RequestParams, OnChainFinish, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TSemanticFrameRequestData)) {
            return false;
        }
        TSemanticFrameRequestData tSemanticFrameRequestData = (TSemanticFrameRequestData) other;
        return jl40.l(unknownFields(), tSemanticFrameRequestData.unknownFields()) && jl40.l(this.TypedSemanticFrame, tSemanticFrameRequestData.TypedSemanticFrame) && jl40.l(this.Analytics, tSemanticFrameRequestData.Analytics) && jl40.l(this.Origin, tSemanticFrameRequestData.Origin) && jl40.l(this.RequestParams, tSemanticFrameRequestData.RequestParams) && jl40.l(this.OnChainFinish, tSemanticFrameRequestData.OnChainFinish);
    }

    public final TAnalyticsTrackingModule getAnalytics() {
        return this.Analytics;
    }

    public final TOnChainFinishEvent getOnChainFinish() {
        return this.OnChainFinish;
    }

    public final TOrigin getOrigin() {
        return this.Origin;
    }

    public final TRequestParams getRequestParams() {
        return this.RequestParams;
    }

    public final TTypedSemanticFrame getTypedSemanticFrame() {
        return this.TypedSemanticFrame;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TTypedSemanticFrame tTypedSemanticFrame = this.TypedSemanticFrame;
        int hashCode2 = (hashCode + (tTypedSemanticFrame != null ? tTypedSemanticFrame.hashCode() : 0)) * 37;
        TAnalyticsTrackingModule tAnalyticsTrackingModule = this.Analytics;
        int hashCode3 = (hashCode2 + (tAnalyticsTrackingModule != null ? tAnalyticsTrackingModule.hashCode() : 0)) * 37;
        TOrigin tOrigin = this.Origin;
        int hashCode4 = (hashCode3 + (tOrigin != null ? tOrigin.hashCode() : 0)) * 37;
        TRequestParams tRequestParams = this.RequestParams;
        int hashCode5 = (hashCode4 + (tRequestParams != null ? tRequestParams.hashCode() : 0)) * 37;
        TOnChainFinishEvent tOnChainFinishEvent = this.OnChainFinish;
        int hashCode6 = hashCode5 + (tOnChainFinishEvent != null ? tOnChainFinishEvent.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m499newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TTypedSemanticFrame tTypedSemanticFrame = this.TypedSemanticFrame;
        if (tTypedSemanticFrame != null) {
            arrayList.add("TypedSemanticFrame=" + tTypedSemanticFrame);
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
        TOnChainFinishEvent tOnChainFinishEvent = this.OnChainFinish;
        if (tOnChainFinishEvent != null) {
            arrayList.add("OnChainFinish=" + tOnChainFinishEvent);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TSemanticFrameRequestData{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/yandex/alice/megamind/protos/common/platform/utils/TSemanticFrameRequestData$TOnChainFinishEvent;", "Lcom/squareup/wire/Message;", "", "TypedCallbackRequest", "Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest;Lokio/ByteString;)V", "getTypedCallbackRequest", "()Lru/yandex/alice/protos/api/typed_callbacks/platform/utils/TTypedCallbackRequest;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TOnChainFinishEvent extends Message {
        public static final ProtoAdapter<TOnChainFinishEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.api.typed_callbacks.platform.utils.TTypedCallbackRequest#ADAPTER", jsonName = "typed_callback_request", oneofName = "Event", schemaIndex = 0, tag = 1)
        private final TTypedCallbackRequest TypedCallbackRequest;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOnChainFinishEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOnChainFinishEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.common.platform.utils.TSemanticFrameRequestData$TOnChainFinishEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TSemanticFrameRequestData.TOnChainFinishEvent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TTypedCallbackRequest tTypedCallbackRequest = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TSemanticFrameRequestData.TOnChainFinishEvent(tTypedCallbackRequest, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tTypedCallbackRequest = TTypedCallbackRequest.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TSemanticFrameRequestData.TOnChainFinishEvent value) {
                    TTypedCallbackRequest.ADAPTER.encodeWithTag(writer, 1, (int) value.getTypedCallbackRequest());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TSemanticFrameRequestData.TOnChainFinishEvent value) {
                    return TTypedCallbackRequest.ADAPTER.encodedSizeWithTag(1, value.getTypedCallbackRequest()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TSemanticFrameRequestData.TOnChainFinishEvent redact(TSemanticFrameRequestData.TOnChainFinishEvent value) {
                    TTypedCallbackRequest typedCallbackRequest = value.getTypedCallbackRequest();
                    return value.copy(typedCallbackRequest != null ? TTypedCallbackRequest.ADAPTER.redact(typedCallbackRequest) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TSemanticFrameRequestData.TOnChainFinishEvent value) {
                    writer.writeBytes(value.unknownFields());
                    TTypedCallbackRequest.ADAPTER.encodeWithTag(writer, 1, (int) value.getTypedCallbackRequest());
                }
            };
        }

        public /* synthetic */ TOnChainFinishEvent(TTypedCallbackRequest tTypedCallbackRequest, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tTypedCallbackRequest, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TOnChainFinishEvent copy$default(TOnChainFinishEvent tOnChainFinishEvent, TTypedCallbackRequest tTypedCallbackRequest, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tTypedCallbackRequest = tOnChainFinishEvent.TypedCallbackRequest;
            }
            if ((i & 2) != 0) {
                byteString = tOnChainFinishEvent.unknownFields();
            }
            return tOnChainFinishEvent.copy(tTypedCallbackRequest, byteString);
        }

        public final TOnChainFinishEvent copy(TTypedCallbackRequest TypedCallbackRequest, ByteString unknownFields) {
            return new TOnChainFinishEvent(TypedCallbackRequest, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOnChainFinishEvent)) {
                return false;
            }
            TOnChainFinishEvent tOnChainFinishEvent = (TOnChainFinishEvent) other;
            return jl40.l(unknownFields(), tOnChainFinishEvent.unknownFields()) && jl40.l(this.TypedCallbackRequest, tOnChainFinishEvent.TypedCallbackRequest);
        }

        public final TTypedCallbackRequest getTypedCallbackRequest() {
            return this.TypedCallbackRequest;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TTypedCallbackRequest tTypedCallbackRequest = this.TypedCallbackRequest;
            int hashCode2 = hashCode + (tTypedCallbackRequest != null ? tTypedCallbackRequest.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m500newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TTypedCallbackRequest tTypedCallbackRequest = this.TypedCallbackRequest;
            if (tTypedCallbackRequest != null) {
                arrayList.add("TypedCallbackRequest=" + tTypedCallbackRequest);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TOnChainFinishEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m500newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TOnChainFinishEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TOnChainFinishEvent(TTypedCallbackRequest tTypedCallbackRequest, ByteString byteString) {
            super(ADAPTER, byteString);
            this.TypedCallbackRequest = tTypedCallbackRequest;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m499newBuilder();
    }

    public TSemanticFrameRequestData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TSemanticFrameRequestData(TTypedSemanticFrame tTypedSemanticFrame, TAnalyticsTrackingModule tAnalyticsTrackingModule, TOrigin tOrigin, TRequestParams tRequestParams, TOnChainFinishEvent tOnChainFinishEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.TypedSemanticFrame = tTypedSemanticFrame;
        this.Analytics = tAnalyticsTrackingModule;
        this.Origin = tOrigin;
        this.RequestParams = tRequestParams;
        this.OnChainFinish = tOnChainFinishEvent;
    }
}
