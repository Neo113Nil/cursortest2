package ru.yandex.alice.protos.endpoint.capabilities.deeplinks;

import NYT.deeplinks.ColumnNameOption;
import NYT.deeplinks.DefaultFieldFlagsOption;
import NYT.deeplinks.EWrapperFieldFlag;
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
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability;
import ru.yandex.alice.protos.endpoint.deeplinks.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.deeplinks.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.deeplinks.EventTypeOption;
import ru.yandex.alice.protos.endpoint.deeplinks.TCapability;
import ru.yandex.alice.protos.extensions.deeplinks.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@CapabilityTypeOption(TCapability.ECapabilityType.DeeplinkCapabilityType)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$%&B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/deeplinks/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/deeplinks/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/deeplinks/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TState", "TSupportedDeeplinks", "TOpenDeeplinkDirective", "TUpdateDeeplinksPrefixesEvent", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TDeeplinkCapability extends Message {
    public static final ProtoAdapter<TDeeplinkCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.deeplinks.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDeeplinkCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDeeplinkCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TDeeplinkCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TDeeplinkCapability.TParameters tParameters = null;
                TDeeplinkCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDeeplinkCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TDeeplinkCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TDeeplinkCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDeeplinkCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TDeeplinkCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TDeeplinkCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDeeplinkCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TDeeplinkCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TDeeplinkCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDeeplinkCapability redact(TDeeplinkCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TDeeplinkCapability.TParameters parameters = value.getParameters();
                TDeeplinkCapability.TParameters redact2 = parameters != null ? TDeeplinkCapability.TParameters.ADAPTER.redact(parameters) : null;
                TDeeplinkCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TDeeplinkCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDeeplinkCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TDeeplinkCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TDeeplinkCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TDeeplinkCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TDeeplinkCapability copy$default(TDeeplinkCapability tDeeplinkCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tDeeplinkCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tDeeplinkCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tDeeplinkCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tDeeplinkCapability.unknownFields();
        }
        return tDeeplinkCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TDeeplinkCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TDeeplinkCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDeeplinkCapability)) {
            return false;
        }
        TDeeplinkCapability tDeeplinkCapability = (TDeeplinkCapability) other;
        return jl40.l(unknownFields(), tDeeplinkCapability.unknownFields()) && jl40.l(this.meta, tDeeplinkCapability.meta) && jl40.l(this.parameters, tDeeplinkCapability.parameters) && jl40.l(this.state, tDeeplinkCapability.state);
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
    public /* synthetic */ Void m544newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TDeeplinkCapability{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TOpenDeeplinkDirective;", "Lcom/squareup/wire/Message;", "", "name", "", LaunchBrowserActivity.KEY_URI, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getUri$annotations", "getUri", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DirectiveTypeOption(TCapability.EDirectiveType.OpenDeeplinkDirectiveType)
    @SpeechKitNameOption("open_deeplink_directive")
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TOpenDeeplinkDirective extends Message {
        public static final ProtoAdapter<TOpenDeeplinkDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String uri;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOpenDeeplinkDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOpenDeeplinkDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TOpenDeeplinkDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TOpenDeeplinkDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDeeplinkCapability.TOpenDeeplinkDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDeeplinkCapability.TOpenDeeplinkDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getUri(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUri());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDeeplinkCapability.TOpenDeeplinkDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getUri(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUri()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TOpenDeeplinkDirective redact(TDeeplinkCapability.TOpenDeeplinkDirective value) {
                    return TDeeplinkCapability.TOpenDeeplinkDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDeeplinkCapability.TOpenDeeplinkDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getUri(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUri());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TOpenDeeplinkDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TOpenDeeplinkDirective copy$default(TOpenDeeplinkDirective tOpenDeeplinkDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tOpenDeeplinkDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tOpenDeeplinkDirective.uri;
            }
            if ((i & 4) != 0) {
                byteString = tOpenDeeplinkDirective.unknownFields();
            }
            return tOpenDeeplinkDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption(LaunchBrowserActivity.KEY_URI)
        public static /* synthetic */ void getUri$annotations() {
        }

        public final TOpenDeeplinkDirective copy(String name, String uri, ByteString unknownFields) {
            return new TOpenDeeplinkDirective(name, uri, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOpenDeeplinkDirective)) {
                return false;
            }
            TOpenDeeplinkDirective tOpenDeeplinkDirective = (TOpenDeeplinkDirective) other;
            return jl40.l(unknownFields(), tOpenDeeplinkDirective.unknownFields()) && jl40.l(this.name, tOpenDeeplinkDirective.name) && jl40.l(this.uri, tOpenDeeplinkDirective.uri);
        }

        public final String getName() {
            return this.name;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.uri.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m545newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("uri=", Internal.sanitize(this.uri), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TOpenDeeplinkDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m545newBuilder();
        }

        public TOpenDeeplinkDirective() {
            this(null, null, null, 7, null);
        }

        public TOpenDeeplinkDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.uri = str2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDeeplinkCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDeeplinkCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDeeplinkCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TParameters redact(TDeeplinkCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDeeplinkCapability.TParameters value) {
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
        public /* synthetic */ Void m546newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m546newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TState;", "Lcom/squareup/wire/Message;", "", "supported", "Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TSupportedDeeplinks;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TSupportedDeeplinks;Lokio/ByteString;)V", "getSupported$annotations", "()V", "getSupported", "()Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TSupportedDeeplinks;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TSupportedDeeplinks#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TSupportedDeeplinks supported;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TDeeplinkCapability.TSupportedDeeplinks tSupportedDeeplinks = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDeeplinkCapability.TState(tSupportedDeeplinks, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tSupportedDeeplinks = TDeeplinkCapability.TSupportedDeeplinks.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDeeplinkCapability.TState value) {
                    if (value.getSupported() != null) {
                        TDeeplinkCapability.TSupportedDeeplinks.ADAPTER.encodeWithTag(writer, 1, (int) value.getSupported());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDeeplinkCapability.TState value) {
                    int h = value.unknownFields().h();
                    return value.getSupported() != null ? TDeeplinkCapability.TSupportedDeeplinks.ADAPTER.encodedSizeWithTag(1, value.getSupported()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TState redact(TDeeplinkCapability.TState value) {
                    TDeeplinkCapability.TSupportedDeeplinks supported = value.getSupported();
                    return value.copy(supported != null ? TDeeplinkCapability.TSupportedDeeplinks.ADAPTER.redact(supported) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDeeplinkCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getSupported() != null) {
                        TDeeplinkCapability.TSupportedDeeplinks.ADAPTER.encodeWithTag(writer, 1, (int) value.getSupported());
                    }
                }
            };
        }

        public /* synthetic */ TState(TSupportedDeeplinks tSupportedDeeplinks, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tSupportedDeeplinks, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, TSupportedDeeplinks tSupportedDeeplinks, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tSupportedDeeplinks = tState.supported;
            }
            if ((i & 2) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(tSupportedDeeplinks, byteString);
        }

        @ColumnNameOption("supported")
        public static /* synthetic */ void getSupported$annotations() {
        }

        public final TState copy(TSupportedDeeplinks supported, ByteString unknownFields) {
            return new TState(supported, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && jl40.l(this.supported, tState.supported);
        }

        public final TSupportedDeeplinks getSupported() {
            return this.supported;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TSupportedDeeplinks tSupportedDeeplinks = this.supported;
            int hashCode2 = hashCode + (tSupportedDeeplinks != null ? tSupportedDeeplinks.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m547newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TSupportedDeeplinks tSupportedDeeplinks = this.supported;
            if (tSupportedDeeplinks != null) {
                arrayList.add("supported=" + tSupportedDeeplinks);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m547newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TState(TSupportedDeeplinks tSupportedDeeplinks, ByteString byteString) {
            super(ADAPTER, byteString);
            this.supported = tSupportedDeeplinks;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J \u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TSupportedDeeplinks;", "Lcom/squareup/wire/Message;", "", "prefixes", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getPrefixes$annotations", "()V", "getPrefixes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TSupportedDeeplinks extends Message {
        public static final ProtoAdapter<TSupportedDeeplinks> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<String> prefixes;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TSupportedDeeplinks.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TSupportedDeeplinks>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TSupportedDeeplinks$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TSupportedDeeplinks decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDeeplinkCapability.TSupportedDeeplinks(arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDeeplinkCapability.TSupportedDeeplinks value) {
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getPrefixes());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDeeplinkCapability.TSupportedDeeplinks value) {
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getPrefixes()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TSupportedDeeplinks redact(TDeeplinkCapability.TSupportedDeeplinks value) {
                    return TDeeplinkCapability.TSupportedDeeplinks.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDeeplinkCapability.TSupportedDeeplinks value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getPrefixes());
                }
            };
        }

        public /* synthetic */ TSupportedDeeplinks(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TSupportedDeeplinks copy$default(TSupportedDeeplinks tSupportedDeeplinks, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tSupportedDeeplinks.prefixes;
            }
            if ((i & 2) != 0) {
                byteString = tSupportedDeeplinks.unknownFields();
            }
            return tSupportedDeeplinks.copy(list, byteString);
        }

        @ColumnNameOption("prefixes")
        public static /* synthetic */ void getPrefixes$annotations() {
        }

        public final TSupportedDeeplinks copy(List<String> prefixes, ByteString unknownFields) {
            return new TSupportedDeeplinks(prefixes, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TSupportedDeeplinks)) {
                return false;
            }
            TSupportedDeeplinks tSupportedDeeplinks = (TSupportedDeeplinks) other;
            return jl40.l(unknownFields(), tSupportedDeeplinks.unknownFields()) && jl40.l(this.prefixes, tSupportedDeeplinks.prefixes);
        }

        public final List<String> getPrefixes() {
            return this.prefixes;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.prefixes.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m548newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.prefixes.isEmpty()) {
                unr0.B("prefixes=", Internal.sanitize(this.prefixes), arrayList);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TSupportedDeeplinks{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m548newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TSupportedDeeplinks() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TSupportedDeeplinks(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.prefixes = Internal.immutableCopyOf("prefixes", list);
        }
    }

    @EventTypeOption(TCapability.EEventType.UpdateDeeplinksPrefixesEventType)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J \u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/deeplinks/TDeeplinkCapability$TUpdateDeeplinksPrefixesEvent;", "Lcom/squareup/wire/Message;", "", "prefixes", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getPrefixes$annotations", "()V", "getPrefixes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TUpdateDeeplinksPrefixesEvent extends Message {
        public static final ProtoAdapter<TUpdateDeeplinksPrefixesEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<String> prefixes;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TUpdateDeeplinksPrefixesEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TUpdateDeeplinksPrefixesEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability$TUpdateDeeplinksPrefixesEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent(arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent value) {
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getPrefixes());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent value) {
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getPrefixes()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent redact(TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent value) {
                    return TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDeeplinkCapability.TUpdateDeeplinksPrefixesEvent value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getPrefixes());
                }
            };
        }

        public /* synthetic */ TUpdateDeeplinksPrefixesEvent(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TUpdateDeeplinksPrefixesEvent copy$default(TUpdateDeeplinksPrefixesEvent tUpdateDeeplinksPrefixesEvent, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tUpdateDeeplinksPrefixesEvent.prefixes;
            }
            if ((i & 2) != 0) {
                byteString = tUpdateDeeplinksPrefixesEvent.unknownFields();
            }
            return tUpdateDeeplinksPrefixesEvent.copy(list, byteString);
        }

        @ColumnNameOption("prefixes")
        public static /* synthetic */ void getPrefixes$annotations() {
        }

        public final TUpdateDeeplinksPrefixesEvent copy(List<String> prefixes, ByteString unknownFields) {
            return new TUpdateDeeplinksPrefixesEvent(prefixes, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TUpdateDeeplinksPrefixesEvent)) {
                return false;
            }
            TUpdateDeeplinksPrefixesEvent tUpdateDeeplinksPrefixesEvent = (TUpdateDeeplinksPrefixesEvent) other;
            return jl40.l(unknownFields(), tUpdateDeeplinksPrefixesEvent.unknownFields()) && jl40.l(this.prefixes, tUpdateDeeplinksPrefixesEvent.prefixes);
        }

        public final List<String> getPrefixes() {
            return this.prefixes;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.prefixes.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m549newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.prefixes.isEmpty()) {
                unr0.B("prefixes=", Internal.sanitize(this.prefixes), arrayList);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TUpdateDeeplinksPrefixesEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m549newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TUpdateDeeplinksPrefixesEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TUpdateDeeplinksPrefixesEvent(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.prefixes = Internal.immutableCopyOf("prefixes", list);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m544newBuilder();
    }

    public TDeeplinkCapability() {
        this(null, null, null, null, 15, null);
    }

    public TDeeplinkCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
