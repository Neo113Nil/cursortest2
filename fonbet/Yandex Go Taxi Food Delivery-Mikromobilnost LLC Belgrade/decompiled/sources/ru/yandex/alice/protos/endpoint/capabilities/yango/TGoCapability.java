package ru.yandex.alice.protos.endpoint.capabilities.yango;

import NYT.yango.ColumnNameOption;
import NYT.yango.DefaultFieldFlagsOption;
import NYT.yango.EWrapperFieldFlag;
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
import ru.yandex.alice.protos.data.yango.TLatLon;
import ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability;
import ru.yandex.alice.protos.endpoint.yango.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.yango.TCapability;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@CapabilityTypeOption(TCapability.ECapabilityType.GoCapabilityType)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/yango/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/yango/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/yango/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "EActiveMode", "TState", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TGoCapability extends Message {
    public static final ProtoAdapter<TGoCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.yango.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TGoCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TGoCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TGoCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TGoCapability.TParameters tParameters = null;
                TGoCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TGoCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TGoCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TGoCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TGoCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TGoCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TGoCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TGoCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TGoCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TGoCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TGoCapability redact(TGoCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TGoCapability.TParameters parameters = value.getParameters();
                TGoCapability.TParameters redact2 = parameters != null ? TGoCapability.TParameters.ADAPTER.redact(parameters) : null;
                TGoCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TGoCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TGoCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TGoCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TGoCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TGoCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TGoCapability copy$default(TGoCapability tGoCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tGoCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tGoCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tGoCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tGoCapability.unknownFields();
        }
        return tGoCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TGoCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TGoCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TGoCapability)) {
            return false;
        }
        TGoCapability tGoCapability = (TGoCapability) other;
        return jl40.l(unknownFields(), tGoCapability.unknownFields()) && jl40.l(this.meta, tGoCapability.meta) && jl40.l(this.parameters, tGoCapability.parameters) && jl40.l(this.state, tGoCapability.state);
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
    public /* synthetic */ Void m682newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TGoCapability{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Go", "Eats", "Delivery", "Grocery", "Market", "Companion", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EActiveMode implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EActiveMode[] $VALUES;
        public static final ProtoAdapter<EActiveMode> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EActiveMode Delivery;
        public static final EActiveMode Eats;
        public static final EActiveMode Go;
        public static final EActiveMode Grocery;
        public static final EActiveMode Market;
        public static final EActiveMode Undefined;
        private final int value;

        private static final /* synthetic */ EActiveMode[] $values() {
            return new EActiveMode[]{Undefined, Go, Eats, Delivery, Grocery, Market};
        }

        static {
            final EActiveMode eActiveMode = new EActiveMode("Undefined", 0, 0);
            Undefined = eActiveMode;
            Go = new EActiveMode("Go", 1, 1);
            Eats = new EActiveMode("Eats", 2, 2);
            Delivery = new EActiveMode("Delivery", 3, 3);
            Grocery = new EActiveMode("Grocery", 4, 4);
            Market = new EActiveMode("Market", 5, 5);
            EActiveMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EActiveMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EActiveMode>(a, syntax, eActiveMode) { // from class: ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$EActiveMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TGoCapability.EActiveMode fromValue(int value) {
                    return TGoCapability.EActiveMode.INSTANCE.fromValue(value);
                }
            };
        }

        private EActiveMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EActiveMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EActiveMode valueOf(String str) {
            return (EActiveMode) Enum.valueOf(EActiveMode.class, str);
        }

        public static EActiveMode[] values() {
            return (EActiveMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode;", "fromValue", "value", "", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EActiveMode fromValue(int value) {
                if (value == 0) {
                    return EActiveMode.Undefined;
                }
                if (value == 1) {
                    return EActiveMode.Go;
                }
                if (value == 2) {
                    return EActiveMode.Eats;
                }
                if (value == 3) {
                    return EActiveMode.Delivery;
                }
                if (value == 4) {
                    return EActiveMode.Grocery;
                }
                if (value != 5) {
                    return null;
                }
                return EActiveMode.Market;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TGoCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TGoCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TGoCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TGoCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TGoCapability.TParameters redact(TGoCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TGoCapability.TParameters value) {
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
        public /* synthetic */ Void m683newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m683newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$TState;", "Lcom/squareup/wire/Message;", "", "location", "Lru/yandex/alice/protos/data/yango/TLatLon;", "activeMode", "Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/data/yango/TLatLon;Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode;Lokio/ByteString;)V", "getLocation$annotations", "()V", "getLocation", "()Lru/yandex/alice/protos/data/yango/TLatLon;", "getActiveMode$annotations", "getActiveMode", "()Lru/yandex/alice/protos/endpoint/capabilities/yango/TGoCapability$EActiveMode;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$EActiveMode#ADAPTER", jsonName = "active_mode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final EActiveMode activeMode;

        @WireField(adapter = "ru.yandex.alice.protos.data.yango.TLatLon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TLatLon location;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TGoCapability.TState decode(ProtoReader reader) {
                    TGoCapability.EActiveMode eActiveMode = TGoCapability.EActiveMode.Undefined;
                    long beginMessage = reader.beginMessage();
                    TLatLon tLatLon = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TGoCapability.TState(tLatLon, eActiveMode, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tLatLon = TLatLon.ADAPTER.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                eActiveMode = TGoCapability.EActiveMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TGoCapability.TState value) {
                    if (value.getLocation() != null) {
                        TLatLon.ADAPTER.encodeWithTag(writer, 1, (int) value.getLocation());
                    }
                    if (value.getActiveMode() != TGoCapability.EActiveMode.Undefined) {
                        TGoCapability.EActiveMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getActiveMode());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TGoCapability.TState value) {
                    int h = value.unknownFields().h();
                    if (value.getLocation() != null) {
                        h += TLatLon.ADAPTER.encodedSizeWithTag(1, value.getLocation());
                    }
                    return value.getActiveMode() != TGoCapability.EActiveMode.Undefined ? TGoCapability.EActiveMode.ADAPTER.encodedSizeWithTag(2, value.getActiveMode()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TGoCapability.TState redact(TGoCapability.TState value) {
                    TLatLon location = value.getLocation();
                    return TGoCapability.TState.copy$default(value, location != null ? TLatLon.ADAPTER.redact(location) : null, null, ByteString.c, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TGoCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getActiveMode() != TGoCapability.EActiveMode.Undefined) {
                        TGoCapability.EActiveMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getActiveMode());
                    }
                    if (value.getLocation() != null) {
                        TLatLon.ADAPTER.encodeWithTag(writer, 1, (int) value.getLocation());
                    }
                }
            };
        }

        public /* synthetic */ TState(TLatLon tLatLon, EActiveMode eActiveMode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tLatLon, (i & 2) != 0 ? EActiveMode.Undefined : eActiveMode, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, TLatLon tLatLon, EActiveMode eActiveMode, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tLatLon = tState.location;
            }
            if ((i & 2) != 0) {
                eActiveMode = tState.activeMode;
            }
            if ((i & 4) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(tLatLon, eActiveMode, byteString);
        }

        @ColumnNameOption("active_mode")
        public static /* synthetic */ void getActiveMode$annotations() {
        }

        @ColumnNameOption("location")
        public static /* synthetic */ void getLocation$annotations() {
        }

        public final TState copy(TLatLon location, EActiveMode activeMode, ByteString unknownFields) {
            return new TState(location, activeMode, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && jl40.l(this.location, tState.location) && this.activeMode == tState.activeMode;
        }

        public final EActiveMode getActiveMode() {
            return this.activeMode;
        }

        public final TLatLon getLocation() {
            return this.location;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TLatLon tLatLon = this.location;
            int hashCode2 = this.activeMode.hashCode() + ((hashCode + (tLatLon != null ? tLatLon.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m684newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TLatLon tLatLon = this.location;
            if (tLatLon != null) {
                arrayList.add("location=" + tLatLon);
            }
            arrayList.add("activeMode=" + this.activeMode);
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m684newBuilder();
        }

        public TState() {
            this(null, null, null, 7, null);
        }

        public TState(TLatLon tLatLon, EActiveMode eActiveMode, ByteString byteString) {
            super(ADAPTER, byteString);
            this.location = tLatLon;
            this.activeMode = eActiveMode;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m682newBuilder();
    }

    public TGoCapability() {
        this(null, null, null, null, 15, null);
    }

    public TGoCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
