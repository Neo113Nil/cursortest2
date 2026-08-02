package ru.yandex.alice.protos.endpoint.quark.webchat;

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
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/TAnyCapabilityHolder;", "Lcom/squareup/wire/Message;", "", "rawCapability", "Lokio/ByteString;", "capabilityType", "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$ECapabilityType;", "unknownFields", "<init>", "(Lokio/ByteString;Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$ECapabilityType;Lokio/ByteString;)V", "getRawCapability$annotations", "()V", "getRawCapability", "()Lokio/ByteString;", "getCapabilityType$annotations", "getCapabilityType", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$ECapabilityType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TAnyCapabilityHolder extends Message {
    public static final ProtoAdapter<TAnyCapabilityHolder> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$ECapabilityType#ADAPTER", jsonName = "capability_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TCapability.ECapabilityType capabilityType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "raw_capability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString rawCapability;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAnyCapabilityHolder.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAnyCapabilityHolder>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.quark.webchat.TAnyCapabilityHolder$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAnyCapabilityHolder decode(ProtoReader reader) {
                TCapability.ECapabilityType eCapabilityType = TCapability.ECapabilityType.UnknownCapabilityType;
                long beginMessage = reader.beginMessage();
                ByteString byteString = ByteString.c;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAnyCapabilityHolder(byteString, eCapabilityType, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        byteString = ProtoAdapter.BYTES.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            eCapabilityType = TCapability.ECapabilityType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAnyCapabilityHolder value) {
                if (!jl40.l(value.getRawCapability(), ByteString.c)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getRawCapability());
                }
                if (value.getCapabilityType() != TCapability.ECapabilityType.UnknownCapabilityType) {
                    TCapability.ECapabilityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCapabilityType());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAnyCapabilityHolder value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getRawCapability(), ByteString.c)) {
                    h += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getRawCapability());
                }
                return value.getCapabilityType() != TCapability.ECapabilityType.UnknownCapabilityType ? TCapability.ECapabilityType.ADAPTER.encodedSizeWithTag(2, value.getCapabilityType()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAnyCapabilityHolder redact(TAnyCapabilityHolder value) {
                return TAnyCapabilityHolder.copy$default(value, null, null, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAnyCapabilityHolder value) {
                writer.writeBytes(value.unknownFields());
                if (value.getCapabilityType() != TCapability.ECapabilityType.UnknownCapabilityType) {
                    TCapability.ECapabilityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCapabilityType());
                }
                if (jl40.l(value.getRawCapability(), ByteString.c)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getRawCapability());
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TAnyCapabilityHolder(ByteString byteString, TCapability.ECapabilityType eCapabilityType, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r6 != 0 ? r0 : byteString, (i & 2) != 0 ? TCapability.ECapabilityType.UnknownCapabilityType : eCapabilityType, (i & 4) != 0 ? r0 : byteString2);
        int i2 = i & 1;
        ByteString byteString3 = ByteString.c;
    }

    public static /* synthetic */ TAnyCapabilityHolder copy$default(TAnyCapabilityHolder tAnyCapabilityHolder, ByteString byteString, TCapability.ECapabilityType eCapabilityType, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tAnyCapabilityHolder.rawCapability;
        }
        if ((i & 2) != 0) {
            eCapabilityType = tAnyCapabilityHolder.capabilityType;
        }
        if ((i & 4) != 0) {
            byteString2 = tAnyCapabilityHolder.unknownFields();
        }
        return tAnyCapabilityHolder.copy(byteString, eCapabilityType, byteString2);
    }

    @ColumnNameOption("capability_type")
    public static /* synthetic */ void getCapabilityType$annotations() {
    }

    @ColumnNameOption("raw_capability")
    public static /* synthetic */ void getRawCapability$annotations() {
    }

    public final TAnyCapabilityHolder copy(ByteString rawCapability, TCapability.ECapabilityType capabilityType, ByteString unknownFields) {
        return new TAnyCapabilityHolder(rawCapability, capabilityType, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAnyCapabilityHolder)) {
            return false;
        }
        TAnyCapabilityHolder tAnyCapabilityHolder = (TAnyCapabilityHolder) other;
        return jl40.l(unknownFields(), tAnyCapabilityHolder.unknownFields()) && jl40.l(this.rawCapability, tAnyCapabilityHolder.rawCapability) && this.capabilityType == tAnyCapabilityHolder.capabilityType;
    }

    public final TCapability.ECapabilityType getCapabilityType() {
        return this.capabilityType;
    }

    public final ByteString getRawCapability() {
        return this.rawCapability;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.capabilityType.hashCode() + ((this.rawCapability.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m701newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rawCapability=" + this.rawCapability);
        arrayList.add("capabilityType=" + this.capabilityType);
        return a.X(arrayList, Extension.FIX_SPACE, "TAnyCapabilityHolder{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m701newBuilder();
    }

    public TAnyCapabilityHolder() {
        this(null, null, null, 7, null);
    }

    public TAnyCapabilityHolder(ByteString byteString, TCapability.ECapabilityType eCapabilityType, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.rawCapability = byteString;
        this.capabilityType = eCapabilityType;
    }
}
