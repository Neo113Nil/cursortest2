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
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EPickerType", "TParameters", "TState", "TShowAliceChatFilesPickerDirectiveType", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.AliceChatFilesCapabilityType)
/* loaded from: classes4.dex */
public final class TAliceChatFilesCapability extends Message {
    public static final ProtoAdapter<TAliceChatFilesCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAliceChatFilesCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAliceChatFilesCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatFilesCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TAliceChatFilesCapability.TParameters tParameters = null;
                TAliceChatFilesCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAliceChatFilesCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TAliceChatFilesCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TAliceChatFilesCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAliceChatFilesCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TAliceChatFilesCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TAliceChatFilesCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAliceChatFilesCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TAliceChatFilesCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TAliceChatFilesCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatFilesCapability redact(TAliceChatFilesCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TAliceChatFilesCapability.TParameters parameters = value.getParameters();
                TAliceChatFilesCapability.TParameters redact2 = parameters != null ? TAliceChatFilesCapability.TParameters.ADAPTER.redact(parameters) : null;
                TAliceChatFilesCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TAliceChatFilesCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAliceChatFilesCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TAliceChatFilesCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TAliceChatFilesCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TAliceChatFilesCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAliceChatFilesCapability copy$default(TAliceChatFilesCapability tAliceChatFilesCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tAliceChatFilesCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tAliceChatFilesCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tAliceChatFilesCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tAliceChatFilesCapability.unknownFields();
        }
        return tAliceChatFilesCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TAliceChatFilesCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TAliceChatFilesCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAliceChatFilesCapability)) {
            return false;
        }
        TAliceChatFilesCapability tAliceChatFilesCapability = (TAliceChatFilesCapability) other;
        return jl40.l(unknownFields(), tAliceChatFilesCapability.unknownFields()) && jl40.l(this.meta, tAliceChatFilesCapability.meta) && jl40.l(this.parameters, tAliceChatFilesCapability.parameters) && jl40.l(this.state, tAliceChatFilesCapability.state);
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
    public /* synthetic */ Void m620newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TAliceChatFilesCapability{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CAMERA", "GALLERY", "FILES", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EPickerType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EPickerType[] $VALUES;
        public static final ProtoAdapter<EPickerType> ADAPTER;
        public static final EPickerType CAMERA;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EPickerType FILES;
        public static final EPickerType GALLERY;
        private final int value;

        private static final /* synthetic */ EPickerType[] $values() {
            return new EPickerType[]{CAMERA, GALLERY, FILES};
        }

        static {
            final EPickerType ePickerType = new EPickerType("CAMERA", 0, 0);
            CAMERA = ePickerType;
            GALLERY = new EPickerType("GALLERY", 1, 2);
            FILES = new EPickerType("FILES", 2, 3);
            EPickerType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EPickerType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EPickerType>(a, syntax, ePickerType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$EPickerType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TAliceChatFilesCapability.EPickerType fromValue(int value) {
                    return TAliceChatFilesCapability.EPickerType.INSTANCE.fromValue(value);
                }
            };
        }

        private EPickerType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EPickerType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EPickerType valueOf(String str) {
            return (EPickerType) Enum.valueOf(EPickerType.class, str);
        }

        public static EPickerType[] values() {
            return (EPickerType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EPickerType fromValue(int value) {
                if (value == 0) {
                    return EPickerType.CAMERA;
                }
                if (value == 2) {
                    return EPickerType.GALLERY;
                }
                if (value != 3) {
                    return null;
                }
                return EPickerType.FILES;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatFilesCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatFilesCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatFilesCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TParameters redact(TAliceChatFilesCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatFilesCapability.TParameters value) {
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
        public /* synthetic */ Void m621newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m621newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @SpeechKitNameOption("alice_chat_files")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TShowAliceChatFilesPickerDirectiveType;", "Lcom/squareup/wire/Message;", "", "name", "", "type", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType;", "multiple", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType;ZLokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getType$annotations", "getType", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$EPickerType;", "getMultiple$annotations", "getMultiple", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowAliceChatFilesPickerDirectiveType)
    public static final class TShowAliceChatFilesPickerDirectiveType extends Message {
        public static final ProtoAdapter<TShowAliceChatFilesPickerDirectiveType> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean multiple;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$EPickerType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final EPickerType type;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowAliceChatFilesPickerDirectiveType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowAliceChatFilesPickerDirectiveType>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$TShowAliceChatFilesPickerDirectiveType$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType decode(ProtoReader reader) {
                    TAliceChatFilesCapability.EPickerType ePickerType = TAliceChatFilesCapability.EPickerType.CAMERA;
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    boolean z = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType(str, ePickerType, z, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            try {
                                ePickerType = TAliceChatFilesCapability.EPickerType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getType() != TAliceChatFilesCapability.EPickerType.CAMERA) {
                        TAliceChatFilesCapability.EPickerType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (value.getMultiple()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getMultiple()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (value.getType() != TAliceChatFilesCapability.EPickerType.CAMERA) {
                        h += TAliceChatFilesCapability.EPickerType.ADAPTER.encodedSizeWithTag(2, value.getType());
                    }
                    return value.getMultiple() ? ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getMultiple())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType redact(TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType value) {
                    return TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType.copy$default(value, null, null, false, ByteString.c, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatFilesCapability.TShowAliceChatFilesPickerDirectiveType value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getMultiple()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getMultiple()));
                    }
                    if (value.getType() != TAliceChatFilesCapability.EPickerType.CAMERA) {
                        TAliceChatFilesCapability.EPickerType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowAliceChatFilesPickerDirectiveType(String str, EPickerType ePickerType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EPickerType.CAMERA : ePickerType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShowAliceChatFilesPickerDirectiveType copy$default(TShowAliceChatFilesPickerDirectiveType tShowAliceChatFilesPickerDirectiveType, String str, EPickerType ePickerType, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowAliceChatFilesPickerDirectiveType.name;
            }
            if ((i & 2) != 0) {
                ePickerType = tShowAliceChatFilesPickerDirectiveType.type;
            }
            if ((i & 4) != 0) {
                z = tShowAliceChatFilesPickerDirectiveType.multiple;
            }
            if ((i & 8) != 0) {
                byteString = tShowAliceChatFilesPickerDirectiveType.unknownFields();
            }
            return tShowAliceChatFilesPickerDirectiveType.copy(str, ePickerType, z, byteString);
        }

        @ColumnNameOption("multiple")
        public static /* synthetic */ void getMultiple$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("type")
        public static /* synthetic */ void getType$annotations() {
        }

        public final TShowAliceChatFilesPickerDirectiveType copy(String name, EPickerType type, boolean multiple, ByteString unknownFields) {
            return new TShowAliceChatFilesPickerDirectiveType(name, type, multiple, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowAliceChatFilesPickerDirectiveType)) {
                return false;
            }
            TShowAliceChatFilesPickerDirectiveType tShowAliceChatFilesPickerDirectiveType = (TShowAliceChatFilesPickerDirectiveType) other;
            return jl40.l(unknownFields(), tShowAliceChatFilesPickerDirectiveType.unknownFields()) && jl40.l(this.name, tShowAliceChatFilesPickerDirectiveType.name) && this.type == tShowAliceChatFilesPickerDirectiveType.type && this.multiple == tShowAliceChatFilesPickerDirectiveType.multiple;
        }

        public final boolean getMultiple() {
            return this.multiple;
        }

        public final String getName() {
            return this.name;
        }

        public final EPickerType getType() {
            return this.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.multiple) + ((this.type.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m622newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("type=" + this.type);
            smw0.y("multiple=", arrayList, this.multiple);
            return a.X(arrayList, Extension.FIX_SPACE, "TShowAliceChatFilesPickerDirectiveType{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m622newBuilder();
        }

        public TShowAliceChatFilesPickerDirectiveType() {
            this(null, null, false, null, 15, null);
        }

        public TShowAliceChatFilesPickerDirectiveType(String str, EPickerType ePickerType, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.type = ePickerType;
            this.multiple = z;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatFilesCapability$TState;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatFilesCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatFilesCapability.TState(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatFilesCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatFilesCapability.TState value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatFilesCapability.TState redact(TAliceChatFilesCapability.TState value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatFilesCapability.TState value) {
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
        public /* synthetic */ Void m623newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TState{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m623newBuilder();
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
        return (Message.Builder) m620newBuilder();
    }

    public TAliceChatFilesCapability() {
        this(null, null, null, null, 15, null);
    }

    public TAliceChatFilesCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
