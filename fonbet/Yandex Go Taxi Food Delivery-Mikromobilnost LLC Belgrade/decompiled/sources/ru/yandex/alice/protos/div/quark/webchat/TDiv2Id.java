package ru.yandex.alice.protos.div.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
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
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "Lcom/squareup/wire/Message;", "", "cardName", "", "cardId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCardName$annotations", "()V", "getCardName", "()Ljava/lang/String;", "getCardId$annotations", "getCardId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDiv2Id extends Message {
    public static final ProtoAdapter<TDiv2Id> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String cardId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String cardName;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDiv2Id.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDiv2Id>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TDiv2Id$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TDiv2Id decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDiv2Id(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDiv2Id value) {
                if (!jl40.l(value.getCardName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardName());
                }
                if (!jl40.l(value.getCardId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCardId());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDiv2Id value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getCardName(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCardName());
                }
                return !jl40.l(value.getCardId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCardId()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDiv2Id redact(TDiv2Id value) {
                return TDiv2Id.copy$default(value, null, null, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDiv2Id value) {
                writer.writeBytes(value.unknownFields());
                if (!jl40.l(value.getCardId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCardId());
                }
                if (jl40.l(value.getCardName(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardName());
            }
        };
    }

    public /* synthetic */ TDiv2Id(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TDiv2Id copy$default(TDiv2Id tDiv2Id, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tDiv2Id.cardName;
        }
        if ((i & 2) != 0) {
            str2 = tDiv2Id.cardId;
        }
        if ((i & 4) != 0) {
            byteString = tDiv2Id.unknownFields();
        }
        return tDiv2Id.copy(str, str2, byteString);
    }

    @ColumnNameOption("card_id")
    public static /* synthetic */ void getCardId$annotations() {
    }

    @ColumnNameOption("card_name")
    public static /* synthetic */ void getCardName$annotations() {
    }

    public final TDiv2Id copy(String cardName, String cardId, ByteString unknownFields) {
        return new TDiv2Id(cardName, cardId, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDiv2Id)) {
            return false;
        }
        TDiv2Id tDiv2Id = (TDiv2Id) other;
        return jl40.l(unknownFields(), tDiv2Id.unknownFields()) && jl40.l(this.cardName, tDiv2Id.cardName) && jl40.l(this.cardId, tDiv2Id.cardId);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.cardId.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.cardName);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m524newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("cardName=", Internal.sanitize(this.cardName), arrayList);
        unr0.B("cardId=", Internal.sanitize(this.cardId), arrayList);
        return a.X(arrayList, Extension.FIX_SPACE, "TDiv2Id{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m524newBuilder();
    }

    public TDiv2Id() {
        this(null, null, null, 7, null);
    }

    public TDiv2Id(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cardName = str;
        this.cardId = str2;
    }
}
