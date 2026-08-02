package ru.yandex.alice.protos.div.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
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
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.alice.protos.div.quark.webchat.TTimerStateDivExternalSource;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource;", "Lcom/squareup/wire/Message;", "", "timerId", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getTimerId$annotations", "()V", "getTimerId", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EState", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TTimerStateDivExternalSource extends Message {
    public static final ProtoAdapter<TTimerStateDivExternalSource> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timer_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final String timerId;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TTimerStateDivExternalSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TTimerStateDivExternalSource>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TTimerStateDivExternalSource$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TTimerStateDivExternalSource decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TTimerStateDivExternalSource(str, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TTimerStateDivExternalSource value) {
                if (!jl40.l(value.getTimerId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimerId());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TTimerStateDivExternalSource value) {
                int h = value.unknownFields().h();
                return !jl40.l(value.getTimerId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTimerId()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TTimerStateDivExternalSource redact(TTimerStateDivExternalSource value) {
                return TTimerStateDivExternalSource.copy$default(value, null, ByteString.c, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TTimerStateDivExternalSource value) {
                writer.writeBytes(value.unknownFields());
                if (jl40.l(value.getTimerId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimerId());
            }
        };
    }

    public /* synthetic */ TTimerStateDivExternalSource(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TTimerStateDivExternalSource copy$default(TTimerStateDivExternalSource tTimerStateDivExternalSource, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTimerStateDivExternalSource.timerId;
        }
        if ((i & 2) != 0) {
            byteString = tTimerStateDivExternalSource.unknownFields();
        }
        return tTimerStateDivExternalSource.copy(str, byteString);
    }

    @ColumnNameOption("timer_id")
    public static /* synthetic */ void getTimerId$annotations() {
    }

    public final TTimerStateDivExternalSource copy(String timerId, ByteString unknownFields) {
        return new TTimerStateDivExternalSource(timerId, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TTimerStateDivExternalSource)) {
            return false;
        }
        TTimerStateDivExternalSource tTimerStateDivExternalSource = (TTimerStateDivExternalSource) other;
        return jl40.l(unknownFields(), tTimerStateDivExternalSource.unknownFields()) && jl40.l(this.timerId, tTimerStateDivExternalSource.timerId);
    }

    public final String getTimerId() {
        return this.timerId;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.timerId.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m543newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("timerId=", Internal.sanitize(this.timerId), arrayList);
        return a.X(arrayList, Extension.FIX_SPACE, "TTimerStateDivExternalSource{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource$EState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Idle", CA20Status.STATUS_USER_DESCRIPTION_A, "Paused", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EState implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EState[] $VALUES;
        public static final ProtoAdapter<EState> ADAPTER;
        public static final EState Active;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EState Idle;
        public static final EState Paused;
        private final int value;

        private static final /* synthetic */ EState[] $values() {
            return new EState[]{Idle, Active, Paused};
        }

        static {
            final EState eState = new EState("Idle", 0, 0);
            Idle = eState;
            Active = new EState(CA20Status.STATUS_USER_DESCRIPTION_A, 1, 1);
            Paused = new EState("Paused", 2, 2);
            EState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EState>(a, syntax, eState) { // from class: ru.yandex.alice.protos.div.quark.webchat.TTimerStateDivExternalSource$EState$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TTimerStateDivExternalSource.EState fromValue(int value) {
                    return TTimerStateDivExternalSource.EState.INSTANCE.fromValue(value);
                }
            };
        }

        private EState(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EState valueOf(String str) {
            return (EState) Enum.valueOf(EState.class, str);
        }

        public static EState[] values() {
            return (EState[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource$EState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource$EState;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EState fromValue(int value) {
                if (value == 0) {
                    return EState.Idle;
                }
                if (value == 1) {
                    return EState.Active;
                }
                if (value != 2) {
                    return null;
                }
                return EState.Paused;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m543newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTimerStateDivExternalSource() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TTimerStateDivExternalSource(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timerId = str;
    }
}
