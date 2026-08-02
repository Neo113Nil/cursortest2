package ru.yandex.alice.protos.extensions.quark.webchat;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.yandex.alice.protos.extensions.quark.webchat.TFeatureType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lru/yandex/alice/protos/extensions/quark/webchat/TFeatureType;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EFeatureType", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TFeatureType extends Message {
    public static final ProtoAdapter<TFeatureType> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TFeatureType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TFeatureType>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.extensions.quark.webchat.TFeatureType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TFeatureType decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TFeatureType(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TFeatureType value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TFeatureType value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TFeatureType redact(TFeatureType value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TFeatureType value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ TFeatureType(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TFeatureType copy$default(TFeatureType tFeatureType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tFeatureType.unknownFields();
        }
        return tFeatureType.copy(byteString);
    }

    public final TFeatureType copy(ByteString unknownFields) {
        return new TFeatureType(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof TFeatureType) && jl40.l(unknownFields(), ((TFeatureType) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m723newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "TFeatureType{}";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lru/yandex/alice/protos/extensions/quark/webchat/TFeatureType$EFeatureType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SimpleSupport", "SupportUnsupportTrue", "SupportUnsupportFalse", "CustomCode", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EFeatureType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EFeatureType[] $VALUES;
        public static final ProtoAdapter<EFeatureType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EFeatureType CustomCode;
        public static final EFeatureType SimpleSupport;
        public static final EFeatureType SupportUnsupportFalse;
        public static final EFeatureType SupportUnsupportTrue;
        private final int value;

        private static final /* synthetic */ EFeatureType[] $values() {
            return new EFeatureType[]{SimpleSupport, SupportUnsupportTrue, SupportUnsupportFalse, CustomCode};
        }

        static {
            final EFeatureType eFeatureType = new EFeatureType("SimpleSupport", 0, 0);
            SimpleSupport = eFeatureType;
            SupportUnsupportTrue = new EFeatureType("SupportUnsupportTrue", 1, 1);
            SupportUnsupportFalse = new EFeatureType("SupportUnsupportFalse", 2, 2);
            CustomCode = new EFeatureType("CustomCode", 3, 3);
            EFeatureType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EFeatureType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EFeatureType>(a, syntax, eFeatureType) { // from class: ru.yandex.alice.protos.extensions.quark.webchat.TFeatureType$EFeatureType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TFeatureType.EFeatureType fromValue(int value) {
                    return TFeatureType.EFeatureType.INSTANCE.fromValue(value);
                }
            };
        }

        private EFeatureType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EFeatureType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EFeatureType valueOf(String str) {
            return (EFeatureType) Enum.valueOf(EFeatureType.class, str);
        }

        public static EFeatureType[] values() {
            return (EFeatureType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/extensions/quark/webchat/TFeatureType$EFeatureType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/extensions/quark/webchat/TFeatureType$EFeatureType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EFeatureType fromValue(int value) {
                if (value == 0) {
                    return EFeatureType.SimpleSupport;
                }
                if (value == 1) {
                    return EFeatureType.SupportUnsupportTrue;
                }
                if (value == 2) {
                    return EFeatureType.SupportUnsupportFalse;
                }
                if (value != 3) {
                    return null;
                }
                return EFeatureType.CustomCode;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m723newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TFeatureType() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TFeatureType(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
