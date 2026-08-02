package ru.yandex.alice.protos.endpoint.capabilities.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import com.adjust.sdk.Constants;
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
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$%&B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TState", "TShareDirective", "TTextContent", "TLinkContent", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.AliceChatShareCapabilityType)
/* loaded from: classes4.dex */
public final class TAliceChatShareCapability extends Message {
    public static final ProtoAdapter<TAliceChatShareCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAliceChatShareCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAliceChatShareCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatShareCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TAliceChatShareCapability.TParameters tParameters = null;
                TAliceChatShareCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAliceChatShareCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TAliceChatShareCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TAliceChatShareCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAliceChatShareCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TAliceChatShareCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TAliceChatShareCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAliceChatShareCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TAliceChatShareCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TAliceChatShareCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatShareCapability redact(TAliceChatShareCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TAliceChatShareCapability.TParameters parameters = value.getParameters();
                TAliceChatShareCapability.TParameters redact2 = parameters != null ? TAliceChatShareCapability.TParameters.ADAPTER.redact(parameters) : null;
                TAliceChatShareCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TAliceChatShareCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAliceChatShareCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TAliceChatShareCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TAliceChatShareCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TAliceChatShareCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAliceChatShareCapability copy$default(TAliceChatShareCapability tAliceChatShareCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tAliceChatShareCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tAliceChatShareCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tAliceChatShareCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tAliceChatShareCapability.unknownFields();
        }
        return tAliceChatShareCapability.copy(tMeta, tParameters, tState, byteString);
    }

    @ColumnNameOption(Constants.REFERRER_API_META)
    public static /* synthetic */ void getMeta$annotations() {
    }

    @ColumnNameOption("parameters")
    public static /* synthetic */ void getParameters$annotations() {
    }

    @ColumnNameOption(ClidProvider.STATE)
    public static /* synthetic */ void getState$annotations() {
    }

