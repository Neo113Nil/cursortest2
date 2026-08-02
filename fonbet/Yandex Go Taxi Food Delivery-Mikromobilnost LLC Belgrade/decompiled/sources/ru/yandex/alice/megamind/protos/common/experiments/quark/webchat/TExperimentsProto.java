package ru.yandex.alice.megamind.protos.common.experiments.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import NYT.quark.webchat.FlagsOption;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.megamind.protos.common.experiments.quark.webchat.TExperimentsProto;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B'\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J&\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;", "Lcom/squareup/wire/Message;", "", "storage", "", "", "Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto$TValue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "getStorage$annotations", "()V", "getStorage", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TValue", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TExperimentsProto extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.megamind.protos.common.experiments.quark.webchat.TExperimentsProto$TValue#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final Map<String, TValue> storage;
    public static final ProtoAdapter<TExperimentsProto> ADAPTER = new TExperimentsProto$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, qoi0.a(TExperimentsProto.class), Syntax.PROTO_2);

    public /* synthetic */ TExperimentsProto(Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? ByteString.c : byteString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TExperimentsProto copy$default(TExperimentsProto tExperimentsProto, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tExperimentsProto.storage;
        }
        if ((i & 2) != 0) {
            byteString = tExperimentsProto.unknownFields();
        }
        return tExperimentsProto.copy(map, byteString);
    }

    @ColumnNameOption("storage")
    @FlagsOption({EWrapperFieldFlag.Enum.MAP_AS_DICT})
    public static /* synthetic */ void getStorage$annotations() {
    }

    public final TExperimentsProto copy(Map<String, TValue> storage, ByteString unknownFields) {
        return new TExperimentsProto(storage, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TExperimentsProto)) {
            return false;
        }
        TExperimentsProto tExperimentsProto = (TExperimentsProto) other;
        return jl40.l(unknownFields(), tExperimentsProto.unknownFields()) && jl40.l(this.storage, tExperimentsProto.storage);
    }

    public final Map<String, TValue> getStorage() {
        return this.storage;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.storage.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m497newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.storage.isEmpty()) {
            arrayList.add("storage=" + this.storage);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TExperimentsProto{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JE\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010&R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto$TValue;", "Lcom/squareup/wire/Message;", "", "NAlice_string", "", "number", "", "boolean", "", "integer", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Lokio/ByteString;)V", "getNAlice_string$annotations", "()V", "getNAlice_string", "()Ljava/lang/String;", "getNumber$annotations", "getNumber", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBoolean$annotations", "getBoolean", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInteger$annotations", "getInteger", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Lokio/ByteString;)Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto$TValue;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TValue extends Message {
        public static final ProtoAdapter<TValue> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "string", oneofName = "Value", schemaIndex = 0, tag = 1)
        private final String NAlice_string;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", oneofName = "Value", schemaIndex = 2, tag = 3)
        private final Boolean boolean;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", oneofName = "Value", schemaIndex = 3, tag = 4)
        private final Integer integer;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", oneofName = "Value", schemaIndex = 1, tag = 2)
        private final Double number;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TValue.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new ProtoAdapter<TValue>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.common.experiments.quark.webchat.TExperimentsProto$TValue$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TExperimentsProto.TValue decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = null;
                    Double d = null;
                    Boolean bool = null;
                    Integer num = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TExperimentsProto.TValue(str, d, bool, num, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            d = ProtoAdapter.DOUBLE.decode(reader);
                        } else if (nextTag == 3) {
                            bool = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            num = ProtoAdapter.INT32.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TExperimentsProto.TValue value) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNAlice_string());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) value.getNumber());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getBoolean());
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getInteger());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TExperimentsProto.TValue value) {
                    return ProtoAdapter.INT32.encodedSizeWithTag(4, value.getInteger()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getBoolean()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, value.getNumber()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNAlice_string()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TExperimentsProto.TValue redact(TExperimentsProto.TValue value) {
                    return TExperimentsProto.TValue.copy$default(value, null, null, null, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TExperimentsProto.TValue value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getInteger());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getBoolean());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) value.getNumber());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNAlice_string());
                }
            };
        }

        public /* synthetic */ TValue(String str, Double d, Boolean bool, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TValue copy$default(TValue tValue, String str, Double d, Boolean bool, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tValue.NAlice_string;
            }
            if ((i & 2) != 0) {
                d = tValue.number;
            }
            if ((i & 4) != 0) {
                bool = tValue.boolean;
            }
            if ((i & 8) != 0) {
                num = tValue.integer;
            }
            if ((i & 16) != 0) {
                byteString = tValue.unknownFields();
            }
            ByteString byteString2 = byteString;
            Boolean bool2 = bool;
            return tValue.copy(str, d, bool2, num, byteString2);
        }

        @ColumnNameOption("boolean")
        public static /* synthetic */ void getBoolean$annotations() {
        }

        @ColumnNameOption("integer")
        public static /* synthetic */ void getInteger$annotations() {
        }

        @ColumnNameOption("string")
        public static /* synthetic */ void getNAlice_string$annotations() {
        }

        @ColumnNameOption("number")
        public static /* synthetic */ void getNumber$annotations() {
        }

        public final TValue copy(String NAlice_string, Double number, Boolean r3, Integer integer, ByteString unknownFields) {
            return new TValue(NAlice_string, number, r3, integer, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TValue)) {
                return false;
            }
            TValue tValue = (TValue) other;
            return jl40.l(unknownFields(), tValue.unknownFields()) && jl40.l(this.NAlice_string, tValue.NAlice_string) && jl40.i(this.number, tValue.number) && jl40.l(this.boolean, tValue.boolean) && jl40.l(this.integer, tValue.integer);
        }

        public final Boolean getBoolean() {
            return this.boolean;
        }

        public final Integer getInteger() {
            return this.integer;
        }

        public final String getNAlice_string() {
            return this.NAlice_string;
        }

        public final Double getNumber() {
            return this.number;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.NAlice_string;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Double d = this.number;
            int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 37;
            Boolean bool = this.boolean;
            int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
            Integer num = this.integer;
            int hashCode5 = hashCode4 + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m498newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.NAlice_string;
            if (str != null) {
                unr0.B("NAlice_string=", Internal.sanitize(str), arrayList);
            }
            Double d = this.number;
            if (d != null) {
                arrayList.add("number=" + d);
            }
            Boolean bool = this.boolean;
            if (bool != null) {
                arrayList.add("boolean=" + bool);
            }
            Integer num = this.integer;
            if (num != null) {
                arrayList.add("integer=" + num);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TValue{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m498newBuilder();
        }

        public TValue() {
            this(null, null, null, null, null, 31, null);
        }

        public TValue(String str, Double d, Boolean bool, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.NAlice_string = str;
            this.number = d;
            this.boolean = bool;
            this.integer = num;
            if (Internal.countNonNull(str, d, bool, num, new Object[0]) <= 1) {
                return;
            }
            ny61.g("At most one of NAlice_string, number, boolean, integer may be non-null");
            throw null;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m497newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TExperimentsProto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TExperimentsProto(Map<String, TValue> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.storage = Internal.immutableCopyOf("storage", map);
    }
}
