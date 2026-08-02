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
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.ConditionEventsOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.EUnit;
import ru.yandex.alice.protos.endpoint.quark.webchat.EventTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.TRange;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\r!\"#$%&'()*+,-B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EInstance", "TParameters", "TState", "EMoveMode", "TSetAbsoluteLevelDirective", "TSetRelativeLevelDirective", "TTransitionLevelDirective", "TStopTransitionLevelDirective", "TStartCalibrationDirective", "TUpdateStateEvent", "TCondition", "TLevelFilter", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.LevelCapabilityType)
/* loaded from: classes4.dex */
public final class TLevelCapability extends Message {
    public static final ProtoAdapter<TLevelCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TLevelCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TLevelCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TLevelCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TLevelCapability.TParameters tParameters = null;
                TLevelCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TLevelCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TLevelCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TLevelCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TLevelCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TLevelCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TLevelCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TLevelCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TLevelCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TLevelCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TLevelCapability redact(TLevelCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TLevelCapability.TParameters parameters = value.getParameters();
                TLevelCapability.TParameters redact2 = parameters != null ? TLevelCapability.TParameters.ADAPTER.redact(parameters) : null;
                TLevelCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TLevelCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TLevelCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TLevelCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TLevelCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TLevelCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TLevelCapability copy$default(TLevelCapability tLevelCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tLevelCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tLevelCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tLevelCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tLevelCapability.unknownFields();
        }
        return tLevelCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TLevelCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TLevelCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TLevelCapability)) {
            return false;
        }
        TLevelCapability tLevelCapability = (TLevelCapability) other;
        return jl40.l(unknownFields(), tLevelCapability.unknownFields()) && jl40.l(this.meta, tLevelCapability.meta) && jl40.l(this.parameters, tLevelCapability.parameters) && jl40.l(this.state, tLevelCapability.state);
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
    public /* synthetic */ Void m665newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TLevelCapability{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownInstance", "TemperatureInstance", "HumidityInstance", "PressureInstance", "BrightnessInstance", "IlluminanceInstance", "CoverInstance", "TVOCInstance", "AmperageInstance", "VoltageInstance", "PowerInstance", "CO2Instance", "ParticulateMatter_1_0_Instance", "ParticulateMatter_2_5_Instance", "ParticulateMatter_10_0_Instance", "FuelInstance", "NOXInstance", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EInstance implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EInstance[] $VALUES;
        public static final ProtoAdapter<EInstance> ADAPTER;
        public static final EInstance AmperageInstance;
        public static final EInstance BrightnessInstance;
        public static final EInstance CO2Instance;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EInstance CoverInstance;
        public static final EInstance FuelInstance;
        public static final EInstance HumidityInstance;
        public static final EInstance IlluminanceInstance;
        public static final EInstance NOXInstance;
        public static final EInstance ParticulateMatter_10_0_Instance;
        public static final EInstance ParticulateMatter_1_0_Instance;
        public static final EInstance ParticulateMatter_2_5_Instance;
        public static final EInstance PowerInstance;
        public static final EInstance PressureInstance;
        public static final EInstance TVOCInstance;
        public static final EInstance TemperatureInstance;
        public static final EInstance UnknownInstance;
        public static final EInstance VoltageInstance;
        private final int value;

        private static final /* synthetic */ EInstance[] $values() {
            return new EInstance[]{UnknownInstance, TemperatureInstance, HumidityInstance, PressureInstance, BrightnessInstance, IlluminanceInstance, CoverInstance, TVOCInstance, AmperageInstance, VoltageInstance, PowerInstance, CO2Instance, ParticulateMatter_1_0_Instance, ParticulateMatter_2_5_Instance, ParticulateMatter_10_0_Instance, FuelInstance, NOXInstance};
        }

        static {
            final EInstance eInstance = new EInstance("UnknownInstance", 0, 0);
            UnknownInstance = eInstance;
            TemperatureInstance = new EInstance("TemperatureInstance", 1, 1);
            HumidityInstance = new EInstance("HumidityInstance", 2, 2);
            PressureInstance = new EInstance("PressureInstance", 3, 3);
            BrightnessInstance = new EInstance("BrightnessInstance", 4, 4);
            IlluminanceInstance = new EInstance("IlluminanceInstance", 5, 5);
            CoverInstance = new EInstance("CoverInstance", 6, 6);
            TVOCInstance = new EInstance("TVOCInstance", 7, 7);
            AmperageInstance = new EInstance("AmperageInstance", 8, 8);
            VoltageInstance = new EInstance("VoltageInstance", 9, 9);
            PowerInstance = new EInstance("PowerInstance", 10, 10);
            CO2Instance = new EInstance("CO2Instance", 11, 11);
            ParticulateMatter_1_0_Instance = new EInstance("ParticulateMatter_1_0_Instance", 12, 12);
            ParticulateMatter_2_5_Instance = new EInstance("ParticulateMatter_2_5_Instance", 13, 13);
            ParticulateMatter_10_0_Instance = new EInstance("ParticulateMatter_10_0_Instance", 14, 14);
            FuelInstance = new EInstance("FuelInstance", 15, 15);
            NOXInstance = new EInstance("NOXInstance", 16, 16);
            EInstance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EInstance.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EInstance>(a, syntax, eInstance) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EInstance$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TLevelCapability.EInstance fromValue(int value) {
                    return TLevelCapability.EInstance.INSTANCE.fromValue(value);
                }
            };
        }

        private EInstance(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EInstance fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EInstance valueOf(String str) {
            return (EInstance) Enum.valueOf(EInstance.class, str);
        }

        public static EInstance[] values() {
            return (EInstance[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EInstance fromValue(int value) {
                switch (value) {
                    case 0:
                        return EInstance.UnknownInstance;
                    case 1:
                        return EInstance.TemperatureInstance;
                    case 2:
                        return EInstance.HumidityInstance;
                    case 3:
                        return EInstance.PressureInstance;
                    case 4:
                        return EInstance.BrightnessInstance;
                    case 5:
                        return EInstance.IlluminanceInstance;
                    case 6:
                        return EInstance.CoverInstance;
                    case 7:
                        return EInstance.TVOCInstance;
                    case 8:
                        return EInstance.AmperageInstance;
                    case 9:
                        return EInstance.VoltageInstance;
                    case 10:
                        return EInstance.PowerInstance;
                    case 11:
                        return EInstance.CO2Instance;
                    case 12:
                        return EInstance.ParticulateMatter_1_0_Instance;
                    case 13:
                        return EInstance.ParticulateMatter_2_5_Instance;
                    case 14:
                        return EInstance.ParticulateMatter_10_0_Instance;
                    case 15:
                        return EInstance.FuelInstance;
                    case 16:
                        return EInstance.NOXInstance;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EMoveMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Up", "Down", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EMoveMode implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EMoveMode[] $VALUES;
        public static final ProtoAdapter<EMoveMode> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EMoveMode Down;
        public static final EMoveMode Up;
        private final int value;

        private static final /* synthetic */ EMoveMode[] $values() {
            return new EMoveMode[]{Up, Down};
        }

        static {
            final EMoveMode eMoveMode = new EMoveMode("Up", 0, 0);
            Up = eMoveMode;
            Down = new EMoveMode("Down", 1, 1);
            EMoveMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EMoveMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EMoveMode>(a, syntax, eMoveMode) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EMoveMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TLevelCapability.EMoveMode fromValue(int value) {
                    return TLevelCapability.EMoveMode.INSTANCE.fromValue(value);
                }
            };
        }

        private EMoveMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EMoveMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EMoveMode valueOf(String str) {
            return (EMoveMode) Enum.valueOf(EMoveMode.class, str);
        }

        public static EMoveMode[] values() {
            return (EMoveMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EMoveMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EMoveMode;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EMoveMode fromValue(int value) {
                if (value == 0) {
                    return EMoveMode.Up;
                }
                if (value != 1) {
                    return null;
                }
                return EMoveMode.Down;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016JA\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TCondition;", "Lcom/squareup/wire/Message;", "", "instance", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "lowerBound", "", "upperBound", "hysteresis", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Ljava/lang/Double;Ljava/lang/Double;DLokio/ByteString;)V", "getInstance$annotations", "()V", "getInstance", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "getLowerBound$annotations", "getLowerBound", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUpperBound$annotations", "getUpperBound", "getHysteresis$annotations", "getHysteresis", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Ljava/lang/Double;Ljava/lang/Double;DLokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TCondition;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ConditionEventsOption({TCapability.EEventType.LevelUpdateStateEventType})
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TCondition extends Message {
        public static final ProtoAdapter<TCondition> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final double hysteresis;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EInstance#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final EInstance instance;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "lower_bound", schemaIndex = 1, tag = 2)
        private final Double lowerBound;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "upper_bound", schemaIndex = 2, tag = 3)
        private final Double upperBound;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TCondition.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TCondition>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TCondition$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TCondition decode(ProtoReader reader) {
                    TLevelCapability.EInstance eInstance = TLevelCapability.EInstance.UnknownInstance;
                    long beginMessage = reader.beginMessage();
                    double d = 0.0d;
                    Double d2 = null;
                    Double d3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TCondition(eInstance, d2, d3, d, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                eInstance = TLevelCapability.EInstance.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            d2 = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                        } else if (nextTag == 3) {
                            d3 = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TCondition value) {
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                    if (value.getLowerBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 2, (int) value.getLowerBound());
                    }
                    if (value.getUpperBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getUpperBound());
                    }
                    if (!Double.valueOf(value.getHysteresis()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getHysteresis()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TCondition value) {
                    int h = value.unknownFields().h();
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        h += TLevelCapability.EInstance.ADAPTER.encodedSizeWithTag(1, value.getInstance());
                    }
                    if (value.getLowerBound() != null) {
                        h += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(2, value.getLowerBound());
                    }
                    if (value.getUpperBound() != null) {
                        h += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(3, value.getUpperBound());
                    }
                    return !Double.valueOf(value.getHysteresis()).equals(Double.valueOf(0.0d)) ? ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getHysteresis())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TCondition redact(TLevelCapability.TCondition value) {
                    Double lowerBound = value.getLowerBound();
                    Double redact = lowerBound != null ? ProtoAdapter.DOUBLE_VALUE.redact(lowerBound) : null;
                    Double upperBound = value.getUpperBound();
                    return TLevelCapability.TCondition.copy$default(value, null, redact, upperBound != null ? ProtoAdapter.DOUBLE_VALUE.redact(upperBound) : null, 0.0d, ByteString.c, 9, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TCondition value) {
                    writer.writeBytes(value.unknownFields());
                    if (!Double.valueOf(value.getHysteresis()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getHysteresis()));
                    }
                    if (value.getUpperBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getUpperBound());
                    }
                    if (value.getLowerBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 2, (int) value.getLowerBound());
                    }
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                }
            };
        }

        public /* synthetic */ TCondition(EInstance eInstance, Double d, Double d2, double d3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EInstance.UnknownInstance : eInstance, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TCondition copy$default(TCondition tCondition, EInstance eInstance, Double d, Double d2, double d3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eInstance = tCondition.instance;
            }
            if ((i & 2) != 0) {
                d = tCondition.lowerBound;
            }
            if ((i & 4) != 0) {
                d2 = tCondition.upperBound;
            }
            if ((i & 8) != 0) {
                d3 = tCondition.hysteresis;
            }
            if ((i & 16) != 0) {
                byteString = tCondition.unknownFields();
            }
            ByteString byteString2 = byteString;
            Double d4 = d2;
            return tCondition.copy(eInstance, d, d4, d3, byteString2);
        }

        @ColumnNameOption("hysteresis")
        public static /* synthetic */ void getHysteresis$annotations() {
        }

        @ColumnNameOption("instance")
        public static /* synthetic */ void getInstance$annotations() {
        }

        @ColumnNameOption("lower_bound")
        public static /* synthetic */ void getLowerBound$annotations() {
        }

        @ColumnNameOption("upper_bound")
        public static /* synthetic */ void getUpperBound$annotations() {
        }

        public final TCondition copy(EInstance instance, Double lowerBound, Double upperBound, double hysteresis, ByteString unknownFields) {
            return new TCondition(instance, lowerBound, upperBound, hysteresis, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TCondition)) {
                return false;
            }
            TCondition tCondition = (TCondition) other;
            return jl40.l(unknownFields(), tCondition.unknownFields()) && this.instance == tCondition.instance && jl40.i(this.lowerBound, tCondition.lowerBound) && jl40.i(this.upperBound, tCondition.upperBound) && this.hysteresis == tCondition.hysteresis;
        }

        public final double getHysteresis() {
            return this.hysteresis;
        }

        public final EInstance getInstance() {
            return this.instance;
        }

        public final Double getLowerBound() {
            return this.lowerBound;
        }

        public final Double getUpperBound() {
            return this.upperBound;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.instance.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            Double d = this.lowerBound;
            int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 37;
            Double d2 = this.upperBound;
            int hashCode3 = Double.hashCode(this.hysteresis) + ((hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m666newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("instance=" + this.instance);
            Double d = this.lowerBound;
            if (d != null) {
                arrayList.add("lowerBound=" + d);
            }
            Double d2 = this.upperBound;
            if (d2 != null) {
                arrayList.add("upperBound=" + d2);
            }
            arrayList.add("hysteresis=" + this.hysteresis);
            return a.X(arrayList, Extension.FIX_SPACE, "TCondition{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m666newBuilder();
        }

        public TCondition() {
            this(null, null, null, 0.0d, null, 31, null);
        }

        public TCondition(EInstance eInstance, Double d, Double d2, double d3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.instance = eInstance;
            this.lowerBound = d;
            this.upperBound = d2;
            this.hysteresis = d3;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J7\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010 R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TLevelFilter;", "Lcom/squareup/wire/Message;", "", "instance", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "lowerBound", "", "upperBound", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)V", "getInstance$annotations", "()V", "getInstance", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "getLowerBound$annotations", "getLowerBound", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUpperBound$annotations", "getUpperBound", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TLevelFilter;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ConditionEventsOption({TCapability.EEventType.LevelUpdateStateEventType})
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TLevelFilter extends Message {
        public static final ProtoAdapter<TLevelFilter> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EInstance#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final EInstance instance;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "lower_bound", schemaIndex = 1, tag = 2)
        private final Double lowerBound;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "upper_bound", schemaIndex = 2, tag = 3)
        private final Double upperBound;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TLevelFilter.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TLevelFilter>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TLevelFilter$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TLevelFilter decode(ProtoReader reader) {
                    TLevelCapability.EInstance eInstance = TLevelCapability.EInstance.UnknownInstance;
                    long beginMessage = reader.beginMessage();
                    Double d = null;
                    Double d2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TLevelFilter(eInstance, d, d2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                eInstance = TLevelCapability.EInstance.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            d = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            d2 = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TLevelFilter value) {
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                    if (value.getLowerBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 2, (int) value.getLowerBound());
                    }
                    if (value.getUpperBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getUpperBound());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TLevelFilter value) {
                    int h = value.unknownFields().h();
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        h += TLevelCapability.EInstance.ADAPTER.encodedSizeWithTag(1, value.getInstance());
                    }
                    if (value.getLowerBound() != null) {
                        h += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(2, value.getLowerBound());
                    }
                    return value.getUpperBound() != null ? ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(3, value.getUpperBound()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TLevelFilter redact(TLevelCapability.TLevelFilter value) {
                    Double lowerBound = value.getLowerBound();
                    Double redact = lowerBound != null ? ProtoAdapter.DOUBLE_VALUE.redact(lowerBound) : null;
                    Double upperBound = value.getUpperBound();
                    return TLevelCapability.TLevelFilter.copy$default(value, null, redact, upperBound != null ? ProtoAdapter.DOUBLE_VALUE.redact(upperBound) : null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TLevelFilter value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getUpperBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getUpperBound());
                    }
                    if (value.getLowerBound() != null) {
                        ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 2, (int) value.getLowerBound());
                    }
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                }
            };
        }

        public /* synthetic */ TLevelFilter(EInstance eInstance, Double d, Double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EInstance.UnknownInstance : eInstance, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TLevelFilter copy$default(TLevelFilter tLevelFilter, EInstance eInstance, Double d, Double d2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eInstance = tLevelFilter.instance;
            }
            if ((i & 2) != 0) {
                d = tLevelFilter.lowerBound;
            }
            if ((i & 4) != 0) {
                d2 = tLevelFilter.upperBound;
            }
            if ((i & 8) != 0) {
                byteString = tLevelFilter.unknownFields();
            }
            return tLevelFilter.copy(eInstance, d, d2, byteString);
        }

        @ColumnNameOption("instance")
        public static /* synthetic */ void getInstance$annotations() {
        }

        @ColumnNameOption("lower_bound")
        public static /* synthetic */ void getLowerBound$annotations() {
        }

        @ColumnNameOption("upper_bound")
        public static /* synthetic */ void getUpperBound$annotations() {
        }

        public final TLevelFilter copy(EInstance instance, Double lowerBound, Double upperBound, ByteString unknownFields) {
            return new TLevelFilter(instance, lowerBound, upperBound, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TLevelFilter)) {
                return false;
            }
            TLevelFilter tLevelFilter = (TLevelFilter) other;
            return jl40.l(unknownFields(), tLevelFilter.unknownFields()) && this.instance == tLevelFilter.instance && jl40.i(this.lowerBound, tLevelFilter.lowerBound) && jl40.i(this.upperBound, tLevelFilter.upperBound);
        }

        public final EInstance getInstance() {
            return this.instance;
        }

        public final Double getLowerBound() {
            return this.lowerBound;
        }

        public final Double getUpperBound() {
            return this.upperBound;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.instance.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            Double d = this.lowerBound;
            int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 37;
            Double d2 = this.upperBound;
            int hashCode3 = hashCode2 + (d2 != null ? d2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m667newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("instance=" + this.instance);
            Double d = this.lowerBound;
            if (d != null) {
                arrayList.add("lowerBound=" + d);
            }
            Double d2 = this.upperBound;
            if (d2 != null) {
                arrayList.add("upperBound=" + d2);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TLevelFilter{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m667newBuilder();
        }

        public TLevelFilter() {
            this(null, null, null, null, 15, null);
        }

        public TLevelFilter(EInstance eInstance, Double d, Double d2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.instance = eInstance;
            this.lowerBound = d;
            this.upperBound = d2;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J:\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "instance", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "range", "Lru/yandex/alice/protos/endpoint/quark/webchat/TRange;", "unit", "Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit;", "supportsCalibration", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Lru/yandex/alice/protos/endpoint/quark/webchat/TRange;Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit;ZLokio/ByteString;)V", "getInstance$annotations", "()V", "getInstance", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "getRange$annotations", "getRange", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TRange;", "getUnit$annotations", "getUnit", "()Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit;", "getSupportsCalibration$annotations", "getSupportsCalibration", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EInstance#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final EInstance instance;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TRange#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TRange range;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_calibration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final boolean supportsCalibration;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.EUnit#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final EUnit unit;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TParameters decode(ProtoReader reader) {
                    TLevelCapability.EInstance eInstance = TLevelCapability.EInstance.UnknownInstance;
                    EUnit eUnit = EUnit.NoUnit;
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    TRange tRange = null;
                    while (true) {
                        EUnit eUnit2 = eUnit;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TLevelCapability.TParameters(eInstance, tRange, eUnit2, z, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                try {
                                    eInstance = TLevelCapability.EInstance.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (nextTag == 2) {
                                tRange = TRange.ADAPTER.decode(reader);
                            } else if (nextTag == 3) {
                                try {
                                    eUnit = EUnit.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TParameters value) {
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                    if (value.getRange() != null) {
                        TRange.ADAPTER.encodeWithTag(writer, 2, (int) value.getRange());
                    }
                    if (value.getUnit() != EUnit.NoUnit) {
                        EUnit.ADAPTER.encodeWithTag(writer, 3, (int) value.getUnit());
                    }
                    if (value.getSupportsCalibration()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getSupportsCalibration()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TParameters value) {
                    int h = value.unknownFields().h();
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        h += TLevelCapability.EInstance.ADAPTER.encodedSizeWithTag(1, value.getInstance());
                    }
                    if (value.getRange() != null) {
                        h += TRange.ADAPTER.encodedSizeWithTag(2, value.getRange());
                    }
                    if (value.getUnit() != EUnit.NoUnit) {
                        h += EUnit.ADAPTER.encodedSizeWithTag(3, value.getUnit());
                    }
                    return value.getSupportsCalibration() ? ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getSupportsCalibration())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TParameters redact(TLevelCapability.TParameters value) {
                    TRange range = value.getRange();
                    return TLevelCapability.TParameters.copy$default(value, null, range != null ? TRange.ADAPTER.redact(range) : null, null, false, ByteString.c, 13, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getSupportsCalibration()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getSupportsCalibration()));
                    }
                    if (value.getUnit() != EUnit.NoUnit) {
                        EUnit.ADAPTER.encodeWithTag(writer, 3, (int) value.getUnit());
                    }
                    if (value.getRange() != null) {
                        TRange.ADAPTER.encodeWithTag(writer, 2, (int) value.getRange());
                    }
                    if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                        TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstance());
                    }
                }
            };
        }

        public /* synthetic */ TParameters(EInstance eInstance, TRange tRange, EUnit eUnit, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EInstance.UnknownInstance : eInstance, (i & 2) != 0 ? null : tRange, (i & 4) != 0 ? EUnit.NoUnit : eUnit, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TParameters copy$default(TParameters tParameters, EInstance eInstance, TRange tRange, EUnit eUnit, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eInstance = tParameters.instance;
            }
            if ((i & 2) != 0) {
                tRange = tParameters.range;
            }
            if ((i & 4) != 0) {
                eUnit = tParameters.unit;
            }
            if ((i & 8) != 0) {
                z = tParameters.supportsCalibration;
            }
            if ((i & 16) != 0) {
                byteString = tParameters.unknownFields();
            }
            ByteString byteString2 = byteString;
            EUnit eUnit2 = eUnit;
            return tParameters.copy(eInstance, tRange, eUnit2, z, byteString2);
        }

        @ColumnNameOption("instance")
        public static /* synthetic */ void getInstance$annotations() {
        }

        @ColumnNameOption("range")
        public static /* synthetic */ void getRange$annotations() {
        }

        @ColumnNameOption("supports_calibration")
        public static /* synthetic */ void getSupportsCalibration$annotations() {
        }

        @ColumnNameOption("unit")
        public static /* synthetic */ void getUnit$annotations() {
        }

        public final TParameters copy(EInstance instance, TRange range, EUnit unit, boolean supportsCalibration, ByteString unknownFields) {
            return new TParameters(instance, range, unit, supportsCalibration, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TParameters)) {
                return false;
            }
            TParameters tParameters = (TParameters) other;
            return jl40.l(unknownFields(), tParameters.unknownFields()) && this.instance == tParameters.instance && jl40.l(this.range, tParameters.range) && this.unit == tParameters.unit && this.supportsCalibration == tParameters.supportsCalibration;
        }

        public final EInstance getInstance() {
            return this.instance;
        }

        public final TRange getRange() {
            return this.range;
        }

        public final boolean getSupportsCalibration() {
            return this.supportsCalibration;
        }

        public final EUnit getUnit() {
            return this.unit;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.instance.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            TRange tRange = this.range;
            int hashCode2 = Boolean.hashCode(this.supportsCalibration) + ((this.unit.hashCode() + ((hashCode + (tRange != null ? tRange.hashCode() : 0)) * 37)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m668newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("instance=" + this.instance);
            TRange tRange = this.range;
            if (tRange != null) {
                arrayList.add("range=" + tRange);
            }
            arrayList.add("unit=" + this.unit);
            smw0.y("supportsCalibration=", arrayList, this.supportsCalibration);
            return a.X(arrayList, Extension.FIX_SPACE, "TParameters{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m668newBuilder();
        }

        public TParameters() {
            this(null, null, null, false, null, 31, null);
        }

        public TParameters(EInstance eInstance, TRange tRange, EUnit eUnit, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.instance = eInstance;
            this.range = tRange;
            this.unit = eUnit;
            this.supportsCalibration = z;
        }
    }

    @SpeechKitNameOption("set_absolute_level_directive")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TSetAbsoluteLevelDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "targetLevel", "", "transitionTime", "", "withOnOff", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DIZLokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getTargetLevel$annotations", "getTargetLevel", "()D", "getTransitionTime$annotations", "getTransitionTime", "()I", "getWithOnOff$annotations", "getWithOnOff", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.SetAbsoluteLevelDirectiveType)
    public static final class TSetAbsoluteLevelDirective extends Message {
        public static final ProtoAdapter<TSetAbsoluteLevelDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "target_level", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
        private final double targetLevel;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "transition_time", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
        private final int transitionTime;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "with_on_off", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
        private final boolean withOnOff;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TSetAbsoluteLevelDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TSetAbsoluteLevelDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TSetAbsoluteLevelDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TSetAbsoluteLevelDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    double d = 0.0d;
                    int i = 0;
                    boolean z = false;
                    while (true) {
                        double d2 = d;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TLevelCapability.TSetAbsoluteLevelDirective(str, d2, i, z, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag != 1) {
                                if (nextTag == 2) {
                                    i = ProtoAdapter.UINT32.decode(reader).intValue();
                                } else if (nextTag == 3) {
                                    z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                } else if (nextTag != 1000) {
                                    reader.readUnknownField(nextTag);
                                } else {
                                    str = ProtoAdapter.STRING.decode(reader);
                                }
                            }
                        }
                        d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TSetAbsoluteLevelDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    if (!Double.valueOf(value.getTargetLevel()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTargetLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TSetAbsoluteLevelDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName());
                    }
                    if (!Double.valueOf(value.getTargetLevel()).equals(Double.valueOf(0.0d))) {
                        h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getTargetLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        h += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getTransitionTime()));
                    }
                    return value.getWithOnOff() ? ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getWithOnOff())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TSetAbsoluteLevelDirective redact(TLevelCapability.TSetAbsoluteLevelDirective value) {
                    return TLevelCapability.TSetAbsoluteLevelDirective.copy$default(value, null, 0.0d, 0, false, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TSetAbsoluteLevelDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (!Double.valueOf(value.getTargetLevel()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTargetLevel()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TSetAbsoluteLevelDirective(String str, double d, int i, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TSetAbsoluteLevelDirective copy$default(TSetAbsoluteLevelDirective tSetAbsoluteLevelDirective, String str, double d, int i, boolean z, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tSetAbsoluteLevelDirective.name;
            }
            if ((i2 & 2) != 0) {
                d = tSetAbsoluteLevelDirective.targetLevel;
            }
            if ((i2 & 4) != 0) {
                i = tSetAbsoluteLevelDirective.transitionTime;
            }
            if ((i2 & 8) != 0) {
                z = tSetAbsoluteLevelDirective.withOnOff;
            }
            if ((i2 & 16) != 0) {
                byteString = tSetAbsoluteLevelDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            int i3 = i;
            return tSetAbsoluteLevelDirective.copy(str, d, i3, z, byteString2);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("target_level")
        public static /* synthetic */ void getTargetLevel$annotations() {
        }

        @ColumnNameOption("transition_time")
        public static /* synthetic */ void getTransitionTime$annotations() {
        }

        @ColumnNameOption("with_on_off")
        public static /* synthetic */ void getWithOnOff$annotations() {
        }

        public final TSetAbsoluteLevelDirective copy(String name, double targetLevel, int transitionTime, boolean withOnOff, ByteString unknownFields) {
            return new TSetAbsoluteLevelDirective(name, targetLevel, transitionTime, withOnOff, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TSetAbsoluteLevelDirective)) {
                return false;
            }
            TSetAbsoluteLevelDirective tSetAbsoluteLevelDirective = (TSetAbsoluteLevelDirective) other;
            return jl40.l(unknownFields(), tSetAbsoluteLevelDirective.unknownFields()) && jl40.l(this.name, tSetAbsoluteLevelDirective.name) && this.targetLevel == tSetAbsoluteLevelDirective.targetLevel && this.transitionTime == tSetAbsoluteLevelDirective.transitionTime && this.withOnOff == tSetAbsoluteLevelDirective.withOnOff;
        }

        public final String getName() {
            return this.name;
        }

        public final double getTargetLevel() {
            return this.targetLevel;
        }

        public final int getTransitionTime() {
            return this.transitionTime;
        }

        public final boolean getWithOnOff() {
            return this.withOnOff;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.withOnOff) + oyr.b(this.transitionTime, unr0.a(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.targetLevel), 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m669newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("targetLevel=" + this.targetLevel);
            arrayList.add("transitionTime=" + this.transitionTime);
            smw0.y("withOnOff=", arrayList, this.withOnOff);
            return a.X(arrayList, Extension.FIX_SPACE, "TSetAbsoluteLevelDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m669newBuilder();
        }

        public TSetAbsoluteLevelDirective() {
            this(null, 0.0d, 0, false, null, 31, null);
        }

        public TSetAbsoluteLevelDirective(String str, double d, int i, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.targetLevel = d;
            this.transitionTime = i;
            this.withOnOff = z;
        }
    }

    @SpeechKitNameOption("set_relative_level_directive")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TSetRelativeLevelDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "relativeLevel", "", "transitionTime", "", "withOnOff", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DIZLokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getRelativeLevel$annotations", "getRelativeLevel", "()D", "getTransitionTime$annotations", "getTransitionTime", "()I", "getWithOnOff$annotations", "getWithOnOff", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.SetRelativeLevelDirectiveType)
    public static final class TSetRelativeLevelDirective extends Message {
        public static final ProtoAdapter<TSetRelativeLevelDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "relative_level", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
        private final double relativeLevel;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "transition_time", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
        private final int transitionTime;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "with_on_off", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
        private final boolean withOnOff;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TSetRelativeLevelDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TSetRelativeLevelDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TSetRelativeLevelDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TSetRelativeLevelDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    double d = 0.0d;
                    int i = 0;
                    boolean z = false;
                    while (true) {
                        double d2 = d;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TLevelCapability.TSetRelativeLevelDirective(str, d2, i, z, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag != 1) {
                                if (nextTag == 2) {
                                    i = ProtoAdapter.UINT32.decode(reader).intValue();
                                } else if (nextTag == 3) {
                                    z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                } else if (nextTag != 1000) {
                                    reader.readUnknownField(nextTag);
                                } else {
                                    str = ProtoAdapter.STRING.decode(reader);
                                }
                            }
                        }
                        d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TSetRelativeLevelDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    if (!Double.valueOf(value.getRelativeLevel()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getRelativeLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TSetRelativeLevelDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName());
                    }
                    if (!Double.valueOf(value.getRelativeLevel()).equals(Double.valueOf(0.0d))) {
                        h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getRelativeLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        h += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getTransitionTime()));
                    }
                    return value.getWithOnOff() ? ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getWithOnOff())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TSetRelativeLevelDirective redact(TLevelCapability.TSetRelativeLevelDirective value) {
                    return TLevelCapability.TSetRelativeLevelDirective.copy$default(value, null, 0.0d, 0, false, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TSetRelativeLevelDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (!Double.valueOf(value.getRelativeLevel()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getRelativeLevel()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TSetRelativeLevelDirective(String str, double d, int i, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TSetRelativeLevelDirective copy$default(TSetRelativeLevelDirective tSetRelativeLevelDirective, String str, double d, int i, boolean z, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tSetRelativeLevelDirective.name;
            }
            if ((i2 & 2) != 0) {
                d = tSetRelativeLevelDirective.relativeLevel;
            }
            if ((i2 & 4) != 0) {
                i = tSetRelativeLevelDirective.transitionTime;
            }
            if ((i2 & 8) != 0) {
                z = tSetRelativeLevelDirective.withOnOff;
            }
            if ((i2 & 16) != 0) {
                byteString = tSetRelativeLevelDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            int i3 = i;
            return tSetRelativeLevelDirective.copy(str, d, i3, z, byteString2);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("relative_level")
        public static /* synthetic */ void getRelativeLevel$annotations() {
        }

        @ColumnNameOption("transition_time")
        public static /* synthetic */ void getTransitionTime$annotations() {
        }

        @ColumnNameOption("with_on_off")
        public static /* synthetic */ void getWithOnOff$annotations() {
        }

        public final TSetRelativeLevelDirective copy(String name, double relativeLevel, int transitionTime, boolean withOnOff, ByteString unknownFields) {
            return new TSetRelativeLevelDirective(name, relativeLevel, transitionTime, withOnOff, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TSetRelativeLevelDirective)) {
                return false;
            }
            TSetRelativeLevelDirective tSetRelativeLevelDirective = (TSetRelativeLevelDirective) other;
            return jl40.l(unknownFields(), tSetRelativeLevelDirective.unknownFields()) && jl40.l(this.name, tSetRelativeLevelDirective.name) && this.relativeLevel == tSetRelativeLevelDirective.relativeLevel && this.transitionTime == tSetRelativeLevelDirective.transitionTime && this.withOnOff == tSetRelativeLevelDirective.withOnOff;
        }

        public final String getName() {
            return this.name;
        }

        public final double getRelativeLevel() {
            return this.relativeLevel;
        }

        public final int getTransitionTime() {
            return this.transitionTime;
        }

        public final boolean getWithOnOff() {
            return this.withOnOff;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.withOnOff) + oyr.b(this.transitionTime, unr0.a(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.relativeLevel), 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m670newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("relativeLevel=" + this.relativeLevel);
            arrayList.add("transitionTime=" + this.transitionTime);
            smw0.y("withOnOff=", arrayList, this.withOnOff);
            return a.X(arrayList, Extension.FIX_SPACE, "TSetRelativeLevelDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m670newBuilder();
        }

        public TSetRelativeLevelDirective() {
            this(null, 0.0d, 0, false, null, 31, null);
        }

        public TSetRelativeLevelDirective(String str, double d, int i, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.relativeLevel = d;
            this.transitionTime = i;
            this.withOnOff = z;
        }
    }

    @SpeechKitNameOption("start_calibration_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TStartCalibrationDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.StartCalibrationLevelDirectiveType)
    public static final class TStartCalibrationDirective extends Message {
        public static final ProtoAdapter<TStartCalibrationDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TStartCalibrationDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TStartCalibrationDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TStartCalibrationDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TStartCalibrationDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TStartCalibrationDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1000) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TStartCalibrationDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TStartCalibrationDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TStartCalibrationDirective redact(TLevelCapability.TStartCalibrationDirective value) {
                    return TLevelCapability.TStartCalibrationDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TStartCalibrationDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TStartCalibrationDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TStartCalibrationDirective copy$default(TStartCalibrationDirective tStartCalibrationDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tStartCalibrationDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tStartCalibrationDirective.unknownFields();
            }
            return tStartCalibrationDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TStartCalibrationDirective copy(String name, ByteString unknownFields) {
            return new TStartCalibrationDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TStartCalibrationDirective)) {
                return false;
            }
            TStartCalibrationDirective tStartCalibrationDirective = (TStartCalibrationDirective) other;
            return jl40.l(unknownFields(), tStartCalibrationDirective.unknownFields()) && jl40.l(this.name, tStartCalibrationDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m671newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TStartCalibrationDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m671newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TStartCalibrationDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TStartCalibrationDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TState;", "Lcom/squareup/wire/Message;", "", "level", "", "calibrating", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DZLokio/ByteString;)V", "getLevel$annotations", "()V", "getLevel", "()D", "getCalibrating$annotations", "getCalibrating", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean calibrating;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double level;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    double d = 0.0d;
                    boolean z = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TState(d, z, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TState value) {
                    if (!Double.valueOf(value.getLevel()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getLevel()));
                    }
                    if (value.getCalibrating()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getCalibrating()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TState value) {
                    int h = value.unknownFields().h();
                    if (!Double.valueOf(value.getLevel()).equals(Double.valueOf(0.0d))) {
                        h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getLevel()));
                    }
                    return value.getCalibrating() ? ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getCalibrating())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TState redact(TLevelCapability.TState value) {
                    return TLevelCapability.TState.copy$default(value, 0.0d, false, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getCalibrating()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getCalibrating()));
                    }
                    if (Double.valueOf(value.getLevel()).equals(Double.valueOf(0.0d))) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getLevel()));
                }
            };
        }

        public /* synthetic */ TState(double d, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, double d, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = tState.level;
            }
            if ((i & 2) != 0) {
                z = tState.calibrating;
            }
            if ((i & 4) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(d, z, byteString);
        }

        @ColumnNameOption("calibrating")
        public static /* synthetic */ void getCalibrating$annotations() {
        }

        @ColumnNameOption("level")
        public static /* synthetic */ void getLevel$annotations() {
        }

        public final TState copy(double level, boolean calibrating, ByteString unknownFields) {
            return new TState(level, calibrating, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && this.level == tState.level && this.calibrating == tState.calibrating;
        }

        public final boolean getCalibrating() {
            return this.calibrating;
        }

        public final double getLevel() {
            return this.level;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.calibrating) + unr0.a(unknownFields().hashCode() * 37, 37, this.level);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m672newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("level=" + this.level);
            smw0.y("calibrating=", arrayList, this.calibrating);
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m672newBuilder();
        }

        public TState() {
            this(0.0d, false, null, 7, null);
        }

        public TState(double d, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.level = d;
            this.calibrating = z;
        }
    }

    @SpeechKitNameOption("stop_transition_level_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TStopTransitionLevelDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.StopTransitionLevelDirectiveType)
    public static final class TStopTransitionLevelDirective extends Message {
        public static final ProtoAdapter<TStopTransitionLevelDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TStopTransitionLevelDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TStopTransitionLevelDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TStopTransitionLevelDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TStopTransitionLevelDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TStopTransitionLevelDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1000) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TStopTransitionLevelDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TStopTransitionLevelDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TStopTransitionLevelDirective redact(TLevelCapability.TStopTransitionLevelDirective value) {
                    return TLevelCapability.TStopTransitionLevelDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TStopTransitionLevelDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TStopTransitionLevelDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TStopTransitionLevelDirective copy$default(TStopTransitionLevelDirective tStopTransitionLevelDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tStopTransitionLevelDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tStopTransitionLevelDirective.unknownFields();
            }
            return tStopTransitionLevelDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TStopTransitionLevelDirective copy(String name, ByteString unknownFields) {
            return new TStopTransitionLevelDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TStopTransitionLevelDirective)) {
                return false;
            }
            TStopTransitionLevelDirective tStopTransitionLevelDirective = (TStopTransitionLevelDirective) other;
            return jl40.l(unknownFields(), tStopTransitionLevelDirective.unknownFields()) && jl40.l(this.name, tStopTransitionLevelDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m673newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TStopTransitionLevelDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m673newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TStopTransitionLevelDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TStopTransitionLevelDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("transition_level_directive")
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JB\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TTransitionLevelDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "startLevel", "", "endLevel", "transitionTime", "", "withOnOff", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DDIZLokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getStartLevel$annotations", "getStartLevel", "()D", "getEndLevel$annotations", "getEndLevel", "getTransitionTime$annotations", "getTransitionTime", "()I", "getWithOnOff$annotations", "getWithOnOff", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.TransitionLevelDirectiveType)
    public static final class TTransitionLevelDirective extends Message {
        public static final ProtoAdapter<TTransitionLevelDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "end_level", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
        private final double endLevel;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "start_level", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
        private final double startLevel;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "transition_time", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
        private final int transitionTime;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "with_on_off", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
        private final boolean withOnOff;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TTransitionLevelDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TTransitionLevelDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TTransitionLevelDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TTransitionLevelDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    double d = 0.0d;
                    int i = 0;
                    boolean z = false;
                    double d2 = 0.0d;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TTransitionLevelDirective(str, d2, d, i, z, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            d2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (nextTag == 2) {
                            d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (nextTag == 3) {
                            i = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (nextTag == 4) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag != 1000) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TTransitionLevelDirective value) {
                    Double valueOf = Double.valueOf(0.0d);
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    if (!Double.valueOf(value.getStartLevel()).equals(valueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getStartLevel()));
                    }
                    if (!Double.valueOf(value.getEndLevel()).equals(valueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getEndLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TTransitionLevelDirective value) {
                    Double valueOf = Double.valueOf(0.0d);
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName());
                    }
                    if (!Double.valueOf(value.getStartLevel()).equals(valueOf)) {
                        h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getStartLevel()));
                    }
                    if (!Double.valueOf(value.getEndLevel()).equals(valueOf)) {
                        h += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getEndLevel()));
                    }
                    if (value.getTransitionTime() != 0) {
                        h += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getTransitionTime()));
                    }
                    return value.getWithOnOff() ? ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getWithOnOff())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TTransitionLevelDirective redact(TLevelCapability.TTransitionLevelDirective value) {
                    return TLevelCapability.TTransitionLevelDirective.copy$default(value, null, 0.0d, 0.0d, 0, false, ByteString.c, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TTransitionLevelDirective value) {
                    Double valueOf = Double.valueOf(0.0d);
                    writer.writeBytes(value.unknownFields());
                    if (value.getWithOnOff()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getWithOnOff()));
                    }
                    if (value.getTransitionTime() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTransitionTime()));
                    }
                    if (!Double.valueOf(value.getEndLevel()).equals(valueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getEndLevel()));
                    }
                    if (!Double.valueOf(value.getStartLevel()).equals(valueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getStartLevel()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TTransitionLevelDirective(String str, double d, double d2, int i, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TTransitionLevelDirective copy$default(TTransitionLevelDirective tTransitionLevelDirective, String str, double d, double d2, int i, boolean z, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tTransitionLevelDirective.name;
            }
            if ((i2 & 2) != 0) {
                d = tTransitionLevelDirective.startLevel;
            }
            if ((i2 & 4) != 0) {
                d2 = tTransitionLevelDirective.endLevel;
            }
            if ((i2 & 8) != 0) {
                i = tTransitionLevelDirective.transitionTime;
            }
            if ((i2 & 16) != 0) {
                z = tTransitionLevelDirective.withOnOff;
            }
            if ((i2 & 32) != 0) {
                byteString = tTransitionLevelDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            int i3 = i;
            double d3 = d2;
            return tTransitionLevelDirective.copy(str, d, d3, i3, z, byteString2);
        }

        @ColumnNameOption("end_level")
        public static /* synthetic */ void getEndLevel$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("start_level")
        public static /* synthetic */ void getStartLevel$annotations() {
        }

        @ColumnNameOption("transition_time")
        public static /* synthetic */ void getTransitionTime$annotations() {
        }

        @ColumnNameOption("with_on_off")
        public static /* synthetic */ void getWithOnOff$annotations() {
        }

        public final TTransitionLevelDirective copy(String name, double startLevel, double endLevel, int transitionTime, boolean withOnOff, ByteString unknownFields) {
            return new TTransitionLevelDirective(name, startLevel, endLevel, transitionTime, withOnOff, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TTransitionLevelDirective)) {
                return false;
            }
            TTransitionLevelDirective tTransitionLevelDirective = (TTransitionLevelDirective) other;
            return jl40.l(unknownFields(), tTransitionLevelDirective.unknownFields()) && jl40.l(this.name, tTransitionLevelDirective.name) && this.startLevel == tTransitionLevelDirective.startLevel && this.endLevel == tTransitionLevelDirective.endLevel && this.transitionTime == tTransitionLevelDirective.transitionTime && this.withOnOff == tTransitionLevelDirective.withOnOff;
        }

        public final double getEndLevel() {
            return this.endLevel;
        }

        public final String getName() {
            return this.name;
        }

        public final double getStartLevel() {
            return this.startLevel;
        }

        public final int getTransitionTime() {
            return this.transitionTime;
        }

        public final boolean getWithOnOff() {
            return this.withOnOff;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.withOnOff) + oyr.b(this.transitionTime, unr0.a(unr0.a(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.startLevel), 37, this.endLevel), 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m674newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("startLevel=" + this.startLevel);
            arrayList.add("endLevel=" + this.endLevel);
            arrayList.add("transitionTime=" + this.transitionTime);
            smw0.y("withOnOff=", arrayList, this.withOnOff);
            return a.X(arrayList, Extension.FIX_SPACE, "TTransitionLevelDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m674newBuilder();
        }

        public TTransitionLevelDirective() {
            this(null, 0.0d, 0.0d, 0, false, null, 63, null);
        }

        public TTransitionLevelDirective(String str, double d, double d2, int i, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.startLevel = d;
            this.endLevel = d2;
            this.transitionTime = i;
            this.withOnOff = z;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$TUpdateStateEvent;", "Lcom/squareup/wire/Message;", "", "capability", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability;Lokio/ByteString;)V", "getCapability$annotations", "()V", "getCapability", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @EventTypeOption(TCapability.EEventType.LevelUpdateStateEventType)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TUpdateStateEvent extends Message {
        public static final ProtoAdapter<TUpdateStateEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TLevelCapability capability;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TUpdateStateEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TUpdateStateEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$TUpdateStateEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TUpdateStateEvent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TLevelCapability tLevelCapability = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TLevelCapability.TUpdateStateEvent(tLevelCapability, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tLevelCapability = TLevelCapability.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TLevelCapability.TUpdateStateEvent value) {
                    if (value.getCapability() != null) {
                        TLevelCapability.ADAPTER.encodeWithTag(writer, 1, (int) value.getCapability());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TLevelCapability.TUpdateStateEvent value) {
                    int h = value.unknownFields().h();
                    return value.getCapability() != null ? TLevelCapability.ADAPTER.encodedSizeWithTag(1, value.getCapability()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TLevelCapability.TUpdateStateEvent redact(TLevelCapability.TUpdateStateEvent value) {
                    TLevelCapability capability = value.getCapability();
                    return value.copy(capability != null ? TLevelCapability.ADAPTER.redact(capability) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TLevelCapability.TUpdateStateEvent value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getCapability() != null) {
                        TLevelCapability.ADAPTER.encodeWithTag(writer, 1, (int) value.getCapability());
                    }
                }
            };
        }

        public /* synthetic */ TUpdateStateEvent(TLevelCapability tLevelCapability, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tLevelCapability, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TUpdateStateEvent copy$default(TUpdateStateEvent tUpdateStateEvent, TLevelCapability tLevelCapability, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tLevelCapability = tUpdateStateEvent.capability;
            }
            if ((i & 2) != 0) {
                byteString = tUpdateStateEvent.unknownFields();
            }
            return tUpdateStateEvent.copy(tLevelCapability, byteString);
        }

        @ColumnNameOption("capability")
        public static /* synthetic */ void getCapability$annotations() {
        }

        public final TUpdateStateEvent copy(TLevelCapability capability, ByteString unknownFields) {
            return new TUpdateStateEvent(capability, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TUpdateStateEvent)) {
                return false;
            }
            TUpdateStateEvent tUpdateStateEvent = (TUpdateStateEvent) other;
            return jl40.l(unknownFields(), tUpdateStateEvent.unknownFields()) && jl40.l(this.capability, tUpdateStateEvent.capability);
        }

        public final TLevelCapability getCapability() {
            return this.capability;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TLevelCapability tLevelCapability = this.capability;
            int hashCode2 = hashCode + (tLevelCapability != null ? tLevelCapability.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m675newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TLevelCapability tLevelCapability = this.capability;
            if (tLevelCapability != null) {
                arrayList.add("capability=" + tLevelCapability);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TUpdateStateEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m675newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TUpdateStateEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TUpdateStateEvent(TLevelCapability tLevelCapability, ByteString byteString) {
            super(ADAPTER, byteString);
            this.capability = tLevelCapability;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m665newBuilder();
    }

    public TLevelCapability() {
        this(null, null, null, null, 15, null);
    }

    public TLevelCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
