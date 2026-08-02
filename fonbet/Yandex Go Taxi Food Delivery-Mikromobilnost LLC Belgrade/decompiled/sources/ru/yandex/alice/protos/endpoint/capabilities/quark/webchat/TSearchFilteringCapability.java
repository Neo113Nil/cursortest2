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
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "ESearchFilteringMode", "TState", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.SearchFilteringCapabilityType)
/* loaded from: classes4.dex */
public final class TSearchFilteringCapability extends Message {
    public static final ProtoAdapter<TSearchFilteringCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TSearchFilteringCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TSearchFilteringCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TSearchFilteringCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TSearchFilteringCapability.TParameters tParameters = null;
                TSearchFilteringCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TSearchFilteringCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TSearchFilteringCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TSearchFilteringCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TSearchFilteringCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TSearchFilteringCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TSearchFilteringCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TSearchFilteringCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TSearchFilteringCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TSearchFilteringCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TSearchFilteringCapability redact(TSearchFilteringCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TSearchFilteringCapability.TParameters parameters = value.getParameters();
                TSearchFilteringCapability.TParameters redact2 = parameters != null ? TSearchFilteringCapability.TParameters.ADAPTER.redact(parameters) : null;
                TSearchFilteringCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TSearchFilteringCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TSearchFilteringCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TSearchFilteringCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TSearchFilteringCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TSearchFilteringCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TSearchFilteringCapability copy$default(TSearchFilteringCapability tSearchFilteringCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tSearchFilteringCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tSearchFilteringCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tSearchFilteringCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tSearchFilteringCapability.unknownFields();
        }
        return tSearchFilteringCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TSearchFilteringCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TSearchFilteringCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TSearchFilteringCapability)) {
            return false;
        }
        TSearchFilteringCapability tSearchFilteringCapability = (TSearchFilteringCapability) other;
        return jl40.l(unknownFields(), tSearchFilteringCapability.unknownFields()) && jl40.l(this.meta, tSearchFilteringCapability.meta) && jl40.l(this.parameters, tSearchFilteringCapability.parameters) && jl40.l(this.state, tSearchFilteringCapability.state);
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
    public /* synthetic */ Void m679newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TSearchFilteringCapability{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MODERATE", "FAMILY", "CHILD", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESearchFilteringMode implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ESearchFilteringMode[] $VALUES;
        public static final ProtoAdapter<ESearchFilteringMode> ADAPTER;
        public static final ESearchFilteringMode CHILD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ESearchFilteringMode FAMILY;
        public static final ESearchFilteringMode MODERATE;
        private final int value;

        private static final /* synthetic */ ESearchFilteringMode[] $values() {
            return new ESearchFilteringMode[]{MODERATE, FAMILY, CHILD};
        }

        static {
            final ESearchFilteringMode eSearchFilteringMode = new ESearchFilteringMode("MODERATE", 0, 0);
            MODERATE = eSearchFilteringMode;
            FAMILY = new ESearchFilteringMode("FAMILY", 1, 1);
            CHILD = new ESearchFilteringMode("CHILD", 2, 2);
            ESearchFilteringMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(ESearchFilteringMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ESearchFilteringMode>(a, syntax, eSearchFilteringMode) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$ESearchFilteringMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TSearchFilteringCapability.ESearchFilteringMode fromValue(int value) {
                    return TSearchFilteringCapability.ESearchFilteringMode.INSTANCE.fromValue(value);
                }
            };
        }

        private ESearchFilteringMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ESearchFilteringMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ESearchFilteringMode valueOf(String str) {
            return (ESearchFilteringMode) Enum.valueOf(ESearchFilteringMode.class, str);
        }

        public static ESearchFilteringMode[] values() {
            return (ESearchFilteringMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ESearchFilteringMode fromValue(int value) {
                if (value == 0) {
                    return ESearchFilteringMode.MODERATE;
                }
                if (value == 1) {
                    return ESearchFilteringMode.FAMILY;
                }
                if (value != 2) {
                    return null;
                }
                return ESearchFilteringMode.CHILD;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TSearchFilteringCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TSearchFilteringCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TSearchFilteringCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TSearchFilteringCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TSearchFilteringCapability.TParameters redact(TSearchFilteringCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TSearchFilteringCapability.TParameters value) {
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
        public /* synthetic */ Void m680newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m680newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$TState;", "Lcom/squareup/wire/Message;", "", "filteringMode", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode;Lokio/ByteString;)V", "getFilteringMode$annotations", "()V", "getFilteringMode", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TSearchFilteringCapability$ESearchFilteringMode;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$ESearchFilteringMode#ADAPTER", jsonName = "filtering_mode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ESearchFilteringMode filteringMode;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TSearchFilteringCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TSearchFilteringCapability.TState decode(ProtoReader reader) {
                    TSearchFilteringCapability.ESearchFilteringMode eSearchFilteringMode = TSearchFilteringCapability.ESearchFilteringMode.MODERATE;
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TSearchFilteringCapability.TState(eSearchFilteringMode, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                eSearchFilteringMode = TSearchFilteringCapability.ESearchFilteringMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TSearchFilteringCapability.TState value) {
                    if (value.getFilteringMode() != TSearchFilteringCapability.ESearchFilteringMode.MODERATE) {
                        TSearchFilteringCapability.ESearchFilteringMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getFilteringMode());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TSearchFilteringCapability.TState value) {
                    int h = value.unknownFields().h();
                    return value.getFilteringMode() != TSearchFilteringCapability.ESearchFilteringMode.MODERATE ? TSearchFilteringCapability.ESearchFilteringMode.ADAPTER.encodedSizeWithTag(1, value.getFilteringMode()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TSearchFilteringCapability.TState redact(TSearchFilteringCapability.TState value) {
                    return TSearchFilteringCapability.TState.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TSearchFilteringCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getFilteringMode() != TSearchFilteringCapability.ESearchFilteringMode.MODERATE) {
                        TSearchFilteringCapability.ESearchFilteringMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getFilteringMode());
                    }
                }
            };
        }

        public /* synthetic */ TState(ESearchFilteringMode eSearchFilteringMode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ESearchFilteringMode.MODERATE : eSearchFilteringMode, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, ESearchFilteringMode eSearchFilteringMode, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eSearchFilteringMode = tState.filteringMode;
            }
            if ((i & 2) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(eSearchFilteringMode, byteString);
        }

        @ColumnNameOption("filtering_mode")
        public static /* synthetic */ void getFilteringMode$annotations() {
        }

        public final TState copy(ESearchFilteringMode filteringMode, ByteString unknownFields) {
            return new TState(filteringMode, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && this.filteringMode == tState.filteringMode;
        }

        public final ESearchFilteringMode getFilteringMode() {
            return this.filteringMode;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.filteringMode.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m681newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("filteringMode=" + this.filteringMode);
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m681newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TState(ESearchFilteringMode eSearchFilteringMode, ByteString byteString) {
            super(ADAPTER, byteString);
            this.filteringMode = eSearchFilteringMode;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m679newBuilder();
    }

    public TSearchFilteringCapability() {
        this(null, null, null, null, 15, null);
    }

    public TSearchFilteringCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
