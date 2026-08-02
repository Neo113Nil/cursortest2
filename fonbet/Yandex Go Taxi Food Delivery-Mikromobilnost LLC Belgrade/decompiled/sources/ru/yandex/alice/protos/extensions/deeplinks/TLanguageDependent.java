package ru.yandex.alice.protos.extensions.deeplinks;

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
import ru.yandex.alice.protos.extensions.deeplinks.TLanguageDependent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lru/yandex/alice/protos/extensions/deeplinks/TLanguageDependent;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EType", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TLanguageDependent extends Message {
    public static final ProtoAdapter<TLanguageDependent> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TLanguageDependent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TLanguageDependent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.extensions.deeplinks.TLanguageDependent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TLanguageDependent decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TLanguageDependent(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TLanguageDependent value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TLanguageDependent value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TLanguageDependent redact(TLanguageDependent value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TLanguageDependent value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ TLanguageDependent(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TLanguageDependent copy$default(TLanguageDependent tLanguageDependent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tLanguageDependent.unknownFields();
        }
        return tLanguageDependent.copy(byteString);
    }

    public final TLanguageDependent copy(ByteString unknownFields) {
        return new TLanguageDependent(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof TLanguageDependent) && jl40.l(unknownFields(), ((TLanguageDependent) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m712newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "TLanguageDependent{}";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/yandex/alice/protos/extensions/deeplinks/TLanguageDependent$EType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "None", "NlgText", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EType[] $VALUES;
        public static final ProtoAdapter<EType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EType NlgText;
        public static final EType None;
        private final int value;

        private static final /* synthetic */ EType[] $values() {
            return new EType[]{None, NlgText};
        }

        static {
            final EType eType = new EType("None", 0, 0);
            None = eType;
            NlgText = new EType("NlgText", 1, 1);
            EType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EType>(a, syntax, eType) { // from class: ru.yandex.alice.protos.extensions.deeplinks.TLanguageDependent$EType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TLanguageDependent.EType fromValue(int value) {
                    return TLanguageDependent.EType.INSTANCE.fromValue(value);
                }
            };
        }

        private EType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EType valueOf(String str) {
            return (EType) Enum.valueOf(EType.class, str);
        }

        public static EType[] values() {
            return (EType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/extensions/deeplinks/TLanguageDependent$EType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/extensions/deeplinks/TLanguageDependent$EType;", "fromValue", "value", "", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EType fromValue(int value) {
                if (value == 0) {
                    return EType.None;
                }
                if (value != 1) {
                    return null;
                }
                return EType.NlgText;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m712newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TLanguageDependent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TLanguageDependent(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
