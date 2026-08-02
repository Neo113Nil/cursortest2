package ru.yandex.alice.protos.api.request_parts.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
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
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006&"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams;", "Lcom/squareup/wire/Message;", "", "DisableOutputSpeech", "", "DisableShouldListen", "IsParallel", "RequestType", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType;", "EnableOutputSpeechScenarioControl", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType;ZLokio/ByteString;)V", "getDisableOutputSpeech$annotations", "()V", "getDisableOutputSpeech", "()Z", "getDisableShouldListen$annotations", "getDisableShouldListen", "getIsParallel$annotations", "getIsParallel", "getRequestType$annotations", "getRequestType", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType;", "getEnableOutputSpeechScenarioControl$annotations", "getEnableOutputSpeechScenarioControl", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ERequestType", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TRequestParams extends Message {
    public static final ProtoAdapter<TRequestParams> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disable_output_speech", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean DisableOutputSpeech;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disable_should_listen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean DisableShouldListen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "enable_output_speech_scenario_control", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean EnableOutputSpeechScenarioControl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_parallel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean IsParallel;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams$ERequestType#ADAPTER", jsonName = "request_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ERequestType RequestType;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TRequestParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TRequestParams>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TRequestParams decode(ProtoReader reader) {
                TRequestParams.ERequestType eRequestType = TRequestParams.ERequestType.Undefined;
                long beginMessage = reader.beginMessage();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TRequestParams(z, z2, z3, eRequestType, z4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (nextTag == 2) {
                        z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (nextTag == 3) {
                        z3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (nextTag == 4) {
                        try {
                            eRequestType = TRequestParams.ERequestType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        z4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TRequestParams value) {
                if (value.getDisableOutputSpeech()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getDisableOutputSpeech()));
                }
                if (value.getDisableShouldListen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getDisableShouldListen()));
                }
                if (value.getIsParallel()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getRequestType() != TRequestParams.ERequestType.Undefined) {
                    TRequestParams.ERequestType.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequestType());
                }
                if (value.getEnableOutputSpeechScenarioControl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getEnableOutputSpeechScenarioControl()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TRequestParams value) {
                int h = value.unknownFields().h();
                if (value.getDisableOutputSpeech()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getDisableOutputSpeech()));
                }
                if (value.getDisableShouldListen()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getDisableShouldListen()));
                }
                if (value.getIsParallel()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getRequestType() != TRequestParams.ERequestType.Undefined) {
                    h += TRequestParams.ERequestType.ADAPTER.encodedSizeWithTag(4, value.getRequestType());
                }
                return value.getEnableOutputSpeechScenarioControl() ? ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getEnableOutputSpeechScenarioControl())) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TRequestParams redact(TRequestParams value) {
                return TRequestParams.copy$default(value, false, false, false, null, false, ByteString.c, 31, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TRequestParams value) {
                writer.writeBytes(value.unknownFields());
                if (value.getEnableOutputSpeechScenarioControl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getEnableOutputSpeechScenarioControl()));
                }
                if (value.getRequestType() != TRequestParams.ERequestType.Undefined) {
                    TRequestParams.ERequestType.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequestType());
                }
                if (value.getIsParallel()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getDisableShouldListen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getDisableShouldListen()));
                }
                if (value.getDisableOutputSpeech()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getDisableOutputSpeech()));
                }
            }
        };
    }

    public /* synthetic */ TRequestParams(boolean z, boolean z2, boolean z3, ERequestType eRequestType, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? ERequestType.Undefined : eRequestType, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TRequestParams copy$default(TRequestParams tRequestParams, boolean z, boolean z2, boolean z3, ERequestType eRequestType, boolean z4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tRequestParams.DisableOutputSpeech;
        }
        if ((i & 2) != 0) {
            z2 = tRequestParams.DisableShouldListen;
        }
        if ((i & 4) != 0) {
            z3 = tRequestParams.IsParallel;
        }
        if ((i & 8) != 0) {
            eRequestType = tRequestParams.RequestType;
        }
        if ((i & 16) != 0) {
            z4 = tRequestParams.EnableOutputSpeechScenarioControl;
        }
        if ((i & 32) != 0) {
            byteString = tRequestParams.unknownFields();
        }
        boolean z5 = z4;
        ByteString byteString2 = byteString;
        return tRequestParams.copy(z, z2, z3, eRequestType, z5, byteString2);
    }

    @ColumnNameOption("disable_output_speech")
    public static /* synthetic */ void getDisableOutputSpeech$annotations() {
    }

    @ColumnNameOption("disable_should_listen")
    public static /* synthetic */ void getDisableShouldListen$annotations() {
    }

    @ColumnNameOption("enable_output_speech_scenario_control")
    public static /* synthetic */ void getEnableOutputSpeechScenarioControl$annotations() {
    }

    @ColumnNameOption("is_parallel")
    public static /* synthetic */ void getIsParallel$annotations() {
    }

    @ColumnNameOption("request_type")
    public static /* synthetic */ void getRequestType$annotations() {
    }

    public final TRequestParams copy(boolean DisableOutputSpeech, boolean DisableShouldListen, boolean IsParallel, ERequestType RequestType, boolean EnableOutputSpeechScenarioControl, ByteString unknownFields) {
        return new TRequestParams(DisableOutputSpeech, DisableShouldListen, IsParallel, RequestType, EnableOutputSpeechScenarioControl, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TRequestParams)) {
            return false;
        }
        TRequestParams tRequestParams = (TRequestParams) other;
        return jl40.l(unknownFields(), tRequestParams.unknownFields()) && this.DisableOutputSpeech == tRequestParams.DisableOutputSpeech && this.DisableShouldListen == tRequestParams.DisableShouldListen && this.IsParallel == tRequestParams.IsParallel && this.RequestType == tRequestParams.RequestType && this.EnableOutputSpeechScenarioControl == tRequestParams.EnableOutputSpeechScenarioControl;
    }

    public final boolean getDisableOutputSpeech() {
        return this.DisableOutputSpeech;
    }

    public final boolean getDisableShouldListen() {
        return this.DisableShouldListen;
    }

    public final boolean getEnableOutputSpeechScenarioControl() {
        return this.EnableOutputSpeechScenarioControl;
    }

    public final boolean getIsParallel() {
        return this.IsParallel;
    }

    public final ERequestType getRequestType() {
        return this.RequestType;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Boolean.hashCode(this.EnableOutputSpeechScenarioControl) + ((this.RequestType.hashCode() + unr0.e(unr0.e(unr0.e(unknownFields().hashCode() * 37, 37, this.DisableOutputSpeech), 37, this.DisableShouldListen), 37, this.IsParallel)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m514newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        smw0.y("DisableOutputSpeech=", arrayList, this.DisableOutputSpeech);
        smw0.y("DisableShouldListen=", arrayList, this.DisableShouldListen);
        smw0.y("IsParallel=", arrayList, this.IsParallel);
        arrayList.add("RequestType=" + this.RequestType);
        smw0.y("EnableOutputSpeechScenarioControl=", arrayList, this.EnableOutputSpeechScenarioControl);
        return a.X(arrayList, Extension.FIX_SPACE, "TRequestParams{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Dialog", "NonDialog", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ERequestType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ERequestType[] $VALUES;
        public static final ProtoAdapter<ERequestType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ERequestType Dialog;
        public static final ERequestType NonDialog;
        public static final ERequestType Undefined;
        private final int value;

        private static final /* synthetic */ ERequestType[] $values() {
            return new ERequestType[]{Undefined, Dialog, NonDialog};
        }

        static {
            final ERequestType eRequestType = new ERequestType("Undefined", 0, 0);
            Undefined = eRequestType;
            Dialog = new ERequestType("Dialog", 1, 1);
            NonDialog = new ERequestType("NonDialog", 2, 2);
            ERequestType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(ERequestType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ERequestType>(a, syntax, eRequestType) { // from class: ru.yandex.alice.protos.api.request_parts.platform.utils.TRequestParams$ERequestType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TRequestParams.ERequestType fromValue(int value) {
                    return TRequestParams.ERequestType.INSTANCE.fromValue(value);
                }
            };
        }

        private ERequestType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ERequestType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ERequestType valueOf(String str) {
            return (ERequestType) Enum.valueOf(ERequestType.class, str);
        }

        public static ERequestType[] values() {
            return (ERequestType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TRequestParams$ERequestType;", "fromValue", "value", "", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ERequestType fromValue(int value) {
                if (value == 0) {
                    return ERequestType.Undefined;
                }
                if (value == 1) {
                    return ERequestType.Dialog;
                }
                if (value != 2) {
                    return null;
                }
                return ERequestType.NonDialog;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m514newBuilder();
    }

    public TRequestParams() {
        this(false, false, false, null, false, null, 63, null);
    }

    public TRequestParams(boolean z, boolean z2, boolean z3, ERequestType eRequestType, boolean z4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.DisableOutputSpeech = z;
        this.DisableShouldListen = z2;
        this.IsParallel = z3;
        this.RequestType = eRequestType;
        this.EnableOutputSpeechScenarioControl = z4;
    }
}
