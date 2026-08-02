package ru.yandex.alice.protos.api.alice_mode_info.platform.utils;

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
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo;", "Lcom/squareup/wire/Message;", "", "Mode", "Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode;", "Preset", "", "HackMode", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMode$annotations", "()V", "getMode", "()Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode;", "getPreset$annotations", "getPreset", "()Ljava/lang/String;", "getHackMode$annotations", "getHackMode", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EMode", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TAlice2ModeInfo extends Message {
    public static final ProtoAdapter<TAlice2ModeInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hack_mode", schemaIndex = 2, tag = 3)
    private final String HackMode;

    @WireField(adapter = "ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo$EMode#ADAPTER", jsonName = "mode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EMode Mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "preset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String Preset;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAlice2ModeInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAlice2ModeInfo>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAlice2ModeInfo decode(ProtoReader reader) {
                TAlice2ModeInfo.EMode eMode = TAlice2ModeInfo.EMode.Undefined;
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAlice2ModeInfo(eMode, str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            eMode = TAlice2ModeInfo.EMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAlice2ModeInfo value) {
                if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                    TAlice2ModeInfo.EMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getMode());
                }
                if (!jl40.l(value.getPreset(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPreset());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHackMode());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAlice2ModeInfo value) {
                int h = value.unknownFields().h();
                if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                    h += TAlice2ModeInfo.EMode.ADAPTER.encodedSizeWithTag(1, value.getMode());
                }
                if (!jl40.l(value.getPreset(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPreset());
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHackMode()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAlice2ModeInfo redact(TAlice2ModeInfo value) {
                return TAlice2ModeInfo.copy$default(value, null, null, null, ByteString.c, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAlice2ModeInfo value) {
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getHackMode());
                if (!jl40.l(value.getPreset(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPreset());
                }
                if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                    TAlice2ModeInfo.EMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getMode());
                }
            }
        };
    }

    public /* synthetic */ TAlice2ModeInfo(EMode eMode, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EMode.Undefined : eMode, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAlice2ModeInfo copy$default(TAlice2ModeInfo tAlice2ModeInfo, EMode eMode, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eMode = tAlice2ModeInfo.Mode;
        }
        if ((i & 2) != 0) {
            str = tAlice2ModeInfo.Preset;
        }
        if ((i & 4) != 0) {
            str2 = tAlice2ModeInfo.HackMode;
        }
        if ((i & 8) != 0) {
            byteString = tAlice2ModeInfo.unknownFields();
        }
        return tAlice2ModeInfo.copy(eMode, str, str2, byteString);
    }

    @ColumnNameOption("hack_mode")
    public static /* synthetic */ void getHackMode$annotations() {
    }

    @ColumnNameOption("mode")
    public static /* synthetic */ void getMode$annotations() {
    }

    @ColumnNameOption("preset")
    public static /* synthetic */ void getPreset$annotations() {
    }

    public final TAlice2ModeInfo copy(EMode Mode, String Preset, String HackMode, ByteString unknownFields) {
        return new TAlice2ModeInfo(Mode, Preset, HackMode, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAlice2ModeInfo)) {
            return false;
        }
        TAlice2ModeInfo tAlice2ModeInfo = (TAlice2ModeInfo) other;
        return jl40.l(unknownFields(), tAlice2ModeInfo.unknownFields()) && this.Mode == tAlice2ModeInfo.Mode && jl40.l(this.Preset, tAlice2ModeInfo.Preset) && jl40.l(this.HackMode, tAlice2ModeInfo.HackMode);
    }

    public final String getHackMode() {
        return this.HackMode;
    }

    public final EMode getMode() {
        return this.Mode;
    }

    public final String getPreset() {
        return this.Preset;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int b = unr0.b((this.Mode.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.Preset);
        String str = this.HackMode;
        int hashCode = b + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m504newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Mode=" + this.Mode);
        unr0.B("Preset=", Internal.sanitize(this.Preset), arrayList);
        String str = this.HackMode;
        if (str != null) {
            unr0.B("HackMode=", Internal.sanitize(str), arrayList);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TAlice2ModeInfo{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Base", "Pro", "External", "Search", "DeepResearch", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EMode implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EMode[] $VALUES;
        public static final ProtoAdapter<EMode> ADAPTER;
        public static final EMode Base;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EMode DeepResearch;
        public static final EMode External;
        public static final EMode Pro;

        @jxi
        public static final EMode Search;
        public static final EMode Undefined;
        private final int value;

        private static final /* synthetic */ EMode[] $values() {
            return new EMode[]{Undefined, Base, Pro, External, Search, DeepResearch};
        }

        static {
            final EMode eMode = new EMode("Undefined", 0, 0);
            Undefined = eMode;
            Base = new EMode("Base", 1, 1);
            Pro = new EMode("Pro", 2, 2);
            External = new EMode("External", 3, 3);
            Search = new EMode("Search", 4, 4);
            DeepResearch = new EMode("DeepResearch", 5, 5);
            EMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EMode>(a, syntax, eMode) { // from class: ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo$EMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TAlice2ModeInfo.EMode fromValue(int value) {
                    return TAlice2ModeInfo.EMode.INSTANCE.fromValue(value);
                }
            };
        }

        private EMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EMode valueOf(String str) {
            return (EMode) Enum.valueOf(EMode.class, str);
        }

        public static EMode[] values() {
            return (EMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2ModeInfo$EMode;", "fromValue", "value", "", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EMode fromValue(int value) {
                if (value == 0) {
                    return EMode.Undefined;
                }
                if (value == 1) {
                    return EMode.Base;
                }
                if (value == 2) {
                    return EMode.Pro;
                }
                if (value == 3) {
                    return EMode.External;
                }
                if (value == 4) {
                    return EMode.Search;
                }
                if (value != 5) {
                    return null;
                }
                return EMode.DeepResearch;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m504newBuilder();
    }

    public TAlice2ModeInfo() {
        this(null, null, null, null, 15, null);
    }

    public TAlice2ModeInfo(EMode eMode, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Mode = eMode;
        this.Preset = str;
        this.HackMode = str2;
    }
}