    public final TAliceChatShareCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TAliceChatShareCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAliceChatShareCapability)) {
            return false;
        }
        TAliceChatShareCapability tAliceChatShareCapability = (TAliceChatShareCapability) other;
        return jl40.l(unknownFields(), tAliceChatShareCapability.unknownFields()) && jl40.l(this.meta, tAliceChatShareCapability.meta) && jl40.l(this.parameters, tAliceChatShareCapability.parameters) && jl40.l(this.state, tAliceChatShareCapability.state);
    }

    public final TCapability.TMeta getMeta() {
        return this.meta;
    }

    public final TParameters getParameters() {
        return this.parameters;
    }

    public final TState getState() {
        return this.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TCapability.TMeta tMeta = this.meta;
        int hashCode2 = (hashCode + (tMeta != null ? tMeta.hashCode() : 0)) * 37;
        TParameters tParameters = this.parameters;
        int hashCode3 = (hashCode2 + (tParameters != null ? tParameters.hashCode() : 0)) * 37;
        TState tState = this.state;
        int hashCode4 = hashCode3 + (tState != null ? tState.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m641newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TCapability.TMeta tMeta = this.meta;
        if (tMeta != null) {
            arrayList.add("meta=" + tMeta);
        }
        TParameters tParameters = this.parameters;
        if (tParameters != null) {
            arrayList.add("parameters=" + tParameters);
        }
        TState tState = this.state;
        if (tState != null) {
            arrayList.add("state=" + tState);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TAliceChatShareCapability{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TLinkContent;", "Lcom/squareup/wire/Message;", "", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getUrl$annotations", "()V", "getUrl", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TLinkContent extends Message {
        public static final ProtoAdapter<TLinkContent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String url;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TLinkContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TLinkContent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TLinkContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TLinkContent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatShareCapability.TLinkContent(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatShareCapability.TLinkContent value) {
                    if (!jl40.l(value.getUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatShareCapability.TLinkContent value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getUrl(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TLinkContent redact(TAliceChatShareCapability.TLinkContent value) {
                    return TAliceChatShareCapability.TLinkContent.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatShareCapability.TLinkContent value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getUrl(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
            };
        }

        public /* synthetic */ TLinkContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TLinkContent copy$default(TLinkContent tLinkContent, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tLinkContent.url;
            }
            if ((i & 2) != 0) {
                byteString = tLinkContent.unknownFields();
            }
            return tLinkContent.copy(str, byteString);
        }

        @ColumnNameOption("url")
        public static /* synthetic */ void getUrl$annotations() {
        }

        public final TLinkContent copy(String url, ByteString unknownFields) {
            return new TLinkContent(url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TLinkContent)) {
                return false;
            }
            TLinkContent tLinkContent = (TLinkContent) other;
            return jl40.l(unknownFields(), tLinkContent.unknownFields()) && jl40.l(this.url, tLinkContent.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.url.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m642newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("url=", Internal.sanitize(this.url), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TLinkContent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m642newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TLinkContent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TLinkContent(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatShareCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatShareCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatShareCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TParameters redact(TAliceChatShareCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatShareCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }
            };
        }

        public /* synthetic */ TParameters(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TParameters copy$default(TParameters tParameters, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = tParameters.unknownFields();
            }
            return tParameters.copy(byteString);
        }

        public final TParameters copy(ByteString unknownFields) {
            return new TParameters(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TParameters) && jl40.l(unknownFields(), ((TParameters) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m643newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m643newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @SpeechKitNameOption("alice_chat_share_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TShareDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "title", "link", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TLinkContent;", "text", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TTextContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TLinkContent;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TTextContent;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getTitle$annotations", "getTitle", "getLink$annotations", "getLink", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TLinkContent;", "getText$annotations", "getText", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TTextContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.AliceChatShareDirectiveType)
    public static final class TShareDirective extends Message {
        public static final ProtoAdapter<TShareDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TLinkContent#ADAPTER", oneofName = "Content", schemaIndex = 2, tag = 3)
        private final TLinkContent link;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TTextContent#ADAPTER", oneofName = "Content", schemaIndex = 3, tag = 4)
        private final TTextContent text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShareDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShareDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TShareDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TShareDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TAliceChatShareCapability.TLinkContent tLinkContent = null;
                    TAliceChatShareCapability.TTextContent tTextContent = null;
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatShareCapability.TShareDirective(str, str2, tLinkContent, tTextContent, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            tLinkContent = TAliceChatShareCapability.TLinkContent.ADAPTER.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            tTextContent = TAliceChatShareCapability.TTextContent.ADAPTER.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatShareCapability.TShareDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    TAliceChatShareCapability.TLinkContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getLink());
                    TAliceChatShareCapability.TTextContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getText());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatShareCapability.TShareDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                    }
                    return TAliceChatShareCapability.TTextContent.ADAPTER.encodedSizeWithTag(4, value.getText()) + TAliceChatShareCapability.TLinkContent.ADAPTER.encodedSizeWithTag(3, value.getLink()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TShareDirective redact(TAliceChatShareCapability.TShareDirective value) {
                    TAliceChatShareCapability.TLinkContent link = value.getLink();
                    TAliceChatShareCapability.TLinkContent redact = link != null ? TAliceChatShareCapability.TLinkContent.ADAPTER.redact(link) : null;
                    TAliceChatShareCapability.TTextContent text = value.getText();
                    return TAliceChatShareCapability.TShareDirective.copy$default(value, null, null, redact, text != null ? TAliceChatShareCapability.TTextContent.ADAPTER.redact(text) : null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatShareCapability.TShareDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceChatShareCapability.TTextContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getText());
                    TAliceChatShareCapability.TLinkContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getLink());
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShareDirective(String str, String str2, TLinkContent tLinkContent, TTextContent tTextContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tLinkContent, (i & 8) != 0 ? null : tTextContent, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShareDirective copy$default(TShareDirective tShareDirective, String str, String str2, TLinkContent tLinkContent, TTextContent tTextContent, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShareDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShareDirective.title;
            }
            if ((i & 4) != 0) {
                tLinkContent = tShareDirective.link;
            }
            if ((i & 8) != 0) {
                tTextContent = tShareDirective.text;
            }
            if ((i & 16) != 0) {
                byteString = tShareDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            TLinkContent tLinkContent2 = tLinkContent;
            return tShareDirective.copy(str, str2, tLinkContent2, tTextContent, byteString2);
        }

        @ColumnNameOption("link")
        public static /* synthetic */ void getLink$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        public final TShareDirective copy(String name, String title, TLinkContent link, TTextContent text, ByteString unknownFields) {
            return new TShareDirective(name, title, link, text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShareDirective)) {
                return false;
            }
            TShareDirective tShareDirective = (TShareDirective) other;
            return jl40.l(unknownFields(), tShareDirective.unknownFields()) && jl40.l(this.name, tShareDirective.name) && jl40.l(this.title, tShareDirective.title) && jl40.l(this.link, tShareDirective.link) && jl40.l(this.text, tShareDirective.text);
        }

        public final TLinkContent getLink() {
            return this.link;
        }

        public final String getName() {
            return this.name;
        }

        public final TTextContent getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.title);
            TLinkContent tLinkContent = this.link;
            int hashCode = (b + (tLinkContent != null ? tLinkContent.hashCode() : 0)) * 37;
            TTextContent tTextContent = this.text;
            int hashCode2 = hashCode + (tTextContent != null ? tTextContent.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m644newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            TLinkContent tLinkContent = this.link;
            if (tLinkContent != null) {
                arrayList.add("link=" + tLinkContent);
            }
            TTextContent tTextContent = this.text;
            if (tTextContent != null) {
                arrayList.add("text=" + tTextContent);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TShareDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m644newBuilder();
        }

        public TShareDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TShareDirective(String str, String str2, TLinkContent tLinkContent, TTextContent tTextContent, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.title = str2;
            this.link = tLinkContent;
            this.text = tTextContent;
            if (Internal.countNonNull(tLinkContent, tTextContent) <= 1) {
                return;
            }
            ny61.g("At most one of link, text may be non-null");
            throw null;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TState;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatShareCapability.TState(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatShareCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatShareCapability.TState value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TState redact(TAliceChatShareCapability.TState value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatShareCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                }
            };
        }

        public /* synthetic */ TState(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(byteString);
        }

        public final TState copy(ByteString unknownFields) {
            return new TState(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TState) && jl40.l(unknownFields(), ((TState) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m645newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TState{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m645newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TState(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatShareCapability$TTextContent;", "Lcom/squareup/wire/Message;", "", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TTextContent extends Message {
        public static final ProtoAdapter<TTextContent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String text;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TTextContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TTextContent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatShareCapability$TTextContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TTextContent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatShareCapability.TTextContent(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatShareCapability.TTextContent value) {
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatShareCapability.TTextContent value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getText(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatShareCapability.TTextContent redact(TAliceChatShareCapability.TTextContent value) {
                    return TAliceChatShareCapability.TTextContent.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatShareCapability.TTextContent value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getText(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
            };
        }

        public /* synthetic */ TTextContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TTextContent copy$default(TTextContent tTextContent, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tTextContent.text;
            }
            if ((i & 2) != 0) {
                byteString = tTextContent.unknownFields();
            }
            return tTextContent.copy(str, byteString);
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        public final TTextContent copy(String text, ByteString unknownFields) {
            return new TTextContent(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TTextContent)) {
                return false;
            }
            TTextContent tTextContent = (TTextContent) other;
            return jl40.l(unknownFields(), tTextContent.unknownFields()) && jl40.l(this.text, tTextContent.text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m646newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TTextContent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m646newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TTextContent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TTextContent(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m641newBuilder();
    }

    public TAliceChatShareCapability() {
        this(null, null, null, null, 15, null);
    }

    public TAliceChatShareCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
