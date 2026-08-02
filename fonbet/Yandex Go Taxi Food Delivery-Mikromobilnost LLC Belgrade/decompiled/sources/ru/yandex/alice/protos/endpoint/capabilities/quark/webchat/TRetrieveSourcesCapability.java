package ru.yandex.alice.protos.endpoint.capabilities.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import com.adjust.sdk.Constants;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import defpackage.smw0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ESourceType", "TParameters", "TState", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.RetrieveSourcesCapabilityType)
/* loaded from: classes4.dex */
public final class TRetrieveSourcesCapability extends Message {
    public static final ProtoAdapter<TRetrieveSourcesCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TRetrieveSourcesCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TRetrieveSourcesCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TRetrieveSourcesCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TRetrieveSourcesCapability.TParameters tParameters = null;
                TRetrieveSourcesCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TRetrieveSourcesCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TRetrieveSourcesCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TRetrieveSourcesCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TRetrieveSourcesCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TRetrieveSourcesCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TRetrieveSourcesCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TRetrieveSourcesCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TRetrieveSourcesCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TRetrieveSourcesCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TRetrieveSourcesCapability redact(TRetrieveSourcesCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TRetrieveSourcesCapability.TParameters parameters = value.getParameters();
                TRetrieveSourcesCapability.TParameters redact2 = parameters != null ? TRetrieveSourcesCapability.TParameters.ADAPTER.redact(parameters) : null;
                TRetrieveSourcesCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TRetrieveSourcesCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TRetrieveSourcesCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TRetrieveSourcesCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TRetrieveSourcesCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TRetrieveSourcesCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TRetrieveSourcesCapability copy$default(TRetrieveSourcesCapability tRetrieveSourcesCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tRetrieveSourcesCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tRetrieveSourcesCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tRetrieveSourcesCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tRetrieveSourcesCapability.unknownFields();
        }
        return tRetrieveSourcesCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TRetrieveSourcesCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TRetrieveSourcesCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TRetrieveSourcesCapability)) {
            return false;
        }
        TRetrieveSourcesCapability tRetrieveSourcesCapability = (TRetrieveSourcesCapability) other;
        return jl40.l(unknownFields(), tRetrieveSourcesCapability.unknownFields()) && jl40.l(this.meta, tRetrieveSourcesCapability.meta) && jl40.l(this.parameters, tRetrieveSourcesCapability.parameters) && jl40.l(this.state, tRetrieveSourcesCapability.state);
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
    public /* synthetic */ Void m676newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TRetrieveSourcesCapability{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$ESourceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SourceTypeUndefined", "SourceTypeMail", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESourceType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ESourceType[] $VALUES;
        public static final ProtoAdapter<ESourceType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ESourceType SourceTypeMail;
        public static final ESourceType SourceTypeUndefined;
        private final int value;

        private static final /* synthetic */ ESourceType[] $values() {
            return new ESourceType[]{SourceTypeUndefined, SourceTypeMail};
        }

        static {
            final ESourceType eSourceType = new ESourceType("SourceTypeUndefined", 0, 0);
            SourceTypeUndefined = eSourceType;
            SourceTypeMail = new ESourceType("SourceTypeMail", 1, 1);
            ESourceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(ESourceType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ESourceType>(a, syntax, eSourceType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$ESourceType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TRetrieveSourcesCapability.ESourceType fromValue(int value) {
                    return TRetrieveSourcesCapability.ESourceType.INSTANCE.fromValue(value);
                }
            };
        }

        private ESourceType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ESourceType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ESourceType valueOf(String str) {
            return (ESourceType) Enum.valueOf(ESourceType.class, str);
        }

        public static ESourceType[] values() {
            return (ESourceType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$ESourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$ESourceType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ESourceType fromValue(int value) {
                if (value == 0) {
                    return ESourceType.SourceTypeUndefined;
                }
                if (value != 1) {
                    return null;
                }
                return ESourceType.SourceTypeMail;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "sources", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$ESourceType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getSources$annotations", "()V", "getSources", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$ESourceType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<ESourceType> sources;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TRetrieveSourcesCapability.TParameters decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TRetrieveSourcesCapability.TParameters(arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                TRetrieveSourcesCapability.ESourceType.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TRetrieveSourcesCapability.TParameters value) {
                    TRetrieveSourcesCapability.ESourceType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSources());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TRetrieveSourcesCapability.TParameters value) {
                    return TRetrieveSourcesCapability.ESourceType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSources()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TRetrieveSourcesCapability.TParameters redact(TRetrieveSourcesCapability.TParameters value) {
                    return TRetrieveSourcesCapability.TParameters.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TRetrieveSourcesCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                    TRetrieveSourcesCapability.ESourceType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSources());
                }
            };
        }

        public /* synthetic */ TParameters(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TParameters copy$default(TParameters tParameters, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tParameters.sources;
            }
            if ((i & 2) != 0) {
                byteString = tParameters.unknownFields();
            }
            return tParameters.copy(list, byteString);
        }

        @ColumnNameOption("sources")
        public static /* synthetic */ void getSources$annotations() {
        }

        public final TParameters copy(List<? extends ESourceType> sources, ByteString unknownFields) {
            return new TParameters(sources, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TParameters)) {
                return false;
            }
            TParameters tParameters = (TParameters) other;
            return jl40.l(unknownFields(), tParameters.unknownFields()) && jl40.l(this.sources, tParameters.sources);
        }

        public final List<ESourceType> getSources() {
            return this.sources;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.sources.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m677newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.sources.isEmpty()) {
                smw0.x("sources=", arrayList, this.sources);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TParameters{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m677newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TParameters(List<? extends ESourceType> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.sources = Internal.immutableCopyOf("sources", list);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TRetrieveSourcesCapability$TState;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TRetrieveSourcesCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TRetrieveSourcesCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TRetrieveSourcesCapability.TState(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TRetrieveSourcesCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TRetrieveSourcesCapability.TState value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TRetrieveSourcesCapability.TState redact(TRetrieveSourcesCapability.TState value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TRetrieveSourcesCapability.TState value) {
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
        public /* synthetic */ Void m678newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TState{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m678newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TState(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m676newBuilder();
    }

    public TRetrieveSourcesCapability() {
        this(null, null, null, null, 15, null);
    }

    public TRetrieveSourcesCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
